package Del2_Opg4;

public class Kvadrat extends Figur{
    private int sidelængde;

    public Kvadrat(int x, int y , int sidelængde) {
        super(x, y);
        this.sidelængde=sidelængde;

    }

    public int getSidelængde() {
        return sidelængde;
    }

    public void setSidelængde(int sidelængde) {
        this.sidelængde = sidelængde;
    }

    public double getAreal(){
        return Math.pow(sidelængde,2);
    }
}
