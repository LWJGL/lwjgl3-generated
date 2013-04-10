/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef const char * (APIENTRY *glXQueryExtensionsStringPROC) (Display *, int);
typedef const char * (APIENTRY *glXGetClientStringPROC) (Display *, int);
typedef const char * (APIENTRY *glXQueryServerStringPROC) (Display *, int, int);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX11_nglXQueryExtensionsString(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	glXQueryExtensionsStringPROC glXQueryExtensionsString = (glXQueryExtensionsStringPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXQueryExtensionsString(display, screen);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX11_nglXGetClientString(JNIEnv *__env, jclass clazz, jlong displayAddress, jint name, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	glXGetClientStringPROC glXGetClientString = (glXGetClientStringPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetClientString(display, name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX11_nglXQueryServerString(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jint name, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	glXQueryServerStringPROC glXQueryServerString = (glXQueryServerStringPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXQueryServerString(display, screen, name);
}