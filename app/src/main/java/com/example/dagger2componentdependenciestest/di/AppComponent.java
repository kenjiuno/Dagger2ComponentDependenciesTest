package com.example.dagger2componentdependenciestest.di;

import com.example.dagger2componentdependenciestest.activity.MainActivity;
import com.example.dagger2componentdependenciestest.utility.RandomNumberGenerator;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);

    RandomNumberGenerator newRandomNumberGenerator();
}
