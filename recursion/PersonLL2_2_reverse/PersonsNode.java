/*
   author: Sayaka Tamura
   PersonNode class has Person and PersonNode objects.
*/

//Node for Single Linked List_2 in reverse order

public class PersonsNode
{
   private Person person;
   
   public PersonsNode next;
   public PersonsNode prev;
   
   //constructor
   public PersonsNode()
   {  
      person = null;      
      next = null;
      prev = null;
   }
   
   //constructor_2
   //@param Person p:person
   public PersonsNode(Person p)
   {  
      person = p;      
      next = null;
      prev = null;
   }
   
   
   //getter for Person object
   public Person getPerson()
   {
      return person;
   }
   
   //setter for Person object
   //@param Person p: person u want to set
   public void setPerson(Person p)
   {
      person = p;
   }
   
   //getter for PersonsNode next object
   public PersonsNode getNext()
   {
      return next;
   }
   
   //setter for PersonsNode next object
   public void setNext(PersonsNode pn)
   {
      next = pn;
   }
      
   //getter for PersonsNode prev object
   public PersonsNode getPrev()
   {
      return prev;
   }
   
   //setter for PersonsNode prev object
   public void setPrev(PersonsNode pn)
   {
      prev = pn;
   }
   
   public void displayPersonsNode()
   {
      System.out.print("(" + person.getName() +")");
   }
   
}
