/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glProgramParameteriARBPROC) (jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureARBPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureLayerARBPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureFaceARBPROC) (jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGeometryShader4_nglProgramParameteriARB(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value) {
	glProgramParameteriARBPROC glProgramParameteriARB = (glProgramParameteriARBPROC)tlsGetFunction(1254);
	UNUSED_PARAM(clazz)
	glProgramParameteriARB(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGeometryShader4_nglFramebufferTextureARB(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
	glFramebufferTextureARBPROC glFramebufferTextureARB = (glFramebufferTextureARBPROC)tlsGetFunction(455);
	UNUSED_PARAM(clazz)
	glFramebufferTextureARB(target, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGeometryShader4_nglFramebufferTextureLayerARB(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer) {
	glFramebufferTextureLayerARBPROC glFramebufferTextureLayerARB = (glFramebufferTextureLayerARBPROC)tlsGetFunction(460);
	UNUSED_PARAM(clazz)
	glFramebufferTextureLayerARB(target, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGeometryShader4_nglFramebufferTextureFaceARB(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint face) {
	glFramebufferTextureFaceARBPROC glFramebufferTextureFaceARB = (glFramebufferTextureFaceARBPROC)tlsGetFunction(457);
	UNUSED_PARAM(clazz)
	glFramebufferTextureFaceARB(target, attachment, texture, level, face);
}

EXTERN_C_EXIT
