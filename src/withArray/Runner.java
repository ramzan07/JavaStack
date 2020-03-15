package withArray;

public class Runner {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		//Dynamicstack stack = new Dynamicstack();
		//System.out.println("Empty : "+ stack.isEmpty());
		stack.push(5);
		stack.push(15);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		
		stack.pop();
		stack.pop();
		System.out.println("Peek "+stack.peek());
		//System.out.println("Removed "+ stack.pop());
		//System.out.println("Size "+ stack.size());
		stack.display();
	}
}
