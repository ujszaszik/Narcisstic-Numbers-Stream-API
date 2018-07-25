package hu.ak_akademia.narcisstic.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Dudeney implements NarcissticNumber {

	@Override
	public void printResults(int limit) {
		IntStream
			.rangeClosed(1, limit)
			.filter(number -> isDudeneyNumber(number))
			.forEach(x -> System.out.println(x));
	}

	private boolean isDudeneyNumber(Integer i) {
		int[] digits = MyMath.digitsToArray(i);
		return Math.pow(Arrays.stream(digits).sum(), 3) == i;
	}

}
