package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {
    @Test
    void testXLessThanOne() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = -3;
        double y = 5;

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testXMoreThanTwo() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 4;
        double y = 5;

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testXEqualsOne() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 1;
        double y = 5;

        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x, y));

    }
    @Test
    void testXEqualsTwo() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 2;
        double y = 5;

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));

    }
    @Test
    void testYEqualsOneAndHalf() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 6;
        double y = 1.5;

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));

    }
}



