package Del2_Opg3;

public class Værkfører extends Ansat {
    private int udnævnelsesÅr;
    private int tillæg;


    public Værkfører(String navn, String adresse, int timelønsats, int udnævnelsesÅr, int tillæg) {
        super(navn, adresse,timelønsats);
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


    public int beregnLoen(){
        return (getTimelønsats()+getTillæg())*37;
    }

}
