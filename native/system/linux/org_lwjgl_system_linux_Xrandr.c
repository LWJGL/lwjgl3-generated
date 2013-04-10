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
	return (jint)XRRQueryExtension(display, event_base_return, error_base_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRQueryVersion(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong major_version_returnAddress, jlong minor_version_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *major_version_return = (int *)(intptr_t)major_version_returnAddress;
	int *minor_version_return = (int *)(intptr_t)minor_version_returnAddress;
	return (jint)XRRQueryVersion(display, major_version_return, minor_version_return);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetScreenResources(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jlong)(intptr_t)XRRGetScreenResources(display, (Window)w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRFreeScreenResources(JNIEnv *__env, jclass clazz, jlong resourcesAddress) {
	XRRScreenResources *resources = (XRRScreenResources *)(intptr_t)resourcesAddress;
	XRRFreeScreenResources(resources);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetCrtcInfo(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong resourcesAddress, jlong crtc) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XRRScreenResources *resources = (XRRScreenResources *)(intptr_t)resourcesAddress;
	return (jlong)(intptr_t)XRRGetCrtcInfo(display, resources, (RRCrtc)crtc);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRFreeCrtcInfo(JNIEnv *__env, jclass clazz, jlong crtcInfoAddress) {
	XRRCrtcInfo *crtcInfo = (XRRCrtcInfo *)(intptr_t)crtcInfoAddress;
	XRRFreeCrtcInfo(crtcInfo);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetOutputInfo(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong resourcesAddress, jlong output) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XRRScreenResources *resources = (XRRScreenResources *)(intptr_t)resourcesAddress;
	return (jlong)(intptr_t)XRRGetOutputInfo(display, resources, (RROutput)output);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRFreeOutputInfo(JNIEnv *__env, jclass clazz, jlong outputInfoAddress) {
	XRROutputInfo *outputInfo = (XRROutputInfo *)(intptr_t)outputInfoAddress;
	XRRFreeOutputInfo(outputInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRSelectInput(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jint mask) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XRRSelectInput(display, (Window)w, mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRUpdateConfiguration(JNIEnv *__env, jclass clazz, jlong eventAddress) {
	XEvent *event = (XEvent *)(intptr_t)eventAddress;
	return (jint)XRRUpdateConfiguration(event);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetCrtcGammaSize(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong crtc) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XRRGetCrtcGammaSize(display, (RRCrtc)crtc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRGetCrtcGamma(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong crtc) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jlong)(intptr_t)XRRGetCrtcGamma(display, (RRCrtc)crtc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRAllocGamma(JNIEnv *__env, jclass clazz, jint size) {
	return (jlong)(intptr_t)XRRAllocGamma(size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRFreeGamma(JNIEnv *__env, jclass clazz, jlong gammaAddress) {
	XRRCrtcGamma *gamma = (XRRCrtcGamma *)(intptr_t)gammaAddress;
	XRRFreeGamma(gamma);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xrandr_nXRRSetCrtcGamma(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong crtc, jlong gammaAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XRRCrtcGamma *gamma = (XRRCrtcGamma *)(intptr_t)gammaAddress;
	XRRSetCrtcGamma(display, (RRCrtc)crtc, gamma);
}