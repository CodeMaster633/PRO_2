package Opg3;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StuderendeComparator implements Comparator {

//    private Set<Studerende> liste = new TreeSet();
    @Override
    public int compare(Object o1, Object o2) {

        Studerende s1 = (Studerende) o1;
        Studerende s2 = (Studerende) o1;

        return s1.getNavn().compareTo(s2.getNavn());
    }
}
