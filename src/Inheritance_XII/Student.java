package Inheritance_XII;

public class Student extends Person{
    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    @Override
    public String toString(){
        return "Student[ Name = " + getName() + ", Year of Birth = " + getYearOfBirth() + ", Major = " + getMajor() + "]";
    }
}
