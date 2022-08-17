package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class DoubleArea2D {
    public DoubleCoord2D start;
    public DoubleCoord2D end;
    public boolean isInArea(ByteCoord2D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY());
    }
    public DoubleArea2D(DoubleCoord2D start,DoubleCoord2D end){
        this.start=start;
        this.end=end;
    }
    public DoubleArea2D(double startX,double startY,DoubleCoord2D end) throws UnrequiredException {
        this.start=new DoubleCoord2D(startX,startY);
        this.end=end;
    }
    public DoubleArea2D(double startX,double startY,double endX,double endY) throws UnrequiredException {
        this.start=new DoubleCoord2D(startX,startY);
        this.end=new DoubleCoord2D(endX,endY);
    }
    public DoubleArea2D(DoubleCoord2D start,double endX,double endY) throws UnrequiredException {
        this.start=start;
        this.end=new DoubleCoord2D(endX,endY);
    }
}