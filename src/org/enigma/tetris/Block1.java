package org.enigma.tetris;

import org.w3c.dom.Document;

public class Block2x2 implements Block {
    public String color;
    public byte[][] placesCovered={{0,0,2,1}};
    public boolean moveLeft(byte amount);
    public byte x=0;
    public byte y=0;
}