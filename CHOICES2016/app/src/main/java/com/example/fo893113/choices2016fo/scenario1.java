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
    String dialogueTextToShow[]={"\" Not only did you both get a good grade, but you got closer to your friend.\"\n",
            "\"You get caught, earn a F on your exam, and get suspended for academic misconduct.\""};


    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.content_scenario1);
        super.onCreate(savedInstanceState);
        final Button optBtnOne = (Button)findViewById(R.id.option1);
        final Button optBtnTwo = (Button)findViewById(R.id.option2);
        final Button nextQuestion = (Button) findViewById(R.id.NextQuestion);
        final TextView result = (TextView) findViewById(R.id.Result);

        nextQuestion.setVisibility(View.INVISIBLE);

        optBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBtnOne();

            }

            private void onClickBtnOne(){
                result.setText(dialogueTextToShow[0]);
                optBtnOne.setVisibility(View.INVISIBLE);
                optBtnTwo.setVisibility(View.INVISIBLE);
                nextQuestion.setVisibility(View.VISIBLE);
            }
        });

        optBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBtnTwo();
            }

            private void onClickBtnTwo(){
                result.setText(dialogueTextToShow[1]);
                optBtnOne.setVisibility(View.INVISIBLE);
                optBtnTwo.setVisibility(View.INVISIBLE);
                nextQuestion.setVisibility(View.VISIBLE);
            }
        });


        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNextQuestion();
            }

            private void onClickNextQuestion(){

                Intent intent = new Intent(scenario1.this, scenario2.class);
                startActivity(intent);
            }
        });
    }
}
