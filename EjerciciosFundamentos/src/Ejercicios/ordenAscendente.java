package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ordenAscendente {

	public static void main(String[] args) {
		
			
			Scanner leer = new Scanner(System.in);
			
			System.out.println("Ingrese la cantidad de numeros: ");
			int cantidadN = leer.nextInt();
			
			int[] numeros = new int[cantidadN];
			
			for (int i=0; i<cantidadN;i++) {
				System.out.println("Ingrese el numero: " + (i+1) + ":");
				numeros[i] = leer.nextInt();
			}
			ordenarN(numeros);
			
			System.out.println("Numeros ordenados :");
			for (int i=0;i<numeros.length;i++) {
				System.out.println(numeros[i]);
			}
		}
		
		public static void ordenarN(int[] arreglo) {
			Arrays.sort(arreglo);
		}

}
