   import java.io.*;
   public class Logicaloperator {
    public static void main(String[] args) {

          int a = 10, b = 20, c = 20, d = 0;

          System.out.println("Var1 = " + a);
          System.out.println("Var2 = " + b);
          System.out.println("Var3 = " + c);

          if ((a < b) && (b == c)) {
              d = a + b + c;
              System.out.println("The sum is: " + d);
          }
 
          // Displaying a, b, c
          System.out.println("Var1 = " + a);
          System.out.println("Var2 = " + b);
          System.out.println("Var3 = " + c);
          System.out.println("Var4 = " + d);

   
          // using logical OR to verify
          // two constraints
          if (a > b || c == d)
              System.out.println(
                  "One or both + the conditions are true");
          else
              System.out.println(
                  "Both the + conditions are false");


 
        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }



    
           
         
    }
    

