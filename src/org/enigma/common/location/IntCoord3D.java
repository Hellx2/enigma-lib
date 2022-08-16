package org.enigma.common.location;

import org.enigma.common.err.*;

public class IntCoord3D {
    private int x;
    private int y;
    private int z;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public void setX(int x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(int y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void setZ(int z) throws UnrequiredException {
        if(this.z!=z)this.z=z;
        else throw new UnrequiredException();
    }
    public void set(IntCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
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
    public void set(int x,int y,int z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
    public IntCoord3D(IntCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public IntCoord3D(ShortCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public IntCoord3D(ByteCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public IntCoord3D(int x,int y,int z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
}