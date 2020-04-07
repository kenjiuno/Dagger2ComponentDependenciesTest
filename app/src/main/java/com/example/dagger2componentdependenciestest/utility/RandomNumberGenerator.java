package com.example.dagger2componentdependenciestest.utility;

public class RandomNumberGenerator {
    private int seed = 0;

    public int getNext() {
        seed += 7;
        return seed;
    }
}
