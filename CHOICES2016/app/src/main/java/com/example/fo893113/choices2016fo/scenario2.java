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
import android.widget.Toast;

import static com.example.fo893113.choices2016fo.R.id.info;
import static com.example.fo893113.choices2016fo.R.id.textView;

public class scenario2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final String finalAnswer[]={"Ok, I think I'll join the club","I don't think I'll join the club"};

        final Button a1 = (Button)findViewById(R.id.a1);
        final Button b1 = (Button)findViewById(R.id.b1);
        final Button c1 = (Button)findViewById(R.id.c1);
        final Button d1 = (Button)findViewById(R.id.d1);




        final Button a2 = (Button)findViewById(R.id.a2);
        final Button b2 = (Button)findViewById(R.id.b2);
        final Button c2 = (Button)findViewById(R.id.c2);

        final TextView question2 = (TextView) findViewById(R.id.textView15);
        final TextView answer1 = (TextView) findViewById(R.id.textView16);
        final TextView answer2 = (TextView) findViewById(R.id.textView17);
        final TextView answer3 = (TextView) findViewById(R.id.textView18);
        final TextView result = (TextView) findViewById(R.id.result);



        final TextView moreQuestions = (TextView) findViewById(R.id.tryAgain);
        final Button yes = (Button)findViewById(R.id.yes);
        final Button no = (Button)findViewById(R.id.no);

        result.setVisibility(View.INVISIBLE);
        a2.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.INVISIBLE);
        question2.setVisibility(View.INVISIBLE);
        answer1.setVisibility(View.INVISIBLE);
        answer2.setVisibility(View.INVISIBLE);
        answer3.setVisibility(View.INVISIBLE);
        moreQuestions.setVisibility(View.INVISIBLE);
        yes.setVisibility(View.INVISIBLE);
        no.setVisibility(View.INVISIBLE);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                question2.setVisibility(View.VISIBLE);
                answer1.setVisibility(View.VISIBLE);
                answer2.setVisibility(View.VISIBLE);
                answer3.setVisibility(View.VISIBLE);

            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                question2.setVisibility(View.VISIBLE);
                answer1.setVisibility(View.VISIBLE);
                answer2.setVisibility(View.VISIBLE);
                answer3.setVisibility(View.VISIBLE);
            }


        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                question2.setVisibility(View.VISIBLE);
                answer1.setVisibility(View.VISIBLE);
                answer2.setVisibility(View.VISIBLE);
                answer3.setVisibility(View.VISIBLE);
            }

        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                question2.setVisibility(View.VISIBLE);
                answer1.setVisibility(View.VISIBLE);
                answer2.setVisibility(View.VISIBLE);
                answer3.setVisibility(View.VISIBLE);
            }


        });


        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setVisibility(View.VISIBLE);
                result.setText(finalAnswer[0]);
                Toast.makeText(scenario2.this, "1 Trophy Awarded", Toast.LENGTH_LONG).show();

                moreQuestions.setVisibility(View.VISIBLE);
                yes.setVisibility(View.VISIBLE);
                no.setVisibility(View.VISIBLE);
            }


        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setVisibility(View.VISIBLE);
                result.setText(finalAnswer[0]);
                Toast.makeText(scenario2.this, "1 Trophy Awarded", Toast.LENGTH_LONG).show();

                moreQuestions.setVisibility(View.VISIBLE);
                yes.setVisibility(View.VISIBLE);
                no.setVisibility(View.VISIBLE);
            }


        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setVisibility(View.VISIBLE);
                result.setText(finalAnswer[1]);

                moreQuestions.setVisibility(View.VISIBLE);
                yes.setVisibility(View.VISIBLE);
                no.setVisibility(View.VISIBLE);
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(scenario2.this, "More questions coming soon!", Toast.LENGTH_SHORT).show();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(scenario2.this, "Going to Badges...", Toast.LENGTH_SHORT).show();
            }
        });








        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
