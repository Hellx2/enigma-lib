package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class IntArea2D {
    public IntCoord2D start;
    public IntCoord2D end;
    public boolean isInArea(ByteCoord2D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY());
    }
    public IntArea2D(IntCoord2D start,IntCoord2D end){
        this.start=start;
        this.end=end;
    }
    public IntArea2D(int startX,int startY,IntCoord2D end) throws UnrequiredException {
        this.start=new IntCoord2D(startX,startY);
        this.end=end;
    }
    public IntArea2D(int startX,int startY,int endX,int endY) throws UnrequiredException {
        this.start=new IntCoord2D(startX,startY);
        this.end=new IntCoord2D(endX,endY);
    }
    public IntArea2D(IntCoord2D start,int endX,int endY) throws UnrequiredException {
        this.start=start;
        this.end=new IntCoord2D(endX,endY);
    }
}