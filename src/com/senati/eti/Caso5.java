package com.senati.eti;

import java.util.Scanner;
public class Caso5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		System.out.println("Ingrese primer número: ");
		n1 = sc.nextFloat();
		
		System.out.println("Ingrese segundo número: ");
		n2 = sc.nextFloat();
		
		float pro = ((n1 + n2) / 2);
		float aum1 = (float) (n1 * 1.2);
		float dism2 = (float) (n2 - (n2 * 0.3));
		
		System.out.println("\n=======RESULTADOS=======");
		System.out.println("Resultado 1....: " + pro);
        System.out.println("Resultado 2....: " + aum1);
        System.out.println("Resultado 3....: " + dism2);

	}

}
