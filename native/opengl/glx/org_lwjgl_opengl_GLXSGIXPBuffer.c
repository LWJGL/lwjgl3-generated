/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef GLXPbuffer (APIENTRY *glXCreateGLXPbufferSGIXPROC) (Display *, GLXFBConfig, unsigned int, unsigned int, int *);
typedef void (APIENTRY *glXDestroyGLXPbufferSGIXPROC) (Display *, GLXPbuffer);
typedef void (APIENTRY *glXQueryGLXPbufferSGIXPROC) (Display *, GLXPbuffer, int, unsigned int *);
typedef void (APIENTRY *glXSelectEventSGIXPROC) (Display *, GLXDrawable, unsigned long);
typedef void (APIENTRY *glXGetSelectedEventSGIXPROC) (Display *, GLXDrawable, unsigned long *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXSGIXPBuffer_nglXCreateGLXPbufferSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jint width, jint height, jlong attrib_listAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	int *attrib_list = (int *)(intptr_t)attrib_listAddress;
	glXCreateGLXPbufferSGIXPROC glXCreateGLXPbufferSGIX = (glXCreateGLXPbufferSGIXPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXCreateGLXPbufferSGIX(display, config, width, height, attrib_list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXSGIXPBuffer_nglXDestroyGLXPbufferSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong pbufAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXPbuffer pbuf = (GLXPbuffer)(intptr_t)pbufAddress;
	glXDestroyGLXPbufferSGIXPROC glXDestroyGLXPbufferSGIX = (glXDestroyGLXPbufferSGIXPROC)(intptr_t)__functionAddress;
	glXDestroyGLXPbufferSGIX(display, pbuf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXSGIXPBuffer_nglXQueryGLXPbufferSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong pbufAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXPbuffer pbuf = (GLXPbuffer)(intptr_t)pbufAddress;
	unsigned int *value = (unsigned int *)(intptr_t)valueAddress;
	glXQueryGLXPbufferSGIXPROC glXQueryGLXPbufferSGIX = (glXQueryGLXPbufferSGIXPROC)(intptr_t)__functionAddress;
	glXQueryGLXPbufferSGIX(display, pbuf, attribute, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXSGIXPBuffer_nglXSelectEventSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jlong mask, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	glXSelectEventSGIXPROC glXSelectEventSGIX = (glXSelectEventSGIXPROC)(intptr_t)__functionAddress;
	glXSelectEventSGIX(display, drawable, (unsigned long)mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXSGIXPBuffer_nglXGetSelectedEventSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jlong maskAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	unsigned long *mask = (unsigned long *)(intptr_t)maskAddress;
	glXGetSelectedEventSGIXPROC glXGetSelectedEventSGIX = (glXGetSelectedEventSGIXPROC)(intptr_t)__functionAddress;
	glXGetSelectedEventSGIX(display, drawable, mask);
}