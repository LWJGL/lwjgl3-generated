/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindVertexBufferPROC) (jint, jint, intptr_t, jint);
typedef void (APIENTRY *glVertexAttribFormatPROC) (jint, jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexAttribIFormatPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribLFormatPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribBindingPROC) (jint, jint);
typedef void (APIENTRY *glVertexBindingDivisorPROC) (jint, jint);
typedef void (APIENTRY *glVertexArrayBindVertexBufferEXTPROC) (jint, jint, jint, intptr_t, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribFormatEXTPROC) (jint, jint, jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribIFormatEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribLFormatEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribBindingEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexArrayVertexBindingDivisorEXTPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglBindVertexBuffer(JNIEnv *__env, jclass clazz, jint bindingindex, jint buffer, jlong offset, jint stride) {
	glBindVertexBufferPROC glBindVertexBuffer = (glBindVertexBufferPROC)tlsGetFunction(60);
	UNUSED_PARAM(clazz)
	glBindVertexBuffer(bindingindex, buffer, (intptr_t)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexAttribFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {
	glVertexAttribFormatPROC glVertexAttribFormat = (glVertexAttribFormatPROC)tlsGetFunction(1966);
	UNUSED_PARAM(clazz)
	glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexAttribIFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset) {
	glVertexAttribIFormatPROC glVertexAttribIFormat = (glVertexAttribIFormatPROC)tlsGetFunction(2008);
	UNUSED_PARAM(clazz)
	glVertexAttribIFormat(attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexAttribLFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset) {
	glVertexAttribLFormatPROC glVertexAttribLFormat = (glVertexAttribLFormatPROC)tlsGetFunction(2046);
	UNUSED_PARAM(clazz)
	glVertexAttribLFormat(attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexAttribBinding(JNIEnv *__env, jclass clazz, jint attribindex, jint bindingindex) {
	glVertexAttribBindingPROC glVertexAttribBinding = (glVertexAttribBindingPROC)tlsGetFunction(1963);
	UNUSED_PARAM(clazz)
	glVertexAttribBinding(attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexBindingDivisor(JNIEnv *__env, jclass clazz, jint bindingindex, jint divisor) {
	glVertexBindingDivisorPROC glVertexBindingDivisor = (glVertexBindingDivisorPROC)tlsGetFunction(2065);
	UNUSED_PARAM(clazz)
	glVertexBindingDivisor(bindingindex, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayBindVertexBufferEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint buffer, jlong offset, jint stride) {
	glVertexArrayBindVertexBufferEXTPROC glVertexArrayBindVertexBufferEXT = (glVertexArrayBindVertexBufferEXTPROC)tlsGetFunction(1859);
	UNUSED_PARAM(clazz)
	glVertexArrayBindVertexBufferEXT(vaobj, bindingindex, buffer, (intptr_t)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexAttribFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {
	glVertexArrayVertexAttribFormatEXTPROC glVertexArrayVertexAttribFormatEXT = (glVertexArrayVertexAttribFormatEXTPROC)tlsGetFunction(1873);
	UNUSED_PARAM(clazz)
	glVertexArrayVertexAttribFormatEXT(vaobj, attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexAttribIFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset) {
	glVertexArrayVertexAttribIFormatEXTPROC glVertexArrayVertexAttribIFormatEXT = (glVertexArrayVertexAttribIFormatEXTPROC)tlsGetFunction(1874);
	UNUSED_PARAM(clazz)
	glVertexArrayVertexAttribIFormatEXT(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexAttribLFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset) {
	glVertexArrayVertexAttribLFormatEXTPROC glVertexArrayVertexAttribLFormatEXT = (glVertexArrayVertexAttribLFormatEXTPROC)tlsGetFunction(1876);
	UNUSED_PARAM(clazz)
	glVertexArrayVertexAttribLFormatEXT(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexAttribBindingEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint bindingindex) {
	glVertexArrayVertexAttribBindingEXTPROC glVertexArrayVertexAttribBindingEXT = (glVertexArrayVertexAttribBindingEXTPROC)tlsGetFunction(1871);
	UNUSED_PARAM(clazz)
	glVertexArrayVertexAttribBindingEXT(vaobj, attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_nglVertexArrayVertexBindingDivisorEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint divisor) {
	glVertexArrayVertexBindingDivisorEXTPROC glVertexArrayVertexBindingDivisorEXT = (glVertexArrayVertexBindingDivisorEXTPROC)tlsGetFunction(1879);
	UNUSED_PARAM(clazz)
	glVertexArrayVertexBindingDivisorEXT(vaobj, bindingindex, divisor);
}

EXTERN_C_EXIT
