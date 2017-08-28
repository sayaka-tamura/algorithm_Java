/**
 * @(#)FriendDriver.java
 *
 *
 * @author 
 * @version 1.00 2016/3/23
 */
import javax.swing.*;
public class FriendDriver {
        
    /**
     * Creates a new instance of <code>FriendDriver</code>.
     */
    public FriendDriver() {
    	String command = JOptionPane.showInputDialog("ENTER COMMAND S,D,P,B,N,L,Q or X to exit");
    	String sname;
    	String fname;
    	StudentList sl = new StudentList();
      while(command.charAt(0) != 'X')
    	{
    		switch(command.charAt(0))
    		{
    			case 'S':	sname = JOptionPane.showInputDialog("ENTER STUDENT NAME");
    						sl.insertStudentNode(new StudentNode(new Student(sname)));
    						break;
    			case 'D':	sname = JOptionPane.showInputDialog("ENTER STUDENT NAME");
    						sl.deleteStudentNode(sl.findStudentByName(sname));
    						break;
    			case 'P':	sl.printStudentListByName();
    						break;
    			case 'B':	sname = JOptionPane.showInputDialog("ENTER STUDENT NAME");
                     if(sl.findStudentByName(sname) == null)
                        System.out.println("STUDENT "+sname+" IS NOT IN THE CLASS");
                     else
                     {
                        fname = JOptionPane.showInputDialog("ENTER FRIEND NAME");
                        if(sl.findStudentByName(fname) == null)
                           System.out.println("FRIEND "+sname+" IS NOT IN THE CLASS");
                        else
    						      sl.findStudentByName(sname).getFptr().insertFriendNode(new FriendNode(sl.findStudentByName(fname)));
                     }
    						break;
    			case 'N':	sname = JOptionPane.showInputDialog("ENTER STUDENT NAME");
    						fname = JOptionPane.showInputDialog("ENTER FRIEND NAME");
    						sl.findStudentByName(sname).getFptr().deleteFriendNode( sl.findStudentByName(sname).getFptr().findFriendByName(fname) );
    						break;
    			case 'L':	sname = JOptionPane.showInputDialog("ENTER STUDENT NAME");
                     if(sl.findStudentByName(sname)==null)
                        System.out.println("STUDENT "+sname+" IS NOT IN THE CLASS");
                     else
    						   sl.findStudentByName(sname).getFptr().printFriendListByName();
    						break;
    			case 'Q':	sname = JOptionPane.showInputDialog("ENTER STUDENT NAME");
    						fname = JOptionPane.showInputDialog("ENTER FRIEND NAME");
    						if(sl.findStudentByName(sname).isFriends(fname)) System.out.println("YES");
    						else System.out.println("NO"); 							
    			
    		}   			
    	  	command = JOptionPane.showInputDialog("ENTER COMMAND S,D,P,B,N,L,Q or X to exit");
    	}
    	
    	
    }
    public static void main(String args[])
    {
      FriendDriver fd= new FriendDriver();
    }
    


}
