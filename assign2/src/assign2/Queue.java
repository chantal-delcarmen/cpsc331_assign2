package assign2;

//** Code for queue array implementation copied and modified from CPSC 331 slides **

public class Queue<T> {
	private T[] queue;
	private int front;
	private int rear;
	private int maxSize;
	private int size;
	

	@SuppressWarnings("unchecked")
	public Queue(int maxSize) {
		front = 0;
		rear = -1;
		size = 0;
		this.maxSize = maxSize;
		queue = (T[]) new Object[maxSize];	
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}

	
	public void enqueue(T element) {
		if(isFull()) {
			System.out.println("Queue is full!");
			return;
		}
		
		rear = (rear + 1) % maxSize;
		queue[rear] = element;
		size++;
	}
	
	public T dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			throw new NullPointerException();
		}
		
		T item = queue[front];
		front = (front + 1) % maxSize;
		size--;
		return item;
		
	}
	
} // End class Queue


























