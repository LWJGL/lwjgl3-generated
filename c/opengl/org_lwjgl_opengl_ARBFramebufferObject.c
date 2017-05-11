/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jboolean (APIENTRY *glIsRenderbufferPROC) (jint);
typedef void (APIENTRY *glBindRenderbufferPROC) (jint, jint);
typedef void (APIENTRY *glDeleteRenderbuffersPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenRenderbuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glRenderbufferStoragePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glRenderbufferStorageMultisamplePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetRenderbufferParameterivPROC) (jint, jint, intptr_t);
typedef jboolean (APIENTRY *glIsFramebufferPROC) (jint);
typedef void (APIENTRY *glBindFramebufferPROC) (jint, jint);
typedef void (APIENTRY *glDeleteFramebuffersPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenFramebuffersPROC) (jint, intptr_t);
typedef jint (APIENTRY *glCheckFramebufferStatusPROC) (jint);
typedef void (APIENTRY *glFramebufferTexture1DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture2DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture3DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureLayerPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferRenderbufferPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetFramebufferAttachmentParameterivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glBlitFramebufferPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGenerateMipmapPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glIsRenderbuffer(JNIEnv *__env, jclass clazz, jint renderbuffer) {
    glIsRenderbufferPROC glIsRenderbuffer = (glIsRenderbufferPROC)tlsGetFunction(877);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsRenderbuffer(renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glBindRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer) {
    glBindRenderbufferPROC glBindRenderbuffer = (glBindRenderbufferPROC)tlsGetFunction(50);
    UNUSED_PARAM(clazz)
    glBindRenderbuffer(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglDeleteRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glDeleteRenderbuffersPROC glDeleteRenderbuffers = (glDeleteRenderbuffersPROC)tlsGetFunction(309);
    const intptr_t renderbuffers = (const intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglGenRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glGenRenderbuffersPROC glGenRenderbuffers = (glGenRenderbuffersPROC)tlsGetFunction(477);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glGenRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glRenderbufferStorage(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height) {
    glRenderbufferStoragePROC glRenderbufferStorage = (glRenderbufferStoragePROC)tlsGetFunction(1447);
    UNUSED_PARAM(clazz)
    glRenderbufferStorage(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
    glRenderbufferStorageMultisamplePROC glRenderbufferStorageMultisample = (glRenderbufferStorageMultisamplePROC)tlsGetFunction(1449);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglGetRenderbufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetRenderbufferParameterivPROC glGetRenderbufferParameteriv = (glGetRenderbufferParameterivPROC)tlsGetFunction(687);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetRenderbufferParameteriv(target, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glIsFramebuffer(JNIEnv *__env, jclass clazz, jint framebuffer) {
    glIsFramebufferPROC glIsFramebuffer = (glIsFramebufferPROC)tlsGetFunction(862);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsFramebuffer(framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glBindFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint framebuffer) {
    glBindFramebufferPROC glBindFramebuffer = (glBindFramebufferPROC)tlsGetFunction(42);
    UNUSED_PARAM(clazz)
    glBindFramebuffer(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglDeleteFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glDeleteFramebuffersPROC glDeleteFramebuffers = (glDeleteFramebuffersPROC)tlsGetFunction(296);
    const intptr_t framebuffers = (const intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglGenFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glGenFramebuffersPROC glGenFramebuffers = (glGenFramebuffersPROC)tlsGetFunction(468);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glGenFramebuffers(n, framebuffers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glCheckFramebufferStatus(JNIEnv *__env, jclass clazz, jint target) {
    glCheckFramebufferStatusPROC glCheckFramebufferStatus = (glCheckFramebufferStatusPROC)tlsGetFunction(100);
    UNUSED_PARAM(clazz)
    return (jint)glCheckFramebufferStatus(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferTexture1D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture1DPROC glFramebufferTexture1D = (glFramebufferTexture1DPROC)tlsGetFunction(449);
    UNUSED_PARAM(clazz)
    glFramebufferTexture1D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferTexture2D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture2DPROC glFramebufferTexture2D = (glFramebufferTexture2DPROC)tlsGetFunction(451);
    UNUSED_PARAM(clazz)
    glFramebufferTexture2D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferTexture3D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint layer) {
    glFramebufferTexture3DPROC glFramebufferTexture3D = (glFramebufferTexture3DPROC)tlsGetFunction(453);
    UNUSED_PARAM(clazz)
    glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer) {
    glFramebufferTextureLayerPROC glFramebufferTextureLayer = (glFramebufferTextureLayerPROC)tlsGetFunction(459);
    UNUSED_PARAM(clazz)
    glFramebufferTextureLayer(target, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glFramebufferRenderbufferPROC glFramebufferRenderbuffer = (glFramebufferRenderbufferPROC)tlsGetFunction(444);
    UNUSED_PARAM(clazz)
    glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglGetFramebufferAttachmentParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress) {
    glGetFramebufferAttachmentParameterivPROC glGetFramebufferAttachmentParameteriv = (glGetFramebufferAttachmentParameterivPROC)tlsGetFunction(549);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glBlitFramebuffer(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
    glBlitFramebufferPROC glBlitFramebuffer = (glBlitFramebufferPROC)tlsGetFunction(87);
    UNUSED_PARAM(clazz)
    glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glGenerateMipmap(JNIEnv *__env, jclass clazz, jint target) {
    glGenerateMipmapPROC glGenerateMipmap = (glGenerateMipmapPROC)tlsGetFunction(484);
    UNUSED_PARAM(clazz)
    glGenerateMipmap(target);
}

EXTERN_C_EXIT
