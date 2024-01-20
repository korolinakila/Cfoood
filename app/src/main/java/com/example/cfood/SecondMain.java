package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondMain extends AppCompatActivity {
    TextView textView;
    Button button, switcher;
    EditText inputText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        textView =  findViewById(R.id.textView);
        button =  findViewById(R.id.button);
        inputText = findViewById(R.id.inputText);
        switcher = findViewById(R.id.switcher);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soccer = Integer.parseInt(inputText.getText().toString());

                textView.setText("Количество калорий:"+ soccer);

            }
        });

        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perehod();
            }
        });

    }
    public void Perehod(){
        if(Integer.parseInt(inputText.getText().toString())>0 && Integer.parseInt(inputText.getText().toString())<750){
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, FourMain.class);
            startActivity(intent);
        }
    }

}