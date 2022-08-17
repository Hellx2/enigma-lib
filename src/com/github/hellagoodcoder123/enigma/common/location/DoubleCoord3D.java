package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class DoubleCoord3D {
    private double x;
    private double y;
    private double z;
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public void setX(double x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(double y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void setZ(double z) throws UnrequiredException {
        if(this.z!=z)this.z=z;
        else throw new UnrequiredException();
    }
    public void set(FloatCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public void set(DoubleCoord3D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
        setZ(coord.getZ());
    }
    public void set(double x,double y,double z) throws UnrequiredException {
        setX(x);
        setY(y);
        setZ(z);
    }
    public DoubleCoord3D(FloatCoord3D coord) throws UnrequiredException {
        set(coord);
    }
    public DoubleCoord3D(DoubleCoord3D coord) throws UnrequiredException {
        set(coord);
    }
    public DoubleCoord3D(double x,double y,double z) throws UnrequiredException {
        set(x,y,z);
    }
}