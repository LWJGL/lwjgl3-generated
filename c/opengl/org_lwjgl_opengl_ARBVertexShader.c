/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexAttrib1fARBPROC) (jint, jfloat);
typedef void (APIENTRY *glVertexAttrib1sARBPROC) (jint, jshort);
typedef void (APIENTRY *glVertexAttrib1dARBPROC) (jint, jdouble);
typedef void (APIENTRY *glVertexAttrib2fARBPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib2sARBPROC) (jint, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib2dARBPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib3fARBPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib3sARBPROC) (jint, jshort, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib3dARBPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib4fARBPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib4sARBPROC) (jint, jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib4dARBPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib4NubARBPROC) (jint, jbyte, jbyte, jbyte, jbyte);
typedef void (APIENTRY *glVertexAttrib1fvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib1svARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib1dvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2fvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2svARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2dvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3fvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3svARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3dvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4fvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4svARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4dvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4ivARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4bvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4ubvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4usvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4uivARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NbvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NsvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NivARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NubvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NusvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NuivARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribPointerARBPROC) (jint, jint, jint, jboolean, jint, const intptr_t);
typedef void (APIENTRY *glEnableVertexAttribArrayARBPROC) (jint);
typedef void (APIENTRY *glDisableVertexAttribArrayARBPROC) (jint);
typedef void (APIENTRY *glBindAttribLocationARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetActiveAttribARBPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetAttribLocationARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetVertexAttribivARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribfvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribdvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribPointervARBPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1fARB(JNIEnv *__env, jclass clazz, jint index, jfloat v0) {
	glVertexAttrib1fARBPROC glVertexAttrib1fARB = (glVertexAttrib1fARBPROC)tlsGetFunction(1888);
	UNUSED_PARAM(clazz)
	glVertexAttrib1fARB(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1sARB(JNIEnv *__env, jclass clazz, jint index, jshort v0) {
	glVertexAttrib1sARBPROC glVertexAttrib1sARB = (glVertexAttrib1sARBPROC)tlsGetFunction(1894);
	UNUSED_PARAM(clazz)
	glVertexAttrib1sARB(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1dARB(JNIEnv *__env, jclass clazz, jint index, jdouble v0) {
	glVertexAttrib1dARBPROC glVertexAttrib1dARB = (glVertexAttrib1dARBPROC)tlsGetFunction(1884);
	UNUSED_PARAM(clazz)
	glVertexAttrib1dARB(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2fARB(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1) {
	glVertexAttrib2fARBPROC glVertexAttrib2fARB = (glVertexAttrib2fARBPROC)tlsGetFunction(1902);
	UNUSED_PARAM(clazz)
	glVertexAttrib2fARB(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2sARB(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1) {
	glVertexAttrib2sARBPROC glVertexAttrib2sARB = (glVertexAttrib2sARBPROC)tlsGetFunction(1908);
	UNUSED_PARAM(clazz)
	glVertexAttrib2sARB(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2dARB(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1) {
	glVertexAttrib2dARBPROC glVertexAttrib2dARB = (glVertexAttrib2dARBPROC)tlsGetFunction(1898);
	UNUSED_PARAM(clazz)
	glVertexAttrib2dARB(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3fARB(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jfloat v2) {
	glVertexAttrib3fARBPROC glVertexAttrib3fARB = (glVertexAttrib3fARBPROC)tlsGetFunction(1916);
	UNUSED_PARAM(clazz)
	glVertexAttrib3fARB(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3sARB(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jshort v2) {
	glVertexAttrib3sARBPROC glVertexAttrib3sARB = (glVertexAttrib3sARBPROC)tlsGetFunction(1922);
	UNUSED_PARAM(clazz)
	glVertexAttrib3sARB(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3dARB(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jdouble v2) {
	glVertexAttrib3dARBPROC glVertexAttrib3dARB = (glVertexAttrib3dARBPROC)tlsGetFunction(1912);
	UNUSED_PARAM(clazz)
	glVertexAttrib3dARB(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4fARB(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
	glVertexAttrib4fARBPROC glVertexAttrib4fARB = (glVertexAttrib4fARBPROC)tlsGetFunction(1946);
	UNUSED_PARAM(clazz)
	glVertexAttrib4fARB(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4sARB(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jshort v2, jshort v3) {
	glVertexAttrib4sARBPROC glVertexAttrib4sARB = (glVertexAttrib4sARBPROC)tlsGetFunction(1954);
	UNUSED_PARAM(clazz)
	glVertexAttrib4sARB(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4dARB(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jdouble v2, jdouble v3) {
	glVertexAttrib4dARBPROC glVertexAttrib4dARB = (glVertexAttrib4dARBPROC)tlsGetFunction(1942);
	UNUSED_PARAM(clazz)
	glVertexAttrib4dARB(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NubARB(JNIEnv *__env, jclass clazz, jint index, jbyte x, jbyte y, jbyte z, jbyte w) {
	glVertexAttrib4NubARBPROC glVertexAttrib4NubARB = (glVertexAttrib4NubARBPROC)tlsGetFunction(1932);
	UNUSED_PARAM(clazz)
	glVertexAttrib4NubARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1fvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib1fvARBPROC glVertexAttrib1fvARB = (glVertexAttrib1fvARBPROC)tlsGetFunction(1890);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib1fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1svARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib1svARBPROC glVertexAttrib1svARB = (glVertexAttrib1svARBPROC)tlsGetFunction(1896);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib1svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib1dvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib1dvARBPROC glVertexAttrib1dvARB = (glVertexAttrib1dvARBPROC)tlsGetFunction(1886);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib1dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2fvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib2fvARBPROC glVertexAttrib2fvARB = (glVertexAttrib2fvARBPROC)tlsGetFunction(1904);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib2fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2svARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib2svARBPROC glVertexAttrib2svARB = (glVertexAttrib2svARBPROC)tlsGetFunction(1910);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib2svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib2dvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib2dvARBPROC glVertexAttrib2dvARB = (glVertexAttrib2dvARBPROC)tlsGetFunction(1900);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib2dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3fvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib3fvARBPROC glVertexAttrib3fvARB = (glVertexAttrib3fvARBPROC)tlsGetFunction(1918);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib3fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3svARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib3svARBPROC glVertexAttrib3svARB = (glVertexAttrib3svARBPROC)tlsGetFunction(1924);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib3svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib3dvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib3dvARBPROC glVertexAttrib3dvARB = (glVertexAttrib3dvARBPROC)tlsGetFunction(1914);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib3dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4fvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4fvARBPROC glVertexAttrib4fvARB = (glVertexAttrib4fvARBPROC)tlsGetFunction(1948);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4svARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4svARBPROC glVertexAttrib4svARB = (glVertexAttrib4svARBPROC)tlsGetFunction(1956);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4dvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4dvARBPROC glVertexAttrib4dvARB = (glVertexAttrib4dvARBPROC)tlsGetFunction(1944);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4ivARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4ivARBPROC glVertexAttrib4ivARB = (glVertexAttrib4ivARBPROC)tlsGetFunction(1952);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4ivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4bvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4bvARBPROC glVertexAttrib4bvARB = (glVertexAttrib4bvARBPROC)tlsGetFunction(1940);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4bvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4ubvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4ubvARBPROC glVertexAttrib4ubvARB = (glVertexAttrib4ubvARBPROC)tlsGetFunction(1958);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4ubvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4usvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4usvARBPROC glVertexAttrib4usvARB = (glVertexAttrib4usvARBPROC)tlsGetFunction(1962);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4usvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4uivARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4uivARBPROC glVertexAttrib4uivARB = (glVertexAttrib4uivARBPROC)tlsGetFunction(1960);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4uivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NbvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4NbvARBPROC glVertexAttrib4NbvARB = (glVertexAttrib4NbvARBPROC)tlsGetFunction(1926);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4NbvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NsvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4NsvARBPROC glVertexAttrib4NsvARB = (glVertexAttrib4NsvARBPROC)tlsGetFunction(1930);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4NsvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NivARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4NivARBPROC glVertexAttrib4NivARB = (glVertexAttrib4NivARBPROC)tlsGetFunction(1928);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4NivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NubvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4NubvARBPROC glVertexAttrib4NubvARB = (glVertexAttrib4NubvARBPROC)tlsGetFunction(1934);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4NubvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NusvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4NusvARBPROC glVertexAttrib4NusvARB = (glVertexAttrib4NusvARBPROC)tlsGetFunction(1938);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4NusvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttrib4NuivARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
	glVertexAttrib4NuivARBPROC glVertexAttrib4NuivARB = (glVertexAttrib4NuivARBPROC)tlsGetFunction(1936);
	const intptr_t v = (const intptr_t)vAddress;
	UNUSED_PARAM(clazz)
	glVertexAttrib4NuivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglVertexAttribPointerARB__IIIZIJ(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress) {
	glVertexAttribPointerARBPROC glVertexAttribPointerARB = (glVertexAttribPointerARBPROC)tlsGetFunction(2060);
	const intptr_t pointer = (const intptr_t)pointerAddress;
	UNUSED_PARAM(clazz)
	glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglEnableVertexAttribArrayARB(JNIEnv *__env, jclass clazz, jint index) {
	glEnableVertexAttribArrayARBPROC glEnableVertexAttribArrayARB = (glEnableVertexAttribArrayARBPROC)tlsGetFunction(389);
	UNUSED_PARAM(clazz)
	glEnableVertexAttribArrayARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglDisableVertexAttribArrayARB(JNIEnv *__env, jclass clazz, jint index) {
	glDisableVertexAttribArrayARBPROC glDisableVertexAttribArrayARB = (glDisableVertexAttribArrayARBPROC)tlsGetFunction(339);
	UNUSED_PARAM(clazz)
	glDisableVertexAttribArrayARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglBindAttribLocationARB(JNIEnv *__env, jclass clazz, jint programObj, jint index, jlong nameAddress) {
	glBindAttribLocationARBPROC glBindAttribLocationARB = (glBindAttribLocationARBPROC)tlsGetFunction(26);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glBindAttribLocationARB(programObj, index, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetActiveAttribARB__IIIJJJJ(JNIEnv *__env, jclass clazz, jint programObj, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
	glGetActiveAttribARBPROC glGetActiveAttribARB = (glGetActiveAttribARBPROC)tlsGetFunction(491);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t size = (intptr_t)sizeAddress;
	intptr_t type = (intptr_t)typeAddress;
	intptr_t name = (intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveAttribARB(programObj, index, maxLength, length, size, type, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetAttribLocationARB(JNIEnv *__env, jclass clazz, jint programObj, jlong nameAddress) {
	glGetAttribLocationARBPROC glGetAttribLocationARB = (glGetAttribLocationARBPROC)tlsGetFunction(505);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetAttribLocationARB(programObj, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetVertexAttribivARB__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribivARBPROC glGetVertexAttribivARB = (glGetVertexAttribivARBPROC)tlsGetFunction(786);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribivARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetVertexAttribfvARB__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribfvARBPROC glGetVertexAttribfvARB = (glGetVertexAttribfvARBPROC)tlsGetFunction(784);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribfvARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetVertexAttribdvARB__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
	glGetVertexAttribdvARBPROC glGetVertexAttribdvARB = (glGetVertexAttribdvARBPROC)tlsGetFunction(782);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribdvARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexShader_nglGetVertexAttribPointervARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress) {
	glGetVertexAttribPointervARBPROC glGetVertexAttribPointervARB = (glGetVertexAttribPointervARBPROC)tlsGetFunction(780);
	intptr_t pointer = (intptr_t)pointerAddress;
	UNUSED_PARAM(clazz)
	glGetVertexAttribPointervARB(index, pname, pointer);
}

EXTERN_C_EXIT
