package Ejercicios;

import java.util.Scanner;

import java.util.Scanner;

public class buscarNumero {

	public static void main(String[] args) {
		
Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del arreglo: ");
		int tamaño = leer.nextInt();
		
		int[] arreglo = new int[tamaño];
		
		System.out.println("Ingrese los numeros del arreglo: ");
		for(int i =0;i<tamaño;i++) {
			System.out.println("ingrese el " + (i+1) + "numero: ");
			arreglo[i] = leer.nextInt();
		}
		System.out.println("ingrese el  numero que desea buscar :");
		int numeroBuscar = leer.nextInt();
		
		boolean encontrado = estaEnArreglo(arreglo, numeroBuscar);
		
		if (encontrado) {
			System.out.println("El numero: " + numeroBuscar + "si esta ");
		}else {
			System.out.println("El numero: " + numeroBuscar + "no esta ");
		}
			
	

	}
	public static boolean estaEnArreglo(int[] arreglo, int numero) {
		for (int elemento : arreglo) {
			if (elemento == numero) {
				return true;
			}
		}
		return false;
	}
	

	}


