package com.cuelogic.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
// adding text
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.showShort(this, "Addition: " + addition(4, 5));
    }

    private int addition(int num1, int num2) {
        return num1 + num2;
    }
}
