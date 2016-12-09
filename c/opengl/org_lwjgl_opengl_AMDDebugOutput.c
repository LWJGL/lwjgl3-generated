/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDebugMessageEnableAMDPROC) (jint, jint, jint, const intptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertAMDPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glDebugMessageCallbackAMDPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogAMDPROC) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageEnableAMD__IIIJZ(JNIEnv *__env, jclass clazz, jint category, jint severity, jint count, jlong idsAddress, jboolean enabled) {
	glDebugMessageEnableAMDPROC glDebugMessageEnableAMD = (glDebugMessageEnableAMDPROC)tlsGetFunction(288);
	const intptr_t ids = (const intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glDebugMessageEnableAMD(category, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageInsertAMD(JNIEnv *__env, jclass clazz, jint category, jint severity, jint id, jint length, jlong bufAddress) {
	glDebugMessageInsertAMDPROC glDebugMessageInsertAMD = (glDebugMessageInsertAMDPROC)tlsGetFunction(290);
	const intptr_t buf = (const intptr_t)bufAddress;
	UNUSED_PARAM(clazz)
	glDebugMessageInsertAMD(category, severity, id, length, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageCallbackAMD(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
	glDebugMessageCallbackAMDPROC glDebugMessageCallbackAMD = (glDebugMessageCallbackAMDPROC)tlsGetFunction(284);
	intptr_t callback = (intptr_t)callbackAddress;
	intptr_t userParam = (intptr_t)userParamAddress;
	UNUSED_PARAM(clazz)
	glDebugMessageCallbackAMD(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglGetDebugMessageLogAMD__IIJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong categoriesAddress, jlong severitiesAddress, jlong idsAddress, jlong lengthsAddress, jlong messageLogAddress) {
	glGetDebugMessageLogAMDPROC glGetDebugMessageLogAMD = (glGetDebugMessageLogAMDPROC)tlsGetFunction(533);
	intptr_t categories = (intptr_t)categoriesAddress;
	intptr_t severities = (intptr_t)severitiesAddress;
	intptr_t ids = (intptr_t)idsAddress;
	intptr_t lengths = (intptr_t)lengthsAddress;
	intptr_t messageLog = (intptr_t)messageLogAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetDebugMessageLogAMD(count, bufsize, categories, severities, ids, lengths, messageLog);
}

EXTERN_C_EXIT