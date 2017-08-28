/*
   Name: Sayaka Tamura
   Class: CSC330-1200
   Prof: Mete Kok
   Project I 
   file name : Student.java
*/

//Student class is a set of datas for StudentNode class.

public class Student extends Person
{
   private String major;
   private double gpa;
   // -------------------------------------------------------------
   
   // constructor
   public Student() 
   {
      super(null,null);
      major = null;
      gpa = 0;
   }

   /*
      overloaded constructor
      @param nm string name
      assigned null for gender of Super class
   */
   public Student(String nm) 
   {
      super(nm,null);
      major = null;
      gpa = 0;
   }
   
   /*
      overloaded Constructor2
      @param nm string name(Super class: Person)
      @param gn string gender(Super class: Person)
      @param m string major
      @param gp string gpa
   */
   public Student(String nm, String gn, String m, double gp)
   {
      super(nm,gn);
      major = m;
      gpa = gp;
   }
   
   //Setter
   
   //@param m major
   public void setMajor(String m)
   {
       major = m;
   }
   //@param g gpa
   public void setGPA(double g)
   {
       gpa = g;
   }

  //Getter
   public String getMajor()
   {
      return major;
   }
 
   public double getGPA()
   {
      return gpa;
   }
   
   /*
   public void displayStudent() // display ourself
   {  
      super.displayPerson();
      System.out.println("Major: " + major);
      System.out.println("GPA: " + gpa);
   }
   */
   
}