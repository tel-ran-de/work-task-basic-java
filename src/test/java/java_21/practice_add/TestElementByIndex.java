package java_21.practice_add;

import java_21.practice.PracticeAdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestElementByIndex {

    @Test
    public void testGetElementByIndex () {
        int index = 1;
        int[] arr = {1,2,3};
        assertEquals(1, PracticeAdd.getElementByIndex(arr, index));
    }

    @Test
    public void testExceptionArrayIndexOutOfBoundsException () {
        int index = 10;
        int[] arr = {1,2,3};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> PracticeAdd.getElementByIndex(arr, index));
    }
}
