package Inheritance_XIV;

public class Test14 {
    public static void main(String[] args) {
        BetterRectangle rectangle = new BetterRectangle(3,7,13,17);
        System.out.println("Area is = " + rectangle.getArea());
        System.out.println("Perimeter is = " + rectangle.getPerimeter());
        System.out.println("Location is = " + rectangle.getLocation());
        System.out.println("Size is = " + rectangle.getSize());
    }
}
