package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso15 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		float importe_s = cantidad * precio;
		float importe_d = importe_s / 3.24f;
		
		System.out.println("\n=======RESULTADOS=======");
        System.out.println("Importe en soles...: " + df.format(importe_s));
        System.out.println("Importe en soles...: " + df.format(importe_d));

	}

}
