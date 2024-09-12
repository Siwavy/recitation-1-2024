import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest extends OutputTest {

    @Test
    @DisplayName("[1] Test Dispense 1")
    void dispense_1() {
        setTestInput("79.87");
        ATM.main(new String[]{});
        String expected = "79.87 contains:\n" +
                "3 in $20\n" +
                "1 in $10\n" +
                "1 in $5\n" +
                "4 in $1\n" +
                "3 in 25¢\n" +
                "1 in 10¢\n" +
                "0 in 5¢\n" +
                "2 in 1¢\n";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n" + expected + "\nActual:\n" + actual;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[1] Test Dispense 2")
    void dispense_2() {
        setTestInput("25");
        ATM.main(new String[]{});
        String expected = "25.0 contains:\n" +
                "1 in $20\n" +
                "0 in $10\n" +
                "1 in $5\n" +
                "0 in $1\n" +
                "0 in 25¢\n" +
                "0 in 10¢\n" +
                "0 in 5¢\n" +
                "0 in 1¢\n";
        String actual = getTestOutput();
        assertEquals(expected, actual);
    }

    void dispense_3() {
        setTestInput("98.99");
        ATM.main(new String[]{});
        String expected = "98.99 contains:\n" +
                "4 in $20\n" +
                "1 in $10\n" +
                "1 in $5\n" +
                "3 in $1\n" +
                "3 in 25¢\n" +
                "2 in 10¢\n" +
                "0 in 5¢\n" +
                "4 in 1¢\n";
        String actual = getTestOutput();
        assertEquals(expected, actual);
    }
}