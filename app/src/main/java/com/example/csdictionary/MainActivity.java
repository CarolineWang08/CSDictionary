package com.example.csdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enter = findViewById(R.id.enter);
        enter.setOnClickListener(v -> {
            Intent enterDictionary = new Intent(this, LaunchActivity.class);
            startActivity(enterDictionary);
        });
    }
}
