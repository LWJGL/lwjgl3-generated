/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDispatchComputePROC) (GLuint, GLuint, GLuint);
typedef void (APIENTRY *glDispatchComputeIndirectPROC) (GLintptr);
typedef void (APIENTRY *glDrawArraysIndirectPROC) (GLenum, const void *);
typedef void (APIENTRY *glDrawElementsIndirectPROC) (GLenum, GLenum, const void *);
typedef void (APIENTRY *glFramebufferParameteriPROC) (GLenum, GLenum, GLint);
typedef void (APIENTRY *glGetFramebufferParameterivPROC) (GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetProgramInterfaceivPROC) (GLuint, GLenum, GLenum, GLint *);
typedef GLuint (APIENTRY *glGetProgramResourceIndexPROC) (GLuint, GLenum, const GLchar *);
typedef void (APIENTRY *glGetProgramResourceNamePROC) (GLuint, GLenum, GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetProgramResourceivPROC) (GLuint, GLenum, GLuint, GLsizei, const GLenum *, GLsizei, GLsizei *, GLint *);
typedef GLint (APIENTRY *glGetProgramResourceLocationPROC) (GLuint, GLenum, const GLchar *);
typedef void (APIENTRY *glUseProgramStagesPROC) (GLuint, GLbitfield, GLuint);
typedef void (APIENTRY *glActiveShaderProgramPROC) (GLuint, GLuint);
typedef GLuint (APIENTRY *glCreateShaderProgramvPROC) (GLenum, GLsizei, const GLchar * const *);
typedef void (APIENTRY *glBindProgramPipelinePROC) (GLuint);
typedef void (APIENTRY *glDeleteProgramPipelinesPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenProgramPipelinesPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsProgramPipelinePROC) (GLuint);
typedef void (APIENTRY *glGetProgramPipelineivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glProgramUniform1iPROC) (GLuint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform2iPROC) (GLuint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform3iPROC) (GLuint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform4iPROC) (GLuint, GLint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform1uiPROC) (GLuint, GLint, GLuint);
typedef void (APIENTRY *glProgramUniform2uiPROC) (GLuint, GLint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform3uiPROC) (GLuint, GLint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform4uiPROC) (GLuint, GLint, GLuint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform1fPROC) (GLuint, GLint, GLfloat);
typedef void (APIENTRY *glProgramUniform2fPROC) (GLuint, GLint, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform3fPROC) (GLuint, GLint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform4fPROC) (GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform1ivPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform2ivPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform3ivPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform4ivPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform1uivPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform2uivPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform3uivPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform4uivPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform1fvPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform2fvPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform3fvPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform4fvPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glValidateProgramPipelinePROC) (GLuint);
typedef void (APIENTRY *glGetProgramPipelineInfoLogPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glBindImageTexturePROC) (GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLenum);
typedef void (APIENTRY *glGetBooleani_vPROC) (GLenum, GLuint, GLboolean *);
typedef void (APIENTRY *glMemoryBarrierPROC) (GLbitfield);
typedef void (APIENTRY *glMemoryBarrierByRegionPROC) (GLbitfield);
typedef void (APIENTRY *glTexStorage2DMultisamplePROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean);
typedef void (APIENTRY *glGetMultisamplefvPROC) (GLenum, GLuint, GLfloat *);
typedef void (APIENTRY *glSampleMaskiPROC) (GLuint, GLbitfield);
typedef void (APIENTRY *glGetTexLevelParameterivPROC) (GLenum, GLint, GLenum, GLint *);
typedef void (APIENTRY *glGetTexLevelParameterfvPROC) (GLenum, GLint, GLenum, GLfloat *);
typedef void (APIENTRY *glBindVertexBufferPROC) (GLuint, GLuint, GLintptr, GLsizei);
typedef void (APIENTRY *glVertexAttribFormatPROC) (GLuint, GLint, GLenum, GLboolean, GLuint);
typedef void (APIENTRY *glVertexAttribIFormatPROC) (GLuint, GLint, GLenum, GLuint);
typedef void (APIENTRY *glVertexAttribBindingPROC) (GLuint, GLuint);
typedef void (APIENTRY *glVertexBindingDivisorPROC) (GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglDispatchCompute(JNIEnv *__env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z, jlong __functionAddress) {
	glDispatchComputePROC glDispatchCompute = (glDispatchComputePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglDispatchComputeIndirect(JNIEnv *__env, jclass clazz, jlong indirect, jlong __functionAddress) {
	glDispatchComputeIndirectPROC glDispatchComputeIndirect = (glDispatchComputeIndirectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDispatchComputeIndirect((GLintptr)indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglDrawArraysIndirect(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glDrawArraysIndirectPROC glDrawArraysIndirect = (glDrawArraysIndirectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysIndirect(mode, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglDrawElementsIndirect(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glDrawElementsIndirectPROC glDrawElementsIndirect = (glDrawElementsIndirectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsIndirect(mode, type, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglFramebufferParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param, jlong __functionAddress) {
	glFramebufferParameteriPROC glFramebufferParameteri = (glFramebufferParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetFramebufferParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetFramebufferParameterivPROC glGetFramebufferParameteriv = (glGetFramebufferParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFramebufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramInterfaceiv(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramInterfaceivPROC glGetProgramInterfaceiv = (glGetProgramInterfaceivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramInterfaceiv(program, programInterface, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramResourceIndex(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetProgramResourceIndexPROC glGetProgramResourceIndex = (glGetProgramResourceIndexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetProgramResourceIndex(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramResourceName(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint bufSize, jlong lengthAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetProgramResourceNamePROC glGetProgramResourceName = (glGetProgramResourceNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramResourceName(program, programInterface, index, bufSize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramResourceiv(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jlong propsAddress, jint bufSize, jlong lengthAddress, jlong paramsAddress, jlong __functionAddress) {
	const GLenum *props = (const GLenum *)(intptr_t)propsAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramResourceivPROC glGetProgramResourceiv = (glGetProgramResourceivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramResourceLocation(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetProgramResourceLocationPROC glGetProgramResourceLocation = (glGetProgramResourceLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetProgramResourceLocation(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglUseProgramStages(JNIEnv *__env, jclass clazz, jint pipeline, jint stages, jint program, jlong __functionAddress) {
	glUseProgramStagesPROC glUseProgramStages = (glUseProgramStagesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUseProgramStages(pipeline, stages, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglActiveShaderProgram(JNIEnv *__env, jclass clazz, jint pipeline, jint program, jlong __functionAddress) {
	glActiveShaderProgramPROC glActiveShaderProgram = (glActiveShaderProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveShaderProgram(pipeline, program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES31_nglCreateShaderProgramv(JNIEnv *__env, jclass clazz, jint type, jint count, jlong stringsAddress, jlong __functionAddress) {
	const GLchar * const *strings = (const GLchar * const *)(intptr_t)stringsAddress;
	glCreateShaderProgramvPROC glCreateShaderProgramv = (glCreateShaderProgramvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateShaderProgramv(type, count, strings);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglBindProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glBindProgramPipelinePROC glBindProgramPipeline = (glBindProgramPipelinePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglDeleteProgramPipelines(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress, jlong __functionAddress) {
	const GLuint *pipelines = (const GLuint *)(intptr_t)pipelinesAddress;
	glDeleteProgramPipelinesPROC glDeleteProgramPipelines = (glDeleteProgramPipelinesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteProgramPipelines(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGenProgramPipelines(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress, jlong __functionAddress) {
	GLuint *pipelines = (GLuint *)(intptr_t)pipelinesAddress;
	glGenProgramPipelinesPROC glGenProgramPipelines = (glGenProgramPipelinesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenProgramPipelines(n, pipelines);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES31_nglIsProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glIsProgramPipelinePROC glIsProgramPipeline = (glIsProgramPipelinePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramPipelineiv(JNIEnv *__env, jclass clazz, jint pipeline, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramPipelineivPROC glGetProgramPipelineiv = (glGetProgramPipelineivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramPipelineiv(pipeline, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1i(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jlong __functionAddress) {
	glProgramUniform1iPROC glProgramUniform1i = (glProgramUniform1iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1i(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2i(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jlong __functionAddress) {
	glProgramUniform2iPROC glProgramUniform2i = (glProgramUniform2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2i(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3i(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glProgramUniform3iPROC glProgramUniform3i = (glProgramUniform3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3i(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4i(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glProgramUniform4iPROC glProgramUniform4i = (glProgramUniform4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4i(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jlong __functionAddress) {
	glProgramUniform1uiPROC glProgramUniform1ui = (glProgramUniform1uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1ui(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jlong __functionAddress) {
	glProgramUniform2uiPROC glProgramUniform2ui = (glProgramUniform2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2ui(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glProgramUniform3uiPROC glProgramUniform3ui = (glProgramUniform3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3ui(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glProgramUniform4uiPROC glProgramUniform4ui = (glProgramUniform4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4ui(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jlong __functionAddress) {
	glProgramUniform1fPROC glProgramUniform1f = (glProgramUniform1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1f(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jlong __functionAddress) {
	glProgramUniform2fPROC glProgramUniform2f = (glProgramUniform2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2f(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jlong __functionAddress) {
	glProgramUniform3fPROC glProgramUniform3f = (glProgramUniform3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3f(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	glProgramUniform4fPROC glProgramUniform4f = (glProgramUniform4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4f(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1iv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform1ivPROC glProgramUniform1iv = (glProgramUniform1ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2iv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform2ivPROC glProgramUniform2iv = (glProgramUniform2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3iv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform3ivPROC glProgramUniform3iv = (glProgramUniform3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4iv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform4ivPROC glProgramUniform4iv = (glProgramUniform4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1uiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform1uivPROC glProgramUniform1uiv = (glProgramUniform1uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2uiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform2uivPROC glProgramUniform2uiv = (glProgramUniform2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3uiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform3uivPROC glProgramUniform3uiv = (glProgramUniform3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4uiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform4uivPROC glProgramUniform4uiv = (glProgramUniform4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform1fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform1fvPROC glProgramUniform1fv = (glProgramUniform1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform2fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform2fvPROC glProgramUniform2fv = (glProgramUniform2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform3fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform3fvPROC glProgramUniform3fv = (glProgramUniform3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniform4fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform4fvPROC glProgramUniform4fv = (glProgramUniform4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix2fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2fvPROC glProgramUniformMatrix2fv = (glProgramUniformMatrix2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix3fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3fvPROC glProgramUniformMatrix3fv = (glProgramUniformMatrix3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix4fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4fvPROC glProgramUniformMatrix4fv = (glProgramUniformMatrix4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix2x3fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x3fvPROC glProgramUniformMatrix2x3fv = (glProgramUniformMatrix2x3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix3x2fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x2fvPROC glProgramUniformMatrix3x2fv = (glProgramUniformMatrix3x2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix2x4fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x4fvPROC glProgramUniformMatrix2x4fv = (glProgramUniformMatrix2x4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix4x2fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x2fvPROC glProgramUniformMatrix4x2fv = (glProgramUniformMatrix4x2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix3x4fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x4fvPROC glProgramUniformMatrix3x4fv = (glProgramUniformMatrix3x4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglProgramUniformMatrix4x3fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x3fvPROC glProgramUniformMatrix4x3fv = (glProgramUniformMatrix4x3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglValidateProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glValidateProgramPipelinePROC glValidateProgramPipeline = (glValidateProgramPipelinePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glValidateProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetProgramPipelineInfoLog(JNIEnv *__env, jclass clazz, jint pipeline, jint bufSize, jlong lengthAddress, jlong infoLogAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *infoLog = (GLchar *)(intptr_t)infoLogAddress;
	glGetProgramPipelineInfoLogPROC glGetProgramPipelineInfoLog = (glGetProgramPipelineInfoLogPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglBindImageTexture(JNIEnv *__env, jclass clazz, jint unit, jint texture, jint level, jboolean layered, jint layer, jint access, jint format, jlong __functionAddress) {
	glBindImageTexturePROC glBindImageTexture = (glBindImageTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindImageTexture(unit, texture, level, layered, layer, access, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetBooleani_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLboolean *data = (GLboolean *)(intptr_t)dataAddress;
	glGetBooleani_vPROC glGetBooleani_v = (glGetBooleani_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBooleani_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglMemoryBarrier(JNIEnv *__env, jclass clazz, jint barriers, jlong __functionAddress) {
	glMemoryBarrierPROC glMemoryBarrier = (glMemoryBarrierPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMemoryBarrier(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglMemoryBarrierByRegion(JNIEnv *__env, jclass clazz, jint barriers, jlong __functionAddress) {
	glMemoryBarrierByRegionPROC glMemoryBarrierByRegion = (glMemoryBarrierByRegionPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMemoryBarrierByRegion(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglTexStorage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTexStorage2DMultisamplePROC glTexStorage2DMultisample = (glTexStorage2DMultisamplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetMultisamplefv(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress, jlong __functionAddress) {
	GLfloat *val = (GLfloat *)(intptr_t)valAddress;
	glGetMultisamplefvPROC glGetMultisamplefv = (glGetMultisamplefvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultisamplefv(pname, index, val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglSampleMaski(JNIEnv *__env, jclass clazz, jint maskNumber, jint mask, jlong __functionAddress) {
	glSampleMaskiPROC glSampleMaski = (glSampleMaskiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSampleMaski(maskNumber, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetTexLevelParameteriv(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexLevelParameterivPROC glGetTexLevelParameteriv = (glGetTexLevelParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexLevelParameteriv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglGetTexLevelParameterfv(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetTexLevelParameterfvPROC glGetTexLevelParameterfv = (glGetTexLevelParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexLevelParameterfv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglBindVertexBuffer(JNIEnv *__env, jclass clazz, jint bindingindex, jint buffer, jlong offset, jint stride, jlong __functionAddress) {
	glBindVertexBufferPROC glBindVertexBuffer = (glBindVertexBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindVertexBuffer(bindingindex, buffer, (GLintptr)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglVertexAttribFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset, jlong __functionAddress) {
	glVertexAttribFormatPROC glVertexAttribFormat = (glVertexAttribFormatPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglVertexAttribIFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset, jlong __functionAddress) {
	glVertexAttribIFormatPROC glVertexAttribIFormat = (glVertexAttribIFormatPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribIFormat(attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglVertexAttribBinding(JNIEnv *__env, jclass clazz, jint attribindex, jint bindingindex, jlong __functionAddress) {
	glVertexAttribBindingPROC glVertexAttribBinding = (glVertexAttribBindingPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribBinding(attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES31_nglVertexBindingDivisor(JNIEnv *__env, jclass clazz, jint bindingindex, jint divisor, jlong __functionAddress) {
	glVertexBindingDivisorPROC glVertexBindingDivisor = (glVertexBindingDivisorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexBindingDivisor(bindingindex, divisor);
}

EXTERN_C_EXIT
