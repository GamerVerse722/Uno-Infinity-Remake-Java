package com.gamerverse.uno.card;

import com.gamerverse.uno.UnoBaseCardType;
import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.deck.UnoDeck;
import com.gamerverse.uno.game.GameContext;
import org.jetbrains.annotations.Nullable;

public final class NumberCard extends UnoCard {
    public NumberCard(String cardName, UnoColor cardColor, int cardValue) {
        super(cardName, cardColor, cardValue, UnoBaseCardType.NUMBER);
    }

    @Override
    protected void play(GameContext game) {

    }
}
