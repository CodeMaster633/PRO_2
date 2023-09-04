package Del2_Opg3;

import MiniOrderSystem.minihandel.PercentDiscount;

public abstract class Ansat extends Person {
    private int timelønsats;

    public Ansat(String navn, String adresse,int timelønsats) {
        super(navn, adresse);
        this.timelønsats=timelønsats;
    }

    public int getTimelønsats() {
        return timelønsats;
    }

    public void setTimelønsats(int timelønsats) {
        this.timelønsats = timelønsats;
    }

    public abstract int beregnLoen();

}
