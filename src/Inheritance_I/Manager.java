package Inheritance_I;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    @Override
    public double getBaseSalary(){
        return super.getBaseSalary()+bonus;
    }
}
