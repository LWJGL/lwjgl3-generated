/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glActiveShaderProgramEXTPROC) (GLuint, GLuint);
typedef void (APIENTRY *glBindProgramPipelineEXTPROC) (GLuint);
typedef GLuint (APIENTRY *glCreateShaderProgramvEXTPROC) (GLenum, GLsizei, const GLchar **);
typedef void (APIENTRY *glDeleteProgramPipelinesEXTPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenProgramPipelinesEXTPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glGetProgramPipelineInfoLogEXTPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetProgramPipelineivEXTPROC) (GLuint, GLenum, GLint *);
typedef GLboolean (APIENTRY *glIsProgramPipelineEXTPROC) (GLuint);
typedef void (APIENTRY *glProgramParameteriEXTPROC) (GLuint, GLenum, GLint);
typedef void (APIENTRY *glProgramUniform1fEXTPROC) (GLuint, GLint, GLfloat);
typedef void (APIENTRY *glProgramUniform1fvEXTPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform1iEXTPROC) (GLuint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform1ivEXTPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform2fEXTPROC) (GLuint, GLint, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform2fvEXTPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform2iEXTPROC) (GLuint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform2ivEXTPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform3fEXTPROC) (GLuint, GLint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform3fvEXTPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform3iEXTPROC) (GLuint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform3ivEXTPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform4fEXTPROC) (GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform4fvEXTPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform4iEXTPROC) (GLuint, GLint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform4ivEXTPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniformMatrix2fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glUseProgramStagesEXTPROC) (GLuint, GLbitfield, GLuint);
typedef void (APIENTRY *glValidateProgramPipelineEXTPROC) (GLuint);
typedef void (APIENTRY *glProgramUniform1uiEXTPROC) (GLuint, GLint, GLuint);
typedef void (APIENTRY *glProgramUniform2uiEXTPROC) (GLuint, GLint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform3uiEXTPROC) (GLuint, GLint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform4uiEXTPROC) (GLuint, GLint, GLuint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform1uivEXTPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform2uivEXTPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform3uivEXTPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform4uivEXTPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglActiveShaderProgramEXT(JNIEnv *__env, jclass clazz, jint pipeline, jint program, jlong __functionAddress) {
	glActiveShaderProgramEXTPROC glActiveShaderProgramEXT = (glActiveShaderProgramEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveShaderProgramEXT(pipeline, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglBindProgramPipelineEXT(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glBindProgramPipelineEXTPROC glBindProgramPipelineEXT = (glBindProgramPipelineEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindProgramPipelineEXT(pipeline);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglCreateShaderProgramvEXT(JNIEnv *__env, jclass clazz, jint type, jint count, jlong stringsAddress, jlong __functionAddress) {
	const GLchar **strings = (const GLchar **)(intptr_t)stringsAddress;
	glCreateShaderProgramvEXTPROC glCreateShaderProgramvEXT = (glCreateShaderProgramvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateShaderProgramvEXT(type, count, strings);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglDeleteProgramPipelinesEXT(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress, jlong __functionAddress) {
	const GLuint *pipelines = (const GLuint *)(intptr_t)pipelinesAddress;
	glDeleteProgramPipelinesEXTPROC glDeleteProgramPipelinesEXT = (glDeleteProgramPipelinesEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteProgramPipelinesEXT(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglGenProgramPipelinesEXT(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress, jlong __functionAddress) {
	GLuint *pipelines = (GLuint *)(intptr_t)pipelinesAddress;
	glGenProgramPipelinesEXTPROC glGenProgramPipelinesEXT = (glGenProgramPipelinesEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenProgramPipelinesEXT(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglGetProgramPipelineInfoLogEXT(JNIEnv *__env, jclass clazz, jint pipeline, jint bufSize, jlong lengthAddress, jlong infoLogAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *infoLog = (GLchar *)(intptr_t)infoLogAddress;
	glGetProgramPipelineInfoLogEXTPROC glGetProgramPipelineInfoLogEXT = (glGetProgramPipelineInfoLogEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramPipelineInfoLogEXT(pipeline, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglGetProgramPipelineivEXT(JNIEnv *__env, jclass clazz, jint pipeline, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramPipelineivEXTPROC glGetProgramPipelineivEXT = (glGetProgramPipelineivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramPipelineivEXT(pipeline, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglIsProgramPipelineEXT(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glIsProgramPipelineEXTPROC glIsProgramPipelineEXT = (glIsProgramPipelineEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsProgramPipelineEXT(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramParameteriEXT(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value, jlong __functionAddress) {
	glProgramParameteriEXTPROC glProgramParameteriEXT = (glProgramParameteriEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramParameteriEXT(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jlong __functionAddress) {
	glProgramUniform1fEXTPROC glProgramUniform1fEXT = (glProgramUniform1fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1fEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform1fvEXTPROC glProgramUniform1fvEXT = (glProgramUniform1fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jlong __functionAddress) {
	glProgramUniform1iEXTPROC glProgramUniform1iEXT = (glProgramUniform1iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1iEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1ivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform1ivEXTPROC glProgramUniform1ivEXT = (glProgramUniform1ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jlong __functionAddress) {
	glProgramUniform2fEXTPROC glProgramUniform2fEXT = (glProgramUniform2fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2fEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform2fvEXTPROC glProgramUniform2fvEXT = (glProgramUniform2fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jlong __functionAddress) {
	glProgramUniform2iEXTPROC glProgramUniform2iEXT = (glProgramUniform2iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2iEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2ivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform2ivEXTPROC glProgramUniform2ivEXT = (glProgramUniform2ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jlong __functionAddress) {
	glProgramUniform3fEXTPROC glProgramUniform3fEXT = (glProgramUniform3fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3fEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform3fvEXTPROC glProgramUniform3fvEXT = (glProgramUniform3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glProgramUniform3iEXTPROC glProgramUniform3iEXT = (glProgramUniform3iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3iEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3ivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform3ivEXTPROC glProgramUniform3ivEXT = (glProgramUniform3ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	glProgramUniform4fEXTPROC glProgramUniform4fEXT = (glProgramUniform4fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4fEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform4fvEXTPROC glProgramUniform4fvEXT = (glProgramUniform4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glProgramUniform4iEXTPROC glProgramUniform4iEXT = (glProgramUniform4iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4iEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4ivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform4ivEXTPROC glProgramUniform4ivEXT = (glProgramUniform4ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix2fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2fvEXTPROC glProgramUniformMatrix2fvEXT = (glProgramUniformMatrix2fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix3fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3fvEXTPROC glProgramUniformMatrix3fvEXT = (glProgramUniformMatrix3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4fvEXTPROC glProgramUniformMatrix4fvEXT = (glProgramUniformMatrix4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglUseProgramStagesEXT(JNIEnv *__env, jclass clazz, jint pipeline, jint stages, jint program, jlong __functionAddress) {
	glUseProgramStagesEXTPROC glUseProgramStagesEXT = (glUseProgramStagesEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUseProgramStagesEXT(pipeline, stages, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglValidateProgramPipelineEXT(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glValidateProgramPipelineEXTPROC glValidateProgramPipelineEXT = (glValidateProgramPipelineEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glValidateProgramPipelineEXT(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jlong __functionAddress) {
	glProgramUniform1uiEXTPROC glProgramUniform1uiEXT = (glProgramUniform1uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1uiEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jlong __functionAddress) {
	glProgramUniform2uiEXTPROC glProgramUniform2uiEXT = (glProgramUniform2uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2uiEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glProgramUniform3uiEXTPROC glProgramUniform3uiEXT = (glProgramUniform3uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3uiEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glProgramUniform4uiEXTPROC glProgramUniform4uiEXT = (glProgramUniform4uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4uiEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1uivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform1uivEXTPROC glProgramUniform1uivEXT = (glProgramUniform1uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2uivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform2uivEXTPROC glProgramUniform2uivEXT = (glProgramUniform2uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3uivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform3uivEXTPROC glProgramUniform3uivEXT = (glProgramUniform3uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4uivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform4uivEXTPROC glProgramUniform4uivEXT = (glProgramUniform4uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix2x3fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x3fvEXTPROC glProgramUniformMatrix2x3fvEXT = (glProgramUniformMatrix2x3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix3x2fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x2fvEXTPROC glProgramUniformMatrix3x2fvEXT = (glProgramUniformMatrix3x2fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix2x4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x4fvEXTPROC glProgramUniformMatrix2x4fvEXT = (glProgramUniformMatrix2x4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix4x2fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x2fvEXTPROC glProgramUniformMatrix4x2fvEXT = (glProgramUniformMatrix4x2fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix3x4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x4fvEXTPROC glProgramUniformMatrix3x4fvEXT = (glProgramUniformMatrix3x4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix4x3fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x3fvEXTPROC glProgramUniformMatrix4x3fvEXT = (glProgramUniformMatrix4x3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x3fvEXT(program, location, count, transpose, value);
}

EXTERN_C_EXIT
