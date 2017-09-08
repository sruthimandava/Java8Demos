package com.tek.lamdademo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaDemo {

	public static void main(String... args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> s = numbers.stream();
		numbers.forEach(num -> {
			System.out.print(num );
		});

	}

}
