/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glSpecializeShaderARBPROC) (jint, const intptr_t, jint, const intptr_t, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGLSPIRV_nglSpecializeShaderARB__IJIJJ(JNIEnv *__env, jclass clazz, jint shader, jlong pEntryPointAddress, jint numSpecializationConstants, jlong pConstantIndexAddress, jlong pConstantValueAddress) {
    glSpecializeShaderARBPROC glSpecializeShaderARB = (glSpecializeShaderARBPROC)tlsGetFunction(1563);
    const intptr_t pEntryPoint = (const intptr_t)pEntryPointAddress;
    const intptr_t pConstantIndex = (const intptr_t)pConstantIndexAddress;
    const intptr_t pConstantValue = (const intptr_t)pConstantValueAddress;
    UNUSED_PARAM(clazz)
    glSpecializeShaderARB(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
}

EXTERN_C_EXIT
