package org.enigma.typescript.intl;

public interface Collator {
    int compare(String x,String y);
    ResolvedCollatorOptions resolvedOptions();
}