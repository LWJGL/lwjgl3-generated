/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glInsertEventMarkerEXTPROC) (GLsizei, const GLchar *);
typedef GLvoid (APIENTRY *glPushGroupMarkerEXTPROC) (GLsizei, const GLchar *);
typedef GLvoid (APIENTRY *glPopGroupMarkerEXTPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDebugMarker_nglInsertEventMarkerEXT(JNIEnv *__env, jclass clazz, jint length, jlong markerAddress, jlong __functionAddress) {
	const GLchar *marker = (const GLchar *)(intptr_t)markerAddress;
	glInsertEventMarkerEXTPROC glInsertEventMarkerEXT = (glInsertEventMarkerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glInsertEventMarkerEXT(length, marker);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDebugMarker_nglPushGroupMarkerEXT(JNIEnv *__env, jclass clazz, jint length, jlong markerAddress, jlong __functionAddress) {
	const GLchar *marker = (const GLchar *)(intptr_t)markerAddress;
	glPushGroupMarkerEXTPROC glPushGroupMarkerEXT = (glPushGroupMarkerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPushGroupMarkerEXT(length, marker);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDebugMarker_nglPopGroupMarkerEXT(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPopGroupMarkerEXTPROC glPopGroupMarkerEXT = (glPopGroupMarkerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPopGroupMarkerEXT();
}

EXTERN_C_EXIT
