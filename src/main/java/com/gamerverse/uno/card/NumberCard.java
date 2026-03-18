package com.gamerverse.uno.card;

import com.gamerverse.uno.UnoBaseCardType;
import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.game.GameContext;

public final class NumberCard extends UnoCard {
    public NumberCard(int cardValue, UnoColor cardColor) {
        super(UnoBaseCardType.NUMBER, cardColor, String.valueOf(cardValue), cardValue);
    }

    @Override
    protected void play(GameContext game) {

    }
}
