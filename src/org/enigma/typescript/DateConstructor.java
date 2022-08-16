package org.enigma.typescript;

public interface DateConstructor {
    Date prototype=null;
    int parse(String s);
    int UTC(int year,int month,int date,int hours,int minutes,int seconds,int ms);
    int UTC(int year,int month,int date,int hours,int minutes,int seconds);
    int UTC(int year,int month,int date,int hours,int minutes);
    int UTC(int year,int month,int date,int hours);
    int UTC(int year,int month,int date);
    int UTC(int year,int month);
    int now();
}