/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glDispatchComputeGroupSizeARBPROC) (GLuint, GLuint, GLuint, GLuint, GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBComputeVariableGroupSize_nglDispatchComputeGroupSizeARB(JNIEnv *__env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z, jint group_size_x, jint group_size_y, jint group_size_z, jlong __functionAddress) {
	glDispatchComputeGroupSizeARBPROC glDispatchComputeGroupSizeARB = (glDispatchComputeGroupSizeARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDispatchComputeGroupSizeARB(num_groups_x, num_groups_y, num_groups_z, group_size_x, group_size_y, group_size_z);
}

EXTERN_C_EXIT
