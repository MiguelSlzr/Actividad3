package Bloque3;

public class MyQueue {
	char[] queue = {'a','b','c','d'};
	int MAX = queue.length;
	int tail = queue.length + 1;
	int head = 0;
	
	public char delete() {
		if (tail == 0) {
			System.out.println("Queue is empty");
			return('#');
		}
		else {
			for(int i = 0; i < 3; i++) {
				queue[i] = queue[i+1];
			}
			System.out.println(queue);
			
			return(queue[head]);
		}
		
	}
}
