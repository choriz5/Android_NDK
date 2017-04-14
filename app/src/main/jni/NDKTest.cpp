//
// Created by unomic on 2017. 4. 14..
//
#include <stdio.h>
#include "com_example_unomic_hellondk4_NDKTest.h"

JNIEXPORT void JNICALL Java_com_example_unomic_hellondk4_NDKTest_ndkTestMethod
  (JNIEnv *env, jobject obj, jstring str)
  {
        printf("Hello World!");
        return;
  }


JNIEXPORT jstring JNICALL Java_com_example_unomic_hellondk4_NDKTest_getHelloNDKString
(JNIEnv * env, jobject job)
{
    jstring str = (*env).NewStringUTF("Hello World2222222!");
    return str;
}