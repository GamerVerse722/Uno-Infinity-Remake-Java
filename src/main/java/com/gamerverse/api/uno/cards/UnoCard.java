package com.gamerverse.api.uno.cards;

import com.gamerverse.api.lang.LanguageComponent;
import com.gamerverse.api.uno.UnoCardTypes;
import com.gamerverse.api.uno.UnoColor;

public interface UnoCard {
    UnoColor getColor();
    LanguageComponent getName();
    int getValue();
    UnoCardTypes getType();
    String getSubType();
    void playerAction();
    String getId();
    String getInstanceId();
    String toString();
    String toString(boolean useColor);
}
