package com.senati.eti;

import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println("\n=======RESULTADOS=======");
        System.out.println("Alumno: " + nombre + " " + apellido);


	}

}
