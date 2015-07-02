/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glVertexAttrib1sARBPROC) (GLuint, GLshort);
typedef GLvoid (APIENTRY *glVertexAttrib1fARBPROC) (GLuint, GLfloat);
typedef GLvoid (APIENTRY *glVertexAttrib1dARBPROC) (GLuint, GLdouble);
typedef GLvoid (APIENTRY *glVertexAttrib2sARBPROC) (GLuint, GLshort, GLshort);
typedef GLvoid (APIENTRY *glVertexAttrib2fARBPROC) (GLuint, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glVertexAttrib2dARBPROC) (GLuint, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertexAttrib3sARBPROC) (GLuint, GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glVertexAttrib3fARBPROC) (GLuint, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glVertexAttrib3dARBPROC) (GLuint, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertexAttrib4sARBPROC) (GLuint, GLshort, GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glVertexAttrib4fARBPROC) (GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glVertexAttrib4dARBPROC) (GLuint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertexAttrib4NubARBPROC) (GLuint, GLubyte, GLubyte, GLubyte, GLubyte);
typedef GLvoid (APIENTRY *glVertexAttrib1svARBPROC) (GLuint, const GLshort *);
typedef GLvoid (APIENTRY *glVertexAttrib1fvARBPROC) (GLuint, const GLfloat *);
typedef GLvoid (APIENTRY *glVertexAttrib1dvARBPROC) (GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glVertexAttrib2svARBPROC) (GLuint, const GLshort *);
typedef GLvoid (APIENTRY *glVertexAttrib2fvARBPROC) (GLuint, const GLfloat *);
typedef GLvoid (APIENTRY *glVertexAttrib2dvARBPROC) (GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glVertexAttrib3svARBPROC) (GLuint, const GLshort *);
typedef GLvoid (APIENTRY *glVertexAttrib3fvARBPROC) (GLuint, const GLfloat *);
typedef GLvoid (APIENTRY *glVertexAttrib3dvARBPROC) (GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glVertexAttrib4fvARBPROC) (GLuint, const GLfloat *);
typedef GLvoid (APIENTRY *glVertexAttrib4bvARBPROC) (GLuint, const GLbyte *);
typedef GLvoid (APIENTRY *glVertexAttrib4svARBPROC) (GLuint, const GLshort *);
typedef GLvoid (APIENTRY *glVertexAttrib4ivARBPROC) (GLuint, const GLint *);
typedef GLvoid (APIENTRY *glVertexAttrib4ubvARBPROC) (GLuint, const GLubyte *);
typedef GLvoid (APIENTRY *glVertexAttrib4usvARBPROC) (GLuint, const GLushort *);
typedef GLvoid (APIENTRY *glVertexAttrib4uivARBPROC) (GLuint, const GLuint *);
typedef GLvoid (APIENTRY *glVertexAttrib4dvARBPROC) (GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glVertexAttrib4NbvARBPROC) (GLuint, const GLbyte *);
typedef GLvoid (APIENTRY *glVertexAttrib4NsvARBPROC) (GLuint, const GLshort *);
typedef GLvoid (APIENTRY *glVertexAttrib4NivARBPROC) (GLuint, const GLint *);
typedef GLvoid (APIENTRY *glVertexAttrib4NubvARBPROC) (GLuint, const GLubyte *);
typedef GLvoid (APIENTRY *glVertexAttrib4NusvARBPROC) (GLuint, const GLushort *);
typedef GLvoid (APIENTRY *glVertexAttrib4NuivARBPROC) (GLuint, const GLuint *);
typedef GLvoid (APIENTRY *glVertexAttribPointerARBPROC) (GLuint, GLint, GLenum, GLboolean, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glEnableVertexAttribArrayARBPROC) (GLuint);
typedef GLvoid (APIENTRY *glDisableVertexAttribArrayARBPROC) (GLuint);
typedef GLvoid (APIENTRY *glProgramStringARBPROC) (GLenum, GLenum, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glBindProgramARBPROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glDeleteProgramsARBPROC) (GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGenProgramsARBPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glProgramEnvParameter4dARBPROC) (GLenum, GLuint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glProgramEnvParameter4dvARBPROC) (GLenum, GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramEnvParameter4fARBPROC) (GLenum, GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glProgramEnvParameter4fvARBPROC) (GLenum, GLuint, const GLfloat *);
typedef GLvoid (APIENTRY *glProgramLocalParameter4dARBPROC) (GLenum, GLuint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glProgramLocalParameter4dvARBPROC) (GLenum, GLuint, const GLdouble *);
typedef GLvoid (APIENTRY *glProgramLocalParameter4fARBPROC) (GLenum, GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glProgramLocalParameter4fvARBPROC) (GLenum, GLuint, const GLfloat *);
typedef GLvoid (APIENTRY *glGetProgramEnvParameterfvARBPROC) (GLenum, GLuint, GLfloat *);
typedef GLvoid (APIENTRY *glGetProgramEnvParameterdvARBPROC) (GLenum, GLuint, GLdouble *);
typedef GLvoid (APIENTRY *glGetProgramLocalParameterfvARBPROC) (GLenum, GLuint, GLfloat *);
typedef GLvoid (APIENTRY *glGetProgramLocalParameterdvARBPROC) (GLenum, GLuint, GLdouble *);
typedef GLvoid (APIENTRY *glGetProgramivARBPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetProgramStringARBPROC) (GLenum, GLenum, GLvoid *);
typedef GLvoid (APIENTRY *glGetVertexAttribfvARBPROC) (GLuint, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetVertexAttribdvARBPROC) (GLuint, GLenum, GLdouble *);
typedef GLvoid (APIENTRY *glGetVertexAttribivARBPROC) (GLuint, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetVertexAttribPointervARBPROC) (GLuint, GLenum, GLvoid **);
typedef GLboolean (APIENTRY *glIsProgramARBPROC) (GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1sARB(JNIEnv *__env, jclass clazz, jint index, jshort x, jlong __functionAddress) {
	glVertexAttrib1sARBPROC glVertexAttrib1sARB = (glVertexAttrib1sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1sARB(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1fARB(JNIEnv *__env, jclass clazz, jint index, jfloat x, jlong __functionAddress) {
	glVertexAttrib1fARBPROC glVertexAttrib1fARB = (glVertexAttrib1fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1fARB(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1dARB(JNIEnv *__env, jclass clazz, jint index, jdouble x, jlong __functionAddress) {
	glVertexAttrib1dARBPROC glVertexAttrib1dARB = (glVertexAttrib1dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1dARB(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2sARB(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jlong __functionAddress) {
	glVertexAttrib2sARBPROC glVertexAttrib2sARB = (glVertexAttrib2sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2sARB(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2fARB(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jlong __functionAddress) {
	glVertexAttrib2fARBPROC glVertexAttrib2fARB = (glVertexAttrib2fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2fARB(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2dARB(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jlong __functionAddress) {
	glVertexAttrib2dARBPROC glVertexAttrib2dARB = (glVertexAttrib2dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2dARB(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3sARB(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jshort z, jlong __functionAddress) {
	glVertexAttrib3sARBPROC glVertexAttrib3sARB = (glVertexAttrib3sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3sARB(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3fARB(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glVertexAttrib3fARBPROC glVertexAttrib3fARB = (glVertexAttrib3fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3fARB(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3dARB(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glVertexAttrib3dARBPROC glVertexAttrib3dARB = (glVertexAttrib3dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3dARB(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4sARB(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jshort z, jshort w, jlong __functionAddress) {
	glVertexAttrib4sARBPROC glVertexAttrib4sARB = (glVertexAttrib4sARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4sARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4fARB(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z, jfloat w, jlong __functionAddress) {
	glVertexAttrib4fARBPROC glVertexAttrib4fARB = (glVertexAttrib4fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4fARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4dARB(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glVertexAttrib4dARBPROC glVertexAttrib4dARB = (glVertexAttrib4dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4dARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NubARB(JNIEnv *__env, jclass clazz, jint index, jbyte x, jbyte y, jbyte z, jbyte w, jlong __functionAddress) {
	glVertexAttrib4NubARBPROC glVertexAttrib4NubARB = (glVertexAttrib4NubARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NubARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1svARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib1svARBPROC glVertexAttrib1svARB = (glVertexAttrib1svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1fvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib1fvARBPROC glVertexAttrib1fvARB = (glVertexAttrib1fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1dvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib1dvARBPROC glVertexAttrib1dvARB = (glVertexAttrib1dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib1dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2svARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib2svARBPROC glVertexAttrib2svARB = (glVertexAttrib2svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2fvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib2fvARBPROC glVertexAttrib2fvARB = (glVertexAttrib2fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2dvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib2dvARBPROC glVertexAttrib2dvARB = (glVertexAttrib2dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib2dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3svARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib3svARBPROC glVertexAttrib3svARB = (glVertexAttrib3svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3fvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib3fvARBPROC glVertexAttrib3fvARB = (glVertexAttrib3fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3dvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib3dvARBPROC glVertexAttrib3dvARB = (glVertexAttrib3dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib3dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4fvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glVertexAttrib4fvARBPROC glVertexAttrib4fvARB = (glVertexAttrib4fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4bvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttrib4bvARBPROC glVertexAttrib4bvARB = (glVertexAttrib4bvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4bvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4svARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib4svARBPROC glVertexAttrib4svARB = (glVertexAttrib4svARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4ivARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttrib4ivARBPROC glVertexAttrib4ivARB = (glVertexAttrib4ivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4ivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4ubvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glVertexAttrib4ubvARBPROC glVertexAttrib4ubvARB = (glVertexAttrib4ubvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4ubvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4usvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glVertexAttrib4usvARBPROC glVertexAttrib4usvARB = (glVertexAttrib4usvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4usvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4uivARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttrib4uivARBPROC glVertexAttrib4uivARB = (glVertexAttrib4uivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4uivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4dvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glVertexAttrib4dvARBPROC glVertexAttrib4dvARB = (glVertexAttrib4dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NbvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glVertexAttrib4NbvARBPROC glVertexAttrib4NbvARB = (glVertexAttrib4NbvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NbvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NsvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glVertexAttrib4NsvARBPROC glVertexAttrib4NsvARB = (glVertexAttrib4NsvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NsvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NivARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glVertexAttrib4NivARBPROC glVertexAttrib4NivARB = (glVertexAttrib4NivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NubvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glVertexAttrib4NubvARBPROC glVertexAttrib4NubvARB = (glVertexAttrib4NubvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NubvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NusvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glVertexAttrib4NusvARBPROC glVertexAttrib4NusvARB = (glVertexAttrib4NusvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NusvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NuivARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glVertexAttrib4NuivARBPROC glVertexAttrib4NuivARB = (glVertexAttrib4NuivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttrib4NuivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttribPointerARB(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLvoid *pointer = (const GLvoid *)(intptr_t)pointerAddress;
	glVertexAttribPointerARBPROC glVertexAttribPointerARB = (glVertexAttribPointerARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglEnableVertexAttribArrayARB(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glEnableVertexAttribArrayARBPROC glEnableVertexAttribArrayARB = (glEnableVertexAttribArrayARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableVertexAttribArrayARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglDisableVertexAttribArrayARB(JNIEnv *__env, jclass clazz, jint index, jlong __functionAddress) {
	glDisableVertexAttribArrayARBPROC glDisableVertexAttribArrayARB = (glDisableVertexAttribArrayARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableVertexAttribArrayARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramStringARB(JNIEnv *__env, jclass clazz, jint target, jint format, jint len, jlong stringAddress, jlong __functionAddress) {
	const GLvoid *string = (const GLvoid *)(intptr_t)stringAddress;
	glProgramStringARBPROC glProgramStringARB = (glProgramStringARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramStringARB(target, format, len, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglBindProgramARB(JNIEnv *__env, jclass clazz, jint target, jint program, jlong __functionAddress) {
	glBindProgramARBPROC glBindProgramARB = (glBindProgramARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindProgramARB(target, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglDeleteProgramsARB(JNIEnv *__env, jclass clazz, jint n, jlong programsAddress, jlong __functionAddress) {
	const GLuint *programs = (const GLuint *)(intptr_t)programsAddress;
	glDeleteProgramsARBPROC glDeleteProgramsARB = (glDeleteProgramsARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteProgramsARB(n, programs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGenProgramsARB(JNIEnv *__env, jclass clazz, jint n, jlong programsAddress, jlong __functionAddress) {
	GLuint *programs = (GLuint *)(intptr_t)programsAddress;
	glGenProgramsARBPROC glGenProgramsARB = (glGenProgramsARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenProgramsARB(n, programs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramEnvParameter4dARB(JNIEnv *__env, jclass clazz, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glProgramEnvParameter4dARBPROC glProgramEnvParameter4dARB = (glProgramEnvParameter4dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramEnvParameter4dARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramEnvParameter4dvARB(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	const GLdouble *params = (const GLdouble *)(intptr_t)paramsAddress;
	glProgramEnvParameter4dvARBPROC glProgramEnvParameter4dvARB = (glProgramEnvParameter4dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramEnvParameter4dvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramEnvParameter4fARB(JNIEnv *__env, jclass clazz, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w, jlong __functionAddress) {
	glProgramEnvParameter4fARBPROC glProgramEnvParameter4fARB = (glProgramEnvParameter4fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramEnvParameter4fARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramEnvParameter4fvARB(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glProgramEnvParameter4fvARBPROC glProgramEnvParameter4fvARB = (glProgramEnvParameter4fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramEnvParameter4fvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramLocalParameter4dARB(JNIEnv *__env, jclass clazz, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glProgramLocalParameter4dARBPROC glProgramLocalParameter4dARB = (glProgramLocalParameter4dARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramLocalParameter4dARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramLocalParameter4dvARB(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	const GLdouble *params = (const GLdouble *)(intptr_t)paramsAddress;
	glProgramLocalParameter4dvARBPROC glProgramLocalParameter4dvARB = (glProgramLocalParameter4dvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramLocalParameter4dvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramLocalParameter4fARB(JNIEnv *__env, jclass clazz, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w, jlong __functionAddress) {
	glProgramLocalParameter4fARBPROC glProgramLocalParameter4fARB = (glProgramLocalParameter4fARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramLocalParameter4fARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramLocalParameter4fvARB(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glProgramLocalParameter4fvARBPROC glProgramLocalParameter4fvARB = (glProgramLocalParameter4fvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramLocalParameter4fvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramEnvParameterfvARB(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetProgramEnvParameterfvARBPROC glGetProgramEnvParameterfvARB = (glGetProgramEnvParameterfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramEnvParameterfvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramEnvParameterdvARB(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetProgramEnvParameterdvARBPROC glGetProgramEnvParameterdvARB = (glGetProgramEnvParameterdvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramEnvParameterdvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramLocalParameterfvARB(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetProgramLocalParameterfvARBPROC glGetProgramLocalParameterfvARB = (glGetProgramLocalParameterfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramLocalParameterfvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramLocalParameterdvARB(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetProgramLocalParameterdvARBPROC glGetProgramLocalParameterdvARB = (glGetProgramLocalParameterdvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramLocalParameterdvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramivARB(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramivARBPROC glGetProgramivARB = (glGetProgramivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramivARB(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramStringARB(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong stringAddress, jlong __functionAddress) {
	GLvoid *string = (GLvoid *)(intptr_t)stringAddress;
	glGetProgramStringARBPROC glGetProgramStringARB = (glGetProgramStringARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramStringARB(target, pname, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetVertexAttribfvARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetVertexAttribfvARBPROC glGetVertexAttribfvARB = (glGetVertexAttribfvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribfvARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetVertexAttribdvARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetVertexAttribdvARBPROC glGetVertexAttribdvARB = (glGetVertexAttribdvARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribdvARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetVertexAttribivARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetVertexAttribivARBPROC glGetVertexAttribivARB = (glGetVertexAttribivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribivARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetVertexAttribPointervARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress, jlong __functionAddress) {
	GLvoid **pointer = (GLvoid **)(intptr_t)pointerAddress;
	glGetVertexAttribPointervARBPROC glGetVertexAttribPointervARB = (glGetVertexAttribPointervARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexAttribPointervARB(index, pname, pointer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglIsProgramARB(JNIEnv *__env, jclass clazz, jint program, jlong __functionAddress) {
	glIsProgramARBPROC glIsProgramARB = (glIsProgramARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsProgramARB(program);
}

EXTERN_C_EXIT
