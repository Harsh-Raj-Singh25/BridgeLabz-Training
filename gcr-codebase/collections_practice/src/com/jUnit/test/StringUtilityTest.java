package com.jUnit.testStringUtilityMethods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityTest {
    StringUtility utils = new StringUtility();

    @Test
    void testReverse() {
        assertEquals("java", utils.reverse("avaj"));
        assertNull(utils.reverse(null));
    }

    @Test
    void testPalindrome() {
        assertTrue(utils.isPalindrome("Radar")); // Case-insensitive check
        assertTrue(utils.isPalindrome("madam"));
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testUpperCase() {
        assertEquals("HeLLO", utils.toUpperCase("hello"));
        assertEquals("JAVA", utils.toUpperCase("Java"));
    }
}