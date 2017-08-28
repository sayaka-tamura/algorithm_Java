/*
 CSC310 final exam 5/25/17
 name: Sayaka Tamura
 EmplyID: #15234088
*/

public class GradeEntry
{  
   private int score;
   private GradeEntry next;
   private GradeEntry ghead;
   
   public GradeEntry()
   {
      score = 0;
      next = null;
   }
   
   public GradeEntry(int s, GradeEntry n)
   {
      score = s;
      next = n;
   }
   
   public int getscore(){return score;}
   
   public void setscore(int s){score = s;}
   
   public GradeEntry getNext(){return next;}
   
   public void setNext(GradeEntry n){next = n;}





   public GradeEntry findgrade(GradeEntry gn)
   {
      GradeEntry current = ghead;
      
      if(gn != null)
      {
         if(gn != ghead)
            findgrade(gn.getNext());
      }
      else
         System.out.println("No score in the list");     
      
      return current;
   }
   