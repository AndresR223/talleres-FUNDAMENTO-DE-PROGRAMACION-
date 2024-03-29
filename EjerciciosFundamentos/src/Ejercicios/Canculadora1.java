package Ejercicios;

import java.util.Scanner;

public class Canculadora1 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int opc, num1 = 0, num2 = 0, suma, resta, mult, div;

		System.out.println("Digite 1: para sumar, 2: restar, 3: multiplicar y 4: dividir");
		opc = leer.nextInt();

		if (opc >= 5) {
			System.out.println("Opcion no valida.");
		} else {
			System.out.println("Digite los numeros a operar: ");
			num1 = leer.nextInt();
			num2 = leer.nextInt();
		}
		if (opc == 1) {
			suma = num1 + num2;
			System.out.println("El resultado de la suma es: " + suma);
		} else {
			if (opc == 2) {
				resta = num1 - num2;
				System.out.println("El resultado de la resta es: " + resta);
			} else {
				if (opc == 3) {
					mult = num1 * num2;
					System.out.println("El resultado de la multiplicacion es: " + mult);
				}else {
					if (opc == 4) {
						div = num1/num2;
						System.out.println("El resultado de la division es: " + div);
					}
				}
			}
		}
	}

}
