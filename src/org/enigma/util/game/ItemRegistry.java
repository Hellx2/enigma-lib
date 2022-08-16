package org.enigma.util.game;

import org.enigma.ArrayUtils;

public class ItemRegistry {
    public Item[] registered;
    public void register(Item... items){
        for(Item item:items){
            ArrayUtils.push(registered,item);
        }
    }
}