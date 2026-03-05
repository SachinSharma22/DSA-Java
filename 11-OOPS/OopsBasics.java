public class OopsBasics {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Blue");
        System.out.println(p.color);
    }
}

class Pen{
    String color;
    int tip;
    public void setColor(String newColor) {
        color = newColor;
    }
    public void setTip(int newTip){
        tip = newTip;
    }
} 
