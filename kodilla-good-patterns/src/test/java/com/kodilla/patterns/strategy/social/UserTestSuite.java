package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // given
        User millenial = new Millenials("Kasia");
        User yGen = new YGeneration("Asia");
        User zGen = new ZGeneration("Basia");

        // when & then
        assertEquals("Korzystam z Facebooka", millenial.sharePost());
        assertEquals("Korzystam z Tweetera", yGen.sharePost());
        assertEquals("Korzystam ze Snapchata", zGen.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        // given
        User millenial = new Millenials("Kasia");


        millenial.setSocialPublisher(new SnapchatPublisher());

        // then
        assertEquals("Korzystam ze Snapchata", millenial.sharePost());
    }
}