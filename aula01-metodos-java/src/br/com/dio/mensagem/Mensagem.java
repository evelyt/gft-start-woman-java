package br.com.dio.mensagem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {

	public static void exibeHora() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");

		String hora = dtf.format(LocalDateTime.now());

		int horaConvertida = Integer.parseInt(hora);

		switch (horaConvertida) {
		case 05:
		case 06:
		case 07:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Ola, Bom dia!\nAgora sao: " + dtf1.format(LocalDateTime.now()));
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			System.out.println("Boa Tarde!\nAgora sao: " + dtf1.format(LocalDateTime.now()));
			break;
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 00:
			System.out.println("Boa Noite!\nAgora sao: " + dtf1.format(LocalDateTime.now()));
			break;
		default:
			System.out.println("Horario invalido!");
		break;
		
		}
	}
}
