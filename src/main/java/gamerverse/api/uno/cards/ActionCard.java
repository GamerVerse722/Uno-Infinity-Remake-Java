package gamerverse.api.uno.cards;

import gamerverse.api.uno.UnoCardTypes;
import gamerverse.api.uno.UnoColor;

public abstract class ActionCard extends AbstractUnoCard {
    protected ActionCard(String cardName, UnoColor cardColor) {
        super(cardName, cardColor, -1, UnoCardTypes.ACTION);
    }
}
