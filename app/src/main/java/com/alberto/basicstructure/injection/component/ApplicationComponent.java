package com.alberto.basicstructure.injection.component;

import com.alberto.basicstructure.MyApplication;
import com.alberto.basicstructure.common.view.activity.BaseActivity;
import com.alberto.basicstructure.injection.module.ApplicationModule;
import com.alberto.basicstructure.service.AppService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    void inject(MyApplication application);

    AppService appService();
}
