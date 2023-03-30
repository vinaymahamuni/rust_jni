package org.e4r;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        long startTime = System.currentTimeMillis();
        int count = PrimeNumber.getCount(1000000);
        System.out.println(count);
        long endTime = System.currentTimeMillis();
        int timeTaken = (int) ((endTime - startTime) / 1000);
        System.out.println(timeTaken);
    }
}