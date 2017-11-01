package com.example.queen.saediproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.register_toolbar);;
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("A N T O D O");
        getSupportActionBar().setSubtitle("TASKS MADE EASY");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
