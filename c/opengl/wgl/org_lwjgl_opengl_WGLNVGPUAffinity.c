/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"
#include "WGL.h"

typedef BOOL (APIENTRY *wglEnumGpusNVPROC) (UINT, HGPUNV *);
typedef BOOL (APIENTRY *wglEnumGpuDevicesNVPROC) (HGPUNV, UINT, PGPU_DEVICE);
typedef HDC (APIENTRY *wglCreateAffinityDCNVPROC) (const HGPUNV *);
typedef BOOL (APIENTRY *wglEnumGpusFromAffinityDCNVPROC) (HDC, UINT, HGPUNV *);
typedef BOOL (APIENTRY *wglDeleteDCNVPROC) (HDC);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVGPUAffinity_nwglEnumGpusNV(JNIEnv *__env, jclass clazz, jint gpuIndex, jlong gpuAddress, jlong __functionAddress) {
	HGPUNV *gpu = (HGPUNV *)(intptr_t)gpuAddress;
	wglEnumGpusNVPROC wglEnumGpusNV = (wglEnumGpusNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglEnumGpusNV(gpuIndex, gpu);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVGPUAffinity_nwglEnumGpuDevicesNV(JNIEnv *__env, jclass clazz, jlong gpuAddress, jint deviceIndex, jlong gpuDeviceAddress, jlong __functionAddress) {
	HGPUNV gpu = (HGPUNV)(intptr_t)gpuAddress;
	PGPU_DEVICE gpuDevice = (PGPU_DEVICE)(intptr_t)gpuDeviceAddress;
	wglEnumGpuDevicesNVPROC wglEnumGpuDevicesNV = (wglEnumGpuDevicesNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglEnumGpuDevicesNV(gpu, deviceIndex, gpuDevice);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_WGLNVGPUAffinity_nwglCreateAffinityDCNV(JNIEnv *__env, jclass clazz, jlong gpuListAddress, jlong __functionAddress) {
	const HGPUNV *gpuList = (const HGPUNV *)(intptr_t)gpuListAddress;
	wglCreateAffinityDCNVPROC wglCreateAffinityDCNV = (wglCreateAffinityDCNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)wglCreateAffinityDCNV(gpuList);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVGPUAffinity_nwglEnumGpusFromAffinityDCNV(JNIEnv *__env, jclass clazz, jlong affinityDCAddress, jint gpuIndex, jlong gpuAddress, jlong __functionAddress) {
	HDC affinityDC = (HDC)(intptr_t)affinityDCAddress;
	HGPUNV *gpu = (HGPUNV *)(intptr_t)gpuAddress;
	wglEnumGpusFromAffinityDCNVPROC wglEnumGpusFromAffinityDCNV = (wglEnumGpusFromAffinityDCNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, gpu);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WGLNVGPUAffinity_nwglDeleteDCNV(JNIEnv *__env, jclass clazz, jlong hdcAddress, jlong __functionAddress) {
	HDC hdc = (HDC)(intptr_t)hdcAddress;
	wglDeleteDCNVPROC wglDeleteDCNV = (wglDeleteDCNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)wglDeleteDCNV(hdc);
}

EXTERN_C_EXIT
