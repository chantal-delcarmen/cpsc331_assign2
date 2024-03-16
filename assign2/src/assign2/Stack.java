package assign2;


public class Stack {
	private int[] stack;
	private int top;
	private int maxSize;
	private int size;
	
	public Stack() {
	}
	
	public Stack(int maxSize) {
		top = -1;
		this.maxSize = maxSize;
		stack = new int[maxSize];		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == (maxSize - 1);
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		size++;
		stack[top] = item;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Cannot pop from an empty stack");
			return -1;
		}
		int temp = stack[top];
		stack[top] = -1;
		top--;
		size--;
		return temp;
	}

	
	public Stack reverseStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			throw new NullPointerException();
		}

		Queue tempQueue = new Queue(maxSize);
		Stack revStack = new Stack(maxSize);
		
		for(int element : stack) {
			element = pop();
			tempQueue.enqueue(element);
		}
		
		while(!tempQueue.isEmpty()) {
			revStack.push(tempQueue.dequeue());
		}
		
		return revStack;
	}
	
//    public void printStack() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty.");
//            return;
//        }
//        System.out.print("Stack: ");
//        for (int i = top; i >= 0; i--) {
//            System.out.print(stack[i] + " ");
//        }
//        System.out.println();
//    }

	public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }		
        
        // Create StringBuilder to append to
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        int count = size;
        int current = top;
        
        System.out.println("Count:" + count);
        
        while (count > 0) {
            sb.append(stack[current]).append(",");
            current = (current + 1) % maxSize;
            count--;
            System.out.println("Count:" + count);

        }
        
        // Remove the last ", " by reducing the length by 1
        sb.setLength(sb.length() - 1);
        
        sb.append("]");

        // Print the string
        System.out.println(sb.toString());
	}
    
}
