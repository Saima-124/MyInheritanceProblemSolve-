package Inheritance_I;

public class Test1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Saima",70000);
        Manager manager = new Manager("Salma",80000,20000);
        System.out.println("Employee Information = " + employee.getName());
        System.out.println("Employee Information = " + employee.getBaseSalary());
        System.out.println("Manager Information = " + manager.getName());
        System.out.println("Manager Information = " + manager.getBonus());
        System.out.println("Manager Information = " + manager.getBaseSalary());

    }
}
