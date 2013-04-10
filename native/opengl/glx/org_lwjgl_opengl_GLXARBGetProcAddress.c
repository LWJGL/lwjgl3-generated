/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"
#include <GL/glx.h>

typedef void * (APIENTRY *glXGetProcAddressARBPROC) (const GLubyte *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXARBGetProcAddress_nglXGetProcAddressARB(JNIEnv *__env, jclass clazz, jlong procNameAddress, jlong __functionAddress) {
	const GLubyte *procName = (const GLubyte *)(intptr_t)procNameAddress;
	glXGetProcAddressARBPROC glXGetProcAddressARB = (glXGetProcAddressARBPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetProcAddressARB(procName);
}