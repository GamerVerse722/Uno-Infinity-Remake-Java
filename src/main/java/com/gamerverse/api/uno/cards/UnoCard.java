package com.gamerverse.api.uno.cards;

import com.gamerverse.api.lang.LanguageComponent;
import com.gamerverse.api.uno.UnoBaseCardType;
import com.gamerverse.api.uno.UnoColor;
import com.gamerverse.api.uno.UnoDeck;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public interface UnoCard {
    UnoColor getColor();
    LanguageComponent getName();
    UnoBaseCardType getType();
    int getValue();
    String getSubType();
    String getId();
    String getInstanceId();
    String toString();
    String toString(boolean useColor);
    void playerAction(UnoDeck decks);
    boolean playableCard(@Nullable UnoCard previousCard);
}
