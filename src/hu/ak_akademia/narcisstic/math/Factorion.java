package hu.ak_akademia.narcisstic.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Factorion implements NarcissticNumber {

	@Override
	public void printResults(int limit) {
		IntStream
			.rangeClosed(1, limit)
			.filter(number -> isFactorionNumber(number))
			.forEach(System.out::println);
	}

	private boolean isFactorionNumber(Integer i) {
		int[] digits = MyMath.digitsToArray(i);
		return Arrays
				.stream(digits)
				.map(x -> MyMath.factorial(x))
				.sum() == i;
	}

}
