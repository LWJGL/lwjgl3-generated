/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glDeleteObjectARBPROC) (GLhandleARB);
typedef GLhandleARB (APIENTRY *glGetHandleARBPROC) (GLenum);
typedef void (APIENTRY *glDetachObjectARBPROC) (GLhandleARB, GLhandleARB);
typedef GLhandleARB (APIENTRY *glCreateShaderObjectARBPROC) (GLenum);
typedef void (APIENTRY *glShaderSourceARBPROC) (GLhandleARB, GLsizei, const GLcharARB **, const GLint *);
typedef void (APIENTRY *glCompileShaderARBPROC) (GLhandleARB);
typedef GLhandleARB (APIENTRY *glCreateProgramObjectARBPROC) (void);
typedef void (APIENTRY *glAttachObjectARBPROC) (GLhandleARB, GLhandleARB);
typedef void (APIENTRY *glLinkProgramARBPROC) (GLhandleARB);
typedef void (APIENTRY *glUseProgramObjectARBPROC) (GLhandleARB);
typedef void (APIENTRY *glValidateProgramARBPROC) (GLhandleARB);
typedef void (APIENTRY *glUniform1fARBPROC) (GLint, GLfloat);
typedef void (APIENTRY *glUniform2fARBPROC) (GLint, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform3fARBPROC) (GLint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform4fARBPROC) (GLint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform1iARBPROC) (GLint, GLint);
typedef void (APIENTRY *glUniform2iARBPROC) (GLint, GLint, GLint);
typedef void (APIENTRY *glUniform3iARBPROC) (GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glUniform4iARBPROC) (GLint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glUniform1fvARBPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform2fvARBPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform3fvARBPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform4fvARBPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform1ivARBPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform2ivARBPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform3ivARBPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform4ivARBPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniformMatrix2fvARBPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix3fvARBPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix4fvARBPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glGetObjectParameterfvARBPROC) (GLhandleARB, GLenum, GLfloat *);
typedef void (APIENTRY *glGetObjectParameterivARBPROC) (GLhandleARB, GLenum, GLint *);
typedef void (APIENTRY *glGetInfoLogARBPROC) (GLhandleARB, GLsizei, GLsizei *, GLcharARB *);
typedef void (APIENTRY *glGetAttachedObjectsARBPROC) (GLhandleARB, GLsizei, GLsizei *, GLhandleARB *);
typedef GLint (APIENTRY *glGetUniformLocationARBPROC) (GLhandleARB, const GLcharARB *);
typedef void (APIENTRY *glGetActiveUniformARBPROC) (GLhandleARB, GLuint, GLsizei, GLsizei *, GLint *, GLenum *, GLcharARB *);
typedef void (APIENTRY *glGetUniformfvARBPROC) (GLhandleARB, GLint, GLfloat *);
typedef void (APIENTRY *glGetUniformivARBPROC) (GLhandleARB, GLint, GLint *);
typedef void (APIENTRY *glGetShaderSourceARBPROC) (GLhandleARB, GLsizei, GLsizei *, GLcharARB *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglDeleteObjectARB(JNIEnv *__env, jclass clazz, jint obj, jlong __functionAddress) {
	glDeleteObjectARBPROC glDeleteObjectARB = (glDeleteObjectARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteObjectARB(obj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetHandleARB(JNIEnv *__env, jclass clazz, jint pname, jlong __functionAddress) {
	glGetHandleARBPROC glGetHandleARB = (glGetHandleARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetHandleARB(pname);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglDetachObjectARB(JNIEnv *__env, jclass clazz, jint containerObj, jint attachedObj, jlong __functionAddress) {
	glDetachObjectARBPROC glDetachObjectARB = (glDetachObjectARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDetachObjectARB(containerObj, attachedObj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglCreateShaderObjectARB(JNIEnv *__env, jclass clazz, jint shaderType, jlong __functionAddress) {
	glCreateShaderObjectARBPROC glCreateShaderObjectARB = (glCreateShaderObjectARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateShaderObjectARB(shaderType);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglShaderSourceARB(JNIEnv *__env, jclass clazz, jint shaderObj, jint count, jlong stringAddress, jlong lengthAddress, jlong __functionAddress) {
	const GLcharARB **string = (const GLcharARB **)(intptr_t)stringAddress;
	const GLint *length = (const GLint *)(intptr_t)lengthAddress;
	glShaderSourceARBPROC glShaderSourceARB = (glShaderSourceARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glShaderSourceARB(shaderObj, count, string, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglCompileShaderARB(JNIEnv *__env, jclass clazz, jint shaderObj, jlong __functionAddress) {
	glCompileShaderARBPROC glCompileShaderARB = (glCompileShaderARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompileShaderARB(shaderObj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglCreateProgramObjectARB(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glCreateProgramObjectARBPROC glCreateProgramObjectARB = (glCreateProgramObjectARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateProgramObjectARB();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglAttachObjectARB(JNIEnv *__env, jclass clazz, jint containerObj, jint obj, jlong __functionAddress) {
	glAttachObjectARBPROC glAttachObjectARB = (glAttachObjectARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glAttachObjectARB(containerObj, obj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglLinkProgramARB(JNIEnv *__env, jclass clazz, jint programObj, jlong __functionAddress) {
	glLinkProgramARBPROC glLinkProgramARB = (glLinkProgramARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLinkProgramARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUseProgramObjectARB(JNIEnv *__env, jclass clazz, jint programObj, jlong __functionAddress) {
	glUseProgramObjectARBPROC glUseProgramObjectARB = (glUseProgramObjectARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUseProgramObjectARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglValidateProgramARB(JNIEnv *__env, jclass clazz, jint programObj, jlong __functionAddress) {
	glValidateProgramARBPROC glValidateProgramARB = (glValidateProgramARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glValidateProgramARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jlong __functionAddress) {
	glUniform1fARBPROC glUniform1fARB = (glUniform1fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1fARB(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jlong __functionAddress) {
	glUniform2fARBPROC glUniform2fARB = (glUniform2fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2fARB(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jlong __functionAddress) {
	glUniform3fARBPROC glUniform3fARB = (glUniform3fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3fARB(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	glUniform4fARBPROC glUniform4fARB = (glUniform4fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4fARB(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jlong __functionAddress) {
	glUniform1iARBPROC glUniform1iARB = (glUniform1iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1iARB(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jlong __functionAddress) {
	glUniform2iARBPROC glUniform2iARB = (glUniform2iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2iARB(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glUniform3iARBPROC glUniform3iARB = (glUniform3iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3iARB(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glUniform4iARBPROC glUniform4iARB = (glUniform4iARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4iARB(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1fvARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform1fvARBPROC glUniform1fvARB = (glUniform1fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2fvARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform2fvARBPROC glUniform2fvARB = (glUniform2fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3fvARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform3fvARBPROC glUniform3fvARB = (glUniform3fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4fvARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform4fvARBPROC glUniform4fvARB = (glUniform4fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1ivARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform1ivARBPROC glUniform1ivARB = (glUniform1ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2ivARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform2ivARBPROC glUniform2ivARB = (glUniform2ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3ivARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform3ivARBPROC glUniform3ivARB = (glUniform3ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4ivARB(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform4ivARBPROC glUniform4ivARB = (glUniform4ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix2fvARB(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2fvARBPROC glUniformMatrix2fvARB = (glUniformMatrix2fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix3fvARB(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3fvARBPROC glUniformMatrix3fvARB = (glUniformMatrix3fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix4fvARB(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4fvARBPROC glUniformMatrix4fvARB = (glUniformMatrix4fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetObjectParameterfvARB(JNIEnv *__env, jclass clazz, jint obj, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetObjectParameterfvARBPROC glGetObjectParameterfvARB = (glGetObjectParameterfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetObjectParameterfvARB(obj, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetObjectParameterivARB(JNIEnv *__env, jclass clazz, jint obj, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetObjectParameterivARBPROC glGetObjectParameterivARB = (glGetObjectParameterivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetObjectParameterivARB(obj, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetInfoLogARB(JNIEnv *__env, jclass clazz, jint obj, jint maxLength, jlong lengthAddress, jlong infoLogAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLcharARB *infoLog = (GLcharARB *)(intptr_t)infoLogAddress;
	glGetInfoLogARBPROC glGetInfoLogARB = (glGetInfoLogARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetInfoLogARB(obj, maxLength, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetAttachedObjectsARB(JNIEnv *__env, jclass clazz, jint containerObj, jint maxCount, jlong countAddress, jlong objAddress, jlong __functionAddress) {
	GLsizei *count = (GLsizei *)(intptr_t)countAddress;
	GLhandleARB *obj = (GLhandleARB *)(intptr_t)objAddress;
	glGetAttachedObjectsARBPROC glGetAttachedObjectsARB = (glGetAttachedObjectsARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetAttachedObjectsARB(containerObj, maxCount, count, obj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformLocationARB(JNIEnv *__env, jclass clazz, jint programObj, jlong nameAddress, jlong __functionAddress) {
	const GLcharARB *name = (const GLcharARB *)(intptr_t)nameAddress;
	glGetUniformLocationARBPROC glGetUniformLocationARB = (glGetUniformLocationARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetUniformLocationARB(programObj, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetActiveUniformARB(JNIEnv *__env, jclass clazz, jint programObj, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *size = (GLint *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLcharARB *name = (GLcharARB *)(intptr_t)nameAddress;
	glGetActiveUniformARBPROC glGetActiveUniformARB = (glGetActiveUniformARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniformARB(programObj, index, maxLength, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformfvARB(JNIEnv *__env, jclass clazz, jint programObj, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetUniformfvARBPROC glGetUniformfvARB = (glGetUniformfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformfvARB(programObj, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformivARB(JNIEnv *__env, jclass clazz, jint programObj, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetUniformivARBPROC glGetUniformivARB = (glGetUniformivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformivARB(programObj, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetShaderSourceARB(JNIEnv *__env, jclass clazz, jint obj, jint maxLength, jlong lengthAddress, jlong sourceAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLcharARB *source = (GLcharARB *)(intptr_t)sourceAddress;
	glGetShaderSourceARBPROC glGetShaderSourceARB = (glGetShaderSourceARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderSourceARB(obj, maxLength, length, source);
}

EXTERN_C_EXIT
