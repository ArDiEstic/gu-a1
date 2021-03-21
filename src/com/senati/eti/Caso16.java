package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		float h = 0, tp = 0;
		System.out.print("Ingrese horas trabajadas: ");
		h = sc.nextFloat();
		
		System.out.print("Ingrese tarifa por hora: ");
		tp = sc.nextFloat();
		
		float sueldo = h * tp;
		float bono = sueldo * 0.05f;
		float total = sueldo + bono;
		float td = total / 3.24f;
		
		System.out.println("=======RESULTADOS=======");
        System.out.println("Sueldo...........: " + "S/. " + sueldo);
        System.out.println("Bono.............: " + "S/. " + bono);
        System.out.println("Total............: " + "S/. " + total);
        System.out.println("Total en dólares.: " + "$ " + df.format(td));

	}

}
