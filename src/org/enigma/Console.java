package org.enigma;

public class Console {
    public void log(String s){
        Log.log.println(s);
    }
    public void error(String s){
        Log.error.println(s);
    }
    public void warn(String s){
        Log.warning.println(s);
    }
    public void debug(String s){
        Log.debug.println(s);
    }
}