/*
   authour:Sayaka Tamura
   
   result:
   Stack: {20} 
   Stack: {40} {20} 
   Stack: {60} {40} {20} 
   Now, The top is {60}  
   Stack: {80} {60} {40} {20} 
   Now, Popped {80}  Now, Popped {60}  Now, Popped {40}  Now, Popped {20}  
   Stack: 

*/
public class StackAppLL
{
   private static class Node
   {
      private int data;
      private Node next;
         
      public Node(int d) //constructor
      {
         data = d; 
         next = null; //no item yet
      }
      
      public void displayNode() // display ourself
      {
         System.out.print("{" + data + "} ");
      }
   
      //---------------------------------------------------------------
   } //end class Node
   
   private static class NodeLinkedList
   {
      private Node head;
      
      public NodeLinkedList()
      {
         head = null;
      }
      
      //---------------------------------------------------------
      public void push(int d) //put item on top of stack
      {  
         Node newNode = new Node(d);
        // if(head != null)
            newNode.next = head;    
         head = newNode;
      }
      
      //---------------------------------------------------------------
      
      public void pop() //take item from top of stack
      {         
         if(head != null)
         {  
            System.out.print("Now, Popped "); 
            head.displayNode();
            head = head.next;
         }
         else
         {
            System.out.println("No item in stack");
         }
      }
      
      //---------------------------------------------------------------
      public void peek() //peek at top of stack
      {  
         System.out.print("Now, The top is ");  
         head.displayNode();
         System.out.println(" ");
      }
      //---------------------------------------------------------------
   
      public boolean isEmpty() //true if stack is empty
      {
         return (head == null);
      }
      
      //---------------------------------------------------------------
      public boolean isFull() //true if stack is empty
      {
         return false;
      }
      //---------------------------------------------------------------
      
      public void display()
      {  
         Node current = head; // start at beginning of list
         System.out.print("Stack: ");
         
         while(current != null) // until end of list
         {
            current.displayNode(); // print data
            current = current.next; // move to next link
         }
         System.out.println("");
      }   
   } //end class NodeLinkedList
   

   public static void main(String[] args)
   {
      NodeLinkedList theNLinkedList = new NodeLinkedList(); //make Linked list stack
      
      theNLinkedList.push(20); //push items onto stack
         theNLinkedList.display();
      theNLinkedList.push(40);
         theNLinkedList.display();
      theNLinkedList.push(60);
         theNLinkedList.display();
      
      theNLinkedList.peek();
      
      theNLinkedList.push(80);
         theNLinkedList.display();
      
      while(!theNLinkedList.isEmpty()) //untill it's empty,
      {                          //delete item from stack
         theNLinkedList.pop();
         System.out.print(" ");
      } //end while
      
      System.out.println("");
      theNLinkedList.display();
   }   //end main
}  //end class StackApp
