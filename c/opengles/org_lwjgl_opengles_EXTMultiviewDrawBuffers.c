/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glReadBufferIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glDrawBuffersIndexedEXTPROC) (jint, const intptr_t, const intptr_t);
typedef void (APIENTRY *glGetIntegeri_vEXTPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_glReadBufferIndexedEXT(JNIEnv *__env, jclass clazz, jint src, jint index) {
    glReadBufferIndexedEXTPROC glReadBufferIndexedEXT = (glReadBufferIndexedEXTPROC)tlsGetFunction(587);
    UNUSED_PARAM(clazz)
    glReadBufferIndexedEXT(src, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_nglDrawBuffersIndexedEXT__IJJ(JNIEnv *__env, jclass clazz, jint n, jlong locationAddress, jlong indicesAddress) {
    glDrawBuffersIndexedEXTPROC glDrawBuffersIndexedEXT = (glDrawBuffersIndexedEXTPROC)tlsGetFunction(163);
    const intptr_t location = (const intptr_t)locationAddress;
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawBuffersIndexedEXT(n, location, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_nglGetIntegeri_1vEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetIntegeri_vEXTPROC glGetIntegeri_vEXT = (glGetIntegeri_vEXTPROC)tlsGetFunction(290);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetIntegeri_vEXT(target, index, data);
}

EXTERN_C_EXIT
