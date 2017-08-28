//each soccer game has 3 possible out come
//win(3 pts), tie(1),lose(0)
//gonna have 5 games
//if a team win more than 10 pts, gonna go to play off

//what conbination will give you play off?
//4 wins 1 loss has 5 posibbilities
//how many games, how many pts
//a result shows us future possibilities
// and tell what is ok for going to play off

/*
   Result:
 You win!!
 You have to win2 times more at least.
 
 You win!!
 You have to win1 times more at least.
 
 You win!!
 You have to win0 times more at least.
 
 You Draw!
 You have to win0 times more at least.
 
 You Draw!
 You have to win0 times more at least.
 
 WWWDD 11 points
 Get into playoff!!
*/

import java.util.*;

public class PlayOffs0
{
   static int gameCounter = 5;
   
   static int winCounter = 3;
   //static int drawCounter = 2;
   //static int loseCounter = 1;

   public static void main(String[] args)
   {
   
      /*
      int pts = 0;
      String record = "";
      int game =0;
      
      //equivalent to "games" method
      while(game<5)
      {
         pts += 3;
         record += "W";
         game++;
      }
      System.out.println(record + " " + pts);
      */
      
      games(0,0,"");
   
   }
   
   public static void games(int g, int p, String r)
   {  
      
      //show the result for only more than 10 pts
      if(g<5)
      {  
         Random rnd = new Random();
         int num = rnd.nextInt(2);
         
         switch(num)
         {
            case 0:
               //System.out.println(r + " " + p +" points"); 
               System.out.println("You win!!");  
               winCounter--;             
               System.out.println("You have to win" + winCounter + " times more at least." );
               System.out.println("");
               
               games(g+1, p+3, r+"W");
               break;
               
            case 1:
               //System.out.println(r + " " + p +" points");
               System.out.println("You Draw!");                           
               System.out.println("You have to win" + winCounter + " times more at least." );
               System.out.println("");
               
               games(g+1, p+1, r+"D");
               break;
               
            case 2:
               //System.out.println(r + " " + p +" points"); 
               System.out.println("You lose");               
               System.out.println("You have to win" + winCounter + " times more at least." );
               System.out.println("");
               
               games(g+1, p+0, r+"L");
               break;
         }
      }
      else if(p>=10)
      {  
         System.out.println(r + " " + p +" points");               
         System.out.println("Get into playoff!!");
      }
      else
      {  
         System.out.println(r + " " + p +" points");               
         System.out.println("Not enough to get to playoff");
      }
   }
}