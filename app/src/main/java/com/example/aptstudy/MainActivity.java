package com.example.aptstudy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anno.Test;


@Test("MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}