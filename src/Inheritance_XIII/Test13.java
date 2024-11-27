package Inheritance_XIII;

public class Test13 {
    public static void main(String[] args) {
        Employee employee = new Employee("Saima",70000);
        Manager manager = new Manager("Salma",80000,"ME");
        Executive executive = new Executive("Taina",60000,"CSE");
        //Employee Information
        System.out.println("Employee Information");
        //System.out.println(employee.getName());
        System.out.println(employee.toString());
        //Manager Information
        System.out.println("Manager Information");
        System.out.println(manager.toString());
        //Executive Information
        System.out.println("Executive Information");
        System.out.println(executive.toString());


    }
}
