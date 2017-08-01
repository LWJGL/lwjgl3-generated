/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindVertexArrayPROC) (jint);
typedef void (APIENTRY *glDeleteVertexArraysPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenVertexArraysPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsVertexArrayPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexArrayObject_glBindVertexArray(JNIEnv *__env, jclass clazz, jint array) {
    glBindVertexArrayPROC glBindVertexArray = (glBindVertexArrayPROC)tlsGetFunction(61);
    UNUSED_PARAM(clazz)
    glBindVertexArray(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexArrayObject_nglDeleteVertexArrays__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glDeleteVertexArraysPROC glDeleteVertexArrays = (glDeleteVertexArraysPROC)tlsGetFunction(325);
    const intptr_t arrays = (const intptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glDeleteVertexArrays(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexArrayObject_nglGenVertexArrays__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glGenVertexArraysPROC glGenVertexArrays = (glGenVertexArraysPROC)tlsGetFunction(491);
    intptr_t arrays = (intptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glGenVertexArrays(n, arrays);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBVertexArrayObject_glIsVertexArray(JNIEnv *__env, jclass clazz, jint array) {
    glIsVertexArrayPROC glIsVertexArray = (glIsVertexArrayPROC)tlsGetFunction(908);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsVertexArray(array);
}

EXTERN_C_EXIT
