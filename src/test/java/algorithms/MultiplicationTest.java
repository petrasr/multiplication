package algorithms;

import org.example.algorithms.KaratsubaMultiply;
import org.example.algorithms.StandardMultiply;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class MultiplicationTest {

    private final StandardMultiply standardMultiply = new StandardMultiply();
    private final KaratsubaMultiply karatsubaMultiply = new KaratsubaMultiply();

    @Test
    public void compareMethods() {
        final BigInteger firstNumber = BigInteger.valueOf(928598436534754865L);
        final BigInteger secondNumber = BigInteger.valueOf(984486456457593846L);
        final BigInteger standardMethod = standardMultiply.multiply(firstNumber, secondNumber);
        final BigInteger karatsubaMethod = karatsubaMultiply.multiply(firstNumber, secondNumber);
        Assertions.assertEquals(standardMethod, karatsubaMethod);
    }

    @Test
    public void multiplyByZero() {
        final BigInteger number = BigInteger.valueOf(28357827568L);
        final BigInteger standardMethod = standardMultiply.multiply(number, BigInteger.ZERO);
        final BigInteger karatsubaMethod = karatsubaMultiply.multiply(number, BigInteger.ZERO);
        Assertions.assertEquals(BigInteger.ZERO, karatsubaMethod);
        Assertions.assertEquals(BigInteger.ZERO, standardMethod);
    }
}
