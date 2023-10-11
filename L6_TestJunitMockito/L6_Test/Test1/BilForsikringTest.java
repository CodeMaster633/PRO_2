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
        int forventetPræmie = 950;

        //Act
        double faktiskPreamie = bilForsikring.beregnPraemie(alder,erKvinde,skadefriÅr);

        //Assert
        assertEquals(forventetPræmie,faktiskPreamie);
    }

    @org.junit.jupiter.api.Test
    void beregnPraemie_kvinde26_år1_skadefriÅr_fejl_skaderfri() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 26;
        int skadefriÅr = -1;
        boolean erKvinde = true;
        int forventetPræmie = 1050;

        //Act
        //Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,erKvinde,skadefriÅr);
        });
        assertEquals(exception.getMessage(), "Antal skade frie aer skal vaere positiv");

    }
    @org.junit.jupiter.api.Test
    void beregnPraemie_kvinde26_år1_skadefriÅr_fejl_alder() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 17;
        int skadefriÅr = 1;
        boolean erKvinde = true;
        int forventetPræmie = 1050;

        //Act
        //Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,erKvinde,skadefriÅr);
        });
        assertEquals(exception.getMessage(), "Du er for ung til at tegne en forsikring");

    }
}