    import java.util.Scanner;
    public class Eligbleforvoteornot {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a age");
            int age=sc.nextInt();
            if(age>=18)
            {
                System.out.println("Eligble for vote");
            }
            else
            {
                System.out.println("Not eligble for vote");
            }
            
        }
    
}
