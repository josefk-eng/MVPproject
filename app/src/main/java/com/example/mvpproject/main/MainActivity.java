package com.example.mvpproject.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvpproject.R;


/**
 * This displays the main screen
 */
public class MainActivity extends AppCompatActivity implements MainContract.mvpView {
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
    }


    ////        View Methods        ////
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking the user to the Sign in screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking the user to the sign up screen", Toast.LENGTH_SHORT).show();
    }
}
