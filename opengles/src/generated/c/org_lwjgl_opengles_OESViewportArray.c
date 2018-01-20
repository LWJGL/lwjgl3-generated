/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glViewportArrayvOESPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glViewportIndexedfOESPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glViewportIndexedfvOESPROC) (jint, const intptr_t);
typedef void (APIENTRY *glScissorArrayvOESPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glScissorIndexedOESPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glScissorIndexedvOESPROC) (jint, const intptr_t);
typedef void (APIENTRY *glDepthRangeArrayfvOESPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glDepthRangeIndexedfOESPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glGetFloati_vOESPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glEnableiOESPROC) (jint, jint);
typedef void (APIENTRY *glDisableiOESPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsEnablediOESPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglViewportArrayvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glViewportArrayvOESPROC glViewportArrayvOES = (glViewportArrayvOESPROC)tlsGetFunction(822);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportArrayvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glViewportIndexedfOES(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat w, jfloat h) {
    glViewportIndexedfOESPROC glViewportIndexedfOES = (glViewportIndexedfOESPROC)tlsGetFunction(824);
    UNUSED_PARAM(clazz)
    glViewportIndexedfOES(index, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglViewportIndexedfvOES__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glViewportIndexedfvOESPROC glViewportIndexedfvOES = (glViewportIndexedfvOESPROC)tlsGetFunction(826);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportIndexedfvOES(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglScissorArrayvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glScissorArrayvOESPROC glScissorArrayvOES = (glScissorArrayvOESPROC)tlsGetFunction(652);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorArrayvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glScissorIndexedOES(JNIEnv *__env, jclass clazz, jint index, jint left, jint bottom, jint width, jint height) {
    glScissorIndexedOESPROC glScissorIndexedOES = (glScissorIndexedOESPROC)tlsGetFunction(654);
    UNUSED_PARAM(clazz)
    glScissorIndexedOES(index, left, bottom, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglScissorIndexedvOES__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glScissorIndexedvOESPROC glScissorIndexedvOES = (glScissorIndexedvOESPROC)tlsGetFunction(656);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorIndexedvOES(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglDepthRangeArrayfvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glDepthRangeArrayfvOESPROC glDepthRangeArrayfvOES = (glDepthRangeArrayfvOESPROC)tlsGetFunction(147);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glDepthRangeArrayfvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glDepthRangeIndexedfOES(JNIEnv *__env, jclass clazz, jint index, jfloat n, jfloat f) {
    glDepthRangeIndexedfOESPROC glDepthRangeIndexedfOES = (glDepthRangeIndexedfOESPROC)tlsGetFunction(149);
    UNUSED_PARAM(clazz)
    glDepthRangeIndexedfOES(index, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglGetFloati_1vOES__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetFloati_vOESPROC glGetFloati_vOES = (glGetFloati_vOESPROC)tlsGetFunction(290);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetFloati_vOES(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glEnableiOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glEnableiOESPROC glEnableiOES = (glEnableiOESPROC)tlsGetFunction(202);
    UNUSED_PARAM(clazz)
    glEnableiOES(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glDisableiOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glDisableiOESPROC glDisableiOES = (glDisableiOESPROC)tlsGetFunction(158);
    UNUSED_PARAM(clazz)
    glDisableiOES(target, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESViewportArray_glIsEnablediOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnablediOESPROC glIsEnablediOES = (glIsEnablediOESPROC)tlsGetFunction(432);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnablediOES(target, index);
}

EXTERN_C_EXIT
