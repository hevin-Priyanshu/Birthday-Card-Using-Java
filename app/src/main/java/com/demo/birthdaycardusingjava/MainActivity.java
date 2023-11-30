package com.demo.birthdaycardusingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editTextText);
        Button getBtn = findViewById(R.id.getButton);

        getBtn.setOnClickListener(view -> {
            String editView = editText.getText().toString();

            Intent intent = new Intent(MainActivity.this, UserInput.class);
            intent.putExtra("editView", editView);
            startActivity(intent);

            editText.getText().clear();
        });

    }
}