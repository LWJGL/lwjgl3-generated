/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glCreateStatesNVPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glDeleteStatesNVPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsStateNVPROC) (GLuint);
typedef GLvoid (APIENTRY *glStateCaptureNVPROC) (GLuint, GLenum);
typedef GLuint (APIENTRY *glGetCommandHeaderNVPROC) (GLenum, GLuint);
typedef GLushort (APIENTRY *glGetStageIndexNVPROC) (GLenum);
typedef GLvoid (APIENTRY *glDrawCommandsNVPROC) (GLenum, GLuint, const GLintptr *, const GLsizei *, GLuint);
typedef GLvoid (APIENTRY *glDrawCommandsAddressNVPROC) (GLenum, const GLuint64 *, const GLsizei *, GLuint);
typedef GLvoid (APIENTRY *glDrawCommandsStatesNVPROC) (GLuint, const GLintptr *, const GLsizei *, const GLuint *, const GLuint *, GLuint);
typedef GLvoid (APIENTRY *glDrawCommandsStatesAddressNVPROC) (const GLuint64 *, const GLsizei *, const GLuint *, const GLuint *, GLuint);
typedef GLvoid (APIENTRY *glCreateCommandListsNVPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glDeleteCommandListsNVPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsCommandListNVPROC) (GLuint);
typedef GLvoid (APIENTRY *glListDrawCommandsStatesClientNVPROC) (GLuint, GLuint, const GLvoid **, const size_t *, const GLuint *, const GLuint *, GLuint);
typedef GLvoid (APIENTRY *glCommandListSegmentsNVPROC) (GLuint, GLuint);
typedef GLvoid (APIENTRY *glCompileCommandListNVPROC) (GLuint);
typedef GLvoid (APIENTRY *glCallCommandListNVPROC) (GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglCreateStatesNV(JNIEnv *__env, jclass clazz, jint n, jlong statesAddress, jlong __functionAddress) {
	GLuint *states = (GLuint *)(intptr_t)statesAddress;
	glCreateStatesNVPROC glCreateStatesNV = (glCreateStatesNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateStatesNV(n, states);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDeleteStatesNV(JNIEnv *__env, jclass clazz, jint n, jlong statesAddress, jlong __functionAddress) {
	const GLuint *states = (const GLuint *)(intptr_t)statesAddress;
	glDeleteStatesNVPROC glDeleteStatesNV = (glDeleteStatesNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteStatesNV(n, states);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVCommandList_nglIsStateNV(JNIEnv *__env, jclass clazz, jint state, jlong __functionAddress) {
	glIsStateNVPROC glIsStateNV = (glIsStateNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsStateNV(state);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglStateCaptureNV(JNIEnv *__env, jclass clazz, jint state, jint mode, jlong __functionAddress) {
	glStateCaptureNVPROC glStateCaptureNV = (glStateCaptureNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStateCaptureNV(state, mode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVCommandList_nglGetCommandHeaderNV(JNIEnv *__env, jclass clazz, jint tokenID, jint size, jlong __functionAddress) {
	glGetCommandHeaderNVPROC glGetCommandHeaderNV = (glGetCommandHeaderNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetCommandHeaderNV(tokenID, size);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_opengl_NVCommandList_nglGetStageIndexNV(JNIEnv *__env, jclass clazz, jint shadertype, jlong __functionAddress) {
	glGetStageIndexNVPROC glGetStageIndexNV = (glGetStageIndexNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jshort)glGetStageIndexNV(shadertype);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDrawCommandsNV(JNIEnv *__env, jclass clazz, jint primitiveMode, jint buffer, jlong indirectsAddress, jlong sizesAddress, jint count, jlong __functionAddress) {
	const GLintptr *indirects = (const GLintptr *)(intptr_t)indirectsAddress;
	const GLsizei *sizes = (const GLsizei *)(intptr_t)sizesAddress;
	glDrawCommandsNVPROC glDrawCommandsNV = (glDrawCommandsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawCommandsNV(primitiveMode, buffer, indirects, sizes, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDrawCommandsAddressNV(JNIEnv *__env, jclass clazz, jint primitiveMode, jlong indirectsAddress, jlong sizesAddress, jint count, jlong __functionAddress) {
	const GLuint64 *indirects = (const GLuint64 *)(intptr_t)indirectsAddress;
	const GLsizei *sizes = (const GLsizei *)(intptr_t)sizesAddress;
	glDrawCommandsAddressNVPROC glDrawCommandsAddressNV = (glDrawCommandsAddressNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawCommandsAddressNV(primitiveMode, indirects, sizes, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDrawCommandsStatesNV(JNIEnv *__env, jclass clazz, jint buffer, jlong indirectsAddress, jlong sizesAddress, jlong statesAddress, jlong fbosAddress, jint count, jlong __functionAddress) {
	const GLintptr *indirects = (const GLintptr *)(intptr_t)indirectsAddress;
	const GLsizei *sizes = (const GLsizei *)(intptr_t)sizesAddress;
	const GLuint *states = (const GLuint *)(intptr_t)statesAddress;
	const GLuint *fbos = (const GLuint *)(intptr_t)fbosAddress;
	glDrawCommandsStatesNVPROC glDrawCommandsStatesNV = (glDrawCommandsStatesNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawCommandsStatesNV(buffer, indirects, sizes, states, fbos, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDrawCommandsStatesAddressNV(JNIEnv *__env, jclass clazz, jlong indirectsAddress, jlong sizesAddress, jlong statesAddress, jlong fbosAddress, jint count, jlong __functionAddress) {
	const GLuint64 *indirects = (const GLuint64 *)(intptr_t)indirectsAddress;
	const GLsizei *sizes = (const GLsizei *)(intptr_t)sizesAddress;
	const GLuint *states = (const GLuint *)(intptr_t)statesAddress;
	const GLuint *fbos = (const GLuint *)(intptr_t)fbosAddress;
	glDrawCommandsStatesAddressNVPROC glDrawCommandsStatesAddressNV = (glDrawCommandsStatesAddressNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawCommandsStatesAddressNV(indirects, sizes, states, fbos, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglCreateCommandListsNV(JNIEnv *__env, jclass clazz, jint n, jlong listsAddress, jlong __functionAddress) {
	GLuint *lists = (GLuint *)(intptr_t)listsAddress;
	glCreateCommandListsNVPROC glCreateCommandListsNV = (glCreateCommandListsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCreateCommandListsNV(n, lists);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglDeleteCommandListsNV(JNIEnv *__env, jclass clazz, jint n, jlong listsAddress, jlong __functionAddress) {
	const GLuint *lists = (const GLuint *)(intptr_t)listsAddress;
	glDeleteCommandListsNVPROC glDeleteCommandListsNV = (glDeleteCommandListsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteCommandListsNV(n, lists);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVCommandList_nglIsCommandListNV(JNIEnv *__env, jclass clazz, jint list, jlong __functionAddress) {
	glIsCommandListNVPROC glIsCommandListNV = (glIsCommandListNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsCommandListNV(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglListDrawCommandsStatesClientNV(JNIEnv *__env, jclass clazz, jint list, jint segment, jlong indirectsAddress, jlong sizesAddress, jlong statesAddress, jlong fbosAddress, jint count, jlong __functionAddress) {
	const GLvoid **indirects = (const GLvoid **)(intptr_t)indirectsAddress;
	const size_t *sizes = (const size_t *)(intptr_t)sizesAddress;
	const GLuint *states = (const GLuint *)(intptr_t)statesAddress;
	const GLuint *fbos = (const GLuint *)(intptr_t)fbosAddress;
	glListDrawCommandsStatesClientNVPROC glListDrawCommandsStatesClientNV = (glListDrawCommandsStatesClientNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glListDrawCommandsStatesClientNV(list, segment, indirects, sizes, states, fbos, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglCommandListSegmentsNV(JNIEnv *__env, jclass clazz, jint list, jint segments, jlong __functionAddress) {
	glCommandListSegmentsNVPROC glCommandListSegmentsNV = (glCommandListSegmentsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCommandListSegmentsNV(list, segments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglCompileCommandListNV(JNIEnv *__env, jclass clazz, jint list, jlong __functionAddress) {
	glCompileCommandListNVPROC glCompileCommandListNV = (glCompileCommandListNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompileCommandListNV(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVCommandList_nglCallCommandListNV(JNIEnv *__env, jclass clazz, jint list, jlong __functionAddress) {
	glCallCommandListNVPROC glCallCommandListNV = (glCallCommandListNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCallCommandListNV(list);
}

EXTERN_C_EXIT
