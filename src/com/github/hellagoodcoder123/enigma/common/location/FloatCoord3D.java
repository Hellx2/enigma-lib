package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class FloatCoord3D {
    private float x;
    private float y;
    private float z;
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float getZ(){
        return z;
    }
    public void setX(float x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(float y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void setZ(float z) throws UnrequiredException {
        if(this.z!=z)this.z=z;
        else throw new UnrequiredException();
    }
    public void set(FloatCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public void set(DoubleCoord3D coord) throws UnrequiredException {
        setX((float)coord.getX());
        setY((float)coord.getY());
        setZ((float)coord.getZ());
    }
    public void set(float x,float y,float z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
    public FloatCoord3D(FloatCoord3D coord) throws UnrequiredException {
        set(coord);
    }
    public FloatCoord3D(DoubleCoord3D coord) throws UnrequiredException {
        set(coord);
    }
    public FloatCoord3D(float x,float y,float z) throws UnrequiredException {
        set(x,y,z);
    }
}