package algorithms;

import org.example.algorithms.Multiplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class MultiplicationTest {

    @Test
    public void compareMethods() {
        Multiplication multiplication = new Multiplication(
                BigInteger.valueOf(928598436534754865L),
                BigInteger.valueOf(984486456457593846L)
        );
        final BigInteger standardMethod = multiplication.standardMultiplication();
        final BigInteger karatsubaMethod = multiplication.karatsubaMultiplication();
        Assertions.assertEquals(standardMethod, karatsubaMethod);
    }
}
