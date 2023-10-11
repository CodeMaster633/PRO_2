package Opg2.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Skole {

    private String navn;
    private Map<Integer,Studerende> studerendePåSkolen = new HashMap();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
            studerendePåSkolen.put(studerende.getStudieNr(),studerende);
    }

    public void removeStuderende(Studerende studerende) {
            studerendePåSkolen.remove(studerende);
    }

    public double gennemsnit() {
        double sum = 0;
        for (Studerende stu : studerendePåSkolen.values()) {
            sum = +stu.getGennemsnit();
        }
        return sum / studerendePåSkolen.size();
    }

    public Studerende findStuderende(int studieNr) {

        Studerende aktuelStuderende = null;

        for (Studerende studerende : studerendePåSkolen.values()) {
            if (studerende.getStudieNr() == studieNr) {
                aktuelStuderende = studerende;
            }
        }
        return aktuelStuderende;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "\nnavn='" + navn + '\'' +
                ", \nstuderendePåSkolen=" + studerendePåSkolen +
                '}';
    }
}
