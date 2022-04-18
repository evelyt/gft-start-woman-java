package com.dio;

import com.dio.calculo.Quadrilatero;

public class Sobrecarga {

	public static void main(String[] args) {
		
		System.out.println("Area do Quadrado: "+Quadrilatero.area(2));
	
		System.out.println("Area do Retangulo: "+Quadrilatero.area(2, 3));
		
		System.out.println("Area do Trapezio: "+Quadrilatero.area(4,2,4));

	}

}
