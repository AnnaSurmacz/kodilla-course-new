package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigmacTestSuite {
    @Test
    void testBigmac() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .sauce("1000 Islands")
                .burgers(2)
                .ingredient("jalapeno")
                .ingredient("onion")
                .ingredient("piri-piri")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);
        assertEquals(2, bigmac.getBurgers());
        assertEquals("sesame", bigmac.getBun());
        assertEquals("1000 Islands", bigmac.getSauce());
        assertTrue(bigmac.getIngredients().contains("onion"));
        assertTrue(bigmac.getIngredients().contains("jalapeno"));
        assertTrue(bigmac.getIngredients().contains("piri-piri"));
        assertTrue(bigmac.getIngredients().contains("cheese"));

    }
}
