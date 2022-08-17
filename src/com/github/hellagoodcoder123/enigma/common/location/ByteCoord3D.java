package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class ByteCoord3D {
    private byte x;
    private byte y;
    private byte z;
    public byte getX() {
        return x;
    }
    public byte getY() {
        return y;
    }
    public byte getZ() {
        return z;
    }
    public void setX(byte x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(byte y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void setZ(byte z) throws UnrequiredException {
        if(this.z!=z)this.z=z;
        else throw new UnrequiredException();
    }
    public void set(ByteCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public void set(ShortCoord3D coord) throws UnrequiredException {
        setX((byte)coord.getX());
        setY((byte)coord.getY());
        setZ((byte)coord.getZ());
    }
    public void set(IntCoord3D coord) throws UnrequiredException {
        setX((byte)coord.getX());
        setY((byte)coord.getY());
        setZ((byte)coord.getZ());
    }
    public void set(byte x,byte y,byte z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
    public ByteCoord3D(ByteCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public ByteCoord3D(ShortCoord3D coord) throws UnrequiredException {
        setX((byte)coord.getX());
        setY((byte)coord.getY());
        setZ((byte)coord.getZ());
    }
    public ByteCoord3D(IntCoord3D coord) throws UnrequiredException {
        setX((byte)coord.getX());
        setY((byte)coord.getY());
        setZ((byte)coord.getZ());
    }
    public ByteCoord3D(byte x,byte y,byte z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
}