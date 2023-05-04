package java_21.practice1;

import java_21.practice.Practice1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFindMax {
    @Test
    public void testFindMax() {
        assertEquals(4, Practice1.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-1, Practice1.findMax(new int[]{-12, -1, -3, -4, -2}));
    }
}
