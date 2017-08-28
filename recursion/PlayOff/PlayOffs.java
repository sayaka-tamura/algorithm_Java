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
 WWWWW 15
*/
public class PlayOffs
{
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
         games(g+1, p+3, r+"W");
         //games(g+1, p+1, r+"D");
         //games(g+1, p+0, r+"L");
      else
         System.out.println(r + " " + p);
   }
}