package withDoublyLinkList;

public class Runner {
	public static void main(String[] args) 
    { 
        // create Object of Implementing class 
		StackWithDoublyLinkList obj = new StackWithDoublyLinkList(); 
        // insert Stack value 
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
  
        obj.display(); 
  
 
		
        System.out.printf("\nTop element is %d\n", obj.peek());
		  
        obj.pop();
        obj.pop();
		obj.display();

		  
    }
}
