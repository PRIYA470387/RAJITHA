  import java.io.*;
  public class Assignmentoperator {
    public static void main(String[] args) {
        int num;
        String name;

        num=10;
        name="bujji";
        System.out.println("num is assigined=" + num);
        System.out.println("Name is assigined="+name);

        //Declearing variables
        int num1=10; 
        int num2=15;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        //add assiging values
        num1 += num2;
 
      System.out.println("num1="+num1);

      //subtraction&assiging values
      num1-=num2;
      System.out.println("num1="+num1);

      //multiplicaton and assigined values
      num1*=num2;
      System.out.println("num1="+num1);

      //division and assigineg values
      num1/=num2;
      System.out.println("num1="+num2);
    }
    
}
