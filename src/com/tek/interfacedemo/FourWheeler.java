package com.tek.interfacedemo;


public interface FourWheeler {
	
	default void print(){
		System.out.println("FourWheeler print()");
	}
	
	
}
