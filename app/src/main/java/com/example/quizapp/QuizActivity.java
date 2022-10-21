package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "QuizActivity";
    private static final String KEY_INDEX = "index";

    private Button falseButton;
    private Button trueButton;
    private Button nextButton;
    private Button prevButton;
    private TextView textQuestion;

    private Question[] questionsSolutions = new Question[]{
            new Question(R.string.text_question_1, false),
            new Question(R.string.text_question_2, true),
            new Question(R.string.text_question_3, true),
            new Question(R.string.text_question_4, true),
            new Question(R.string.text_question_5, false),
            new Question(R.string.text_question_6, false),
            new Question(R.string.text_question_7, false),
    };

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");

        if (savedInstanceState != null) {
            currentIndex = savedInstanceState.getInt(KEY_INDEX, 0);
        }

        textQuestion = (TextView) findViewById(R.id.text_question_view);
        int question = questionsSolutions[currentIndex].getQTextId();
        textQuestion.setText(question);

        if(currentIndex == 0){
            prevButton.setVisibility(View.INVISIBLE);
        }


        falseButton = (Button) findViewById(R.id.false_button);
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(false);
            }
        });

        trueButton = (Button) findViewById(R.id.true_button);
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(true);
            }
        });

        nextButton = (Button) findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   // prevButton.setVisibility(View.VISIBLE);
                    currentIndex = (currentIndex+1)% questionsSolutions.length;
                    updateQuestion();
            }
        });

        prevButton = (Button) findViewById(R.id.prev_button);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextButton.setVisibility(View.VISIBLE);
                currentIndex = (currentIndex-1)% questionsSolutions.length;
                updateQuestion();

                if(currentIndex == 7 ){
                    prevButton.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    //Actualizar la pregunta a la siguiente
    private void updateQuestion(){
        int question = questionsSolutions[currentIndex].getQTextId();
        textQuestion.setText(question);

    }

    //Ver si la respuesta es correcta
    private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue = questionsSolutions[currentIndex].isQAnswerTrue();

        int messageId = 0;

        if(userPressedTrue == answerIsTrue){
            messageId = R.string.correct_toast;
        }else{
            messageId = R.string.incorrect_toast;
        }

        Toast.makeText(this, messageId, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {

    }

    //Hacer log por cada estado de la aplicacion
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

    //Guardar la ubicacion de la anterior pregunta

//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//        Log.i(TAG, "onSaveInstanceState");
//        savedInstanceState.putInt(KEY_INDEX, currentIndex);
//    }

    //Mensaje del log del nivel

//    Log.d(TAG, "Current question index: " + );
//
//
//    Question question;
//    try {
//        question = questionsSolutions[currentIndex];
//    } catch (ArrayIndexOutOfBoundsException ex) {
//        // Log a message at "error" log level, along with an exception stack trace
//        Log.e(TAG, "Index was out of bounds", ex);
//    }


}