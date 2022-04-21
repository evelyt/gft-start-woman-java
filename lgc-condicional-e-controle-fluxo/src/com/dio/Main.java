package com.dio;

import com.dio.control.ControleFluxo;
import com.dio.opLogicos.OperadoresLogicos;
import com.dio.opRelacionais.OperadoresRelacionais;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--Exercicios--\n");
		
		System.out.println("Operadores Relacionais:");
		OperadoresRelacionais.exibe();
		System.out.println("\nOperadores Logicos:");
		OperadoresLogicos.exibe();
		
		System.out.println("Controle de Fluxo - Utilizando IF e ELSE");
		ControleFluxo.meses(1);
		ControleFluxo.meses(3);
		ControleFluxo.meses(12);
		ControleFluxo.meses(6);
		ControleFluxo.meses(13);
		
		System.out.println("Controle de Fluxo - Utilizando SWITCH");
		
		ControleFluxo.semana("Segunda");
		ControleFluxo.semana("Sabado");
		ControleFluxo.semana("Abacaxi");
		
		ControleFluxo.verifica(2);
		ControleFluxo.verifica(4);
		ControleFluxo.verifica(6);
		
		
		

	}

}
