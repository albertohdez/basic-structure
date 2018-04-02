package com.alberto.basicstructure;

import android.app.Application;

import com.alberto.basicstructure.injection.component.ApplicationComponent;
import com.alberto.basicstructure.injection.component.DaggerApplicationComponent;
import com.alberto.basicstructure.injection.module.ApplicationModule;

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent = createAppComponent();

    @Override
    public void onCreate() {
        super.onCreate();
        getApplicationComponent().inject(this);
    }

    protected ApplicationComponent createAppComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
