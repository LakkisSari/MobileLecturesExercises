package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();

        String messageDisplay = intent.getStringExtra(Constants.MESSAGE_KEY);
        int id = intent.getIntExtra(Constants.ID_KEY,0);

        TextView textView = findViewById(R.id.textViewMessage);

        textView.setText(messageDisplay + "\n id = " + String.valueOf(id));
    }
}