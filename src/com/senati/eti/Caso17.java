package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Número de aprovados: ");
		int na = sc.nextInt();
		
		System.out.print("Número de desaprobados: ");
		int nd = sc.nextInt();
		
		System.out.print("Número de retirados: ");
		int nr = sc.nextInt();
		
		float total = na + nd + nr;
		
		float pa = na / total * 100;
		float pd = nd / total * 100;
		float pr = nr / total * 100;
		
		System.out.println("\n=======RESULTADOS=======");
        System.out.println("Porcentaje de aprobados....: " + df.format(pa) + "%");
        System.out.println("Porcentaje de desaprobados.: " + df.format(pd) + "%");
		System.out.println("Porcentaje de retirados....: " + df.format(pr) + "%");

	}

}
