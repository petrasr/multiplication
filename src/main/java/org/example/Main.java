package org.example;

import org.example.algorithms.KaratsubaMultiply;
import org.example.algorithms.StandardMultiply;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose algorithm 1 or 2");
        int algorithm = scanner.nextInt();
        System.out.println("First number");
        BigInteger first = scanner.nextBigInteger();
        System.out.println("Second number");

        BigInteger second = scanner.nextBigInteger();

        if (algorithm == 1) {
            StandardMultiply standardMultiply = new StandardMultiply();
            BigInteger result = standardMultiply.multiply(first, second);
            System.out.printf("(standard method) first %s second %s = %s", first, second, result);
        } else {
            KaratsubaMultiply karatsubaMultiply = new KaratsubaMultiply();
            BigInteger result = karatsubaMultiply.multiply(first, second);
            System.out.printf("(karatsuba method) first %s second %s = %s", first, second, result);
        }
    }
}