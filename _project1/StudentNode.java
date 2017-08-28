/*
   Name: Sayaka Tamura
   Class: CSC330-1200
   Prof: Mete Kok
   Project I 
   file name : StudentNode.java
*/

/*
   StudentNode class has Student and StudentNode objects.
   And It will have friendlist as an linked list.
*/

public class StudentNode
{
	 private	Student student ;
	 private	StudentNode	sNext; //= The StudentNode shows next node
	 private	FriendList fNext;
	 
	 //Constructor
	 public StudentNode()
	 {
	     student = null;
        sNext = null;
	     fNext=null;
    }
	 
    //@param s student object
	 public StudentNode(Student s)
	 {
        student = s;
        sNext = null;	
	     fNext=new FriendList();
    }
	 
	 //Setter 
    //@param s student object
	 public void setStudent(Student s)
	 {
        student =	s;
	 }
    
    //@param s StudentNode
    public void setsNext(StudentNode s)
	 {
        sNext = s;	
	 }
    
    //@param f FriendList
    public void setfNext(FriendList f)
	 {
        fNext = f;	
	 }
    
	 //Getter
	 public Student getStudent()
	 {
        return	student;
	 }
	 
    public StudentNode getsNext()
	 {
        return	sNext;
	 }
    
    //getNext for Friendnode
    public FriendList getfNext()
	 {
        return	fNext;
	 }
    
    
    /**
      isFriends return boolean after checking if the fn is on the friendlist.
      @param fn String Friend's name.
      @return it will be change.
   */

   /*
    public boolean isFriends(String fn) // true if list is empty
    {
      return (fn==null);
    }
    */
    
    public boolean isFriends(String fn)
    {
      if(fNext.findFriendByName(fn)!= null)
      {
         return true;
      }else
      {
         return false;
      }
    }
} 
