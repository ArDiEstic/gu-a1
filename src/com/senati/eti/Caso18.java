package com.senati.eti;

import java.util.Scanner;
public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese base del tri�ngulo: ");
		float base = sc.nextInt();
		
		System.out.print("Ingrese altura del tri�ngulo: ");
		float altura = sc.nextInt();
		
		float area = (base * altura) / 2;
		
		System.out.println("\n==========Resultado==========");
		System.out.println("�rea del tri�ngulo: " + area);
		

	}

}
