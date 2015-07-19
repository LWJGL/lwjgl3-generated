/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLuint (APIENTRY *glCreateProgramPROC) (void);
typedef void (APIENTRY *glDeleteProgramPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsProgramPROC) (GLuint);
typedef GLuint (APIENTRY *glCreateShaderPROC) (GLenum);
typedef void (APIENTRY *glDeleteShaderPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsShaderPROC) (GLuint);
typedef void (APIENTRY *glAttachShaderPROC) (GLuint, GLuint);
typedef void (APIENTRY *glDetachShaderPROC) (GLuint, GLuint);
typedef void (APIENTRY *glShaderSourcePROC) (GLuint, GLsizei, const GLchar **, const GLint *);
typedef void (APIENTRY *glCompileShaderPROC) (GLuint);
typedef void (APIENTRY *glLinkProgramPROC) (GLuint);
typedef void (APIENTRY *glUseProgramPROC) (GLuint);
typedef void (APIENTRY *glValidateProgramPROC) (GLuint);
typedef void (APIENTRY *glUniform1fPROC) (GLint, GLfloat);
typedef void (APIENTRY *glUniform2fPROC) (GLint, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform3fPROC) (GLint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform4fPROC) (GLint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glUniform1iPROC) (GLint, GLint);
typedef void (APIENTRY *glUniform2iPROC) (GLint, GLint, GLint);
typedef void (APIENTRY *glUniform3iPROC) (GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glUniform4iPROC) (GLint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glUniform1fvPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform2fvPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform3fvPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform4fvPROC) (GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glUniform1ivPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform2ivPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform3ivPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniform4ivPROC) (GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glUniformMatrix2fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix3fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUniformMatrix4fvPROC) (GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glGetShaderivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetProgramivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetShaderInfoLogPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetProgramInfoLogPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetAttachedShadersPROC) (GLuint, GLsizei, GLsizei *, GLuint *);
typedef GLint (APIENTRY *glGetUniformLocationPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glGetActiveUniformPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLint *, GLenum *, GLchar *);
typedef void (APIENTRY *glGetUniformfvPROC) (GLuint, GLint, GLfloat *);
typedef void (APIENTRY *glGetUniformivPROC) (GLuint, GLint, GLint *);
typedef void (APIENTRY *glGetShaderSourcePROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glVertexAttrib1fPROC) (GLuint, GLfloat);
typedef void (APIENTRY *glVertexAttrib1sPROC) (GLuint, GLshort);
typedef void (APIENTRY *glVertexAttrib1dPROC) (GLuint, GLdouble);
typedef void (APIENTRY *glVertexAttrib2fPROC) (GLuint, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib2sPROC) (GLuint, GLshort, GLshort);
typedef void (APIENTRY *glVertexAttrib2dPROC) (GLuint, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttrib3fPROC) (GLuint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib3sPROC) (GLuint, GLshort, GLshort, GLshort);
typedef void (APIENTRY *glVertexAttrib3dPROC) (GLuint, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttrib4fPROC) (GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glVertexAttrib4sPROC) (GLuint, GLshort, GLshort, GLshort, GLshort);
typedef void (APIENTRY *glVertexAttrib4dPROC) (GLuint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttrib4NubPROC) (GLuint, GLubyte, GLubyte, GLubyte, GLubyte);
typedef void (APIENTRY *glVertexAttrib1fvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib1svPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib1dvPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttrib2fvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib2svPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib2dvPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttrib3fvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib3svPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib3dvPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttrib4fvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glVertexAttrib4svPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib4dvPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttrib4ivPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttrib4bvPROC) (GLuint, const GLbyte *);
typedef void (APIENTRY *glVertexAttrib4ubvPROC) (GLuint, const GLubyte *);
typedef void (APIENTRY *glVertexAttrib4usvPROC) (GLuint, const GLushort *);
typedef void (APIENTRY *glVertexAttrib4uivPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glVertexAttrib4NbvPROC) (GLuint, const GLbyte *);
typedef void (APIENTRY *glVertexAttrib4NsvPROC) (GLuint, const GLshort *);
typedef void (APIENTRY *glVertexAttrib4NivPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glVertexAttrib4NubvPROC) (GLuint, const GLubyte *);
typedef void (APIENTRY *glVertexAttrib4NusvPROC) (GLuint, const GLushort *);
typedef void (APIENTRY *glVertexAttrib4NuivPROC) (GLuint, const GLuint *);
typedef void (APIENTRY *glVertexAttribPointerPROC) (GLuint, GLint, GLenum, GLboolean, GLsizei, const void *);
typedef void (APIENTRY *glEnableVertexAttribArrayPROC) (GLuint);
typedef void (APIENTRY *glDisableVertexAttribArrayPROC) (GLuint);
typedef void (APIENTRY *glBindAttribLocationPROC) (GLuint, GLuint, const GLchar *);
typedef void (APIENTRY *glGetActiveAttribPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLint *, GLenum *, GLchar *);
typedef GLint (APIENTRY *glGetAttribLocationPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glGetVertexAttribivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexAttribfvPROC) (GLuint, GLenum, GLfloat *);
typedef void (APIENTRY *glGetVertexAttribdvPROC) (GLuint, GLenum, GLdouble *);
typedef void (APIENTRY *glGetVertexAttribPointervPROC) (GLuint, GLenum, void **);
typedef void (APIENTRY *glDrawBuffersPROC) (GLsizei, const GLenum *);
typedef void (APIENTRY *glBlendEquationSeparatePROC) (GLenum, GLenum);
typedef void (APIENTRY *glStencilOpSeparatePROC) (GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glStencilFuncSeparatePROC) (GLenum, GLenum, GLint, GLuint);
typedef void (APIENTRY *glStencilMaskSeparatePROC) (GLenum, GLuint);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL20_nglCreateProgram(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glCreateProgramPROC glCreateProgram = (glCreateProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateProgram();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglDeleteProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glDeleteProgramPROC glDeleteProgram = (glDeleteProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteProgram(program);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL20_nglIsProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glIsProgramPROC glIsProgram = (glIsProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsProgram(program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL20_nglCreateShader(JNIEnv *__env, jclass clazz, jint type, jlong __functionAddress) {
	glCreateShaderPROC glCreateShader = (glCreateShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateShader(type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglDeleteShader(JNIEnv *__env, jclass clazz, jint shader, jlong __functionAddress) {
	glDeleteShaderPROC glDeleteShader = (glDeleteShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteShader(shader);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL20_nglIsShader(JNIEnv *__env, jclass clazz, jint shader, jlong __functionAddress) {
	glIsShaderPROC glIsShader = (glIsShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglAttachShader(JNIEnv *__env, jclass clazz, jint program, jint shader, jlong __functionAddress) {
	glAttachShaderPROC glAttachShader = (glAttachShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glAttachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglDetachShader(JNIEnv *__env, jclass clazz, jint program, jint shader, jlong __functionAddress) {
	glDetachShaderPROC glDetachShader = (glDetachShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDetachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglShaderSource(JNIEnv *__env, jclass clazz, jint shader, jint count, jlong stringsAddress, jlong lengthAddress, jlong __functionAddress) {
	const GLchar **strings = (const GLchar **)(intptr_t)stringsAddress;
	const GLint *length = (const GLint *)(intptr_t)lengthAddress;
	glShaderSourcePROC glShaderSource = (glShaderSourcePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glShaderSource(shader, count, strings, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglCompileShader(JNIEnv *__env, jclass clazz, jint shader, jlong __functionAddress) {
	glCompileShaderPROC glCompileShader = (glCompileShaderPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompileShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglLinkProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glLinkProgramPROC glLinkProgram = (glLinkProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLinkProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUseProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glUseProgramPROC glUseProgram = (glUseProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUseProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglValidateProgram(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glValidateProgramPROC glValidateProgram = (glValidateProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glValidateProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform1f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jlong __functionAddress) {
	glUniform1fPROC glUniform1f = (glUniform1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1f(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform2f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jlong __functionAddress) {
	glUniform2fPROC glUniform2f = (glUniform2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2f(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform3f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jlong __functionAddress) {
	glUniform3fPROC glUniform3f = (glUniform3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3f(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform4f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	glUniform4fPROC glUniform4f = (glUniform4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4f(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform1i(JNIEnv *__env, jclass clazz, jint location, jint v0, jlong __functionAddress) {
	glUniform1iPROC glUniform1i = (glUniform1iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1i(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform2i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jlong __functionAddress) {
	glUniform2iPROC glUniform2i = (glUniform2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2i(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform3i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glUniform3iPROC glUniform3i = (glUniform3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3i(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform4i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glUniform4iPROC glUniform4i = (glUniform4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4i(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform1fv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform1fvPROC glUniform1fv = (glUniform1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform2fv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform2fvPROC glUniform2fv = (glUniform2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform3fv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform3fvPROC glUniform3fv = (glUniform3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform4fv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniform4fvPROC glUniform4fv = (glUniform4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform1iv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform1ivPROC glUniform1iv = (glUniform1ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform2iv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform2ivPROC glUniform2iv = (glUniform2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform3iv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform3ivPROC glUniform3iv = (glUniform3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform4iv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glUniform4ivPROC glUniform4iv = (glUniform4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniformMatrix2fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix2fvPROC glUniformMatrix2fv = (glUniformMatrix2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniformMatrix3fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix3fvPROC glUniformMatrix3fv = (glUniformMatrix3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniformMatrix4fv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glUniformMatrix4fvPROC glUniformMatrix4fv = (glUniformMatrix4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetShaderiv(JNIEnv *__env, jclass clazz, jint shader, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetShaderivPROC glGetShaderiv = (glGetShaderivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderiv(shader, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetProgramiv(JNIEnv *__env, jclass clazz, jint program, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramivPROC glGetProgramiv = (glGetProgramivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramiv(program, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetShaderInfoLog(JNIEnv *__env, jclass clazz, jint shader, jint maxLength, jlong lengthAddress, jlong infoLogAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *infoLog = (GLchar *)(intptr_t)infoLogAddress;
	glGetShaderInfoLogPROC glGetShaderInfoLog = (glGetShaderInfoLogPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderInfoLog(shader, maxLength, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetProgramInfoLog(JNIEnv *__env, jclass clazz, jint program, jint maxLength, jlong lengthAddress, jlong infoLogAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *infoLog = (GLchar *)(intptr_t)infoLogAddress;
	glGetProgramInfoLogPROC glGetProgramInfoLog = (glGetProgramInfoLogPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramInfoLog(program, maxLength, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetAttachedShaders(JNIEnv *__env, jclass clazz, jint program, jint maxCount, jlong countAddress, jlong shadersAddress, jlong __functionAddress) {
	GLsizei *count = (GLsizei *)(intptr_t)countAddress;
	GLuint *shaders = (GLuint *)(intptr_t)shadersAddress;
	glGetAttachedShadersPROC glGetAttachedShaders = (glGetAttachedShadersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetAttachedShaders(program, maxCount, count, shaders);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL20_nglGetUniformLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetUniformLocationPROC glGetUniformLocation = (glGetUniformLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetUniformLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetActiveUniform(JNIEnv *__env, jclass clazz, jint program, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *size = (GLint *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetActiveUniformPROC glGetActiveUniform = (glGetActiveUniformPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveUniform(program, index, maxLength, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetUniformfv(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetUniformfvPROC glGetUniformfv = (glGetUniformfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformfv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetUniformiv(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetUniformivPROC glGetUniformiv = (glGetUniformivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformiv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetShaderSource(JNIEnv *__env, jclass clazz, jint shader, jint maxLength, jlong lengthAddress, jlong sourceAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *source = (GLchar *)(intptr_t)sourceAddress;
	glGetShaderSourcePROC glGetShaderSource = (glGetShaderSourcePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderSource(shader, maxLength, length, source);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1f(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jlong __functionAddress) {
	glVertexAttrib1fPROC glVertexAttrib1f = (glVertexAttrib1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1f(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1s(JNIEnv *__env, jclass clazz, jint index, jshort v0, jlong __functionAddress) {
	glVertexAttrib1sPROC glVertexAttrib1s = (glVertexAttrib1sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1s(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1d(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jlong __functionAddress) {
	glVertexAttrib1dPROC glVertexAttrib1d = (glVertexAttrib1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1d(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2f(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jlong __functionAddress) {
	glVertexAttrib2fPROC glVertexAttrib2f = (glVertexAttrib2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2f(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2s(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jlong __functionAddress) {
	glVertexAttrib2sPROC glVertexAttrib2s = (glVertexAttrib2sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2s(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2d(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jlong __functionAddress) {
	glVertexAttrib2dPROC glVertexAttrib2d = (glVertexAttrib2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2d(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3f(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jfloat v2, jlong __functionAddress) {
	glVertexAttrib3fPROC glVertexAttrib3f = (glVertexAttrib3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3f(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3s(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jshort v2, jlong __functionAddress) {
	glVertexAttrib3sPROC glVertexAttrib3s = (glVertexAttrib3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3s(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3d(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jdouble v2, jlong __functionAddress) {
	glVertexAttrib3dPROC glVertexAttrib3d = (glVertexAttrib3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3d(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4f(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	glVertexAttrib4fPROC glVertexAttrib4f = (glVertexAttrib4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4f(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4s(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jshort v2, jshort v3, jlong __functionAddress) {
	glVertexAttrib4sPROC glVertexAttrib4s = (glVertexAttrib4sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4s(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4d(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jdouble v2, jdouble v3, jlong __functionAddress) {
	glVertexAttrib4dPROC glVertexAttrib4d = (glVertexAttrib4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4d(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nub(JNIEnv *__env, jclass clazz, jint index, jbyte x, jbyte y, jbyte z, jbyte w, jlong __functionAddress) {
	glVertexAttrib4NubPROC glVertexAttrib4Nub = (glVertexAttrib4NubPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4Nub(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1fv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib1fvPROC glVertexAttrib1fv = (glVertexAttrib1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1sv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib1svPROC glVertexAttrib1sv = (glVertexAttrib1svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1dv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib1dvPROC glVertexAttrib1dv = (glVertexAttrib1dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2fv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib2fvPROC glVertexAttrib2fv = (glVertexAttrib2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2sv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib2svPROC glVertexAttrib2sv = (glVertexAttrib2svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2dv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib2dvPROC glVertexAttrib2dv = (glVertexAttrib2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3fv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib3fvPROC glVertexAttrib3fv = (glVertexAttrib3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3sv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib3svPROC glVertexAttrib3sv = (glVertexAttrib3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3dv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib3dvPROC glVertexAttrib3dv = (glVertexAttrib3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4fv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib4fvPROC glVertexAttrib4fv = (glVertexAttrib4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4sv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib4svPROC glVertexAttrib4sv = (glVertexAttrib4svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4dv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib4dvPROC glVertexAttrib4dv = (glVertexAttrib4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4iv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttrib4ivPROC glVertexAttrib4iv = (glVertexAttrib4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4bv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttrib4bvPROC glVertexAttrib4bv = (glVertexAttrib4bvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4bv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4ubv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glVertexAttrib4ubvPROC glVertexAttrib4ubv = (glVertexAttrib4ubvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4ubv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4usv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glVertexAttrib4usvPROC glVertexAttrib4usv = (glVertexAttrib4usvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4usv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4uiv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttrib4uivPROC glVertexAttrib4uiv = (glVertexAttrib4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nbv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttrib4NbvPROC glVertexAttrib4Nbv = (glVertexAttrib4NbvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4Nbv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nsv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib4NsvPROC glVertexAttrib4Nsv = (glVertexAttrib4NsvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4Nsv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Niv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttrib4NivPROC glVertexAttrib4Niv = (glVertexAttrib4NivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4Niv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nubv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glVertexAttrib4NubvPROC glVertexAttrib4Nubv = (glVertexAttrib4NubvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4Nubv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nusv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glVertexAttrib4NusvPROC glVertexAttrib4Nusv = (glVertexAttrib4NusvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4Nusv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nuiv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttrib4NuivPROC glVertexAttrib4Nuiv = (glVertexAttrib4NuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4Nuiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttribPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glVertexAttribPointerPROC glVertexAttribPointer = (glVertexAttribPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribPointer(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglEnableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glEnableVertexAttribArrayPROC glEnableVertexAttribArray = (glEnableVertexAttribArrayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglDisableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glDisableVertexAttribArrayPROC glDisableVertexAttribArray = (glDisableVertexAttribArrayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglBindAttribLocation(JNIEnv *__env, jclass clazz, jint program, jint index, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glBindAttribLocationPROC glBindAttribLocation = (glBindAttribLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindAttribLocation(program, index, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetActiveAttrib(JNIEnv *__env, jclass clazz, jint program, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *size = (GLint *)(intptr_t)sizeAddress;
	GLenum *type = (GLenum *)(intptr_t)typeAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetActiveAttribPROC glGetActiveAttrib = (glGetActiveAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveAttrib(program, index, maxLength, length, size, type, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL20_nglGetAttribLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetAttribLocationPROC glGetAttribLocation = (glGetAttribLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetAttribLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetVertexAttribiv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetVertexAttribivPROC glGetVertexAttribiv = (glGetVertexAttribivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetVertexAttribfv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetVertexAttribfvPROC glGetVertexAttribfv = (glGetVertexAttribfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribfv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetVertexAttribdv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetVertexAttribdvPROC glGetVertexAttribdv = (glGetVertexAttribdvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribdv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetVertexAttribPointerv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress, jlong __functionAddress) {
	void **pointer = (void **)(intptr_t)pointerAddress;
	glGetVertexAttribPointervPROC glGetVertexAttribPointerv = (glGetVertexAttribPointervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribPointerv(index, pname, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglDrawBuffers(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress, jlong __functionAddress) {
	const GLenum *bufs = (const GLenum *)(intptr_t)bufsAddress;
	glDrawBuffersPROC glDrawBuffers = (glDrawBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawBuffers(n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglBlendEquationSeparate(JNIEnv *__env, jclass clazz, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparatePROC glBlendEquationSeparate = (glBlendEquationSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparate(modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglStencilOpSeparate(JNIEnv *__env, jclass clazz, jint face, jint sfail, jint dpfail, jint dppass, jlong __functionAddress) {
	glStencilOpSeparatePROC glStencilOpSeparate = (glStencilOpSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilOpSeparate(face, sfail, dpfail, dppass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglStencilFuncSeparate(JNIEnv *__env, jclass clazz, jint face, jint func, jint ref, jint mask, jlong __functionAddress) {
	glStencilFuncSeparatePROC glStencilFuncSeparate = (glStencilFuncSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilFuncSeparate(face, func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglStencilMaskSeparate(JNIEnv *__env, jclass clazz, jint face, jint mask, jlong __functionAddress) {
	glStencilMaskSeparatePROC glStencilMaskSeparate = (glStencilMaskSeparatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilMaskSeparate(face, mask);
}

EXTERN_C_EXIT
