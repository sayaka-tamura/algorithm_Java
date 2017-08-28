/*
   LListApp.java
   Recursion in reverse order 
   @author Sayaka Tamura 
*/
/* 
   Result:
 (John)(Allen)(Macdowell)(Henry)(George)
 (George)(Henry)(Macdowell)(Allen)(John)
*/

class PersonsNode
{
   public String name;
   public PersonsNode next;
   //public PersonsNode prev;
   
   public PersonsNode()
   {  
      name = " ";
      next = null;
      //prev = null;
   }
   
   public PersonsNode(String n)
   {  
      name = n;
      next = null;
      //prev = null;
   }
   
   
   //getter for String name
   public String getName()
   {
      return name;
   }
   
   //setter for String name
   //@param String n u want to set
   public void setName(String nm)
   {
      name = nm;
   }
   
   //getter for String name.next
   public void setNext(PersonsNode nx)
   {
      next = nx;
   }
   
   public PersonsNode getNext()
   {
      return next;
   }
   
   /*
   //getter for String name.prev
   public void setPrev(PersonsNode p)
   {
      prev = p;
   }
   
   public PersonsNode getPrev()
   {
      return prev;
   }
   */
   
   public void displayPersonsNode()
   {
      System.out.print("(" + name +")");
   }
   
}
///////////////////////////////////////////////////////////
class RecPLList
{
   private PersonsNode plhead;
   
   public RecPLList()
   {
      plhead = null;
   }
   
   //Getter for "plhead"
   public PersonsNode getplhead()
   {
      return plhead;
   }
   
   //Setter
   public void setplhead(PersonsNode ps) //ps: person
   {
      plhead = ps;
   }
   
   //------------------------------------------------------------
    public void insert(String n) // insert at front of list
   {
      PersonsNode newPN = new PersonsNode(n);
      
      if(plhead == null)
         plhead = newPN;
      else
      {
         PersonsNode temp = plhead;
         
         while(temp.getNext()!=null)
         {
            temp = temp.getNext();
         }
         
         temp.setNext(newPN);
      }
   }
   
   /*
   public PersonsNode delete()          // delete first link
   {                             // (assumes non-empty list)
      PersonsNode temp = plhead;
      
      if(plhead.next != null)
            plhead.next.prev = null;  // null <-- old next
            
      plhead = plhead.next;            // plhead --> old next
      return temp;
   }
   */
   
   public void reclist(PersonsNode pn) //pn means persons node
   {
      
      if(plhead == null) //if List does not have any node
      { System.out.println("\n List is empty");}
      
      if(pn != null)
      {  
         pn.displayPersonsNode();
         reclist(pn.getNext());
      }     
   }
   
   public void revlist() //display name in reverse order
   {     
      PersonsNode current = plhead;       //start at end (John)
      PersonsNode cNext = current.next;
      if(current == null)
      {return;}
      
      while(cNext!=null)
      {
         PersonsNode tmp = cNext.next;  // preserve what will come later.     
         cNext.next = current;   // reverse the pointer
         current = cNext;        // advance the cursor
         cNext = tmp;            // the node cNext is the one preserved earlier.
      }      
      
      plhead.next = null;         // null-out next on what was the start element       
      plhead = current;    // move the start to what was the end.

   }

} //end class LList

//////////////////////////////////////////////////////////////////
class RecLListApp
{
   public static void main(String[] args)
   {
      RecPLList recPll = new RecPLList();
      
      recPll.insert("John"); //Prof's way (insert(new PersonsNode(new Person("John","M")));
      recPll.insert("Allen");
      recPll.insert("Macdowell");
      recPll.insert("Henry");
      recPll.insert("George");
      
      recPll.reclist(recPll.getplhead());
      System.out.println("");

      recPll.revlist();
      recPll.reclist(recPll.getplhead());
   }
}