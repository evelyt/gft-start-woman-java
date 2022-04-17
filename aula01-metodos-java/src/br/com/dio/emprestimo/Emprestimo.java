package br.com.dio.emprestimo;

public class Emprestimo {

	public static double taxaJuros(double numeroParcelas) {

		double resultado;
		
		if (numeroParcelas > 11) {
			resultado = 0.1;
		} else {
			resultado = numeroParcelas / 10;
		}

		return resultado;
	}

	public static void calculoEmprestimo(double valor, int numeroParcelas) {
		
		double taxa = taxaJuros(numeroParcelas);

		double valorFinal = valor + (valor * taxa);

		System.out.println("Valor Final do emprestimo para "+
		numeroParcelas+" parcelas: R$" + valorFinal);
	}

}
