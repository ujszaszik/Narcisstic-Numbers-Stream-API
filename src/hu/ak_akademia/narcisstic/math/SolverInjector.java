package hu.ak_akademia.narcisstic.math;

import java.util.HashMap;
import java.util.Map;

public class SolverInjector {
	private static Map<String, NarcissticNumber> solver = new HashMap<>();

	static {
		solver.put("Armstrong", new Armstrong());
		solver.put("Munchhausen", new Munchhausen());
		solver.put("Ascending Power", new AscendingPower());
		solver.put("Sum Product", new SumProduct());
		solver.put("Dudeney", new Dudeney());
		solver.put("Factorion", new Factorion());
		solver.put("Fresnillense", new Fresnillense());
	}

	public static NarcissticNumber getSolver(String solverName) {
		return solver.get(solverName);
	}

}
