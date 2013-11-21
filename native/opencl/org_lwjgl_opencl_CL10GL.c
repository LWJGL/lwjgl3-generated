/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"
#include "opengl_types.h"

typedef cl_mem (APIENTRY *clCreateFromGLBufferPROC) (cl_context, cl_mem_flags, GLuint, cl_int *);
typedef cl_mem (APIENTRY *clCreateFromGLTexture2DPROC) (cl_context, cl_mem_flags, GLenum, GLint, GLuint, cl_int *);
typedef cl_mem (APIENTRY *clCreateFromGLTexture3DPROC) (cl_context, cl_mem_flags, GLenum, GLint, GLuint, cl_int *);
typedef cl_mem (APIENTRY *clCreateFromGLRenderbufferPROC) (cl_context, cl_mem_flags, GLuint, cl_int *);
typedef cl_int (APIENTRY *clGetGLObjectInfoPROC) (cl_mem, cl_gl_object_type *, GLuint *);
typedef cl_int (APIENTRY *clGetGLTextureInfoPROC) (cl_mem, cl_gl_texture_info, size_t, void *, size_t *);
typedef cl_int (APIENTRY *clEnqueueAcquireGLObjectsPROC) (cl_command_queue, cl_uint, const cl_mem *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueReleaseGLObjectsPROC) (cl_command_queue, cl_uint, const cl_mem *, cl_uint, const cl_event *, cl_event *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10GL_nclCreateFromGLBuffer(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jint bufobj, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateFromGLBufferPROC clCreateFromGLBuffer = (clCreateFromGLBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateFromGLBuffer(context, flags, bufobj, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10GL_nclCreateFromGLTexture2D(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jint texture_target, jint miplevel, jint texture, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateFromGLTexture2DPROC clCreateFromGLTexture2D = (clCreateFromGLTexture2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateFromGLTexture2D(context, flags, texture_target, miplevel, texture, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10GL_nclCreateFromGLTexture3D(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jint texture_target, jint miplevel, jint texture, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateFromGLTexture3DPROC clCreateFromGLTexture3D = (clCreateFromGLTexture3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateFromGLTexture3D(context, flags, texture_target, miplevel, texture, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10GL_nclCreateFromGLRenderbuffer(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jint renderbuffer, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateFromGLRenderbufferPROC clCreateFromGLRenderbuffer = (clCreateFromGLRenderbufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateFromGLRenderbuffer(context, flags, renderbuffer, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10GL_nclGetGLObjectInfo(JNIEnv *__env, jclass clazz, jlong memobjAddress, jlong gl_object_typeAddress, jlong gl_object_nameAddress, jlong __functionAddress) {
	cl_mem memobj = (cl_mem)(intptr_t)memobjAddress;
	cl_gl_object_type *gl_object_type = (cl_gl_object_type *)(intptr_t)gl_object_typeAddress;
	GLuint *gl_object_name = (GLuint *)(intptr_t)gl_object_nameAddress;
	clGetGLObjectInfoPROC clGetGLObjectInfo = (clGetGLObjectInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetGLObjectInfo(memobj, gl_object_type, gl_object_name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10GL_nclGetGLTextureInfo(JNIEnv *__env, jclass clazz, jlong memobjAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_mem memobj = (cl_mem)(intptr_t)memobjAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetGLTextureInfoPROC clGetGLTextureInfo = (clGetGLTextureInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetGLTextureInfo(memobj, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10GL_nclEnqueueAcquireGLObjects(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_objects, jlong mem_objectsAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	const cl_mem *mem_objects = (const cl_mem *)(intptr_t)mem_objectsAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueAcquireGLObjectsPROC clEnqueueAcquireGLObjects = (clEnqueueAcquireGLObjectsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueAcquireGLObjects(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10GL_nclEnqueueReleaseGLObjects(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_objects, jlong mem_objectsAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	const cl_mem *mem_objects = (const cl_mem *)(intptr_t)mem_objectsAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueReleaseGLObjectsPROC clEnqueueReleaseGLObjects = (clEnqueueReleaseGLObjectsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueReleaseGLObjects(command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event);
}

EXTERN_C_EXIT
