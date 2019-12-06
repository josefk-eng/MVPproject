package com.example.mvpproject.main;

/**
 * This acts as the contract between the view {@link MainActivity} and the presenter {@link MainPresenter}
 */
public interface MainContract {

    interface mvpView{

        void showSignInScreen();

        void showSignUpScreen();

    }

    interface mvpPresenter{

        void handleSignInButtonClicks();

        void handleSignUpButtonClicks();

    }
}
