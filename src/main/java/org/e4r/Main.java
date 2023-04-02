package org.e4r;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int range = Integer.parseInt(args[0]);
        rustPrimeNumber(range);
        javaPrimeNumber(range);


    }
    private static void javaPrimeNumber(int range) {
        long startTime = System.currentTimeMillis();
        int count = PrimeNumber.primeNumberIn(range);
        System.out.println("count by java:" + count);
        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000.0;
        System.out.println("timeTaken by java program in sec: " + timeTaken);
    }
    private static void rustPrimeNumber(int range) {
        long startTime = System.currentTimeMillis();
        int count = PrimeNumber.getCount(range);
        System.out.println("count by rust:" + count);
        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000.0;
        System.out.println("timeTaken by rust program in sec: " + timeTaken);
    }

}