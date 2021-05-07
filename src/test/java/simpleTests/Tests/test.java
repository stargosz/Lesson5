package simpleTests.Tests;

import org.junit.jupiter.api.Test;
import simpleTests.TestBase.TestBase;

import static org.junit.jupiter.api.Assertions.*;

public class test extends TestBase {

    @Test
    public void TestCase_1() {
        assertEquals("qwe", "qwe");
        System.out.println("---------------->This is my first test!!!");
    }

    @Test
    public void TestCase_2() {
        int i = 2;
        assertEquals(i, 2);
        assertEquals(2, 3);
        System.out.println("---------------->This is my second test!!!");
    }

    @Test
    public void TestCase_3() {
        assertEquals("qwe", "qwe");
        assertEquals(2, 2);
        System.out.println("---------------->This is my third test!!!");
    }
}
