package com.github.hellagoodcoder123.enigma.tsspecial;

public abstract class EventTarget {
    public abstract void addEventListener(String type, EventListenerOrEventListenerObject callback, AddEventListenerOptions options);
    public abstract void addEventListener(String type, EventListenerOrEventListenerObject callback, boolean options);
    public abstract void addEventListener(String type, EventListenerOrEventListenerObject callback);
    public abstract boolean dispatchEvent(Event event);
    public abstract void removeEventListener(String type, EventListenerOrEventListenerObject callback, EventListenerOptions options);
    public abstract void removeEventListener(String type, EventListenerOrEventListenerObject callback, boolean options);
    public abstract void removeEventListener(String type, EventListenerOrEventListenerObject callback);
    public static EventTarget prototype;
    public EventTarget(){}
}