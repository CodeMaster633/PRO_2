package Del2_Opg3;

public class Mekaniker extends Ansat {
    private int svendeprøveÅr;

    public Mekaniker (String navn,String adresse,int svendeprøveÅr,int timelønsats){
        super(navn,adresse,timelønsats);
        this.svendeprøveÅr=svendeprøveÅr;
    }

    public int getSvendeprøveÅr() {
        return svendeprøveÅr;
    }

    public void setSvendeprøveÅr(int svendeprøveÅr) {
        this.svendeprøveÅr = svendeprøveÅr;
    }

    public final int beregnLoen(){
        return getTimelønsats()*37;
    }
}
