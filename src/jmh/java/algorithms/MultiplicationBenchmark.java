
package algorithms;
import org.example.algorithms.KaratsubaMultiply;
import org.example.algorithms.StandardMultiply;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

@Fork(value = 1, warmups = 1)
@Warmup(iterations = 1)
@Measurement(iterations = 1)
@OutputTimeUnit(TimeUnit.SECONDS)
public class MultiplicationBenchmark {

    private static final BigInteger FIRST_NUMBER = BigInteger.valueOf(928598436534754865L);
    private static final BigInteger SECOND_NUMBER = BigInteger.valueOf(928598436534754865L);

    @Benchmark
    public static void standardMethod(Blackhole blackhole) {
        StandardMultiply standardMultiply = new StandardMultiply();
        blackhole.consume(standardMultiply.multiply(FIRST_NUMBER, SECOND_NUMBER));
    }

    @Benchmark
    public static void karatsubaMethod(Blackhole blackhole) {
        KaratsubaMultiply karatsubaMultiply = new KaratsubaMultiply();
        blackhole.consume(karatsubaMultiply.multiply(FIRST_NUMBER, SECOND_NUMBER));
    }
}
