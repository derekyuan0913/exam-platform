package com.yuanding.demo.examContext.domain;

import com.yuanding.demo.shared.ValueObject;


public class BlankQuizVO implements ValueObject<BlankQuizVO> {

    private int number;
    private int score;
    private String content;
    private String referenceAnswer;

    @Override
    public boolean sameValueAs(BlankQuizVO other) {
        return false;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReferenceAnswer() {
        return referenceAnswer;
    }

    public void setReferenceAnswer(String referenceAnswer) {
        this.referenceAnswer = referenceAnswer;
    }
}
