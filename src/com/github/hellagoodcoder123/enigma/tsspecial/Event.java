package com.github.hellagoodcoder123.enigma.tsspecial;

public abstract class Event {
    boolean bubbles;
    boolean cancelBubble;
    boolean cancelable;
    boolean composed;
    EventTarget currentTarget;
}