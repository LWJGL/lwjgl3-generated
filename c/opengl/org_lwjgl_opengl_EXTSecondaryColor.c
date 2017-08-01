/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glSecondaryColor3bEXTPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glSecondaryColor3sEXTPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glSecondaryColor3iEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glSecondaryColor3fEXTPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glSecondaryColor3dEXTPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glSecondaryColor3ubEXTPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glSecondaryColor3usEXTPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glSecondaryColor3uiEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glSecondaryColor3bvEXTPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColor3svEXTPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColor3ivEXTPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColor3fvEXTPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColor3dvEXTPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColor3ubvEXTPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColor3usvEXTPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColor3uivEXTPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColorPointerEXTPROC) (jint, jint, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_glSecondaryColor3bEXT(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue) {
    glSecondaryColor3bEXTPROC glSecondaryColor3bEXT = (glSecondaryColor3bEXTPROC)tlsGetFunction(1504);
    UNUSED_PARAM(clazz)
    glSecondaryColor3bEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_glSecondaryColor3sEXT(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glSecondaryColor3sEXTPROC glSecondaryColor3sEXT = (glSecondaryColor3sEXTPROC)tlsGetFunction(1522);
    UNUSED_PARAM(clazz)
    glSecondaryColor3sEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_glSecondaryColor3iEXT(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue) {
    glSecondaryColor3iEXTPROC glSecondaryColor3iEXT = (glSecondaryColor3iEXTPROC)tlsGetFunction(1518);
    UNUSED_PARAM(clazz)
    glSecondaryColor3iEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_glSecondaryColor3fEXT(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue) {
    glSecondaryColor3fEXTPROC glSecondaryColor3fEXT = (glSecondaryColor3fEXTPROC)tlsGetFunction(1512);
    UNUSED_PARAM(clazz)
    glSecondaryColor3fEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_glSecondaryColor3dEXT(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue) {
    glSecondaryColor3dEXTPROC glSecondaryColor3dEXT = (glSecondaryColor3dEXTPROC)tlsGetFunction(1508);
    UNUSED_PARAM(clazz)
    glSecondaryColor3dEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_glSecondaryColor3ubEXT(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue) {
    glSecondaryColor3ubEXTPROC glSecondaryColor3ubEXT = (glSecondaryColor3ubEXTPROC)tlsGetFunction(1526);
    UNUSED_PARAM(clazz)
    glSecondaryColor3ubEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_glSecondaryColor3usEXT(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glSecondaryColor3usEXTPROC glSecondaryColor3usEXT = (glSecondaryColor3usEXTPROC)tlsGetFunction(1534);
    UNUSED_PARAM(clazz)
    glSecondaryColor3usEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_glSecondaryColor3uiEXT(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue) {
    glSecondaryColor3uiEXTPROC glSecondaryColor3uiEXT = (glSecondaryColor3uiEXTPROC)tlsGetFunction(1530);
    UNUSED_PARAM(clazz)
    glSecondaryColor3uiEXT(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3bvEXT(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3bvEXTPROC glSecondaryColor3bvEXT = (glSecondaryColor3bvEXTPROC)tlsGetFunction(1506);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3bvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3svEXT__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3svEXTPROC glSecondaryColor3svEXT = (glSecondaryColor3svEXTPROC)tlsGetFunction(1524);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3svEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3ivEXT__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3ivEXTPROC glSecondaryColor3ivEXT = (glSecondaryColor3ivEXTPROC)tlsGetFunction(1520);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3ivEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3fvEXT__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3fvEXTPROC glSecondaryColor3fvEXT = (glSecondaryColor3fvEXTPROC)tlsGetFunction(1514);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3fvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3dvEXT__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3dvEXTPROC glSecondaryColor3dvEXT = (glSecondaryColor3dvEXTPROC)tlsGetFunction(1510);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3dvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3ubvEXT(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3ubvEXTPROC glSecondaryColor3ubvEXT = (glSecondaryColor3ubvEXTPROC)tlsGetFunction(1528);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3ubvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3usvEXT__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3usvEXTPROC glSecondaryColor3usvEXT = (glSecondaryColor3usvEXTPROC)tlsGetFunction(1536);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3usvEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColor3uivEXT__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3uivEXTPROC glSecondaryColor3uivEXT = (glSecondaryColor3uivEXTPROC)tlsGetFunction(1532);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3uivEXT(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSecondaryColor_nglSecondaryColorPointerEXT__IIIJ(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glSecondaryColorPointerEXTPROC glSecondaryColorPointerEXT = (glSecondaryColorPointerEXTPROC)tlsGetFunction(1541);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColorPointerEXT(size, type, stride, pointer);
}

EXTERN_C_EXIT
