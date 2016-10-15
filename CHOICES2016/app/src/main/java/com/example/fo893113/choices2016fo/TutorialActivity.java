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
import android.widget.TextSwitcher;

public class TutorialActivity extends AppCompatActivity {
    // Array of String to Show In Text Switcher
    String textToShow[]={"Message 1","Message 2 ","Message 3","Message 4"};
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
                    TextView textView=(TextView)findViewById(R.id.textView);;
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
