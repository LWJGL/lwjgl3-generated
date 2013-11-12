/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef BOOL (APIENTRY *wglDXSetResourceShareHandleNVPROC) (void *, HANDLE);
typedef HANDLE (APIENTRY *wglDXOpenDeviceNVPROC) (void *);
typedef BOOL (APIENTRY *wglDXCloseDeviceNVPROC) (HANDLE);
typedef HANDLE (APIENTRY *wglDXRegisterObjectNVPROC) (HANDLE, void *, GLuint, GLenum, GLenum);
typedef BOOL (APIENTRY *wglDXUnregisterObjectNVPROC) (HANDLE, HANDLE);
typedef BOOL (APIENTRY *wglDXObjectAccessNVPROC) (HANDLE, GLenum);
typedef BOOL (APIENTRY *wglDXLockObjectsNVPROC) (HANDLE, GLint, HANDLE *);
typedef BOOL (APIENTRY *wglDXUnlockObjectsNVPROC) (HANDLE, GLint, HANDLE *);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVDXInterop_nwglDXSetResourceShareHandleNV(JNIEnv *__env, jclass clazz, jlong dxObjectAddress, jlong shareHandleAddress, jlong __functionAddress) {
	void *dxObject = (void *)(intptr_t)dxObjectAddress;
	HANDLE shareHandle = (HANDLE)(intptr_t)shareHandleAddress;
	wglDXSetResourceShareHandleNVPROC wglDXSetResourceShareHandleNV = (wglDXSetResourceShareHandleNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglDXSetResourceShareHandleNV(dxObject, shareHandle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLNVDXInterop_nwglDXOpenDeviceNV(JNIEnv *__env, jclass clazz, jlong dxDeviceAddress, jlong __functionAddress) {
	void *dxDevice = (void *)(intptr_t)dxDeviceAddress;
	wglDXOpenDeviceNVPROC wglDXOpenDeviceNV = (wglDXOpenDeviceNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)wglDXOpenDeviceNV(dxDevice);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVDXInterop_nwglDXCloseDeviceNV(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong __functionAddress) {
	HANDLE device = (HANDLE)(intptr_t)deviceAddress;
	wglDXCloseDeviceNVPROC wglDXCloseDeviceNV = (wglDXCloseDeviceNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglDXCloseDeviceNV(device);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLNVDXInterop_nwglDXRegisterObjectNV(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong dxResourceAddress, jint name, jint type, jint access, jlong __functionAddress) {
	HANDLE device = (HANDLE)(intptr_t)deviceAddress;
	void *dxResource = (void *)(intptr_t)dxResourceAddress;
	wglDXRegisterObjectNVPROC wglDXRegisterObjectNV = (wglDXRegisterObjectNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)wglDXRegisterObjectNV(device, dxResource, name, type, access);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVDXInterop_nwglDXUnregisterObjectNV(JNIEnv *__env, jclass clazz, jlong deviceAddress, jlong objectAddress, jlong __functionAddress) {
	HANDLE device = (HANDLE)(intptr_t)deviceAddress;
	HANDLE object = (HANDLE)(intptr_t)objectAddress;
	wglDXUnregisterObjectNVPROC wglDXUnregisterObjectNV = (wglDXUnregisterObjectNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglDXUnregisterObjectNV(device, object);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVDXInterop_nwglDXObjectAccessNV(JNIEnv *__env, jclass clazz, jlong objectAddress, jint access, jlong __functionAddress) {
	HANDLE object = (HANDLE)(intptr_t)objectAddress;
	wglDXObjectAccessNVPROC wglDXObjectAccessNV = (wglDXObjectAccessNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglDXObjectAccessNV(object, access);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVDXInterop_nwglDXLockObjectsNV(JNIEnv *__env, jclass clazz, jlong deviceAddress, jint count, jlong objectsAddress, jlong __functionAddress) {
	HANDLE device = (HANDLE)(intptr_t)deviceAddress;
	HANDLE *objects = (HANDLE *)(intptr_t)objectsAddress;
	wglDXLockObjectsNVPROC wglDXLockObjectsNV = (wglDXLockObjectsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglDXLockObjectsNV(device, count, objects);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVDXInterop_nwglDXUnlockObjectsNV(JNIEnv *__env, jclass clazz, jlong deviceAddress, jint count, jlong objectsAddress, jlong __functionAddress) {
	HANDLE device = (HANDLE)(intptr_t)deviceAddress;
	HANDLE *objects = (HANDLE *)(intptr_t)objectsAddress;
	wglDXUnlockObjectsNVPROC wglDXUnlockObjectsNV = (wglDXUnlockObjectsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglDXUnlockObjectsNV(device, count, objects);
}

EXTERN_C_EXIT
