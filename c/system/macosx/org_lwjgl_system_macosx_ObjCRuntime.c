/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <objc/objc-runtime.h>
typedef void (*EnumerationMutationHandler)(id);

typedef struct objc_method_description (*protocol_getMethodDescriptionPROC) (Protocol *, SEL, BOOL, BOOL);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1getMethodDescription(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong pAddress, jlong aSelAddress, jboolean isRequiredMethod, jboolean isInstanceMethod, jlong __result) {
	protocol_getMethodDescriptionPROC protocol_getMethodDescription = (protocol_getMethodDescriptionPROC)(intptr_t)__functionAddress;
	Protocol *p = (Protocol *)(intptr_t)pAddress;
	SEL aSel = (SEL)(intptr_t)aSelAddress;
	UNUSED_PARAMS(__env, clazz)
	*((struct objc_method_description*)(intptr_t)__result) = protocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod);
}

EXTERN_C_EXIT
