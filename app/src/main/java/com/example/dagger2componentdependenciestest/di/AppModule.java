package com.example.dagger2componentdependenciestest.di;

import com.example.dagger2componentdependenciestest.utility.RandomNumberGenerator;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    RandomNumberGenerator newRandomNumberGenerator() {
        return new RandomNumberGenerator();
    }
}
