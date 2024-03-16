package assign2;

// ** Code for queue array implementation copied and modified from CPSC 331 slides **

public class Exercise3 {

	public static void main(String[] args) {
		
		int capacity = 12;
		Stack inputStack = new Stack(capacity);
		
		// 1. -----------------------------------------------

		// Add numbers to the stack
		System.out.print("Input Stack: ");
		inputStack.push(2);
		inputStack.push(9);
		inputStack.push(3);
		inputStack.push(1);
		inputStack.push(8);
		inputStack.push(9);
		inputStack.push(0);
		inputStack.push(7);
		inputStack.push(8);
		inputStack.push(4);
		inputStack.push(5);
		inputStack.push(3);		
		inputStack.printStack();

	}
	
} // End class Exercise 2
