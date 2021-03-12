package com.senati.eti;

import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float l1 = 0, l2 = 0;
		System.out.print("Ingrese lado 1: ");
		l1 = sc.nextFloat();
		
		System.out.print("Ingrese lado 2: ");
		l2 = sc.nextFloat();
		
		float area = l1 * l2;
		float perimetro = (l1 * 2) + (l2 * 2);
		
		System.out.println("\n=======RESULTADOS=======");
        System.out.println("Área del Rectángulo..: " + area);
        System.out.println("Perímetro............: " + perimetro);
		
		

	}

}
