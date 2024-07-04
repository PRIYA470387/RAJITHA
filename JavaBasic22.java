 class JavaBasic22 {
    //ststic variable
    static int a=10;
    //static Block
    static{
        System.out.println(a);
        a=20;
        System.out.println("static Block");
        System.out.println(a);
    }
    //static method
    static void staticDisplay(){
        a=30;
        System.out.println("static Method");
        System.out.println(a);

    }
    public static void main(String[] args) {
        int a=40;
        System.out.println("Main-static Method");
        System.out.println(a);
        System.out.println(JavaBasic22.a);
        staticDisplay();
    }
    
}
