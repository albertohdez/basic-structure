package com.alberto.basicstructure.ui.home;

import com.alberto.basicstructure.common.view.presenter.BasePresenter;
import com.alberto.basicstructure.service.AppService;

public class HomePresenter extends BasePresenter<HomeMvpView> {
    private final AppService appService;

    public HomePresenter(AppService appService) {
        this.appService = appService;
    }
}
