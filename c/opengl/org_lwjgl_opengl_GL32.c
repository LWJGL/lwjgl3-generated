/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetBufferParameteri64vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glDrawElementsBaseVertexPROC) (jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexPROC) (jint, jint, jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexPROC) (jint, jint, jint, const intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsBaseVertexPROC) (jint, const intptr_t, jint, const intptr_t, jint, intptr_t);
typedef void (APIENTRY *glProvokingVertexPROC) (jint);
typedef void (APIENTRY *glTexImage2DMultisamplePROC) (jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTexImage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glGetMultisamplefvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSampleMaskiPROC) (jint, jint);
typedef void (APIENTRY *glFramebufferTexturePROC) (jint, jint, jint, jint);
typedef intptr_t (APIENTRY *glFenceSyncPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsSyncPROC) (intptr_t);
typedef void (APIENTRY *glDeleteSyncPROC) (intptr_t);
typedef jint (APIENTRY *glClientWaitSyncPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glWaitSyncPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glGetInteger64vPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetInteger64i_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSyncivPROC) (intptr_t, jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglGetBufferParameteri64v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetBufferParameteri64vPROC glGetBufferParameteri64v = (glGetBufferParameteri64vPROC)tlsGetFunction(517);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBufferParameteri64v(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawElementsBaseVertexPROC glDrawElementsBaseVertex = (glDrawElementsBaseVertexPROC)tlsGetFunction(365);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglDrawRangeElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawRangeElementsBaseVertexPROC glDrawRangeElementsBaseVertex = (glDrawRangeElementsBaseVertexPROC)tlsGetFunction(375);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglDrawElementsInstancedBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint basevertex) {
    glDrawElementsInstancedBaseVertexPROC glDrawElementsInstancedBaseVertex = (glDrawElementsInstancedBaseVertexPROC)tlsGetFunction(370);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglMultiDrawElementsBaseVertex__IJIJIJ(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount, jlong basevertexAddress) {
    glMultiDrawElementsBaseVertexPROC glMultiDrawElementsBaseVertex = (glMultiDrawElementsBaseVertexPROC)tlsGetFunction(1018);
    const intptr_t count = (const intptr_t)countAddress;
    const intptr_t indices = (const intptr_t)indicesAddress;
    intptr_t basevertex = (intptr_t)basevertexAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsBaseVertex(mode, count, type, indices, primcount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_glProvokingVertex(JNIEnv *__env, jclass clazz, jint mode) {
    glProvokingVertexPROC glProvokingVertex = (glProvokingVertexPROC)tlsGetFunction(1423);
    UNUSED_PARAM(clazz)
    glProvokingVertex(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_glTexImage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
    glTexImage2DMultisamplePROC glTexImage2DMultisample = (glTexImage2DMultisamplePROC)tlsGetFunction(1647);
    UNUSED_PARAM(clazz)
    glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_glTexImage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTexImage3DMultisamplePROC glTexImage3DMultisample = (glTexImage3DMultisamplePROC)tlsGetFunction(1650);
    UNUSED_PARAM(clazz)
    glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglGetMultisamplefv__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress) {
    glGetMultisamplefvPROC glGetMultisamplefv = (glGetMultisamplefvPROC)tlsGetFunction(603);
    intptr_t val = (intptr_t)valAddress;
    UNUSED_PARAM(clazz)
    glGetMultisamplefv(pname, index, val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_glSampleMaski(JNIEnv *__env, jclass clazz, jint index, jint mask) {
    glSampleMaskiPROC glSampleMaski = (glSampleMaskiPROC)tlsGetFunction(1490);
    UNUSED_PARAM(clazz)
    glSampleMaski(index, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_glFramebufferTexture(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
    glFramebufferTexturePROC glFramebufferTexture = (glFramebufferTexturePROC)tlsGetFunction(455);
    UNUSED_PARAM(clazz)
    glFramebufferTexture(target, attachment, texture, level);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL32_glFenceSync(JNIEnv *__env, jclass clazz, jint condition, jint flags) {
    glFenceSyncPROC glFenceSync = (glFenceSyncPROC)tlsGetFunction(425);
    UNUSED_PARAM(clazz)
    return (jlong)glFenceSync(condition, flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL32_nglIsSync(JNIEnv *__env, jclass clazz, jlong syncAddress) {
    glIsSyncPROC glIsSync = (glIsSyncPROC)tlsGetFunction(902);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glIsSync(sync);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglDeleteSync(JNIEnv *__env, jclass clazz, jlong syncAddress) {
    glDeleteSyncPROC glDeleteSync = (glDeleteSyncPROC)tlsGetFunction(321);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    glDeleteSync(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL32_nglClientWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
    glClientWaitSyncPROC glClientWaitSync = (glClientWaitSyncPROC)tlsGetFunction(139);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    return (jint)glClientWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
    glWaitSyncPROC glWaitSync = (glWaitSyncPROC)tlsGetFunction(2126);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    glWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglGetInteger64v__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetInteger64vPROC glGetInteger64v = (glGetInteger64vPROC)tlsGetFunction(571);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInteger64v(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglGetInteger64i_1v__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress) {
    glGetInteger64i_vPROC glGetInteger64i_v = (glGetInteger64i_vPROC)tlsGetFunction(570);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInteger64i_v(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32_nglGetSynciv__JIIJJ(JNIEnv *__env, jclass clazz, jlong syncAddress, jint pname, jint bufSize, jlong lengthAddress, jlong valuesAddress) {
    glGetSyncivPROC glGetSynciv = (glGetSyncivPROC)tlsGetFunction(714);
    intptr_t sync = (intptr_t)syncAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetSynciv(sync, pname, bufSize, length, values);
}

EXTERN_C_EXIT
