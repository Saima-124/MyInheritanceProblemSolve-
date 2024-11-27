package Inheritance_XV;
import java.awt.Point;
public class LabelPoint1 {
    public Point location;
    public String label;

    public LabelPoint1(int x,int y, String label) {
        this.location = new Point(x,y);
        this.label = label;
    }
    public String toString(){
        return "LabelPont1[ location = " + location.toString() + ", label = " + label + "]";
    }
}
