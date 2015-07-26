/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "EGL/egl.h"
#include "EGL/eglext.h"
ENABLE_WARNINGS()

typedef EGLBoolean (APIENTRY *eglGetOutputLayersEXTPROC) (EGLDisplay, const EGLAttrib *, EGLOutputLayerEXT *, EGLint, EGLint *);
typedef EGLBoolean (APIENTRY *eglGetOutputPortsEXTPROC) (EGLDisplay, const EGLAttrib *, EGLOutputPortEXT *, EGLint, EGLint *);
typedef EGLBoolean (APIENTRY *eglOutputLayerAttribEXTPROC) (EGLDisplay, EGLOutputLayerEXT, EGLint, EGLAttrib);
typedef EGLBoolean (APIENTRY *eglQueryOutputLayerAttribEXTPROC) (EGLDisplay, EGLOutputLayerEXT, EGLint, EGLAttrib *);
typedef char * (APIENTRY *eglQueryOutputLayerStringEXTPROC) (EGLDisplay, EGLOutputLayerEXT, EGLint);
typedef EGLBoolean (APIENTRY *eglOutputPortAttribEXTPROC) (EGLDisplay, EGLOutputPortEXT, EGLint, EGLAttrib);
typedef EGLBoolean (APIENTRY *eglQueryOutputPortAttribEXTPROC) (EGLDisplay, EGLOutputPortEXT, EGLint, EGLAttrib *);
typedef char * (APIENTRY *eglQueryOutputPortStringEXTPROC) (EGLDisplay, EGLOutputPortEXT, EGLint);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTOutputBase_neglGetOutputLayersEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong attrib_listAddress, jlong layersAddress, jint max_layers, jlong num_layersAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLAttrib *attrib_list = (const EGLAttrib *)(intptr_t)attrib_listAddress;
	EGLOutputLayerEXT *layers = (EGLOutputLayerEXT *)(intptr_t)layersAddress;
	EGLint *num_layers = (EGLint *)(intptr_t)num_layersAddress;
	eglGetOutputLayersEXTPROC eglGetOutputLayersEXT = (eglGetOutputLayersEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglGetOutputLayersEXT(dpy, attrib_list, layers, max_layers, num_layers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTOutputBase_neglGetOutputPortsEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong attrib_listAddress, jlong portsAddress, jint max_ports, jlong num_portsAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	const EGLAttrib *attrib_list = (const EGLAttrib *)(intptr_t)attrib_listAddress;
	EGLOutputPortEXT *ports = (EGLOutputPortEXT *)(intptr_t)portsAddress;
	EGLint *num_ports = (EGLint *)(intptr_t)num_portsAddress;
	eglGetOutputPortsEXTPROC eglGetOutputPortsEXT = (eglGetOutputPortsEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglGetOutputPortsEXT(dpy, attrib_list, ports, max_ports, num_ports);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTOutputBase_neglOutputLayerAttribEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong layerAddress, jint attribute, jlong value, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLOutputLayerEXT layer = (EGLOutputLayerEXT)(intptr_t)layerAddress;
	eglOutputLayerAttribEXTPROC eglOutputLayerAttribEXT = (eglOutputLayerAttribEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglOutputLayerAttribEXT(dpy, layer, attribute, (EGLAttrib)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTOutputBase_neglQueryOutputLayerAttribEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong layerAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLOutputLayerEXT layer = (EGLOutputLayerEXT)(intptr_t)layerAddress;
	EGLAttrib *value = (EGLAttrib *)(intptr_t)valueAddress;
	eglQueryOutputLayerAttribEXTPROC eglQueryOutputLayerAttribEXT = (eglQueryOutputLayerAttribEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryOutputLayerAttribEXT(dpy, layer, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EXTOutputBase_neglQueryOutputLayerStringEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong layerAddress, jint name, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLOutputLayerEXT layer = (EGLOutputLayerEXT)(intptr_t)layerAddress;
	eglQueryOutputLayerStringEXTPROC eglQueryOutputLayerStringEXT = (eglQueryOutputLayerStringEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglQueryOutputLayerStringEXT(dpy, layer, name);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTOutputBase_neglOutputPortAttribEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong portAddress, jint attribute, jlong value, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLOutputPortEXT port = (EGLOutputPortEXT)(intptr_t)portAddress;
	eglOutputPortAttribEXTPROC eglOutputPortAttribEXT = (eglOutputPortAttribEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglOutputPortAttribEXT(dpy, port, attribute, (EGLAttrib)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_egl_EXTOutputBase_neglQueryOutputPortAttribEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong portAddress, jint attribute, jlong valueAddress, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLOutputPortEXT port = (EGLOutputPortEXT)(intptr_t)portAddress;
	EGLAttrib *value = (EGLAttrib *)(intptr_t)valueAddress;
	eglQueryOutputPortAttribEXTPROC eglQueryOutputPortAttribEXT = (eglQueryOutputPortAttribEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)eglQueryOutputPortAttribEXT(dpy, port, attribute, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_egl_EXTOutputBase_neglQueryOutputPortStringEXT(JNIEnv *__env, jclass clazz, jlong dpyAddress, jlong portAddress, jint name, jlong __functionAddress) {
	EGLDisplay dpy = (EGLDisplay)(intptr_t)dpyAddress;
	EGLOutputPortEXT port = (EGLOutputPortEXT)(intptr_t)portAddress;
	eglQueryOutputPortStringEXTPROC eglQueryOutputPortStringEXT = (eglQueryOutputPortStringEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)eglQueryOutputPortStringEXT(dpy, port, name);
}

EXTERN_C_EXIT
