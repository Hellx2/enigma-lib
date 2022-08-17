package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class IntCoord2D {
    private int x;
    private int y;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(int y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void set(IntCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(ShortCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(ByteCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(int x,int y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
    public IntCoord2D(IntCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public IntCoord2D(ShortCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public IntCoord2D(ByteCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public IntCoord2D(int x,int y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
}