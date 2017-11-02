/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGetUnsignedBytevEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetUnsignedBytei_vEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGenSemaphoresEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteSemaphoresEXTPROC) (jint, const intptr_t);
typedef jboolean (APIENTRY *glIsSemaphoreEXTPROC) (jint);
typedef void (APIENTRY *glSemaphoreParameterui64vEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetSemaphoreParameterui64vEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glWaitSemaphoreEXTPROC) (jint, jint, const intptr_t, jint, const intptr_t, const intptr_t);
typedef void (APIENTRY *glSignalSemaphoreEXTPROC) (jint, jint, const intptr_t, jint, const intptr_t, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglGetUnsignedBytevEXT(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
    glGetUnsignedBytevEXTPROC glGetUnsignedBytevEXT = (glGetUnsignedBytevEXTPROC)tlsGetFunction(401);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetUnsignedBytevEXT(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglGetUnsignedBytei_1vEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetUnsignedBytei_vEXTPROC glGetUnsignedBytei_vEXT = (glGetUnsignedBytei_vEXTPROC)tlsGetFunction(400);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetUnsignedBytei_vEXT(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglGenSemaphoresEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong semaphoresAddress) {
    glGenSemaphoresEXTPROC glGenSemaphoresEXT = (glGenSemaphoresEXTPROC)tlsGetFunction(262);
    intptr_t semaphores = (intptr_t)semaphoresAddress;
    UNUSED_PARAM(clazz)
    glGenSemaphoresEXT(n, semaphores);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglDeleteSemaphoresEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong semaphoresAddress) {
    glDeleteSemaphoresEXTPROC glDeleteSemaphoresEXT = (glDeleteSemaphoresEXTPROC)tlsGetFunction(136);
    const intptr_t semaphores = (const intptr_t)semaphoresAddress;
    UNUSED_PARAM(clazz)
    glDeleteSemaphoresEXT(n, semaphores);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTSemaphore_glIsSemaphoreEXT(JNIEnv *__env, jclass clazz, jint semaphore) {
    glIsSemaphoreEXTPROC glIsSemaphoreEXT = (glIsSemaphoreEXTPROC)tlsGetFunction(447);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsSemaphoreEXT(semaphore);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglSemaphoreParameterui64vEXT__IIJ(JNIEnv *__env, jclass clazz, jint semaphore, jint pname, jlong paramsAddress) {
    glSemaphoreParameterui64vEXTPROC glSemaphoreParameterui64vEXT = (glSemaphoreParameterui64vEXTPROC)tlsGetFunction(658);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSemaphoreParameterui64vEXT(semaphore, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglGetSemaphoreParameterui64vEXT__IIJ(JNIEnv *__env, jclass clazz, jint semaphore, jint pname, jlong paramsAddress) {
    glGetSemaphoreParameterui64vEXTPROC glGetSemaphoreParameterui64vEXT = (glGetSemaphoreParameterui64vEXTPROC)tlsGetFunction(369);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSemaphoreParameterui64vEXT(semaphore, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglWaitSemaphoreEXT__IIJIJJ(JNIEnv *__env, jclass clazz, jint semaphore, jint numBufferBarriers, jlong buffersAddress, jint numTextureBarriers, jlong texturesAddress, jlong srcLayoutsAddress) {
    glWaitSemaphoreEXTPROC glWaitSemaphoreEXT = (glWaitSemaphoreEXTPROC)tlsGetFunction(828);
    const intptr_t buffers = (const intptr_t)buffersAddress;
    const intptr_t textures = (const intptr_t)texturesAddress;
    const intptr_t srcLayouts = (const intptr_t)srcLayoutsAddress;
    UNUSED_PARAM(clazz)
    glWaitSemaphoreEXT(semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglSignalSemaphoreEXT__IIJIJJ(JNIEnv *__env, jclass clazz, jint semaphore, jint numBufferBarriers, jlong buffersAddress, jint numTextureBarriers, jlong texturesAddress, jlong dstLayoutsAddress) {
    glSignalSemaphoreEXTPROC glSignalSemaphoreEXT = (glSignalSemaphoreEXTPROC)tlsGetFunction(662);
    const intptr_t buffers = (const intptr_t)buffersAddress;
    const intptr_t textures = (const intptr_t)texturesAddress;
    const intptr_t dstLayouts = (const intptr_t)dstLayoutsAddress;
    UNUSED_PARAM(clazz)
    glSignalSemaphoreEXT(semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts);
}

EXTERN_C_EXIT
