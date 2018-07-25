package hu.ak_akademia.narcisstic.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Munchhausen implements NarcissticNumber {

	@Override
	public void printResults(int limit) {
		IntStream
			.rangeClosed(1, limit)
			.filter(x -> isMunchhausenNumber(x))
			.forEach(System.out::println);
	}

	private boolean isMunchhausenNumber(Integer i) {
		int[] digits = MyMath.digitsToArray(i);
		return Arrays
				.stream(digits)
				.reduce(0, (x, y) -> x + (int) Math.pow(y, y)) == i;
	}

}
