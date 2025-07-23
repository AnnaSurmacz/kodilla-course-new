package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("Test List", "This is a test list");
        taskListDao.save(taskList);

        // When
        List<TaskList> resultList = taskListDao.findByListName("Test List");

        // Then
        assertEquals(1, resultList.size());
        assertEquals("Test List", resultList.get(0).getListName());
        assertEquals("This is a test list", resultList.get(0).getDescription());

        // CleanUp
        taskListDao.deleteAll();
    }
}
