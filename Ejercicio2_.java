package Objeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2_ {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int totalPuntos = 0;
	        
	        
	        System.out.println("Ingrese la cantidad de puntos que su equipo ha obtenido en cada juego de esta temporada.");
	        System.out.println("Ingrese -1 cuando haya terminado.");
	        //
	        
	        while (true) {
	        	
	            try {
	                System.out.print("Puntos obtenidos en el juego: ");
	                int puntos = scanner.nextInt();

	                if (puntos == -1) {
	                    break;
	                }

	                if (puntos < 0) {
	                    System.out.println("Por favor ingrese un número positivo o -1 para terminar.");
	                    continue;
	                }
	                
	                if(puntos >=0) {
	                	totalPuntos =totalPuntos+ puntos;


	                }
	                

	            } catch (InputMismatchException e) {
	            	
	                System.out.println("Por favor ingrese un número válido.");
	                scanner.next();  
	            }
	        }

	        System.out.println("El total de puntos obtenidos por el equipo en esta temporada es: " + totalPuntos);
	    }
	
	
		}
	


