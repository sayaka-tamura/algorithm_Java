//Reversing a Word
import java.io.*;

class StackX
{
   private int maxSize; //size of stack array // If it had been implemented using a linked list, 
                                              // for example, the size specification would be unnecessary
   private char[] stackArray;
   private int top; //top of stack
   
   //---------------------------------------------------------------
   
   public StackX(int max) //constructor
   {
      maxSize = max; //set array size
      stackArray = new char[maxSize]; //create array
      top = -1; //no item yet
   }
   //---------------------------------------------------------------
   
   public void push(char j) //put item on top of stack
   {
      stackArray[++top]=j; //increment top, insert item
   }
   //---------------------------------------------------------------
   
   public char pop() //take item from top of stack
   {
      return stackArray[top--]; //access item, decrement top
   }
   //---------------------------------------------------------------

   public char peek() //peek at top of stack
   {
      return stackArray[top];
   }
   //---------------------------------------------------------------

   public boolean isEmpty() //true if stack is empty
   {
      return (top == -1);
   }
   //---------------------------------------------------------------
   
} //end class StackX

class Reverser
{
   private String input; //input string
   private String output; //output string
   //---------------------------------------------------------------
   
   public Reverser(String in) //constructor
   {input = in;}
   //---------------------------------------------------------------
   
   public String doRev() //reverse the string
   {
      int stackSize = input.length(); //get max stack size
      StackX theStack = new StackX(stackSize); //make stack
      
      for(int j=0; j<input.length(); j++)
      {
         char ch = input.charAt(j); //get a char from input
         theStack.push(ch); //push it
      }
      output ="";
      while(!theStack.isEmpty())
      {
         char ch = theStack.pop(); //pop a char,
         output = output + ch; // append to output
      }
      return output;
   } //end doRev()
   
}
//---------------------------------------------------------------

class ReverseApp
{
   
   public static void main(String[] args)throws IOException
   {
      String input, output;
      while(true)
      {
         System.out.print("Enter a string: ");
         System.out.flush(); //java.io.OutputStream.flush()
                             //flushes this output stream and 
                             //forces any buffered output bytes to be written out.
         
         input = getString(); //read a string from keyboard
         
         if(input.equals("")) //quit if [Enter]
         break;
         
         //make a reverser
         Reverser theReverser = new Reverser(input);
         output = theReverser.doRev(); //Use it
         System.out.println("Reversed: " + output);
      }//end while
   }   //end main()
   
   public static String getString() throws IOException
   {
      InputStreamReader isr = new InputStreamReader(System.in); //System in: means input from keyboard
      //buffered reader: To buffer input from the underlying "Reader" object, read a file by a line 
      BufferedReader br = new BufferedReader(isr); 
      String s = br.readLine(); //program waits here until the user inserts a line of text
      return s;
   }
}  //end class StackApp
