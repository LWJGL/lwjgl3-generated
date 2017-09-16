/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glProgramEnvParameters4fvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramLocalParameters4fvEXTPROC) (jint, jint, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUProgramParameters_nglProgramEnvParameters4fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jint count, jlong paramsAddress) {
    glProgramEnvParameters4fvEXTPROC glProgramEnvParameters4fvEXT = (glProgramEnvParameters4fvEXTPROC)tlsGetFunction(1277);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramEnvParameters4fvEXT(target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUProgramParameters_nglProgramLocalParameters4fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jint count, jlong paramsAddress) {
    glProgramLocalParameters4fvEXTPROC glProgramLocalParameters4fvEXT = (glProgramLocalParameters4fvEXTPROC)tlsGetFunction(1282);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramLocalParameters4fvEXT(target, index, count, params);
}

EXTERN_C_EXIT
