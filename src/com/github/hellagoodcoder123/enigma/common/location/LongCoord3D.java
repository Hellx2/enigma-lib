package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.UnrequiredException;

public class LongCoord3D {
    private long x;
    private long y;
    private long z;
    public long getX(){
        return x;
    }
    public long getY(){
        return y;
    }
    public long getZ(){
        return z;
    }
    public void setX(long x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(long y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void setZ(long z) throws UnrequiredException {
        if(this.z!=z)this.z=z;
        else throw new UnrequiredException();
    }
    public void set(LongCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public void set(long x,long y,long z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
    public LongCoord3D(LongCoord3D coord) throws UnrequiredException {
        set(coord);
    }
    public LongCoord3D(long x,long y,long z) throws UnrequiredException {
        set(x,y,z);
    }
}