package assign2;

// ** Code for queue array implementation copied and modified from CPSC 331 slides **

public class Exercise3 {

	public static void main(String[] args) {
		
		Queue initialQueue = new Queue(9);
		
		// 1. -----------------------------------------------
		System.out.println("\n-----------------------------------------------");
		System.out.println("Step-1:\n");
		
		// Add numbers to the queue
		System.out.print("Initial Queue - [");
		initialQueue.enqueue(3);
		initialQueue.enqueue(15);
		initialQueue.enqueue(0);
		initialQueue.enqueue(18);
		initialQueue.enqueue(4);
		initialQueue.enqueue(10);
		initialQueue.enqueue(2);
		initialQueue.enqueue(5);
		initialQueue.enqueue(25);
//		initialQueue.printChar(initialQueue);
		System.out.print("]\n");

	}
	
} // End class Exercise 2
