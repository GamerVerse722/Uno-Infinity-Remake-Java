package com.gamerverse.api.uno.cards;

import com.gamerverse.api.uno.UnoCardTypes;
import com.gamerverse.api.uno.UnoColor;

public abstract class ActionCard extends AbstractUnoCard {
    protected ActionCard(String cardName, UnoColor cardColor) {
        super(cardName, cardColor, -1, UnoCardTypes.ACTION);
    }
}
