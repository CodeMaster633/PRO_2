package Opg2.HashSet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Skole skole = new Skole("EAA");

        Studerende studerende1 = new Studerende(1,"Benjamin", Arrays.asList(2,4));
        Studerende studerende2 = new Studerende(2,"Loshan", Arrays.asList(2,10));
        Studerende studerende3= new Studerende(3,"Mikkel", Arrays.asList(12,4));

        skole.addStuderende(studerende1);
        skole.addStuderende(studerende2);
        skole.addStuderende(studerende3);

        System.out.println(skole);

    }
}
