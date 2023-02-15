package Bloque3;

public class MyStack {
	char[] stack = new char[10];
	char[] reversed = new char[10];
	int top = 0;
	int MAX = stack.length;
	char poppedLetter;
	int i=0;
	
	public void push(char letra) {
		if(top == stack.length) {
			System.out.println("Stack is full");
		}
		else {
			
			stack[top] = letra;  
			top = top+1;
		}
	}
	

	public char pop() { 

		if(top == 0) {
			System.out.println("Stack is empty");
			return ('#'); 
		}
		else { 
			top = top-1; 
			poppedLetter = stack[top];
			stack[top] = ' ';
			return (poppedLetter);  
		}
	
	}
	
	public void reverse (String cadena) {
		
		for(i = 0; i <= cadena.length()-1; i++){
				push(cadena.charAt(i));
			}
		
		for(i = 0; i <= cadena.length()-1; i++){
			reversed[i] = stack[cadena.length()-1-i];
		}
		
		
}

	public boolean revisarPalindromo(String cadena) {
	 	cadena = cadena.toLowerCase();
	 	String palabra = "";
		boolean respuesta;
		
			if(cadena.contains(" ")) {
				int i = 0;	
				String[] splitString = cadena.split(" ");
				
				for(i = 0; i <= splitString.length - 1; i++){
					palabra = palabra + splitString[i];
				}
				System.out.println(palabra);

				for(i = 0; i <= palabra.length()-1; i++){
					push(palabra.charAt(i));
				}
				
				System.out.println(stack);
				
				reverse(palabra);
				System.out.println(reversed);
				
				if(stack == reversed) {
					System.out.println("sí es");
					respuesta = true;
				}
				else {
					respuesta = false;
					System.out.println("no es");
				}
			}
			
			else{
				for(i = 0; i <= cadena.length()-1; i++){
					push(cadena.charAt(i));
				}
				
				for(i = 0; i <= cadena.length()-1; i++){
					reversed[i] = stack[cadena.length()-1-i];
				}
				
				if(cadena.equals(reversed)) {
					respuesta = true;
				}
				else {
					respuesta = false;
				}
			}
			
		return(respuesta);
 }

	
	
}