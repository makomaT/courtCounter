package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HealthyActivity extends AppCompatActivity {

    private RadioGroup groupRadiobuttons;
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    TextView healthQuestions;
    List<String> listQuestion;
    int currentIndex=0;

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);

       r1 = (RadioButton) findViewById(R.id.q1_radiobutton1);
       r2 = (RadioButton) findViewById(R.id.q1_radiobutton2);
       r3 = (RadioButton) findViewById(R.id.q1_radiobutton3);
        healthQuestions = (TextView)findViewById(R.id.healthQs);

        listQuestion = new ArrayList<>();
        listQuestion.add("wwwwwwwwwwww");
        listQuestion.add("qqqqqqq");
        listQuestion.add("ssssss");



        String question = listQuestion.get(currentIndex);
        healthQuestions.setText(question);

        if(question.equals("wwwwwwwwwwww"))
        {
            r1.setText("tttttt");
            r2.setText("anser");
            r3.setText("ansa");
        }
        currentIndex++;


       groupRadiobuttons = (RadioGroup) findViewById(R.id.radioGroup);

       groupRadiobuttons.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
          @Override
           public void onCheckedChanged(RadioGroup radioGroup, int checkedRadioButtonId) {
        if (checkedRadioButtonId == R.id.q1_radiobutton1) {
                    score += 1;

                }
           }


        });

    }

public void dispalyScore(View view){



    }








    public  void healthyLiving(View view)
    {
        if(currentIndex < listQuestion.size())
        {
            String question = listQuestion.get(currentIndex);
            healthQuestions.setText(question);

            if(question.equals("wwwwwwwwwwww"))
            {
                r1.setText("tttttt");
                r2.setText("anser");
                r3.setText("ansa");
            }
            else if(question.equals("qqqqqqq"))
            {
                r1.setText("kl");
                r2.setText("o");
                r3.setText("j");
            }


            else if(question.equals("ssssss"))
            {
                r1.setText("kllllll");
                r2.setText("oooooo");
                r3.setText("jjjjjjjj");
            }


        }
        currentIndex++;
    }
}