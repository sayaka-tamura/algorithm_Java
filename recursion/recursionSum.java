//authour: Sayaka Tamura
//File name: recursionSum.java
//Result: 120

class recursionSum
{  
   public static void main (String[] args)
   {  
      sum s = new sum();
      //System.out.println(s.loopSum(15));
      System.out.println(s.recursionSum(15));
   }
}

class sum
{ 
   /*
   public int loopSum(int a)
   {
      int tot =0;
      while(a>0)
      {
         tot += a;
         a--;
      }
      return(tot);
   }
   */
   public int recursionSum(int a)
   {  
      if(a>0)      
         return(a+recursionSum(a-1));
      else
         return(0);  
   }
   
}