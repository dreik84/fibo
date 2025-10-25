package example.org;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FiboTest {

    private static int numOfElement;
    private static int numOfElementRecursive;

    @BeforeAll
    static void init() {
        numOfElement = 1;
        numOfElementRecursive = 1;
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181})
    void testFindFibo(long expected) {
        long actual = Fibo.findFibo(numOfElement++);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181})
    void testFindFiboRecursive(long expected) {
        long actual = Fibo.findFiboRecursive(numOfElementRecursive++);

        assertEquals(expected, actual);
    }
}
