package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo valor:");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		float divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("Soma "+a+"+"+b+" = "+soma);
		System.out.println("Subtração "+a+"-"+b+" = "+subtracao);
		System.out.println("Divisão "+a+"/"+b+ " = "+ divisao);
		System.out.println("Multiplicação "+a+"*"+b+" = "+multiplicacao);
		
	}
	
	public static int soma(int a, int b) {
		return a+b;
	}
	
	public static int subtracao(int a, int b) {
		return a-b;
	}
	
	public static float divisao(float a, float b) {
		return a/b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a*b;
	}

}
