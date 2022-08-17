package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class ByteCoord2D {
    private byte x;
    private byte y;
    public byte getX(){
        return x;
    }
    public byte getY(){
        return y;
    }
    public void setX(byte x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(byte y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void set(ByteCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(ShortCoord2D coord) throws UnrequiredException {
        setX((byte)coord.getX());
        setY((byte)coord.getY());
    }
    public void set(IntCoord2D coord) throws UnrequiredException {
        setX((byte)coord.getX());
        setY((byte)coord.getY());
    }
    public void set(byte x,byte y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
    public ByteCoord2D(ByteCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public ByteCoord2D(ShortCoord2D coord) throws UnrequiredException {
        setX((byte)coord.getX());
        setY((byte)coord.getY());
    }
    public ByteCoord2D(IntCoord2D coord) throws UnrequiredException {
        setX((byte)coord.getX());
        setY((byte)coord.getY());
    }
    public ByteCoord2D(byte x,byte y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
}