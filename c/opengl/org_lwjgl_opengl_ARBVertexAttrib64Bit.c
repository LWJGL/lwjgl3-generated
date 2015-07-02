/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glVertexArrayVertexAttribLOffsetEXTPROC) (GLuint, GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_nglVertexArrayVertexAttribLOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayVertexAttribLOffsetEXTPROC glVertexArrayVertexAttribLOffsetEXT = (glVertexArrayVertexAttribLOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribLOffsetEXT(vaobj, buffer, index, size, type, stride, (GLintptr)offset);
}

EXTERN_C_EXIT
