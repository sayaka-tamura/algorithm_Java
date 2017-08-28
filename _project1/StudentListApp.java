/*
   Name: Sayaka Tamura
   Class: CSC330-1200
   Prof: Mete Kok
   Project I 
   file name : StudentListApp.java
*/

class StudentListApp
{
   public static void main(String[] args)
   {
      StudentList theList = new StudentList(); // make list
      
      Student John = new Student("John");
      Student Ammy = new Student("Ammy", "Female", null, 0);
      Student Daniel = new Student();      
      Student Sophia = new Student("Sophia", "Female","MMP",3.4);
      
      StudentNode snJohn = new StudentNode(John);
      //StudentNode John = new StudentNode(new Student("John"));
      
      StudentNode snAmmy = new StudentNode(Ammy);
      //StudentNode Ammy = new StudentNode(new Student("Ammy", "Female", null, 0));
      
      StudentNode snDaniel = new StudentNode(Daniel);
      StudentNode snSophia = new StudentNode(Sophia);
      //StudentNode Sophia = new StudentNode(new Student("Sophia", "Female","MMP",3.4));
      
      /*
         should make new StudentNode for each student 
         before insert student to the LinkedList
         "Node" means put the order in the list,
         which node comes next
         "List" tells which node is head and tail 
      */
      
      /*
      //display John's StudentNode
      John.displayStudent();
      */
      
      //---------- for StudentListStack class ---------
      /*
      theList.insertStudentNode(snJohn); // insert 4 items
      theList.insertStudentNode(snAmmy);
      theList.insertStudentNode(snDaniel);
      theList.insertStudentNode(snSophia);
      //theList.insertStudent(new  Student("Sophia", "Female","MMP",3.4));
      
      theList.printStudentListByName(); // display list      
      
      
      theList.deleteStudentNode(snDaniel); // delete item         
      theList.printStudentListByName(); // display list
      
      
      StudentNode fn1 = theList.findStudentByName("Sophia");// find item
      if( fn1 != null)
         System.out.println("Found link with key " + fn1.getStudent().getName());
      else
         System.out.println("Can't find link");
      
      StudentNode fn2 = theList.findStudentByName("Steve");// find item
      if( fn2 != null)
         System.out.println("Found link with key " + fn2.getStudent().getName());
      else
         System.out.println("Can't find link");   
      */
      
      //----------for StudentLListStack class  ---------
      /*
      StudentLListStack theListStack = new StudentLListStack();
      
      theListStack.insertStudentNodeFirst(snJohn); // insert 4 items
      theListStack.insertStudentNodeFirst(snAmmy);
      theListStack.insertStudentNodeFirst(snDaniel);
      theListStack.insertStudentNodeFirst(snSophia);
      
      theListStack.displayList();
      
      theListStack.deleteStudentNodeFirst();
      
      theListStack.peek();
      
      theListStack.displayList();
      */
      
      //---------- for StudentLListQueue class ---------
      /*
      StudentLListQueue theSLListQueue = new StudentLListQueue();
      
      theSLListQueue.insert(snJohn);
      theSLListQueue.insert(snAmmy);
      theSLListQueue.insert(snDaniel);
      theSLListQueue.insert(snSophia);
      
      theSLListQueue.displayQueue();
      
      theSLListQueue.delete();
      
      theSLListQueue.displayQueue();
      */
      
      //---------- for StudentLListQue class ---------
      /*
      StudentLListQue theSLListQue = new StudentLListQue();
      
      theSLListQue.insertStudentNodeLast(snJohn);
      theSLListQue.insertStudentNodeLast(snAmmy);
      theSLListQue.insertStudentNodeLast(snDaniel);
      theSLListQue.insertStudentNodeLast(snSophia);
      
      theSLListQue.displayList();
      
      theSLListQue.deleteStudentNodeFirst();
      
      theSLListQue.displayList();
      */
      
      //---------- for StudentListArrayQueue class(imcomplete)---------
      /*
      StudentListArrayQueue theSLListAQue = new StudentListArrayQueue(4);
      
      theSLListAQue.insert(snJohn);
      theSLListAQue.insert(snAmmy);
      theSLListAQue.insert(snDaniel);
      theSLListAQue.insert(snSophia);
      
      theSLListAQue.displayList();
      
      theSLListAQue.delete();
      
      theSLListAQue.displayList();
      */
   } // end main()
} 

//Start from checking findStudentByName()method and customize?
