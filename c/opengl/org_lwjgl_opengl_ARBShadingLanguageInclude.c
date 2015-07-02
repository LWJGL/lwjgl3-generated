/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glNamedStringARBPROC) (GLenum, GLint, const GLchar *, GLint, const GLchar *);
typedef GLvoid (APIENTRY *glDeleteNamedStringARBPROC) (GLint, const GLchar *);
typedef GLvoid (APIENTRY *glCompileShaderIncludeARBPROC) (GLuint, GLsizei, const GLchar * const *, const GLint *);
typedef GLboolean (APIENTRY *glIsNamedStringARBPROC) (GLint, const GLchar *);
typedef GLvoid (APIENTRY *glGetNamedStringARBPROC) (GLint, const GLchar *, GLsizei, GLint *, GLchar *);
typedef GLvoid (APIENTRY *glGetNamedStringivARBPROC) (GLint, const GLchar *, GLenum, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglNamedStringARB(JNIEnv *__env, jclass clazz, jint type, jint namelen, jlong nameAddress, jint stringlen, jlong stringAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	const GLchar *string = (const GLchar *)(intptr_t)stringAddress;
	glNamedStringARBPROC glNamedStringARB = (glNamedStringARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedStringARB(type, namelen, name, stringlen, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglDeleteNamedStringARB(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glDeleteNamedStringARBPROC glDeleteNamedStringARB = (glDeleteNamedStringARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteNamedStringARB(namelen, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglCompileShaderIncludeARB(JNIEnv *__env, jclass clazz, jint shader, jint count, jlong pathAddress, jlong lengthAddress, jlong __functionAddress) {
	const GLchar * const *path = (const GLchar * const *)(intptr_t)pathAddress;
	const GLint *length = (const GLint *)(intptr_t)lengthAddress;
	glCompileShaderIncludeARBPROC glCompileShaderIncludeARB = (glCompileShaderIncludeARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompileShaderIncludeARB(shader, count, path, length);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglIsNamedStringARB(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glIsNamedStringARBPROC glIsNamedStringARB = (glIsNamedStringARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsNamedStringARB(namelen, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglGetNamedStringARB(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress, jint bufSize, jlong stringlenAddress, jlong stringAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	GLint *stringlen = (GLint *)(intptr_t)stringlenAddress;
	GLchar *string = (GLchar *)(intptr_t)stringAddress;
	glGetNamedStringARBPROC glGetNamedStringARB = (glGetNamedStringARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedStringARB(namelen, name, bufSize, stringlen, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglGetNamedStringivARB(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedStringivARBPROC glGetNamedStringivARB = (glGetNamedStringivARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedStringivARB(namelen, name, pname, params);
}

EXTERN_C_EXIT
