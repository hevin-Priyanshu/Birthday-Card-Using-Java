package com.demo.birthdaycardusingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        String receivedValue = getIntent().getStringExtra("editView");

        TextView userName = findViewById(R.id.userName);
        userName.setText(receivedValue);

    }
}