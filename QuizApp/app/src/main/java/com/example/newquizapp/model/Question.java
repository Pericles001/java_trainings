package com.example.newquizapp.model;

public class Question {
    private int idQ;
    private boolean answer;

    public Question(int idQ, boolean answer) {
        this.idQ = idQ;
        this.answer = answer;
    }

    public Question() {
    }

    public int getIdQ() {
        return idQ;
    }

    public void setIdQ(int idQ) {
        this.idQ = idQ;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    private boolean ansQ(boolean myAns ){
        return answer = myAns;
    }

}
