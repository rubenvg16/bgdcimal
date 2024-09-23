package org.iesvdm.bigd;

import java.math.BigDecimal;

public class Negative {

    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("-123.456");

        // Convert to absolute value
        BigDecimal absoluteValue = num.abs();

        // Negate the value
        BigDecimal negatedValue = num.negate();

        System.out.println("Absolute Value: " + absoluteValue);  // Output: 123.456
        System.out.println("Negated Value: " + negatedValue + num);    // Output: 123.456
    }

}
