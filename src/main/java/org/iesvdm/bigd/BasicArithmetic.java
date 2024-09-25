package org.iesvdm.bigd;

import java.math.BigDecimal;

public class BasicArithmetic {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("4.2");

        BigDecimal sum = num1.add(num2);
        BigDecimal difference = num1.subtract(num2);
        BigDecimal product = num1.multiply(num2);
        BigDecimal quotient = num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP); // Rounding required

        System.out.println("Sum: " + sum);              // Output: 14.7
        System.out.println("Difference: " + difference);// Output: 6.3
        System.out.println("Product: " + product);      // Output: 44.10
        System.out.println("Quotient: " + quotient);    // Output: 2.50
    }


}
