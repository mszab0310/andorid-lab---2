package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int nr1 = getIntent().getIntExtra("number1", 0);
        int nr2 = getIntent().getIntExtra("number2", 0);
        Integer rez = nr1 + nr2;
        TextView textView = findViewById(R.id.textReciever);
        textView.setText(rez.toString());

    }

    public void navigateToOldActivity(View view) {
        Intent inten2 = new Intent(this, MainActivity.class);
        startActivity(inten2);
    }
}