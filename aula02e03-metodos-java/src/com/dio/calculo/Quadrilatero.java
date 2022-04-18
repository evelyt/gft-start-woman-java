package com.dio.calculo;

public class Quadrilatero {
	
	//Area do Quadrado
	public static double area(double lado) {
		return lado*lado;
	}
	//Area do Retangulo
	public static double area(double base, double altura ) {
		return base*altura;
	}
	//Area Trapezio
	public static double area(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior+baseMenor)*altura)/2;
	}

}
