package Inheritance_XIV;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
        setLocation(x,y);
        setSize(width,height);
    }
    public double getPerimeter(){
        return 2*(getWidth()+getHeight());
    }
    public double getArea(){
        return getWidth()*getHeight();
    }
    public String toString(){
        return "BetterRectangle [x =" + getX() + ", y = " + getY() + ", width = " + getWidth() + ", height = " + getHeight()+ ", area = " + getHeight() + ", perimeter = " + getPerimeter()  + "]";
    }
}
