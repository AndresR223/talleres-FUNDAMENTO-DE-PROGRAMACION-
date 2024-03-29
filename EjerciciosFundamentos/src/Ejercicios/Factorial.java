package Ejercicios;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
        Scanner leer = new Scanner (System.in);
		
		int num, i, factorial=1;
		
		System.out.print("Ingrese un numero");
		num = leer.nextInt();
		
		for (i=1; i<=num; i++) {
			factorial *= i;
		}
		System.out.print(factorial);
	}
		
	}


