package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view) {
        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        EditText editText = findViewById(R.id.editTextMessage);
        String message = editText.getText().toString();

        intent.putExtra(Constants.MESSAGE_KEY, message);
        intent.putExtra(Constants.ID_KEY, 1);

        startActivity(intent);
    }
}