/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "jawt_md.h"
ENABLE_WARNINGS()
#ifndef APIENTRY
	#define APIENTRY
#endif

typedef jboolean (APIENTRY *JAWT_GetAWTPROC) (JNIEnv *, intptr_t);
typedef intptr_t (APIENTRY *JAWT_GetDrawingSurfacePROC) (JNIEnv *, jobject);
typedef void (APIENTRY *JAWT_LockPROC) (JNIEnv *);
typedef void (APIENTRY *JAWT_UnlockPROC) (JNIEnv *);
typedef jobject (APIENTRY *JAWT_GetComponentPROC) (JNIEnv *, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_jawt_JAWTFunctions_nJAWT_1GetAWT(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong awtAddress) {
	JAWT_GetAWTPROC JAWT_GetAWT = (JAWT_GetAWTPROC)(intptr_t)__functionAddress;
	intptr_t awt = (intptr_t)awtAddress;
	UNUSED_PARAM(clazz)
	return (jboolean)JAWT_GetAWT(__env, awt);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jawt_JAWTFunctions_nJAWT_1GetDrawingSurface(JNIEnv *__env, jclass clazz, jlong __functionAddress, jobject target) {
	JAWT_GetDrawingSurfacePROC JAWT_GetDrawingSurface = (JAWT_GetDrawingSurfacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAM(clazz)
	return (jlong)JAWT_GetDrawingSurface(__env, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jawt_JAWTFunctions_nJAWT_1Lock(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	JAWT_LockPROC JAWT_Lock = (JAWT_LockPROC)(intptr_t)__functionAddress;
	UNUSED_PARAM(clazz)
	JAWT_Lock(__env);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jawt_JAWTFunctions_nJAWT_1Unlock(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	JAWT_UnlockPROC JAWT_Unlock = (JAWT_UnlockPROC)(intptr_t)__functionAddress;
	UNUSED_PARAM(clazz)
	JAWT_Unlock(__env);
}

JNIEXPORT jobject JNICALL Java_org_lwjgl_system_jawt_JAWTFunctions_nJAWT_1GetComponent(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong platformInfoAddress) {
	JAWT_GetComponentPROC JAWT_GetComponent = (JAWT_GetComponentPROC)(intptr_t)__functionAddress;
	intptr_t platformInfo = (intptr_t)platformInfoAddress;
	UNUSED_PARAM(clazz)
	return (jobject)JAWT_GetComponent(__env, platformInfo);
}

EXTERN_C_EXIT
