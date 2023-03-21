package org.example;

import static org.junit.Assert.*;
//import static org.junit.Assert.*;
import org.junit.Test;
//import org.testng.annotations.Test;

public class AppTest {
    App obj = new App();
    private static final double DELTA = 1e-15;

    @Test
    public void testPower(){
        assertEquals("Power function True Positive", 64.0, obj.power(2,6), DELTA);
    }

    @Test
    public void testSquareRoot(){
        assertEquals("Power function True Positive", 8.0, obj.squareRoot(64), DELTA);
    }

    @Test
    public void testNaturalLog(){
        assertEquals("Power function True Positive", 4.605170185988092, obj.naturalLog(100), DELTA);
    }

    @Test
    public void testFactorial(){
        assertEquals("Power function True Positive", 120, obj.factorial(5), DELTA);
    }
}
