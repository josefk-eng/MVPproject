package com.example.mvpproject.main;


/**
 * Responsible for handling the actions from the view and updating the UI as required
 */
public class MainPresenter implements MainContract.mvpPresenter {

    private MainContract.mvpView mvpView;

    MainPresenter(MainContract.mvpView view){
        mvpView = view;
    }

}
