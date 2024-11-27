package Inheritance_XII;

public class Instructor extends Person{
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return "Instructor[ Name = " + getName() + ", Year of Birth = " + getYearOfBirth() + ", Salary = " + getSalary() + "]";
    }
}
