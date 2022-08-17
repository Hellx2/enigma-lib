package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class ShortCoord2D {
    private short x;
    private short y;
    public short getX(){
        return x;
    }
    public short getY(){
        return y;
    }
    public void setX(short x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(short y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void set(IntCoord2D coord) throws UnrequiredException {
        setX((short)coord.getX());
        setY((short)coord.getY());
    }
    public void set(ShortCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(ByteCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(short x,short y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
    public ShortCoord2D(ShortCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public ShortCoord2D(ByteCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public ShortCoord2D(IntCoord2D coord) throws UnrequiredException {
        setX((short)coord.getX());
        setY((short)coord.getY());
    }
    public ShortCoord2D(short x,short y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
}