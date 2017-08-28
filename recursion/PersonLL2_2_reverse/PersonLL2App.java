/*
   author: Sayaka Tamura
   Result:
 (John)(Allen)(Macdowell)(Henry)(George)
 (George)(Henry)(Macdowell)(Allen)(John)
 (John)(Allen)(Macdowell)(Henry)(George)
*/


public class PersonLL2App
{
   public static void main(String[] args)
   {
      PersonsLList theList = new PersonsLList(); //make list
      
      /* for other references
      Person John = new Person("John","M");
      PersonsNode pnJohn = new PersonsNode(John); 
      theList.insert(pnJohn);    
      PersonsNode pnAllen = new PersonsNode(new Person("Allen","M"));
      theList.insert(new PersonsNode(new Person("Macdowell","F")));
      */
      
      theList.insert("John","M");
      theList.insert("Allen","M");
      theList.insert("Macdowell","F");
      theList.insert("Henry","M");
      theList.insert("George","M");
      
      theList.list();
      theList.revlist();
      theList.list();
   }
}