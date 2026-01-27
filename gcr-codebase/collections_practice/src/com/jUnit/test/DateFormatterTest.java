package com.jUnit.test;
import com.jUnit.com.advance_problems.dateFormatter.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {
    DateFormatter formatter = new DateFormatter();

    @ParameterizedTest
    @CsvSource({
        "2026-01-27, 27-01-2026",
        "2000-12-31, 31-12-2000",
        "1995-05-20, 20-05-1995"
    })
    void testValidDateFormats(String input, String expected) {
        assertEquals(expected, formatter.formatDate(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"27-01-2026", "2026/01/27", "not-a-date", ""})
    void testInvalidDateFormats(String invalidInput) {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(invalidInput));
    }
}
