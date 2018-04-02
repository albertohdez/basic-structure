package com.alberto.basicstructure.common.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alberto.basicstructure.MyApplication;
import com.alberto.basicstructure.injection.component.ActivityComponent;
import com.alberto.basicstructure.injection.component.ApplicationComponent;
import com.alberto.basicstructure.injection.component.DaggerActivityComponent;
import com.alberto.basicstructure.injection.module.ActivityModule;

public class BaseActivity extends AppCompatActivity {
    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getApplicationComponent().inject(this);
        initializeInjector();
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((MyApplication) getApplication()).getApplicationComponent();
    }

    private void initializeInjector() {
        activityComponent = DaggerActivityComponent.builder()
                .applicationComponent(getApplicationComponent())
                .activityModule(getActivityModule())
                .build();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }


}
