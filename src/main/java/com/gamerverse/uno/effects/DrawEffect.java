package com.gamerverse.uno.effects;

import com.gamerverse.uno.card.UnoCard;
import com.gamerverse.uno.game.GameContext;

public class DrawEffect implements CardEffect {
    private final int amount;

    public DrawEffect(int amount) {
        this.amount = amount;
    }

    @Override
    public void apply(GameContext game, UnoCard self) {
        game.addPendingDraw(amount);
    }
}
