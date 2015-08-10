/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glMaxShaderCompilerThreadsARBPROC) (GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBParallelShaderCompile_nglMaxShaderCompilerThreadsARB(JNIEnv *__env, jclass clazz, jint count, jlong __functionAddress) {
	glMaxShaderCompilerThreadsARBPROC glMaxShaderCompilerThreadsARB = (glMaxShaderCompilerThreadsARBPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMaxShaderCompilerThreadsARB(count);
}

EXTERN_C_EXIT
