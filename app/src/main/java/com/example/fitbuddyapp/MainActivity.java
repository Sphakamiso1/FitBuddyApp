package com.example.fitbuddyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        TextView sin;
        LinearLayout circle;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            circle = (LinearLayout)findViewById(R.id.circle);
            sin = (TextView)findViewById(R.id.sin);

            circle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent it = new Intent(com.example.fitbuddyapp.MainActivity.this,signup.class);
                    startActivity(it);

                }
            });
            sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(com.example.fitbuddyapp.MainActivity.this,login.class);
                    startActivity(it);
                }
            });

        }
    }
