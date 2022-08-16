package org.enigma.typescript.intl;

public interface Locale extends LocaleOptions {
    String baseName=null;
    String language=null;
    Locale maximize();
    Locale minimize();
    String toString();
}