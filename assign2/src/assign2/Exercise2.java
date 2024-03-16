package assign2;

// ** Code for queue array implementation copied and modified from CPSC 331 slides **

public class Exercise2 {

	public static void main(String[] args) {
		
		
		// 1. -----------------------------------------------
		System.out.println("Step-1:");
		int capacity = 9;
		Queue initialQueue = new Queue(capacity);

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
		
		Queue reversedQueue = initialQueue.reverseQueue();
		reversedQueue.printQueue();
		
		// 2. -----------------------------------------------
		System.out.println("Step-2:");
		
		System.out.print("Updated Queue - ");
		reversedQueue.printQueue();

		Queue updatedQueue = reversedQueue.queueDivision();
		System.out.print("Updated Queue (after division) - ");
		updatedQueue.printQueue();
		
		// 3. -----------------------------------------------
		System.out.println("Step-3:");
		
		System.out.print("Updated Queue (after division) - ");
		updatedQueue.printQueue();
		
		System.out.print("Updated Queue (after sorting) - ");
		Queue sortedQueue = updatedQueue.queueSort();
		sortedQueue.printQueue();
	}
	
} // End class Exercise 2











