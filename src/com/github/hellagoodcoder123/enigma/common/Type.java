package com.github.hellagoodcoder123.enigma.common;

@SuppressWarnings("all")
public class Type {
    public Object[] acceptList;
    public boolean isAccepted(Object x){
        for(var i=0;i<acceptList.length;i++){
            if(acceptList[i] instanceof Class c){
                if(x.getClass()==c){
                    return true;
                }
            } else if(acceptList[i] instanceof Type t) {
                if(t.isAccepted(x))return true;
            } else {
                if(x==acceptList[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public Type(Object... accepts){
        acceptList=accepts;
    }
}