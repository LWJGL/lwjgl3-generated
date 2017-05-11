/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBufferStoragePROC) (jint, intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glClearTexSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glClearTexImagePROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glBindBuffersBasePROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glBindBuffersRangePROC) (jint, jint, jint, const intptr_t, const intptr_t, const intptr_t);
typedef void (APIENTRY *glBindTexturesPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glBindSamplersPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glBindImageTexturesPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glBindVertexBuffersPROC) (jint, jint, const intptr_t, const intptr_t, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglBufferStorage__IJJI(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint flags) {
    glBufferStoragePROC glBufferStorage = (glBufferStoragePROC)tlsGetFunction(94);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBufferStorage(target, (intptr_t)size, data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglClearTexSubImage__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong dataAddress) {
    glClearTexSubImagePROC glClearTexSubImage = (glClearTexSubImagePROC)tlsGetFunction(131);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglClearTexImage__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint format, jint type, jlong dataAddress) {
    glClearTexImagePROC glClearTexImage = (glClearTexImagePROC)tlsGetFunction(130);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearTexImage(texture, level, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglBindBuffersBase__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint first, jint count, jlong buffersAddress) {
    glBindBuffersBasePROC glBindBuffersBase = (glBindBuffersBasePROC)tlsGetFunction(37);
    const intptr_t buffers = (const intptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glBindBuffersBase(target, first, count, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglBindBuffersRange__IIIJJJ(JNIEnv *__env, jclass clazz, jint target, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong sizesAddress) {
    glBindBuffersRangePROC glBindBuffersRange = (glBindBuffersRangePROC)tlsGetFunction(38);
    const intptr_t buffers = (const intptr_t)buffersAddress;
    const intptr_t offsets = (const intptr_t)offsetsAddress;
    const intptr_t sizes = (const intptr_t)sizesAddress;
    UNUSED_PARAM(clazz)
    glBindBuffersRange(target, first, count, buffers, offsets, sizes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglBindTextures__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong texturesAddress) {
    glBindTexturesPROC glBindTextures = (glBindTexturesPROC)tlsGetFunction(56);
    const intptr_t textures = (const intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glBindTextures(first, count, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglBindSamplers__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong samplersAddress) {
    glBindSamplersPROC glBindSamplers = (glBindSamplersPROC)tlsGetFunction(53);
    const intptr_t samplers = (const intptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glBindSamplers(first, count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglBindImageTextures__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong texturesAddress) {
    glBindImageTexturesPROC glBindImageTextures = (glBindImageTexturesPROC)tlsGetFunction(46);
    const intptr_t textures = (const intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glBindImageTextures(first, count, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44_nglBindVertexBuffers__IIJJJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong stridesAddress) {
    glBindVertexBuffersPROC glBindVertexBuffers = (glBindVertexBuffersPROC)tlsGetFunction(61);
    const intptr_t buffers = (const intptr_t)buffersAddress;
    const intptr_t offsets = (const intptr_t)offsetsAddress;
    const intptr_t strides = (const intptr_t)stridesAddress;
    UNUSED_PARAM(clazz)
    glBindVertexBuffers(first, count, buffers, offsets, strides);
}

EXTERN_C_EXIT
