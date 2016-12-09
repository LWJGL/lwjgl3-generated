/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleAPPLEPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glResolveMultisampleFramebufferAPPLEPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLEFramebufferMultisample_nglRenderbufferStorageMultisampleAPPLE(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
	glRenderbufferStorageMultisampleAPPLEPROC glRenderbufferStorageMultisampleAPPLE = (glRenderbufferStorageMultisampleAPPLEPROC)tlsGetFunction(597);
	UNUSED_PARAM(clazz)
	glRenderbufferStorageMultisampleAPPLE(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLEFramebufferMultisample_nglResolveMultisampleFramebufferAPPLE(JNIEnv *__env, jclass clazz) {
	glResolveMultisampleFramebufferAPPLEPROC glResolveMultisampleFramebufferAPPLE = (glResolveMultisampleFramebufferAPPLEPROC)tlsGetFunction(602);
	UNUSED_PARAM(clazz)
	glResolveMultisampleFramebufferAPPLE();
}

EXTERN_C_EXIT
