/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_command_queue (APIENTRY *clCreateCommandQueueWithPropertiesPROC) (cl_context, cl_device_id, const cl_command_queue_properties *, cl_int *);
typedef cl_mem (APIENTRY *clCreatePipePROC) (cl_context, cl_mem_flags, cl_uint, cl_uint, const cl_pipe_properties *, cl_int *);
typedef cl_int (APIENTRY *clGetPipeInfoPROC) (cl_mem, cl_pipe_info, size_t, void *, size_t *);
typedef void * (APIENTRY *clSVMAllocPROC) (cl_context, cl_svm_mem_flags, size_t, unsigned int);
typedef void (APIENTRY *clSVMFreePROC) (cl_context, void *);
typedef cl_int (APIENTRY *clEnqueueSVMFreePROC) (cl_command_queue, cl_uint, void **, cl_svmfree_callback, void *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueSVMMemcpyPROC) (cl_command_queue, cl_bool, void *, const void *, size_t, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueSVMMemFillPROC) (cl_command_queue, void *, const void *, size_t, size_t, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueSVMMapPROC) (cl_command_queue, cl_bool, cl_map_flags, void *, size_t, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueSVMUnmapPROC) (cl_command_queue, void *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clSetKernelArgSVMPointerPROC) (cl_kernel, cl_uint, const void *);
typedef cl_int (APIENTRY *clSetKernelExecInfoPROC) (cl_kernel, cl_kernel_exec_info, size_t, const void *);
typedef cl_sampler (APIENTRY *clCreateSamplerWithPropertiesPROC) (cl_context, const cl_sampler_properties *, cl_int *);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL20_nclCreateCommandQueueWithProperties(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong deviceAddress, jlong propertiesAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_device_id device = (cl_device_id)(intptr_t)deviceAddress;
	const cl_command_queue_properties *properties = (const cl_command_queue_properties *)(intptr_t)propertiesAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateCommandQueueWithPropertiesPROC clCreateCommandQueueWithProperties = (clCreateCommandQueueWithPropertiesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateCommandQueueWithProperties(context, device, properties, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL20_nclCreatePipe(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jint pipe_packet_size, jint pipe_max_packets, jlong propertiesAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_pipe_properties *properties = (const cl_pipe_properties *)(intptr_t)propertiesAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreatePipePROC clCreatePipe = (clCreatePipePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreatePipe(context, flags, pipe_packet_size, pipe_max_packets, properties, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL20_nclGetPipeInfo(JNIEnv *__env, jclass clazz, jlong pipeAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_mem pipe = (cl_mem)(intptr_t)pipeAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetPipeInfoPROC clGetPipeInfo = (clGetPipeInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetPipeInfo(pipe, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL20_nclSVMAlloc(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jlong size, jint alignment, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	clSVMAllocPROC clSVMAlloc = (clSVMAllocPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clSVMAlloc(context, flags, (size_t)size, alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opencl_CL20_nclSVMFree(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong svm_pointerAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	void *svm_pointer = (void *)(intptr_t)svm_pointerAddress;
	clSVMFreePROC clSVMFree = (clSVMFreePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	clSVMFree(context, svm_pointer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL20_nclEnqueueSVMFree(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_svm_pointers, jlong svm_pointersAddress, jlong pfn_free_funcAddress, jlong user_dataAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	void **svm_pointers = (void **)(intptr_t)svm_pointersAddress;
	cl_svmfree_callback pfn_free_func = (cl_svmfree_callback)(intptr_t)pfn_free_funcAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueSVMFreePROC clEnqueueSVMFree = (clEnqueueSVMFreePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueSVMFree(command_queue, num_svm_pointers, svm_pointers, pfn_free_func, user_data, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL20_nclEnqueueSVMMemcpy(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint blocking_copy, jlong dst_ptrAddress, jlong src_ptrAddress, jlong size, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	void *dst_ptr = (void *)(intptr_t)dst_ptrAddress;
	const void *src_ptr = (const void *)(intptr_t)src_ptrAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueSVMMemcpyPROC clEnqueueSVMMemcpy = (clEnqueueSVMMemcpyPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueSVMMemcpy(command_queue, blocking_copy, dst_ptr, src_ptr, (size_t)size, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL20_nclEnqueueSVMMemFill(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong svm_ptrAddress, jlong patternAddress, jlong pattern_size, jlong size, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	void *svm_ptr = (void *)(intptr_t)svm_ptrAddress;
	const void *pattern = (const void *)(intptr_t)patternAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueSVMMemFillPROC clEnqueueSVMMemFill = (clEnqueueSVMMemFillPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueSVMMemFill(command_queue, svm_ptr, pattern, (size_t)pattern_size, (size_t)size, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL20_nclEnqueueSVMMap(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint blocking_map, jlong map_flags, jlong svm_ptrAddress, jlong size, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	void *svm_ptr = (void *)(intptr_t)svm_ptrAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueSVMMapPROC clEnqueueSVMMap = (clEnqueueSVMMapPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueSVMMap(command_queue, blocking_map, map_flags, svm_ptr, (size_t)size, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL20_nclEnqueueSVMUnmap(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong svm_ptrAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	void *svm_ptr = (void *)(intptr_t)svm_ptrAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueSVMUnmapPROC clEnqueueSVMUnmap = (clEnqueueSVMUnmapPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueSVMUnmap(command_queue, svm_ptr, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL20_nclSetKernelArgSVMPointer(JNIEnv *__env, jclass clazz, jlong kernelAddress, jint arg_index, jlong arg_valueAddress, jlong __functionAddress) {
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	const void *arg_value = (const void *)(intptr_t)arg_valueAddress;
	clSetKernelArgSVMPointerPROC clSetKernelArgSVMPointer = (clSetKernelArgSVMPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clSetKernelArgSVMPointer(kernel, arg_index, arg_value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL20_nclSetKernelExecInfo(JNIEnv *__env, jclass clazz, jlong kernelAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong __functionAddress) {
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	const void *param_value = (const void *)(intptr_t)param_valueAddress;
	clSetKernelExecInfoPROC clSetKernelExecInfo = (clSetKernelExecInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clSetKernelExecInfo(kernel, param_name, (size_t)param_value_size, param_value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL20_nclCreateSamplerWithProperties(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong sampler_propertiesAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_sampler_properties *sampler_properties = (const cl_sampler_properties *)(intptr_t)sampler_propertiesAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateSamplerWithPropertiesPROC clCreateSamplerWithProperties = (clCreateSamplerWithPropertiesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateSamplerWithProperties(context, sampler_properties, errcode_ret);
}

EXTERN_C_EXIT
