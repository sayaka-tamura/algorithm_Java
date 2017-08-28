//author: Sayaka Tamura
//file name: Gcd.java
//Calculate Greatest common factor and Least common multiple
/*
   Result
    6
 5
 35
 70
*/
public class Gcd {
  // Calculate Greatest common factor
  static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
    /*
       ternary oprator 
       minVal = (a < b) ? a : b;
       if the variable a is less than b, 
       minVal is assigned the value of a; 
       otherwise, minVal is assigned the value of b
    */
  }

  // Least common multiple
  static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }
  
  public static void main(String[] args) {
    System.out.println(gcd(42, 30));
    System.out.println(gcd(15, 70));
    System.out.println(lcm(5, 7));
    System.out.println(lcm(14, 35));
  }
}