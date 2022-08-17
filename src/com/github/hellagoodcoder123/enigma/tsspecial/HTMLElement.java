package com.github.hellagoodcoder123.enigma.tsspecial;

public abstract class HTMLElement {
    String accessKey;
    String accessKeyLabel;
    String autocapitalize;
    String dir;
    boolean draggable;
    boolean hidden;
    String innerText;
    String lang;
    double offsetHeight;
    double offsetLeft;
    Element offsetParent;
    double offsetTop;
    double offsetWidth;
    String outerText;
    boolean spellcheck;
    String title;
    boolean translate;
    abstract ElementInternals attachInternals();
    void click(){
        onclick();
    }
    <K extends keyof HTMLElementEventMap> void addEventListener(type: K, listener: (this: HTMLElement, ev: HTMLElementEventMap[K]) => any, options?: boolean | AddEventListenerOptions);
    addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void;
    removeEventListener<K extends keyof HTMLElementEventMap>(type: K, listener: (this: HTMLElement, ev: HTMLElementEventMap[K]) => any, options?: boolean | EventListenerOptions): void;
    removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void;
}