package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void healthyLiving(View view){

        Intent intent = new Intent(MainActivity.this, HealthyActivity.class);
        startActivity(intent);
    }


    public  void education (View view){

        Intent intent = new Intent(MainActivity.this, EducationActivity.class);
        startActivity(intent);
    }



    public  void politics (View view){

        Intent intent = new Intent(MainActivity.this, politicsActivity.class);
        startActivity(intent);
    }
}
