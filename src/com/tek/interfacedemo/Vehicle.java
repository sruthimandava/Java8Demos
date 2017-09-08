package com.tek.interfacedemo;

public interface Vehicle {
	
	public int id = 10;
	
	
	default public void print(){
		System.out.println("Vehicle Print()");
	}

	
}
