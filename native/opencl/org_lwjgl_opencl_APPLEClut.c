/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_int (APIENTRY *clCreateContextAndCommandQueueAPPLEPROC) (const cl_context_properties *, cl_uint, const cl_device_id *, cl_create_context_callback, void *, cl_command_queue_properties, cl_context *, cl_command_queue *);
typedef cl_int (APIENTRY *clCreateProgramAndKernelsWithSourceAPPLEPROC) (cl_context, cl_uint, const char **, const size_t *, cl_uint, const cl_device_id *, const char *, cl_uint, const cl_char **, cl_program *, cl_kernel *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_APPLECLUT_nclCreateContextAndCommandQueueAPPLE(JNIEnv *__env, jclass clazz, jlong propertiesAddress, jint num_devices, jlong devicesAddress, jlong pfn_notifyAddress, jlong user_dataAddress, jlong queue_properties, jlong contextAddress, jlong queuesAddress, jlong __functionAddress) {
	const cl_context_properties *properties = (const cl_context_properties *)(intptr_t)propertiesAddress;
	const cl_device_id *devices = (const cl_device_id *)(intptr_t)devicesAddress;
	cl_create_context_callback pfn_notify = (cl_create_context_callback)(intptr_t)pfn_notifyAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	cl_context *context = (cl_context *)(intptr_t)contextAddress;
	cl_command_queue *queues = (cl_command_queue *)(intptr_t)queuesAddress;
	clCreateContextAndCommandQueueAPPLEPROC clCreateContextAndCommandQueueAPPLE = (clCreateContextAndCommandQueueAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clCreateContextAndCommandQueueAPPLE(properties, num_devices, devices, pfn_notify, user_data, queue_properties, context, queues);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_APPLECLUT_nclCreateProgramAndKernelsWithSourceAPPLE(JNIEnv *__env, jclass clazz, jlong contextAddress, jint count, jlong program_source_stringsAddress, jlong program_source_lengthsAddress, jint num_devices, jlong device_listAddress, jlong optionsAddress, jint num_kernels, jlong kernel_name_stringsAddress, jlong programAddress, jlong kernelsAddress, jlong __functionAddress) {
	cl_context context = (cl_context)(intptr_t)contextAddress;
	const char **program_source_strings = (const char **)(intptr_t)program_source_stringsAddress;
	const size_t *program_source_lengths = (const size_t *)(intptr_t)program_source_lengthsAddress;
	const cl_device_id *device_list = (const cl_device_id *)(intptr_t)device_listAddress;
	const char *options = (const char *)(intptr_t)optionsAddress;
	const cl_char **kernel_name_strings = (const cl_char **)(intptr_t)kernel_name_stringsAddress;
	cl_program *program = (cl_program *)(intptr_t)programAddress;
	cl_kernel *kernels = (cl_kernel *)(intptr_t)kernelsAddress;
	clCreateProgramAndKernelsWithSourceAPPLEPROC clCreateProgramAndKernelsWithSourceAPPLE = (clCreateProgramAndKernelsWithSourceAPPLEPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clCreateProgramAndKernelsWithSourceAPPLE(context, count, program_source_strings, program_source_lengths, num_devices, device_list, options, num_kernels, kernel_name_strings, program, kernels);
}

EXTERN_C_EXIT
