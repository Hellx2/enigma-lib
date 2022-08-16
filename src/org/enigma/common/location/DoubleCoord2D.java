package org.enigma.common.location;

public class DoubleCoord2D {
    private double x;
    private double y;
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void set(FloatCoord2D coord){
        setX(coord.getX());
        setY(coord.getX());
    }
    public void set(double x,double y) {
        setX(x);
        setY(y);
    }
    public DoubleCoord2D(FloatCoord2D coord){
        setX(coord.getX());
        setY(coord.getX());
    }
    public DoubleCoord2D(double x,double y) {
        setX(x);
        setY(y);
    }
}