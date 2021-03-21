package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre de Producto: ");
		String producto = sc.nextLine();
		
		System.out.print("Precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Cantidad: ");
		float cantidad = sc.nextFloat();
		
		float importe = cantidad * precio;
		float igv = importe * 0.18f;
		float dscto = importe * 0.03f;
		float total = importe - dscto + igv;
		
		System.out.println("\n========== Resultado ==========");
		System.out.println("Producto......: " + producto);
		System.out.println("Precio........: " + precio);
		System.out.println("Cantidad......: " + cantidad);
		System.out.println("Importe.......: " + importe);
		System.out.println("IGV...........: " + df.format(igv));
		System.out.println("Descuento.....: " + dscto);
		System.out.println("Total.........: " + df.format(total));
		
		

	}

}
