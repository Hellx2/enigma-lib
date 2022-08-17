package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.UnrequiredException;

public class LongArea3D {
    public LongCoord3D start;
    public LongCoord3D end;
    public boolean isInArea(LongCoord3D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY())&&(coord.getZ()>=start.getZ())&&(coord.getZ()<=end.getZ());
    }
    public LongArea3D(LongCoord3D start,LongCoord3D end){
        this.start=start;
        this.end=end;
    }
    public LongArea3D(long startX,long startY,long startZ,LongCoord3D end) throws UnrequiredException {
        this.start=new LongCoord3D(startX,startY,startZ);
        this.end=end;
    }
    public LongArea3D(long startX,long startY,long startZ,long endX,long endY,long endZ) throws UnrequiredException {
        this.start=new LongCoord3D(startX,startY,startZ);
        this.end=new LongCoord3D(endX,endY,endZ);
    }
    public LongArea3D(LongCoord3D start,long endX,long endY,long endZ) throws UnrequiredException {
        this.start=start;
        this.end=new LongCoord3D(endX,endY,endZ);
    }
}