   import java.util.Scanner;
   public class Biggest3number {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         if(a>b&&a>c) 
         {
            System.out.println("The number a is big");
         }
         else if(b>c)
         {
            System.out.println("The number b is big");
         }
         else
         {
            System.out.println("The number c is big");
         }

        }

    
}
