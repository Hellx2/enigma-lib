package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class LongCoord2D {
    private long x;
    private long y;
    public long getX(){
        return x;
    }
    public long getY(){
        return y;
    }
    public void setX(long x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(long y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void set(LongCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(short x,short y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
    public LongCoord2D(LongCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public LongCoord2D(long x,long y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
}