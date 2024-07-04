import java.util.Scanner;

 public class Addtwonumbers {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = a+b;
        System.out.println(a+b);
        System.out.println(c);
        int sub = c-10;
        System.out.println(sub);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc1.nextLine();
        System.out.println("The String is:"+str);
        System.out.println("The number is :"+number);
        
        Scanner sc1Scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter second number");
        int number2=sc2.nextInt();

        int add=number1+number2;
        System.out.println("The addition of two numbers:"+add);
        
        Scanner sc1Scanner2=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnumber=sc1Scanner2.nextInt();
        Scanner sc2Scanner=new Scanner(System.in);
        System.out.println("Enter second number");
        int secondnumber=sc2Scanner.nextInt();

        int subtraction=firstnumber-secondnumber;
        System.out.println("The subtraction of two numbers:"+subtraction);
         
        Scanner sc3Scanner2=new Scanner(System.in);
        System.out.println("Enter first number");
        int sc3=sc1Scanner2.nextInt();
        Scanner sc4Scanner=new Scanner(System.in);
        System.out.println("Enter second number");
        int sc4=sc2Scanner.nextInt();

         int multiplication =sc3*sc4;
         System.out.println("The multiplication of two numbers:"+multiplication);
        

         Scanner sc5=new Scanner(System.in);
         System.out.println("Enter first number");
         int sc51=sc5.nextInt();
         Scanner sc6=new Scanner(System.in);
         System.out.println("Enter second number");
         int sc61=sc6.nextInt();

         int division=sc51/sc61;
         System.out.println("The division of two numbers:"+division);

         int module=sc51%sc61;
         System.out.println("The modules of two numbers:"+module);



           

           




        
        
        
        

         



    }
    
}
