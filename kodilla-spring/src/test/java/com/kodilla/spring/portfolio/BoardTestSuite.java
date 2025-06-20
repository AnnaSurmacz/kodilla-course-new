package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    public void testTaskAdd() {
        // Given
        String todoTask = "Zadanie do zrobienia";
        String inProgressTask = "Zadanie w trakcie";
        String doneTask = "Zadanie zrobione";

        // When
        board.getToDoList().getTasks().add(todoTask);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getDoneList().getTasks().add(doneTask);

        // Then
        assertTrue(board.getToDoList().getTasks().contains(todoTask));
        assertTrue(board.getInProgressList().getTasks().contains(inProgressTask));
        assertTrue(board.getDoneList().getTasks().contains(doneTask));
    }
}