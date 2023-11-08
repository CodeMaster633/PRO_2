package stacktest;

import org.junit.jupiter.api.Test;
import stack.Validator;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validataBrackets() {
        //Arrange
        Validator validator = new Validator();

        //Act and Assert
        assertEquals(false,validator.validataBrackets("Hello  (}){"));

    }
    @Test
    void validataBrackets2() {
        //Arrange
        Validator validator = new Validator();

        //Act and Assert
        assertEquals(true,validator.validataBrackets("(3+{5{99{*}}[23[{67}67]]})"));

    }
    @Test
    void validataBrackets3() {
        //Arrange
        Validator validator = new Validator();

        //Act and Assert
        assertEquals(false,validator.validataBrackets("((}}"));

    }

    @Test
    void validataBrackets4() {
        //Arrange
        Validator validator = new Validator();

        //Act and Assert
        assertEquals(false,validator.validataBrackets("())"));

    }

    @Test
    void validataBrackets5() {
        //Arrange
        Validator validator = new Validator();

        //Act and Assert
        assertEquals(true,validator.validataBrackets("((jhgg))[[]]{{}}"));

    }
}