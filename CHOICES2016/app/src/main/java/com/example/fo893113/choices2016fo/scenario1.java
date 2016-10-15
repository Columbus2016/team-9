package com.example.fo893113.choices2016fo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scenario1 extends AppCompatActivity {
    // Array of String to Show In Text Switcher
    String dialogueTextToShow[]={"Dialogue 1 ","Dialogue 2"};
    int dialogueCurrentIndex = 0;
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.content_scenario1);
        super.onCreate(savedInstanceState);
        Button optBtnOne = (Button)findViewById(R.id.option1);
        Button optBtnTwo = (Button)findViewById(R.id.option2);
        final TextView result = (TextView) findViewById(R.id.Result);
        optBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBtnOne();
            }

            private void onClickBtnOne(){
                result.setText(dialogueTextToShow[0]);
            }
        });

        optBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBtnTwo();
            }

            private void onClickBtnTwo(){
                result.setText(dialogueTextToShow[1]);
            }
        });
    }
}
