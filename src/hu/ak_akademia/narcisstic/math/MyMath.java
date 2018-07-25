package hu.ak_akademia.narcisstic.math;

public class MyMath {

	public static int numberOfDigits(int number) {
		return (int) Math.log10(number) + 1;
	}

	public static int factorial(int number) {
		if (number < 0) {
			return 0;
		}
		if (number == 1 || number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}

	public static int[] digitsToArray(int number) {
		return Integer.toString(number).chars().map(c -> c - 48).toArray();
	}
}
