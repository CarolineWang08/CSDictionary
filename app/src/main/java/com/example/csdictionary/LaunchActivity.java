package com.example.csdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        Button go = findViewById(R.id.go);
        go.setOnClickListener(v -> {
        });

        TextView definition = findViewById(R.id.definition);
        TextView synonym = findViewById(R.id.synonym);
    }
}
