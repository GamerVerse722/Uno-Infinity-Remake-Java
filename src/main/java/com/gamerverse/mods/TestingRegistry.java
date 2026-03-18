package com.gamerverse.mods;

import com.gamerverse.engine.mod.Mod;
import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.card.NumberCard;
import com.gamerverse.uno.card.UnoCard;
import com.gamerverse.uno.registry.CardRegistry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mod(value="testing-registry", enabled = true)
public class TestingRegistry {
    public TestingRegistry() {
        CardRegistry.CARDS.register("number_0", color -> new NumberCard(0, color));
        CardRegistry.CARDS.register("number_1", color -> new NumberCard(1, color));
        CardRegistry.CARDS.register("number_2", color -> new NumberCard(2, color));
        CardRegistry.CARDS.register("number_3", color -> new NumberCard(3, color));
        CardRegistry.CARDS.register("number_4", color -> new NumberCard(4, color));
        CardRegistry.CARDS.register("number_5", color -> new NumberCard(5, color));
        CardRegistry.CARDS.register("number_6", color -> new NumberCard(6, color));
        CardRegistry.CARDS.register("number_7", color -> new NumberCard(7, color));
        CardRegistry.CARDS.register("number_8", color -> new NumberCard(8, color));
        CardRegistry.CARDS.register("number_9", color -> new NumberCard(9, color));

        List<UnoCard> deck = new ArrayList<>();
        List<UnoColor> colors = new ArrayList<>();

        colors.add(UnoColor.RED);
        colors.add(UnoColor.GREEN);
        colors.add(UnoColor.BLUE);
        colors.add(UnoColor.YELLOW);
        colors.add(UnoColor.WILD);


        for (UnoColor color : colors) {
            for (int i=0; i<=9; i++) {
                deck.add(CardRegistry.CARDS.get("number_" + i).create(color));
                deck.add(CardRegistry.CARDS.get("number_" + i).create(color));
                deck.add(CardRegistry.CARDS.get("number_" + i).create(color));
            }
        }

        Collections.shuffle(deck);
        for (UnoCard card : deck) {
            System.out.println(card);
        }
    }
}
