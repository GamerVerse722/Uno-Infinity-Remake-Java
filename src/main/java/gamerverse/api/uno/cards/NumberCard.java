package gamerverse.api.uno.cards;

import gamerverse.api.uno.UnoColor;

public abstract class NumberCard implements UnoCard {
    private final UnoColor unoColor;
    private final String name;
    private final int cardValue;

    public NumberCard(String name, UnoColor unoColor, int cardValue) {
        this.name = name;
        this.unoColor = unoColor;
        this.cardValue = cardValue;
    }

    @Override
    public String getCardName() {
        return this.name;
    }

    @Override
    public UnoColor getCardColor() {
        return this.unoColor;
    }

    @Override
    public int getCardValue() {
        return this.cardValue;
    }

    @Override
    public String getType() {
        return "NUMBER";
    }

    @Override
    public void playerAction() {

    }
}
