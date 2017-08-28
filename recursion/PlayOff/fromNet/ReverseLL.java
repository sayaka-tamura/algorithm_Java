 class Node
 {
     Node next;
     int data;
     
     public Node(int newData) //constructor
     {
         next=null;
         data=newData;
     }
     
     //Setter for Data
     public void setData(int newData)
     {
         data=newData;
     }
     
     //Getter for Data
     public int getData()
     {
         return data;
     }
     
     //Setter for Next
     public void setNext(Node n)
     {
         next=n;
     }

     //Getter for Next
     public Node getNext()
     {
         return next;
     }

 } //end Node class 

 ///////////////////////////////////////////
public class ReverseLL
{
    Node start;
    
    public ReverseLL() //constructor
    {
        start=null;
    }
    
    ////////////////////////////////////////////
    public void insert(int newData)
    {
        Node p=new Node(newData);
        if(start==null)
        {
            start=p;
        }
        else
        {
            Node temp=start;
            while(temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(p);
        }
    } //end insert()
      
    /////////////////////////////////////////////////////////////////////////////   
    public void reverse()
    {
        if (start == null)
        {return;}
        
        Node current = start;
        Node after = start.next;
        
        while (after != null)
        {
            Node tmp = after.next; // preserve what will come later.
            after.next = current;  // reverse the pointer
            current = after;       // advance the cursor
            after = tmp;           // the node after is the one preserved earlier.
        }
        
        start.next = null;         // null-out next on what was the start element 
        start = current;           // move the start to what was the end.
    } //end reverse()
    
    /////////////////////////////////////////////////////////////////////////////
    public void display()
    {
        int count = 0;
   
        if(start == null)
        {
            System.out.println("\n List is empty !!");
        }
        else
        {
            Node temp = start;
   
            while(temp.getNext() != null)
            {
                System.out.println("count("+count+") , node value="+temp.getData());
                count++;
                temp = temp.getNext();
            }
            System.out.println("count("+count+") , node value="+temp.getData());
        }
    } //end display()
 } //End ReverseLL
 
 /////////////////////////////////////////////////////////////////////////////
 class ReverseLLApp
 { 
    public static void main(String args[])
    {
        ReverseLL ll=new ReverseLL();
        ll.reverse();
        ll.display();
        System.out.println();
   
        ll.insert(1);
        ll.reverse();
        ll.display();
        System.out.println();
   
        ll.insert(2);
   
        ll.reverse();
        ll.display();
        System.out.println();
   
        ll.reverse();
        ll.display();
        System.out.println();
   
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(8);
        ll.display();
        System.out.println();
   
        ll.reverse();
        ll.display();
        System.out.println();
    } //end main
} //ReverseLL App

/* Output
   List is empty !!
 
 count(0) , node value=1
 
 count(0) , node value=2
 count(1) , node value=1
 
 count(0) , node value=1
 count(1) , node value=2
 
 count(0) , node value=1
 count(1) , node value=2
 count(2) , node value=3
 count(3) , node value=4
 count(4) , node value=5
 count(5) , node value=6
 count(6) , node value=7
 count(7) , node value=8
 
 count(0) , node value=8
 count(1) , node value=7
 count(2) , node value=6
 count(3) , node value=5
 count(4) , node value=4
 count(5) , node value=3
 count(6) , node value=2
 count(7) , node value=1
 
*/
