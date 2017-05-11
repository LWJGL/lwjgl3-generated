/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glWindowPos2iARBPROC) (jint, jint);
typedef void (APIENTRY *glWindowPos2sARBPROC) (jshort, jshort);
typedef void (APIENTRY *glWindowPos2fARBPROC) (jfloat, jfloat);
typedef void (APIENTRY *glWindowPos2dARBPROC) (jdouble, jdouble);
typedef void (APIENTRY *glWindowPos2ivARBPROC) (const intptr_t);
typedef void (APIENTRY *glWindowPos2svARBPROC) (const intptr_t);
typedef void (APIENTRY *glWindowPos2fvARBPROC) (const intptr_t);
typedef void (APIENTRY *glWindowPos2dvARBPROC) (const intptr_t);
typedef void (APIENTRY *glWindowPos3iARBPROC) (jint, jint, jint);
typedef void (APIENTRY *glWindowPos3sARBPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glWindowPos3fARBPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glWindowPos3dARBPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glWindowPos3ivARBPROC) (const intptr_t);
typedef void (APIENTRY *glWindowPos3svARBPROC) (const intptr_t);
typedef void (APIENTRY *glWindowPos3fvARBPROC) (const intptr_t);
typedef void (APIENTRY *glWindowPos3dvARBPROC) (const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_glWindowPos2iARB(JNIEnv *__env, jclass clazz, jint x, jint y) {
    glWindowPos2iARBPROC glWindowPos2iARB = (glWindowPos2iARBPROC)tlsGetFunction(2104);
    UNUSED_PARAM(clazz)
    glWindowPos2iARB(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_glWindowPos2sARB(JNIEnv *__env, jclass clazz, jshort x, jshort y) {
    glWindowPos2sARBPROC glWindowPos2sARB = (glWindowPos2sARBPROC)tlsGetFunction(2108);
    UNUSED_PARAM(clazz)
    glWindowPos2sARB(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_glWindowPos2fARB(JNIEnv *__env, jclass clazz, jfloat x, jfloat y) {
    glWindowPos2fARBPROC glWindowPos2fARB = (glWindowPos2fARBPROC)tlsGetFunction(2100);
    UNUSED_PARAM(clazz)
    glWindowPos2fARB(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_glWindowPos2dARB(JNIEnv *__env, jclass clazz, jdouble x, jdouble y) {
    glWindowPos2dARBPROC glWindowPos2dARB = (glWindowPos2dARBPROC)tlsGetFunction(2096);
    UNUSED_PARAM(clazz)
    glWindowPos2dARB(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2ivARB__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos2ivARBPROC glWindowPos2ivARB = (glWindowPos2ivARBPROC)tlsGetFunction(2106);
    const intptr_t p = (const intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos2ivARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2svARB__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos2svARBPROC glWindowPos2svARB = (glWindowPos2svARBPROC)tlsGetFunction(2110);
    const intptr_t p = (const intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos2svARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2fvARB__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos2fvARBPROC glWindowPos2fvARB = (glWindowPos2fvARBPROC)tlsGetFunction(2102);
    const intptr_t p = (const intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos2fvARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos2dvARB__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos2dvARBPROC glWindowPos2dvARB = (glWindowPos2dvARBPROC)tlsGetFunction(2098);
    const intptr_t p = (const intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos2dvARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_glWindowPos3iARB(JNIEnv *__env, jclass clazz, jint x, jint y, jint z) {
    glWindowPos3iARBPROC glWindowPos3iARB = (glWindowPos3iARBPROC)tlsGetFunction(2120);
    UNUSED_PARAM(clazz)
    glWindowPos3iARB(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_glWindowPos3sARB(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z) {
    glWindowPos3sARBPROC glWindowPos3sARB = (glWindowPos3sARBPROC)tlsGetFunction(2124);
    UNUSED_PARAM(clazz)
    glWindowPos3sARB(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_glWindowPos3fARB(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glWindowPos3fARBPROC glWindowPos3fARB = (glWindowPos3fARBPROC)tlsGetFunction(2116);
    UNUSED_PARAM(clazz)
    glWindowPos3fARB(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_glWindowPos3dARB(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glWindowPos3dARBPROC glWindowPos3dARB = (glWindowPos3dARBPROC)tlsGetFunction(2112);
    UNUSED_PARAM(clazz)
    glWindowPos3dARB(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3ivARB__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos3ivARBPROC glWindowPos3ivARB = (glWindowPos3ivARBPROC)tlsGetFunction(2122);
    const intptr_t p = (const intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos3ivARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3svARB__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos3svARBPROC glWindowPos3svARB = (glWindowPos3svARBPROC)tlsGetFunction(2126);
    const intptr_t p = (const intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos3svARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3fvARB__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos3fvARBPROC glWindowPos3fvARB = (glWindowPos3fvARBPROC)tlsGetFunction(2118);
    const intptr_t p = (const intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos3fvARB(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBWindowPos_nglWindowPos3dvARB__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos3dvARBPROC glWindowPos3dvARB = (glWindowPos3dvARBPROC)tlsGetFunction(2114);
    const intptr_t p = (const intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos3dvARB(p);
}

EXTERN_C_EXIT
