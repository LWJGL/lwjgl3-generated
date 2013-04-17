/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <X11/Xresource.h>
#include <X11/Xutil.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xutil_nXLookupString(JNIEnv *__env, jclass clazz, jlong event_structAddress, jlong buffer_returnAddress, jint bytes_buffer, jlong keysym_returnAddress, jlong status_in_outAddress) {
	XKeyEvent *event_struct = (XKeyEvent *)(intptr_t)event_structAddress;
	char *buffer_return = (char *)(intptr_t)buffer_returnAddress;
	KeySym *keysym_return = (KeySym *)(intptr_t)keysym_returnAddress;
	XComposeStatus *status_in_out = (XComposeStatus *)(intptr_t)status_in_outAddress;
	return (jint)XLookupString(event_struct, buffer_return, bytes_buffer, keysym_return, status_in_out);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xutil_nXAllocWMHints(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)XAllocWMHints();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xutil_nXAllocSizeHints(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)XAllocSizeHints();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xutil_XUniqueContext(JNIEnv *__env, jclass clazz) {
	return (jint)XUniqueContext();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xutil_nXSaveContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong rid, jint context, jlong dataAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	const char *data = (const char *)(intptr_t)dataAddress;
	return (jint)XSaveContext(display, (XID)rid, context, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xutil_nXFindContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong rid, jint context, jlong data_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	char **data_return = (char **)(intptr_t)data_returnAddress;
	return (jint)XFindContext(display, (XID)rid, context, data_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xutil_nXDeleteContext(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong rid, jint context) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XDeleteContext(display, (XID)rid, context);
}