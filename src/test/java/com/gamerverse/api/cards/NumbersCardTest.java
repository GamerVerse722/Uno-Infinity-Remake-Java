package com.gamerverse.api.cards;

import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.card.NumberCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NumbersCardTest {
    static NumberCard red_1 = new NumberCard(1, UnoColor.RED);
    static NumberCard red_2 = new NumberCard(2, UnoColor.RED);
    static NumberCard blue_1 = new NumberCard(1, UnoColor.BLUE);
    static NumberCard blue_2 = new NumberCard(2, UnoColor.BLUE);

//    @Test
//    void SameColorAndNumberReturnT() {
//        Assertions.assertTrue(red_1.playableCard(red_1));
//    }
//
//    @Test
//    void SameColorDifferentNumberReturnT() {
//        Assertions.assertTrue(red_1.playableCard(red_2));
//    }
//
//    @Test
//    void SameNumberDifferentColorReturnT() {
//        Assertions.assertTrue(red_1.playableCard(blue_1));
//    }
//
//    @Test
//    void DifferentColorAndNumberReturnF() {
//        Assertions.assertFalse(red_1.playableCard(blue_2));
//    }
}
