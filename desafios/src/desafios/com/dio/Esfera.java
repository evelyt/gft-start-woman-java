package desafios.com.dio;

import java.util.Scanner;

public class Esfera {
	
	public static void calculoVolume() {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double R = sc.nextDouble();
		double divisao = 4.0/3.0;
		double volume = ( divisao ) * pi * (Math.pow(R, 3.0));
		System.out.printf("VOLUME = %.3f%n", volume);
	}


}
