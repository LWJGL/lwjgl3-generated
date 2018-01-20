/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawArraysIndirectPROC) (jint, const intptr_t);
typedef void (APIENTRY *glDrawElementsIndirectPROC) (jint, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawIndirect_nglDrawArraysIndirect__IJ(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress) {
    glDrawArraysIndirectPROC glDrawArraysIndirect = (glDrawArraysIndirectPROC)tlsGetFunction(353);
    const intptr_t indirect = (const intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glDrawArraysIndirect(mode, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawIndirect_nglDrawElementsIndirect__IIJ(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress) {
    glDrawElementsIndirectPROC glDrawElementsIndirect = (glDrawElementsIndirectPROC)tlsGetFunction(367);
    const intptr_t indirect = (const intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsIndirect(mode, type, indirect);
}

EXTERN_C_EXIT
