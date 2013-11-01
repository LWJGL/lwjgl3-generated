/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"
#include "opengl_types.h"

typedef cl_mem (APIENTRY *clCreateFromGLTexturePROC) (cl_context, cl_mem_flags, GLenum, GLint, GLuint, cl_int *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL12GL_nclCreateFromGLTexture(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jint texture_target, jint miplevel, jint texture, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateFromGLTexturePROC clCreateFromGLTexture = (clCreateFromGLTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateFromGLTexture(context, flags, texture_target, miplevel, texture, errcode_ret);
}
