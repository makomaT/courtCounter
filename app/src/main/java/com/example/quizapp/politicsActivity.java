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

public class politicsActivity extends AppCompatActivity {


        private RadioGroup groupRadiobuttons;
        private RadioButton r11;
        private RadioButton r21;
        private RadioButton r31;
        TextView politicsQuestions;
        List<String> listQuestion;
        int currentIndex = 0;

        int score = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_politics);


            r11 = (RadioButton) findViewById(R.id.q1_radiobutton1);
            r21 = (RadioButton) findViewById(R.id.q1_radiobutton2);
            r31 = (RadioButton) findViewById(R.id.q1_radiobutton3);
            politicsQuestions = (TextView)findViewById(R.id.PoliticsQs);

            listQuestion = new ArrayList<>();
            listQuestion.add("wwwwwwwwwwww");
            listQuestion.add("qqqqqqq");
            listQuestion.add("ssssss");



            String question = listQuestion.get(currentIndex);
            politicsQuestions.setText(question);

            if(question.equals("wwwwwwwwwwww"))
            {
                r11.setText("tttttt");
                r21.setText("anser");
                r31.setText("ansa");
            }
            currentIndex++;


        }


    public  void politics(View view)
    {
        if(currentIndex < listQuestion.size())
        {
            String question = listQuestion.get(currentIndex);
            politicsQuestions.setText(question);

            if(question.equals("wwwwwwwwwwww"))
            {
                r11.setText("tttttt");
                r21.setText("anser");
                r31.setText("ansa");
            }
            else if(question.equals("qqqqqqq"))
            {
                r11.setText("kl");
                r21.setText("o");
                r31.setText("j");
            }


            else if(question.equals("ssssss"))
            {
                r11.setText("kllllll");
                r21.setText("oooooo");
                r31.setText("jjjjjjjj");
            }


        }
        currentIndex++;
    }


        }


























