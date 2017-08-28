//each soccer game has 3 possible out come
//win(3 pts), tie(1),lose(0)
//gonna have 5 games
//if a team win more than 10 pts, gonna go to play off

//1.)List all possible outcomes  from 5 games ->count the number of outcome, dispaly at the end
//1a) Game to be entered by user from keyboard
//1b) Pts to be entered by user from keyboard

import java.util.*;

class PlayOffs2
{

   public static void main(String[] args)
   {  
      //games(0,0,"");
      System.out.println(games(0,0,""));   
   }
  /* 
   public static void games(int g, int p, String r)
   {  
      
      //show the result for only more than 10 pts
      if(g<5)
      {                 
         games(g+1, p+3, r+"W");
         games(g+1, p+1, r+"T");
         games(g+1, p+0, r+"L");
      }
      else
      {
         System.out.println(r + " " + p +" points");
         
         if(p>=10)
            //System.out.println(r + " " + p +" points");
            System.out.println("Get into playoff!!");
         
         else
            System.out.println("Not enough to get to playoff");
         
      }    
   }//end games method
   */
   
   public static int games(int g, int p, String r)
   {  
      if(g<5)
      {
         return games(g+1, p+3, r+"W") +  //games(g+1, p+3, r+"W")-> 1 //check about return method again
          games(g+1, p+1, r+"T") +
           games(g+1, p+0, r+"L");
      }
      else
      {
         System.out.println(r + " " + p +" points");
         return(1);
      }
   }
}


/*
i=0;c=0;
while(i<5)
{
   c+=1;
   i+=1;
}



int rec_cnt(int i)
if(i<5)
   return (rec_cnt(i+1)+1)
else
   return(0)
   
   
   
if(pts>=10)
   return(1);
else
   return(0);
*/  
