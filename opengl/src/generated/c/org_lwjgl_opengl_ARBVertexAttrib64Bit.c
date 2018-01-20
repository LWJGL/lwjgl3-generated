/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexAttribL1dPROC) (jint, jdouble);
typedef void (APIENTRY *glVertexAttribL2dPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttribL3dPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttribL4dPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttribL1dvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribL2dvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribL3dvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribL4dvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribLPointerPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetVertexAttribLdvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayVertexAttribLOffsetEXTPROC) (jint, jint, jint, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_glVertexAttribL1d(JNIEnv *__env, jclass clazz, jint index, jdouble x) {
    glVertexAttribL1dPROC glVertexAttribL1d = (glVertexAttribL1dPROC)tlsGetFunction(2060);
    UNUSED_PARAM(clazz)
    glVertexAttribL1d(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_glVertexAttribL2d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y) {
    glVertexAttribL2dPROC glVertexAttribL2d = (glVertexAttribL2dPROC)tlsGetFunction(2070);
    UNUSED_PARAM(clazz)
    glVertexAttribL2d(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_glVertexAttribL3d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z) {
    glVertexAttribL3dPROC glVertexAttribL3d = (glVertexAttribL3dPROC)tlsGetFunction(2078);
    UNUSED_PARAM(clazz)
    glVertexAttribL3d(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_glVertexAttribL4d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glVertexAttribL4dPROC glVertexAttribL4d = (glVertexAttribL4dPROC)tlsGetFunction(2086);
    UNUSED_PARAM(clazz)
    glVertexAttribL4d(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_nglVertexAttribL1dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL1dvPROC glVertexAttribL1dv = (glVertexAttribL1dvPROC)tlsGetFunction(2062);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL1dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_nglVertexAttribL2dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL2dvPROC glVertexAttribL2dv = (glVertexAttribL2dvPROC)tlsGetFunction(2072);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL2dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_nglVertexAttribL3dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL3dvPROC glVertexAttribL3dv = (glVertexAttribL3dvPROC)tlsGetFunction(2080);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL3dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_nglVertexAttribL4dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL4dvPROC glVertexAttribL4dv = (glVertexAttribL4dvPROC)tlsGetFunction(2088);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL4dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_nglVertexAttribLPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress) {
    glVertexAttribLPointerPROC glVertexAttribLPointer = (glVertexAttribLPointerPROC)tlsGetFunction(2096);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribLPointer(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_nglGetVertexAttribLdv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribLdvPROC glGetVertexAttribLdv = (glGetVertexAttribLdvPROC)tlsGetFunction(789);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribLdv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_glVertexArrayVertexAttribLOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayVertexAttribLOffsetEXTPROC glVertexArrayVertexAttribLOffsetEXT = (glVertexArrayVertexAttribLOffsetEXTPROC)tlsGetFunction(1925);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribLOffsetEXT(vaobj, buffer, index, size, type, stride, (intptr_t)offset);
}

EXTERN_C_EXIT
