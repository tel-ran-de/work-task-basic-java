package java_21.practice2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java_21.practice.Practice2;
import org.junit.jupiter.api.Test;

public class TestAccountNumber {
    @Test
    public void testCheckForInvalidBankAccountNumber() {

        assertFalse(Practice2.isValidAccountNumber(null));
        assertFalse(Practice2.isValidAccountNumber(""));
        assertFalse(Practice2.isValidAccountNumber("00000000000000"));
        assertFalse(Practice2.isValidAccountNumber("FI123450000000"));
        assertFalse(Practice2.isValidAccountNumber("1234567"));
    }

    @Test
    public void testCheckForValidBankAccountNumber() {
        assertTrue(Practice2.isValidAccountNumber("12345678901234"));
        assertTrue(Practice2.isValidAccountNumber("11223344551234"));
        assertTrue(Practice2.isValidAccountNumber("11022033012346"));
    }
}
