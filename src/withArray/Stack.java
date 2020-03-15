package withArray;

public class Stack {
	int top = -1;
	int[] stack = new int[5];
	
	public void push(int data) {
		if(top == 5) {
			System.out.println("Stack is full");
		}else {
			stack[++top] = data;
		}
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			int data;
			data = stack[top];
			stack[top] = 0;
			top--;
			return data;
		}
	}

	public int peek() {
		int data;
		data = stack[top];
		return data;
	}

	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<0;
	}
	public void display() {

		for(int n: stack) {
			System.out.println(n+ " ");
		}
	}
}
