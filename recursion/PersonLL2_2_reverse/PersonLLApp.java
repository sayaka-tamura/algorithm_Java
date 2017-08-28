/*
   author: Sayaka Tamura
   file name: PersonLLApp.java
   Result:
    JOE
    BILL
    JANE
    JILL
    
    JILL
    JANE
    BILL
    JOE
    
    JOE
    BILL
    JANE
    JILL
*/

public class PersonLLApp
{
   PersonsNode plhead;
   public PersonLLApp()
   {
      plhead= null;
   }
   public PersonsNode getplhead()
   {  return(plhead); }
   public void insert(PersonsNode pn)
   {
      PersonsNode pit;
      if(plhead == null)
         plhead = pn;
      else
      {
         pit=plhead;
         while(pit.getNext() != null)
            pit=pit.getNext();
         pit.setNext(pn);
      }
         
   }
   public void delete()
   {
      PersonsNode pit;
      if(plhead != null)
         plhead = plhead.getNext();
   }
 
   public void list()
   {
      PersonsNode pit;
      if(plhead != null)
      {
         pit=plhead;
         while(pit != null)
         {
            System.out.println(pit.getPerson().getName());
            pit=pit.getNext();
         }
      }
      else
         System.out.println("EMPTY LIST");
   }
   public void revlist()
   {
      PersonsNode last, prev, it;
      if(plhead != null)
      {
         last=plhead;
         prev = plhead;
         while(last != null)
            last=last.getNext();
         while(last!=plhead)
         {
            prev = plhead;
            while (prev.getNext() != last)
                   prev=prev.getNext();
            System.out.println(prev.getPerson().getName());
            last = prev;
         }
      }
   }


   public static void main(String args[])
   {
      PersonLLApp pll = new PersonLLApp();
      pll.insert(new PersonsNode( new Person("JOE","M") ));
      pll.insert(new PersonsNode( new Person("BILL","M") ));
      pll.insert(new PersonsNode( new Person("JANE","F") ));
      pll.insert(new PersonsNode( new Person("JILL","F") ));
      pll.list();
      System.out.println();
      pll.revlist();
      System.out.println();
      pll.list();
      System.out.println();
   }
}