package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testLogger() {
        // Given
        Logger.LOG.log("A");
        Logger.LOG.log("B");
        Logger.LOG.log("C");

        // When
        Logger.LOG.log("E");
        Logger.LOG.log("F");

        // Then
        assertEquals("F", Logger.LOG.getLastLog());
        Logger.LOG.log("G");
        assertEquals("G", Logger.LOG.getLastLog());
    }
}


