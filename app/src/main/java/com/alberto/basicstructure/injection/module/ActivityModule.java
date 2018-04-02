package com.alberto.basicstructure.injection.module;

import android.app.Activity;

import com.alberto.basicstructure.injection.annotation.PerActivity;
import com.alberto.basicstructure.service.AppService;
import com.alberto.basicstructure.ui.home.HomePresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    Activity provideActivity() {
        return mActivity;
    }


    @Provides
    @PerActivity
    HomePresenter provideHomePresenter(AppService appService) {
        return new HomePresenter(appService);
    }

}
