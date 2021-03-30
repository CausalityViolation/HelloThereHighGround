package HelloThere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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

    @Test
    void ifNegative() {

        HelloThere mockTest = mock(HelloThere.class);

        doThrow(new IllegalArgumentException()).when(mockTest).printMethod(-1);

    }
}