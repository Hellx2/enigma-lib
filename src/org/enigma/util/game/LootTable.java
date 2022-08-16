package org.enigma.util.game;

import org.enigma.ArrayUtils;

public class LootTable {
    public String id;
    public String type;
    public LootTablePool[] pools;
    public String namespace;
    public ItemStack[] rollEntries(){
        ItemStack[] a=null;
        for(int i=0;i<pools.length;i++){
            for(int j=0;j<(java.lang.Math.floor(java.lang.Math.random()*(pools[i].maxRolls-pools[i].minRolls+1))+pools[i].minRolls);j++){
                ArrayUtils.push(a,pools[i].pickEntry());
            }
            if(pools[i].bonusRolls){
                for(int j=0;j<(java.lang.Math.floor(java.lang.Math.random()*(pools[i].maxBonusRolls-pools[i].minBonusRolls+1))+pools[i].minBonusRolls);j++){
                    ArrayUtils.push(a,pools[i].pickEntry());
                }
            }
        }
        return a;
    }
}