package com.dio.opLogicos;

public class OperadoresLogicos {

	/*
	 * Conjunção: simbolo && Disjuncao:simbolo || Disjuncao Exclusiva: simbolo ^
	 * Negacao:simbolo !
	 */

	// Exemplos

	public static void exibe() {

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;

		System.out.println("b1 && b2? " + (b1 && b2));
		System.out.println("b1 || b2? " + (b1 || b2));
		System.out.println("b3 && b4? " + (b3 && b4));
		System.out.println("b3 || b4? " + (b3 || b4));

		System.out.println("b1 - negação: " + !b1);
		System.out.println("b4 - negação: " + !b4);

		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;

		System.out.println("(i1 + i2) < (f2 - f1) && true " + ((i1 + i2) < (f2 - f1) && true));
		System.out.println("(i1 > i2 ) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

	}

}
