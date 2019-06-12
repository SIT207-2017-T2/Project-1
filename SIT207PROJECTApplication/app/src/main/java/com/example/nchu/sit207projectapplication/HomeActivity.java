package com.example.nchu.sit207projectapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    public void GotoSecondActivity(View view) {
        Intent intent = new Intent(this, Second. class);
        startActivity(intent);
    }

    public void file3(View view) {
        Intent intent = new Intent(this, three. class);
        startActivity(intent);
    }
    }

