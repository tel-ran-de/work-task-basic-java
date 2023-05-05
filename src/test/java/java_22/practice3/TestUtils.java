package java_22.practice3;

import java_22.practice.practice3.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUtils {
    @Test
    public void testCompareWinnerNumbers() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        Assertions.assertEquals(5, Utils.compareWinnerNumbers(arr1, arr2));
    }
}
