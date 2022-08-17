package com.github.hellagoodcoder123.enigma.typescript.intl;

public interface PluralRules {
    ResolvedPluralRulesOptions reslovedOptions();
    String select(int n);
}