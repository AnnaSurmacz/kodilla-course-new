package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTestSuite {

    private static Logger logger;

    @BeforeEach
    void resetLogger() {
        logger = Logger.LOG;
        logger.log(""); // resetuje stan singletona przed każdym testem
    }

    @Test
    void testGetLastLogAfterOneLog() {
        // Given
        // When
        logger.log("Pierwszy log");

        // Then
        assertEquals("Pierwszy log", logger.getLastLog());
    }

    @Test
    void testGetLastLogAfterMoreLogs() {
        // Given
        // When
        logger.log("Pierwszy log");
        logger.log("Drugi log");

        // Then
        assertEquals("Drugi log", logger.getLastLog());
    }

}

