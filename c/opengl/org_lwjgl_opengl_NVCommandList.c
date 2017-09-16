/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glCreateStatesNVPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteStatesNVPROC) (jint, const intptr_t);
typedef jboolean (APIENTRY *glIsStateNVPROC) (jint);
typedef void (APIENTRY *glStateCaptureNVPROC) (jint, jint);
typedef jint (APIENTRY *glGetCommandHeaderNVPROC) (jint, jint);
typedef jshort (APIENTRY *glGetStageIndexNVPROC) (jint);
typedef void (APIENTRY *glDrawCommandsNVPROC) (jint, jint, const intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glDrawCommandsAddressNVPROC) (jint, const intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glDrawCommandsStatesNVPROC) (jint, const intptr_t, const intptr_t, const intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glDrawCommandsStatesAddressNVPROC) (const intptr_t, const intptr_t, const intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glCreateCommandListsNVPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteCommandListsNVPROC) (jint, const intptr_t);
typedef jboolean (APIENTRY *glIsCommandListNVPROC) (jint);
typedef void (APIENTRY *glListDrawCommandsStatesClientNVPROC) (jint, jint, const intptr_t, const intptr_t, const intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glCommandListSegmentsNVPROC) (jint, jint);
typedef void (APIENTRY *glCompileCommandListNVPROC) (jint);
typedef void (APIENTRY *glCallCommandListNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglCreateStatesNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong statesAddress) {
    glCreateStatesNVPROC glCreateStatesNV = (glCreateStatesNVPROC)tlsGetFunction(281);
    intptr_t states = (intptr_t)statesAddress;
    UNUSED_PARAM(clazz)
    glCreateStatesNV(n, states);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDeleteStatesNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong statesAddress) {
    glDeleteStatesNVPROC glDeleteStatesNV = (glDeleteStatesNVPROC)tlsGetFunction(321);
    const intptr_t states = (const intptr_t)statesAddress;
    UNUSED_PARAM(clazz)
    glDeleteStatesNV(n, states);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVCommandList_glIsStateNV(JNIEnv *__env, jclass clazz, jint state) {
    glIsStateNVPROC glIsStateNV = (glIsStateNVPROC)tlsGetFunction(904);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsStateNV(state);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_glStateCaptureNV(JNIEnv *__env, jclass clazz, jint state, jint mode) {
    glStateCaptureNVPROC glStateCaptureNV = (glStateCaptureNVPROC)tlsGetFunction(1563);
    UNUSED_PARAM(clazz)
    glStateCaptureNV(state, mode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVCommandList_glGetCommandHeaderNV(JNIEnv *__env, jclass clazz, jint tokenID, jint size) {
    glGetCommandHeaderNVPROC glGetCommandHeaderNV = (glGetCommandHeaderNVPROC)tlsGetFunction(532);
    UNUSED_PARAM(clazz)
    return (jint)glGetCommandHeaderNV(tokenID, size);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_opengl_NVCommandList_glGetStageIndexNV(JNIEnv *__env, jclass clazz, jint shadertype) {
    glGetStageIndexNVPROC glGetStageIndexNV = (glGetStageIndexNVPROC)tlsGetFunction(712);
    UNUSED_PARAM(clazz)
    return (jshort)glGetStageIndexNV(shadertype);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDrawCommandsNV__IIJJI(JNIEnv *__env, jclass clazz, jint primitiveMode, jint buffer, jlong indirectsAddress, jlong sizesAddress, jint count) {
    glDrawCommandsNVPROC glDrawCommandsNV = (glDrawCommandsNVPROC)tlsGetFunction(362);
    const intptr_t indirects = (const intptr_t)indirectsAddress;
    const intptr_t sizes = (const intptr_t)sizesAddress;
    UNUSED_PARAM(clazz)
    glDrawCommandsNV(primitiveMode, buffer, indirects, sizes, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDrawCommandsAddressNV__IJJI(JNIEnv *__env, jclass clazz, jint primitiveMode, jlong indirectsAddress, jlong sizesAddress, jint count) {
    glDrawCommandsAddressNVPROC glDrawCommandsAddressNV = (glDrawCommandsAddressNVPROC)tlsGetFunction(361);
    const intptr_t indirects = (const intptr_t)indirectsAddress;
    const intptr_t sizes = (const intptr_t)sizesAddress;
    UNUSED_PARAM(clazz)
    glDrawCommandsAddressNV(primitiveMode, indirects, sizes, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDrawCommandsStatesNV__IJJJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong indirectsAddress, jlong sizesAddress, jlong statesAddress, jlong fbosAddress, jint count) {
    glDrawCommandsStatesNVPROC glDrawCommandsStatesNV = (glDrawCommandsStatesNVPROC)tlsGetFunction(364);
    const intptr_t indirects = (const intptr_t)indirectsAddress;
    const intptr_t sizes = (const intptr_t)sizesAddress;
    const intptr_t states = (const intptr_t)statesAddress;
    const intptr_t fbos = (const intptr_t)fbosAddress;
    UNUSED_PARAM(clazz)
    glDrawCommandsStatesNV(buffer, indirects, sizes, states, fbos, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDrawCommandsStatesAddressNV__JJJJI(JNIEnv *__env, jclass clazz, jlong indirectsAddress, jlong sizesAddress, jlong statesAddress, jlong fbosAddress, jint count) {
    glDrawCommandsStatesAddressNVPROC glDrawCommandsStatesAddressNV = (glDrawCommandsStatesAddressNVPROC)tlsGetFunction(363);
    const intptr_t indirects = (const intptr_t)indirectsAddress;
    const intptr_t sizes = (const intptr_t)sizesAddress;
    const intptr_t states = (const intptr_t)statesAddress;
    const intptr_t fbos = (const intptr_t)fbosAddress;
    UNUSED_PARAM(clazz)
    glDrawCommandsStatesAddressNV(indirects, sizes, states, fbos, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglCreateCommandListsNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong listsAddress) {
    glCreateCommandListsNVPROC glCreateCommandListsNV = (glCreateCommandListsNVPROC)tlsGetFunction(267);
    intptr_t lists = (intptr_t)listsAddress;
    UNUSED_PARAM(clazz)
    glCreateCommandListsNV(n, lists);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDeleteCommandListsNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong listsAddress) {
    glDeleteCommandListsNVPROC glDeleteCommandListsNV = (glDeleteCommandListsNVPROC)tlsGetFunction(299);
    const intptr_t lists = (const intptr_t)listsAddress;
    UNUSED_PARAM(clazz)
    glDeleteCommandListsNV(n, lists);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVCommandList_glIsCommandListNV(JNIEnv *__env, jclass clazz, jint list) {
    glIsCommandListNVPROC glIsCommandListNV = (glIsCommandListNVPROC)tlsGetFunction(878);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsCommandListNV(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglListDrawCommandsStatesClientNV__IIJJJJI(JNIEnv *__env, jclass clazz, jint list, jint segment, jlong indirectsAddress, jlong sizesAddress, jlong statesAddress, jlong fbosAddress, jint count) {
    glListDrawCommandsStatesClientNVPROC glListDrawCommandsStatesClientNV = (glListDrawCommandsStatesClientNVPROC)tlsGetFunction(926);
    const intptr_t indirects = (const intptr_t)indirectsAddress;
    const intptr_t sizes = (const intptr_t)sizesAddress;
    const intptr_t states = (const intptr_t)statesAddress;
    const intptr_t fbos = (const intptr_t)fbosAddress;
    UNUSED_PARAM(clazz)
    glListDrawCommandsStatesClientNV(list, segment, indirects, sizes, states, fbos, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_glCommandListSegmentsNV(JNIEnv *__env, jclass clazz, jint list, jint segments) {
    glCommandListSegmentsNVPROC glCommandListSegmentsNV = (glCommandListSegmentsNVPROC)tlsGetFunction(192);
    UNUSED_PARAM(clazz)
    glCommandListSegmentsNV(list, segments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_glCompileCommandListNV(JNIEnv *__env, jclass clazz, jint list) {
    glCompileCommandListNVPROC glCompileCommandListNV = (glCompileCommandListNVPROC)tlsGetFunction(193);
    UNUSED_PARAM(clazz)
    glCompileCommandListNV(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_glCallCommandListNV(JNIEnv *__env, jclass clazz, jint list) {
    glCallCommandListNVPROC glCallCommandListNV = (glCallCommandListNVPROC)tlsGetFunction(101);
    UNUSED_PARAM(clazz)
    glCallCommandListNV(list);
}

EXTERN_C_EXIT
