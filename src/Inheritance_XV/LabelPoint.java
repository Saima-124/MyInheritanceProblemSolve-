package Inheritance_XV;

public class LabelPoint {
    public int x;
   public int y;
   public String label;

    public LabelPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }
    public String toString(){
        return "LabelPoint [x = " + x + ", y = " + y + ", label = " + label + "]";
    }
}
