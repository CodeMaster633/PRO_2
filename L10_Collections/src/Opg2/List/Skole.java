package Opg2.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skole {

    private String navn;
    private List<Studerende> studerendePåSkolen = new ArrayList<>();

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

        for (int i = 0; i < studerendePåSkolen.size(); i++) {
            if (studerendePåSkolen.get(i).getStudieNr() == studieNr) {
                aktuelStuderende = studerendePåSkolen.get(i);
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
