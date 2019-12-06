package com.example.mvpproject.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Local unit test for the presenter class
 */
public class MainPresenterTest {

    @Mock
    MainContract.mvpView mvpView;

    MainPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter = new MainPresenter(mvpView);
    }

    @Test
    public void handleSignInButtonClicks() {
        presenter.handleSignInButtonClicks();
        verify(mvpView).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClicks() {
        presenter.handleSignUpButtonClicks();
        verify(mvpView).showSignUpScreen();
    }
}