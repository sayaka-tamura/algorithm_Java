/*
   Name: Sayaka Tamura
   Class: CSC330-1200
   Prof: Mete Kok
   Project I 
   file name : FriendNode.java
*/

/*
   StudentNode class has Student and StudentNode objects.
   And It will have friendlist as an linked list.
*/

public class FriendNode //ptr=pointer
{
	 private	StudentNode	Sptr; //= shows StudentNode info this FriendNode has 
	 private	FriendNode Fptr; //= shows next node for FriendNode 
	 
	 //Constructor
	 public FriendNode()
	 {
        Sptr = null;
        Fptr = null;
	 }
	 
    //@param s StudentNode object
	 public FriendNode(StudentNode s)
	 {
        Sptr = s;
        Fptr = null;
	 }
	 
	 //Setter 
    //@param s StudentNode object
	 public void setStpr(StudentNode s)
	 {
        Sptr =	s;
	 }
    
    //getter
    //@param s StudentNode
    public StudentNode getSptr()
	 {
        return Sptr;	
	 }
    
    //Setter
    //@param f FriendList
    public void setFptr(FriendNode f)
	 {
        Fptr = f;
	 }
    
    //getter
	 //getNext for Friendnode
    public FriendNode getFptr()
	 {
        return	Fptr;
	 }
    
} 