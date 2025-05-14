package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ShapeCollector Test Suite")
class ShapeCollectorTest {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding and removing figures")
    class AddRemoveTests {

        @Test
        @DisplayName("Should add one figure to the collector")
        void testAddFigure() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            Shape square = new Square(5);

            // When
            collector.addFigure(square);

            // Then
            assertEquals(square, collector.getFigure(0));
        }

        @Test
        @DisplayName("Should remove figure from the collector")
        void testRemoveFigure() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle(3);
            collector.addFigure(circle);

            // When
            boolean result = collector.removeFigure(circle);

            // Then
            assertTrue(result);
            assertNull(collector.getFigure(0));
        }

        @Test
        @DisplayName("Should return false when trying to remove non-existing figure")
        void testRemoveFigureNotPresent() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            Shape triangle = new Triangle(4, 5);

            // When
            boolean result = collector.removeFigure(triangle);

            // Then
            assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Tests for getting and showing figures")
    class GetShowTests {

        @Test
        @DisplayName("Should return correct figure from list")
        void testGetFigure() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle(2);
            collector.addFigure(circle);

            // When
            Shape retrieved = collector.getFigure(0);

            // Then
            assertEquals(circle, retrieved);
        }

        @Test
        @DisplayName("Should return null when index is wrong")
        void testGetFigureWrongIndex() {
            // Given
            ShapeCollector collector = new ShapeCollector();

            // When & Then
            assertNull(collector.getFigure(0));
        }

        @Test
        @DisplayName("Should return string of all shapes")
        void testShowFigures() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(2));
            collector.addFigure(new Square(3));
            collector.addFigure(new Triangle(3, 4));

            // When
            String result = collector.showFigures();

            // Then
            assertEquals("circle square triangle ", result);
        }
    }
}