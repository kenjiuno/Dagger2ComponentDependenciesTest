package com.example.dagger2componentdependenciestest;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.dagger2componentdependenciestest.di.AppModule;
import com.example.dagger2componentdependenciestest.di.DaggerAppComponent;
import com.example.dagger2componentdependenciestest.utility.RandomNumberGenerator;

import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Inject
    public RandomNumberGenerator randomNumberGenerator;

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.dagger2componentdependenciestest", appContext.getPackageName());

        DaggerTestAppComponent.builder()
                .appComponent(
                        DaggerAppComponent
                                .builder()
                                .appModule(new AppModule())
                                .build()
                )
                .build()
                .inject(this);

        assertNotEquals(randomNumberGenerator.getNext(), 1234567890);
    }
}
