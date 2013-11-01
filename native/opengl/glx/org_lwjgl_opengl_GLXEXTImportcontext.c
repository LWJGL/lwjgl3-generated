/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef Display * (APIENTRY *glXGetCurrentDisplayEXTPROC) (void);
typedef int (APIENTRY *glXQueryContextInfoEXTPROC) (Display *, GLXContext, int, int *);
typedef GLXContextID (APIENTRY *glXGetContextIDEXTPROC) (const GLXContext);
typedef GLXContext (APIENTRY *glXImportContextEXTPROC) (Display *, GLXContextID);
typedef void (APIENTRY *glXFreeContextEXTPROC) (Display *, GLXContext);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXEXTImportContext_nglXGetCurrentDisplayEXT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glXGetCurrentDisplayEXTPROC glXGetCurrentDisplayEXT = (glXGetCurrentDisplayEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXGetCurrentDisplayEXT();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXEXTImportContext_nglXQueryContextInfoEXT(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong contextAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext context = (GLXContext)(intptr_t)contextAddress;
	int *value = (int *)(intptr_t)valueAddress;
	glXQueryContextInfoEXTPROC glXQueryContextInfoEXT = (glXQueryContextInfoEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXQueryContextInfoEXT(display, context, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXEXTImportContext_nglXGetContextIDEXT(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong __functionAddress) {
	const GLXContext context = (const GLXContext)(intptr_t)contextAddress;
	glXGetContextIDEXTPROC glXGetContextIDEXT = (glXGetContextIDEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glXGetContextIDEXT(context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXEXTImportContext_nglXImportContextEXT(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong contextID, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	glXImportContextEXTPROC glXImportContextEXT = (glXImportContextEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXImportContextEXT(display, (GLXContextID)contextID);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXEXTImportContext_nglXFreeContextEXT(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong contextAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext context = (GLXContext)(intptr_t)contextAddress;
	glXFreeContextEXTPROC glXFreeContextEXT = (glXFreeContextEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glXFreeContextEXT(display, context);
}
