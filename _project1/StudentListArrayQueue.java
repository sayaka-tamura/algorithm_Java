class StudentListArrayQueue
{
   private int maxSize;
   private StudentNode[] studentLArrayQue;
   private int shead;
   private int stail;
   private int nItems;
   
   //---------------------------------------------------
   public StudentListArrayQueue(int size) //constructor
   {
      maxSize = size;
      studentLArrayQue = new StudentNode[maxSize];
      shead = 0;
      stail = -1;
      nItems = 0;
   }
   
   //---------------------------------------------------
   public void insert(StudentNode sn) //put item at reat of queue
   {
      if(stail == maxSize-1) //deal with wraparound
         stail = -1;
      studentLArrayQue[++stail] = sn; //increment rear and insert
      nItems++;
   }
   
   //---------------------------------------------------
   public void delete() //take item from front of queue
   {
      StudentNode temp = studentLArrayQue[shead++]; //get value incr front
      if(shead == maxSize) //deal with wraparound
         shead = 0;
      nItems--;            //one less item
   }
   
   //----------------------------------------------------
   public StudentNode peekFront()    //peek at front of queue
   {
      return studentLArrayQue[shead];
   }
   /*
   //----------------------------------------------------
   public boolean isEmpty()  //true if queue is empty
   {
      return(nItems==0);
   }
   
   //----------------------------------------------------
   public boolean isFull()   //true if queue is full
   {
      return (nItems == maxSize);
   }
   */
   //----------------------------------------------------
   public int size()       // number of items in queue
   {
      return nItems;
   }
   
   public void displayList()
   {
      StudentNode current = studentLArrayQue[shead];
      
      while(nItems != 0)
      {  
         
         System.out.println(current.getStudent().getName());
         //shead++;
         if(shead<maxSize)
         current = studentLArrayQue[++shead];         
         nItems--;
      }
      System.out.println("");
   }
   
   //----------------------------------------------------
} //end class Queue

