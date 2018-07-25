package hu.ak_akademia.narcisstic.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Fresnillense implements NarcissticNumber {
	
	@Override
	public void printResults(int limit) {
		IntStream
			.rangeClosed(1, limit)
			.filter(x -> isFresnillenseNumber(x))
			.forEach(System.out::println);
	}

	private boolean isFresnillenseNumber(Integer i) {
		int[] digits = MyMath.digitsToArray(i);
		return IntStream
				.range(0, digits.length)
				.map(x -> sumOfDigitsRaisedToPower(digits, x + 1))
				.sum() == i;
	}

	private Integer sumOfDigitsRaisedToPower(int[] digits, Integer power) {
		return Arrays
				.stream(digits)
				.map(x -> (int) Math.pow(x, power))
				.sum();
	}
}
