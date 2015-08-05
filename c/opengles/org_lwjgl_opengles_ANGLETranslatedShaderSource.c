/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glGetTranslatedShaderSourceANGLEPROC) (GLuint, GLsizei, GLsizei *, GLchar *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLETranslatedShaderSource_nglGetTranslatedShaderSourceANGLE(JNIEnv *__env, jclass clazz, jint shader, jint bufsize, jlong lengthAddress, jlong sourceAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *source = (GLchar *)(intptr_t)sourceAddress;
	glGetTranslatedShaderSourceANGLEPROC glGetTranslatedShaderSourceANGLE = (glGetTranslatedShaderSourceANGLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTranslatedShaderSourceANGLE(shader, bufsize, length, source);
}

EXTERN_C_EXIT
