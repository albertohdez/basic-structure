package com.alberto.basicstructure.injection.module;

import android.content.Context;

import com.alberto.basicstructure.MyApplication;
import com.alberto.basicstructure.service.ApiClient;
import com.alberto.basicstructure.service.AppService;
import com.alberto.basicstructure.service.AppServiceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    ApiClient provideApiClient() {
        return new ApiClient();
    }

    @Provides
    @Singleton
    AppService provideAppService(ApiClient apiClient) {
        return new AppServiceImpl(apiClient);
    }
}
