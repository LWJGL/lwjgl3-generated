/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexParameterIivEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexParameterIuivEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetTexParameterIivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexParameterIuivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSamplerParameterIivEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glSamplerParameterIuivEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetSamplerParameterIivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterIuivEXTPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglTexParameterIivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIivEXTPROC glTexParameterIivEXT = (glTexParameterIivEXTPROC)tlsGetFunction(694);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglTexParameterIuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIuivEXTPROC glTexParameterIuivEXT = (glTexParameterIuivEXTPROC)tlsGetFunction(697);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIuivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglGetTexParameterIivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIivEXTPROC glGetTexParameterIivEXT = (glGetTexParameterIivEXTPROC)tlsGetFunction(381);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglGetTexParameterIuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIuivEXTPROC glGetTexParameterIuivEXT = (glGetTexParameterIuivEXTPROC)tlsGetFunction(384);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIuivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglSamplerParameterIivEXT__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramAddress) {
    glSamplerParameterIivEXTPROC glSamplerParameterIivEXT = (glSamplerParameterIivEXTPROC)tlsGetFunction(641);
    const intptr_t param = (const intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIivEXT(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglSamplerParameterIuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramAddress) {
    glSamplerParameterIuivEXTPROC glSamplerParameterIuivEXT = (glSamplerParameterIuivEXTPROC)tlsGetFunction(644);
    const intptr_t param = (const intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIuivEXT(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglGetSamplerParameterIivEXT__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIivEXTPROC glGetSamplerParameterIivEXT = (glGetSamplerParameterIivEXTPROC)tlsGetFunction(362);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIivEXT(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBorderClamp_nglGetSamplerParameterIuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIuivEXTPROC glGetSamplerParameterIuivEXT = (glGetSamplerParameterIuivEXTPROC)tlsGetFunction(365);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIuivEXT(sampler, pname, params);
}

EXTERN_C_EXIT
