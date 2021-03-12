package com.senati.eti;

import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		float radio = 0;
		System.out.print("Radio: ");
		radio = sc.nextFloat();
		
		float pi = (float)3.1416;
		float area = (float)(pi * (Math.pow(radio, 2)));
		float perimetro = (2 * pi * radio);
		
		System.out.println("\n=======RESULTADOS=======");
        System.out.println("Área del Cículo..: " + area);
        System.out.println("Perímetro........: " + perimetro);

	}

}
