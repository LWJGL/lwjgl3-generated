/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glReleaseShaderCompilerPROC) (void);
typedef void (APIENTRY *glShaderBinaryPROC) (GLsizei, const GLuint *, GLenum, const void *, GLsizei);
typedef void (APIENTRY *glGetShaderPrecisionFormatPROC) (GLenum, GLenum, GLint *, GLint *);
typedef void (APIENTRY *glDepthRangefPROC) (GLfloat, GLfloat);
typedef void (APIENTRY *glClearDepthfPROC) (GLfloat);
typedef void (APIENTRY *glGetProgramBinaryPROC) (GLuint, GLsizei, GLsizei *, GLenum *, void *);
typedef void (APIENTRY *glProgramBinaryPROC) (GLuint, GLenum, const void *, GLsizei);
typedef void (APIENTRY *glProgramParameteriPROC) (GLuint, GLenum, GLint);
typedef void (APIENTRY *glUseProgramStagesPROC) (GLuint, GLbitfield, GLuint);
typedef void (APIENTRY *glActiveShaderProgramPROC) (GLuint, GLuint);
typedef GLuint (APIENTRY *glCreateShaderProgramvPROC) (GLenum, GLsizei, const GLchar **);
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
typedef void (APIENTRY *glProgramUniform1dPROC) (GLuint, GLint, GLdouble);
typedef void (APIENTRY *glProgramUniform2dPROC) (GLuint, GLint, GLdouble, GLdouble);
typedef void (APIENTRY *glProgramUniform3dPROC) (GLuint, GLint, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glProgramUniform4dPROC) (GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble);
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
typedef void (APIENTRY *glProgramUniform1dvPROC) (GLuint, GLint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glProgramUniform2dvPROC) (GLuint, GLint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glProgramUniform3dvPROC) (GLuint, GLint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glProgramUniform4dvPROC) (GLuint, GLint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix2fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix3dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix4dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2x3dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix3x2dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix2x4dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix4x2dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix3x4dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glProgramUniformMatrix4x3dvPROC) (GLuint, GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glValidateProgramPipelinePROC) (GLuint);
typedef void (APIENTRY *glGetProgramPipelineInfoLogPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glVertexAttribL1dPROC) (GLuint, GLdouble);
typedef void (APIENTRY *glVertexAttribL2dPROC) (GLuint, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttribL3dPROC) (GLuint, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttribL4dPROC) (GLuint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glVertexAttribL1dvPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttribL2dvPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttribL3dvPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttribL4dvPROC) (GLuint, const GLdouble *);
typedef void (APIENTRY *glVertexAttribLPointerPROC) (GLuint, GLint, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glGetVertexAttribLdvPROC) (GLuint, GLenum, GLdouble *);
typedef void (APIENTRY *glViewportArrayvPROC) (GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glViewportIndexedfPROC) (GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glViewportIndexedfvPROC) (GLuint, const GLfloat *);
typedef void (APIENTRY *glScissorArrayvPROC) (GLuint, GLsizei, const GLint *);
typedef void (APIENTRY *glScissorIndexedPROC) (GLuint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glScissorIndexedvPROC) (GLuint, const GLint *);
typedef void (APIENTRY *glDepthRangeArrayvPROC) (GLuint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glDepthRangeIndexedPROC) (GLuint, GLdouble, GLdouble);
typedef void (APIENTRY *glGetFloati_vPROC) (GLenum, GLuint, GLfloat *);
typedef void (APIENTRY *glGetDoublei_vPROC) (GLenum, GLuint, GLdouble *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglReleaseShaderCompiler(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glReleaseShaderCompilerPROC glReleaseShaderCompiler = (glReleaseShaderCompilerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReleaseShaderCompiler();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglShaderBinary(JNIEnv *__env, jclass clazz, jint count, jlong shadersAddress, jint binaryformat, jlong binaryAddress, jint length, jlong __functionAddress) {
	const GLuint *shaders = (const GLuint *)(intptr_t)shadersAddress;
	const void *binary = (const void *)(intptr_t)binaryAddress;
	glShaderBinaryPROC glShaderBinary = (glShaderBinaryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glShaderBinary(count, shaders, binaryformat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglGetShaderPrecisionFormat(JNIEnv *__env, jclass clazz, jint shadertype, jint precisiontype, jlong rangeAddress, jlong precisionAddress, jlong __functionAddress) {
	GLint *range = (GLint *)(intptr_t)rangeAddress;
	GLint *precision = (GLint *)(intptr_t)precisionAddress;
	glGetShaderPrecisionFormatPROC glGetShaderPrecisionFormat = (glGetShaderPrecisionFormatPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglDepthRangef(JNIEnv *__env, jclass clazz, jfloat zNear, jfloat zFar, jlong __functionAddress) {
	glDepthRangefPROC glDepthRangef = (glDepthRangefPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthRangef(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglClearDepthf(JNIEnv *__env, jclass clazz, jfloat depth, jlong __functionAddress) {
	glClearDepthfPROC glClearDepthf = (glClearDepthfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearDepthf(depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglGetProgramBinary(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong binaryFormatAddress, jlong binaryAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLenum *binaryFormat = (GLenum *)(intptr_t)binaryFormatAddress;
	void *binary = (void *)(intptr_t)binaryAddress;
	glGetProgramBinaryPROC glGetProgramBinary = (glGetProgramBinaryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramBinary(program, bufSize, length, binaryFormat, binary);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramBinary(JNIEnv *__env, jclass clazz, jint program, jint binaryFormat, jlong binaryAddress, jint length, jlong __functionAddress) {
	const void *binary = (const void *)(intptr_t)binaryAddress;
	glProgramBinaryPROC glProgramBinary = (glProgramBinaryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramBinary(program, binaryFormat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramParameteri(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value, jlong __functionAddress) {
	glProgramParameteriPROC glProgramParameteri = (glProgramParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramParameteri(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglUseProgramStages(JNIEnv *__env, jclass clazz, jint pipeline, jint stages, jint program, jlong __functionAddress) {
	glUseProgramStagesPROC glUseProgramStages = (glUseProgramStagesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUseProgramStages(pipeline, stages, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglActiveShaderProgram(JNIEnv *__env, jclass clazz, jint pipeline, jint program, jlong __functionAddress) {
	glActiveShaderProgramPROC glActiveShaderProgram = (glActiveShaderProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glActiveShaderProgram(pipeline, program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL41_nglCreateShaderProgramv(JNIEnv *__env, jclass clazz, jint type, jint count, jlong stringsAddress, jlong __functionAddress) {
	const GLchar **strings = (const GLchar **)(intptr_t)stringsAddress;
	glCreateShaderProgramvPROC glCreateShaderProgramv = (glCreateShaderProgramvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCreateShaderProgramv(type, count, strings);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglBindProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glBindProgramPipelinePROC glBindProgramPipeline = (glBindProgramPipelinePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglDeleteProgramPipelines(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress, jlong __functionAddress) {
	const GLuint *pipelines = (const GLuint *)(intptr_t)pipelinesAddress;
	glDeleteProgramPipelinesPROC glDeleteProgramPipelines = (glDeleteProgramPipelinesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteProgramPipelines(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglGenProgramPipelines(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress, jlong __functionAddress) {
	GLuint *pipelines = (GLuint *)(intptr_t)pipelinesAddress;
	glGenProgramPipelinesPROC glGenProgramPipelines = (glGenProgramPipelinesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenProgramPipelines(n, pipelines);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL41_nglIsProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glIsProgramPipelinePROC glIsProgramPipeline = (glIsProgramPipelinePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglGetProgramPipelineiv(JNIEnv *__env, jclass clazz, jint pipeline, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramPipelineivPROC glGetProgramPipelineiv = (glGetProgramPipelineivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramPipelineiv(pipeline, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform1i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jlong __functionAddress) {
	glProgramUniform1iPROC glProgramUniform1i = (glProgramUniform1iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1i(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform2i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jlong __functionAddress) {
	glProgramUniform2iPROC glProgramUniform2i = (glProgramUniform2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2i(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform3i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z, jlong __functionAddress) {
	glProgramUniform3iPROC glProgramUniform3i = (glProgramUniform3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3i(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform4i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glProgramUniform4iPROC glProgramUniform4i = (glProgramUniform4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4i(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform1ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jlong __functionAddress) {
	glProgramUniform1uiPROC glProgramUniform1ui = (glProgramUniform1uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1ui(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform2ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jlong __functionAddress) {
	glProgramUniform2uiPROC glProgramUniform2ui = (glProgramUniform2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2ui(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform3ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z, jlong __functionAddress) {
	glProgramUniform3uiPROC glProgramUniform3ui = (glProgramUniform3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3ui(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform4ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glProgramUniform4uiPROC glProgramUniform4ui = (glProgramUniform4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4ui(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform1f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jlong __functionAddress) {
	glProgramUniform1fPROC glProgramUniform1f = (glProgramUniform1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1f(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform2f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y, jlong __functionAddress) {
	glProgramUniform2fPROC glProgramUniform2f = (glProgramUniform2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2f(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform3f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glProgramUniform3fPROC glProgramUniform3f = (glProgramUniform3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3f(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform4f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y, jfloat z, jfloat w, jlong __functionAddress) {
	glProgramUniform4fPROC glProgramUniform4f = (glProgramUniform4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4f(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform1d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jlong __functionAddress) {
	glProgramUniform1dPROC glProgramUniform1d = (glProgramUniform1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1d(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform2d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jlong __functionAddress) {
	glProgramUniform2dPROC glProgramUniform2d = (glProgramUniform2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2d(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform3d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glProgramUniform3dPROC glProgramUniform3d = (glProgramUniform3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3d(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform4d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glProgramUniform4dPROC glProgramUniform4d = (glProgramUniform4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4d(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform1iv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform1ivPROC glProgramUniform1iv = (glProgramUniform1ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform2iv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform2ivPROC glProgramUniform2iv = (glProgramUniform2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform3iv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform3ivPROC glProgramUniform3iv = (glProgramUniform3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform4iv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform4ivPROC glProgramUniform4iv = (glProgramUniform4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform1uiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform1uivPROC glProgramUniform1uiv = (glProgramUniform1uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform2uiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform2uivPROC glProgramUniform2uiv = (glProgramUniform2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform3uiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform3uivPROC glProgramUniform3uiv = (glProgramUniform3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform4uiv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform4uivPROC glProgramUniform4uiv = (glProgramUniform4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform1fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform1fvPROC glProgramUniform1fv = (glProgramUniform1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform2fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform2fvPROC glProgramUniform2fv = (glProgramUniform2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform3fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform3fvPROC glProgramUniform3fv = (glProgramUniform3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform4fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform4fvPROC glProgramUniform4fv = (glProgramUniform4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform1dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform1dvPROC glProgramUniform1dv = (glProgramUniform1dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform2dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform2dvPROC glProgramUniform2dv = (glProgramUniform2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform3dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform3dvPROC glProgramUniform3dv = (glProgramUniform3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniform4dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniform4dvPROC glProgramUniform4dv = (glProgramUniform4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix2fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2fvPROC glProgramUniformMatrix2fv = (glProgramUniformMatrix2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix3fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3fvPROC glProgramUniformMatrix3fv = (glProgramUniformMatrix3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix4fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4fvPROC glProgramUniformMatrix4fv = (glProgramUniformMatrix4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix2dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2dvPROC glProgramUniformMatrix2dv = (glProgramUniformMatrix2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix3dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3dvPROC glProgramUniformMatrix3dv = (glProgramUniformMatrix3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix4dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4dvPROC glProgramUniformMatrix4dv = (glProgramUniformMatrix4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix2x3fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x3fvPROC glProgramUniformMatrix2x3fv = (glProgramUniformMatrix2x3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix3x2fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x2fvPROC glProgramUniformMatrix3x2fv = (glProgramUniformMatrix3x2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix2x4fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x4fvPROC glProgramUniformMatrix2x4fv = (glProgramUniformMatrix2x4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix4x2fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x2fvPROC glProgramUniformMatrix4x2fv = (glProgramUniformMatrix4x2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix3x4fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x4fvPROC glProgramUniformMatrix3x4fv = (glProgramUniformMatrix3x4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix4x3fv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x3fvPROC glProgramUniformMatrix4x3fv = (glProgramUniformMatrix4x3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix2x3dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x3dvPROC glProgramUniformMatrix2x3dv = (glProgramUniformMatrix2x3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix3x2dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x2dvPROC glProgramUniformMatrix3x2dv = (glProgramUniformMatrix3x2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix2x4dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x4dvPROC glProgramUniformMatrix2x4dv = (glProgramUniformMatrix2x4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix4x2dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x2dvPROC glProgramUniformMatrix4x2dv = (glProgramUniformMatrix4x2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix3x4dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x4dvPROC glProgramUniformMatrix3x4dv = (glProgramUniformMatrix3x4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglProgramUniformMatrix4x3dv(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x3dvPROC glProgramUniformMatrix4x3dv = (glProgramUniformMatrix4x3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglValidateProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline, jlong __functionAddress) {
	glValidateProgramPipelinePROC glValidateProgramPipeline = (glValidateProgramPipelinePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glValidateProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglGetProgramPipelineInfoLog(JNIEnv *__env, jclass clazz, jint pipeline, jint bufSize, jlong lengthAddress, jlong infoLogAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *infoLog = (GLchar *)(intptr_t)infoLogAddress;
	glGetProgramPipelineInfoLogPROC glGetProgramPipelineInfoLog = (glGetProgramPipelineInfoLogPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribL1d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jlong __functionAddress) {
	glVertexAttribL1dPROC glVertexAttribL1d = (glVertexAttribL1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1d(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribL2d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jlong __functionAddress) {
	glVertexAttribL2dPROC glVertexAttribL2d = (glVertexAttribL2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL2d(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribL3d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glVertexAttribL3dPROC glVertexAttribL3d = (glVertexAttribL3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL3d(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribL4d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glVertexAttribL4dPROC glVertexAttribL4d = (glVertexAttribL4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL4d(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribL1dv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttribL1dvPROC glVertexAttribL1dv = (glVertexAttribL1dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL1dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribL2dv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttribL2dvPROC glVertexAttribL2dv = (glVertexAttribL2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL2dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribL3dv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttribL3dvPROC glVertexAttribL3dv = (glVertexAttribL3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL3dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribL4dv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttribL4dvPROC glVertexAttribL4dv = (glVertexAttribL4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribL4dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglVertexAttribLPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glVertexAttribLPointerPROC glVertexAttribLPointer = (glVertexAttribLPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribLPointer(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglGetVertexAttribLdv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetVertexAttribLdvPROC glGetVertexAttribLdv = (glGetVertexAttribLdvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribLdv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglViewportArrayv(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glViewportArrayvPROC glViewportArrayv = (glViewportArrayvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glViewportArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglViewportIndexedf(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat w, jfloat h, jlong __functionAddress) {
	glViewportIndexedfPROC glViewportIndexedf = (glViewportIndexedfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glViewportIndexedf(index, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglViewportIndexedfv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glViewportIndexedfvPROC glViewportIndexedfv = (glViewportIndexedfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glViewportIndexedfv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglScissorArrayv(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glScissorArrayvPROC glScissorArrayv = (glScissorArrayvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScissorArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglScissorIndexed(JNIEnv *__env, jclass clazz, jint index, jint left, jint bottom, jint width, jint height, jlong __functionAddress) {
	glScissorIndexedPROC glScissorIndexed = (glScissorIndexedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScissorIndexed(index, left, bottom, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglScissorIndexedv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glScissorIndexedvPROC glScissorIndexedv = (glScissorIndexedvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScissorIndexedv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglDepthRangeArrayv(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glDepthRangeArrayvPROC glDepthRangeArrayv = (glDepthRangeArrayvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthRangeArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglDepthRangeIndexed(JNIEnv *__env, jclass clazz, jint index, jdouble zNear, jdouble zFar, jlong __functionAddress) {
	glDepthRangeIndexedPROC glDepthRangeIndexed = (glDepthRangeIndexedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthRangeIndexed(index, zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglGetFloati_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetFloati_vPROC glGetFloati_v = (glGetFloati_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFloati_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41_nglGetDoublei_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress, jlong __functionAddress) {
	GLdouble *data = (GLdouble *)(intptr_t)dataAddress;
	glGetDoublei_vPROC glGetDoublei_v = (glGetDoublei_vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetDoublei_v(target, index, data);
}

EXTERN_C_EXIT
