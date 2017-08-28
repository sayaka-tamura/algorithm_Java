/*
The New Button: the New button creates a new stack with no items

The Push Button : you’ll be prompted to enter the key value of the item to be pushed. 
   After you type the value into the text field, a few more presses will insert the item on the top of the stack. 
   A red arrow always points to the top of the stack—that is, the last item inserted. 
   
   during the insertion process, 
      1. one step (button press) increments (moves up) the Top arrow
      2. the next step actually inserts the data item into the cell. 

The Pop Button: To remove a data item from the top of the stack
      1. The item is removed from the cell pointed to by Top
      2. Top is decremented to point to the highest occupied cell
      
      After you’ve popped the last item off the stack, 
      the Top arrow points to –1, below the lowest cell. 
      This position indicates that the stack is empty. 
      If the stack is empty and you try to pop an item, 
      you’ll get the Can’t pop: stack is empty message.
      
The Peek Button: To read the value from the top of the stack without removing it
   By pushing the Peek button a few times, 
   you’ll see the value of the item at Top copied to the Number text field
*/

/*
Result:
 Stack: 20 
 Stack: 20 40 
 Stack: 20 40 60 
 Stack: 20 40 60 80 
 80 60 40 20 
 Stack: 
*/

class StackX
{
   private int maxSize; //size of stack array // If it had been implemented using a linked list, 
                                              // for example, the size specification would be unnecessary
   private long[] stackArray;
   private int top; //top of stack
   
   //---------------------------------------------------------------
   
   public StackX(int s) //constructor
   {
      maxSize = s; //set array size
      stackArray = new long[maxSize]; //create array
      top = -1; //no item yet
   }
   //---------------------------------------------------------------
   
   public void push(long j) //put item on top of stack
   {
      //For overflow
      if(top == maxSize-1)
         System.out.println("Error: stack overfllow");
      
      stackArray[++top]=j; //increment top, insert item
   }
   //---------------------------------------------------------------
   
   public long pop() //take item from top of stack
   {
      //For nothing in the stack
      if(top == -1)
      {System.out.println("Error: No elements on top");}  

      return stackArray[top--]; //access item, decrement top
   }
   //---------------------------------------------------------------

   public long peek() //peek at top of stack
   {
      return stackArray[top];
   }
   //---------------------------------------------------------------

   public boolean isEmpty() //true if stack is empty
   {
      return (top == -1);
   }
   //---------------------------------------------------------------
   public boolean isFull()
   {
      return(top == maxSize-1);
   }
   //---------------------------------------------------------------
   
   public void display()
   {
      System.out.print("Stack: ");
      for(int i=0;i<=top;i++)
         System.out.print(stackArray[i]+" ");
      System.out.println("");
   }
   
} //end class StackX

class StackApp
{
   public static void main(String[] args)
   {
      StackX theStack = new StackX(10); //make new stack
      theStack.push(20); //push items onto stack
         theStack.display();
      theStack.push(40);
         theStack.display();
      theStack.push(60);
         theStack.display();
      theStack.push(80);
         theStack.display();
      
      while(!theStack.isEmpty()) //untill it's empty,
      {                          //delete item from stack
         long value = theStack.pop();
         System.out.print(value); //display it
         System.out.print(" ");
      } //end while
      
      System.out.println("");
      
      theStack.display();
   }   //end main
}  //end class StackApp
