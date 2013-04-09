/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "GLX.h"

typedef GLXContext (APIENTRY *glXCreateContextAttribsARBPROC) (Display *, GLXFBConfig, GLXContext, Bool, const int *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXARBCreateContext_nglXCreateContextAttribsARB(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jlong share_contextAddress, jint direct, jlong attrib_listAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	GLXContext share_context = (GLXContext)(intptr_t)share_contextAddress;
	const int *attrib_list = (const int *)(intptr_t)attrib_listAddress;
	glXCreateContextAttribsARBPROC glXCreateContextAttribsARB = (glXCreateContextAttribsARBPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXCreateContextAttribsARB(display, config, share_context, direct, attrib_list);
}