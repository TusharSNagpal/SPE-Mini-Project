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
    public void powerTrueNegative() {
        assertNotEquals("Power function True Negative", 69, obj.power(2, 2), DELTA);
        assertNotEquals("Power function True Negative", -69420, obj.power(-2, 20), DELTA);
    }
}
