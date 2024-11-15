package gamerverse.api.uno.cards;

import gamerverse.api.uno.UnoColor;

public abstract class WildCard implements UnoCard {
    private final String name;

    public WildCard(String name) {
        this.name = name;
    }
    @Override
    public String getCardName() {
        return this.name;
    }

    @Override
    public UnoColor getCardColor() {
        return UnoColor.WILD;
    }

    @Override
    public int getCardValue() {
        return -2;
    }

    @Override
    public String getType() {
        return "WILD";
    }
}
