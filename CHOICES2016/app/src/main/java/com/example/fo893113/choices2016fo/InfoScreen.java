package com.example.fo893113.choices2016fo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class InfoScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.infoButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InfoScreen.this, "You chose to go to the party and your coach reprimanded you. You also failed your exam and lowered your class grade to a C.", Toast.LENGTH_LONG).show();
//                goToMainScreen();
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void goToMainScreen() {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

}
