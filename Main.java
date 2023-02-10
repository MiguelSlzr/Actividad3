package Actividad3;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Arreglos miArreglo = new Arreglos();
		
		
		Circulo miCirculo = new Circulo();
		
		Circulo[] arregloCirculos = new Circulo[100];
		
		
		System.out.println(miArreglo.imprimirArreglo());
			
		System.out.println(miArreglo.buscarValor());
		System.out.println("");
		System.out.println(miArreglo.borrarValor());
		
	}
	

}