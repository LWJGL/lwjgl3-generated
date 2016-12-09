/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glEnableiOESPROC) (jint, jint);
typedef void (APIENTRY *glDisableiOESPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationiOESPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateiOESPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFunciOESPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateiOESPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glColorMaskiOESPROC) (jint, jboolean, jboolean, jboolean, jboolean);
typedef jboolean (APIENTRY *glIsEnablediOESPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglEnableiOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
	glEnableiOESPROC glEnableiOES = (glEnableiOESPROC)tlsGetFunction(191);
	UNUSED_PARAM(clazz)
	glEnableiOES(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglDisableiOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
	glDisableiOESPROC glDisableiOES = (glDisableiOESPROC)tlsGetFunction(150);
	UNUSED_PARAM(clazz)
	glDisableiOES(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglBlendEquationiOES(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
	glBlendEquationiOESPROC glBlendEquationiOES = (glBlendEquationiOESPROC)tlsGetFunction(40);
	UNUSED_PARAM(clazz)
	glBlendEquationiOES(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglBlendEquationSeparateiOES(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
	glBlendEquationSeparateiOESPROC glBlendEquationSeparateiOES = (glBlendEquationSeparateiOESPROC)tlsGetFunction(37);
	UNUSED_PARAM(clazz)
	glBlendEquationSeparateiOES(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglBlendFunciOES(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
	glBlendFunciOESPROC glBlendFunciOES = (glBlendFunciOESPROC)tlsGetFunction(48);
	UNUSED_PARAM(clazz)
	glBlendFunciOES(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglBlendFuncSeparateiOES(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
	glBlendFuncSeparateiOESPROC glBlendFuncSeparateiOES = (glBlendFuncSeparateiOESPROC)tlsGetFunction(45);
	UNUSED_PARAM(clazz)
	glBlendFuncSeparateiOES(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglColorMaskiOES(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a) {
	glColorMaskiOESPROC glColorMaskiOES = (glColorMaskiOESPROC)tlsGetFunction(73);
	UNUSED_PARAM(clazz)
	glColorMaskiOES(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_nglIsEnablediOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
	glIsEnablediOESPROC glIsEnablediOES = (glIsEnablediOESPROC)tlsGetFunction(406);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsEnablediOES(target, index);
}

EXTERN_C_EXIT
