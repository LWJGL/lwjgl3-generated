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
    glIsRenderbufferPROC glIsRenderbuffer = (glIsRenderbufferPROC)tlsGetFunction(899);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsRenderbuffer(renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glBindRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer) {
    glBindRenderbufferPROC glBindRenderbuffer = (glBindRenderbufferPROC)tlsGetFunction(52);
    UNUSED_PARAM(clazz)
    glBindRenderbuffer(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglDeleteRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glDeleteRenderbuffersPROC glDeleteRenderbuffers = (glDeleteRenderbuffersPROC)tlsGetFunction(316);
    const intptr_t renderbuffers = (const intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglGenRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glGenRenderbuffersPROC glGenRenderbuffers = (glGenRenderbuffersPROC)tlsGetFunction(487);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glGenRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glRenderbufferStorage(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height) {
    glRenderbufferStoragePROC glRenderbufferStorage = (glRenderbufferStoragePROC)tlsGetFunction(1480);
    UNUSED_PARAM(clazz)
    glRenderbufferStorage(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
    glRenderbufferStorageMultisamplePROC glRenderbufferStorageMultisample = (glRenderbufferStorageMultisamplePROC)tlsGetFunction(1482);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglGetRenderbufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetRenderbufferParameterivPROC glGetRenderbufferParameteriv = (glGetRenderbufferParameterivPROC)tlsGetFunction(699);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetRenderbufferParameteriv(target, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glIsFramebuffer(JNIEnv *__env, jclass clazz, jint framebuffer) {
    glIsFramebufferPROC glIsFramebuffer = (glIsFramebufferPROC)tlsGetFunction(883);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsFramebuffer(framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glBindFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint framebuffer) {
    glBindFramebufferPROC glBindFramebuffer = (glBindFramebufferPROC)tlsGetFunction(44);
    UNUSED_PARAM(clazz)
    glBindFramebuffer(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglDeleteFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glDeleteFramebuffersPROC glDeleteFramebuffers = (glDeleteFramebuffersPROC)tlsGetFunction(301);
    const intptr_t framebuffers = (const intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglGenFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glGenFramebuffersPROC glGenFramebuffers = (glGenFramebuffersPROC)tlsGetFunction(477);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glGenFramebuffers(n, framebuffers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glCheckFramebufferStatus(JNIEnv *__env, jclass clazz, jint target) {
    glCheckFramebufferStatusPROC glCheckFramebufferStatus = (glCheckFramebufferStatusPROC)tlsGetFunction(104);
    UNUSED_PARAM(clazz)
    return (jint)glCheckFramebufferStatus(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferTexture1D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture1DPROC glFramebufferTexture1D = (glFramebufferTexture1DPROC)tlsGetFunction(458);
    UNUSED_PARAM(clazz)
    glFramebufferTexture1D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferTexture2D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture2DPROC glFramebufferTexture2D = (glFramebufferTexture2DPROC)tlsGetFunction(460);
    UNUSED_PARAM(clazz)
    glFramebufferTexture2D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferTexture3D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint layer) {
    glFramebufferTexture3DPROC glFramebufferTexture3D = (glFramebufferTexture3DPROC)tlsGetFunction(462);
    UNUSED_PARAM(clazz)
    glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer) {
    glFramebufferTextureLayerPROC glFramebufferTextureLayer = (glFramebufferTextureLayerPROC)tlsGetFunction(468);
    UNUSED_PARAM(clazz)
    glFramebufferTextureLayer(target, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glFramebufferRenderbufferPROC glFramebufferRenderbuffer = (glFramebufferRenderbufferPROC)tlsGetFunction(453);
    UNUSED_PARAM(clazz)
    glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_nglGetFramebufferAttachmentParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress) {
    glGetFramebufferAttachmentParameterivPROC glGetFramebufferAttachmentParameteriv = (glGetFramebufferAttachmentParameterivPROC)tlsGetFunction(560);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glBlitFramebuffer(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
    glBlitFramebufferPROC glBlitFramebuffer = (glBlitFramebufferPROC)tlsGetFunction(89);
    UNUSED_PARAM(clazz)
    glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferObject_glGenerateMipmap(JNIEnv *__env, jclass clazz, jint target) {
    glGenerateMipmapPROC glGenerateMipmap = (glGenerateMipmapPROC)tlsGetFunction(495);
    UNUSED_PARAM(clazz)
    glGenerateMipmap(target);
}

EXTERN_C_EXIT
