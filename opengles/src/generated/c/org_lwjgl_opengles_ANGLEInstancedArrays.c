/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawArraysInstancedANGLEPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedANGLEPROC) (jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glVertexAttribDivisorANGLEPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEInstancedArrays_glDrawArraysInstancedANGLE(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount) {
    glDrawArraysInstancedANGLEPROC glDrawArraysInstancedANGLE = (glDrawArraysInstancedANGLEPROC)tlsGetFunction(165);
    UNUSED_PARAM(clazz)
    glDrawArraysInstancedANGLE(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEInstancedArrays_nglDrawElementsInstancedANGLE(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount) {
    glDrawElementsInstancedANGLEPROC glDrawElementsInstancedANGLE = (glDrawElementsInstancedANGLEPROC)tlsGetFunction(179);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedANGLE(mode, count, type, indices, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLEInstancedArrays_glVertexAttribDivisorANGLE(JNIEnv *__env, jclass clazz, jint index, jint divisor) {
    glVertexAttribDivisorANGLEPROC glVertexAttribDivisorANGLE = (glVertexAttribDivisorANGLEPROC)tlsGetFunction(808);
    UNUSED_PARAM(clazz)
    glVertexAttribDivisorANGLE(index, divisor);
}

EXTERN_C_EXIT
