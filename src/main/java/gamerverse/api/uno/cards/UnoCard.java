package gamerverse.api.uno.cards;

import gamerverse.api.uno.UnoColor;

public interface UnoCard {
    String getCardName();
    UnoColor getCardColor();
    int getCardValue();
    String getType();
    void playerAction();
}
