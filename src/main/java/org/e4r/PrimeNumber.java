package org.e4r;

import io.questdb.jar.jni.JarJniLoader;

class PrimeNumber {
    static native int getCount(int range);

    public static boolean is_prime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeNumberIn(int number) {
        int prime_number_count = 0;
        for (int i = 1; i < number; i++) {
            if (is_prime(i)) {
                prime_number_count += 1;
            }
        }
        return prime_number_count;
    }

    static {
        JarJniLoader.loadLib(
                PrimeNumber.class,
                "/org/e4r/libs",
                "prime_number");
    }
}