package br.com.dio.calculadora;

public class Calculadora {

	public static void soma(double a, double b) {
		System.out.println("Soma "+a+"+"+b+" = "+(a+b));
	}
	
	public static void subtracao(double a, double b) {
		System.out.println("Subtração "+a+"-"+b+" = "+(a-b));
	}
	
	public static void divisao(double a, double b) {
		System.out.println("Divisão "+a+"/"+b+ " = "+ (a/b));
	}
	
	public static void multiplicacao(double a, double b) {
		System.out.println("Multiplicação "+a+"*"+b+" = "+(a*b));
	}

}
