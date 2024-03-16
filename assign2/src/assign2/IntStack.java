package assign2;

import java.util.HashSet;
import java.util.Set;

public class IntStack {
	private int[] stack;
	private int top;
	private int maxSize;
	private int size;
	
	public IntStack() {
	}
	
	public IntStack(int maxSize) {
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

	
	public IntStack reverseStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			throw new NullPointerException();
		}

		IntQueue tempQueue = new IntQueue(maxSize);
		IntStack revStack = new IntStack(maxSize);
		
		for(int element : stack) {
			element = pop();
			tempQueue.enqueue(element);
		}
		
		int value;
		
		while(!tempQueue.isEmpty()) {
			value = tempQueue.dequeue();
			revStack.push(value);
		}
		
		return revStack;
	}

	public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }		

        // Create StringBuilder to append to
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        int count = size;
        int current = getBottomIndex();
        
        for (int i = 0; i < size; i++) {
            sb.append(stack[current]).append("-");
            current = (current + 1) % maxSize;
            count--;
        }
        
        // Remove the last ", " by reducing the length by 1
        sb.setLength(sb.length() - 1);
        sb.append("]");

        // Print the string
        System.out.println(sb.toString());
	}

	private int getBottomIndex() {
		return top - size + 1;
	}
	
	public IntQueue stackIterator() {
		Set<Integer> uniqueSet = new HashSet<>();
		IntQueue uniqueQueue = new IntQueue(maxSize);
		
        int count = size;
		int bottom = getBottomIndex();
        for (int i = bottom; i < size; i++) {
        	int value = stack[i];
        	
        	if(!uniqueSet.contains(value)) {
        		uniqueSet.add(value);
        		uniqueQueue.enqueue(value);
        	}
        }
        return uniqueQueue;
	}
    
} // End class Stack












