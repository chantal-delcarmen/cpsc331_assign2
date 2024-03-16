package assign2;

import java.util.HashSet;
import java.util.Set;

public class IntQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int maxSize;
	private int size;
	

	public IntQueue(int maxSize) {
		front = 0;
		rear = -1;
		size = 0;
		this.maxSize = maxSize;
		queue = new int[maxSize];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}

	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is full!");
			return;
		}
		
		rear = (rear + 1) % maxSize;
		queue[rear] = item;
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			throw new NullPointerException();
		}
		
		int item = queue[front];
		front = (front + 1) % maxSize;
		size--;
		return item;
		
	}
	
    public void printQueue() {  	
		if(isEmpty()) {
			System.out.println("Queue is empty");
			throw new NullPointerException();
		}
		
        
        // Create StringBuilder to append to
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        int count = size;
        int current = front;
        
        while (count > 0) {
            sb.append(queue[current]).append(",");
            current = (current + 1) % maxSize;
            count--;
        }
        
        // Remove the last ", " by reducing the length by 1
        sb.setLength(sb.length() - 1);
        
        sb.append("]");

        // Print the string
        System.out.println(sb.toString());
    }
    
    public void printQueueDashed() {  	
		if(isEmpty()) {
			System.out.println("Queue is empty");
			throw new NullPointerException();
		}
		
        
        // Create StringBuilder to append to
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        int count = size;
        int current = front;
        
        while (count > 0) {
            sb.append(queue[current]).append("-");
            current = (current + 1) % maxSize;
            count--;
        }
        
        // Remove the last ", " by reducing the length by 1
        sb.setLength(sb.length() - 1);
        
        sb.append("]");

        // Print the string
        System.out.println(sb.toString());
    }
    
    public IntQueue queueDivision() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            throw new NullPointerException();
        }
        
        IntQueue updatedQueue = new IntQueue(maxSize);
        int current = dequeue();
        int next;
        int result;
        
        while(!isEmpty()) {
        	next = dequeue();
        	
        	if(current == 0 || next == 0) {
        		result = 0;
        		updatedQueue.enqueue(result);
        	} else if (current >= next) {
        	    // Greater than
        		result = current / next;
        		updatedQueue.enqueue(result);
        	} else {
        	    // Less than
        		result = next / current;
        		updatedQueue.enqueue(result);
        	}
    		current = next;
        }
        
        updatedQueue.enqueue(current);
		return updatedQueue;
    }
    
    public IntQueue queueSort() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			throw new NullPointerException();
		}
		 
    	
    	IntQueue sortedQueue = new IntQueue(maxSize);
    	Set<Integer> uniqueSet = new HashSet<>();
    	int[] tempArray = new int[maxSize];
    	int value;
    	int current;
    	
    	for(int i : queue) {
    		value = dequeue();
    		tempArray[i] = value;
    		uniqueSet.add(value);    		
    	}
    	
	    for (int i : tempArray) {
	        current = tempArray[i];	        
	        int j = i - 1;
	        
	        while (j >= 0 && tempArray[j] > current) {
	        	tempArray[j + 1] = tempArray[j];
	            j--;
	        }
	        tempArray[j + 1] = current;
	    }
    	
    	for(int number : tempArray) {
    		if(uniqueSet.contains(number)) {
    			sortedQueue.enqueue(number);
    			uniqueSet.remove(number);
    		}
    	}
    	
		return sortedQueue;    	
    }
    
	public IntQueue reverseQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			throw new NullPointerException();
		}
		
		IntStack stack = new IntStack(size);
		IntQueue revQueue = new IntQueue(size);
		
		for(int element : queue) {
			element = dequeue();
			stack.push(element);
		}
		
		while(!stack.isEmpty()) {
			revQueue.enqueue(stack.pop());
		}
		
		return revQueue;
	}
	
} // End class IntQueue