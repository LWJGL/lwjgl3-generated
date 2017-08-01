/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawElementsBaseVertexPROC) (jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexPROC) (jint, jint, jint, jint, jint, const intptr_t, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexPROC) (jint, jint, jint, const intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsBaseVertexPROC) (jint, const intptr_t, jint, const intptr_t, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawElementsBaseVertex_nglDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawElementsBaseVertexPROC glDrawElementsBaseVertex = (glDrawElementsBaseVertexPROC)tlsGetFunction(365);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawElementsBaseVertex_nglDrawRangeElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawRangeElementsBaseVertexPROC glDrawRangeElementsBaseVertex = (glDrawRangeElementsBaseVertexPROC)tlsGetFunction(375);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawElementsBaseVertex_nglDrawElementsInstancedBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint basevertex) {
    glDrawElementsInstancedBaseVertexPROC glDrawElementsInstancedBaseVertex = (glDrawElementsInstancedBaseVertexPROC)tlsGetFunction(370);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawElementsBaseVertex_nglMultiDrawElementsBaseVertex__IJIJIJ(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount, jlong basevertexAddress) {
    glMultiDrawElementsBaseVertexPROC glMultiDrawElementsBaseVertex = (glMultiDrawElementsBaseVertexPROC)tlsGetFunction(1018);
    const intptr_t count = (const intptr_t)countAddress;
    const intptr_t indices = (const intptr_t)indicesAddress;
    intptr_t basevertex = (intptr_t)basevertexAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsBaseVertex(mode, count, type, indices, primcount, basevertex);
}

EXTERN_C_EXIT
