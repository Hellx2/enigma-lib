package com.github.hellagoodcoder123.enigma.tetris;

public interface Block {
    public boolean moveDown(byte amount);
    public boolean moveUp(byte amount);
    public boolean moveLeft(byte amount);
    public boolean moveRight(byte amount);
    public byte[][] placesCovered=null;
    public String color=null;
    public byte x=0;
    public byte y=0;
}