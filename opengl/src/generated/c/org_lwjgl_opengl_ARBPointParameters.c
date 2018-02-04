/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glPointParameterfARBPROC) (jint, jfloat);
typedef void (APIENTRY *glPointParameterfvARBPROC) (jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBPointParameters_glPointParameterfARB(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glPointParameterfARBPROC glPointParameterfARB = (glPointParameterfARBPROC)tlsGetFunction(1247);
    UNUSED_PARAM(clazz)
    glPointParameterfARB(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBPointParameters_nglPointParameterfvARB__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glPointParameterfvARBPROC glPointParameterfvARB = (glPointParameterfvARBPROC)tlsGetFunction(1250);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glPointParameterfvARB(pname, params);
}

EXTERN_C_EXIT