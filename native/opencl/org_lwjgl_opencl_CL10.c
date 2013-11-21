/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_int (APIENTRY *clGetPlatformIDsPROC) (cl_uint, cl_platform_id *, cl_uint *);
typedef cl_int (APIENTRY *clGetPlatformInfoPROC) (cl_platform_id, cl_platform_info, size_t, void *, size_t *);
typedef cl_int (APIENTRY *clGetDeviceIDsPROC) (cl_platform_id, cl_device_type, cl_uint, cl_device_id *, cl_uint *);
typedef cl_int (APIENTRY *clGetDeviceInfoPROC) (cl_device_id, cl_device_info, size_t, void *, size_t *);
typedef cl_context (APIENTRY *clCreateContextPROC) (const cl_context_properties *, cl_uint, const cl_device_id *, cl_create_context_callback, void *, cl_int *);
typedef cl_context (APIENTRY *clCreateContextFromTypePROC) (const cl_context_properties *, cl_device_type, cl_create_context_callback, void *, cl_int *);
typedef cl_int (APIENTRY *clRetainContextPROC) (cl_context);
typedef cl_int (APIENTRY *clReleaseContextPROC) (cl_context);
typedef cl_int (APIENTRY *clGetContextInfoPROC) (cl_context, cl_context_info, size_t, void *, size_t *);
typedef cl_command_queue (APIENTRY *clCreateCommandQueuePROC) (cl_context, cl_device_id, cl_command_queue_properties, cl_int *);
typedef cl_int (APIENTRY *clRetainCommandQueuePROC) (cl_command_queue);
typedef cl_int (APIENTRY *clReleaseCommandQueuePROC) (cl_command_queue);
typedef cl_int (APIENTRY *clGetCommandQueueInfoPROC) (cl_command_queue, cl_command_queue_info, size_t, void *, size_t *);
typedef cl_mem (APIENTRY *clCreateBufferPROC) (cl_context, cl_mem_flags, size_t, void *, cl_int *);
typedef cl_int (APIENTRY *clEnqueueReadBufferPROC) (cl_command_queue, cl_mem, cl_bool, size_t, size_t, void *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueWriteBufferPROC) (cl_command_queue, cl_mem, cl_bool, size_t, size_t, const void *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueCopyBufferPROC) (cl_command_queue, cl_mem, cl_mem, size_t, size_t, size_t, cl_uint, const cl_event *, cl_event *);
typedef void * (APIENTRY *clEnqueueMapBufferPROC) (cl_command_queue, cl_mem, cl_bool, cl_map_flags, size_t, size_t, cl_uint, const cl_event *, cl_event *, cl_int *);
typedef cl_mem (APIENTRY *clCreateImage2DPROC) (cl_context, cl_mem_flags, const cl_image_format *, size_t, size_t, size_t, void *, cl_int *);
typedef cl_mem (APIENTRY *clCreateImage3DPROC) (cl_context, cl_mem_flags, const cl_image_format *, size_t, size_t, size_t, size_t, size_t, void *, cl_int *);
typedef cl_int (APIENTRY *clGetSupportedImageFormatsPROC) (cl_context, cl_mem_flags, cl_mem_object_type, cl_uint, cl_image_format *, cl_uint *);
typedef cl_int (APIENTRY *clEnqueueReadImagePROC) (cl_command_queue, cl_mem, cl_bool, const size_t *, const size_t *, size_t, size_t, void *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueWriteImagePROC) (cl_command_queue, cl_mem, cl_bool, const size_t *, const size_t *, size_t, size_t, const void *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueCopyImagePROC) (cl_command_queue, cl_mem, cl_mem, const size_t *, const size_t *, const size_t *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueCopyImageToBufferPROC) (cl_command_queue, cl_mem, cl_mem, const size_t *, const size_t *, size_t, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueCopyBufferToImagePROC) (cl_command_queue, cl_mem, cl_mem, size_t, const size_t *, const size_t *, cl_uint, const cl_event *, cl_event *);
typedef void * (APIENTRY *clEnqueueMapImagePROC) (cl_command_queue, cl_mem, cl_bool, cl_map_flags, const size_t *, const size_t *, size_t *, size_t *, cl_uint, const cl_event *, cl_event *, cl_int *);
typedef cl_int (APIENTRY *clGetImageInfoPROC) (cl_mem, cl_image_info, size_t, void *, size_t *);
typedef cl_int (APIENTRY *clRetainMemObjectPROC) (cl_mem);
typedef cl_int (APIENTRY *clReleaseMemObjectPROC) (cl_mem);
typedef cl_int (APIENTRY *clEnqueueUnmapMemObjectPROC) (cl_command_queue, cl_mem, void *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clGetMemObjectInfoPROC) (cl_mem, cl_mem_info, size_t, void *, size_t *);
typedef cl_sampler (APIENTRY *clCreateSamplerPROC) (cl_context, cl_bool, cl_addressing_mode, cl_filter_mode, cl_int *);
typedef cl_int (APIENTRY *clRetainSamplerPROC) (cl_sampler);
typedef cl_int (APIENTRY *clReleaseSamplerPROC) (cl_sampler);
typedef cl_int (APIENTRY *clGetSamplerInfoPROC) (cl_sampler, cl_sampler_info, size_t, void *, size_t *);
typedef cl_program (APIENTRY *clCreateProgramWithSourcePROC) (cl_context, cl_uint, const cl_char **, const size_t *, cl_int *);
typedef cl_program (APIENTRY *clCreateProgramWithBinaryPROC) (cl_context, cl_uint, const cl_device_id *, const size_t *, const cl_uchar **, cl_int *, cl_int *);
typedef cl_int (APIENTRY *clRetainProgramPROC) (cl_program);
typedef cl_int (APIENTRY *clReleaseProgramPROC) (cl_program);
typedef cl_int (APIENTRY *clBuildProgramPROC) (cl_program, cl_uint, const cl_device_id *, const cl_char *, cl_program_callback, void *);
typedef cl_int (APIENTRY *clUnloadCompilerPROC) (void);
typedef cl_int (APIENTRY *clGetProgramInfoPROC) (cl_program, cl_program_info, size_t, void *, size_t *);
typedef cl_int (APIENTRY *clGetProgramBuildInfoPROC) (cl_program, cl_device_id, cl_program_info, size_t, void *, size_t *);
typedef cl_kernel (APIENTRY *clCreateKernelPROC) (cl_program, const cl_char *, cl_int *);
typedef cl_int (APIENTRY *clCreateKernelsInProgramPROC) (cl_program, cl_uint, cl_kernel *, cl_uint *);
typedef cl_int (APIENTRY *clRetainKernelPROC) (cl_kernel);
typedef cl_int (APIENTRY *clReleaseKernelPROC) (cl_kernel);
typedef cl_int (APIENTRY *clSetKernelArgPROC) (cl_kernel, cl_uint, size_t, const void *);
typedef cl_int (APIENTRY *clGetKernelInfoPROC) (cl_kernel, cl_kernel_info, size_t, void *, size_t *);
typedef cl_int (APIENTRY *clGetKernelWorkGroupInfoPROC) (cl_kernel, cl_device_id, cl_kernel_work_group_info, size_t, void *, size_t *);
typedef cl_int (APIENTRY *clEnqueueNDRangeKernelPROC) (cl_command_queue, cl_kernel, cl_uint, const size_t *, const size_t *, const size_t *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueTaskPROC) (cl_command_queue, cl_kernel, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueNativeKernelPROC) (cl_command_queue, cl_native_kernel_func, void *, size_t, cl_uint, const cl_mem *, const void **, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clWaitForEventsPROC) (cl_uint, const cl_event *);
typedef cl_int (APIENTRY *clGetEventInfoPROC) (cl_event, cl_event_info, size_t, void *, size_t *);
typedef cl_int (APIENTRY *clRetainEventPROC) (cl_event);
typedef cl_int (APIENTRY *clReleaseEventPROC) (cl_event);
typedef cl_int (APIENTRY *clEnqueueMarkerPROC) (cl_command_queue, cl_event *);
typedef cl_int (APIENTRY *clEnqueueBarrierPROC) (cl_command_queue);
typedef cl_int (APIENTRY *clEnqueueWaitForEventsPROC) (cl_command_queue, cl_uint, const cl_event *);
typedef cl_int (APIENTRY *clGetEventProfilingInfoPROC) (cl_event, cl_profiling_info, size_t, void *, size_t *);
typedef cl_int (APIENTRY *clFlushPROC) (cl_command_queue);
typedef cl_int (APIENTRY *clFinishPROC) (cl_command_queue);
typedef void * (APIENTRY *clGetExtensionFunctionAddressPROC) (const cl_char *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetPlatformIDs(JNIEnv *__env, jclass clazz, jint num_entries, jlong platformsAddress, jlong num_platformsAddress, jlong __functionAddress) {
	cl_platform_id *platforms = (cl_platform_id *)(intptr_t)platformsAddress;
	cl_uint *num_platforms = (cl_uint *)(intptr_t)num_platformsAddress;
	clGetPlatformIDsPROC clGetPlatformIDs = (clGetPlatformIDsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetPlatformIDs(num_entries, platforms, num_platforms);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetPlatformInfo(JNIEnv *__env, jclass clazz, jlong platformAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_platform_id platform = (cl_platform_id)(intptr_t)platformAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetPlatformInfoPROC clGetPlatformInfo = (clGetPlatformInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetPlatformInfo(platform, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetDeviceIDs(JNIEnv *__env, jclass clazz, jlong platformAddress, jlong device_type, jint num_entries, jlong devicesAddress, jlong num_devicesAddress, jlong __functionAddress) {
	cl_platform_id platform = (cl_platform_id)(intptr_t)platformAddress;
	cl_device_id *devices = (cl_device_id *)(intptr_t)devicesAddress;
	cl_uint *num_devices = (cl_uint *)(intptr_t)num_devicesAddress;
	clGetDeviceIDsPROC clGetDeviceIDs = (clGetDeviceIDsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetDeviceIDs(platform, device_type, num_entries, devices, num_devices);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetDeviceInfo(JNIEnv *__env, jclass clazz, jlong deviceAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_device_id device = (cl_device_id)(intptr_t)deviceAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetDeviceInfoPROC clGetDeviceInfo = (clGetDeviceInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetDeviceInfo(device, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateContext(JNIEnv *__env, jclass clazz, jlong propertiesAddress, jint num_devices, jlong devicesAddress, jlong pfn_notifyAddress, jlong user_dataAddress, jlong errcode_retAddress, jlong __functionAddress) {
	const cl_context_properties *properties = (const cl_context_properties *)(intptr_t)propertiesAddress;
	const cl_device_id *devices = (const cl_device_id *)(intptr_t)devicesAddress;
	cl_create_context_callback pfn_notify = (cl_create_context_callback)(intptr_t)pfn_notifyAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateContextPROC clCreateContext = (clCreateContextPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateContext(properties, num_devices, devices, pfn_notify, user_data, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateContextFromType(JNIEnv *__env, jclass clazz, jlong propertiesAddress, jlong device_type, jlong pfn_notifyAddress, jlong user_dataAddress, jlong errcode_retAddress, jlong __functionAddress) {
	const cl_context_properties *properties = (const cl_context_properties *)(intptr_t)propertiesAddress;
	cl_create_context_callback pfn_notify = (cl_create_context_callback)(intptr_t)pfn_notifyAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateContextFromTypePROC clCreateContextFromType = (clCreateContextFromTypePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateContextFromType(properties, device_type, pfn_notify, user_data, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclRetainContext(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	clRetainContextPROC clRetainContext = (clRetainContextPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clRetainContext(context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclReleaseContext(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	clReleaseContextPROC clReleaseContext = (clReleaseContextPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clReleaseContext(context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetContextInfo(JNIEnv *__env, jclass clazz, jlong contextAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetContextInfoPROC clGetContextInfo = (clGetContextInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetContextInfo(context, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateCommandQueue(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong deviceAddress, jlong properties, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_device_id device = (cl_device_id)(intptr_t)deviceAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateCommandQueuePROC clCreateCommandQueue = (clCreateCommandQueuePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateCommandQueue(context, device, properties, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclRetainCommandQueue(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	clRetainCommandQueuePROC clRetainCommandQueue = (clRetainCommandQueuePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clRetainCommandQueue(command_queue);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclReleaseCommandQueue(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	clReleaseCommandQueuePROC clReleaseCommandQueue = (clReleaseCommandQueuePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clReleaseCommandQueue(command_queue);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetCommandQueueInfo(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetCommandQueueInfoPROC clGetCommandQueueInfo = (clGetCommandQueueInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetCommandQueueInfo(command_queue, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateBuffer(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jlong size, jlong host_ptrAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	void *host_ptr = (void *)(intptr_t)host_ptrAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateBufferPROC clCreateBuffer = (clCreateBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateBuffer(context, flags, (size_t)size, host_ptr, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueReadBuffer(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong bufferAddress, jint blocking_read, jlong offset, jlong size, jlong ptrAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem buffer = (cl_mem)(intptr_t)bufferAddress;
	void *ptr = (void *)(intptr_t)ptrAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueReadBufferPROC clEnqueueReadBuffer = (clEnqueueReadBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueReadBuffer(command_queue, buffer, blocking_read, (size_t)offset, (size_t)size, ptr, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueWriteBuffer(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong bufferAddress, jint blocking_write, jlong offset, jlong size, jlong ptrAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem buffer = (cl_mem)(intptr_t)bufferAddress;
	const void *ptr = (const void *)(intptr_t)ptrAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueWriteBufferPROC clEnqueueWriteBuffer = (clEnqueueWriteBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueWriteBuffer(command_queue, buffer, blocking_write, (size_t)offset, (size_t)size, ptr, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueCopyBuffer(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong src_bufferAddress, jlong dst_bufferAddress, jlong src_offset, jlong dst_offset, jlong size, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem src_buffer = (cl_mem)(intptr_t)src_bufferAddress;
	cl_mem dst_buffer = (cl_mem)(intptr_t)dst_bufferAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueCopyBufferPROC clEnqueueCopyBuffer = (clEnqueueCopyBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueCopyBuffer(command_queue, src_buffer, dst_buffer, (size_t)src_offset, (size_t)dst_offset, (size_t)size, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueMapBuffer(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong bufferAddress, jint blocking_map, jlong map_flags, jlong offset, jlong size, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem buffer = (cl_mem)(intptr_t)bufferAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clEnqueueMapBufferPROC clEnqueueMapBuffer = (clEnqueueMapBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clEnqueueMapBuffer(command_queue, buffer, blocking_map, map_flags, (size_t)offset, (size_t)size, num_events_in_wait_list, event_wait_list, event, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateImage2D(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jlong image_formatAddress, jlong image_width, jlong image_height, jlong image_row_pitch, jlong host_ptrAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_image_format *image_format = (const cl_image_format *)(intptr_t)image_formatAddress;
	void *host_ptr = (void *)(intptr_t)host_ptrAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateImage2DPROC clCreateImage2D = (clCreateImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateImage2D(context, flags, image_format, (size_t)image_width, (size_t)image_height, (size_t)image_row_pitch, host_ptr, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateImage3D(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jlong image_formatAddress, jlong image_width, jlong image_height, jlong image_depth, jlong image_row_pitch, jlong image_slice_pitch, jlong host_ptrAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_image_format *image_format = (const cl_image_format *)(intptr_t)image_formatAddress;
	void *host_ptr = (void *)(intptr_t)host_ptrAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateImage3DPROC clCreateImage3D = (clCreateImage3DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateImage3D(context, flags, image_format, (size_t)image_width, (size_t)image_height, (size_t)image_depth, (size_t)image_row_pitch, (size_t)image_slice_pitch, host_ptr, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetSupportedImageFormats(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jint image_type, jint num_entries, jlong image_formatsAddress, jlong num_image_formatsAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_image_format *image_formats = (cl_image_format *)(intptr_t)image_formatsAddress;
	cl_uint *num_image_formats = (cl_uint *)(intptr_t)num_image_formatsAddress;
	clGetSupportedImageFormatsPROC clGetSupportedImageFormats = (clGetSupportedImageFormatsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetSupportedImageFormats(context, flags, image_type, num_entries, image_formats, num_image_formats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueReadImage(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong imageAddress, jint blocking_read, jlong originAddress, jlong regionAddress, jlong row_pitch, jlong slice_pitch, jlong ptrAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem image = (cl_mem)(intptr_t)imageAddress;
	const size_t *origin = (const size_t *)(intptr_t)originAddress;
	const size_t *region = (const size_t *)(intptr_t)regionAddress;
	void *ptr = (void *)(intptr_t)ptrAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueReadImagePROC clEnqueueReadImage = (clEnqueueReadImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueReadImage(command_queue, image, blocking_read, origin, region, (size_t)row_pitch, (size_t)slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueWriteImage(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong imageAddress, jint blocking_write, jlong originAddress, jlong regionAddress, jlong input_row_pitch, jlong input_slice_pitch, jlong ptrAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem image = (cl_mem)(intptr_t)imageAddress;
	const size_t *origin = (const size_t *)(intptr_t)originAddress;
	const size_t *region = (const size_t *)(intptr_t)regionAddress;
	const void *ptr = (const void *)(intptr_t)ptrAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueWriteImagePROC clEnqueueWriteImage = (clEnqueueWriteImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueWriteImage(command_queue, image, blocking_write, origin, region, (size_t)input_row_pitch, (size_t)input_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueCopyImage(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong src_imageAddress, jlong dst_imageAddress, jlong src_originAddress, jlong dst_originAddress, jlong regionAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem src_image = (cl_mem)(intptr_t)src_imageAddress;
	cl_mem dst_image = (cl_mem)(intptr_t)dst_imageAddress;
	const size_t *src_origin = (const size_t *)(intptr_t)src_originAddress;
	const size_t *dst_origin = (const size_t *)(intptr_t)dst_originAddress;
	const size_t *region = (const size_t *)(intptr_t)regionAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueCopyImagePROC clEnqueueCopyImage = (clEnqueueCopyImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueCopyImage(command_queue, src_image, dst_image, src_origin, dst_origin, region, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueCopyImageToBuffer(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong src_imageAddress, jlong dst_bufferAddress, jlong src_originAddress, jlong regionAddress, jlong dst_offset, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem src_image = (cl_mem)(intptr_t)src_imageAddress;
	cl_mem dst_buffer = (cl_mem)(intptr_t)dst_bufferAddress;
	const size_t *src_origin = (const size_t *)(intptr_t)src_originAddress;
	const size_t *region = (const size_t *)(intptr_t)regionAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueCopyImageToBufferPROC clEnqueueCopyImageToBuffer = (clEnqueueCopyImageToBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueCopyImageToBuffer(command_queue, src_image, dst_buffer, src_origin, region, (size_t)dst_offset, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueCopyBufferToImage(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong src_bufferAddress, jlong dst_imageAddress, jlong src_offset, jlong dst_originAddress, jlong regionAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem src_buffer = (cl_mem)(intptr_t)src_bufferAddress;
	cl_mem dst_image = (cl_mem)(intptr_t)dst_imageAddress;
	const size_t *dst_origin = (const size_t *)(intptr_t)dst_originAddress;
	const size_t *region = (const size_t *)(intptr_t)regionAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueCopyBufferToImagePROC clEnqueueCopyBufferToImage = (clEnqueueCopyBufferToImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueCopyBufferToImage(command_queue, src_buffer, dst_image, (size_t)src_offset, dst_origin, region, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueMapImage(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong imageAddress, jint blocking_map, jlong map_flags, jlong originAddress, jlong regionAddress, jlong image_row_pitchAddress, jlong image_slice_pitchAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem image = (cl_mem)(intptr_t)imageAddress;
	const size_t *origin = (const size_t *)(intptr_t)originAddress;
	const size_t *region = (const size_t *)(intptr_t)regionAddress;
	size_t *image_row_pitch = (size_t *)(intptr_t)image_row_pitchAddress;
	size_t *image_slice_pitch = (size_t *)(intptr_t)image_slice_pitchAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clEnqueueMapImagePROC clEnqueueMapImage = (clEnqueueMapImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clEnqueueMapImage(command_queue, image, blocking_map, map_flags, origin, region, image_row_pitch, image_slice_pitch, num_events_in_wait_list, event_wait_list, event, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetImageInfo(JNIEnv *__env, jclass clazz, jlong imageAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_mem image = (cl_mem)(intptr_t)imageAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetImageInfoPROC clGetImageInfo = (clGetImageInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetImageInfo(image, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclRetainMemObject(JNIEnv *__env, jclass clazz, jlong memobjAddress, jlong __functionAddress) {
	cl_mem memobj = (cl_mem)(intptr_t)memobjAddress;
	clRetainMemObjectPROC clRetainMemObject = (clRetainMemObjectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clRetainMemObject(memobj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclReleaseMemObject(JNIEnv *__env, jclass clazz, jlong memobjAddress, jlong __functionAddress) {
	cl_mem memobj = (cl_mem)(intptr_t)memobjAddress;
	clReleaseMemObjectPROC clReleaseMemObject = (clReleaseMemObjectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clReleaseMemObject(memobj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueUnmapMemObject(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong memobjAddress, jlong mapped_ptrAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem memobj = (cl_mem)(intptr_t)memobjAddress;
	void *mapped_ptr = (void *)(intptr_t)mapped_ptrAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueUnmapMemObjectPROC clEnqueueUnmapMemObject = (clEnqueueUnmapMemObjectPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueUnmapMemObject(command_queue, memobj, mapped_ptr, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetMemObjectInfo(JNIEnv *__env, jclass clazz, jlong memobjAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_mem memobj = (cl_mem)(intptr_t)memobjAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetMemObjectInfoPROC clGetMemObjectInfo = (clGetMemObjectInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetMemObjectInfo(memobj, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateSampler(JNIEnv *__env, jclass clazz, jlong contextAddress, jint normalized_coords, jint addressing_mode, jint filter_mode, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateSamplerPROC clCreateSampler = (clCreateSamplerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateSampler(context, normalized_coords, addressing_mode, filter_mode, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclRetainSampler(JNIEnv *__env, jclass clazz, jlong samplerAddress, jlong __functionAddress) {
	cl_sampler sampler = (cl_sampler)(intptr_t)samplerAddress;
	clRetainSamplerPROC clRetainSampler = (clRetainSamplerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clRetainSampler(sampler);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclReleaseSampler(JNIEnv *__env, jclass clazz, jlong samplerAddress, jlong __functionAddress) {
	cl_sampler sampler = (cl_sampler)(intptr_t)samplerAddress;
	clReleaseSamplerPROC clReleaseSampler = (clReleaseSamplerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clReleaseSampler(sampler);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetSamplerInfo(JNIEnv *__env, jclass clazz, jlong samplerAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_sampler sampler = (cl_sampler)(intptr_t)samplerAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetSamplerInfoPROC clGetSamplerInfo = (clGetSamplerInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetSamplerInfo(sampler, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateProgramWithSource(JNIEnv *__env, jclass clazz, jlong contextAddress, jint count, jlong stringsAddress, jlong lengthsAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_char **strings = (const cl_char **)(intptr_t)stringsAddress;
	const size_t *lengths = (const size_t *)(intptr_t)lengthsAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateProgramWithSourcePROC clCreateProgramWithSource = (clCreateProgramWithSourcePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateProgramWithSource(context, count, strings, lengths, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateProgramWithBinary(JNIEnv *__env, jclass clazz, jlong contextAddress, jint num_devices, jlong device_listAddress, jlong lengthsAddress, jlong binariesAddress, jlong binary_statusAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_device_id *device_list = (const cl_device_id *)(intptr_t)device_listAddress;
	const size_t *lengths = (const size_t *)(intptr_t)lengthsAddress;
	const cl_uchar **binaries = (const cl_uchar **)(intptr_t)binariesAddress;
	cl_int *binary_status = (cl_int *)(intptr_t)binary_statusAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateProgramWithBinaryPROC clCreateProgramWithBinary = (clCreateProgramWithBinaryPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateProgramWithBinary(context, num_devices, device_list, lengths, binaries, binary_status, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclRetainProgram(JNIEnv *__env, jclass clazz, jlong programAddress, jlong __functionAddress) {
	cl_program program = (cl_program)(intptr_t)programAddress;
	clRetainProgramPROC clRetainProgram = (clRetainProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clRetainProgram(program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclReleaseProgram(JNIEnv *__env, jclass clazz, jlong programAddress, jlong __functionAddress) {
	cl_program program = (cl_program)(intptr_t)programAddress;
	clReleaseProgramPROC clReleaseProgram = (clReleaseProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clReleaseProgram(program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclBuildProgram(JNIEnv *__env, jclass clazz, jlong programAddress, jint num_devices, jlong device_listAddress, jlong optionsAddress, jlong pfn_notifyAddress, jlong user_dataAddress, jlong __functionAddress) {
	cl_program program = (cl_program)(intptr_t)programAddress;
	const cl_device_id *device_list = (const cl_device_id *)(intptr_t)device_listAddress;
	const cl_char *options = (const cl_char *)(intptr_t)optionsAddress;
	cl_program_callback pfn_notify = (cl_program_callback)(intptr_t)pfn_notifyAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	clBuildProgramPROC clBuildProgram = (clBuildProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clBuildProgram(program, num_devices, device_list, options, pfn_notify, user_data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclUnloadCompiler(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	clUnloadCompilerPROC clUnloadCompiler = (clUnloadCompilerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clUnloadCompiler();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetProgramInfo(JNIEnv *__env, jclass clazz, jlong programAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_program program = (cl_program)(intptr_t)programAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetProgramInfoPROC clGetProgramInfo = (clGetProgramInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetProgramInfo(program, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetProgramBuildInfo(JNIEnv *__env, jclass clazz, jlong programAddress, jlong deviceAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_program program = (cl_program)(intptr_t)programAddress;
	cl_device_id device = (cl_device_id)(intptr_t)deviceAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetProgramBuildInfoPROC clGetProgramBuildInfo = (clGetProgramBuildInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetProgramBuildInfo(program, device, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclCreateKernel(JNIEnv *__env, jclass clazz, jlong programAddress, jlong kernel_nameAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_program program = (cl_program)(intptr_t)programAddress;
	const cl_char *kernel_name = (const cl_char *)(intptr_t)kernel_nameAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateKernelPROC clCreateKernel = (clCreateKernelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clCreateKernel(program, kernel_name, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclCreateKernelsInProgram(JNIEnv *__env, jclass clazz, jlong programAddress, jint num_kernels, jlong kernelsAddress, jlong num_kernels_retAddress, jlong __functionAddress) {
	cl_program program = (cl_program)(intptr_t)programAddress;
	cl_kernel *kernels = (cl_kernel *)(intptr_t)kernelsAddress;
	cl_uint *num_kernels_ret = (cl_uint *)(intptr_t)num_kernels_retAddress;
	clCreateKernelsInProgramPROC clCreateKernelsInProgram = (clCreateKernelsInProgramPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clCreateKernelsInProgram(program, num_kernels, kernels, num_kernels_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclRetainKernel(JNIEnv *__env, jclass clazz, jlong kernelAddress, jlong __functionAddress) {
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	clRetainKernelPROC clRetainKernel = (clRetainKernelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clRetainKernel(kernel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclReleaseKernel(JNIEnv *__env, jclass clazz, jlong kernelAddress, jlong __functionAddress) {
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	clReleaseKernelPROC clReleaseKernel = (clReleaseKernelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clReleaseKernel(kernel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclSetKernelArg(JNIEnv *__env, jclass clazz, jlong kernelAddress, jint arg_index, jlong arg_size, jlong arg_valueAddress, jlong __functionAddress) {
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	const void *arg_value = (const void *)(intptr_t)arg_valueAddress;
	clSetKernelArgPROC clSetKernelArg = (clSetKernelArgPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clSetKernelArg(kernel, arg_index, (size_t)arg_size, arg_value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetKernelInfo(JNIEnv *__env, jclass clazz, jlong kernelAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetKernelInfoPROC clGetKernelInfo = (clGetKernelInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetKernelInfo(kernel, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetKernelWorkGroupInfo(JNIEnv *__env, jclass clazz, jlong kernelAddress, jlong deviceAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	cl_device_id device = (cl_device_id)(intptr_t)deviceAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetKernelWorkGroupInfoPROC clGetKernelWorkGroupInfo = (clGetKernelWorkGroupInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetKernelWorkGroupInfo(kernel, device, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueNDRangeKernel(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong kernelAddress, jint work_dim, jlong global_work_offsetAddress, jlong global_work_sizeAddress, jlong local_work_sizeAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	const size_t *global_work_offset = (const size_t *)(intptr_t)global_work_offsetAddress;
	const size_t *global_work_size = (const size_t *)(intptr_t)global_work_sizeAddress;
	const size_t *local_work_size = (const size_t *)(intptr_t)local_work_sizeAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueNDRangeKernelPROC clEnqueueNDRangeKernel = (clEnqueueNDRangeKernelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueNDRangeKernel(command_queue, kernel, work_dim, global_work_offset, global_work_size, local_work_size, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueTask(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong kernelAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueTaskPROC clEnqueueTask = (clEnqueueTaskPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueTask(command_queue, kernel, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueNativeKernel(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong user_funcAddress, jlong argsAddress, jlong cb_args, jint num_mem_objects, jlong mem_listAddress, jlong args_mem_locAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_native_kernel_func user_func = (cl_native_kernel_func)(intptr_t)user_funcAddress;
	void *args = (void *)(intptr_t)argsAddress;
	const cl_mem *mem_list = (const cl_mem *)(intptr_t)mem_listAddress;
	const void **args_mem_loc = (const void **)(intptr_t)args_mem_locAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueNativeKernelPROC clEnqueueNativeKernel = (clEnqueueNativeKernelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueNativeKernel(command_queue, user_func, args, (size_t)cb_args, num_mem_objects, mem_list, args_mem_loc, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclWaitForEvents(JNIEnv *__env, jclass clazz, jint num_events, jlong event_listAddress, jlong __functionAddress) {
	const cl_event *event_list = (const cl_event *)(intptr_t)event_listAddress;
	clWaitForEventsPROC clWaitForEvents = (clWaitForEventsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clWaitForEvents(num_events, event_list);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetEventInfo(JNIEnv *__env, jclass clazz, jlong eventAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_event event = (cl_event)(intptr_t)eventAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetEventInfoPROC clGetEventInfo = (clGetEventInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetEventInfo(event, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclRetainEvent(JNIEnv *__env, jclass clazz, jlong eventAddress, jlong __functionAddress) {
	cl_event event = (cl_event)(intptr_t)eventAddress;
	clRetainEventPROC clRetainEvent = (clRetainEventPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clRetainEvent(event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclReleaseEvent(JNIEnv *__env, jclass clazz, jlong eventAddress, jlong __functionAddress) {
	cl_event event = (cl_event)(intptr_t)eventAddress;
	clReleaseEventPROC clReleaseEvent = (clReleaseEventPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clReleaseEvent(event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueMarker(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueMarkerPROC clEnqueueMarker = (clEnqueueMarkerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueMarker(command_queue, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueBarrier(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	clEnqueueBarrierPROC clEnqueueBarrier = (clEnqueueBarrierPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueBarrier(command_queue);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclEnqueueWaitForEvents(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_events, jlong event_listAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	const cl_event *event_list = (const cl_event *)(intptr_t)event_listAddress;
	clEnqueueWaitForEventsPROC clEnqueueWaitForEvents = (clEnqueueWaitForEventsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueWaitForEvents(command_queue, num_events, event_list);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclGetEventProfilingInfo(JNIEnv *__env, jclass clazz, jlong eventAddress, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_event event = (cl_event)(intptr_t)eventAddress;
	void *param_value = (void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetEventProfilingInfoPROC clGetEventProfilingInfo = (clGetEventProfilingInfoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clGetEventProfilingInfo(event, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclFlush(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	clFlushPROC clFlush = (clFlushPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clFlush(command_queue);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL10_nclFinish(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	clFinishPROC clFinish = (clFinishPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clFinish(command_queue);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL10_nclGetExtensionFunctionAddress(JNIEnv *__env, jclass clazz, jlong funcnameAddress, jlong __functionAddress) {
	const cl_char *funcname = (const cl_char *)(intptr_t)funcnameAddress;
	clGetExtensionFunctionAddressPROC clGetExtensionFunctionAddress = (clGetExtensionFunctionAddressPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)clGetExtensionFunctionAddress(funcname);
}

EXTERN_C_EXIT
