package org.enigma.util.game;

import org.enigma.typescript.Main;

public class LootTablePool {
    public int minRolls;
    public int maxRolls;
    boolean bonusRolls;
    public int minBonusRolls;
    public int maxBonusRolls;
    LootTableEntry[] entries;
    public ItemStack pickEntry(){
        int totalWeight=0;
        for(int i=0;i<entries.length;i++){
            totalWeight+=entries[i].weight;
        }
        double a=java.lang.Math.floor(java.lang.Math.random()*totalWeight);
        int b=0;
        int c=-1;
        for(int i=0;i<entries.length;i++){
            if((b+entries[i].weight)==a||(b+entries[i].weight)>a){
                c=i;
                break;
            }else{
                b+=entries[i].weight;
            }
        }
        return new ItemStack(entries[c].item,Main.parseInt(java.lang.Math.floor(java.lang.Math.random()*(entries[c].maxAmount-entries[c].minAmount+1)))+entries[c].minAmount);
    }
}