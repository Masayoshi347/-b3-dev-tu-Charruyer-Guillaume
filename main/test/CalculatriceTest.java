import org.junit.Test;

import main.src.Calculatrice;

import static org.junit.Assert.*;

public class CalculatriceTest {

    @Test
    public void testAddition() {
        double result = Calculatrice.performOperation(5, "+", 6);
        assertEquals(11, result, 0);
    }

    @Test
    public void testSoustraction() {
        double result = Calculatrice.performOperation(5, "-", 6);
        assertEquals(-1, result, 0);
    }

    @Test
    public void testMultiplication() {
        double result = Calculatrice.performOperation(5, "*", 6);
        assertEquals(30, result, 0);
    }

    @Test
    public void testDivision() {
        double result = Calculatrice.performOperation(6, "/", 3);
        assertEquals(2, result, 0);
    }

    @Test
    public void testModulo() {
        double result = Calculatrice.performOperation(7, "%", 3);
        assertEquals(1, result, 0);
    }


}