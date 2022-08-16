package org.enigma.typescript.intl;

public interface PluralRules {
    ResolvedPluralRulesOptions reslovedOptions();
    String select(int n);
}