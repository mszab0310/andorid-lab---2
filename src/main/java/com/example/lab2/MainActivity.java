package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getApplicationContext(), "Activity 1", Toast.LENGTH_SHORT);
        toast.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToNewActivity(View view) {

        Intent inten1 = new Intent(this, MainActivity2.class);
        EditText text = findViewById(R.id.textInput1);
        EditText text2 = findViewById(R.id.textInput2);
        String msg = text.getText().toString();
        String msg2 = text2.getText().toString();
        int number1;
        int number2;
        try {
            number1 = Integer.parseInt(msg);
            number2 = Integer.parseInt(msg2);
            inten1.putExtra("number1", number1);
            inten1.putExtra("number2", number2);
            startActivity(inten1);
        } catch (NumberFormatException numberFormatException) {
            Toast errorToast = Toast.makeText(getApplicationContext(),"Please enter a number", Toast.LENGTH_SHORT);
            errorToast.show();
        }

    }
}