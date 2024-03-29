package Ejercicios;

public class EjerciciosClase {

	public static void main(String[] args) {
		
		//1
		
		int a = 5, b = 10;
		
		//2
		
		//int mult, suma, resta, div;
		
		System.out.println("Multiplicacion: " + (a*b));
		System.out.println("Suma: " + (a+b));
		System.out.println("Resta: " + (a-b));
		System.out.println("Division: " + (a/b));
		
		//3
		
		a++;
		b--;
		
		//4
		
		a = a+2;
		b = b*3;
		
		//5
		
		if (a == b) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferentes");
		}if (a > b) {
			System.out.println(a + "es mayor que " + b);
		}else {
			System.out.println(a + "es menor que " + b);
		}
	}

}
