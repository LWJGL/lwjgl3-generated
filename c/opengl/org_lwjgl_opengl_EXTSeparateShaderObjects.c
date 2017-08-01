/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glUseShaderProgramEXTPROC) (jint, jint);
typedef void (APIENTRY *glActiveProgramEXTPROC) (jint);
typedef jint (APIENTRY *glCreateShaderProgramEXTPROC) (jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSeparateShaderObjects_glUseShaderProgramEXT(JNIEnv *__env, jclass clazz, jint type, jint program) {
    glUseShaderProgramEXTPROC glUseShaderProgramEXT = (glUseShaderProgramEXTPROC)tlsGetFunction(1862);
    UNUSED_PARAM(clazz)
    glUseShaderProgramEXT(type, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSeparateShaderObjects_glActiveProgramEXT(JNIEnv *__env, jclass clazz, jint program) {
    glActiveProgramEXTPROC glActiveProgramEXT = (glActiveProgramEXTPROC)tlsGetFunction(2);
    UNUSED_PARAM(clazz)
    glActiveProgramEXT(program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTSeparateShaderObjects_nglCreateShaderProgramEXT(JNIEnv *__env, jclass clazz, jint type, jlong stringAddress) {
    glCreateShaderProgramEXTPROC glCreateShaderProgramEXT = (glCreateShaderProgramEXTPROC)tlsGetFunction(279);
    const intptr_t string = (const intptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    return (jint)glCreateShaderProgramEXT(type, string);
}

EXTERN_C_EXIT
