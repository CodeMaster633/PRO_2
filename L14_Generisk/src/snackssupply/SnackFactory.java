package snackssupply;

import snacks.Limb;
import snacks.Pez;
import snacks.Smartie;
import snacks.Snack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SnackFactory<E> {
    // TODO: Har ikke brugt kodeeksempel PAS PÅ

    public E[] getNewSnacks(E[] snackContainer) {
        List<E> list = new ArrayList<>(Arrays.asList(snackContainer));

        Random r = new Random();
        int mængde = r.nextInt(1, 10);

        for (int i = 0; i < mængde; i++) {
            Random r2 = new Random();
            int snacktype = r2.nextInt(1, 3);

            if (snacktype == 1) { //Limb
                Limb limb = new Limb();
                list.add((E)limb);
            } else if (snacktype == 2) {
                Pez pez = new Pez();
                list.add((E)pez);
            }else if (snacktype == 3) {
                Smartie smartie = new Smartie();
                list.add((E)smartie);
            }
        }

        E[] result = (E[]) new Comparable[list.size()]; // Create a new array of the correct type

        return list.toArray(result); // Copy elements from the list to the array
    }
}

