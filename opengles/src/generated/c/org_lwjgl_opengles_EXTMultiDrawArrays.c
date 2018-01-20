/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glMultiDrawArraysEXTPROC) (jint, const intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glMultiDrawElementsEXTPROC) (jint, const intptr_t, jint, const intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawArrays_nglMultiDrawArraysEXT__IJJI(JNIEnv *__env, jclass clazz, jint mode, jlong firstAddress, jlong countAddress, jint primcount) {
    glMultiDrawArraysEXTPROC glMultiDrawArraysEXT = (glMultiDrawArraysEXTPROC)tlsGetFunction(478);
    const intptr_t first = (const intptr_t)firstAddress;
    const intptr_t count = (const intptr_t)countAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysEXT(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawArrays_nglMultiDrawElementsEXT__IJIJI(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount) {
    glMultiDrawElementsEXTPROC glMultiDrawElementsEXT = (glMultiDrawElementsEXTPROC)tlsGetFunction(482);
    const intptr_t count = (const intptr_t)countAddress;
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsEXT(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
