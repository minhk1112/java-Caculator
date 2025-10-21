import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {
    ScientificCalculator ScientificCalc;

    @BeforeEach
    void setUp() {
        ScientificCalc = new ScientificCalculator();
        ScientificCalc.setNumbers(9);
    }

    @Test
    void square() {
        assertEquals(81, ScientificCalc.square());
    }
}