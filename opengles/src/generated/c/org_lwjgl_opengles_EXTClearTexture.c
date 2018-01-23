/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glClearTexImageEXTPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glClearTexSubImageEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTClearTexture_nglClearTexImageEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint format, jint type, jlong dataAddress) {
    glClearTexImageEXTPROC glClearTexImageEXT = (glClearTexImageEXTPROC)tlsGetFunction(70);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearTexImageEXT(texture, level, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTClearTexture_nglClearTexSubImageEXT__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong dataAddress) {
    glClearTexSubImageEXTPROC glClearTexSubImageEXT = (glClearTexSubImageEXTPROC)tlsGetFunction(71);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
}

EXTERN_C_EXIT
