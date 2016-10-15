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

public class TutorialActivity extends AppCompatActivity {
    // Array of String to Show In Text Switcher
    String textToShow[]={"Hey, my name is Sagittarius and I’m a freshman! The CHOICES program matched us and you’re supposed to help me graduate high school. ",
            "If I want to be successful in school, I need your help! This means my grades need to be a C or higher. I also want to get involved and make new friends. ",
            "My grades will reflect the choices I make. I can also earn trophies for my involvements. But remember, grades come first! ",
            "I believe we can succeed together! ","Say, now that I have you here, I was thinking maybe you could give me advice on something..."};
    int msgCount = textToShow.length;
    int currentIndex = 0;

    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.content_tutorial);
        super.onCreate(savedInstanceState);
        Button nextBtn = (Button)findViewById(R.id.nextButton);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick();
            }

            private void onClick(){
                if(currentIndex < msgCount) {
                    TextView textView=(TextView)findViewById(R.id.textView);
                    textView.setText(textToShow[currentIndex]);
                    currentIndex++;
                }
                else{
                    //go to next activity
                    Intent intent = new Intent(TutorialActivity.this, scenario1.class);
                    startActivity(intent);
                }
            }
        });
    }



}
