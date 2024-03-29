package Ejercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingrese el primer número:");
	        double num1 = scanner.nextDouble();
	        
	        System.out.println("Ingrese el segundo número:");
	        double num2 = scanner.nextDouble();
	        
	        double resultadoSuma = sumar(num1, num2);
	        double resultadoResta = restar(num1, num2);
	        double resultadoMultiplicacion = multiplicar(num1, num2);
	        
	        System.out.println("Resultado de la suma: " + resultadoSuma);
	        System.out.println("Resultado de la resta: " + resultadoResta);
	        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
	    }
	    
	    public static double sumar(double num1, double num2) {
	        return num1 + num2;
	    }
	    
	    public static double restar(double num1, double num2) {
	        return num1 - num2;
	    }
	    
	    public static double multiplicar(double num1, double num2) {
	        return num1 * num2;
	    }


	}


