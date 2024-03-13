package assign2;

import java.util.HashSet;
import java.util.Set;

public class Queue {
	private int[] queue;
	private int front;
	private int rear;
	private int maxSize;
	private int size;
	

	public Queue(int maxSize) {
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
	
	public int size() {
		return size;
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
			System.out.println("Queue is empty! There is nothing to dequeue.");
			return -1;
		}
		int item = queue[front];
		front = (front + 1) % maxSize;
		size--;
		return item;
		
	}
	
    public void printQueue() {    	
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
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
    
    public Queue queueDivision() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return this;
        }
        
        Queue updatedQueue = new Queue(maxSize);
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
    
//    public boolean contains(int value) {
//    	int index = 0;
//    	
//    	for(int i = 0; i < size; i++) {
//    		index = (front + i) % maxSize;
//    		
//    		if(queue[index] == value) {
//    			return true;
//    		}
//    	}
//		return false;    	
//    }
    
    public Queue queueSort() {
    	if(isEmpty()) {
    		System.out.println("Queue is empty");
    	} 
    	
    	Queue sortedQueue = new Queue(maxSize);
    	Set<Integer> uniqueValues = new HashSet<>();
    	int[] tempArray = new int[maxSize];
    	int value = 0;
    	int temp = 0;
    	int current = dequeue();
    	
    	for(int i = 0; i < size; i++) {
    		value = dequeue();
    		tempArray[i] = value;
    		uniqueValues.add(value);    		
    	}
    	
    	// Bubble sort
    	for(int i = 0; i < (size - 1); i++) {
    		for(int j = 0; j < (size - 1); j++) {
    			if(tempArray[j] > tempArray[j+1]) {
    				temp = tempArray[j];
    				tempArray[j] = tempArray[j++];
    				tempArray[j++] = temp;
    			}
    		}
    	}
    	for(int number : tempArray) {
    		if(uniqueValues.contains(number)) {
    			sortedQueue.enqueue(number);
    			uniqueValues.remove(number);
    		}
    	}
    	
		return sortedQueue;    	
    }
	
} // End class Queue


























