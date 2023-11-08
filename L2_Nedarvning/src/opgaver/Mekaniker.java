package opgaver;

public class Mekaniker extends Person{
    private int svendeprøveÅr;
    private int timelønsats;

    public Mekaniker (String navn,String adresse,int svendeprøveÅr,int timelønsats){
        super(navn,adresse);
        this.svendeprøveÅr=svendeprøveÅr;
        this.timelønsats=timelønsats;
    }

    public int getSvendeprøveÅr() {
        return svendeprøveÅr;
    }

    public int getTimelønsats() {
        return timelønsats;
    }

    public void setSvendeprøveÅr(int svendeprøveÅr) {
        this.svendeprøveÅr = svendeprøveÅr;
    }

    public void setTimelønsats(int timelønsats) {
        this.timelønsats = timelønsats;
    }

    public int beregnLoen(){
        return getTimelønsats()*37;
    }
}
