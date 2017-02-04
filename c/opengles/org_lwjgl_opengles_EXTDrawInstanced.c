/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawArraysInstancedEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedEXTPROC) (jint, jint, jint, const intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawInstanced_glDrawArraysInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint start, jint count, jint primcount) {
	glDrawArraysInstancedEXTPROC glDrawArraysInstancedEXT = (glDrawArraysInstancedEXTPROC)tlsGetFunction(159);
	UNUSED_PARAM(clazz)
	glDrawArraysInstancedEXT(mode, start, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawInstanced_nglDrawElementsInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount) {
	glDrawElementsInstancedEXTPROC glDrawElementsInstancedEXT = (glDrawElementsInstancedEXTPROC)tlsGetFunction(177);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glDrawElementsInstancedEXT(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
