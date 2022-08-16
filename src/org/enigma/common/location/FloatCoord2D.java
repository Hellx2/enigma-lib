package org.enigma.common.location;

import org.enigma.common.err.*;

public class FloatCoord2D {
    private float x;
    private float y;
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x) throws UnrequiredException {
        if(this.x!=x)this.x=x;
        else throw new UnrequiredException();
    }
    public void setY(float y) throws UnrequiredException {
        if(this.y!=y)this.y=y;
        else throw new UnrequiredException();
    }
    public void set(FloatCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(DoubleCoord2D coord) throws UnrequiredException {
        setX((float)coord.getX());
        setY((float)coord.getY());
    }
    public void set(float x,float y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
    public FloatCoord2D(FloatCoord2D coord) throws UnrequiredException {
        setX(coord.getX());
        setY(coord.getY());
    }
    public FloatCoord2D(DoubleCoord2D coord) throws UnrequiredException {
        setX((float)coord.getX());
        setY((float)coord.getY());
    }
    public FloatCoord2D(float x,float y) throws UnrequiredException {
        setX(x);
        setY(y);
    }
}