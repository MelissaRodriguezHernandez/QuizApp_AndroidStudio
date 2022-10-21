package com.example.quizapp;

public class Question {

    private int textId;
    private boolean answerTrue;

    public Question(int qTextId, boolean qAnswerTrue) {
        textId = qTextId;
        answerTrue = qAnswerTrue;
    }

    public int getQTextId() {
        return textId;
    }

    public void setQTextId(int qTextId) {
        textId = qTextId;
    }

    public boolean isQAnswerTrue() {
        return answerTrue;
    }

    public void setQAnswerTrue(boolean qAnswerTrue) {
        answerTrue = qAnswerTrue;
    }
}
