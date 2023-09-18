import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {

    @Test
    void beregnBøde_barn() {
        //Arragne
        Bibliotek bibliotek = new Bibliotek();
        int forventetBøde = 10;

        //Act
        int faktiskBøde = bibliotek.beregnBøde(null,null,false);

        //Assert
        assertEquals(forventetBøde,faktiskBøde);

    }

    @Test
    void beregnBøde_voksen() {
        //Arragne
        Bibliotek bibliotek = new Bibliotek();
        int forventetBøde = 20;

        //Act
        int faktiskBøde = bibliotek.beregnBøde(null,null,true);

        //Assert
        assertEquals(forventetBøde,faktiskBøde);

    }
}