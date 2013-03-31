/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenCL.h"

typedef void * (APIENTRY *clGetExtensionFunctionAddressForPlatformPROC) (cl_platform_id, const cl_char *);
typedef cl_int (APIENTRY *clRetainDevicePROC) (cl_device_id);
typedef cl_int (APIENTRY *clReleaseDevicePROC) (cl_device_id);
typedef cl_int (APIENTRY *clCreateSubDevicesPROC) (cl_device_id, const cl_device_partition_property *, cl_uint, cl_device_id *, cl_uint *);
typedef cl_mem (APIENTRY *clCreateImagePROC) (cl_context, cl_mem_flags, const cl_image_format *, const cl_image_desc *, cl_void *, cl_int *);
typedef cl_program (APIENTRY *clCreateProgramWithBuiltInKernelsPROC) (cl_context, cl_uint, const cl_device_id *, const cl_char *, cl_int *);
typedef cl_int (APIENTRY *clCompileProgramPROC) (cl_program, cl_uint, const cl_device_id *, const cl_char *, cl_uint, const cl_program *, const cl_char **, cl_program_callback, void *);
typedef cl_program (APIENTRY *clLinkProgramPROC) (cl_context, cl_uint, const cl_device_id *, const cl_char *, cl_uint, const cl_program *, cl_program_callback, void *);
typedef cl_int (APIENTRY *clUnloadPlatformCompilerPROC) (cl_platform_id);
typedef cl_int (APIENTRY *clGetKernelArgInfoPROC) (cl_kernel, cl_uint, cl_kernel_arg_info, size_t, cl_void *, size_t *);
typedef cl_int (APIENTRY *clEnqueueFillBufferPROC) (cl_command_queue, cl_mem, const cl_void *, size_t, size_t, size_t, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueFillImagePROC) (cl_command_queue, cl_mem, const cl_void *, const size_t *, const size_t *, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueMigrateMemObjectsPROC) (cl_command_queue, cl_uint, const cl_mem *, cl_mem_migration_flags, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueMarkerWithWaitListPROC) (cl_command_queue, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueBarrierWithWaitListPROC) (cl_command_queue, cl_uint, const cl_event *, cl_event *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL12_nclGetExtensionFunctionAddressForPlatform(JNIEnv *__env, jclass clazz, jlong platformAddress, jlong func_nameAddress, jlong __functionAddress) {
	cl_platform_id platform = (cl_platform_id)(intptr_t)platformAddress;
	const cl_char *func_name = (const cl_char *)(intptr_t)func_nameAddress;
	clGetExtensionFunctionAddressForPlatformPROC clGetExtensionFunctionAddressForPlatform = (clGetExtensionFunctionAddressForPlatformPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)clGetExtensionFunctionAddressForPlatform(platform, func_name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclRetainDevice(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong __functionAddress) {
	cl_device_id device = (cl_device_id)(intptr_t)deviceAddress;
	clRetainDevicePROC clRetainDevice = (clRetainDevicePROC)(intptr_t)__functionAddress;
	return (jint)clRetainDevice(device);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclReleaseDevice(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong __functionAddress) {
	cl_device_id device = (cl_device_id)(intptr_t)deviceAddress;
	clReleaseDevicePROC clReleaseDevice = (clReleaseDevicePROC)(intptr_t)__functionAddress;
	return (jint)clReleaseDevice(device);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclCreateSubDevices(JNIEnv *__env, jclass clazz, jlong in_deviceAddress, jlong propertiesAddress, jint num_devices, jlong out_devicesAddress, jlong num_devices_retAddress, jlong __functionAddress) {
	cl_device_id in_device = (cl_device_id)(intptr_t)in_deviceAddress;
	const cl_device_partition_property *properties = (const cl_device_partition_property *)(intptr_t)propertiesAddress;
	cl_device_id *out_devices = (cl_device_id *)(intptr_t)out_devicesAddress;
	cl_uint *num_devices_ret = (cl_uint *)(intptr_t)num_devices_retAddress;
	clCreateSubDevicesPROC clCreateSubDevices = (clCreateSubDevicesPROC)(intptr_t)__functionAddress;
	return (jint)clCreateSubDevices(in_device, properties, num_devices, out_devices, num_devices_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL12_nclCreateImage(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong flags, jlong image_formatAddress, jlong image_descAddress, jlong host_ptrAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_image_format *image_format = (const cl_image_format *)(intptr_t)image_formatAddress;
	const cl_image_desc *image_desc = (const cl_image_desc *)(intptr_t)image_descAddress;
	cl_void *host_ptr = (cl_void *)(intptr_t)host_ptrAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateImagePROC clCreateImage = (clCreateImagePROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)clCreateImage(context, flags, image_format, image_desc, host_ptr, errcode_ret);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL12_nclCreateProgramWithBuiltInKernels(JNIEnv *__env, jclass clazz, jlong contextAddress, jint num_devices, jlong device_listAddress, jlong kernel_namesAddress, jlong errcode_retAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_device_id *device_list = (const cl_device_id *)(intptr_t)device_listAddress;
	const cl_char *kernel_names = (const cl_char *)(intptr_t)kernel_namesAddress;
	cl_int *errcode_ret = (cl_int *)(intptr_t)errcode_retAddress;
	clCreateProgramWithBuiltInKernelsPROC clCreateProgramWithBuiltInKernels = (clCreateProgramWithBuiltInKernelsPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)clCreateProgramWithBuiltInKernels(context, num_devices, device_list, kernel_names, errcode_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclCompileProgram(JNIEnv *__env, jclass clazz, jlong programAddress, jint num_devices, jlong device_listAddress, jlong optionsAddress, jint num_input_headers, jlong input_headersAddress, jlong header_include_namesAddress, jlong pfn_notifyAddress, jlong user_dataAddress, jlong __functionAddress) {
	cl_program program = (cl_program)(intptr_t)programAddress;
	const cl_device_id *device_list = (const cl_device_id *)(intptr_t)device_listAddress;
	const cl_char *options = (const cl_char *)(intptr_t)optionsAddress;
	const cl_program *input_headers = (const cl_program *)(intptr_t)input_headersAddress;
	const cl_char **header_include_names = (const cl_char **)(intptr_t)header_include_namesAddress;
	cl_program_callback pfn_notify = (cl_program_callback)(intptr_t)pfn_notifyAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	clCompileProgramPROC clCompileProgram = (clCompileProgramPROC)(intptr_t)__functionAddress;
	return (jint)clCompileProgram(program, num_devices, device_list, options, num_input_headers, input_headers, header_include_names, pfn_notify, user_data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CL12_nclLinkProgram(JNIEnv *__env, jclass clazz, jlong contextAddress, jint num_devices, jlong device_listAddress, jlong optionsAddress, jint num_input_programs, jlong input_programsAddress, jlong pfn_notifyAddress, jlong user_dataAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const cl_device_id *device_list = (const cl_device_id *)(intptr_t)device_listAddress;
	const cl_char *options = (const cl_char *)(intptr_t)optionsAddress;
	const cl_program *input_programs = (const cl_program *)(intptr_t)input_programsAddress;
	cl_program_callback pfn_notify = (cl_program_callback)(intptr_t)pfn_notifyAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	clLinkProgramPROC clLinkProgram = (clLinkProgramPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)clLinkProgram(context, num_devices, device_list, options, num_input_programs, input_programs, pfn_notify, user_data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclUnloadPlatformCompiler(JNIEnv *__env, jclass clazz, jlong platformAddress, jlong __functionAddress) {
	cl_platform_id platform = (cl_platform_id)(intptr_t)platformAddress;
	clUnloadPlatformCompilerPROC clUnloadPlatformCompiler = (clUnloadPlatformCompilerPROC)(intptr_t)__functionAddress;
	return (jint)clUnloadPlatformCompiler(platform);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclGetKernelArgInfo(JNIEnv *__env, jclass clazz, jlong kernelAddress, jint arg_indx, jint param_name, jlong param_value_size, jlong param_valueAddress, jlong param_value_size_retAddress, jlong __functionAddress) {
	cl_kernel kernel = (cl_kernel)(intptr_t)kernelAddress;
	cl_void *param_value = (cl_void *)(intptr_t)param_valueAddress;
	size_t *param_value_size_ret = (size_t *)(intptr_t)param_value_size_retAddress;
	clGetKernelArgInfoPROC clGetKernelArgInfo = (clGetKernelArgInfoPROC)(intptr_t)__functionAddress;
	return (jint)clGetKernelArgInfo(kernel, arg_indx, param_name, (size_t)param_value_size, param_value, param_value_size_ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclEnqueueFillBuffer(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong bufferAddress, jlong patternAddress, jlong pattern_size, jlong offset, jlong size, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem buffer = (cl_mem)(intptr_t)bufferAddress;
	const cl_void *pattern = (const cl_void *)(intptr_t)patternAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueFillBufferPROC clEnqueueFillBuffer = (clEnqueueFillBufferPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueFillBuffer(command_queue, buffer, pattern, (size_t)pattern_size, (size_t)offset, (size_t)size, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclEnqueueFillImage(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong imageAddress, jlong fill_colorAddress, jlong originAddress, jlong regionAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem image = (cl_mem)(intptr_t)imageAddress;
	const cl_void *fill_color = (const cl_void *)(intptr_t)fill_colorAddress;
	const size_t *origin = (const size_t *)(intptr_t)originAddress;
	const size_t *region = (const size_t *)(intptr_t)regionAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueFillImagePROC clEnqueueFillImage = (clEnqueueFillImagePROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueFillImage(command_queue, image, fill_color, origin, region, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclEnqueueMigrateMemObjects(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_mem_objects, jlong mem_objectsAddress, jlong flags, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	const cl_mem *mem_objects = (const cl_mem *)(intptr_t)mem_objectsAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueMigrateMemObjectsPROC clEnqueueMigrateMemObjects = (clEnqueueMigrateMemObjectsPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueMigrateMemObjects(command_queue, num_mem_objects, mem_objects, flags, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclEnqueueMarkerWithWaitList(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueMarkerWithWaitListPROC clEnqueueMarkerWithWaitList = (clEnqueueMarkerWithWaitListPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueMarkerWithWaitList(command_queue, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_CL12_nclEnqueueBarrierWithWaitList(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueBarrierWithWaitListPROC clEnqueueBarrierWithWaitList = (clEnqueueBarrierWithWaitListPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueBarrierWithWaitList(command_queue, num_events_in_wait_list, event_wait_list, event);
}