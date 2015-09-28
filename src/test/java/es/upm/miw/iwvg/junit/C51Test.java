package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

    private C51 c51;

    @Before
    public void before() {
        c51 = new C51();
    }
    
    @Test
    public void testM1() {
        String getm1 = c51.m1();
        assertEquals("m1", getm1);
    }

    @Test
    public void testM2() {
        String getm2 = c51.m2();
        assertEquals("m2", getm2);
    }
}
