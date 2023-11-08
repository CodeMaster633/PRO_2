package Opgave3.Cannibal;

import org.junit.platform.commons.util.ToStringBuilder;

public class Person {
    String navn;

    public Person(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return getNavn();
    }
}
