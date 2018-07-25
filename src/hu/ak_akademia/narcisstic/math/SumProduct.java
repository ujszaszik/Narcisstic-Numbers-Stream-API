package hu.ak_akademia.narcisstic.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumProduct implements NarcissticNumber {

	@Override
	public void printResults(int limit) {
		IntStream
			.rangeClosed(1, limit)
			.filter(x -> isSumProductNumber(x))
			.forEach(System.out::println);
	}

	private boolean isSumProductNumber(Integer i) {
		int[] digits = Integer
				.toString(i)
				.chars()
				.map(c -> c - 48)
				.toArray();
		int sumOfDigits = Arrays
				.stream(digits)
				.reduce(0, (a, b) -> a + b);
		int productOfDigits = Arrays
				.stream(digits)
				.reduce(1, (a, b) -> a * b);
		return sumOfDigits * productOfDigits == i;
	}

}
