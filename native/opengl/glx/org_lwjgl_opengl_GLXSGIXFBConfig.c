/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef int (APIENTRY *glXGetFBConfigAttribSGIXPROC) (Display *, GLXFBConfigSGIX, int, int *);
typedef GLXFBConfigSGIX * (APIENTRY *glXChooseFBConfigSGIXPROC) (Display *, int, const int *, int *);
typedef GLXPixmap (APIENTRY *glXCreateGLXPixmapWithConfigSGIXPROC) (Display *, GLXFBConfig, Pixmap);
typedef GLXContext (APIENTRY *glXCreateContextWithConfigSGIXPROC) (Display *, GLXFBConfig, int, GLXContext, Bool);
typedef XVisualInfo * (APIENTRY *glXGetVisualFromFBConfigSGIXPROC) (Display *, GLXFBConfig);
typedef GLXFBConfigSGIX (APIENTRY *glXGetFBConfigFromVisualSGIXPROC) (Display *, XVisualInfo *);

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLXSGIXFBConfig_nglXGetFBConfigAttribSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfigSGIX config = (GLXFBConfigSGIX)(intptr_t)configAddress;
	int *value = (int *)(intptr_t)valueAddress;
	glXGetFBConfigAttribSGIXPROC glXGetFBConfigAttribSGIX = (glXGetFBConfigAttribSGIXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glXGetFBConfigAttribSGIX(display, config, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXSGIXFBConfig_nglXChooseFBConfigSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong attrib_listAddress, jlong nelementsAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	const int *attrib_list = (const int *)(intptr_t)attrib_listAddress;
	int *nelements = (int *)(intptr_t)nelementsAddress;
	glXChooseFBConfigSGIXPROC glXChooseFBConfigSGIX = (glXChooseFBConfigSGIXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXChooseFBConfigSGIX(display, screen, attrib_list, nelements);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXSGIXFBConfig_nglXCreateGLXPixmapWithConfigSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jlong pixmap, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	glXCreateGLXPixmapWithConfigSGIXPROC glXCreateGLXPixmapWithConfigSGIX = (glXCreateGLXPixmapWithConfigSGIXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXCreateGLXPixmapWithConfigSGIX(display, config, (Pixmap)pixmap);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXSGIXFBConfig_nglXCreateContextWithConfigSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jint render_type, jlong share_listAddress, jint direct, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	GLXContext share_list = (GLXContext)(intptr_t)share_listAddress;
	glXCreateContextWithConfigSGIXPROC glXCreateContextWithConfigSGIX = (glXCreateContextWithConfigSGIXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXCreateContextWithConfigSGIX(display, config, render_type, share_list, direct);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXSGIXFBConfig_nglXGetVisualFromFBConfigSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	glXGetVisualFromFBConfigSGIXPROC glXGetVisualFromFBConfigSGIX = (glXGetVisualFromFBConfigSGIXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXGetVisualFromFBConfigSGIX(display, config);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLXSGIXFBConfig_nglXGetFBConfigFromVisualSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong visAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XVisualInfo *vis = (XVisualInfo *)(intptr_t)visAddress;
	glXGetFBConfigFromVisualSGIXPROC glXGetFBConfigFromVisualSGIX = (glXGetFBConfigFromVisualSGIXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glXGetFBConfigFromVisualSGIX(display, vis);
}
