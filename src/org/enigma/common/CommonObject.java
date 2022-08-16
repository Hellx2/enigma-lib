package org.enigma.common;

public class CommonObject {
	public boolean equal(Object x){
		return this==x;
	}
	public boolean inequal(Object x){
		return !equal(x);
	}
}