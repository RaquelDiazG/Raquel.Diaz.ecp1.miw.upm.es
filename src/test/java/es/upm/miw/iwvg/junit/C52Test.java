package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

    private C52 c52;

    @Before
    public void before() {
        c52 = new C52();
    }
    
    @Test
    public void testMA() {
        String getmA = c52.mA();
        assertEquals("mA", getmA);
    }

}
