public class PassByRefernce {
    public static void main(String[] args) {
        Employe emp=new Employe();
        System.out.println(emp);
        System.out.println(emp.name +" " +  emp.id +" "  + emp.salary);
        emp.name="Raji";
        emp.id=20;
        emp.salary=30000;
        System.out.println(emp.name +" " +  emp.id +" "  + emp.salary);

    }
    
}
