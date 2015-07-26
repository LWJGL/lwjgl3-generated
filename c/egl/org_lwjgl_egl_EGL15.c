/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
ENABLE_WARNINGS()

typedef EGLSync (APIENTRY *eglCreateSyncPROC) (EGLDisplay, EGLenum, const EGLAttrib *);
typedef EGLBoolean (APIENTRY *eglDestroySyncPROC) (EGLDisplay, EGLSync);
typedef EGLint (APIENTRY *eglClientWaitSyncPROC) (EGLDisplay, EGLSync, EGLint, EGLTime);
typedef EGLBoolean (APIENTRY *eglGetSyncAttribPROC) (EGLDisplay, EGLSync, EGLint, EGLAttrib *);
typedef EGLImage (APIENTRY *eglCreateImagePROC) (EGLDisplay, EGLContext, EGLenum, EGLClientBuffer, const EGLAttrib *);
typedef EGLBoolean (APIENTRY *eglDestroyImagePROC) (EGLDisplay, EGLImage);
typedef EGLDisplay (APIENTRY *eglGetPlatformDisplayPROC) (EGLenum, void *, const EGLAttrib *);
typedef EGLSurface (APIENTRY *eglCreatePlatformWindowSurfacePROC) (EGLDisplay, EGLConfig, void *, const EGLAttrib *);
typedef EGLSurface (APIENTRY *eglCreatePlatformPixmapSurfacePROC) (EGLDisplay, EGLConfig, void *, const EGLAttrib *);
typedef EGLBoolean (APIENTRY *eglWaitSyncPROC) (EGLDisplay, EGLSync, EGLint);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL15_neglCreateSync(JNIEnv *__env, jclass clazz, jlong dpyAddress, jint type, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLAttrib *attrib_list = (const EGLAttrib *)(intptr_t)attrib_listAddress;
	eglCreateSyncPROC eglCreateSync = (eglCreateSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateSync(dpy, type, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL15_neglDestroySync(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSync sync = (EGLSync)(intptr_t)syncAddress;
	eglDestroySyncPROC eglDestroySync = (eglDestroySyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglDestroySync(dpy, sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_egl_EGL15_neglClientWaitSync(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jint flags, jlong timeout, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSync sync = (EGLSync)(intptr_t)syncAddress;
	eglClientWaitSyncPROC eglClientWaitSync = (eglClientWaitSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)eglClientWaitSync(dpy, sync, flags, timeout);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL15_neglGetSyncAttrib(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSync sync = (EGLSync)(intptr_t)syncAddress;
	EGLAttrib *value = (EGLAttrib *)(intptr_t)valueAddress;
	eglGetSyncAttribPROC eglGetSyncAttrib = (eglGetSyncAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglGetSyncAttrib(dpy, sync, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL15_neglCreateImage(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong ctxAddress, jint target, jlong bufferAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLContext ctx = (EGLContext)(intptr_t)ctxAddress;
	EGLClientBuffer buffer = (EGLClientBuffer)(intptr_t)bufferAddress;
	const EGLAttrib *attrib_list = (const EGLAttrib *)(intptr_t)attrib_listAddress;
	eglCreateImagePROC eglCreateImage = (eglCreateImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreateImage(dpy, ctx, target, buffer, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL15_neglDestroyImage(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong imageAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLImage image = (EGLImage)(intptr_t)imageAddress;
	eglDestroyImagePROC eglDestroyImage = (eglDestroyImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglDestroyImage(dpy, image);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL15_neglGetPlatformDisplay(JNIEnv *__env, jclass clazz, jint platform, jlong native_displayAddress, jlong attrib_listAddress, jlong __functionAddress) {
	void *native_display = (void *)(intptr_t)native_displayAddress;
	const EGLAttrib *attrib_list = (const EGLAttrib *)(intptr_t)attrib_listAddress;
	eglGetPlatformDisplayPROC eglGetPlatformDisplay = (eglGetPlatformDisplayPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglGetPlatformDisplay(platform, native_display, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL15_neglCreatePlatformWindowSurface(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong native_windowAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	void *native_window = (void *)(intptr_t)native_windowAddress;
	const EGLAttrib *attrib_list = (const EGLAttrib *)(intptr_t)attrib_listAddress;
	eglCreatePlatformWindowSurfacePROC eglCreatePlatformWindowSurface = (eglCreatePlatformWindowSurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreatePlatformWindowSurface(dpy, config, native_window, attrib_list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EGL15_neglCreatePlatformPixmapSurface(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong configAddress, jlong native_pixmapAddress, jlong attrib_listAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLConfig config = (EGLConfig)(intptr_t)configAddress;
	void *native_pixmap = (void *)(intptr_t)native_pixmapAddress;
	const EGLAttrib *attrib_list = (const EGLAttrib *)(intptr_t)attrib_listAddress;
	eglCreatePlatformPixmapSurfacePROC eglCreatePlatformPixmapSurface = (eglCreatePlatformPixmapSurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglCreatePlatformPixmapSurface(dpy, config, native_pixmap, attrib_list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EGL15_neglWaitSync(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong syncAddress, jint flags, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLSync sync = (EGLSync)(intptr_t)syncAddress;
	eglWaitSyncPROC eglWaitSync = (eglWaitSyncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglWaitSync(dpy, sync, flags);
}

EXTERN_C_EXIT
