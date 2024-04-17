package Ejercicios;

	import java.util.Random;
	import java.util.Scanner;

	public class MultDiagonales {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el tamano de la matriz cuadrada: ");
	        int n = scanner.nextInt();
	        int[][] matriz = new int[n][n];

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                matriz[i][j] = (int) (Math.random() * 10) + 1;
	            }
	        }

	        System.out.println("Matriz generada:");
	        imprimirMatriz(matriz);

	    }

	    public static void imprimirMatriz(int[][] matriz) {
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("Multiplicacion diagonal 1:");
	        multprincipal(matriz);
	        System.out.println("Multiplicacion diagonal 2:");
	        multsegund(matriz);
	    }
	    public static void multprincipal(int[][] matriz){
	        int mult1 =1; 
	        for (int i=0;i<matriz.length;i++){
	           
	            mult1 *= matriz[i][i];
	            System.out.println(mult1);
	        }
	    }
	    public static void multsegund(int[][] matriz){
	        int mult2=1;
	        int n = matriz.length;
	        for (int i=0;i<n;i++){
	            
	             mult2 *= matriz[i][n - 1 -i];
	            System.out.println(mult2);
	        }
	    }

	}
		

	


