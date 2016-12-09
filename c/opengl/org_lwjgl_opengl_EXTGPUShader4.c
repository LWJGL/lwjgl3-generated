/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexAttribI1iEXTPROC) (jint, jint);
typedef void (APIENTRY *glVertexAttribI2iEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI3iEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI4iEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI1uiEXTPROC) (jint, jint);
typedef void (APIENTRY *glVertexAttribI2uiEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI3uiEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI4uiEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI1ivEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI2ivEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI3ivEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI4ivEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI1uivEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI2uivEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI3uivEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI4uivEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI4bvEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI4svEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI4ubvEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribI4usvEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribIPointerEXTPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetVertexAttribIivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribIuivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformuivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBindFragDataLocationEXTPROC) (jint, jint, const intptr_t);
typedef jint (APIENTRY *glGetFragDataLocationEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glUniform1uiEXTPROC) (jint, jint);
typedef void (APIENTRY *glUniform2uiEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glUniform3uiEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glUniform4uiEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glUniform1uivEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2uivEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3uivEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4uivEXTPROC) (jint, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI1iEXT(JNIEnv *__env, jclass clazz, jint index, jint x) {
	glVertexAttribI1iEXTPROC glVertexAttribI1iEXT = (glVertexAttribI1iEXTPROC)tlsGetFunction(1969);
	UNUSED_PARAM(clazz)
	glVertexAttribI1iEXT(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI2iEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y) {
	glVertexAttribI2iEXTPROC glVertexAttribI2iEXT = (glVertexAttribI2iEXTPROC)tlsGetFunction(1977);
	UNUSED_PARAM(clazz)
	glVertexAttribI2iEXT(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI3iEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z) {
	glVertexAttribI3iEXTPROC glVertexAttribI3iEXT = (glVertexAttribI3iEXTPROC)tlsGetFunction(1985);
	UNUSED_PARAM(clazz)
	glVertexAttribI3iEXT(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4iEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w) {
	glVertexAttribI4iEXTPROC glVertexAttribI4iEXT = (glVertexAttribI4iEXTPROC)tlsGetFunction(1995);
	UNUSED_PARAM(clazz)
	glVertexAttribI4iEXT(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI1uiEXT(JNIEnv *__env, jclass clazz, jint index, jint x) {
	glVertexAttribI1uiEXTPROC glVertexAttribI1uiEXT = (glVertexAttribI1uiEXTPROC)tlsGetFunction(1973);
	UNUSED_PARAM(clazz)
	glVertexAttribI1uiEXT(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI2uiEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y) {
	glVertexAttribI2uiEXTPROC glVertexAttribI2uiEXT = (glVertexAttribI2uiEXTPROC)tlsGetFunction(1981);
	UNUSED_PARAM(clazz)
	glVertexAttribI2uiEXT(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI3uiEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z) {
	glVertexAttribI3uiEXTPROC glVertexAttribI3uiEXT = (glVertexAttribI3uiEXTPROC)tlsGetFunction(1989);
	UNUSED_PARAM(clazz)
	glVertexAttribI3uiEXT(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4uiEXT(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w) {
	glVertexAttribI4uiEXTPROC glVertexAttribI4uiEXT = (glVertexAttribI4uiEXTPROC)tlsGetFunction(2003);
	UNUSED_PARAM(clazz)
	glVertexAttribI4uiEXT(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI1ivEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI1ivEXTPROC glVertexAttribI1ivEXT = (glVertexAttribI1ivEXTPROC)tlsGetFunction(1971);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI1ivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI2ivEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI2ivEXTPROC glVertexAttribI2ivEXT = (glVertexAttribI2ivEXTPROC)tlsGetFunction(1979);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI2ivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI3ivEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI3ivEXTPROC glVertexAttribI3ivEXT = (glVertexAttribI3ivEXTPROC)tlsGetFunction(1987);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI3ivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4ivEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI4ivEXTPROC glVertexAttribI4ivEXT = (glVertexAttribI4ivEXTPROC)tlsGetFunction(1997);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI4ivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI1uivEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI1uivEXTPROC glVertexAttribI1uivEXT = (glVertexAttribI1uivEXTPROC)tlsGetFunction(1975);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI1uivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI2uivEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI2uivEXTPROC glVertexAttribI2uivEXT = (glVertexAttribI2uivEXTPROC)tlsGetFunction(1983);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI2uivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI3uivEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI3uivEXTPROC glVertexAttribI3uivEXT = (glVertexAttribI3uivEXTPROC)tlsGetFunction(1991);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI3uivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4uivEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI4uivEXTPROC glVertexAttribI4uivEXT = (glVertexAttribI4uivEXTPROC)tlsGetFunction(2005);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI4uivEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4bvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI4bvEXTPROC glVertexAttribI4bvEXT = (glVertexAttribI4bvEXTPROC)tlsGetFunction(1993);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI4bvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4svEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI4svEXTPROC glVertexAttribI4svEXT = (glVertexAttribI4svEXTPROC)tlsGetFunction(1999);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI4svEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4ubvEXT(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI4ubvEXTPROC glVertexAttribI4ubvEXT = (glVertexAttribI4ubvEXTPROC)tlsGetFunction(2001);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI4ubvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribI4usvEXT__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttribI4usvEXTPROC glVertexAttribI4usvEXT = (glVertexAttribI4usvEXTPROC)tlsGetFunction(2007);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribI4usvEXT(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglVertexAttribIPointerEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress) {
	glVertexAttribIPointerEXTPROC glVertexAttribIPointerEXT = (glVertexAttribIPointerEXTPROC)tlsGetFunction(2011);
	const intptr_t pointer = (const intptr_t)pointerAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribIPointerEXT(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglGetVertexAttribIivEXT__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribIivEXTPROC glGetVertexAttribIivEXT = (glGetVertexAttribIivEXTPROC)tlsGetFunction(771);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribIivEXT(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglGetVertexAttribIuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribIuivEXTPROC glGetVertexAttribIuivEXT = (glGetVertexAttribIuivEXTPROC)tlsGetFunction(773);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribIuivEXT(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglGetUniformuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
	glGetUniformuivEXTPROC glGetUniformuivEXT = (glGetUniformuivEXTPROC)tlsGetFunction(761);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformuivEXT(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglBindFragDataLocationEXT(JNIEnv *__env, jclass clazz, jint program, jint color, jlong nameAddress) {
	glBindFragDataLocationEXTPROC glBindFragDataLocationEXT = (glBindFragDataLocationEXTPROC)tlsGetFunction(40);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glBindFragDataLocationEXT(program, color, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglGetFragDataLocationEXT(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
	glGetFragDataLocationEXTPROC glGetFragDataLocationEXT = (glGetFragDataLocationEXTPROC)tlsGetFunction(548);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetFragDataLocationEXT(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform1uiEXT(JNIEnv *__env, jclass clazz, jint location, jint v0) {
	glUniform1uiEXTPROC glUniform1uiEXT = (glUniform1uiEXTPROC)tlsGetFunction(1713);
	UNUSED_PARAM(clazz)
	glUniform1uiEXT(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform2uiEXT(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1) {
	glUniform2uiEXTPROC glUniform2uiEXT = (glUniform2uiEXTPROC)tlsGetFunction(1735);
	UNUSED_PARAM(clazz)
	glUniform2uiEXT(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform3uiEXT(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2) {
	glUniform3uiEXTPROC glUniform3uiEXT = (glUniform3uiEXTPROC)tlsGetFunction(1757);
	UNUSED_PARAM(clazz)
	glUniform3uiEXT(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform4uiEXT(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {
	glUniform4uiEXTPROC glUniform4uiEXT = (glUniform4uiEXTPROC)tlsGetFunction(1779);
	UNUSED_PARAM(clazz)
	glUniform4uiEXT(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform1uivEXT__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1uivEXTPROC glUniform1uivEXT = (glUniform1uivEXTPROC)tlsGetFunction(1715);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1uivEXT(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform2uivEXT__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2uivEXTPROC glUniform2uivEXT = (glUniform2uivEXTPROC)tlsGetFunction(1737);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2uivEXT(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform3uivEXT__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3uivEXTPROC glUniform3uivEXT = (glUniform3uivEXTPROC)tlsGetFunction(1759);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3uivEXT(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGPUShader4_nglUniform4uivEXT__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4uivEXTPROC glUniform4uivEXT = (glUniform4uivEXTPROC)tlsGetFunction(1781);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4uivEXT(location, count, value);
}

EXTERN_C_EXIT
