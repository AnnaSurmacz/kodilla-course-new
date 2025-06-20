package com.kodilla.spring.portfolio;

import com.kodilla.spring.library.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BoardConfig {

    @Bean
    public Board board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList doneList() {
        return new TaskList();
    }
}
