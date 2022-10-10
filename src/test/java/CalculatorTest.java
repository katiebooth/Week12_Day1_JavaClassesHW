import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(7,3);
    }
    @Test
    public void canAdd(){
        assertEquals(10,calculator.add());
    }

    @Test
    public void canMultiply(){
        assertEquals(21,calculator.multiply());
    }

    @Test
    public void canSubtract(){
        assertEquals(4,calculator.subtract());
    }
}
