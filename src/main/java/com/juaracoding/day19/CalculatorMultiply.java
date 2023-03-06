package com.juaracoding.day19;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;

public class CalculatorMultiply {
    public static AndroidDriver<MobileElement> driver;

    public CalculatorMultiply(AndroidDriver<MobileElement> driver) {

        CalculatorMultiply.driver = driver;
    }

    @AndroidBy(id = "com.google.android.calculator:id/digit_3")
    MobileElement btnTiga;
    @AndroidBy(id = "com.google.android.calculator:id/digit_4")
    MobileElement btnEmpat;
    @AndroidBy(id = "com.google.android.calculator:id/op_mul")
    MobileElement btnKali;
    @AndroidBy(id = "com.google.android.calculator:id/eq")
    MobileElement btnSamaDengan;
    @AndroidBy(id = "com.google.android.calculator:id/result_final")
    MobileElement hasil;

    //Method
    public void calcAdd() {
        btnTiga.click();
        btnKali.click();
        btnEmpat.click();
        btnSamaDengan.click();
    }

    public String getTxtResult() {
        return hasil.getText();
    }
}
