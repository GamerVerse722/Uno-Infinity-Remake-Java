package com.gamerverse.uno.effects;

import com.gamerverse.uno.card.UnoCard;
import com.gamerverse.uno.game.GameContext;

public interface CardEffect {
    void apply(GameContext game, UnoCard self);
}
