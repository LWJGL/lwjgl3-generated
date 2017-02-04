/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glUniform1i64ARBPROC) (jint, jlong);
typedef void (APIENTRY *glUniform1i64vARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform1i64ARBPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniform1i64vARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2i64ARBPROC) (jint, jlong, jlong);
typedef void (APIENTRY *glUniform2i64vARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform2i64ARBPROC) (jint, jint, jlong, jlong);
typedef void (APIENTRY *glProgramUniform2i64vARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3i64ARBPROC) (jint, jlong, jlong, jlong);
typedef void (APIENTRY *glUniform3i64vARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform3i64ARBPROC) (jint, jint, jlong, jlong, jlong);
typedef void (APIENTRY *glProgramUniform3i64vARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4i64ARBPROC) (jint, jlong, jlong, jlong, jlong);
typedef void (APIENTRY *glUniform4i64vARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform4i64ARBPROC) (jint, jint, jlong, jlong, jlong, jlong);
typedef void (APIENTRY *glProgramUniform4i64vARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform1ui64ARBPROC) (jint, jlong);
typedef void (APIENTRY *glUniform1ui64vARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform1ui64ARBPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniform1ui64vARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2ui64ARBPROC) (jint, jlong, jlong);
typedef void (APIENTRY *glUniform2ui64vARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform2ui64ARBPROC) (jint, jint, jlong, jlong);
typedef void (APIENTRY *glProgramUniform2ui64vARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3ui64ARBPROC) (jint, jlong, jlong, jlong);
typedef void (APIENTRY *glUniform3ui64vARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform3ui64ARBPROC) (jint, jint, jlong, jlong, jlong);
typedef void (APIENTRY *glProgramUniform3ui64vARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4ui64ARBPROC) (jint, jlong, jlong, jlong, jlong);
typedef void (APIENTRY *glUniform4ui64vARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform4ui64ARBPROC) (jint, jint, jlong, jlong, jlong, jlong);
typedef void (APIENTRY *glProgramUniform4ui64vARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetUniformi64vARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformui64vARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetnUniformi64vARBPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnUniformui64vARBPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glUniform1i64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x) {
	glUniform1i64ARBPROC glUniform1i64ARB = (glUniform1i64ARBPROC)tlsGetFunction(1701);
	UNUSED_PARAM(clazz)
	glUniform1i64ARB(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform1i64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1i64vARBPROC glUniform1i64vARB = (glUniform1i64vARBPROC)tlsGetFunction(1703);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1i64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glProgramUniform1i64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x) {
	glProgramUniform1i64ARBPROC glProgramUniform1i64ARB = (glProgramUniform1i64ARBPROC)tlsGetFunction(1267);
	UNUSED_PARAM(clazz)
	glProgramUniform1i64ARB(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform1i64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniform1i64vARBPROC glProgramUniform1i64vARB = (glProgramUniform1i64vARBPROC)tlsGetFunction(1269);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniform1i64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glUniform2i64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y) {
	glUniform2i64ARBPROC glUniform2i64ARB = (glUniform2i64ARBPROC)tlsGetFunction(1723);
	UNUSED_PARAM(clazz)
	glUniform2i64ARB(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform2i64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2i64vARBPROC glUniform2i64vARB = (glUniform2i64vARBPROC)tlsGetFunction(1725);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2i64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glProgramUniform2i64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y) {
	glProgramUniform2i64ARBPROC glProgramUniform2i64ARB = (glProgramUniform2i64ARBPROC)tlsGetFunction(1291);
	UNUSED_PARAM(clazz)
	glProgramUniform2i64ARB(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform2i64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniform2i64vARBPROC glProgramUniform2i64vARB = (glProgramUniform2i64vARBPROC)tlsGetFunction(1293);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniform2i64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glUniform3i64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z) {
	glUniform3i64ARBPROC glUniform3i64ARB = (glUniform3i64ARBPROC)tlsGetFunction(1745);
	UNUSED_PARAM(clazz)
	glUniform3i64ARB(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform3i64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3i64vARBPROC glUniform3i64vARB = (glUniform3i64vARBPROC)tlsGetFunction(1747);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3i64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glProgramUniform3i64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z) {
	glProgramUniform3i64ARBPROC glProgramUniform3i64ARB = (glProgramUniform3i64ARBPROC)tlsGetFunction(1315);
	UNUSED_PARAM(clazz)
	glProgramUniform3i64ARB(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform3i64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniform3i64vARBPROC glProgramUniform3i64vARB = (glProgramUniform3i64vARBPROC)tlsGetFunction(1317);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniform3i64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glUniform4i64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong w) {
	glUniform4i64ARBPROC glUniform4i64ARB = (glUniform4i64ARBPROC)tlsGetFunction(1767);
	UNUSED_PARAM(clazz)
	glUniform4i64ARB(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform4i64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4i64vARBPROC glUniform4i64vARB = (glUniform4i64vARBPROC)tlsGetFunction(1769);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4i64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glProgramUniform4i64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong w) {
	glProgramUniform4i64ARBPROC glProgramUniform4i64ARB = (glProgramUniform4i64ARBPROC)tlsGetFunction(1339);
	UNUSED_PARAM(clazz)
	glProgramUniform4i64ARB(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform4i64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniform4i64vARBPROC glProgramUniform4i64vARB = (glProgramUniform4i64vARBPROC)tlsGetFunction(1341);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniform4i64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glUniform1ui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x) {
	glUniform1ui64ARBPROC glUniform1ui64ARB = (glUniform1ui64ARBPROC)tlsGetFunction(1709);
	UNUSED_PARAM(clazz)
	glUniform1ui64ARB(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform1ui64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1ui64vARBPROC glUniform1ui64vARB = (glUniform1ui64vARBPROC)tlsGetFunction(1711);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1ui64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glProgramUniform1ui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x) {
	glProgramUniform1ui64ARBPROC glProgramUniform1ui64ARB = (glProgramUniform1ui64ARBPROC)tlsGetFunction(1275);
	UNUSED_PARAM(clazz)
	glProgramUniform1ui64ARB(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform1ui64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniform1ui64vARBPROC glProgramUniform1ui64vARB = (glProgramUniform1ui64vARBPROC)tlsGetFunction(1277);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniform1ui64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glUniform2ui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y) {
	glUniform2ui64ARBPROC glUniform2ui64ARB = (glUniform2ui64ARBPROC)tlsGetFunction(1731);
	UNUSED_PARAM(clazz)
	glUniform2ui64ARB(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform2ui64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2ui64vARBPROC glUniform2ui64vARB = (glUniform2ui64vARBPROC)tlsGetFunction(1733);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2ui64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glProgramUniform2ui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y) {
	glProgramUniform2ui64ARBPROC glProgramUniform2ui64ARB = (glProgramUniform2ui64ARBPROC)tlsGetFunction(1299);
	UNUSED_PARAM(clazz)
	glProgramUniform2ui64ARB(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform2ui64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniform2ui64vARBPROC glProgramUniform2ui64vARB = (glProgramUniform2ui64vARBPROC)tlsGetFunction(1301);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniform2ui64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glUniform3ui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z) {
	glUniform3ui64ARBPROC glUniform3ui64ARB = (glUniform3ui64ARBPROC)tlsGetFunction(1753);
	UNUSED_PARAM(clazz)
	glUniform3ui64ARB(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform3ui64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3ui64vARBPROC glUniform3ui64vARB = (glUniform3ui64vARBPROC)tlsGetFunction(1755);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3ui64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glProgramUniform3ui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z) {
	glProgramUniform3ui64ARBPROC glProgramUniform3ui64ARB = (glProgramUniform3ui64ARBPROC)tlsGetFunction(1323);
	UNUSED_PARAM(clazz)
	glProgramUniform3ui64ARB(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform3ui64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniform3ui64vARBPROC glProgramUniform3ui64vARB = (glProgramUniform3ui64vARBPROC)tlsGetFunction(1325);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniform3ui64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glUniform4ui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong w) {
	glUniform4ui64ARBPROC glUniform4ui64ARB = (glUniform4ui64ARBPROC)tlsGetFunction(1775);
	UNUSED_PARAM(clazz)
	glUniform4ui64ARB(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglUniform4ui64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4ui64vARBPROC glUniform4ui64vARB = (glUniform4ui64vARBPROC)tlsGetFunction(1777);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4ui64vARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_glProgramUniform4ui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong w) {
	glProgramUniform4ui64ARBPROC glProgramUniform4ui64ARB = (glProgramUniform4ui64ARBPROC)tlsGetFunction(1347);
	UNUSED_PARAM(clazz)
	glProgramUniform4ui64ARB(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglProgramUniform4ui64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
	glProgramUniform4ui64vARBPROC glProgramUniform4ui64vARB = (glProgramUniform4ui64vARBPROC)tlsGetFunction(1349);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glProgramUniform4ui64vARB(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglGetUniformi64vARB__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
	glGetUniformi64vARBPROC glGetUniformi64vARB = (glGetUniformi64vARBPROC)tlsGetFunction(754);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformi64vARB(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglGetUniformui64vARB__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
	glGetUniformui64vARBPROC glGetUniformui64vARB = (glGetUniformui64vARBPROC)tlsGetFunction(758);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformui64vARB(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglGetnUniformi64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
	glGetnUniformi64vARBPROC glGetnUniformi64vARB = (glGetnUniformi64vARBPROC)tlsGetFunction(820);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetnUniformi64vARB(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderInt64_nglGetnUniformui64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
	glGetnUniformui64vARBPROC glGetnUniformui64vARB = (glGetnUniformui64vARBPROC)tlsGetFunction(823);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetnUniformui64vARB(program, location, bufSize, params);
}

EXTERN_C_EXIT
