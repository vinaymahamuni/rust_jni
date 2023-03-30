package org.e4r;

import io.questdb.jar.jni.JarJniLoader;

class PrimeNumber {
    static native int getCount(int range);

    static {
        JarJniLoader.loadLib(
                PrimeNumber.class,
                "/org/e4r/libs",
                "prime_number");
    }
}