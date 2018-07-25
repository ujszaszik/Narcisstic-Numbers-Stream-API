package hu.ak_akademia.narcisstic.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public enum UserInputHandler {
	INSTANCE;

	private Scanner scanner = new Scanner(System.in);

	public Integer readInt(String message, IntRange range) {
		System.out.println(message);
		while (true) {
			try {
				Integer input = scanner.nextInt();
				scanner.nextLine();
				if (range.isValid(input)) {
					return input;
				} else {
					throw new InputMismatchException();
				}
			} catch (InputMismatchException e) {
				System.err.println(inputMismatchErrorMessage(range));
				scanner.nextLine();
			}
		}
	}

	private String inputMismatchErrorMessage(IntRange range) {
		StringBuilder sb = new StringBuilder();
		sb.append("Input has to be a whole number between ");
		sb.append(range.getMin());
		sb.append(" and ");
		sb.append(range.getMax());
		sb.append("!");
		return sb.toString();
	}

}
