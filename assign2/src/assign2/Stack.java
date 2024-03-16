package assign2;

import java.util.HashSet;
import java.util.Set;

public class Stack<T> {
	private T[] stack;
	private int top;
	private int maxSize;
	private int size;
	
	public Stack() {
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int maxSize) {
		top = -1;
		this.maxSize = maxSize;
		
		// Cast object to an array of <T> to create the stack
		stack = (T[]) new Object[maxSize];		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == (maxSize - 1);
	}
	
	public void push(T item) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		size++;
		stack[top] = item;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Cannot pop from an empty stack");
			throw new NullPointerException();
		}
		T item = stack[top];
		top--;
		size--;
		return item;
	}

	
	public Stack<T> reverseStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			throw new NullPointerException();
		}

		Queue tempQueue = new Queue(maxSize);
		Stack<T> revStack = new Stack<T>(maxSize);
		
		for(T element : stack) {
			element = pop();
			tempQueue.enqueue(element);
		}
		
		T value;
		
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
	
	public Queue stackIterator() {
		Set<T> uniqueSet = new HashSet<T>();
		Queue uniqueQueue = new Queue(maxSize);
		
        int count = size;
		int bottom = getBottomIndex();
        for (int i = bottom; i < size; i++) {
        	T value = stack[i];
        	
        	if(!uniqueSet.contains(value)) {
        		uniqueSet.add(value);
        		uniqueQueue.enqueue(value);
        	}
        }
        return uniqueQueue;
	}
    
} // End class Stack


