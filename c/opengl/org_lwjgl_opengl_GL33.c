/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glBindFragDataLocationIndexedPROC) (GLuint, GLuint, GLuint, const GLchar *);
typedef GLint (APIENTRY *glGetFragDataIndexPROC) (GLuint, const GLchar *);
typedef void (APIENTRY *glGenSamplersPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glDeleteSamplersPROC) (GLsizei, const GLuint *);
typedef GLboolean (APIENTRY *glIsSamplerPROC) (GLuint);
typedef void (APIENTRY *glBindSamplerPROC) (GLuint, GLuint);
typedef void (APIENTRY *glSamplerParameteriPROC) (GLuint, GLenum, GLint);
typedef void (APIENTRY *glSamplerParameterfPROC) (GLuint, GLenum, GLfloat);
typedef void (APIENTRY *glSamplerParameterivPROC) (GLuint, GLenum, const GLint *);
typedef void (APIENTRY *glSamplerParameterfvPROC) (GLuint, GLenum, const GLfloat *);
typedef void (APIENTRY *glSamplerParameterIivPROC) (GLuint, GLenum, const GLint *);
typedef void (APIENTRY *glSamplerParameterIuivPROC) (GLuint, GLenum, const GLuint *);
typedef void (APIENTRY *glGetSamplerParameterivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetSamplerParameterfvPROC) (GLuint, GLenum, GLfloat *);
typedef void (APIENTRY *glGetSamplerParameterIivPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetSamplerParameterIuivPROC) (GLuint, GLenum, GLuint *);
typedef void (APIENTRY *glQueryCounterPROC) (GLuint, GLenum);
typedef void (APIENTRY *glGetQueryObjecti64vPROC) (GLuint, GLenum, GLint64 *);
typedef void (APIENTRY *glGetQueryObjectui64vPROC) (GLuint, GLenum, GLuint64 *);
typedef void (APIENTRY *glVertexAttribDivisorPROC) (GLuint, GLuint);
typedef void (APIENTRY *glVertexP2uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glVertexP3uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glVertexP4uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glVertexP2uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glVertexP3uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glVertexP4uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glTexCoordP1uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glTexCoordP2uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glTexCoordP3uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glTexCoordP4uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glTexCoordP1uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glTexCoordP2uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glTexCoordP3uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glTexCoordP4uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glMultiTexCoordP1uiPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glMultiTexCoordP2uiPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glMultiTexCoordP3uiPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glMultiTexCoordP4uiPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glMultiTexCoordP1uivPROC) (GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glMultiTexCoordP2uivPROC) (GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glMultiTexCoordP3uivPROC) (GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glMultiTexCoordP4uivPROC) (GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glNormalP3uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glNormalP3uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glColorP3uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glColorP4uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glColorP3uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glColorP4uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glSecondaryColorP3uiPROC) (GLenum, GLuint);
typedef void (APIENTRY *glSecondaryColorP3uivPROC) (GLenum, const GLuint *);
typedef void (APIENTRY *glVertexAttribP1uiPROC) (GLuint, GLenum, GLboolean, GLuint);
typedef void (APIENTRY *glVertexAttribP2uiPROC) (GLuint, GLenum, GLboolean, GLuint);
typedef void (APIENTRY *glVertexAttribP3uiPROC) (GLuint, GLenum, GLboolean, GLuint);
typedef void (APIENTRY *glVertexAttribP4uiPROC) (GLuint, GLenum, GLboolean, GLuint);
typedef void (APIENTRY *glVertexAttribP1uivPROC) (GLuint, GLenum, GLboolean, const GLuint *);
typedef void (APIENTRY *glVertexAttribP2uivPROC) (GLuint, GLenum, GLboolean, const GLuint *);
typedef void (APIENTRY *glVertexAttribP3uivPROC) (GLuint, GLenum, GLboolean, const GLuint *);
typedef void (APIENTRY *glVertexAttribP4uivPROC) (GLuint, GLenum, GLboolean, const GLuint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglBindFragDataLocationIndexed(JNIEnv *__env, jclass clazz, jint program, jint colorNumber, jint index, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glBindFragDataLocationIndexedPROC glBindFragDataLocationIndexed = (glBindFragDataLocationIndexedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindFragDataLocationIndexed(program, colorNumber, index, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL33_nglGetFragDataIndex(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetFragDataIndexPROC glGetFragDataIndex = (glGetFragDataIndexPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetFragDataIndex(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGenSamplers(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress, jlong __functionAddress) {
	GLuint *samplers = (GLuint *)(intptr_t)samplersAddress;
	glGenSamplersPROC glGenSamplers = (glGenSamplersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenSamplers(count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglDeleteSamplers(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress, jlong __functionAddress) {
	const GLuint *samplers = (const GLuint *)(intptr_t)samplersAddress;
	glDeleteSamplersPROC glDeleteSamplers = (glDeleteSamplersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteSamplers(count, samplers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL33_nglIsSampler(JNIEnv *__env, jclass clazz, jint sampler, jlong __functionAddress) {
	glIsSamplerPROC glIsSampler = (glIsSamplerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsSampler(sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglBindSampler(JNIEnv *__env, jclass clazz, jint unit, jint sampler, jlong __functionAddress) {
	glBindSamplerPROC glBindSampler = (glBindSamplerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindSampler(unit, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameteri(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jint param, jlong __functionAddress) {
	glSamplerParameteriPROC glSamplerParameteri = (glSamplerParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameteri(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameterf(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jfloat param, jlong __functionAddress) {
	glSamplerParameterfPROC glSamplerParameterf = (glSamplerParameterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterf(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameteriv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glSamplerParameterivPROC glSamplerParameteriv = (glSamplerParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameteriv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameterfv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glSamplerParameterfvPROC glSamplerParameterfv = (glSamplerParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterfv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameterIiv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glSamplerParameterIivPROC glSamplerParameterIiv = (glSamplerParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameterIuiv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glSamplerParameterIuivPROC glSamplerParameterIuiv = (glSamplerParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetSamplerParameteriv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetSamplerParameterivPROC glGetSamplerParameteriv = (glGetSamplerParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameteriv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetSamplerParameterfv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetSamplerParameterfvPROC glGetSamplerParameterfv = (glGetSamplerParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterfv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetSamplerParameterIiv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetSamplerParameterIivPROC glGetSamplerParameterIiv = (glGetSamplerParameterIivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetSamplerParameterIuiv(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetSamplerParameterIuivPROC glGetSamplerParameterIuiv = (glGetSamplerParameterIuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglQueryCounter(JNIEnv *__env, jclass clazz, jint id, jint target, jlong __functionAddress) {
	glQueryCounterPROC glQueryCounter = (glQueryCounterPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glQueryCounter(id, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetQueryObjecti64v(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetQueryObjecti64vPROC glGetQueryObjecti64v = (glGetQueryObjecti64vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjecti64v(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetQueryObjectui64v(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint64 *params = (GLuint64 *)(intptr_t)paramsAddress;
	glGetQueryObjectui64vPROC glGetQueryObjectui64v = (glGetQueryObjectui64vPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetQueryObjectui64v(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribDivisor(JNIEnv *__env, jclass clazz, jint index, jint divisor, jlong __functionAddress) {
	glVertexAttribDivisorPROC glVertexAttribDivisor = (glVertexAttribDivisorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribDivisor(index, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP2ui(JNIEnv *__env, jclass clazz, jint type, jint value, jlong __functionAddress) {
	glVertexP2uiPROC glVertexP2ui = (glVertexP2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexP2ui(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP3ui(JNIEnv *__env, jclass clazz, jint type, jint value, jlong __functionAddress) {
	glVertexP3uiPROC glVertexP3ui = (glVertexP3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexP3ui(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP4ui(JNIEnv *__env, jclass clazz, jint type, jint value, jlong __functionAddress) {
	glVertexP4uiPROC glVertexP4ui = (glVertexP4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexP4ui(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP2uiv(JNIEnv *__env, jclass clazz, jint type, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glVertexP2uivPROC glVertexP2uiv = (glVertexP2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexP2uiv(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP3uiv(JNIEnv *__env, jclass clazz, jint type, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glVertexP3uivPROC glVertexP3uiv = (glVertexP3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexP3uiv(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP4uiv(JNIEnv *__env, jclass clazz, jint type, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glVertexP4uivPROC glVertexP4uiv = (glVertexP4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexP4uiv(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP1ui(JNIEnv *__env, jclass clazz, jint type, jint coords, jlong __functionAddress) {
	glTexCoordP1uiPROC glTexCoordP1ui = (glTexCoordP1uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordP1ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP2ui(JNIEnv *__env, jclass clazz, jint type, jint coords, jlong __functionAddress) {
	glTexCoordP2uiPROC glTexCoordP2ui = (glTexCoordP2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordP2ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP3ui(JNIEnv *__env, jclass clazz, jint type, jint coords, jlong __functionAddress) {
	glTexCoordP3uiPROC glTexCoordP3ui = (glTexCoordP3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordP3ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP4ui(JNIEnv *__env, jclass clazz, jint type, jint coords, jlong __functionAddress) {
	glTexCoordP4uiPROC glTexCoordP4ui = (glTexCoordP4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordP4ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP1uiv(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glTexCoordP1uivPROC glTexCoordP1uiv = (glTexCoordP1uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordP1uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP2uiv(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glTexCoordP2uivPROC glTexCoordP2uiv = (glTexCoordP2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordP2uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP3uiv(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glTexCoordP3uivPROC glTexCoordP3uiv = (glTexCoordP3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordP3uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP4uiv(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glTexCoordP4uivPROC glTexCoordP4uiv = (glTexCoordP4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordP4uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP1ui(JNIEnv *__env, jclass clazz, jint texture, jint type, jint coords, jlong __functionAddress) {
	glMultiTexCoordP1uiPROC glMultiTexCoordP1ui = (glMultiTexCoordP1uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordP1ui(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP2ui(JNIEnv *__env, jclass clazz, jint texture, jint type, jint coords, jlong __functionAddress) {
	glMultiTexCoordP2uiPROC glMultiTexCoordP2ui = (glMultiTexCoordP2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordP2ui(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP3ui(JNIEnv *__env, jclass clazz, jint texture, jint type, jint coords, jlong __functionAddress) {
	glMultiTexCoordP3uiPROC glMultiTexCoordP3ui = (glMultiTexCoordP3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordP3ui(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP4ui(JNIEnv *__env, jclass clazz, jint texture, jint type, jint coords, jlong __functionAddress) {
	glMultiTexCoordP4uiPROC glMultiTexCoordP4ui = (glMultiTexCoordP4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordP4ui(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP1uiv(JNIEnv *__env, jclass clazz, jint texture, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glMultiTexCoordP1uivPROC glMultiTexCoordP1uiv = (glMultiTexCoordP1uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordP1uiv(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP2uiv(JNIEnv *__env, jclass clazz, jint texture, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glMultiTexCoordP2uivPROC glMultiTexCoordP2uiv = (glMultiTexCoordP2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordP2uiv(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP3uiv(JNIEnv *__env, jclass clazz, jint texture, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glMultiTexCoordP3uivPROC glMultiTexCoordP3uiv = (glMultiTexCoordP3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordP3uiv(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP4uiv(JNIEnv *__env, jclass clazz, jint texture, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glMultiTexCoordP4uivPROC glMultiTexCoordP4uiv = (glMultiTexCoordP4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordP4uiv(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglNormalP3ui(JNIEnv *__env, jclass clazz, jint type, jint coords, jlong __functionAddress) {
	glNormalP3uiPROC glNormalP3ui = (glNormalP3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormalP3ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglNormalP3uiv(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress, jlong __functionAddress) {
	const GLuint *coords = (const GLuint *)(intptr_t)coordsAddress;
	glNormalP3uivPROC glNormalP3uiv = (glNormalP3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormalP3uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglColorP3ui(JNIEnv *__env, jclass clazz, jint type, jint color, jlong __functionAddress) {
	glColorP3uiPROC glColorP3ui = (glColorP3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorP3ui(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglColorP4ui(JNIEnv *__env, jclass clazz, jint type, jint color, jlong __functionAddress) {
	glColorP4uiPROC glColorP4ui = (glColorP4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorP4ui(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglColorP3uiv(JNIEnv *__env, jclass clazz, jint type, jlong colorAddress, jlong __functionAddress) {
	const GLuint *color = (const GLuint *)(intptr_t)colorAddress;
	glColorP3uivPROC glColorP3uiv = (glColorP3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorP3uiv(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglColorP4uiv(JNIEnv *__env, jclass clazz, jint type, jlong colorAddress, jlong __functionAddress) {
	const GLuint *color = (const GLuint *)(intptr_t)colorAddress;
	glColorP4uivPROC glColorP4uiv = (glColorP4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorP4uiv(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSecondaryColorP3ui(JNIEnv *__env, jclass clazz, jint type, jint color, jlong __functionAddress) {
	glSecondaryColorP3uiPROC glSecondaryColorP3ui = (glSecondaryColorP3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColorP3ui(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSecondaryColorP3uiv(JNIEnv *__env, jclass clazz, jint type, jlong colorAddress, jlong __functionAddress) {
	const GLuint *color = (const GLuint *)(intptr_t)colorAddress;
	glSecondaryColorP3uivPROC glSecondaryColorP3uiv = (glSecondaryColorP3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSecondaryColorP3uiv(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP1ui(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jint value, jlong __functionAddress) {
	glVertexAttribP1uiPROC glVertexAttribP1ui = (glVertexAttribP1uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribP1ui(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP2ui(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jint value, jlong __functionAddress) {
	glVertexAttribP2uiPROC glVertexAttribP2ui = (glVertexAttribP2uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribP2ui(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP3ui(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jint value, jlong __functionAddress) {
	glVertexAttribP3uiPROC glVertexAttribP3ui = (glVertexAttribP3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribP3ui(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP4ui(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jint value, jlong __functionAddress) {
	glVertexAttribP4uiPROC glVertexAttribP4ui = (glVertexAttribP4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribP4ui(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP1uiv(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glVertexAttribP1uivPROC glVertexAttribP1uiv = (glVertexAttribP1uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribP1uiv(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP2uiv(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glVertexAttribP2uivPROC glVertexAttribP2uiv = (glVertexAttribP2uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribP2uiv(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP3uiv(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glVertexAttribP3uivPROC glVertexAttribP3uiv = (glVertexAttribP3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribP3uiv(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP4uiv(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glVertexAttribP4uivPROC glVertexAttribP4uiv = (glVertexAttribP4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribP4uiv(index, type, normalized, value);
}

EXTERN_C_EXIT
