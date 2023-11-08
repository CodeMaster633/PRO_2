package snackssupply;

import snacks.Limb;

import java.util.*;

public class SnackBar<E>
{
    public <E extends Comparable<E>> E[] sortSnacks(E[] snackContainer) {
        Arrays.sort(snackContainer);
        return snackContainer;


//        List<E> list = new ArrayList<>(Arrays.asList(snackContainer));
//        Collections.sort(list);
//
//        E[] result = (E[]) new Comparable[list.size()]; // Create a new array of the correct type
//
//        return list.toArray(result); // Copy elements from the list to the array
    }
}
