/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <X11/extensions/Xrandr.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRQueryExtension(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong event_base_returnAddress, jlong error_base_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *event_base_return = (int *)(intptr_t)event_base_returnAddress;
	int *error_base_return = (int *)(intptr_t)error_base_returnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XRRQueryExtension(display, event_base_return, error_base_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRQueryVersion(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong major_version_returnAddress, jlong minor_version_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *major_version_return = (int *)(intptr_t)major_version_returnAddress;
	int *minor_version_return = (int *)(intptr_t)minor_version_returnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XRRQueryVersion(display, major_version_return, minor_version_return);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetScreenResources(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)XRRGetScreenResources(display, (Window)w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRFreeScreenResources(JNIEnv *__env, jclass clazz, jlong resourcesAddress) {
	XRRScreenResources *resources = (XRRScreenResources *)(intptr_t)resourcesAddress;
	UNUSED_PARAMS(__env, clazz)
	XRRFreeScreenResources(resources);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetOutputPrimary(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)XRRGetOutputPrimary(display, (Window)w);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetCrtcInfo(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong resourcesAddress, jlong crtc) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XRRScreenResources *resources = (XRRScreenResources *)(intptr_t)resourcesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)XRRGetCrtcInfo(display, resources, (RRCrtc)crtc);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRFreeCrtcInfo(JNIEnv *__env, jclass clazz, jlong crtcInfoAddress) {
	XRRCrtcInfo *crtcInfo = (XRRCrtcInfo *)(intptr_t)crtcInfoAddress;
	UNUSED_PARAMS(__env, clazz)
	XRRFreeCrtcInfo(crtcInfo);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetOutputInfo(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong resourcesAddress, jlong output) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XRRScreenResources *resources = (XRRScreenResources *)(intptr_t)resourcesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)XRRGetOutputInfo(display, resources, (RROutput)output);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRFreeOutputInfo(JNIEnv *__env, jclass clazz, jlong outputInfoAddress) {
	XRROutputInfo *outputInfo = (XRROutputInfo *)(intptr_t)outputInfoAddress;
	UNUSED_PARAMS(__env, clazz)
	XRRFreeOutputInfo(outputInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRSelectInput(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jint mask) {
	Display *display = (Display *)(intptr_t)displayAddress;
	UNUSED_PARAMS(__env, clazz)
	XRRSelectInput(display, (Window)w, mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRSetCrtcConfig(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong resourcesAddress, jlong crtc, jlong timestamp, jint x, jint y, jlong mode, jshort rotation, jlong outputsAddress, jint noutputs) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XRRScreenResources *resources = (XRRScreenResources *)(intptr_t)resourcesAddress;
	RROutput *outputs = (RROutput *)(intptr_t)outputsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XRRSetCrtcConfig(display, resources, (RRCrtc)crtc, (Time)timestamp, x, y, (RRMode)mode, rotation, outputs, noutputs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRUpdateConfiguration(JNIEnv *__env, jclass clazz, jlong eventAddress) {
	XEvent *event = (XEvent *)(intptr_t)eventAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XRRUpdateConfiguration(event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetCrtcGammaSize(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong crtc) {
	Display *display = (Display *)(intptr_t)displayAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)XRRGetCrtcGammaSize(display, (RRCrtc)crtc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetCrtcGamma(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong crtc) {
	Display *display = (Display *)(intptr_t)displayAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)XRRGetCrtcGamma(display, (RRCrtc)crtc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRAllocGamma(JNIEnv *__env, jclass clazz, jint size) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)XRRAllocGamma(size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRFreeGamma(JNIEnv *__env, jclass clazz, jlong gammaAddress) {
	XRRCrtcGamma *gamma = (XRRCrtcGamma *)(intptr_t)gammaAddress;
	UNUSED_PARAMS(__env, clazz)
	XRRFreeGamma(gamma);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRSetCrtcGamma(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong crtc, jlong gammaAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XRRCrtcGamma *gamma = (XRRCrtcGamma *)(intptr_t)gammaAddress;
	UNUSED_PARAMS(__env, clazz)
	XRRSetCrtcGamma(display, (RRCrtc)crtc, gamma);
}
