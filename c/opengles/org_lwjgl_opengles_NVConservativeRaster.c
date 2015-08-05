/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glSubpixelPrecisionBiasNVPROC) (GLuint, GLuint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVConservativeRaster_nglSubpixelPrecisionBiasNV(JNIEnv *__env, jclass clazz, jint xbits, jint ybits, jlong __functionAddress) {
	glSubpixelPrecisionBiasNVPROC glSubpixelPrecisionBiasNV = (glSubpixelPrecisionBiasNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSubpixelPrecisionBiasNV(xbits, ybits);
}

EXTERN_C_EXIT
