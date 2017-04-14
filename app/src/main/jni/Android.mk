#
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := ndkTest
LOCAL_SRC_FILES := ndkTest.cpp

include $(BUILD_SHARED_LIBRARY)