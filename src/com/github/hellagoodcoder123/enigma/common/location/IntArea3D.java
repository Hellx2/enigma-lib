package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class IntArea3D {
    public IntCoord3D start;
    public IntCoord3D end;
    public boolean isInArea(IntCoord3D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY())&&(coord.getZ()>=start.getZ())&&(coord.getZ()<=end.getZ());
    }
    public IntArea3D(IntCoord3D start,IntCoord3D end){
        this.start=start;
        this.end=end;
    }
    public IntArea3D(int startX,int startY,int startZ,IntCoord3D end) throws UnrequiredException {
        this.start=new IntCoord3D(startX,startY,startZ);
        this.end=end;
    }
    public IntArea3D(int startX,int startY,int startZ,int endX,int endY,int endZ) throws UnrequiredException {
        this.start=new IntCoord3D(startX,startY,startZ);
        this.end=new IntCoord3D(endX,endY,endZ);
    }
    public IntArea3D(IntCoord3D start,int endX,int endY,int endZ) throws UnrequiredException {
        this.start=start;
        this.end=new IntCoord3D(endX,endY,endZ);
    }
}