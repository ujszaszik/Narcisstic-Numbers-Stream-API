package hu.ak_akademia.narcisstic.menu;

public class IntRange {
	private int min;
	private int max;

	private IntRange(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public static IntRange of(int min, int max) {
		return new IntRange(min, max);
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public boolean isValid(int number) {
		return number <= max && number >= min;
	}

}
