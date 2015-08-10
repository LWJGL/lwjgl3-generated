/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glApplyFramebufferAttachmentCMAAINTELPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELFramebufferCMAA_nglApplyFramebufferAttachmentCMAAINTEL(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glApplyFramebufferAttachmentCMAAINTELPROC glApplyFramebufferAttachmentCMAAINTEL = (glApplyFramebufferAttachmentCMAAINTELPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glApplyFramebufferAttachmentCMAAINTEL();
}

EXTERN_C_EXIT
