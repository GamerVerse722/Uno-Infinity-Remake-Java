package com.gamerverse.uno.card;

import com.gamerverse.uno.UnoBaseCardType;
import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.effects.CardEffect;
import com.gamerverse.uno.game.GameContext;

import java.util.List;

public non-sealed abstract class ActionCard extends UnoCard {
    private final List<CardEffect> effects;

    protected ActionCard(String cardName, UnoColor cardColor, List<CardEffect> effects) {
        super(UnoBaseCardType.ACTION, cardColor, cardName, -1);
        this.effects = effects;
    }

    @Override
    protected void play(GameContext game) {
        for (CardEffect effect: effects) {
            effect.apply(game, this);
        }
    }
}
