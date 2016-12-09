/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindBufferPROC) (jint, jint);
typedef void (APIENTRY *glDeleteBuffersPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenBuffersPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsBufferPROC) (jint);
typedef void (APIENTRY *glBufferDataPROC) (jint, intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glBufferSubDataPROC) (jint, intptr_t, intptr_t, const intptr_t);
typedef void (APIENTRY *glGetBufferSubDataPROC) (jint, intptr_t, intptr_t, intptr_t);
typedef intptr_t (APIENTRY *glMapBufferPROC) (jint, jint);
typedef jboolean (APIENTRY *glUnmapBufferPROC) (jint);
typedef void (APIENTRY *glGetBufferParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetBufferPointervPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGenQueriesPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteQueriesPROC) (jint, const intptr_t);
typedef jboolean (APIENTRY *glIsQueryPROC) (jint);
typedef void (APIENTRY *glBeginQueryPROC) (jint, jint);
typedef void (APIENTRY *glEndQueryPROC) (jint);
typedef void (APIENTRY *glGetQueryivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectuivPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBindBuffer(JNIEnv *__env, jclass clazz, jint target, jint buffer) {
	glBindBufferPROC glBindBuffer = (glBindBufferPROC)tlsGetFunction(27);
	UNUSED_PARAM(clazz)
	glBindBuffer(target, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglDeleteBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
	glDeleteBuffersPROC glDeleteBuffers = (glDeleteBuffersPROC)tlsGetFunction(292);
	const intptr_t buffers = (const intptr_t)buffersAddress;
	UNUSED_PARAM(clazz)
	glDeleteBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGenBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
	glGenBuffersPROC glGenBuffers = (glGenBuffersPROC)tlsGetFunction(465);
	intptr_t buffers = (intptr_t)buffersAddress;
	UNUSED_PARAM(clazz)
	glGenBuffers(n, buffers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglIsBuffer(JNIEnv *__env, jclass clazz, jint buffer) {
	glIsBufferPROC glIsBuffer = (glIsBufferPROC)tlsGetFunction(854);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsBuffer(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBufferData__IJJI(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint usage) {
	glBufferDataPROC glBufferData = (glBufferDataPROC)tlsGetFunction(91);
	const intptr_t data = (const intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glBufferData(target, (intptr_t)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBufferSubData__IJJJ(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress) {
	glBufferSubDataPROC glBufferSubData = (glBufferSubDataPROC)tlsGetFunction(95);
	const intptr_t data = (const intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glBufferSubData(target, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferSubData__IJJJ(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress) {
	glGetBufferSubDataPROC glGetBufferSubData = (glGetBufferSubDataPROC)tlsGetFunction(515);
	intptr_t data = (intptr_t)dataAddress;
	UNUSED_PARAM(clazz)
	glGetBufferSubData(target, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL15_nglMapBuffer(JNIEnv *__env, jclass clazz, jint target, jint access) {
	glMapBufferPROC glMapBuffer = (glMapBufferPROC)tlsGetFunction(930);
	UNUSED_PARAM(clazz)
	return (jlong)glMapBuffer(target, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglUnmapBuffer(JNIEnv *__env, jclass clazz, jint target) {
	glUnmapBufferPROC glUnmapBuffer = (glUnmapBufferPROC)tlsGetFunction(1813);
	UNUSED_PARAM(clazz)
	return (jboolean)glUnmapBuffer(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetBufferParameterivPROC glGetBufferParameteriv = (glGetBufferParameterivPROC)tlsGetFunction(510);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetBufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetBufferPointerv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetBufferPointervPROC glGetBufferPointerv = (glGetBufferPointervPROC)tlsGetFunction(513);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetBufferPointerv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGenQueries__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glGenQueriesPROC glGenQueries = (glGenQueriesPROC)tlsGetFunction(475);
	intptr_t ids = (intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glGenQueries(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglDeleteQueries__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glDeleteQueriesPROC glDeleteQueries = (glDeleteQueriesPROC)tlsGetFunction(307);
	const intptr_t ids = (const intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glDeleteQueries(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL15_nglIsQuery(JNIEnv *__env, jclass clazz, jint id) {
	glIsQueryPROC glIsQuery = (glIsQueryPROC)tlsGetFunction(875);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsQuery(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglBeginQuery(JNIEnv *__env, jclass clazz, jint target, jint id) {
	glBeginQueryPROC glBeginQuery = (glBeginQueryPROC)tlsGetFunction(19);
	UNUSED_PARAM(clazz)
	glBeginQuery(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglEndQuery(JNIEnv *__env, jclass clazz, jint target) {
	glEndQueryPROC glEndQuery = (glEndQueryPROC)tlsGetFunction(398);
	UNUSED_PARAM(clazz)
	glEndQuery(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
	glGetQueryivPROC glGetQueryiv = (glGetQueryivPROC)tlsGetFunction(685);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetQueryiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryObjectiv__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
	glGetQueryObjectivPROC glGetQueryObjectiv = (glGetQueryObjectivPROC)tlsGetFunction(679);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetQueryObjectiv(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL15_nglGetQueryObjectuiv__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
	glGetQueryObjectuivPROC glGetQueryObjectuiv = (glGetQueryObjectuivPROC)tlsGetFunction(683);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetQueryObjectuiv(id, pname, params);
}

EXTERN_C_EXIT