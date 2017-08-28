/*
Result
 Display Queue: 
 (2)(6)(0)(6)
 
 Deleted
 (2)
 (6)(0)(6)
 
 Deleted
 (6)
 (0)(6)
 
 Deleted
 (0)
 (6)
 
 Deleted
 (6)
 The Queue is Emmpty
*/

class QueueLListApp2
{
   public static void main(String[] args)
   {
      QueueLList theQueue = new QueueLList(); //make new Linkedlist
      
      theQueue.insert(2); //insert items
      theQueue.insert(6);
      theQueue.insert(0);
      theQueue.insert(6);
      
      System.out.println("Display Queue: ");
      theQueue.display(); //display the list
      
      while(!theQueue.isEmpty()) //till it's empty
      {
         QueueLList sLink = theQueue.delete();
         System.out.println("\nDeleted"); //display it
         sLink.displayLink();
         System.out.println("");
         theQueue.display(); //display list
      }
   }
}