package Del2_Opg4;

public class Rektangel extends Figur{
    private int højde;
    private int længde;

    public Rektangel(int x, int y , int højde, int længde) {
        super(x, y);
        this.højde =højde;
        this.længde =længde;
    }

    public int getHøjde() {
        return højde;
    }

    public int getLængde() {
        return længde;
    }

    public void setHøjde(int højde) {
        this.højde = højde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public double getAreal(){
        return højde * længde;
    }
}
