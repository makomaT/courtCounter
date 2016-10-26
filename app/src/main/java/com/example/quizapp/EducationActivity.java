package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EducationActivity extends AppCompatActivity {

    private RadioGroup groupRadiobuttons;
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    TextView educationQuestions;
    List<String> listQuestion;
    int currentIndex = 0;

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_education);
        r1 = (RadioButton) findViewById(R.id.q1_radiobutton1);
        r2 = (RadioButton) findViewById(R.id.q1_radiobutton2);
        r3 = (RadioButton) findViewById(R.id.q1_radiobutton3);
        educationQuestions = (TextView) findViewById(R.id.educationQs);


        listQuestion = new ArrayList<>();
        listQuestion.add("pppppppppp");
        listQuestion.add("mmmmmm");
        listQuestion.add("yyyyyy");


        String question = listQuestion.get(currentIndex);
        educationQuestions.setText(question);

        if (question.equals("pppppppppp")) {
            r1.setText("1111111");
            r2.setText("22222222");
            r3.setText("333333333333");
        }
        currentIndex++;


    }


    public  void education (View view)
    {

        r1.setEnabled(true);
        r2.setEnabled(true);
        r3.setEnabled(true);

        if(currentIndex < listQuestion.size())
        {
            String question = listQuestion.get(currentIndex);
            educationQuestions.setText(question);

            if(question.equals("pppppppppp"))
            {
                r1.setText("tttttt");
                r2.setText("anser");
                r3.setText("ansa");
                r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (b)
                        {
                            r2.setEnabled(false);
                            r3.setEnabled(false );
                        }
                    }
                }) ;

                r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (b)
                        {
                            r1.setEnabled(false);
                            r3.setEnabled(false );
                        }
                    }
                }) ;


                r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (b)
                        {
                            r2.setEnabled(false);
                            r1.setEnabled(false );
                        }
                    }
                }) ;



            }
            else if(question.equals("mmmmmm"))
            {
                r1.setText("kl");
                r2.setText("o");
                r3.setText("j");
            }


            else if(question.equals("yyyyyy"))
            {
                r1.setText("kllllll");
                r2.setText("oooooo");
                r3.setText("jjjjjjjj");
            }


        }
        currentIndex++;
    }




}