import main.src.Calculatrice;

public class ScientificCalculatorTest {
  @Test
  public void testAddition() {
    Calculatrice calculator = new Calculatrice();
    double result = calculator.add(5, 6);
    assertEquals(11, result, 0);
  }

  @Test
  public void testSoustraction() {
    Calculatrice calculator = new Calculatrice();
    double result = calculator.subtract(5, 6);
    assertEquals(-1, result, 0);
  }

  @Test
  public void testMultiplication() {
    Calculatrice calculator = new Calculatrice();
    double result = calculator.multiply(5, 6);
    assertEquals(30, result, 0);
  }

  @Test
  public void testDivision() {
    Calculatrice calculator = new Calculatrice();
    double result = calculator.divide(5, 6);
    assertEquals(0.8333333333333334, result, 0);
  }

  @Test
  public void testModulo() {
    ScientificCalculator calculator = new Calculatrice();
    double result = calculator.modulo(5, 6);
    assertEquals(5, result, 0);
  }
}