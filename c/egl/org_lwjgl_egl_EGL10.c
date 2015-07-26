/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
ENABLE_WARNINGS()

typedef EGLBoolean (APIENTRY *eglChooseConfigPROC) (EGLDisplay, const EGLint *, EGLConfig *, EGLint, EGLint *);
typedef EGLBoolean (APIENTRY *eglCopyBuffersPROC) (EGLDisplay, EGLSurface, EGLNativePixmapType);
typedef EGLContext (APIENTRY *eglCreateContextPROC) (EGLDisplay, EGLConfig, EGLContext, const EGLint *);
typedef EGLSurface (APIENTRY *eglCreatePbufferSurfacePROC) (EGLDisplay, EGLConfig, const EGLint *);
typedef EGLSurface (APIENTRY *eglCreatePixmapSurfacePROC) (EGLDisplay, EGLConfig, EGLNativePixmapType, const EGLint *);
typedef EGLSurface (APIENTRY *eglCreateWindowSurfacePROC) (EGLDisplay, EGLConfig, EGLNativeWindowType, const EGLint *);
typedef EGLBoolean (APIENTRY *eglDestroyContextPROC) (EGLDisplay, EGLContext);
typedef EGLBoolean (APIENTRY *eglDestroySurfacePROC) (EGLDisplay, EGLSurface);
typedef EGLBoolean (APIENTRY *eglGetConfigAttribPROC) (EGLDisplay, EGLConfig, EGLint, EGLint *);
typedef EGLBoolean (APIENTRY *eglGetConfigsPROC) (EGLDisplay, EGLConfig *, EGLint, EGLint *);
typedef EGLDisplay (APIENTRY *eglGetCurrentDisplayPROC) (void);
typedef EGLSurface (APIENTRY *eglGetCurrentSurfacePROC) (EGLint);
typedef EGLDisplay (APIENTRY *eglGetDisplayPROC) (EGLNativeDisplayType);
typedef EGLint (APIENTRY *eglGetErrorPROC) (void);
typedef __eglMustCastToProperFunctionPointerType (APIENTRY *eglGetProcAddressPROC) (const char *);
typedef EGLBoolean (APIENTRY *eglInitializePROC) (EGLDisplay, EGLint *, EGLint *);
typedef EGLBoolean (APIENTRY *eglMakeCurrentPROC) (EGLDisplay, EGLSurface, EGLSurface, EGLContext);
typedef EGLBoolean (APIENTRY *eglQueryContextPROC) (EGLDisplay, EGLContext, EGLint, EGLint *);
typedef char * (APIENTRY *eglQueryStringPROC) (EGLDisplay, EGLint);
typedef EGLBoolean (APIENTRY *eglQuerySurfacePROC) (EGLDisplay, EGLSurface, EGLint, EGLint *);
typedef EGLBoolean (APIENTRY *eglSwapBuffersPROC) (EGLDisplay, EGLSurface);
typedef EGLBoolean (APIENTRY *eglTerminatePROC) (EGLDisplay);
typedef EGLBoolean (APIENTRY *eglWaitGLPROC) (void);
typedef EGLBoolean (APIENTRY *eglWaitNativePROC) (EGLint);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglChooseConfig(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong attrib_listAddress, jlong configsAddress, jint config_size, jlong num_configAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	EGLConfig *configs = (EGLConfig *)(intptr_t)configsAddress;
	EGLint *num_config = (EGLint *)(intptr_t)num_configAddress;
	eglChooseConfigPROC eglChooseConfig = (eglChooseConfigPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglChooseConfig(dpy, attrib_list, configs, config_size, num_config);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglCopyBuffers(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jlong targetAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	EGLNativePixmapType target = (EGLNativePixmapType)(intptr_t)targetAddress;
	eglCopyBuffersPROC eglCopyBuffers = (eglCopyBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglCopyBuffers(dpy, surface, target);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglCreateContext(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong share_contextAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	EGLContext share_context = (EGLContext)(intptr_t)share_contextAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateContextPROC eglCreateContext = (eglCreateContextPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateContext(dpy, config, share_context, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglCreatePbufferSurface(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreatePbufferSurfacePROC eglCreatePbufferSurface = (eglCreatePbufferSurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreatePbufferSurface(dpy, config, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglCreatePixmapSurface(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong pixmapAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	EGLNativePixmapType pixmap = (EGLNativePixmapType)(intptr_t)pixmapAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreatePixmapSurfacePROC eglCreatePixmapSurface = (eglCreatePixmapSurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreatePixmapSurface(dpy, config, pixmap, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglCreateWindowSurface(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong winAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	EGLNativeWindowType win = (EGLNativeWindowType)(intptr_t)winAddress;
	const EGLint *attrib_list = (const EGLint *)(intptr_t)attrib_listAddress;
	eglCreateWindowSurfacePROC eglCreateWindowSurface = (eglCreateWindowSurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateWindowSurface(dpy, config, win, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglDestroyContext(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong ctxAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLContext ctx = (EGLContext)(intptr_t)ctxAddress;
	eglDestroyContextPROC eglDestroyContext = (eglDestroyContextPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglDestroyContext(dpy, ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglDestroySurface(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	eglDestroySurfacePROC eglDestroySurface = (eglDestroySurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglDestroySurface(dpy, surface);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglGetConfigAttrib(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	EGLint *value = (EGLint *)(intptr_t)valueAddress;
	eglGetConfigAttribPROC eglGetConfigAttrib = (eglGetConfigAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglGetConfigAttrib(dpy, config, attribute, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglGetConfigs(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configsAddress, jint config_size, jlong num_configAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig *configs = (EGLConfig *)(intptr_t)configsAddress;
	EGLint *num_config = (EGLint *)(intptr_t)num_configAddress;
	eglGetConfigsPROC eglGetConfigs = (eglGetConfigsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglGetConfigs(dpy, configs, config_size, num_config);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglGetCurrentDisplay(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglGetCurrentDisplayPROC eglGetCurrentDisplay = (eglGetCurrentDisplayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglGetCurrentDisplay();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglGetCurrentSurface(JNIEnv *__env, jclass clazz, jint readdraw, jlong __functionAddress) {
	eglGetCurrentSurfacePROC eglGetCurrentSurface = (eglGetCurrentSurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglGetCurrentSurface(readdraw);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglGetDisplay(JNIEnv *__env, jclass clazz, jlong display_idAddress, jlong __functionAddress) {
	EGLNativeDisplayType display_id = (EGLNativeDisplayType)(intptr_t)display_idAddress;
	eglGetDisplayPROC eglGetDisplay = (eglGetDisplayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglGetDisplay(display_id);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_EGL10_neglGetError(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglGetErrorPROC eglGetError = (eglGetErrorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)eglGetError();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglGetProcAddress(JNIEnv *__env, jclass clazz, jlong procnameAddress, jlong __functionAddress) {
	const char *procname = (const char *)(intptr_t)procnameAddress;
	eglGetProcAddressPROC eglGetProcAddress = (eglGetProcAddressPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglGetProcAddress(procname);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglInitialize(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong majorAddress, jlong minorAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLint *major = (EGLint *)(intptr_t)majorAddress;
	EGLint *minor = (EGLint *)(intptr_t)minorAddress;
	eglInitializePROC eglInitialize = (eglInitializePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglInitialize(dpy, major, minor);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglMakeCurrent(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong drawAddress, jlong readAddress, jlong ctxAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface draw = (EGLSurface)(intptr_t)drawAddress;
	EGLSurface read = (EGLSurface)(intptr_t)readAddress;
	EGLContext ctx = (EGLContext)(intptr_t)ctxAddress;
	eglMakeCurrentPROC eglMakeCurrent = (eglMakeCurrentPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglMakeCurrent(dpy, draw, read, ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglQueryContext(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong ctxAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLContext ctx = (EGLContext)(intptr_t)ctxAddress;
	EGLint *value = (EGLint *)(intptr_t)valueAddress;
	eglQueryContextPROC eglQueryContext = (eglQueryContextPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryContext(dpy, ctx, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL10_neglQueryString(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint name, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	eglQueryStringPROC eglQueryString = (eglQueryStringPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglQueryString(dpy, name);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglQuerySurface(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	EGLint *value = (EGLint *)(intptr_t)valueAddress;
	eglQuerySurfacePROC eglQuerySurface = (eglQuerySurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQuerySurface(dpy, surface, attribute, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglSwapBuffers(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong surfaceAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSurface surface = (EGLSurface)(intptr_t)surfaceAddress;
	eglSwapBuffersPROC eglSwapBuffers = (eglSwapBuffersPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglSwapBuffers(dpy, surface);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglTerminate(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	eglTerminatePROC eglTerminate = (eglTerminatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglTerminate(dpy);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglWaitGL(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	eglWaitGLPROC eglWaitGL = (eglWaitGLPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglWaitGL();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL10_neglWaitNative(JNIEnv *__env, jclass clazz, jint engine, jlong __functionAddress) {
	eglWaitNativePROC eglWaitNative = (eglWaitNativePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglWaitNative(engine);
}

EXTERN_C_EXIT
