package com.example.nchu.sit207projectapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

    }

    public void file2(View view) {
        Intent intent = new Intent(this, SIT207PROJECTActivity. class);
        startActivity(intent);
    }


}
