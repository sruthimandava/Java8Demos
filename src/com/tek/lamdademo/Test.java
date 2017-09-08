package com.tek.lamdademo;

public class Test {

	public static void main(String[] args) {
		System.out.println(divide());
	}

	public static int divide() {
		try {
			int i = 1 / 1;
			return i;
		} catch (Exception e) {
			System.out.println("Catch()");
			return -1;
		} finally {
			return 2;
		}
	}
}
