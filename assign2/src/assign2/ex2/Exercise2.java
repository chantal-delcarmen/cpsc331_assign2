package assign2.ex2;

import assign2.IntQueue;


public class Exercise2 {

	public static void main(String[] args) {
		
		
		// 1. -----------------------------------------------
		System.out.println("Step-1:");
		int maxSize = 9;
		IntQueue initialQueue = new IntQueue(maxSize);

		// Add numbers to the queue
		System.out.print("Initial Queue - ");
		initialQueue.enqueue(3);
		initialQueue.enqueue(15);
		initialQueue.enqueue(0);
		initialQueue.enqueue(18);
		initialQueue.enqueue(4);
		initialQueue.enqueue(10);
		initialQueue.enqueue(2);
		initialQueue.enqueue(5);
		initialQueue.enqueue(25);

		initialQueue.printQueue();
		
		System.out.print("Updated Queue - ");
		
		IntQueue reversedQueue = initialQueue.reverseQueue();
		reversedQueue.printQueue();
		
		// 2. -----------------------------------------------
		System.out.println("Step-2:");
		
		System.out.print("Updated Queue - ");
		reversedQueue.printQueue();

		IntQueue updatedQueue = reversedQueue.queueDivision();
		System.out.print("Updated Queue (after division) - ");
		updatedQueue.printQueue();
		
		// 3. -----------------------------------------------
		System.out.println("Step-3:");
		
		System.out.print("Updated Queue (after division) - ");
		updatedQueue.printQueue();
		
		System.out.print("Updated Queue (after sorting) - ");
		IntQueue sortedQueue = updatedQueue.queueSort();
		sortedQueue.printQueue();
	}
	
} // End class Exercise 2











