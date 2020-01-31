package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities utilities;
    private String source;
    private String expectedOutputOfSource;

    public UtilitiesTestParameterized(String source, String expectedOutputOfSource) {
        this.source = source;
        this.expectedOutputOfSource = expectedOutputOfSource;
    }

    @Before
    public void setUp() {
        utilities = new Utilities();
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @Test
    public void removePairs() {
        assertEquals(expectedOutputOfSource, utilities.removePairs(source));
    }
}
