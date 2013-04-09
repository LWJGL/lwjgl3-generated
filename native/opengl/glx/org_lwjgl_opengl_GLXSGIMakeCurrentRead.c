/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "GLX.h"

typedef Bool (APIENTRY *glXMakeCurrentReadSGIPROC) (Display *, GLXDrawable, GLXDrawable, GLXContext);
typedef GLXDrawable (APIENTRY *glXGetCurrentReadDrawableSGIPROC) ();

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGIMakeCurrentRead_nglXMakeCurrentReadSGI(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress, jlong readAddress, jlong ctxAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	GLXDrawable read = (GLXDrawable)(intptr_t)readAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	glXMakeCurrentReadSGIPROC glXMakeCurrentReadSGI = (glXMakeCurrentReadSGIPROC)(intptr_t)__functionAddress;
	return (jint)glXMakeCurrentReadSGI(display, draw, read, ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXSGIMakeCurrentRead_nglXGetCurrentReadDrawableSGI(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glXGetCurrentReadDrawableSGIPROC glXGetCurrentReadDrawableSGI = (glXGetCurrentReadDrawableSGIPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetCurrentReadDrawableSGI();
}