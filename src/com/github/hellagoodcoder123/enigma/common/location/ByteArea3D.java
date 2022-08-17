package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class ByteArea3D {
    public ByteCoord3D start;
    public ByteCoord3D end;
    public boolean isInArea(ByteCoord3D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY())&&(coord.getZ()>=start.getZ())&&(coord.getZ()<=end.getZ());
    }
    public ByteArea3D(ByteCoord3D start,ByteCoord3D end){
        this.start=start;
        this.end=end;
    }
    public ByteArea3D(byte startX,byte startY,byte startZ,ByteCoord3D end) throws UnrequiredException {
        this.start=new ByteCoord3D(startX,startY,startZ);
        this.end=end;
    }
    public ByteArea3D(byte startX,byte startY,byte startZ,byte endX,byte endY,byte endZ) throws UnrequiredException {
        this.start=new ByteCoord3D(startX,startY,startZ);
        this.end=new ByteCoord3D(endX,endY,endZ);
    }
    public ByteArea3D(ByteCoord3D start,byte endX,byte endY,byte endZ) throws UnrequiredException {
        this.start=start;
        this.end=new ByteCoord3D(endX,endY,endZ);
    }
}