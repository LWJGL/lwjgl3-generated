/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBlendEquationiPROC) (GLuint, GLenum);
typedef void (APIENTRY *glBlendEquationSeparateiPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFunciPROC) (GLuint, GLenum, GLenum);
typedef void (APIENTRY *glBlendFuncSeparateiPROC) (GLuint, GLenum, GLenum, GLenum, GLenum);
typedef void (APIENTRY *glDrawArraysIndirectPROC) (GLenum, const void *);
typedef void (APIENTRY *glDrawElementsIndirectPROC) (GLenum, GLenum, const void *);
typedef void (APIENTRY *glUniform1dPROC) (GLint, GLdouble);
typedef void (APIENTRY *glUniform2dPROC) (GLint, GLdouble, GLdouble);
typedef void (APIENTRY *glUniform3dPROC) (GLint, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glUniform4dPROC) (GLint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glUniform1dvPROC) (GLint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glUniform2dvPROC) (GLint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glUniform3dvPROC) (GLint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glUniform4dvPROC) (GLint, GLsizei, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix2dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix3dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix4dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix2x3dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix2x4dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix3x2dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix3x4dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix4x2dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glUniformMatrix4x3dvPROC) (GLint, GLsizei, GLboolean, const GLdouble *);
typedef void (APIENTRY *glGetUniformdvPROC) (GLuint, GLint, GLdouble *);
typedef void (APIENTRY *glMinSampleShadingPROC) (GLfloat);
typedef GLint (APIENTRY *glGetSubroutineUniformLocationPROC) (GLuint, GLenum, const GLchar *);
typedef GLuint (APIENTRY *glGetSubroutineIndexPROC) (GLuint, GLenum, const GLchar *);
typedef void (APIENTRY *glGetActiveSubroutineUniformivPROC) (GLuint, GLenum, GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetActiveSubroutineUniformNamePROC) (GLuint, GLenum, GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetActiveSubroutineNamePROC) (GLuint, GLenum, GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glUniformSubroutinesuivPROC) (GLenum, GLsizei, const GLuint *);
typedef void (APIENTRY *glGetUniformSubroutineuivPROC) (GLenum, GLint, GLuint *);
typedef void (APIENTRY *glGetProgramStageivPROC) (GLuint, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glPatchParameteriPROC) (GLenum, GLint);
typedef void (APIENTRY *glPatchParameterfvPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glBindTransformFeedbackPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDeleteTransformFeedbacksPROC) (GLsizei, const GLuint *);
typedef void (APIENTRY *glGenTransformFeedbacksPROC) (GLsizei, GLuint *);
typedef GLboolean (APIENTRY *glIsTransformFeedbackPROC) (GLuint);
typedef void (APIENTRY *glPauseTransformFeedbackPROC) (void);
typedef void (APIENTRY *glResumeTransformFeedbackPROC) (void);
typedef void (APIENTRY *glDrawTransformFeedbackPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDrawTransformFeedbackStreamPROC) (GLenum, GLuint, GLuint);
typedef void (APIENTRY *glBeginQueryIndexedPROC) (GLenum, GLuint, GLuint);
typedef void (APIENTRY *glEndQueryIndexedPROC) (GLenum, GLuint);
typedef void (APIENTRY *glGetQueryIndexedivPROC) (GLenum, GLuint, GLenum, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBlendEquationi(JNIEnv *__env, jclass clazz, jint buf, jint mode, jlong __functionAddress) {
	glBlendEquationiPROC glBlendEquationi = (glBlendEquationiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationi(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBlendEquationSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha, jlong __functionAddress) {
	glBlendEquationSeparateiPROC glBlendEquationSeparatei = (glBlendEquationSeparateiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBlendFunci(JNIEnv *__env, jclass clazz, jint buf, jint sfactor, jint dfactor, jlong __functionAddress) {
	glBlendFunciPROC glBlendFunci = (glBlendFunciPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFunci(buf, sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBlendFuncSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha, jlong __functionAddress) {
	glBlendFuncSeparateiPROC glBlendFuncSeparatei = (glBlendFuncSeparateiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDrawArraysIndirect(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glDrawArraysIndirectPROC glDrawArraysIndirect = (glDrawArraysIndirectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArraysIndirect(mode, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDrawElementsIndirect(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jlong __functionAddress) {
	const void *indirect = (const void *)(intptr_t)indirectAddress;
	glDrawElementsIndirectPROC glDrawElementsIndirect = (glDrawElementsIndirectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElementsIndirect(mode, type, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform1d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jlong __functionAddress) {
	glUniform1dPROC glUniform1d = (glUniform1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1d(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform2d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jlong __functionAddress) {
	glUniform2dPROC glUniform2d = (glUniform2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2d(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform3d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glUniform3dPROC glUniform3d = (glUniform3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3d(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform4d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glUniform4dPROC glUniform4d = (glUniform4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4d(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform1dv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniform1dvPROC glUniform1dv = (glUniform1dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform1dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform2dv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniform2dvPROC glUniform2dv = (glUniform2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform2dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform3dv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniform3dvPROC glUniform3dv = (glUniform3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform3dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform4dv(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniform4dvPROC glUniform4dv = (glUniform4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniform4dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix2dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix2dvPROC glUniformMatrix2dv = (glUniformMatrix2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix3dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix3dvPROC glUniformMatrix3dv = (glUniformMatrix3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix4dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix4dvPROC glUniformMatrix4dv = (glUniformMatrix4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix2x3dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix2x3dvPROC glUniformMatrix2x3dv = (glUniformMatrix2x3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2x3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix2x4dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix2x4dvPROC glUniformMatrix2x4dv = (glUniformMatrix2x4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix2x4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix3x2dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix3x2dvPROC glUniformMatrix3x2dv = (glUniformMatrix3x2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3x2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix3x4dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix3x4dvPROC glUniformMatrix3x4dv = (glUniformMatrix3x4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix3x4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix4x2dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix4x2dvPROC glUniformMatrix4x2dv = (glUniformMatrix4x2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4x2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix4x3dv(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLdouble *value = (const GLdouble *)(intptr_t)valueAddress;
	glUniformMatrix4x3dvPROC glUniformMatrix4x3dv = (glUniformMatrix4x3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformMatrix4x3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetUniformdv(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetUniformdvPROC glGetUniformdv = (glGetUniformdvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformdv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglMinSampleShading(JNIEnv *__env, jclass clazz, jfloat value, jlong __functionAddress) {
	glMinSampleShadingPROC glMinSampleShading = (glMinSampleShadingPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMinSampleShading(value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL40_nglGetSubroutineUniformLocation(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetSubroutineUniformLocationPROC glGetSubroutineUniformLocation = (glGetSubroutineUniformLocationPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetSubroutineUniformLocation(program, shadertype, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL40_nglGetSubroutineIndex(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetSubroutineIndexPROC glGetSubroutineIndex = (glGetSubroutineIndexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetSubroutineIndex(program, shadertype, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetActiveSubroutineUniformiv(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint pname, jlong valuesAddress, jlong __functionAddress) {
	GLint *values = (GLint *)(intptr_t)valuesAddress;
	glGetActiveSubroutineUniformivPROC glGetActiveSubroutineUniformiv = (glGetActiveSubroutineUniformivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetActiveSubroutineUniformName(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint bufsize, jlong lengthAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetActiveSubroutineUniformNamePROC glGetActiveSubroutineUniformName = (glGetActiveSubroutineUniformNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetActiveSubroutineName(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint bufsize, jlong lengthAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetActiveSubroutineNamePROC glGetActiveSubroutineName = (glGetActiveSubroutineNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformSubroutinesuiv(JNIEnv *__env, jclass clazz, jint shadertype, jint count, jlong indicesAddress, jlong __functionAddress) {
	const GLuint *indices = (const GLuint *)(intptr_t)indicesAddress;
	glUniformSubroutinesuivPROC glUniformSubroutinesuiv = (glUniformSubroutinesuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glUniformSubroutinesuiv(shadertype, count, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetUniformSubroutineuiv(JNIEnv *__env, jclass clazz, jint shadertype, jint location, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetUniformSubroutineuivPROC glGetUniformSubroutineuiv = (glGetUniformSubroutineuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetUniformSubroutineuiv(shadertype, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetProgramStageiv(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint pname, jlong valuesAddress, jlong __functionAddress) {
	GLint *values = (GLint *)(intptr_t)valuesAddress;
	glGetProgramStageivPROC glGetProgramStageiv = (glGetProgramStageivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramStageiv(program, shadertype, pname, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglPatchParameteri(JNIEnv *__env, jclass clazz, jint pname, jint value, jlong __functionAddress) {
	glPatchParameteriPROC glPatchParameteri = (glPatchParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPatchParameteri(pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglPatchParameterfv(JNIEnv *__env, jclass clazz, jint pname, jlong valuesAddress, jlong __functionAddress) {
	const GLfloat *values = (const GLfloat *)(intptr_t)valuesAddress;
	glPatchParameterfvPROC glPatchParameterfv = (glPatchParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPatchParameterfv(pname, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBindTransformFeedback(JNIEnv *__env, jclass clazz, jint target, jint id, jlong __functionAddress) {
	glBindTransformFeedbackPROC glBindTransformFeedback = (glBindTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindTransformFeedback(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDeleteTransformFeedbacks(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDeleteTransformFeedbacksPROC glDeleteTransformFeedbacks = (glDeleteTransformFeedbacksPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteTransformFeedbacks(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGenTransformFeedbacks(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress, jlong __functionAddress) {
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	glGenTransformFeedbacksPROC glGenTransformFeedbacks = (glGenTransformFeedbacksPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenTransformFeedbacks(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL40_nglIsTransformFeedback(JNIEnv *__env, jclass clazz, jint id, jlong __functionAddress) {
	glIsTransformFeedbackPROC glIsTransformFeedback = (glIsTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsTransformFeedback(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglPauseTransformFeedback(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPauseTransformFeedbackPROC glPauseTransformFeedback = (glPauseTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPauseTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglResumeTransformFeedback(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glResumeTransformFeedbackPROC glResumeTransformFeedback = (glResumeTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glResumeTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDrawTransformFeedback(JNIEnv *__env, jclass clazz, jint mode, jint id, jlong __functionAddress) {
	glDrawTransformFeedbackPROC glDrawTransformFeedback = (glDrawTransformFeedbackPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawTransformFeedback(mode, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDrawTransformFeedbackStream(JNIEnv *__env, jclass clazz, jint mode, jint id, jint stream, jlong __functionAddress) {
	glDrawTransformFeedbackStreamPROC glDrawTransformFeedbackStream = (glDrawTransformFeedbackStreamPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawTransformFeedbackStream(mode, id, stream);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBeginQueryIndexed(JNIEnv *__env, jclass clazz, jint target, jint index, jint id, jlong __functionAddress) {
	glBeginQueryIndexedPROC glBeginQueryIndexed = (glBeginQueryIndexedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginQueryIndexed(target, index, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglEndQueryIndexed(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glEndQueryIndexedPROC glEndQueryIndexed = (glEndQueryIndexedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndQueryIndexed(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetQueryIndexediv(JNIEnv *__env, jclass clazz, jint target, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetQueryIndexedivPROC glGetQueryIndexediv = (glGetQueryIndexedivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryIndexediv(target, index, pname, params);
}

EXTERN_C_EXIT
