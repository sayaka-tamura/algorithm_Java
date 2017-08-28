class QueueLList
{
   int data;
   QueueLList next,prev, head, tail;
   
   //constructor
   public QueueLList(int id)
   {
      data = id;
   }
   
   public QueueLList()
   {
      head = null;
      tail = null;
   }
   
   public void displayLink()
   {
      System.out.print("(" + data +")");
   }
   
   public boolean isEmpty()
   {
      return (head == null);
   }
   
   public void insert(int id)
   {
      QueueLList newNode = new QueueLList(id);
      if(head == null)  //created the first node
      {
         head = newNode;
         tail = newNode;
      }
      else  //second node and the next node
      {
         tail.next = newNode; //newNode -> next node of tail directed
         newNode.prev = tail; //tail -> prev of newNode
         tail = newNode;      //
         newNode.next = null;
      }
   }
   
   public QueueLList delete()
   {
      QueueLList temp = null;
      
      if(head == null) //queue is empty
         System.out.println("Queue is Empty");
      else if(head == tail) //queue is only one data
      {
         temp = head; //head -> temp //save head as reference link
         head = null; 
         tail = null;
      }
      else  //now queue has moree than one data
      {
         temp = head; //head -> temp //save head as reference link
         head = head.next; //head.next -> head
         head.prev = null;      
      }
      return temp;
   }
   
   public void display()
   {
      QueueLList current = head; //start from first data
      
      if(current == null)
         System.out.println("The Queue is Emmpty");
      else
      {
         while(current != null) //unless end of the queue
         {
            current.displayLink(); //display the data
            current = current.next; //current.next -> current
         }
      }
      
      System.out.println("");
   }
}