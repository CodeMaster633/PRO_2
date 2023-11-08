import org.junit.jupiter.api.Test;
import snacks.Limb;
import snacks.Snack;
import snackssupply.SnackFactory;

import static org.junit.jupiter.api.Assertions.*;

class SnackFactoryTest {

    // TODO: Har ikke brugt kodeeksempel PAS PÅ

    @Test
    void getNewSnacks() {
        //Arrange
        SnackFactory snackFactory = new SnackFactory();
        Limb limb1 = new Limb();

        Snack[] snackList = {limb1};

        //Act
        Object[] faktiskListe = snackFactory.getNewSnacks(snackList);

        //Assert
        assertNotEquals(faktiskListe.length,snackList.length);

        assertEquals(faktiskListe.length<12,true);

        assertEquals(faktiskListe.length>1,true);



    }
}