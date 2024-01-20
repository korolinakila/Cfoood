package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

class Food{
    int kaloria;
    int mass;
    String name;
    int placeX;
    int placeY;
}

public class ThirdActivity extends AppCompatActivity {
    ImageView water;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


    }
}