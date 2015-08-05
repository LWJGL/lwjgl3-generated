/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glDiscardFramebufferEXTPROC) (GLenum, GLsizei, const GLenum *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDiscardFramebuffer_nglDiscardFramebufferEXT(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress, jlong __functionAddress) {
	const GLenum *attachments = (const GLenum *)(intptr_t)attachmentsAddress;
	glDiscardFramebufferEXTPROC glDiscardFramebufferEXT = (glDiscardFramebufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDiscardFramebufferEXT(target, numAttachments, attachments);
}

EXTERN_C_EXIT
