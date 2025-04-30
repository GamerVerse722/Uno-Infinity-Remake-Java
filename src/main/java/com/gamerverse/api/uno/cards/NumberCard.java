package com.gamerverse.api.uno.cards;

import com.gamerverse.api.uno.UnoBaseCardType;
import com.gamerverse.api.uno.UnoColor;
import com.gamerverse.api.uno.UnoDeck;
import org.jetbrains.annotations.Nullable;

public class NumberCard extends AbstractUnoCard {
    public NumberCard(String cardName, UnoColor cardColor, int cardValue) {
        super(cardName, cardColor, cardValue, UnoBaseCardType.NUMBER);
    }

    @Override
    public void playerAction(UnoDeck decks) {}

    @Override
    public boolean playableCard(@Nullable UnoCard previousCard) {
        if (previousCard == null) {return true;}
        return (previousCard.getValue() == this.cardValue || previousCard.getColor() == this.color);
    }
}
