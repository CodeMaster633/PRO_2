package opgaver;

public class Værkfører extends Mekaniker {
    private int udnævnelsesÅr;
    private int tillæg;

    public Værkfører(String navn, String adresse, int svendeprøveÅr, int timelønsats, int udnævnelsesÅr, int tillæg) {
        super(navn, adresse, svendeprøveÅr, timelønsats);
        this.udnævnelsesÅr = udnævnelsesÅr;
        this.tillæg = tillæg;
    }

    public int getUdnævnelsesÅr() {
        return udnævnelsesÅr;
    }

    public int getTillæg() {
        return tillæg;
    }

    public void setUdnævnelsesÅr(int udnævnelsesÅr) {
        this.udnævnelsesÅr = udnævnelsesÅr;
    }

    public void setTillæg(int tillæg) {
        this.tillæg = tillæg;
    }

    @Override
    public int beregnLoen() {
        return super.beregnLoen()+getTillæg()*37;
    }
}
