package Bloque3;
import java.util.Scanner;

public class Arreglos {
	Scanner scan = new Scanner(System.in);
	
	
	public String imprimirArreglo() {
		
		String nombres[];
		nombres = new String[20];
		
		nombres[0] = "Francisco";
		
		int i;
		for(i = 0; i <= nombres.length-1; i++) {
			System.out.println(nombres[i]);
		}
		return (nombres[i-1]);
	}
	
	
	
	public String buscarValor() {
		System.out.println("Introduzca un número a buscar:");
		String answer = "";
		int enteros[];
		enteros = new int[15];
		enteros[9] = 5;
		int search = scan.nextInt();
		int bandera = 1;
		
		for(int i = 0; i <= enteros.length-1; i++ ) {
			if (search == enteros[i]) {
				answer = "El número escogido se encuentra en la posición " +i;
				bandera = 1;
				break;
			}
			else {
				bandera = 0;
			}
			
		}
		if (bandera == 0) {
			answer = "El número no se encontró";
		}
		

		
		return(answer);
	}
	
	public int borrarValor() {
		System.out.println("Introduzca un número a buscar:");
		int i;
		int j;
		int delete = scan.nextInt();
		//String answer = "";
		int enteros[];
		int bandera = 1;
		enteros = new int[15];
		enteros[9] = 5;
		for( i = 0; i <= enteros.length-1; i++ ) {
			if (delete == enteros[i]) {
				
				for ( j = i; j <= enteros.length; j++) {
					enteros[j] = enteros[j+1];
				}
				bandera = 1;
				break;
			}

			else {
				bandera = 0;
			}
		}
		if (bandera == 0) {
			System.out.println("El número no se encontró");
		}
		return(enteros[i-1]);

	}
	
	
	
			
}
