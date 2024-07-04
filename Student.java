public class Student {
    //instance variable

    String name = "Raji";
    int rollno = 101;


    // Static Block

    static {
        System.out.println("Static -Block");
    }
    // Instance Block
    {
        System.out.println("Instance-Block");
        name = "Raji1";
        rollno = 102;

    }
    // no arguments constructor

    Student() {
        System.out.println("No aguments constructor");
    
    }
    // parametereised constructor

    Student(String n, int r) {
        System.out.println("Constructor(String, int)");
        name=n;
        rollno=r;
       
    }

}
