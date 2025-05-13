package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;

@DisplayName("Testy klasy OddNumbersExterminator")
public class CollectionTestSuite {

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Start testu");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Koniec testu\n");
    }

    @Test
    @DisplayName("Test pustej listy")
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = exterminator.exterminate(emptyList);

        System.out.println("Lista wejściowa (pusta): " + emptyList);
        System.out.println("Wynik działania metody: " + result);

        // Then
        Assertions.assertTrue(result.isEmpty(), "Uzyskana lista powinna być pusta");
    }

    @Test
    @DisplayName("Test listy z liczbami parzystymi i nieparzystymi (powinny zostać tylko parzyste)")
    public void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4, 6);

        // When
        List<Integer> result = exterminator.exterminate(numbers);

        System.out.println("Lista wejściowa: " + numbers);
        System.out.println("Oczekiwany wynik: " + expected);
        System.out.println("Rzeczywisty wynik: " + result);

        // Then
        Assertions.assertEquals(expected, result, "Lista powinna zawierać tylko liczby parzyste");
    }
}