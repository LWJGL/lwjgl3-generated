/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef void (APIENTRY *glXBindTexImageEXTPROC) (Display *, GLXDrawable, int, const int *);
typedef void (APIENTRY *glXReleaseTexImageEXTPROC) (Display *, GLXDrawable, int);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXEXTTextureFromPixmap_nglXBindTexImageEXT(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jint buffer, jlong attrib_listAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	const int *attrib_list = (const int *)(intptr_t)attrib_listAddress;
	glXBindTexImageEXTPROC glXBindTexImageEXT = (glXBindTexImageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glXBindTexImageEXT(display, drawable, buffer, attrib_list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXEXTTextureFromPixmap_nglXReleaseTexImageEXT(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jint buffer, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	glXReleaseTexImageEXTPROC glXReleaseTexImageEXT = (glXReleaseTexImageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glXReleaseTexImageEXT(display, drawable, buffer);
}

EXTERN_C_EXIT
