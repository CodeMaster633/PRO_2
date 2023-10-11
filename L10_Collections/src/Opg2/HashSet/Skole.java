package Opg2.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Skole {

    private String navn;
    private Set<Studerende> studerendePåSkolen = new HashSet<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        if (!studerendePåSkolen.contains(studerende)) {
            studerendePåSkolen.add(studerende);
        }
    }

    public void removeStuderende(Studerende studerende) {
        if (studerendePåSkolen.contains(studerende)) {
            studerendePåSkolen.remove(studerende);
        }
    }

    public double gennemsnit() {
        double sum = 0;
        for (Studerende stu : studerendePåSkolen) {
            sum = +stu.getGennemsnit();
        }
        return sum / studerendePåSkolen.size();
    }

    public Studerende findStuderende(int studieNr) {

        Studerende aktuelStuderende = null;

        for (Studerende studerende : studerendePåSkolen) {
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
