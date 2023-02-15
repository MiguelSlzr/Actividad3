package Bloque3;

public class MyStack {
	char[] stack = new char[10];
	char[] reversed = new char[10];
	int top = -1;
	int MAX = stack.length-1;
	char poppedLetter;
	int i=0;
	
	public void push(char letra) {
		if(top == stack.length-1) {
			System.out.println("Stack is full");
		}
		else {
			top = top+1;
			stack[top] = letra;  
		}
	}
	

	public char pop() { 
		top = MAX;
		if(top == 0) {
			System.out.println("Stack is empty");
			return ('#'); 
		}
		else { 
			poppedLetter = stack[top];
			stack[top] = ' ';
			MAX = MAX-1; 
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
				
				for(int j = 0; j <= splitString.length - 1; j++){
					palabra = palabra + splitString[i];
					i++;
				}
				//System.out.println(palabra);

				for(i = 0; i <= palabra.length()-1; i++){
					push(palabra.charAt(i));
				}
				System.out.println(stack);
				
				reverse(palabra);
				System.out.println(reversed);
				
				if(palabra.equals(reversed)) {
					respuesta = true;
				}
				else {
					respuesta = false;
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