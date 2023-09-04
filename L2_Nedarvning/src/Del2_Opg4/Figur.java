package Del2_Opg4;

public abstract class Figur {

    private int x;
    private int y;

    public Figur(int x,int y) {
        this.x = x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void parallelforskyd(int deltaX, int deltaY){
        this.x += deltaX;
        this.y += deltaY;

    }

    public abstract double getAreal();


}
