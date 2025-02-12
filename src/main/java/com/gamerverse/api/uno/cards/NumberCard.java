package com.gamerverse.api.uno.cards;

import com.gamerverse.api.uno.UnoCardTypes;
import com.gamerverse.api.uno.UnoColor;

public abstract class NumberCard extends AbstractUnoCard {
    protected NumberCard(String cardName, UnoColor cardColor, int cardValue) {
        super(cardName, cardColor, cardValue, UnoCardTypes.NUMBER);
    }
}
