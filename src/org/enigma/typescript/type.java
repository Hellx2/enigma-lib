package org.enigma.typescript;

import org.enigma.ArrayUtils;

public class type {
    public type(java.lang.Object... args){
        for(java.lang.Object arg : args){
            ArrayUtils.push(accept,arg);
        }
    }
    java.lang.Object[] accept=null;
    public boolean check(java.lang.Object a){
        for(int i=0;i<accept.length;i++){
            if(accept[i]==a||accept[i]==a.getClass())return true;
        }
        return false;
    }
}