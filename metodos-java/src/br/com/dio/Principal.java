package br.com.dio;

import java.util.Scanner;

import br.com.dio.calculadora.Calculadora;
import br.com.dio.emprestimo.Emprestimo;
import br.com.dio.mensagem.Mensagem;

public class Principal {

	public static void main(String[] args) {
		
		/* Para entrada de valores*/
		Scanner scan = new Scanner(System.in);
		
		/* Metodo da Mensagem*/
		Mensagem.exibeHora();

		/* Metodo da calculadora*/
		double a, b;
		System.out.println("-- Calculadora --\nDigite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo valor:");
		b = scan.nextDouble();
		Calculadora.soma(a, b);
		Calculadora.subtracao(a, b);
		Calculadora.divisao(a, b);
		Calculadora.multiplicacao(a, b);
		System.out.println("-------------------");
		
		/* Metodo da Emprestimo*/
		double valorEmprestimo;
		int numeroParcelas;
		System.out.println("-- Calculo de Emprestimo --");
		System.out.println("Valor do emprestimo que deseja fazer:");
		valorEmprestimo = scan.nextDouble();
		System.out.println("Numero de parcelas:");
		numeroParcelas = scan.nextInt();
		
		Emprestimo.calculoEmprestimo(valorEmprestimo, numeroParcelas);
		
		
	}

}
