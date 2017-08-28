/*
   Name: Sayaka Tamura
   Class: CSC330-1200
   Prof: Mete Kok
   Project I 
   file name : FriendList.java
*/

/*
   StudentList class is a linked list with StudentNode class.
   The list will contain nodes where each node will contain a Student object 
   and a link to another student node.
*/

import javax.swing.JOptionPane;

public class FriendList
{
   private FriendNode fhead; // ref to first link on list
   
   // -------------------------------------------------------------
   // constructor
   public FriendList() 
   {
      fhead = null; // no links on list yet
   }
   
   //Setter
   
   /*
      It's the method to insert a new node at beginning of the list.
      @param f StudentNode assigns to fhead.
   */
   public void setFhead(FriendNode f)
   {
      fhead = f;
   }
   
   //Getter
   public FriendNode getFhead()
   {
      return fhead;
   }
   
   // -------------------------------------------------------------
   /**
      insertFriendNode is a method to inserts a FriendNode 
      into the "tail" of FriendList.
      @param fn FriendNode.
   */
   public void insertFriendNode(FriendNode fn)
   {  
      FriendNode fheadNode = fhead; //assign 'fhead' as FriendNode 'fheadNode'
      
      if(fhead == null) //if 'fhead' is null
         fhead = fn;  //assign StudentNode fn as 'fhead'
      else
      {
         while(fheadNode.getFptr()!=null) //unless 'fheadNode.next' is null
         {
            fheadNode = fheadNode.getFptr(); //Repeat to get next node of 'fheadNode' and assign it as 'fheadNode'
         }
         
         fheadNode.setFptr(fn);  //set 'fn' as the next node of 'fheadNode'
      }
   }
   
   // -------------------------------------------------------------
   /*
      deleteFriendNode is a method to deletes a FriendNode 
      from the FriendList.
      @param fn FriendNode.
   */
   public void deleteFriendNode(FriendNode fn)
   {  
      // (assumes non-empty list)
      FriendNode current = fhead;  //assign 'fhead' as FriendNode 'current'
      FriendNode previous = fhead; //assign 'fhead' as FriendNode 'previous'
            
      if(fn!=null)   //if FriendNode 'fn' is not null //null means no name on the list to delete,
      {
         if(fn==fhead)//When fn is the head
            fhead=current.getFptr();   //Get next node of 'current' and assign it as 'fhead'
         else//When sn is not head
         {
            while(current.getFptr()!=fn)  //Unless 'current.next' is 'fn'
               current=current.getFptr(); //Get next node of 'current' and assign it as 'current'
            current.setFptr(current.getFptr().getFptr()); //Get Next of 'current.next' and set it as 'current.next'
         }
      }
   }
   // -------------------------------------------------------------
   
   /*
      A method to find the FriendNode 
      that refers the Friend object that has the value of the String parameter in name attribute.
      If the Friend does not exist in the list, null is returned.
      
      @param fn name will be searched.
      @return checkNode FriendNode that has null when it's not found or FriendNode when It's found.
   */

   public FriendNode findFriendByName(String fn) // find link with given name
   {
      FriendNode checkNode = fhead; //check from the first element.
      
      // Stop loop when Empty list or No name on it 
      //&& Stop When it found the node matched fn.
      while(checkNode!=null && !checkNode.getSptr().getStudent().getName().equals(fn)) 
            checkNode=checkNode.getFptr();   //Get next node of 'checknode' and assign it as 'checkNode'
      if(checkNode==null)  //notice to not found name.
         System.out.println("The name is not on the list.");
      return checkNode; //Return null means Empty list or No name on it.
                        //Return StudentNode means the method found a name matched with fn.
   }

   // -------------------------------------------------------------
   public void printFriendListByName() // display the list
   {
      System.out.println("List (first-->last): ");

      FriendNode current = fhead; //assign 'fhead' as FriendNode 'current'
      
      while(current != null) // until end of list,
      {
         //JOptionPane.showMessageDialog(null,current.getSptr().getStudent());//Get 'current' node info and show it
         System.out.println(current.getSptr().getStudent().getName());//Get 'current' node info and show it
         current = current.getFptr(); // move to next link //Get next node of 'current' and assign it as 'current'
      }
      
   }
} 