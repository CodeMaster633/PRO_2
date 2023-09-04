package Opg1;

public class Chili implements Measurable{
    public String navn;
    public int styrke;

    public Chili(String navn, int styrke) {
        this.navn = navn;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public double getMeasure() {
        return styrke;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setStyrke(int styrke) {
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        return navn+" "+styrke;
    }
}
