package com.example.dagger2componentdependenciestest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.dagger2componentdependenciestest.R;
import com.example.dagger2componentdependenciestest.di.DaggerAppComponent;
import com.example.dagger2componentdependenciestest.utility.RandomNumberGenerator;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    RandomNumberGenerator randomNumberGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAppComponent.builder()
                .build()
                .inject(this);

        ((TextView) findViewById(R.id.my_message)).setText(
                "Your lucky number is a: " + randomNumberGenerator.getNext()
        );
    }
}
