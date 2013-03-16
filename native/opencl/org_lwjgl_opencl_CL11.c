/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "opencl.h"

typedef cl_mem (APIENTRY *clCreateSubBufferPROC) (cl_mem, cl_mem_flags, cl_buffer_create_type, const cl_buffer_region *, cl_int *);
typedef cl_int (APIENTRY *clSetMemObjectDestructorCallbackPROC) (cl_mem, cl_mem_object_destructor_callback, void *);
typedef cl_int (APIENTRY *clEnqueueReadBufferRectPROC) (cl_command_queue, cl_mem, cl_bool, size_t *, size_t *, size_t *, size_t, size_t, size_t, size_t, void *, cl_uint, cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueWriteBufferRectPROC) (cl_command_queue, cl_mem, cl_bool, size_t *, size_t *, size_t *, size_t, size_t, size_t, size_t, cl_void *, cl_uint, cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueCopyBufferRectPROC) (cl_command_queue, cl_mem, cl_mem, size_t *, size_t *, size_t *, size_t, size_t, size_t, size_t, cl_uint, cl_event *, cl_event *);
typedef cl_event (APIENTRY *clCreateUserEventPROC) (cl_context, cl_int *);
typedef cl_int (APIENTRY *clSetUserEventStatusPROC) (cl_event, cl_int);
typedef cl_int (APIENTRY *clSetEventCallbackPROC) (cl_event, cl_int, cl_event_callback, void *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL11_nclCreateSubBuffer(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong flags, jint buffer_create_type, jlong buffer_create_infoAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_mem buffer = (cl_mem)(intptr_t)bufferAddress;
	const cl_buffer_region *buffer_create_info = (const cl_buffer_region *)(intptr_t)buffer_create_infoAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateSubBufferPROC clCreateSubBuffer = (clCreateSubBufferPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)clCreateSubBuffer(buffer, flags, buffer_create_type, buffer_create_info, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL11_nclSetMemObjectDestructorCallback(JNIEnv *__env, jclass clazz, jlong memobjAddress, jlong pfn_notifyAddress, jlong user_dataAddress, jlong __functionAddress) {
	cl_mem memobj = (cl_mem)(intptr_t)memobjAddress;
	cl_mem_object_destructor_callback pfn_notify = (cl_mem_object_destructor_callback)(intptr_t)pfn_notifyAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	clSetMemObjectDestructorCallbackPROC clSetMemObjectDestructorCallback = (clSetMemObjectDestructorCallbackPROC)(intptr_t)__functionAddress;
	return (jint)clSetMemObjectDestructorCallback(memobj, pfn_notify, user_data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL11_nclEnqueueReadBufferRect(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong bufferAddress, jint blocking_read, jlong buffer_offsetAddress, jlong host_offsetAddress, jlong regionAddress, jlong buffer_row_pitch, jlong buffer_slice_pitch, jlong host_row_pitch, jlong host_slice_pitch, jlong ptrAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem buffer = (cl_mem)(intptr_t)bufferAddress;
	size_t *buffer_offset = (size_t *)(intptr_t)buffer_offsetAddress;
	size_t *host_offset = (size_t *)(intptr_t)host_offsetAddress;
	size_t *region = (size_t *)(intptr_t)regionAddress;
	void *ptr = (void *)(intptr_t)ptrAddress;
	cl_event *event_wait_list = (cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueReadBufferRectPROC clEnqueueReadBufferRect = (clEnqueueReadBufferRectPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueReadBufferRect(command_queue, buffer, blocking_read, buffer_offset, host_offset, region, (size_t)buffer_row_pitch, (size_t)buffer_slice_pitch, (size_t)host_row_pitch, (size_t)host_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL11_nclEnqueueWriteBufferRect(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong bufferAddress, jint blocking_write, jlong buffer_offsetAddress, jlong host_offsetAddress, jlong regionAddress, jlong buffer_row_pitch, jlong buffer_slice_pitch, jlong host_row_pitch, jlong host_slice_pitch, jlong ptrAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem buffer = (cl_mem)(intptr_t)bufferAddress;
	size_t *buffer_offset = (size_t *)(intptr_t)buffer_offsetAddress;
	size_t *host_offset = (size_t *)(intptr_t)host_offsetAddress;
	size_t *region = (size_t *)(intptr_t)regionAddress;
	cl_void *ptr = (cl_void *)(intptr_t)ptrAddress;
	cl_event *event_wait_list = (cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueWriteBufferRectPROC clEnqueueWriteBufferRect = (clEnqueueWriteBufferRectPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueWriteBufferRect(command_queue, buffer, blocking_write, buffer_offset, host_offset, region, (size_t)buffer_row_pitch, (size_t)buffer_slice_pitch, (size_t)host_row_pitch, (size_t)host_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL11_nclEnqueueCopyBufferRect(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong src_bufferAddress, jlong dst_bufferAddress, jlong src_originAddress, jlong dst_originAddress, jlong regionAddress, jlong src_row_pitch, jlong src_slice_pitch, jlong dst_row_pitch, jlong dst_slice_pitch, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem src_buffer = (cl_mem)(intptr_t)src_bufferAddress;
	cl_mem dst_buffer = (cl_mem)(intptr_t)dst_bufferAddress;
	size_t *src_origin = (size_t *)(intptr_t)src_originAddress;
	size_t *dst_origin = (size_t *)(intptr_t)dst_originAddress;
	size_t *region = (size_t *)(intptr_t)regionAddress;
	cl_event *event_wait_list = (cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueCopyBufferRectPROC clEnqueueCopyBufferRect = (clEnqueueCopyBufferRectPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueCopyBufferRect(command_queue, src_buffer, dst_buffer, src_origin, dst_origin, region, (size_t)src_row_pitch, (size_t)src_slice_pitch, (size_t)dst_row_pitch, (size_t)dst_slice_pitch, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL11_nclCreateUserEvent(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateUserEventPROC clCreateUserEvent = (clCreateUserEventPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)clCreateUserEvent(context, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL11_nclSetUserEventStatus(JNIEnv *__env, jclass clazz, jlong eventAddress, jint execution_status, jlong __functionAddress) {
	cl_event event = (cl_event)(intptr_t)eventAddress;
	clSetUserEventStatusPROC clSetUserEventStatus = (clSetUserEventStatusPROC)(intptr_t)__functionAddress;
	return (jint)clSetUserEventStatus(event, execution_status);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL11_nclSetEventCallback(JNIEnv *__env, jclass clazz, jlong eventAddress, jint command_exec_callback_type, jlong pfn_notifyAddress, jlong user_dataAddress, jlong __functionAddress) {
	cl_event event = (cl_event)(intptr_t)eventAddress;
	cl_event_callback pfn_notify = (cl_event_callback)(intptr_t)pfn_notifyAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	clSetEventCallbackPROC clSetEventCallback = (clSetEventCallbackPROC)(intptr_t)__functionAddress;
	return (jint)clSetEventCallback(event, command_exec_callback_type, pfn_notify, user_data);
}