package Inheritance_XII;

public class Test12 {
    public static void main(String[] args) {
        Person person = new Person("Saima",2003);
        Student student = new Student("Salma",2013,"CEO");
        Instructor instructor = new Instructor("Taina",2021,60000);
        // Person information
        System.out.println("Person Informatin:-");
        System.out.println(person.toString());
        //Student information
        System.out.println("Student information:-");
        System.out.println(student.toString());
        //Instructor information
        System.out.println("Instructor information:-");
        System.out.println(instructor.toString());
    }
}
