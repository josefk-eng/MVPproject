package com.example.mvpproject.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
}
