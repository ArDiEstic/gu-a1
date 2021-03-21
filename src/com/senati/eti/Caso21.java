package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Ingrese valor de gasto: ");
		float va_ga = sc.nextFloat();
		
		float dis = va_ga - (va_ga * 0.12f);
		
		System.out.println("\n========== Resultado ==========");
		System.out.println("Gasto disminuido en 12%: " + df.format(dis));
		

	}

}
