package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		gato.setNome("Mel");
		gato.setCor("Marrom");
		gato.setIdade(3);
		
		System.out.println(gato);
		/*
		 * int a = 5;
		int b = 6;
		System.out.println("Hello Word! "+ (a+b));*/

	}

}
