package gamerverse.api.uno.cards;

import gamerverse.api.lang.LanguageComponent;
import gamerverse.api.uno.UnoCardTypes;
import gamerverse.api.uno.UnoColor;

public interface UnoCard {
    UnoColor getCardColor();
    LanguageComponent getCardName();
    int getCardValue();
    UnoCardTypes getType();
    String getSubType();
    void playerAction();
    String getId();
    String getInstanceId();
    String toString();
    String toString(boolean useColor);
}
