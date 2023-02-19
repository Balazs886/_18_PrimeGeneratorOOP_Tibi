package hu.ak_akademia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeGeneratorTest {
    @Test
    void TestNOK() {
        PrimeGenerator pg = new PrimeGenerator();
        assertFalse(pg.checkPrim(15));
    }

    @Test
    void TestOK() {
        PrimeGenerator pg = new PrimeGenerator();
        assertTrue(pg.checkPrim(5));
    }

    @Test
    void TestBigOK() {
        PrimeGenerator pg = new PrimeGenerator();
        assertTrue(pg.checkPrim(6361));
    }

    @Test
    void TestBigNOK() {
        PrimeGenerator pg = new PrimeGenerator();
        assertFalse(pg.checkPrim(6361000));
    }
}