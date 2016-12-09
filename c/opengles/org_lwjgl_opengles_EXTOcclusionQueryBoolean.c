/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGenQueriesEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteQueriesEXTPROC) (jint, const intptr_t);
typedef jboolean (APIENTRY *glIsQueryEXTPROC) (jint);
typedef void (APIENTRY *glBeginQueryEXTPROC) (jint, jint);
typedef void (APIENTRY *glEndQueryEXTPROC) (jint);
typedef void (APIENTRY *glGetQueryivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectuivEXTPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTOcclusionQueryBoolean_nglGenQueriesEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glGenQueriesEXTPROC glGenQueriesEXT = (glGenQueriesEXTPROC)tlsGetFunction(245);
	intptr_t ids = (intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glGenQueriesEXT(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTOcclusionQueryBoolean_nglDeleteQueriesEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glDeleteQueriesEXTPROC glDeleteQueriesEXT = (glDeleteQueriesEXTPROC)tlsGetFunction(126);
	const intptr_t ids = (const intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glDeleteQueriesEXT(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTOcclusionQueryBoolean_nglIsQueryEXT(JNIEnv *__env, jclass clazz, jint id) {
	glIsQueryEXTPROC glIsQueryEXT = (glIsQueryEXTPROC)tlsGetFunction(417);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsQueryEXT(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTOcclusionQueryBoolean_nglBeginQueryEXT(JNIEnv *__env, jclass clazz, jint target, jint id) {
	glBeginQueryEXTPROC glBeginQueryEXT = (glBeginQueryEXTPROC)tlsGetFunction(10);
	UNUSED_PARAM(clazz)
	glBeginQueryEXT(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTOcclusionQueryBoolean_nglEndQueryEXT(JNIEnv *__env, jclass clazz, jint target) {
	glEndQueryEXTPROC glEndQueryEXT = (glEndQueryEXTPROC)tlsGetFunction(196);
	UNUSED_PARAM(clazz)
	glEndQueryEXT(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTOcclusionQueryBoolean_nglGetQueryivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetQueryivEXTPROC glGetQueryivEXT = (glGetQueryivEXTPROC)tlsGetFunction(343);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetQueryivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTOcclusionQueryBoolean_nglGetQueryObjectuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
	glGetQueryObjectuivEXTPROC glGetQueryObjectuivEXT = (glGetQueryObjectuivEXTPROC)tlsGetFunction(341);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetQueryObjectuivEXT(id, pname, params);
}

EXTERN_C_EXIT
