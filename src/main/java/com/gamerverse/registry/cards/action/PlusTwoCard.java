package com.gamerverse.registry.cards.action;

import com.gamerverse.api.uno.UnoDeck;
import com.gamerverse.api.uno.cards.ActionCard;
import com.gamerverse.api.uno.UnoColor;
import com.gamerverse.api.uno.cards.UnoCard;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class PlusTwoCard extends ActionCard {
    public PlusTwoCard(UnoColor color) {
        super("+2", color);
    }

    @Override
    public void playerAction(UnoDeck decks) {

    }

    @Override
    public boolean playableCard(@Nullable UnoCard previousCard) {
        return false;
    }
}
