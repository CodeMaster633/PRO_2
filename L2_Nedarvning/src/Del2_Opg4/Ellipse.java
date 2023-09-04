package Del2_Opg4;

public class Ellipse extends Figur{
    private int radius1;
    private int radius2;

    public Ellipse(int x, int y, int radius1, int radius2) {
        super(x, y);
        this.radius1=radius1;
        this.radius2=radius2;
    }

    public int getRadius1() {
        return radius1;
    }
    public int getRadius2() {
        return radius2;
    }

    public void setRadius1(int radius) {
        this.radius1 = radius;
    }
    public void setRadius2(int radius) {
        this.radius2 = radius;
    }

    public double getAreal(){
        return Math.PI*(radius1*radius2);
    }
}
