package com.juaracoding.day19;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @AndroidBy(id ="com.google.android.calculator:id/digit_1")
    MobileElement btnSatu;
    @AndroidBy(id = "com.google.android.calculator:id/digit_2")
    MobileElement btnDua;
    @AndroidBy(id = "com.google.android.calculator:id/op_add")
    MobileElement btnTambah;
    @AndroidBy(id = "com.google.android.caculator:id/eq")
    MobileElement btnSamaDengan;
    @AndroidBy(id = "com.google.android.calculator:id/result_final")
    MobileElement hasil;

    //Method
    public void calcAdd() {
        btnSatu.click();
        btnTambah.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public String getTxtResult() {
        return hasil.getText();
    }
}
