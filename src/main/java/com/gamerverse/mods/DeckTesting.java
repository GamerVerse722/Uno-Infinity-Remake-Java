package com.gamerverse.mods;

import com.gamerverse.engine.mod.Mod;
import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.card.NumberCard;

import java.text.MessageFormat;

@Mod(value = "deck-testing", enabled = true)
public class DeckTesting {
    public DeckTesting() {
        NumberCard red_1 = new NumberCard(1, UnoColor.RED);
        NumberCard red_2 = new NumberCard(2, UnoColor.RED);
        NumberCard yellow_1 = new NumberCard(1, UnoColor.YELLOW);
        NumberCard blue_5 = new NumberCard(5, UnoColor.BLUE);

        System.out.println(MessageFormat.format("{0}, {1}, {2}, {3}", red_1, red_2, yellow_1, blue_5));
    }
}
