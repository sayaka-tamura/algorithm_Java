class StudentLListQue
{
   private StudentNode shead; // ref to first item
   private StudentNode stail; // ref to last item
   // -------------------------------------------------------------
   public StudentLListQue() // constructor
   {
      shead = null; // no items on list yet
      stail = null;
   }
      
   // -------------------------------------------------------------
   // insertStudentNodeLast(): insert at end of list
   // @param sn StudentNode object
   
   public void insertStudentNodeLast(StudentNode sn) 
   {
      StudentNode current = shead;
      
      if(current == null)
         shead = sn;
      else
         stail.setsNext(sn);
      
      stail = sn;
   }
   
   // -------------------------------------------------------------
   
   public void deleteStudentNodeFirst() // delete first link
   { 
      // (assumes non-empty list)
      StudentNode temp = shead;
      if(shead.getsNext() == null) // if only one item
         stail = null;
      shead = shead.getsNext(); // shead <-- shead.next
      System.out.println(temp.getStudent().getName()+" has deleted from the list."); //print sn deleted 
      System.out.println("");
   }
   
   // -------------------------------------------------------------
   public void displayList()
   {
      StudentNode current = shead; // start at beginning
      
      while(current != null) // until end of list,
      {
         System.out.println(current.getStudent().getName());//Get 'current' node info and show it
         current = current.getsNext(); // move to next link
      }
      System.out.println("");
   }
   
   // -------------------------------------------------------------
}

////////////////////////////////////////////////////////////////
class StudentLListQueue
{
   private StudentListQue theStudentLListQue;
   //--------------------------------------------------------------
   public StudentLListQueue() // constructor
      { theStudentLListQue = new StudentListQue(); } // make a 2-ended list
      
   //--------------------------------------------------------------
   public void insert(StudentNode sn) // insert, rear of queue
      { theStudentLListQue.insertStudentNodeLast(sn); }
   
   //--------------------------------------------------------------
   public void delete() // remove, front of queue
      { theStudentLListQue.deleteStudentNodeFirst(); }
   
   //--------------------------------------------------------------
   public void displayQueue()
   {
      System.out.println("StudentLListQueue (front-->rear): ");
      theStudentLListQue.displayList();
   }
   //--------------------------------------------------------------
} // end class LinkQueue

////////////////////////////////////////////////////////////////
