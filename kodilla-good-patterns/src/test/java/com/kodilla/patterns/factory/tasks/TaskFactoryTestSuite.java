package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        assertNotNull(drivingTask);
        assertEquals("Driving task", drivingTask.getTaskName());
        assertFalse(drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        assertTrue(drivingTask.isTaskExecuted());
    }

        @Test
        void testFactoryPaintingTasks() {
            //Given
            TaskFactory taskFactory = new TaskFactory();
            //When
            Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);

            //Then
            assertNotNull(paintingTask);
            assertEquals("Painting task", paintingTask.getTaskName());
            assertFalse(paintingTask.isTaskExecuted());
            paintingTask.executeTask();
            assertTrue(paintingTask.isTaskExecuted());

    }
    @Test
    void testFactoryShoppingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        assertNotNull(shoppingTask);
        assertEquals("Shopping task", shoppingTask.getTaskName());
        assertFalse(shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        assertTrue(shoppingTask.isTaskExecuted());

    }
}


