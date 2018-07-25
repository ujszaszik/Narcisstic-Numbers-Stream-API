package hu.ak_akademia.narcisstic.math;

import java.util.stream.IntStream;

public class AscendingPower implements NarcissticNumber {

	@Override
	public void printResults(int limit) {
		IntStream
			.rangeClosed(1, limit)
			.filter(x -> isAscendingPowerNumber(x))
			.forEach(System.out::println);
	}

	private boolean isAscendingPowerNumber(Integer i) {
		int[] digits = MyMath.digitsToArray(i);
		return IntStream
				.range(0, digits.length)
				.map(x -> (int) Math.pow(digits[x], x + 1))
				.sum() == i;
	}
}
