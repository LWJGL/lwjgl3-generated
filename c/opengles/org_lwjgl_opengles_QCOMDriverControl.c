/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glGetDriverControlsQCOMPROC) (GLint *, GLsizei, GLuint *);
typedef void (APIENTRY *glGetDriverControlStringQCOMPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glEnableDriverControlQCOMPROC) (GLuint);
typedef void (APIENTRY *glDisableDriverControlQCOMPROC) (GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMDriverControl_nglGetDriverControlsQCOM(JNIEnv *__env, jclass clazz, jlong numAddress, jint size, jlong driverControlsAddress, jlong __functionAddress) {
	GLint *num = (GLint *)(intptr_t)numAddress;
	GLuint *driverControls = (GLuint *)(intptr_t)driverControlsAddress;
	glGetDriverControlsQCOMPROC glGetDriverControlsQCOM = (glGetDriverControlsQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetDriverControlsQCOM(num, size, driverControls);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMDriverControl_nglGetDriverControlStringQCOM(JNIEnv *__env, jclass clazz, jint driverControl, jint bufSize, jlong lengthAddress, jlong driverControlStringAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *driverControlString = (GLchar *)(intptr_t)driverControlStringAddress;
	glGetDriverControlStringQCOMPROC glGetDriverControlStringQCOM = (glGetDriverControlStringQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetDriverControlStringQCOM(driverControl, bufSize, length, driverControlString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMDriverControl_nglEnableDriverControlQCOM(JNIEnv *__env, jclass clazz, jint driverControl, jlong __functionAddress) {
	glEnableDriverControlQCOMPROC glEnableDriverControlQCOM = (glEnableDriverControlQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableDriverControlQCOM(driverControl);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMDriverControl_nglDisableDriverControlQCOM(JNIEnv *__env, jclass clazz, jint driverControl, jlong __functionAddress) {
	glDisableDriverControlQCOMPROC glDisableDriverControlQCOM = (glDisableDriverControlQCOMPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableDriverControlQCOM(driverControl);
}

EXTERN_C_EXIT
