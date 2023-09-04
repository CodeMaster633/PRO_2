package Del2_Opg3;

public class ArbejdsDreng extends Ansat {
    private int timelønsats;

    public ArbejdsDreng(String navn,String adresse,int timelønsats){
        super(navn,adresse,timelønsats);
        this.timelønsats=timelønsats;
    }

    public int getTimelønsats() {
        return timelønsats;
    }

    public void setTimelønsats(int timelønsats) {
        this.timelønsats = timelønsats;
    }

    public int beregnLoen(){return timelønsats*25;};
}
