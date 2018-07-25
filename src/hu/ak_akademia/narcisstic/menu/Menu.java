package hu.ak_akademia.narcisstic.menu;

import hu.ak_akademia.narcisstic.math.NarcissticNumber;
import hu.ak_akademia.narcisstic.math.SolverInjector;

public class Menu {
	private static NarcissticNumber solver;

	public static void start() {
		while (true) {
			int selection = UserInputHandler.INSTANCE.readInt(menuMessage(), IntRange.of(1, 8));
			switch (selection) {
			case 1:
				solver = SolverInjector.getSolver("Armstrong");
				break;
			case 2:
				solver = SolverInjector.getSolver("Munchhausen");
				break;
			case 3:
				solver = SolverInjector.getSolver("Ascending Power");
				break;
			case 4:
				solver = SolverInjector.getSolver("Sum Product");
				break;
			case 5:
				solver = SolverInjector.getSolver("Dudeney");
				break;
			case 6:
				solver = SolverInjector.getSolver("Factorion");
				break;
			case 7:
				solver = SolverInjector.getSolver("Fresnillense");
				break;
			default:
				return;
			}
			int limit = UserInputHandler.INSTANCE.readInt(limitMessage(), IntRange.of(1, 1_000_000_000));
			solver.printResults(limit);
		}
	}

	private static String limitMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("Please enter upper range limit: ");
		sb.append("Has to be between 1 and 1'000'000'000");
		return sb.toString();
	}

	private static String menuMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("1 - Armstrong numbers\n");
		sb.append("2 - Munchhausen numbers\n");
		sb.append("3 - Ascending power numbers\n");
		sb.append("4 - Sum product numbers\n");
		sb.append("5 - Dudeney numbers\n");
		sb.append("6 - Factorion numbers\n");
		sb.append("7 - Fresnillense numbers\n");
		sb.append("8 - Exit\n\n");
		return sb.toString();
	}

}
