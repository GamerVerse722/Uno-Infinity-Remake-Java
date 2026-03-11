package com.gamerverse.uno.game;

import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.card.UnoCard;
import com.gamerverse.uno.player.Player;

public interface GameContext {
    Player getCurrentPlayer();
    UnoCard getTopCard();
    void drawCards(Player player, int amount);
    void skipNextPlayer();
    void reverseDirection();
    void changeColor(UnoColor color);
    void addPendingDraw(int amount);
    int getPendingDraw();
}
