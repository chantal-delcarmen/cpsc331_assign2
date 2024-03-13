package assign2;


public class Stack {
	private int[] stack;
	private int top;
	private int maxSize;
	
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
		return temp;
	}
	
	public Queue reverseQueue(Queue queue) {
		Stack stack = new Stack(queue.size());
		
		while(!queue.isEmpty()) {
			stack.push(queue.dequeue());
		}
		
		while(!stack.isEmpty()) {
			queue.enqueue(stack.pop());
		}
		
		return queue;
	}
	
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    
//	public static void main(String[] args) {
//		Stack stack = new Stack(9);
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		
//		stack.printStack();
//		
//		stack.pop();
//		stack.pop();
//		stack.pop();
//
//		stack.printStack();
//
//	}
}
