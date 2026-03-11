package com.gamerverse.uno.card;

import com.gamerverse.uno.UnoBaseCardType;
import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.effects.CardEffect;
import com.gamerverse.uno.game.GameContext;

import java.util.List;

public non-sealed abstract class WildCard extends UnoCard {
    private final List<CardEffect> effects;
    protected WildCard(String cardName, List<CardEffect> effects) {
        super(cardName, UnoColor.WILD, -2, UnoBaseCardType.WILD);
        this.effects = effects;
    }

    @Override
    protected void play(GameContext game) {
        for (CardEffect effect: effects) {
            effect.apply(game, this);
        }
    }
}
