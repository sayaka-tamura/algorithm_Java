class StudentLListStack
{
   private StudentNode shead; // ref to first item on list
   
   // -------------------------------------------------------------
   public StudentLListStack() // constructor
      { shead = null; } // no items on list yet
   
   // -------------------------------------------------------------
   public void setStudentLStackHead(StudentNode sn) // setter
      { shead = sn; }
   
   // -------------------------------------------------------------

   public StudentNode getStudentLStackHead() // getter
      { return shead; }
   
   // -------------------------------------------------------------
   /* 
      insertStudentNodeFirst(): insert at start of list
      @param sn StudentNode.
   */
   public void insertStudentNodeFirst(StudentNode sn) 
   {   
      sn.setsNext(shead); // shead --> sn.next 
      shead = sn;      // sn --> shead  
      
   }
   
   // -------------------------------------------------------------
   // deleteStudentNodeFirst(): delete first item
   
   public void deleteStudentNodeFirst() 
   {  
      StudentNode temp = shead;    // save reference to link

      if(shead != null)
      {
         System.out.print("Now, Popped "); 
         System.out.println(temp.getStudent().getName()+" has deleted from the list.\n"); //print sn deleted 
         
         shead = shead.getsNext();   // delete it: shead-->old next
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
      System.out.println(shead.getStudent().getName()+" has deleted from the list.\n"); //print sn deleted 
      System.out.println(" ");
   }
    
   // -------------------------------------------------------------
   public void displayList()
   {  
      System.out.println("StudentListStack (first-->last): ");

      StudentNode current = shead; // start at beginning of list
      
      while(current != null) // until end of list,
      {
         System.out.println(current.getStudent().getName());//Get 'current' node info and show it
         current = current.getsNext(); // move to next link
      }
      System.out.println("");

   }
   // -------------------------------------------------------------
} // end class StudentListStack

