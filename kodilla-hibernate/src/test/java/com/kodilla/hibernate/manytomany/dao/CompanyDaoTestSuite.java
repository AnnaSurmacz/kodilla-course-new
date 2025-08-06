package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @BeforeEach
    void cleanDatabase() {
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {

        }
    }
        @Test
        void testRetrieveCompaniesStartingWith() {

            // Given
            Company company1 = new Company("SoftVision");
            Company company2 = new Company("SoftwareHouse");
            Company company3 = new Company("DataCorp");

            companyDao.save(company1);
            companyDao.save(company2);
            companyDao.save(company3);

            // When
            List<Company> result = companyDao.retrieveCompaniesStartingWith("Sof");

            // Then
            assertEquals(2, result.size());

            Company firstCompany = result.get(0);
            Company secondCompany = result.get(1);

            assertTrue(firstCompany.getName().equals("SoftVision") || firstCompany.getName().equals("SoftwareHouse"));
            assertTrue(secondCompany.getName().equals("SoftVision") || secondCompany.getName().equals("SoftwareHouse"));
            assertNotEquals(firstCompany.getName(), secondCompany.getName());
        }

    @Test
    void testRetrieveEmployeeWithLastname() {
        // Given
        Employee employee1 = new Employee("Anna", "Nowak");
        Employee employee2 = new Employee("Jan", "Kowalski");
        Employee employee3 = new Employee("Ewa", "Nowak");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        // When
        List<Employee> result = employeeDao.retrieveEmployeeWithLastname("Nowak");

        // Then
        assertEquals(2, result.size());

        Employee firstEmployee = result.get(0);
        Employee secondEmployee = result.get(1);


        assertTrue((firstEmployee.getFirstname().equals("Anna") && firstEmployee.getLastname().equals("Nowak")) ||
                        (firstEmployee.getFirstname().equals("Ewa") && firstEmployee.getLastname().equals("Nowak")));

        assertTrue((secondEmployee.getFirstname().equals("Anna") && secondEmployee.getLastname().equals("Nowak")) ||
                        (secondEmployee.getFirstname().equals("Ewa") && secondEmployee.getLastname().equals("Nowak")));
    }
    }