/*
   LListApp.java
   Single Linked List in reverse order
   
   @author Sayaka Tamura 
*/
/* 
   Result:
 Node (first-->last): (John)(Allen)(Macdowell)(Henry)(George)
 Node (first-->last): (George)(Henry)(Macdowell)(Allen)(John)
*/

class Node //each node has next ptr and prev ptr
{
   public String name;
   public Node next;
   public Node prev;
   
   public Node()
   {  
      name = " ";
      next = null;
      prev = null;
   }
   
   public Node(String n)
   {  
      name = n;
      next = null;
      prev = null;
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
   public void setNext(Node nx)
   {
      next = nx;
   }
   
   public Node getNext()
   {
      return next;
   }
   
   
   //getter for String name.prev
   public void setPrev(Node p)
   {
      prev = p;
   }
   
   public Node getPrev()
   {
      return prev;
   }
   
   
   public void displayNode()
   {
      System.out.print("(" + name +")");
   }
   
}
///////////////////////////////////////////////////////////
class LList //the linked list has first ptr 
{
   private Node first;
   
   public LList()
   {
      first = null;
   }
   
   //------------------------------------------------------------
    public void insert(String n) // insert node at last
   {
      Node newNode = new Node(n);
      
      if(first == null)
         first = newNode;
      else
      {
         Node temp = first;
         
         while(temp.getNext()!=null)
         {
            temp = temp.getNext();
         }
         
         temp.setNext(newNode);
      }
                        
      //newNode.next = first;        // newLink --> old first
      //first = newNode;             // first --> newLink
   }
   
   
   public void delete()          // delete first link
   {                             // (assumes non-empty list)
      Node temp = first;
      
      if(first != null)
         first = first.getNext();    
   }
   
   public void list()
   {
      System.out.print("Node (first-->last): ");
      Node current = first;
      
      if(current == null) //if List does not have any node
      { System.out.println("\n List is empty");}
      else
      {
         while(current != null)
         {
            current.displayNode();
            current = current.next;
         }
      }
         
      System.out.println("");
   }
   
   public void revlist() //display name in reverse order
   {     
      Node current = first;       //start at end (John)
      Node cNext = current.next;
      if(current == null)
      {return;}
      
      while(cNext!=null)
      {
         Node tmp = cNext.next;  // preserve what will come later.     
         cNext.next = current;   // reverse the pointer
         current = cNext;        // advance the cursor
         cNext = tmp;            // the node cNext is the one preserved earlier.
      }      
      
      first.next = null;         // null-out next on what was the start element       
      first = current;    // move the start to what was the end.

   }

} //end class LList

//////////////////////////////////////////////////////////////////
class LListApp
{
   public static void main(String[] args)
   {
      LList theList = new LList();
      
      theList.insert("John");
      theList.insert("Allen");
      theList.insert("Macdowell");
      theList.insert("Henry");
      theList.insert("George");
      
      theList.list();
      theList.revlist();
      theList.list();
   }
}