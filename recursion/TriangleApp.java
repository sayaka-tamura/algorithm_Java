/*
   TriangleApp.java
   evaluates triangular number
   
   @author Sayaka Tamura 
   2014/05/03
*/
/* 
   Result: 
    Enter a number: 3
 Entering: n= 3
 Entering: n= 2
 Entering: n= 1
 Entering: n= 0
 Returning 1
 Returning 1
 Returning 2
 Returning 6
 Triangle=6
*/

import java.io.*;
class TriangleApp
{
   static int theNumber;
   
   public static void main(String[] args) throws IOException
   {
      System.out.print("Enter a number: ");
      theNumber = getInt();
      int theAnswer = triangle(theNumber);
      System.out.println("Triangle=" + theAnswer);
   }//end main
   
   //----------------------------------------------------------
   public static int triangle(int n)
   {
   
      System.out.println("Entering: n= " + n);
      //if(n==1) //for additional
      if(n==0) //for factorial
      {
         System.out.println("Returning 1");
         return 1; //for additional and additinal
      }
      else
      {
         //int temp = n + triangle(n-1);
         int temp = n * triangle(n-1); //factorials

         System.out.println("Returning " + temp);
         return temp;
      }
      
      /*
      //Another way for addition
      System.out.println("Entering: n= " + n);
      int total = 0;
      while(n>0) //until n is 1
      {
         total = total + n; //add n (column height) to total
         --n;
      }
      return total;
      */
   }
   
   //----------------------------------------------------------
   public static String getString() throws IOException
   {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
   }
   
   //----------------------------------------------------------
   public static int getInt() throws IOException
   {
      String s = getString();
      return Integer.parseInt(s);
   }
   
   //----------------------------------------------------------
} //end class TriangleApp   
