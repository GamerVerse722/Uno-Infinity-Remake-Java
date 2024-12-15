package gamerverse.api.uno.cards;

import gamerverse.api.uno.UnoCardTypes;
import gamerverse.api.uno.UnoColor;

public abstract class WildCard extends AbstractUnoCard {
    protected WildCard(String cardName) {
        super(cardName, UnoColor.WILD, -2, UnoCardTypes.WILD);
    }
}
