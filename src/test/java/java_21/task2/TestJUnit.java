package java_21.task2;


import java_21.tasks.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJUnit {

    /*
    int[] arr;

    @BeforeEach
    void init() {
        arr = new int[]{1, 2, 3};
    }
     */

    @Test
    void getNumbersAssertEqualsTest() {
        int[] arr = {1,2,3};
        Assertions.assertEquals(arr, Utils.getNumbers());
    }

    @Test
    void getNumbersAssertArrayEqualsTest() {
        int[] arr = {1,2,3};
        Assertions.assertEquals(arr, Utils.getNumbers());
    }

    @Test
    void getNumbersSizeTest() {
        int[] arr = {1,2,3};
        Assertions.assertEquals(arr.length, Utils.getNumbers().length);
    }
}
