package com.alberto.basicstructure.common.view.presenter;

public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}
