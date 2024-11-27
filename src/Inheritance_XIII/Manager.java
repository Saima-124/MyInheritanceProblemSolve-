package Inheritance_XIII;

public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString(){
        return "Manager = [ Name = " + getName() + ", Salary " + getSalary() + ", Department = " + getDepartment() + "]";
    }
}
