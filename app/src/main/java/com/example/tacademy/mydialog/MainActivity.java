package com.example.tacademy.mydialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDialogFragmentClick(View view) {
        MyDialogFragment f = new MyDialogFragment();
        f.show(getSupportFragmentManager(), "dialog");
    }

    public void onCustomDialog(View view) {
        LoginFragment f = new LoginFragment();
        f.show(getSupportFragmentManager(), "login");
    }
}
