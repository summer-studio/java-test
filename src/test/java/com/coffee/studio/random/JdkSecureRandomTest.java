package com.coffee.studio.random;

import org.junit.Test;

public class JdkSecureRandomTest {

    private JdkSecureRandom jdkSecureRandom = new JdkSecureRandom();

    @Test
    public void getRandom() {
        int value = jdkSecureRandom.getRandom();
        System.out.println(value);
    }
}
