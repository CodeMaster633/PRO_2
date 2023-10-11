package Opg2.List;

import java.util.List;

public class Studerende {

    private int studieNr;
    private String navn;
    private List karakterer;

    public Studerende(int studieNr, String navn, List karakterer) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakterer = karakterer;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter){
        karakterer.add(karakter);
    }

    public List getKarakterer() {
        return karakterer;
    }

    public double getGennemsnit(){
        int sum = 0;
        for (int i = 0; i < getKarakterer().size(); i++) {
            sum=+ (int) getKarakterer().get(i);
        }

        return sum / getKarakterer().size();
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                ", karakterer=" + karakterer +
                '}';
    }
}
