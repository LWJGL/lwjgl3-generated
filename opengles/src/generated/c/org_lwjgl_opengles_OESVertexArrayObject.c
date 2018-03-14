/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glBindVertexArrayOESPROC) (jint);
typedef void (APIENTRY *glDeleteVertexArraysOESPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenVertexArraysOESPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsVertexArrayOESPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESVertexArrayObject_glBindVertexArrayOES(JNIEnv *__env, jclass clazz, jint array) {
    glBindVertexArrayOESPROC glBindVertexArrayOES = (glBindVertexArrayOESPROC)tlsGetFunction(797);
    UNUSED_PARAM(clazz)
    glBindVertexArrayOES(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESVertexArrayObject_nglDeleteVertexArraysOES__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glDeleteVertexArraysOESPROC glDeleteVertexArraysOES = (glDeleteVertexArraysOESPROC)tlsGetFunction(798);
    intptr_t arrays = (intptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glDeleteVertexArraysOES(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESVertexArrayObject_nglGenVertexArraysOES__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glGenVertexArraysOESPROC glGenVertexArraysOES = (glGenVertexArraysOESPROC)tlsGetFunction(799);
    intptr_t arrays = (intptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glGenVertexArraysOES(n, arrays);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESVertexArrayObject_glIsVertexArrayOES(JNIEnv *__env, jclass clazz, jint array) {
    glIsVertexArrayOESPROC glIsVertexArrayOES = (glIsVertexArrayOESPROC)tlsGetFunction(800);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsVertexArrayOES(array);
}

EXTERN_C_EXIT
