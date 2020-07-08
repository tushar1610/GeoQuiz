package com.bignerdranch.android.geoquiz;

public class Questions {

    private int mTextResId;
    private  Boolean mAnswerTrue, mButtonEnabled;

    public Questions(int textResId, Boolean answerTrue, Boolean buttonEnabled) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mButtonEnabled = buttonEnabled;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public Boolean getAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(Boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Boolean getButtonEnabled() {
        return mButtonEnabled;
    }

    public void setButtonEnabled(Boolean buttonEnabled) {
        mButtonEnabled = buttonEnabled;
    }
}
