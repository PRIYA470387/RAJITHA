public class PassByValues {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
         int b=a;
        System.out.println(b);
         b=100;
        System.out.println(b);
        System.out.println(a);
    }
    
}
