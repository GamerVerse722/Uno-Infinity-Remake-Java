package gamerverse.api.uno.cards;

import gamerverse.api.uno.UnoColor;

public abstract class ActionCard implements UnoCard {
    protected final String name;
    protected final UnoColor unoColor;

    protected ActionCard(String name, UnoColor unoColor) {
        this.name = name;
        this.unoColor = unoColor;
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
        return -1;
    }

    @Override
    public String getType() {
        return "ACTION";
    }
}
