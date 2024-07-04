public class InstanceExample {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s1.name +" " + s1.rollno );


        s1.name="Raji";
        s1.rollno=101;
        System.out.println(s1.name +" " + s1.rollno );

    }
    
}
