package com.senati.eti;
// Importar librería para lectura de datos
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		// Crear una instancia para crear el objeto scanner
		Scanner sc = new Scanner(System.in);
		
		// Declarar y asignar un valor a la variable
		int n = 0;
		
		System.out.print("Ingrese número: ");
		n = sc.nextInt();
		
		System.out.println("\n======Valor Ingresado======");
		System.out.println("Número....: " + n);
	}

}
