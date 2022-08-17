package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class ShortCoord3D {
    private short x;
    private short y;
    private short z;
    public short getX(){
        return x;
    }
    public short getY(){
        return y;
    }
    public short getZ(){
        return z;
    }
    public void setX(short x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(short y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void setZ(short z) throws UnrequiredException {
        if(this.z!=z)this.z=z;
        else throw new UnrequiredException();
    }
    public void set(IntCoord3D coord) throws UnrequiredException {
        setX((short)coord.getX());
        setY((short)coord.getY());
        setZ((short)coord.getZ());
    }
    public void set(ShortCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public void set(ByteCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public void set(short x,short y,short z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
    public ShortCoord3D(ShortCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public ShortCoord3D(ByteCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public ShortCoord3D(IntCoord3D coord) throws UnrequiredException {
        setX((short)coord.getX());
        setY((short)coord.getY());
        setZ((short)coord.getZ());
    }
    public ShortCoord3D(short x,short y,short z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
}