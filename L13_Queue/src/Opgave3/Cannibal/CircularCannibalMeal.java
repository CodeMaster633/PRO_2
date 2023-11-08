package Opgave3.Cannibal;

import java.util.ArrayList;

public class CircularCannibalMeal {
    private ArrayList<Person> personsDancing = new ArrayList<>();
    int currentNumber;

    public CircularCannibalMeal() {
    }

    void addPerson(Person p) {
        personsDancing.add(p);
    }

    // Adds person to the cannibal dance meal
    Person eatRandomPerson() {    // Removes random person from the cannibal dance
        currentNumber = (int) ((Math.random() *  personsDancing.size()));
        Person person = personsDancing.get(currentNumber);
        personsDancing.remove(currentNumber);

        return person;
    }

    //TODO Virker ikke helt (eatNextPerson)
    Person eatNextPerson(int count) {    // Removes person "count" places from the last eaten
        Person person = null;
        if(currentNumber+count>personsDancing.size()){
           currentNumber = currentNumber+count-personsDancing.size();
           person = personsDancing.get(currentNumber);
           personsDancing.remove(currentNumber);
        }else {
           person = personsDancing.get(currentNumber + count);
           personsDancing.remove(currentNumber + count);
        }
        return person;
    }

    void printPersons() {
        System.out.println();
        for (int i = 0; i < personsDancing.size(); i++) {
            System.out.print(personsDancing.get(i)+", ");
        }
    }// Prints all persons waiting to be served

    public ArrayList<Person> getPersonsDancing() {
        return personsDancing;
    }
}
