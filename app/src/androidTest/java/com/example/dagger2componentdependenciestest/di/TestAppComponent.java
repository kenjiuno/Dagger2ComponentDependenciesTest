package com.example.dagger2componentdependenciestest.di;

import com.example.dagger2componentdependenciestest.ExampleInstrumentedTest;

import dagger.Component;

@Component(dependencies = {AppComponent.class})
public interface TestAppComponent {
    void inject(ExampleInstrumentedTest test);
}
