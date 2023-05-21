package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {
        private final String sex;
        private final boolean hasMane;

        public ParameterizedLionTest(String sex, boolean hasMane) {
            this.sex = sex;
            this.hasMane = hasMane;
        }
        @Parameterized.Parameters
        public static Object[][] lionTestData() {
            return new Object[][] {
                    { "Самец", true},
                    { "Самка", false }
            };
        }
    @Test
    public void doesHaveManeReturnCorrectValue() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualMane = lion.doesHaveMane();
        boolean expectedMane = hasMane;
        Assert.assertEquals(expectedMane, actualMane);
    }
}