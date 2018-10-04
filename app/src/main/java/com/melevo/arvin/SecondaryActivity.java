package com.melevo.arvin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondaryActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button2)
        {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }
}