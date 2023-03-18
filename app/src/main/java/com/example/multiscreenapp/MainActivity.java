package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.example.multiscreenapp.Order";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void orderNow(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        EditText item1 = findViewById(R.id.editTextTextPersonName2);
        EditText item2 = findViewById(R.id.editTextTextPersonName3);
        EditText item3 = findViewById(R.id.editTextTextPersonName4);
        String message = item1.getText().toString() + ",\n"
                + item2.getText().toString() + " &\n"
                + item3.getText().toString() + "\n Order placed!";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}