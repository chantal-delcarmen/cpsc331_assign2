package assign2;

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
    
    public void queueDivision() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        
        int current = queue[front];
        int next = queue[front+1];
        
//        while(current != rear) {
//        	int value = current - next;
//        	
//        	switch (true) {
//        		case (value < 0):
//                    System.out.println("Less than");
//        			break;
//        		case (value > 0):
//                    System.out.println("Greater than");
//        			break;
//        		default:      			
//                    System.out.println("Equal");
//            }
//        	        			
//        }
    }
	
} // End class Queue


























