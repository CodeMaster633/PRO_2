package Del2_Opg4;

import com.sun.source.doctree.SeeTree;

public class Cirkel extends Figur{

    private int radius;

    public Cirkel(int x, int y, int radius) {
        super(x, y);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getAreal(){
        return Math.PI*(radius*radius);
    }
}
