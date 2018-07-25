package hu.ak_akademia.narcisstic.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Armstrong implements NarcissticNumber {

	@Override
	public void printResults(int limit) {
		IntStream
			.rangeClosed(1, limit)
			.filter(number -> isArmstrongNumber(number))
			.forEach(x -> System.out.println(x));
	}

	private boolean isArmstrongNumber(Integer i) {
		int[] digits = MyMath.digitsToArray(i);
		int length = MyMath.numberOfDigits(i);
		return Arrays
				.stream(digits)
				.reduce(0, (x, y) -> x + (int) Math.pow(y, length)) == i;
	}

}
