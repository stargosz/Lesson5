package simpleTests.TestBase;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeEach
    void setUp() {
        System.out.println("This runs before every test case");

    }

    @AfterEach
    void tearDown() {
        System.out.println("This runs after every test case");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("This runs before everything else does");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This runs before everything else does");
    }
}
