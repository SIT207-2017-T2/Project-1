package com.example.nchu.sit207projectapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void bower1(View view) {
        Intent bowerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.au/"));
        startActivity(bowerIntent);
    }

    public void bower2(View view) {
        Intent bowerIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.paypal.com"));
        startActivity(bowerIntent2);
    }

    public void bower3(View view) {
        Intent bowerIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.commbank.com.au/"));
        startActivity(bowerIntent3);
    }

    public void bower4(View view) {
        Intent bowerIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.deakin.edu.au"));
        startActivity(bowerIntent4);
    }
}
