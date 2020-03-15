package withSinglyLinkList;

public class StackWithSinglyLinkList {

	Node top; 

	StackWithSinglyLinkList() 
    { 
        top = null; 
    } 
  
    public void push(int x) // insert at the beginning 
    { 
        Node temp = new Node(x, null); 
        temp.next = top;
        top = temp;
    } 
  
    public boolean isEmpty() 
    { 
        return top == null; 
    } 
  
    public int peek()
    { 
        if (!isEmpty()) { 
            return top.data; 
        } 
        else {
            System.out.println("Stack is empty"); 
            return -1; 
        } 
    } 
  
    public void pop() // remove at the beginning 
    { 
        if (top == null) { 
            System.out.print("\nStack Underflow"); 
            return; 
        } 

        top = top.next;
    } 
  
    public void display() 
    { 
        // check for stack underflow 
        if (top == null) { 
            System.out.printf("\nStack Underflow"); 
            return; 
        } 
        else { 
            Node temp = top; 
            while (temp != null) { 
  
                // print node data 
                System.out.printf("%d<-", temp.data); 
  
                // assign temp link to temp 
                temp = temp.next; 
            } 
        } 
    }
}
