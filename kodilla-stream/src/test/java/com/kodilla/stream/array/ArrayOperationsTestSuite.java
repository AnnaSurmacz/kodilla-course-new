package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
void testGetAverage() {
    //Given
    int[] numbers = {4, 8, 15, 16, 23, 42};

    //When
    double average = ArrayOperations.getAverage(numbers);

    //Then
    double expected = 18.0;
    assertEquals(expected, average, 0.001);

}


}
