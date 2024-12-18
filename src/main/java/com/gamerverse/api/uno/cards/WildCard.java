package com.gamerverse.api.uno.cards;

import com.gamerverse.api.uno.UnoCardTypes;
import com.gamerverse.api.uno.UnoColor;

public abstract class WildCard extends AbstractUnoCard {
    protected WildCard(String cardName) {
        super(cardName, UnoColor.WILD, -2, UnoCardTypes.WILD);
    }
}
