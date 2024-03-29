package Ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner leer = new Scanner(System.in);

		System.out.println("Digite un numero para la longitud de la serie Fibonacci: ");

		n = leer.nextInt();

		System.out.println("Serie de Fibonacci de longitud " + n + ":");

		for (int i = 0; i < n; i++) {
			System.out.print(calculateFibonacci(i) + " ");
		}
	}

	public static int calculateFibonacci(int num) {
		if (num <= 1) {
			return num;
		} else {
			return calculateFibonacci(num - 1) + calculateFibonacci(num - 2);
		}
	}

}
