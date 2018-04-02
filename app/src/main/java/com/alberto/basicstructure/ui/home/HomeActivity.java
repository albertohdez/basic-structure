package com.alberto.basicstructure.ui.home;

import android.os.Bundle;

import com.alberto.basicstructure.R;
import com.alberto.basicstructure.common.view.activity.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements HomeMvpView {

    @Inject
    HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        homePresenter.attachView(this);
    }

}
