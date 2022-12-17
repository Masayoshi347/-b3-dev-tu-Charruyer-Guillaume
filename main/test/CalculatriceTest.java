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

    @Test
    public void testCarre() {
        double result = Calculatrice.performScientificOperation("carré", 5);
        assertEquals(25, result, 0);
    }

    @Test
    public void testRacineCarree() {
        double result = Calculatrice.performScientificOperation("racine carrée", 9);
        assertEquals(3, result, 0);
    }

    @Test
    public void testPuissance() {
        double result = Calculatrice.performScientificOperation("puissance", 2, 3);
        assertEquals(8, result, 0);
    }
}
