package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized2 {
    private Utilities utilities;
    private String source;
    private String outputOfSource;

    public UtilitiesTestParameterized2(String source, String outputOfSource) {
        this.source = source;
        this.outputOfSource = outputOfSource;
    }

    @Before
    public void startUp() {
        utilities = new Utilities();
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
        assertEquals(outputOfSource, utilities.removePairs(source));
    }
}
