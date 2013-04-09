/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "GLX.h"

typedef GLint (APIENTRY *glXGetVideoSyncSGIPROC) (GLuint *);
typedef GLint (APIENTRY *glXWaitVideoSyncSGIPROC) (GLint, GLint, GLuint *);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGIVideoSync_nglXGetVideoSyncSGI(JNIEnv *__env, jclass clazz, jlong countAddress, jlong __functionAddress) {
	GLuint *count = (GLuint *)(intptr_t)countAddress;
	glXGetVideoSyncSGIPROC glXGetVideoSyncSGI = (glXGetVideoSyncSGIPROC)(intptr_t)__functionAddress;
	return (jint)glXGetVideoSyncSGI(count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGIVideoSync_nglXWaitVideoSyncSGI(JNIEnv *__env, jclass clazz, jint divisor, jint remainder, jlong countAddress, jlong __functionAddress) {
	GLuint *count = (GLuint *)(intptr_t)countAddress;
	glXWaitVideoSyncSGIPROC glXWaitVideoSyncSGI = (glXWaitVideoSyncSGIPROC)(intptr_t)__functionAddress;
	return (jint)glXWaitVideoSyncSGI(divisor, remainder, count);
}