package org.enigma.typescript.nodejs;

import org.enigma.typescript.*;

public interface CallSite {
    java.lang.Object getThis();
    java.lang.String getTypeName();
    Function getFunction();
    java.lang.String getFunctionName();
    java.lang.String getMethodName();
    java.lang.String getFileName();
    int getLineNumber();
    int getColumnNumber();
    java.lang.String getEvalOrigin();
    boolean isTopLevel();
    boolean isEval();
    boolean isNative();
    boolean isConstructor();
}