package com.github.hellagoodcoder123.enigma.util.game;

public class ItemStack {
    Item item;
    int count;
    public ItemStack(Item item,int count){
        this.item=item;
        if(count<this.item.maxStack)this.count=count;
        else this.count=item.maxStack;
    }
    public ItemStack(Item item){
        this.item=item;
        if(count<this.item.maxStack)this.count=1;
        else this.count=item.maxStack;
    }
    public ItemStack(int count){
        this.item=new NullItem();
        this.count=1;
    }
}