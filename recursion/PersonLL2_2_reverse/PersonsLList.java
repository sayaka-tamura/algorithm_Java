/*
   author: Sayaka Tamura
   
   PersonsList class is a linked list with PersonsNode class.
   The list will contain nodes where each node will contain a Student object 
   and a link to another person node.
*/

//Single Linked List_2 in reverse order

public class PersonsLList
{
   private PersonsNode plfirst;
   
   //constructor
   public PersonsLList()
   {plfirst = null;}
   
   /*
      It's the method to insert a new node at beginning of the list.
      @param sh StudentNode assigns to plfirst.
   */
   /*
   public void setplfirst(PersonsNode pn)
   {
      plfirst = pn;
   }
   */
   //or
   public void setplfirst(String name, String gender)
   {  
      PersonsNode NewPNode = new PersonsNode(new Person(name,gender));
      plfirst = NewPNode;
   }
   
   //getter for "first"
   public PersonsNode getplfirst()
   {return plfirst;}
   
   //------------------------------------------------------------
   /*
   a method to inserts a PersonsNode 
   into the "tail" of PersonsLList.
   @param pn PersonsNode.
   */
   
   /*
   //insert 1
    public void insert(PersonsNode pn)
   {        
      
      if(plfirst == null)
         plfirst = pn;
      else
      {
         PersonsNode temp = plfirst;
         
         while(temp.getNext()!=null)
            temp = temp.getNext();
         
         temp.setNext(pn);
      }
   }
   */
   
   //insert 2
   public void insert(String name, String gender)
   {        
      PersonsNode NewPNode = new PersonsNode(new Person(name,gender));
      
      if(plfirst == null)
         plfirst = NewPNode;
      else
      {
         PersonsNode temp = plfirst;
         
         while(temp.getNext()!=null)
            temp = temp.getNext();
         
         temp.setNext(NewPNode);
      }
   }
   
   public void delete()    //delete first node 
   {                                   
      if(plfirst != null)
         plfirst = plfirst.getNext();            
   }
   
   public void list()
   {
      PersonsNode current = plfirst;
      
      if(current != null) //if PersonsLList has any node      
      {
         while(current != null)
         {
            current.displayPersonsNode();
            //Or 
            //System.out.println(current.getPerson().getName());
            current = current.getNext();
         }
         
      }
      else
      { System.out.println("\n List is empty");}
      
      System.out.println("");
   }
   
   public void revlist() //display name in reverse order
   {     
      PersonsNode last, prev, it;
      
      if(plfirst == null)
      {return;}
      else
      {  
         
         last = plfirst;
         prev = plfirst;
         while(last != null)
            last = last.getNext();
         while(last != plfirst)
         {
            prev = plfirst;
            while(prev.getNext() != last)
               prev = prev.getNext();
            System.out.print("(" + prev.getPerson().getName() + ")");
            last = prev;
         }

      } 
      
      System.out.println("");     
   }

} //end class PersonsLList