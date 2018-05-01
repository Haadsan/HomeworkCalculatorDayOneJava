import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CalculatorTest {


    private Calculator testCalculator;


    @Before
    public void before(){ testCalculator = new Calculator(6, 2); }


    @Test
    public void testAdd(){
        assertEquals(8, testCalculator.add());
    }
    @Test
    public void testMultiply(){
        assertEquals(12, testCalculator.multiply());
    }

    @Test
    public void testDivide(){
        assertEquals(3, testCalculator.divide());
    }
    @Test
    public void testSubtract(){
        assertEquals(4, testCalculator.subtract());
    }


    //Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide, each taking in two integers to perform the calculations on.


}
