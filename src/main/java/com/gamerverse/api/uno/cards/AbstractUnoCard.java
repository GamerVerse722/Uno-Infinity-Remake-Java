package com.gamerverse.api.uno.cards;

import com.gamerverse.api.etc.ConsoleColor;
import com.gamerverse.api.lang.Language;
import com.gamerverse.api.lang.LanguageComponent;
import com.gamerverse.api.uno.UnoCardTypes;
import com.gamerverse.api.uno.UnoColor;

import java.text.MessageFormat;

public abstract class AbstractUnoCard implements UnoCard{
    // Card identifiers
    protected final LanguageComponent langName;
    protected final UnoCardTypes cardType;
    protected final String subtype;

    // Card properties
    protected final int cardValue;
    protected UnoColor color;

    protected AbstractUnoCard(String cardName, UnoColor cardColor, int cardValue, UnoCardTypes cardType) {
        this.langName = Language.translatable(MessageFormat.format("card.{0}.{1}", cardType.getIdName(), cardName));
        this.cardValue = cardValue;
        this.cardType = cardType;
        this.subtype = cardName;
        this.color = cardColor;
    }

    @Override
    public UnoColor getColor() {
        return this.color;
    }

    @Override
    public LanguageComponent getName() {
        return this.langName;
    }

    @Override
    public int getValue() {
        return this.cardValue;
    }

    @Override
    public UnoCardTypes getType() {
        return this.cardType;
    }

    @Override
    public String getSubType() {
        return this.subtype;
    }

    @Override
    public String getId() {
        return this.langName.getKey();
    }

    @Override
    public String getInstanceId() {
        return this.langName.getKey() + "." + this.color.getIdName();
    }

    @Override
    public String toString(boolean useColor) {
        if (useColor) {
            return ConsoleColor.colorText(this);
        }
        return MessageFormat.format("Card Type: {0}, Card: {1}, Color: {2}", this.cardType, this.langName, this.color);
    }

    @Override
    public String toString() {
        return this.toString(true);
    }
}
