package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class LongArea2D {
    public LongCoord2D start;
    public LongCoord2D end;
    public boolean isInArea(ByteCoord2D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY());
    }
    public LongArea2D(LongCoord2D start,LongCoord2D end){
        this.start=start;
        this.end=end;
    }
    public LongArea2D(long startX,long startY,LongCoord2D end) throws UnrequiredException {
        this.start=new LongCoord2D(startX,startY);
        this.end=end;
    }
    public LongArea2D(long startX,long startY,long endX,long endY) throws UnrequiredException {
        this.start=new LongCoord2D(startX,startY);
        this.end=new LongCoord2D(endX,endY);
    }
    public LongArea2D(LongCoord2D start,long endX,long endY) throws UnrequiredException {
        this.start=start;
        this.end=new LongCoord2D(endX,endY);
    }
}