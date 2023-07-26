package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TemplateTest {
//release
    @ParameterizedTest
    @ValueSource(strings = {"abc", "123", "Hello world!"})
    @DisplayName("Reverse test")
    void reverseString(String text) {
        Template template = new Template();
        StringBuilder builder = new StringBuilder(text);
        var actual = template.reverseString(text);
        var expected = builder.reverse().toString();
        assertEquals(expected, actual);
    }
}