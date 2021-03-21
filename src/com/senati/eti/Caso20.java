package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("Ingrese valor de venta: ");
		float va_ve = sc.nextFloat();
		
		float incre = va_ve * 1.42f;
		
		System.out.println("\n========== Resultado ==========");
		System.out.println("Venta incrementado en 42%: " + df.format(incre));
		
		

	}

}
