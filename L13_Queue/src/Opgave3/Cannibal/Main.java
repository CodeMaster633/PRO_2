package Opgave3.Cannibal;

import deque.CircularArrayDeque;

public class Main {
    public static void main(String[] args) {
        CircularCannibalMeal circle1 = new CircularCannibalMeal();

        circle1.addPerson(new Person("Benjamin"));
        circle1.addPerson(new Person("Børge"));
        circle1.addPerson(new Person("Vera"));
        circle1.addPerson(new Person("Eigil"));
        circle1.addPerson(new Person("Erik"));
        circle1.addPerson(new Person("Bertram"));
        circle1.addPerson(new Person("Mikkel"));
        circle1.addPerson(new Person("Lohsan"));
        circle1.addPerson(new Person("Din mor"));
        circle1.addPerson(new Person("Knud"));
        circle1.addPerson(new Person("fdsf"));
        circle1.addPerson(new Person("fff"));

        circle1.printPersons();

        circle1.eatRandomPerson();
        circle1.printPersons();
        circle1.eatNextPerson(3);
        circle1.printPersons();
        circle1.eatNextPerson(3);
        circle1.printPersons();
        circle1.eatNextPerson(3);
        circle1.printPersons();

        //TODO Virker ikke helt
        // og Mangler unittest


    }
}
