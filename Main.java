package Bloque3;

public class Main {
	public static void main(String[] args) {

		String cadena = "uNA prueba";
		
		MyStack miStack = new MyStack();
		MyQueue miCola = new MyQueue();
		//System.out.println(miStack.pop());
		
		/*	
	
		miCola.insert('a');
		System.out.println(miCola.queue);
		System.out.println(miCola.delete());
		*/
		
		/*
		miStack.push('E');
		System.out.println(miStack.stack);
		miStack.push('D');
		System.out.println(miStack.stack);
		miStack.push('C');
		System.out.println(miStack.stack);
		miStack.push('B');
		System.out.println(miStack.stack);
		miStack.push('A');
		System.out.println(miStack.stack);
		
		
		
		System.out.println(miStack.pop());
		System.out.println(miStack.stack);
	
	*/
		miStack.reverse(cadena);
		System.out.println(miStack.reversed);	
			
		
		//miStack.revisarPalindromo(cadena);
			
		
	
	}


}