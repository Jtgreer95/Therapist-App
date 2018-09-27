package edu.psu.therapistapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton sendContactButton = (ImageButton) findViewById(R.id.sendContactButton);
        sendContactButton.setOnClickListener(this);
        ImageButton addContactButton = (ImageButton) findViewById(R.id.addContactButton);
        addContactButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){

        switch(view.getId()){
            case R.id.sendContactButton:
                startActivity(new Intent(MainActivity.this, SendEmailActivity.class));
                break;
            case R.id.addContactButton:
                startActivity(new Intent(MainActivity.this, AddContactActivity.class));
                break;
        }
    }



}
