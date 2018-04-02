package com.alberto.basicstructure.injection.component;

import android.app.Activity;

import com.alberto.basicstructure.injection.annotation.PerActivity;
import com.alberto.basicstructure.injection.module.ActivityModule;
import com.alberto.basicstructure.ui.home.HomeActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    //Activities
    Activity activity();

    void inject(HomeActivity homeActivity);

}
