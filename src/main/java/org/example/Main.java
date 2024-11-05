package org.example;

import org.example.algorithms.Multiplication;

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
        Multiplication multiplication = new Multiplication(first, second);
        if (algorithm == 1) {
            BigInteger result = multiplication.standardMultiplication();
            System.out.printf("(standard method) first %s second %s = %s", first, second, result);
        } else {
            BigInteger result = multiplication.karatsubaMultiplication();
            System.out.printf("(karatsuba method) first %s second %s = %s", first, second, result);
        }
    }
}