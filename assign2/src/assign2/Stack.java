package assign2;

//** Code copied and modified from CPSC 331 slides **

public class Stack<T> {
	private T[] stack;
	private int top;
	private int maxSize;
	private int size;
	private int defaultMaxSize = 20;
	
	@SuppressWarnings("unchecked")
	public Stack() {
		// Cast object to an array of <T> to create the stack
		stack = (T[]) new Object[defaultMaxSize];	
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

	public int getSize() {
		return size;
	}
    
} // End class Stack


