package com.gamerverse.uno.game;

import com.gamerverse.engine.utils.CircularArrayList;
import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.deck.UnoDeck;
import com.gamerverse.uno.player.Player;
import com.gamerverse.uno.rules.GameRule;

import java.util.List;

public class UnoGame {
    private final CircularArrayList<Player> players;
    private final UnoDeck deck;

    private final List<GameRule> rules;

    private int turnDirection = 1;

    private int pendingDraw = 0;
    private UnoColor currentColor;

    public UnoGame(CircularArrayList<Player> players, UnoDeck deck, List<GameRule> rules) {
        this.players = players;
        this.deck = deck;
        this.rules = rules;
    }

    public Player getCurrentPlayer() {
        return players.getAtIndex();
    }

    public void nextPlayer() {
        players.next(turnDirection);
    }

    public void reverseDirection() {
        turnDirection *= -1;
    }

    public void addPendingDraw(int amount) {
        pendingDraw += amount;
    }

    public int getPendingDraw() {
        return pendingDraw;
    }

    public void clearPendingDraw() {
        pendingDraw = 0;
    }

    public UnoDeck getDeck() {
        return deck;
    }

    public UnoColor getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(UnoColor color) {
        this.currentColor = color;
    }
}
