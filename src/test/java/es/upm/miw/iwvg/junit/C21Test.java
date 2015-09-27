package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C21Test {

    private C21 c21;

    @Before
    public void before() {
        c21 = new C21();
    }
    
    @Test
    public void testM1() {
        String getm1 = c21.m1();
        assertEquals("m1", getm1);
    }

    @Test
    public void testM2() {
        String getm2 = c21.m2();
        assertEquals("m2", getm2);
    }
}
