package com.example.newquizapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.newquizapp.R;
import com.example.newquizapp.model.Question;

public class MainActivity extends AppCompatActivity {
    private Button trueBtn, falseBtn;
    private ImageButton nextBtn;
    private Question[] questionList;
    private TextView ansTextView;
private int currentQuestionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueBtn = findViewById(R.id.trueBtn);
        falseBtn = findViewById(R.id.falseBtn);
        nextBtn = findViewById(R.id.nextButton);
        ansTextView = findViewById(R.id.answerTextView);

        questionList = new Question[]{
                new Question(R.string.question_inde, false),
        new Question(R.string.question_president, false),
        new Question(R.string.question_dev, true),
        new Question(R.string.question_dep, false),
        new Question(R.string.question_front, false)

        };


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentQuestionIndex++;
                if (currentQuestionIndex == questionList.length){
                    currentQuestionIndex = 0;
                }
                Log.d("current", "Question current" + currentQuestionIndex);
                ansTextView.setText(questionList[currentQuestionIndex].getIdQ());
            }
        });




        trueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Question question = questionList[currentQuestionIndex];

                if (question.isAnswer()){
                    Toast.makeText(MainActivity.this, R.string.rA, Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(MainActivity.this, R.string.fA, Toast.LENGTH_SHORT).show();
                }

            }
        });

        falseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Question question = questionList[currentQuestionIndex];

                if (!question.isAnswer()){
                    Toast.makeText(MainActivity.this, R.string.rA, Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(MainActivity.this, R.string.fA, Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}