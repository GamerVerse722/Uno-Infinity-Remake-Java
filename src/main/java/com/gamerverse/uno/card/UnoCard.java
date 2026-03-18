package com.gamerverse.uno.card;

import com.gamerverse.engine.utils.ConsoleColor;
import com.gamerverse.language.Language;
import com.gamerverse.language.LanguageComponent;
import com.gamerverse.uno.UnoBaseCardType;
import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.game.GameContext;

import java.text.MessageFormat;

public sealed abstract class UnoCard permits NumberCard, ActionCard, WildCard{
    // Card identifiers
    protected final LanguageComponent langName;
    protected final UnoBaseCardType cardType;
    protected final String subtype;

    // Card properties
    protected final int cardValue;
    protected UnoColor color;

    protected UnoCard(UnoBaseCardType cardType, UnoColor cardColor, String cardName, int cardValue) {
        this.langName = Language.translatable(MessageFormat.format("card.{0}.{1}", cardType.getIdName(), cardName));
        this.cardValue = cardValue;
        this.cardType = cardType;
        this.subtype = cardName;
        this.color = cardColor;
    }

    public UnoColor getColor() {
        return this.color;
    }

    public LanguageComponent getName() {
        return this.langName;
    }

    public int getValue() {
        return this.cardValue;
    }

    public UnoBaseCardType getType() {
        return this.cardType;
    }

    public String getSubType() {
        return this.subtype;
    }

    public String getId() {
        return this.langName.key();
    }

    public String getInstanceId() {
        return this.langName.key() + "." + this.color.getIdName();
    }

    public String toString(boolean useColor) {
        if (useColor) {
            return ConsoleColor.colorText(this);
        }
        return MessageFormat.format("Card Type: {0}, Card: {1}, Color: {2}", this.cardType, this.langName, this.color);
    }

    public String toString() {
        return this.toString(true);
    }

    protected abstract void play(GameContext game);
}
