/*
   author: Sayaka Tamura
   date:5/16/2017
*/

public class ListRecursion 
{ 
    public static void main(String[] args) 
    { 
       char[] c3 = {'a', 'b', 'c'}; 
       char[] c4 = {'a', 'b', 'c', 'd'}; 
 
       System.out.println("- - - - - - - - - - - - - - - - -"); 
       System.out.print("set: "); 
       System.out.println(c3); 
       
       System.out.println("All permutations: "); 
       permute(c3); 
       
       System.out.println("- - - - - - - - - - - - - - - - -"); 
       System.out.print("set: "); 
       System.out.println(c4);
        
       System.out.println("All permutatons: "); 
       permute(c4);
         
   } // end of main
  
   // Print out the elements of e in all possible orders, 
   // assuming all elements of e are distinct. 
   public static void permute(char[] e)
   { 
      // implement as multistep process:
      // choose element at index i from elements now at index >= i
   
       permuteRest(e, 0); 
   }
   
   private static void permuteRest(char[] e, int iStart) { 
    /* 
       e is a possible permutation. 
       Keep e[j] in its position if j < iStart. 
       Do all permutations for elements e[j], j >= iStart. 
       Return with the order of e elements the same as the beginning. 
    */

    if (iStart == e.length) 
      System.out.println(e); 
    else 
      for (int j = iStart; j < e.length; j++) 
      { 
        swap(e, iStart, j); // helping method next 
        permuteRest(e, iStart+1); 
        swap(e, iStart, j); // return to original state 
      } 
  }

  private static void swap(char[] e, int i, int j)
  { 
    char temp = e[i]; 
    e[i] = e[j]; 
    e[j] = temp; 
  }
}