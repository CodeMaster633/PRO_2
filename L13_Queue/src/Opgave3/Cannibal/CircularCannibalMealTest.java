package Opgave3.Cannibal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularCannibalMealTest {

    @Test
    void addPerson() {
        //Arrange
        CircularCannibalMeal circularCannibalMeal = new CircularCannibalMeal();
        Person p1 = new Person("Benjamin");
        Person p2 = new Person("Jørgen");

        //Act
        circularCannibalMeal.addPerson(p1);
        circularCannibalMeal.addPerson(p2);

        //Assert
        assertEquals(circularCannibalMeal.getPersonsDancing().get(0),p1);

        assertEquals(circularCannibalMeal.getPersonsDancing().get(1),p2);

    }

    @Test
    void eatRandomPerson() {
        //Arrange
        CircularCannibalMeal circularCannibalMeal = new CircularCannibalMeal();
        circularCannibalMeal.addPerson(new Person("Benjamin"));
        circularCannibalMeal.addPerson(new Person("Børge"));
        circularCannibalMeal.addPerson(new Person("Vera"));
        circularCannibalMeal.addPerson(new Person("Eigil"));
        circularCannibalMeal.addPerson(new Person("Erik"));
        circularCannibalMeal.addPerson(new Person("Bertram"));
        circularCannibalMeal.addPerson(new Person("Mikkel"));
        circularCannibalMeal.addPerson(new Person("Lohsan"));
        circularCannibalMeal.addPerson(new Person("Din mor"));


        //Act
        circularCannibalMeal.eatRandomPerson();

        //Assert
        assertEquals(circularCannibalMeal.getPersonsDancing().size(),8);

    }

    @Test
    void eatNextPerson() {
        //Arrange
        CircularCannibalMeal circularCannibalMeal = new CircularCannibalMeal();
        circularCannibalMeal.addPerson(new Person("Benjamin"));
        circularCannibalMeal.addPerson(new Person("Børge"));
        circularCannibalMeal.addPerson(new Person("Vera"));
        circularCannibalMeal.addPerson(new Person("Eigil"));
        circularCannibalMeal.addPerson(new Person("Erik"));
        circularCannibalMeal.addPerson(new Person("Bertram"));
        circularCannibalMeal.addPerson(new Person("Mikkel"));
        circularCannibalMeal.addPerson(new Person("Lohsan"));
        circularCannibalMeal.addPerson(new Person("Din mor"));
        circularCannibalMeal.eatRandomPerson();

        //Act
        circularCannibalMeal.eatNextPerson(2);

        //Assert
        assertEquals(circularCannibalMeal.getPersonsDancing().size(),7);


    }
}