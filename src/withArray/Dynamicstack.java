package withArray;

public class Dynamicstack {
	int top = 0;
	int capacity = 2;
	int stack[] = new int[capacity];
	
	public void push(int data) {
		if(size() == capacity) {
			expand();
		}
		stack[top] = data;
		top++;
	}

	private void expand() {
		
		int newStack[] = new int[capacity*2];
		for(int i=0; i<stack.length; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
		capacity *=2;
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			int data;
			top --;
			data = stack[top];
			stack[top] = 0;
			return data;
		}
	}

	public int peek() {
		int data;
		data = stack[top-1];
		return data;
	}

	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public void display() {

		for(int n: stack) {
			System.out.println(n+ " ");
		}
	}
}
