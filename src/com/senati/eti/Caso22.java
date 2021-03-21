package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nota 1: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Nota 2: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Nota 3: ");
		float n3 = sc.nextFloat();
		
		float promedio = n1 * 0.2f + n2 * 0.3f + n3 * 0.5f;
		
		System.out.println("\n========== Resultaodo ==========");
		System.out.println("Alumno.......: " + nombre);
		System.out.println("Promedio.....: " + df.format(promedio));

	}

}
