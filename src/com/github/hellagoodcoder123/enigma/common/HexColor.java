package com.github.hellagoodcoder123.enigma.common;

public class HexColor {
    public byte red;
    public byte green;
    public byte blue;
    public HexColor(byte red,byte green,byte blue){
        this.red=red;
        this.green=green;
        this.blue=blue;
    }
    public int toDecimal(){
        return ((blue+128)+((green+128)*256)+((red+128)*(256*256)));
    }
}