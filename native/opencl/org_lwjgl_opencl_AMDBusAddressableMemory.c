/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_int (APIENTRY *clEnqueueWaitSignalAMDPROC) (cl_command_queue, cl_mem, cl_uint, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueWriteSignalAMDPROC) (cl_command_queue, cl_mem, cl_uint, cl_ulong, cl_uint, const cl_event *, cl_event *);
typedef cl_int (APIENTRY *clEnqueueMakeBuffersResidentAMDPROC) (cl_command_queue, cl_uint, cl_mem *, cl_bool, cl_bus_address_amd *, cl_uint, const cl_event *, cl_event *);

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_AMDBusAddressableMemory_nclEnqueueWaitSignalAMD(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong mem_objectAddress, jint value, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem mem_object = (cl_mem)(intptr_t)mem_objectAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueWaitSignalAMDPROC clEnqueueWaitSignalAMD = (clEnqueueWaitSignalAMDPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueWaitSignalAMD(command_queue, mem_object, value, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_AMDBusAddressableMemory_nclEnqueueWriteSignalAMD(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jlong mem_objectAddress, jint value, jlong offset, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem mem_object = (cl_mem)(intptr_t)mem_objectAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueWriteSignalAMDPROC clEnqueueWriteSignalAMD = (clEnqueueWriteSignalAMDPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueWriteSignalAMD(command_queue, mem_object, value, offset, num_events_in_wait_list, event_wait_list, event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_AMDBusAddressableMemory_nclEnqueueMakeBuffersResidentAMD(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_mem_objs, jlong mem_objectsAddress, jint blocking_make_resident, jlong bus_addressesAddress, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	cl_mem *mem_objects = (cl_mem *)(intptr_t)mem_objectsAddress;
	cl_bus_address_amd *bus_addresses = (cl_bus_address_amd *)(intptr_t)bus_addressesAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueMakeBuffersResidentAMDPROC clEnqueueMakeBuffersResidentAMD = (clEnqueueMakeBuffersResidentAMDPROC)(intptr_t)__functionAddress;
	return (jint)clEnqueueMakeBuffersResidentAMD(command_queue, num_mem_objs, mem_objects, blocking_make_resident, bus_addresses, num_events_in_wait_list, event_wait_list, event);
}