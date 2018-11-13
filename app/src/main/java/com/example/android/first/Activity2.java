package com.example.android.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        //tv.setText("hurrayyyy!!");
        tv.getTextColors();
        setContentView(tv);


        //setContentView(R.layout.activity_2);
    }
}
