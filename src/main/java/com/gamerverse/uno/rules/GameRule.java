package com.gamerverse.uno.rules;

import com.gamerverse.uno.card.UnoCard;
import com.gamerverse.uno.game.GameContext;

public interface GameRule {
    void onCardPlayed(GameContext game, UnoCard card);

    default void onTurnStart(GameContext game) {}

}
