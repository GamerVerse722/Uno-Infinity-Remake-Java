package com.gamerverse.api.uno.cards;

import com.gamerverse.api.uno.UnoBaseCardType;
import com.gamerverse.api.uno.UnoColor;

public non-sealed abstract class ActionCard extends UnoCard {
    protected ActionCard(String cardName, UnoColor cardColor) {
        super(cardName, cardColor, -1, UnoBaseCardType.ACTION);
    }
}
