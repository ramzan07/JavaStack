package withArrayList;
import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {
    /** ArrayList representation of the stack */
	ArrayList <Integer> stackList;

    /**
     * Constructor
     */
    StackUsingArrayList() {
        stackList = new ArrayList<Integer>();
    }

    /**
     * Adds value to the end of list which is the top for stack
     *
     * @param value
     *            value to be added
     */
    void push(int value) {
        stackList.add(value);
    }

    /**
     * Pops last element of list which is indeed the top for Stack
     *
     * @return Element popped
     */
     int pop() {

         if (!isEmpty()) { // checks for an empty Stack
              int popValue = stackList.get(stackList.size() - 1);
              stackList.remove(stackList.size() - 1); // removes the poped element             
              return popValue;
         } else {
              System.out.print("The stack is already empty  ");
              return -1;
         }
    }

     void display() {
    	 for(int n: stackList) {
    		 System.out.println(n);
    	 }
     }

    /**
     * Checks for empty Stack
     *
     * @return true if stack is empty
     */
     boolean isEmpty() {
          if (stackList.isEmpty()){
               return true;
          } else {
                return false;
          }
     }

    /**
     * Top element of stack
     *
     * @return top element of stack
     */
    int peek() {
         return stackList.get(stackList.size() - 1);
    }

    public static void main(String[] args) {
     StackUsingArrayList myStack = new StackUsingArrayList(); // Declare a stack of maximum size 4
         // Populate the stack
         myStack.push(5);
         myStack.push(8);
         myStack.push(2);
         myStack.push(9);

         System.out.println("*********************Stack ArrayList Implementation*********************");
         System.out.println(myStack.isEmpty()); // will print false
         System.out.println(myStack.peek()); // will print 9
         System.out.println(myStack.pop()); // will print 9
         System.out.println(myStack.peek()); // will print 2
         System.out.println(myStack.pop()); // will print 2
         
         System.out.println("Entire");
         myStack.display();
    }
}