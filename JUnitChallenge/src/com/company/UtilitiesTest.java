package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @Before
    public void startUp() {
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] charAfterMethod = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(charAfterMethod, new char[]{'e', 'l'});

        charAfterMethod = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 7);
        assertArrayEquals(charAfterMethod, new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    @Test
    public void removePairs() {

        String stringRemovedPair = utilities.removePairs("AABCDDEFF");
        assertEquals("ABCDEF", stringRemovedPair);

        stringRemovedPair = utilities.removePairs("ABCCABDEEF");
        assertEquals("ABCABDEF", stringRemovedPair);

        assertNull("Did not get null returned when argument passed was null",
                utilities.removePairs(null));

        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));

    }

    @Test
    public void converter() {
        int output = utilities.converter(10, 5);
        assertEquals(300, output);
        try {
            assertEquals(ArithmeticException.class, utilities.converter(10, 0));
//            utilities.converter(10, 0);
        } catch (ArithmeticException e) {

        }
    }

    @Test(expected = ArithmeticException.class)
    public void converter_ArithmeticException() {
//        assertEquals(ArithmeticException.class, utilities.converter(10, 0));
        utilities.converter(10, 0);
    }

    @Test
    public void nullIfOddLength() {
        String output = utilities.nullIfOddLength("KieuAnh");
        assertNull("Need to return null", output);
        String output2 = utilities.nullIfOddLength("KieuAnhCuteQua");
        assertEquals("KieuAnhCuteQua", output2);
        assertNotNull("KieuAnhCuteQua", output2);
    }
}