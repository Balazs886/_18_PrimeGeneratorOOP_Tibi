package hu.ak_akademia;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeGeneratorTest {
    @Test
    void Test1() {
        PrimeGenerator pg = new PrimeGenerator();
        Assert.assertFalse(pg.isHasNextStep());

    }

    @Test
    public void Test2() {
        assertFalse(PrimeGenerator.isPrime(15));
    }
    @Test
    public void Test3() {
        assertTrue(PrimeGenerator.isPrime(5));
    }
}