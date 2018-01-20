/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawElementsBaseVertexOESPROC) (jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexOESPROC) (jint, jint, jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexOESPROC) (jint, jint, jint, const intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsBaseVertexOESPROC) (jint, const intptr_t, jint, const intptr_t, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawElementsBaseVertex_nglDrawElementsBaseVertexOES(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawElementsBaseVertexOESPROC glDrawElementsBaseVertexOES = (glDrawElementsBaseVertexOESPROC)tlsGetFunction(176);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsBaseVertexOES(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawElementsBaseVertex_nglDrawRangeElementsBaseVertexOES(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawRangeElementsBaseVertexOESPROC glDrawRangeElementsBaseVertexOES = (glDrawRangeElementsBaseVertexOESPROC)tlsGetFunction(190);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElementsBaseVertexOES(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawElementsBaseVertex_nglDrawElementsInstancedBaseVertexOES(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex) {
    glDrawElementsInstancedBaseVertexOESPROC glDrawElementsInstancedBaseVertexOES = (glDrawElementsInstancedBaseVertexOESPROC)tlsGetFunction(184);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertexOES(mode, count, type, indices, instancecount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawElementsBaseVertex_nglMultiDrawElementsBaseVertexOES__IJIJIJ(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount, jlong basevertexAddress) {
    glMultiDrawElementsBaseVertexOESPROC glMultiDrawElementsBaseVertexOES = (glMultiDrawElementsBaseVertexOESPROC)tlsGetFunction(481);
    const intptr_t count = (const intptr_t)countAddress;
    const intptr_t indices = (const intptr_t)indicesAddress;
    const intptr_t basevertex = (const intptr_t)basevertexAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsBaseVertexOES(mode, count, type, indices, primcount, basevertex);
}

EXTERN_C_EXIT
