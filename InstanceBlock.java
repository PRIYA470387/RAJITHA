public class InstanceBlock {
    int x=10;
    {
      System.out.println("Instance Block");
    }
    
    public static void main(String[] args) {
        Testing tobj=new Testing();
        InstanceBlock ib=new InstanceBlock();
        System.out.println(ib.x);
        System.out.println(tobj.x);
        tobj.testDisplay();
    }
}
