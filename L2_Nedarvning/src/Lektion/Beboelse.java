package Lektion;

public class Beboelse {

    private String adresse;
    private int kvm;

    public Beboelse (String adresse,int kvm){
        this.adresse=adresse;
        this.kvm=kvm;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getKvm() {
        return kvm;
    }

    public int getPris(){
        int pris = getKvm()*40;
        return pris;
    }

}
