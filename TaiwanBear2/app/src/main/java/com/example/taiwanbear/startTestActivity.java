package com.example.taiwanbear;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class startTestActivity extends AppCompatActivity {

    private Button rbtnA,rbtnB,rbtnC,rbtnD;
    private TextView quesTitle;
    //計算分數、計算題數、題目亂數陣列的index變數
    private int point,count,num;
    //讀取題目的變數
    private Questions mQuestions = new Questions();
    //問題答案
    private String CorrectAnswer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start_test);

        num=0;
        point=0;
        count=0;
        rbtnA = (Button)findViewById(R.id.rbtnA);
        rbtnB = (Button)findViewById(R.id.rbtnB);
        rbtnC = (Button)findViewById(R.id.rbtnC);
        rbtnD = (Button)findViewById(R.id.rbtnD);
        quesTitle = (TextView)findViewById(R.id.quesTitle);

        updateQuestion(num);

        rbtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbtnA.getText() == CorrectAnswer) {
                    point+=4;
                    count+=1;
                    if (count<=24){
                        num+=1;
                        updateQuestion(num);
                    }
                    else{
                        gameover();
                    }
                }
                else{
                    count+=1;
                    if (count<=24){
                        num+=1;
                        updateQuestion(num);
                    }
                    else{
                        gameover();
                    }
                }
            }
        });

        rbtnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbtnB.getText() == CorrectAnswer) {
                    point += 4;
                    count +=1;
                    if (count<=24){
                        num+=1;
                        updateQuestion(num);
                    }
                    else{
                        gameover();
                    }
                }
                else{
                    count+=1;
                    if (count<=24){
                        num+=1;
                        updateQuestion(num);
                    }
                    else{
                        gameover();
                    }
                }
            }
        });

        rbtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbtnC.getText() == CorrectAnswer) {
                    point += 4;
                    count +=1;
                    if (count<=24){
                       num+=1;
                       updateQuestion(num);
                    }
                    else{
                        gameover();
                    }
                }
                else{
                    count+=1;
                    if (count<=24){
                       num+=1;
                       updateQuestion(num);
                    }
                    else{
                        gameover();
                    }
                }
            }
        });

        rbtnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbtnD.getText() == CorrectAnswer) {
                    point+=4;
                    count +=1;
                    if (count<=24){
                       num+=1;
                       updateQuestion(num);
                    }
                    else{
                        gameover();
                    }
                }
                else{
                    count+=1;
                    if (count<=24){
                        num+=1;
                        updateQuestion(num);
                    }
                    else{
                        gameover();
                    }
                }
            }
        });
    }
    /*抓取問題、選項、答案*/
    private void updateQuestion(int x) {
        quesTitle.setText("Q:" + mQuestions.getmQuestions(x));
        rbtnA.setText(mQuestions.getmChoice1(x));
        rbtnB.setText(mQuestions.getmChoice2(x));
        rbtnC.setText(mQuestions.getmChoice3(x));
        rbtnD.setText(mQuestions.getmChoice4(x));
        CorrectAnswer = mQuestions.getCorrectAnswers(x);
    }
//遊戲結束funtion
    private void gameover() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(startTestActivity.this);
        alertDialogBuilder
                .setMessage("Congratulations! Your score is " + point + "/100")
                .setCancelable(false)
                .setPositiveButton("AGAIN",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), testActivity.class));
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), joinActivity.class));
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}