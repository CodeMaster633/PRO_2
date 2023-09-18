import forsikring.BilForsikring;
import org.junit.Test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BilForsikringTest {

    @org.junit.jupiter.api.Test
    void beregnPraemie_mand26_år1_skadefriÅr() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 26;
        int skadefriÅr = 1;
        boolean erKvinde = false;

        //Act
        double faktiskPreamie = bilForsikring.beregnPraemie(alder,erKvinde,skadefriÅr);

        //Assert
        assertEquals(bilForsikring.getGrundPraemie(),faktiskPreamie);
    }

    @org.junit.jupiter.api.Test
    void beregnPraemie_kvinde26_år1_skadefriÅr() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 26;
        int skadefriÅr = 1;
        boolean erKvinde = true;
        int forventetPræmie = 1050;

        //Act
        double faktiskPreamie = bilForsikring.beregnPraemie(alder,erKvinde,skadefriÅr);

        //Assert
        assertEquals(forventetPræmie,faktiskPreamie);
    }

    @org.junit.jupiter.api.Test
    void beregnPraemie_kvinde26_år1_skadefriÅr_fejl() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 26;
        int skadefriÅr = 1;
        boolean erKvinde = true;
        int forventetPræmie = 1050;

        //Act
        //Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,erKvinde,skadefriÅr);
        });
        assertEquals(exception.getMessage(), "Antal skade frie aer skal vaere positiv");

    }
}