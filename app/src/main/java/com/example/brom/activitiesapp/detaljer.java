package com.example.brom.activitiesapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class detaljer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaljer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Bundle extras = getIntent().getExtras();

        String name = extras.getString("EXTRA_NAME");
        String location = extras.getString("EXTRA_LOCATION");
        String height = extras.getString("EXTRA_HEIGHT");

        TextView nameText = (TextView) findViewById(R.id.textView);
        TextView heightText = (TextView) findViewById(R.id.textView2);
        TextView locationText = (TextView) findViewById(R.id.textView3);

        nameText.setText(name);
        heightText.setText(height);
        locationText.setText(location);

    }

}
