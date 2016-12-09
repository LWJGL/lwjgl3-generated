/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawArraysInstancedBaseInstancePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseInstancePROC) (jint, jint, jint, const intptr_t, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexBaseInstancePROC) (jint, jint, jint, const intptr_t, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBaseInstance_nglDrawArraysInstancedBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount, jint baseinstance) {
	glDrawArraysInstancedBaseInstancePROC glDrawArraysInstancedBaseInstance = (glDrawArraysInstancedBaseInstancePROC)tlsGetFunction(348);
	UNUSED_PARAM(clazz)
	glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBaseInstance_nglDrawElementsInstancedBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint baseinstance) {
	glDrawElementsInstancedBaseInstancePROC glDrawElementsInstancedBaseInstance = (glDrawElementsInstancedBaseInstancePROC)tlsGetFunction(362);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBaseInstance_nglDrawElementsInstancedBaseVertexBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint basevertex, jint baseinstance) {
	glDrawElementsInstancedBaseVertexBaseInstancePROC glDrawElementsInstancedBaseVertexBaseInstance = (glDrawElementsInstancedBaseVertexBaseInstancePROC)tlsGetFunction(364);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
}

EXTERN_C_EXIT
