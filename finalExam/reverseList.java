/*
 CSC310 final exam 5/25/17
 name: Sayaka Tamura
 EmplyID: #15234088
*/


   public GradeEntry reverseList(GradeEntryLList NameEntry)
   {
      
      GradeEntryLList theEnrty = new GradeEntryLList(NameEntry);
      GradeEntryLList current = ghead;
      
      System.out.println("Reverse list is now ");
      
      if(theEnrty != null)
      {
         if(current != ghead)
            reverseList(current.getNext());
         
         System.out.println( current + " ");
      }
      else
         System.out.println("No entry in the list"); 
             
      return current;
   } 
