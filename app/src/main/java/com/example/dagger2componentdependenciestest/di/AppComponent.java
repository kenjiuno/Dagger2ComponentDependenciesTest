package com.example.dagger2componentdependenciestest.di;

import com.example.dagger2componentdependenciestest.activity.MainActivity;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
