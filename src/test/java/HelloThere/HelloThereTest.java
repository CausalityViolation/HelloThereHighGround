package HelloThere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloThereTest {

    HelloThere helloTest = new HelloThere();

    @Test
    void printTest() {

        assertFalse(helloTest.printMethod(2));

    }

    @Test
    void highGroundTest() {

        assertTrue(helloTest.printMethod(11));

    }
}