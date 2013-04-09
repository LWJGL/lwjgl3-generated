/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "GLX.h"

typedef GLXFBConfig * (APIENTRY *glXGetFBConfigsPROC) (Display *, int, int *);
typedef GLXFBConfig * (APIENTRY *glXChooseFBConfigPROC) (Display *, int, const int *, int *);
typedef int (APIENTRY *glXGetFBConfigAttribPROC) (Display *, GLXFBConfig, int, int *);
typedef XVisualInfo * (APIENTRY *glXGetVisualFromFBConfigPROC) (Display *, GLXFBConfig);
typedef GLXWindow (APIENTRY *glXCreateWindowPROC) (Display *, GLXFBConfig, Window, const int *);
typedef GLXPixmap (APIENTRY *glXCreatePixmapPROC) (Display *, GLXFBConfig, Pixmap, const int *);
typedef void (APIENTRY *glXDestroyPixmapPROC) (Display *, GLXPixmap);
typedef GLXPbuffer (APIENTRY *glXCreatePbufferPROC) (Display *, GLXFBConfig, const int *);
typedef void (APIENTRY *glXDestroyPbufferPROC) (Display *, GLXPbuffer);
typedef void (APIENTRY *glXQueryDrawablePROC) (Display *, GLXDrawable, int, unsigned int *);
typedef GLXContext (APIENTRY *glXCreateNewContextPROC) (Display *, GLXFBConfig, int, GLXContext, Bool);
typedef Bool (APIENTRY *glXMakeContextCurrentPROC) (Display *, GLXDrawable, GLXDrawable, GLXContext);
typedef GLXDrawable (APIENTRY *glXGetCurrentReadDrawablePROC) (void);
typedef int (APIENTRY *glXQueryContextPROC) (Display *, GLXContext, int, int *);
typedef void (APIENTRY *glXSelectEventPROC) (Display *, GLXDrawable, unsigned long);
typedef void (APIENTRY *glXGetSelectedEventPROC) (Display *, GLXDrawable, unsigned long *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX13_nglXGetFBConfigs(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong nelementsAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *nelements = (int *)(intptr_t)nelementsAddress;
	glXGetFBConfigsPROC glXGetFBConfigs = (glXGetFBConfigsPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetFBConfigs(display, screen, nelements);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX13_nglXChooseFBConfig(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen, jlong attrib_listAddress, jlong nelementsAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	const int *attrib_list = (const int *)(intptr_t)attrib_listAddress;
	int *nelements = (int *)(intptr_t)nelementsAddress;
	glXChooseFBConfigPROC glXChooseFBConfig = (glXChooseFBConfigPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXChooseFBConfig(display, screen, attrib_list, nelements);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLX13_nglXGetFBConfigAttrib(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	int *value = (int *)(intptr_t)valueAddress;
	glXGetFBConfigAttribPROC glXGetFBConfigAttrib = (glXGetFBConfigAttribPROC)(intptr_t)__functionAddress;
	return (jint)glXGetFBConfigAttrib(display, config, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX13_nglXGetVisualFromFBConfig(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	glXGetVisualFromFBConfigPROC glXGetVisualFromFBConfig = (glXGetVisualFromFBConfigPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetVisualFromFBConfig(display, config);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX13_nglXCreateWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jlong win, jlong attrib_listAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	const int *attrib_list = (const int *)(intptr_t)attrib_listAddress;
	glXCreateWindowPROC glXCreateWindow = (glXCreateWindowPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXCreateWindow(display, config, (Window)win, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX13_nglXCreatePixmap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jlong pixmap, jlong attrib_listAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	const int *attrib_list = (const int *)(intptr_t)attrib_listAddress;
	glXCreatePixmapPROC glXCreatePixmap = (glXCreatePixmapPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXCreatePixmap(display, config, (Pixmap)pixmap, attrib_list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLX13_nglXDestroyPixmap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong pixmapAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXPixmap pixmap = (GLXPixmap)(intptr_t)pixmapAddress;
	glXDestroyPixmapPROC glXDestroyPixmap = (glXDestroyPixmapPROC)(intptr_t)__functionAddress;
	glXDestroyPixmap(display, pixmap);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX13_nglXCreatePbuffer(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jlong attrib_listAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	const int *attrib_list = (const int *)(intptr_t)attrib_listAddress;
	glXCreatePbufferPROC glXCreatePbuffer = (glXCreatePbufferPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXCreatePbuffer(display, config, attrib_list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLX13_nglXDestroyPbuffer(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong pbufAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXPbuffer pbuf = (GLXPbuffer)(intptr_t)pbufAddress;
	glXDestroyPbufferPROC glXDestroyPbuffer = (glXDestroyPbufferPROC)(intptr_t)__functionAddress;
	glXDestroyPbuffer(display, pbuf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLX13_nglXQueryDrawable(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	unsigned int *value = (unsigned int *)(intptr_t)valueAddress;
	glXQueryDrawablePROC glXQueryDrawable = (glXQueryDrawablePROC)(intptr_t)__functionAddress;
	glXQueryDrawable(display, draw, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX13_nglXCreateNewContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong configAddress, jint render_type, jlong share_listAddress, jint direct, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXFBConfig config = (GLXFBConfig)(intptr_t)configAddress;
	GLXContext share_list = (GLXContext)(intptr_t)share_listAddress;
	glXCreateNewContextPROC glXCreateNewContext = (glXCreateNewContextPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXCreateNewContext(display, config, render_type, share_list, direct);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLX13_nglXMakeContextCurrent(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress, jlong readAddress, jlong ctxAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	GLXDrawable read = (GLXDrawable)(intptr_t)readAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	glXMakeContextCurrentPROC glXMakeContextCurrent = (glXMakeContextCurrentPROC)(intptr_t)__functionAddress;
	return (jint)glXMakeContextCurrent(display, draw, read, ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX13_nglXGetCurrentReadDrawable(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glXGetCurrentReadDrawablePROC glXGetCurrentReadDrawable = (glXGetCurrentReadDrawablePROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetCurrentReadDrawable();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GLX13_nglXQueryContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong ctxAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXContext ctx = (GLXContext)(intptr_t)ctxAddress;
	int *value = (int *)(intptr_t)valueAddress;
	glXQueryContextPROC glXQueryContext = (glXQueryContextPROC)(intptr_t)__functionAddress;
	return (jint)glXQueryContext(display, ctx, attribute, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLX13_nglXSelectEvent(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress, jlong event_mask, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	glXSelectEventPROC glXSelectEvent = (glXSelectEventPROC)(intptr_t)__functionAddress;
	glXSelectEvent(display, draw, (unsigned long)event_mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLX13_nglXGetSelectedEvent(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawAddress, jlong event_maskAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable draw = (GLXDrawable)(intptr_t)drawAddress;
	unsigned long *event_mask = (unsigned long *)(intptr_t)event_maskAddress;
	glXGetSelectedEventPROC glXGetSelectedEvent = (glXGetSelectedEventPROC)(intptr_t)__functionAddress;
	glXGetSelectedEvent(display, draw, event_mask);
}