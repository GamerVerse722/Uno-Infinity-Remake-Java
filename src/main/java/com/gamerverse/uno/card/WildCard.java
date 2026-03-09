package com.gamerverse.uno.card;

import com.gamerverse.uno.UnoBaseCardType;
import com.gamerverse.uno.UnoColor;

public non-sealed abstract class WildCard extends UnoCard {
    protected WildCard(String cardName) {
        super(cardName, UnoColor.WILD, -2, UnoBaseCardType.WILD);
    }
}
