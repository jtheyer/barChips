package com.mybarchips.barchips;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Menu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Testing", Toast.LENGTH_LONG);
        Toast.makeText(this, "Testing 1..", Toast.LENGTH_LONG);

    }
}
