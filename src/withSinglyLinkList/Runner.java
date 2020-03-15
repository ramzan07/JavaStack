package withSinglyLinkList;

public class Runner {
	public static void main(String[] args) 
    { 
        // create Object of Implementing class 
		StackWithSinglyLinkList obj = new StackWithSinglyLinkList(); 
        // insert Stack value 
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
  
        obj.display(); 
  
 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
   
        obj.pop(); 
        obj.pop(); 
  
        // pritn Stack elements 
        obj.display(); 
  
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
    } 
}
