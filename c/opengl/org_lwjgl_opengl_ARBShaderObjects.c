/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDeleteObjectARBPROC) (jint);
typedef jint (APIENTRY *glGetHandleARBPROC) (jint);
typedef void (APIENTRY *glDetachObjectARBPROC) (jint, jint);
typedef jint (APIENTRY *glCreateShaderObjectARBPROC) (jint);
typedef void (APIENTRY *glShaderSourceARBPROC) (jint, jint, const intptr_t, const intptr_t);
typedef void (APIENTRY *glCompileShaderARBPROC) (jint);
typedef jint (APIENTRY *glCreateProgramObjectARBPROC) (void);
typedef void (APIENTRY *glAttachObjectARBPROC) (jint, jint);
typedef void (APIENTRY *glLinkProgramARBPROC) (jint);
typedef void (APIENTRY *glUseProgramObjectARBPROC) (jint);
typedef void (APIENTRY *glValidateProgramARBPROC) (jint);
typedef void (APIENTRY *glUniform1fARBPROC) (jint, jfloat);
typedef void (APIENTRY *glUniform2fARBPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glUniform3fARBPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform4fARBPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform1iARBPROC) (jint, jint);
typedef void (APIENTRY *glUniform2iARBPROC) (jint, jint, jint);
typedef void (APIENTRY *glUniform3iARBPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glUniform4iARBPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glUniform1fvARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2fvARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3fvARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4fvARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform1ivARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2ivARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3ivARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4ivARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniformMatrix2fvARBPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix3fvARBPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix4fvARBPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glGetObjectParameterfvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetObjectParameterivARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetInfoLogARBPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetAttachedObjectsARBPROC) (jint, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetUniformLocationARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetActiveUniformARBPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glGetUniformfvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformivARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetShaderSourceARBPROC) (jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglDeleteObjectARB(JNIEnv *__env, jclass clazz, jint obj) {
	glDeleteObjectARBPROC glDeleteObjectARB = (glDeleteObjectARBPROC)tlsGetFunction(300);
	UNUSED_PARAM(clazz)
	glDeleteObjectARB(obj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetHandleARB(JNIEnv *__env, jclass clazz, jint pname) {
	glGetHandleARBPROC glGetHandleARB = (glGetHandleARBPROC)tlsGetFunction(555);
	UNUSED_PARAM(clazz)
	return (jint)glGetHandleARB(pname);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglDetachObjectARB(JNIEnv *__env, jclass clazz, jint containerObj, jint attachedObj) {
	glDetachObjectARBPROC glDetachObjectARB = (glDetachObjectARBPROC)tlsGetFunction(328);
	UNUSED_PARAM(clazz)
	glDetachObjectARB(containerObj, attachedObj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglCreateShaderObjectARB(JNIEnv *__env, jclass clazz, jint shaderType) {
	glCreateShaderObjectARBPROC glCreateShaderObjectARB = (glCreateShaderObjectARBPROC)tlsGetFunction(273);
	UNUSED_PARAM(clazz)
	return (jint)glCreateShaderObjectARB(shaderType);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglShaderSourceARB__IIJJ(JNIEnv *__env, jclass clazz, jint shaderObj, jint count, jlong stringAddress, jlong lengthAddress) {
	glShaderSourceARBPROC glShaderSourceARB = (glShaderSourceARBPROC)tlsGetFunction(1522);
	const intptr_t string = (const intptr_t)stringAddress;
	const intptr_t length = (const intptr_t)lengthAddress;
	UNUSED_PARAM(clazz)
	glShaderSourceARB(shaderObj, count, string, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglCompileShaderARB(JNIEnv *__env, jclass clazz, jint shaderObj) {
	glCompileShaderARBPROC glCompileShaderARB = (glCompileShaderARBPROC)tlsGetFunction(191);
	UNUSED_PARAM(clazz)
	glCompileShaderARB(shaderObj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglCreateProgramObjectARB(JNIEnv *__env, jclass clazz) {
	glCreateProgramObjectARBPROC glCreateProgramObjectARB = (glCreateProgramObjectARBPROC)tlsGetFunction(267);
	UNUSED_PARAM(clazz)
	return (jint)glCreateProgramObjectARB();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglAttachObjectARB(JNIEnv *__env, jclass clazz, jint containerObj, jint obj) {
	glAttachObjectARBPROC glAttachObjectARB = (glAttachObjectARBPROC)tlsGetFunction(11);
	UNUSED_PARAM(clazz)
	glAttachObjectARB(containerObj, obj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglLinkProgramARB(JNIEnv *__env, jclass clazz, jint programObj) {
	glLinkProgramARBPROC glLinkProgramARB = (glLinkProgramARBPROC)tlsGetFunction(901);
	UNUSED_PARAM(clazz)
	glLinkProgramARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUseProgramObjectARB(JNIEnv *__env, jclass clazz, jint programObj) {
	glUseProgramObjectARBPROC glUseProgramObjectARB = (glUseProgramObjectARBPROC)tlsGetFunction(1819);
	UNUSED_PARAM(clazz)
	glUseProgramObjectARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglValidateProgramARB(JNIEnv *__env, jclass clazz, jint programObj) {
	glValidateProgramARBPROC glValidateProgramARB = (glValidateProgramARBPROC)tlsGetFunction(1823);
	UNUSED_PARAM(clazz)
	glValidateProgramARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0) {
	glUniform1fARBPROC glUniform1fARB = (glUniform1fARBPROC)tlsGetFunction(1697);
	UNUSED_PARAM(clazz)
	glUniform1fARB(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1) {
	glUniform2fARBPROC glUniform2fARB = (glUniform2fARBPROC)tlsGetFunction(1719);
	UNUSED_PARAM(clazz)
	glUniform2fARB(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2) {
	glUniform3fARBPROC glUniform3fARB = (glUniform3fARBPROC)tlsGetFunction(1741);
	UNUSED_PARAM(clazz)
	glUniform3fARB(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
	glUniform4fARBPROC glUniform4fARB = (glUniform4fARBPROC)tlsGetFunction(1763);
	UNUSED_PARAM(clazz)
	glUniform4fARB(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1iARB(JNIEnv *__env, jclass clazz, jint location, jint v0) {
	glUniform1iARBPROC glUniform1iARB = (glUniform1iARBPROC)tlsGetFunction(1705);
	UNUSED_PARAM(clazz)
	glUniform1iARB(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1) {
	glUniform2iARBPROC glUniform2iARB = (glUniform2iARBPROC)tlsGetFunction(1727);
	UNUSED_PARAM(clazz)
	glUniform2iARB(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2) {
	glUniform3iARBPROC glUniform3iARB = (glUniform3iARBPROC)tlsGetFunction(1749);
	UNUSED_PARAM(clazz)
	glUniform3iARB(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {
	glUniform4iARBPROC glUniform4iARB = (glUniform4iARBPROC)tlsGetFunction(1771);
	UNUSED_PARAM(clazz)
	glUniform4iARB(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1fvARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1fvARBPROC glUniform1fvARB = (glUniform1fvARBPROC)tlsGetFunction(1699);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2fvARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2fvARBPROC glUniform2fvARB = (glUniform2fvARBPROC)tlsGetFunction(1721);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3fvARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3fvARBPROC glUniform3fvARB = (glUniform3fvARBPROC)tlsGetFunction(1743);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4fvARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4fvARBPROC glUniform4fvARB = (glUniform4fvARBPROC)tlsGetFunction(1765);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1ivARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1ivARBPROC glUniform1ivARB = (glUniform1ivARBPROC)tlsGetFunction(1707);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2ivARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2ivARBPROC glUniform2ivARB = (glUniform2ivARBPROC)tlsGetFunction(1729);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3ivARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3ivARBPROC glUniform3ivARB = (glUniform3ivARBPROC)tlsGetFunction(1751);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4ivARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4ivARBPROC glUniform4ivARB = (glUniform4ivARBPROC)tlsGetFunction(1773);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix2fvARB__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix2fvARBPROC glUniformMatrix2fvARB = (glUniformMatrix2fvARBPROC)tlsGetFunction(1790);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix2fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix3fvARB__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix3fvARBPROC glUniformMatrix3fvARB = (glUniformMatrix3fvARBPROC)tlsGetFunction(1797);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix3fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix4fvARB__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix4fvARBPROC glUniformMatrix4fvARB = (glUniformMatrix4fvARBPROC)tlsGetFunction(1804);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix4fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetObjectParameterfvARB__IIJ(JNIEnv *__env, jclass clazz, jint obj, jint pname, jlong paramsAddress) {
	glGetObjectParameterfvARBPROC glGetObjectParameterfvARB = (glGetObjectParameterfvARBPROC)tlsGetFunction(620);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetObjectParameterfvARB(obj, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetObjectParameterivARB__IIJ(JNIEnv *__env, jclass clazz, jint obj, jint pname, jlong paramsAddress) {
	glGetObjectParameterivARBPROC glGetObjectParameterivARB = (glGetObjectParameterivARBPROC)tlsGetFunction(621);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetObjectParameterivARB(obj, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetInfoLogARB__IIJJ(JNIEnv *__env, jclass clazz, jint obj, jint maxLength, jlong lengthAddress, jlong infoLogAddress) {
	glGetInfoLogARBPROC glGetInfoLogARB = (glGetInfoLogARBPROC)tlsGetFunction(561);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t infoLog = (intptr_t)infoLogAddress;
	UNUSED_PARAM(clazz)
	glGetInfoLogARB(obj, maxLength, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetAttachedObjectsARB__IIJJ(JNIEnv *__env, jclass clazz, jint containerObj, jint maxCount, jlong countAddress, jlong objAddress) {
	glGetAttachedObjectsARBPROC glGetAttachedObjectsARB = (glGetAttachedObjectsARBPROC)tlsGetFunction(502);
	intptr_t count = (intptr_t)countAddress;
	intptr_t obj = (intptr_t)objAddress;
	UNUSED_PARAM(clazz)
	glGetAttachedObjectsARB(containerObj, maxCount, count, obj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformLocationARB(JNIEnv *__env, jclass clazz, jint programObj, jlong nameAddress) {
	glGetUniformLocationARBPROC glGetUniformLocationARB = (glGetUniformLocationARBPROC)tlsGetFunction(748);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetUniformLocationARB(programObj, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetActiveUniformARB__IIIJJJJ(JNIEnv *__env, jclass clazz, jint programObj, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
	glGetActiveUniformARBPROC glGetActiveUniformARB = (glGetActiveUniformARBPROC)tlsGetFunction(496);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t size = (intptr_t)sizeAddress;
	intptr_t type = (intptr_t)typeAddress;
	intptr_t name = (intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveUniformARB(programObj, index, maxLength, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformfvARB__IIJ(JNIEnv *__env, jclass clazz, jint programObj, jint location, jlong paramsAddress) {
	glGetUniformfvARBPROC glGetUniformfvARB = (glGetUniformfvARBPROC)tlsGetFunction(753);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformfvARB(programObj, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformivARB__IIJ(JNIEnv *__env, jclass clazz, jint programObj, jint location, jlong paramsAddress) {
	glGetUniformivARBPROC glGetUniformivARB = (glGetUniformivARBPROC)tlsGetFunction(757);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformivARB(programObj, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetShaderSourceARB__IIJJ(JNIEnv *__env, jclass clazz, jint obj, jint maxLength, jlong lengthAddress, jlong sourceAddress) {
	glGetShaderSourceARBPROC glGetShaderSourceARB = (glGetShaderSourceARBPROC)tlsGetFunction(697);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t source = (intptr_t)sourceAddress;
	UNUSED_PARAM(clazz)
	glGetShaderSourceARB(obj, maxLength, length, source);
}

EXTERN_C_EXIT
