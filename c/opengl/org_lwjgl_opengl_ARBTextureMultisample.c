/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTexImage2DMultisamplePROC) (jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTexImage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glGetMultisamplefvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSampleMaskiPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureMultisample_nglTexImage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
	glTexImage2DMultisamplePROC glTexImage2DMultisample = (glTexImage2DMultisamplePROC)tlsGetFunction(1615);
	UNUSED_PARAM(clazz)
	glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureMultisample_nglTexImage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
	glTexImage3DMultisamplePROC glTexImage3DMultisample = (glTexImage3DMultisamplePROC)tlsGetFunction(1618);
	UNUSED_PARAM(clazz)
	glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureMultisample_nglGetMultisamplefv__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress) {
	glGetMultisamplefvPROC glGetMultisamplefv = (glGetMultisamplefvPROC)tlsGetFunction(594);
	intptr_t val = (intptr_t)valAddress;
	UNUSED_PARAM(clazz)
	glGetMultisamplefv(pname, index, val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureMultisample_nglSampleMaski(JNIEnv *__env, jclass clazz, jint index, jint mask) {
	glSampleMaskiPROC glSampleMaski = (glSampleMaskiPROC)tlsGetFunction(1462);
	UNUSED_PARAM(clazz)
	glSampleMaski(index, mask);
}

EXTERN_C_EXIT
