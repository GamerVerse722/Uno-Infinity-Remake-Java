package gamerverse.api.uno.cards;

import gamerverse.api.uno.UnoCardTypes;
import gamerverse.api.uno.UnoColor;

public abstract class NumberCard extends AbstractUnoCard {
    protected NumberCard(String cardName, UnoColor cardColor, int cardValue) {
        super(cardName, cardColor, cardValue, UnoCardTypes.NUMBER);
    }
}
