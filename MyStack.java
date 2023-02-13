package Bloque3;

public class MyStack {
	char[] stack = {'a','b','c','d'};
	int top;
	int MAX = stack.length;
	
	public char pop() { 
		System.out.println(stack);
		if(top == 0) {
			System.out.println("Stack is empty");
			return ('#'); 
		}
		else { 
			top --; /* decreases top */ 
			return (stack[top]); /*returns eliminated element*/ 
		}
	
	}
	
	
	

}
