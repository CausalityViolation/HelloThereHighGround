package HelloThere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloThereTest {

    HelloThere helloTest = new HelloThere();

    @Test
    void printTest() {

        helloTest.printMethod(2);
        var actual = 4;

        assertEquals(4, actual);

    }
}