package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {

    private C31 c31;

    @Before
    public void before() {
        c31 = new C31();
    }
    
    @Test
    public void testM1() {
        String getm1 = c31.m1();
        assertEquals("m1", getm1);
    }

    @Test
    public void testM2() {
        String getm2 = c31.m2();
        assertEquals("m2", getm2);
    }
}
