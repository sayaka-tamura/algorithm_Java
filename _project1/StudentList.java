/*
   Name: Sayaka Tamura
   Class: CSC330-1200
   Prof: Mete Kok
   Project I 
   file name : StudentList.java
*/

/*
   StudentList class is a linked list with StudentNode class.
   The list will contain nodes where each node will contain a Student object 
   and a link to another student node.
*/

public class StudentList
{
   private StudentNode shead; // ref to first link on list
   
   // -------------------------------------------------------------
   // constructor
   public StudentList() 
   {
      shead = null; // no links on list yet
   }
   
   //Setter
   
   /*
      It's the method to insert a new node at beginning of the list.
      @param sh StudentNode assigns to shead.
   */
   public void setShead(StudentNode sh)
   {
      shead = sh;
   }
   
   //Getter
   public StudentNode getShead()
   {
      return shead;
   }
   
   // -------------------------------------------------------------
   /**
      insertStudentNode is a method to inserts a StudentNode 
      into the "tail" of StudentList.
      @param sn StudentNode.
   */
   public void insertStudentNode(StudentNode sn)
   {        
      StudentNode current = shead;
      
      if(current == null) //if 'shead' is null
         shead = sn;  //assign StudentNode sn as 'shead'
      else
      {
         while(current.getsNext()!=null) //unless 'sheadNode.next' is null
         {
            current = current.getsNext(); //shead.next -> shead 
                                      //reason to use getsNext() instead of "shead.sNext"
                                      //set private access for sNext in StudentNode.java
         }
         
         current.setsNext(sn);  //sn -> shead.next
      }
   }
   
   // -------------------------------------------------------------
   /*
      deleteStudentNode is a method to deletes a StudentNode 
      from the StudentList.
      @param sn StudentNode.
   */
   public void deleteStudentNode(StudentNode sn)
   {  
      // (assumes non-empty list)
      StudentNode current = shead;  //assign 'shead' as StudentNode 'current'

      if(sn!=null)   //if StudentNode 'sn' is not null //null means no name on the list to delete,
      {
         if(sn==shead)//When sn(taget) is the head
            shead = current.getsNext();   //current.next --> 'shead'
         else //When sn is not head
         {
            while(current.getsNext()!=sn)  //Unless 'current.next' is 'sn'
               current = shead.getsNext(); //shead.next --> 'current'
            current.setsNext(current.getsNext().getsNext()); //shead -> current.next.next
         }
      }
      
      System.out.println(sn.getStudent().getName()+" has deleted from the list."); //print sn deleted 
   }
   // -------------------------------------------------------------
   
   /*
      A method to find the StudentNode 
      that refers the Student object that has the value of the String parameter in name attribute.
      If the Student does not exist in the list, null is returned.
      
      @param fn name will be searched.
      @return findNode StudentNode that has null when it's not found or StudentNode when It's found.
   */

   public StudentNode findStudentByName(String fn) // find link with given name
   {
      StudentNode findNode = shead; //check from the first element.
         
      // Stop loop when Empty list or No name on it 
      //&& Stop When it found the node matched fn.
      if(findNode==null)  //notice to not found name.
         System.out.println("The name is not on the list.");

      while(findNode!=null&&(!findNode.getStudent().getName().equals(fn))) 
         findNode=findNode.getsNext();
            
      return findNode; //Return null means Empty list or No name on it.
                        //Return StudentNode means the method found a name matched with fn.
   }

   // -------------------------------------------------------------
   public void printStudentListByName() // display the list
   {
      System.out.println("List (first-->last): ");

      StudentNode current = shead; //assign 'shead' as StudentNode 'current'
      
      while(current != null) // until end of list,
      {
         //JOptionPane.showMessageDialog(null,current.getStudent().getName());//Get 'current' node info and show it
         System.out.println(current.getStudent().getName());//Get 'current' node info and show it
         current = current.getsNext(); // move to next link //Get next node of 'current' and assign it as 'current'
      }
      
   }
} 