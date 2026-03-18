package com.gamerverse.uno.registry;

import com.gamerverse.uno.UnoColor;
import com.gamerverse.uno.card.UnoCard;

@FunctionalInterface
public interface CardFactory {
    UnoCard create(UnoColor color);
}
