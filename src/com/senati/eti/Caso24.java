package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese monto 1: ");
		float m1 = sc.nextFloat();
		
		System.out.print("Ingrese monto 2: ");
		float m2 = sc.nextFloat();
		
		System.out.print("Ingrese monto 3: ");
		float m3 = sc.nextFloat();
		
		float o1 = m1 * 0.2f + m2 * 0.2f;
		float o2 = (m3 * 1.5f) / 2;
		float o31 = m1 + m2 + m3;
		float o32 = o31 - (o31 * 0.8f);
		
		System.out.println("\n========== Resultado ==========");
		System.out.println("Monto 1.....: " + m1);
		System.out.println("Monto 2.....: " + m2);
		System.out.println("Monto 3.....: " + m3);
		System.out.println("Cálculo 1....: " + df.format(o1));
		System.out.println("Cálculo 2....: " + df.format(o2));
		System.out.println("Cálculo 3....: " + df.format(o32));
		

	}

}
