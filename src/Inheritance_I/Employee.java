package Inheritance_I;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String newName) {
        this.name =newName;
    }

    public void setBaseSalary(double newBaseSalary) {
        this.baseSalary = newBaseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
