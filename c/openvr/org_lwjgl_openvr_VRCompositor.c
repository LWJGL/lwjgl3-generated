/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "openvr_capi.h"
ENABLE_WARNINGS()
#define APIENTRY OPENVR_FNTABLE_CALLTYPE

typedef HmdColor_t (APIENTRY *VRCompositor_GetCurrentFadeColorPROC) (jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRCompositor_nVRCompositor_1GetCurrentFadeColor(JNIEnv *__env, jclass clazz, jlong __functionAddress, jboolean bBackground, jlong __result) {
	VRCompositor_GetCurrentFadeColorPROC VRCompositor_GetCurrentFadeColor = (VRCompositor_GetCurrentFadeColorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	*((HmdColor_t*)(intptr_t)__result) = VRCompositor_GetCurrentFadeColor(bBackground);
}

EXTERN_C_EXIT
