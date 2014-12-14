/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenCL.h"

typedef cl_int (APIENTRY *clEnqueueMigrateMemObjectEXTPROC) (cl_command_queue, cl_uint, const cl_mem *, cl_mem_migration_flags_ext, cl_uint, const cl_event *, cl_event *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_EXTMigrateMemobject_nclEnqueueMigrateMemObjectEXT(JNIEnv *__env, jclass clazz, jlong command_queueAddress, jint num_mem_objects, jlong mem_objectsAddress, jlong flags, jint num_events_in_wait_list, jlong event_wait_listAddress, jlong eventAddress, jlong __functionAddress) {
	cl_command_queue command_queue = (cl_command_queue)(intptr_t)command_queueAddress;
	const cl_mem *mem_objects = (const cl_mem *)(intptr_t)mem_objectsAddress;
	const cl_event *event_wait_list = (const cl_event *)(intptr_t)event_wait_listAddress;
	cl_event *event = (cl_event *)(intptr_t)eventAddress;
	clEnqueueMigrateMemObjectEXTPROC clEnqueueMigrateMemObjectEXT = (clEnqueueMigrateMemObjectEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)clEnqueueMigrateMemObjectEXT(command_queue, num_mem_objects, mem_objects, flags, num_events_in_wait_list, event_wait_list, event);
}

EXTERN_C_EXIT
