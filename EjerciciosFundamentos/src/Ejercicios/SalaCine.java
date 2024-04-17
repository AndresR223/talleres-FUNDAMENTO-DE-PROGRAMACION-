package Ejercicios;

	
		import java.util.Scanner;
		public class SalaCine {
		static int ocupado =0;
		static int desocupado = 1;
		static int filas =8;
		static int columnas = 8;
		int [][] sillas = new int [filas][columnas];
		 public static void mostrardisponibilidadsala(){
		     System.out.println("la disponibilidad de la sala es:");
		     for( int i = 0; i < filas; i ++){
		          System.out.println ("d");
		         for( int j = 0; j < columnas; j++){
		             
		             System.out.print("d");
		         }
		     }
		     System.out.println("0");
		 }
		         public void asientosReservados (int Numfila, int Numasientos){
		             if (Numfila < columnas && Numasientos <= filas){
		                 for (int j = 0; j < sillas.length; j ++ ){
		                     for (int i = 0; i < sillas [columnas].length; j ++){
		                           System.out.print ("coloca e numero de sillas o columnas:");
		                           sillas [Numfila][Numasientos]= ocupado;
		                           
		                     }
		                 }
		            }else{
		                 System.out.print ("asientos no reservados");
		             }
		         }
		         public void cancelarReserva ( int Fila, int Columna){
		             if ( Fila < 0 || Fila >= filas || Columna < 0 || Columna >= columnas){
		                
		                  System.out.print ("ERROR");
		          }else{
		                 if ( sillas [Fila][Columna] == ocupado){
		                     sillas [Fila][Columna] = desocupado;
		                 System.out.println ("reserva cancelada en la fila" + Fila + "y columna" + Columna);
		           }else{
		                      System.out.println ("el asiento en la fila" + Fila + "y columna" + Columna + "no esta reservado");
		                 }
		             }
		         } 
		    public static void main(String[] args) {
		        mostrardisponibilidadsala();
		    }

	}
	

