package com.github.hellagoodcoder123.enigma.tetris;

public class Block1 implements Block {
    public String color;
    public byte[][] placesCovered={{0,0,2,1}};
    public boolean moveLeft(byte amount){
        if(x-1>=0)x--;
        else return false;
        return true;
    }
    public boolean moveRight(byte amount){
        if(x+1<=6)x++;
        else return false;
        return true;
    }
    public boolean moveDown(byte amount){
        if(y-1>=0)y--;
        else return false;
        return true;
    }
    public boolean moveUp(byte amount){
        if(y+1<=6)y++;
        else return false;
        return true;
    }
    public byte x=0;
    public byte y=0;
}