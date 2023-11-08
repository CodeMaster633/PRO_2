import org.junit.jupiter.api.Test;
import snacks.Limb;
import snackssupply.SnackBar;

import static org.junit.jupiter.api.Assertions.*;

class SnackBarTest {

    @Test
    void sortSnacks() {
        //Arrange
        SnackBar snackBar = new SnackBar();
        Limb limb1 = new Limb();
        Limb limb2 = new Limb();
        Limb limb3 = new Limb();
        Limb limb4 = new Limb();

        limb1.setWeight(10.5);
        limb2.setWeight(30);
        limb3.setWeight(20);
        limb4.setWeight(5);

        Limb[] snackList = {limb1,limb2,limb3,limb4};

        Comparable[] rigtigListe = {limb4,limb1,limb3,limb2};


        //Act
        Comparable[] faktiskListe = snackBar.sortSnacks(snackList);

        //Assert
        assertEquals(faktiskListe[0],rigtigListe[0]);
        assertEquals(faktiskListe[1],rigtigListe[1]);
        assertEquals(faktiskListe[2],rigtigListe[2]);
        assertEquals(faktiskListe[3],rigtigListe[3]);

    }
}