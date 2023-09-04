package Del2_Opg3;

public class Synsmand extends Mekaniker {
    private int synPrUge;
    private int tillæg;

    public Synsmand(String navn, String adresse, int svendeprøveÅr, int timelønsats, int synPrUge, int tillæg) {
        super(navn, adresse, svendeprøveÅr, timelønsats);
        this.synPrUge = synPrUge;
        this.tillæg = tillæg;
    }

    public int getsynPrUge() {
        return synPrUge;
    }

    public int getTillæg() {
        return tillæg;
    }

    public void setsynPrUge(int synPrUge) {
        this.synPrUge = synPrUge;
    }

    public void setTillæg(int tillæg) {
        this.tillæg = tillæg;
    }

}
