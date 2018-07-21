package hu.ak_akademia.narcisstic;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Armstrong {
	public static void main(String[] args) {
		new Armstrong().run();
	}

	private void run() {
		IntStream numbers = IntStream.rangeClosed(1, Integer.MAX_VALUE).filter(number -> isArmstrongNumber(number));
		numbers.forEach(x -> System.out.println(x));
	}

	private boolean isArmstrongNumber(Integer i) {
		int[] digits = Integer.toString(i).chars().map(c -> c - 48).toArray();
		return Arrays.stream(digits).reduce(0, (x, y) -> x + (int) Math.pow(y, getDigits(i))) == i;
	}

	private int getDigits(int i) {
		return (int) Math.log10(i) + 1;
	}

}
