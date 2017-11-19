package com.cuelogic.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.showShort(this, "Addition: " + addition(4, 5));

    }

    private int addition(int num1, int num2) {
        return num1 + num2;
        // following function return an addition of two number"
    }
    private int subbtraction(int num1, int num2) {
        return num1 - num2;
        // following function return an  subtraction  of two number"
    }
}
