/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glBeginPerfQueryINTELPROC) (GLuint);
typedef void (APIENTRY *glCreatePerfQueryINTELPROC) (GLuint, GLuint *);
typedef void (APIENTRY *glDeletePerfQueryINTELPROC) (GLuint);
typedef void (APIENTRY *glEndPerfQueryINTELPROC) (GLuint);
typedef void (APIENTRY *glGetFirstPerfQueryIdINTELPROC) (GLuint *);
typedef void (APIENTRY *glGetNextPerfQueryIdINTELPROC) (GLuint, GLuint *);
typedef void (APIENTRY *glGetPerfCounterInfoINTELPROC) (GLuint, GLuint, GLuint, GLchar *, GLuint, GLchar *, GLuint *, GLuint *, GLuint *, GLuint *, GLuint64 *);
typedef void (APIENTRY *glGetPerfQueryDataINTELPROC) (GLuint, GLuint, GLsizei, void *, GLuint *);
typedef void (APIENTRY *glGetPerfQueryIdByNameINTELPROC) (GLchar *, GLuint *);
typedef void (APIENTRY *glGetPerfQueryInfoINTELPROC) (GLuint, GLuint, GLchar *, GLuint *, GLuint *, GLuint *, GLuint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglBeginPerfQueryINTEL(JNIEnv *__env, jclass clazz, jint queryHandle, jlong __functionAddress) {
	glBeginPerfQueryINTELPROC glBeginPerfQueryINTEL = (glBeginPerfQueryINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginPerfQueryINTEL(queryHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglCreatePerfQueryINTEL(JNIEnv *__env, jclass clazz, jint queryId, jlong queryHandleAddress, jlong __functionAddress) {
	GLuint *queryHandle = (GLuint *)(intptr_t)queryHandleAddress;
	glCreatePerfQueryINTELPROC glCreatePerfQueryINTEL = (glCreatePerfQueryINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreatePerfQueryINTEL(queryId, queryHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglDeletePerfQueryINTEL(JNIEnv *__env, jclass clazz, jint queryHandle, jlong __functionAddress) {
	glDeletePerfQueryINTELPROC glDeletePerfQueryINTEL = (glDeletePerfQueryINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeletePerfQueryINTEL(queryHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglEndPerfQueryINTEL(JNIEnv *__env, jclass clazz, jint queryHandle, jlong __functionAddress) {
	glEndPerfQueryINTELPROC glEndPerfQueryINTEL = (glEndPerfQueryINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndPerfQueryINTEL(queryHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglGetFirstPerfQueryIdINTEL(JNIEnv *__env, jclass clazz, jlong queryIdAddress, jlong __functionAddress) {
	GLuint *queryId = (GLuint *)(intptr_t)queryIdAddress;
	glGetFirstPerfQueryIdINTELPROC glGetFirstPerfQueryIdINTEL = (glGetFirstPerfQueryIdINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFirstPerfQueryIdINTEL(queryId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglGetNextPerfQueryIdINTEL(JNIEnv *__env, jclass clazz, jint queryId, jlong nextQueryIdAddress, jlong __functionAddress) {
	GLuint *nextQueryId = (GLuint *)(intptr_t)nextQueryIdAddress;
	glGetNextPerfQueryIdINTELPROC glGetNextPerfQueryIdINTEL = (glGetNextPerfQueryIdINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNextPerfQueryIdINTEL(queryId, nextQueryId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglGetPerfCounterInfoINTEL(JNIEnv *__env, jclass clazz, jint queryId, jint counterId, jint counterNameLength, jlong counterNameAddress, jint counterDescLength, jlong counterDescAddress, jlong counterOffsetAddress, jlong counterDataSizeAddress, jlong counterTypeEnumAddress, jlong counterDataTypeEnumAddress, jlong rawCounterMaxValueAddress, jlong __functionAddress) {
	GLchar *counterName = (GLchar *)(intptr_t)counterNameAddress;
	GLchar *counterDesc = (GLchar *)(intptr_t)counterDescAddress;
	GLuint *counterOffset = (GLuint *)(intptr_t)counterOffsetAddress;
	GLuint *counterDataSize = (GLuint *)(intptr_t)counterDataSizeAddress;
	GLuint *counterTypeEnum = (GLuint *)(intptr_t)counterTypeEnumAddress;
	GLuint *counterDataTypeEnum = (GLuint *)(intptr_t)counterDataTypeEnumAddress;
	GLuint64 *rawCounterMaxValue = (GLuint64 *)(intptr_t)rawCounterMaxValueAddress;
	glGetPerfCounterInfoINTELPROC glGetPerfCounterInfoINTEL = (glGetPerfCounterInfoINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfCounterInfoINTEL(queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglGetPerfQueryDataINTEL(JNIEnv *__env, jclass clazz, jint queryHandle, jint flags, jint dataSize, jlong dataAddress, jlong bytesWrittenAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	GLuint *bytesWritten = (GLuint *)(intptr_t)bytesWrittenAddress;
	glGetPerfQueryDataINTELPROC glGetPerfQueryDataINTEL = (glGetPerfQueryDataINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfQueryDataINTEL(queryHandle, flags, dataSize, data, bytesWritten);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglGetPerfQueryIdByNameINTEL(JNIEnv *__env, jclass clazz, jlong queryNameAddress, jlong queryIdAddress, jlong __functionAddress) {
	GLchar *queryName = (GLchar *)(intptr_t)queryNameAddress;
	GLuint *queryId = (GLuint *)(intptr_t)queryIdAddress;
	glGetPerfQueryIdByNameINTELPROC glGetPerfQueryIdByNameINTEL = (glGetPerfQueryIdByNameINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfQueryIdByNameINTEL(queryName, queryId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELPerformanceQuery_nglGetPerfQueryInfoINTEL(JNIEnv *__env, jclass clazz, jint queryId, jint queryNameLength, jlong queryNameAddress, jlong dataSizeAddress, jlong noCountersAddress, jlong noInstancesAddress, jlong capsMaskAddress, jlong __functionAddress) {
	GLchar *queryName = (GLchar *)(intptr_t)queryNameAddress;
	GLuint *dataSize = (GLuint *)(intptr_t)dataSizeAddress;
	GLuint *noCounters = (GLuint *)(intptr_t)noCountersAddress;
	GLuint *noInstances = (GLuint *)(intptr_t)noInstancesAddress;
	GLuint *capsMask = (GLuint *)(intptr_t)capsMaskAddress;
	glGetPerfQueryInfoINTELPROC glGetPerfQueryInfoINTEL = (glGetPerfQueryInfoINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfQueryInfoINTEL(queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask);
}

EXTERN_C_EXIT
