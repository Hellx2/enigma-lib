package org.enigma.common.location;

import org.enigma.common.err.*;

public class DoubleCoord2D {
    private double x;
    private double y;
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(double y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void set(FloatCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(DoubleCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(double x,double y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
    public DoubleCoord2D(FloatCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public DoubleCoord2D(DoubleCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public DoubleCoord2D(double x,double y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
}