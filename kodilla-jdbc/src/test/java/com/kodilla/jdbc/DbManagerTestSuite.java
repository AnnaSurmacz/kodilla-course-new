package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(7, counter);
    }
@Test
   void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
    String sqlQuery = """
            SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER
            FROM USERS U
            JOIN POSTS P ON U.ID = P.USER_ID
            GROUP BY U.ID, U.FIRSTNAME, U.LASTNAME
            HAVING COUNT(*) >= 2
            """;
    Statement statement = dbManager.getConnection().createStatement();
    ResultSet rs = statement.executeQuery(sqlQuery);
//Then
    int counter = 0;
    while (rs.next()) {
        System.out.println(rs.getString("FIRSTNAME") + ", " +
                rs.getString("LASTNAME") + ", posts: " +
                rs.getInt("POSTS_NUMBER"));
        counter++;
    }

    rs.close();
    statement.close();
    assertEquals(4, counter);
}
    }

