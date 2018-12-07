package com.yidoutech.testdemo;


public interface Callback {

    void onForgetPassword();

    void onInputCompleted(CharSequence password);

    void onPasswordCorrectly();

    void onCancel();
}
