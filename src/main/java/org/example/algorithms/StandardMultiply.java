package org.example.algorithms;

import java.math.BigInteger;

public class StandardMultiply implements Multiply {
    @Override
    public BigInteger multiply(BigInteger firstNumber, BigInteger secondNumber) {
        return firstNumber.multiply(secondNumber);
    }
}
