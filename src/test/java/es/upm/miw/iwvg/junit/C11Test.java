package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

    private C11 c11;

    @Before
    public void before() {
        c11 = new C11();
    }

    @Test
    public void testM1() {
        String getm1 = c11.m1();
        assertEquals("m1", getm1);
    }
    
    @Test
    public void testM2() {
        String getm2 = c11.m2();
        assertEquals("m2", getm2);
    }
}
