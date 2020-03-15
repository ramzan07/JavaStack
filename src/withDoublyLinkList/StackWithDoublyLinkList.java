package withDoublyLinkList;


public class StackWithDoublyLinkList {

	Node top; 
	Node tail;

	StackWithDoublyLinkList() 
    { 
        this.top = null; 
    } 
  
    public void push(int x) // insert at the beginning 
    { 
    	Node temp = new Node(x);
    	if(top == null) {
    		top  = temp;
    		tail = temp;
    	} else {
    		temp.next = top;
    		top.prev = temp;
    		top = temp;
    	}
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

        //top = top.next;
        Node node = top;
		top = top.next;
		top.prev = null;
		node = null; // just to nullify old head (Even ok without this )
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
