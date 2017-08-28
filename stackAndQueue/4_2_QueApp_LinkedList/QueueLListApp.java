import java.util.*;

public class QueueLListApp
{
   public static void main(String[] args)
   {
      QueueLList myqueue = new QueueLList();
      System.out.println("Type integers to fill queue");
      Scanner myscanner = new Scanner(System.in);
      int myvalue;
      myvalue = myscanner.nextInt();
      
      while(myvalue != 0)
      {
         myqueue.enqueue(myvalue);
         System.out.println("Value enqueued: " + myvalue);
         myvalue = myscanner.nextInt();
      }
      
      System.out.println("Finished enqueuing...\n Dequeuing..." );
      while(myqueue.isEmpty() == false)
      {
         System.out.printf("%6d", myqueue.dequeue());
      }
      
      System.out.println("\nGood luck and Good Bye");
   }
}

class Node
{
   private Integer elem;
   private Node next;
   
   //constructor
   Node()
   {
      elem = 0;
      next = null;
   }
   
   Node(int e, Node n)
   {
      elem = e;
      next = n;
   }
   
   public int getElem()
   {
      return elem;
   }
   
   public void setElem(int e)
   {
      elem = e;
      //System.out.println("elem is " + elem);
   }
   
   public Node getNext()
   {
      return next;
   }
   
   public void setNext(Node n)
   {
      next = n;
      //System.out.println("next is " + next);
   }
}

class QueueLList
    {
      Node head;
      Node tail;
      
      //constructor
      QueueLList()
      {
         head = null;
         tail = null;
      }
      
      public void enqueue(int val)
      {
         Node temp = new Node(val, null);
         if(isEmpty())
         {
            head = temp;
            tail = temp;
         }
         else
         {
            tail.setNext(temp);
            tail = temp;
         }
      }
      
     public int dequeue()
     {
         int temp;
         temp = head.getElem();
         head = head.getNext();
         
         return temp;
     }
      
     public boolean isEmpty()
     {
        return(head==null);
     }
}
