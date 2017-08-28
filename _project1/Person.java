/*
   Name: Sayaka Tamura
   Class: CSC330-1200
   Prof: Mete Kok
   Project I 
   file name : Person.java
*/

//Person class will be used to extend to Student class

public class Person
{
   private String name; 
   private String gender; 

   // -------------------------------------------------------------
   // constructor
   public Person()
   {
      name = null;
      gender = null;
   }
   
   /*
     Overloaded constructor
     @param n String name
     @param g String gender
   */
   public Person(String n, String g)
   {
      name = n;
      gender = g;
   }
   
   //Setter 
      
   //@param n String name
   public void setName(String n)
   {
      name = n;
   }
   //@param g String gender
   public void setGender(String g)
   {
      gender = g;
   }
   
   //Getter
   public String getName()
   {
      return name;
   }
   
   public String getGender(String g)
   {
      return gender;
   }
   
   /*
   public void displayPerson() // display ourself
   {
      System.out.println("Name: " + name);
      System.out.println("Gender: " + gender);
   }
   */
}