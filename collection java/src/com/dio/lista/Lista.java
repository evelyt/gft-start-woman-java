package com.dio.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void exercicioUmLista() {

		List<Double> temperaturas = new ArrayList<Double>(Arrays.asList(34.4d, 41d, 31d));
		temperaturas.add(32.3d);
		temperaturas.add(40d);
		temperaturas.add(36d);
		System.out.println("Media das temperaturas nos 6 primeiros meses > " + temperaturas);

		/* Calculo da media semestral */
		double mediaSemestral;
		Iterator<Double> i = temperaturas.iterator();
		double soma = 0d;
		while (i.hasNext()) {
			Double next = i.next();
			soma += next;
		}
		mediaSemestral = soma / temperaturas.size();
		System.out.println("Media Semestral:" + mediaSemestral);

		// Verificaçao das temperaturas maiores que a media semestral
		System.out.println("Meses com a temperatura acima da media semestral: ");
		Iterator<Double> i2 = temperaturas.iterator();
		int cont = 0;
		while (i2.hasNext()) {
			Double next = i2.next();
			if (mediaSemestral < next) {
				switch (cont) {
				case 0:
					System.out.println("Janeiro " + next);
					break;
				case 1:
					System.out.println("Feveiro " + next);
					break;
				case 2:
					System.out.println("Março " + next);
					break;
				case 3:
					System.out.println("Abril " + next);
					break;
				case 4:
					System.out.println("Maio " + next);
					break;
				case 5:
					System.out.println("Junho " + next);
					break;

				}

			}
			cont++;

		}

	}
}
