package com.gamerverse.uno.card;

import com.gamerverse.uno.UnoBaseCardType;
import com.gamerverse.uno.UnoColor;

public non-sealed abstract class ActionCard extends UnoCard {
    protected ActionCard(String cardName, UnoColor cardColor) {
        super(cardName, cardColor, -1, UnoBaseCardType.ACTION);
    }
}
