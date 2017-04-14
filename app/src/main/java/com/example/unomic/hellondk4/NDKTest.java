package com.example.unomic.hellondk4;

/**
 * Created by unomic on 2017. 4. 14..
 */

public class NDKTest {
    public native void ndkTestMethod(String msg);
    public native String getHelloNDKString();

    static{
        System.loadLibrary("ndkTest");
    }

}
