/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glEGLImageTargetTexture2DOESPROC) (GLenum, GLeglImageOES);
typedef void (APIENTRY *glEGLImageTargetRenderbufferStorageOESPROC) (GLenum, GLeglImageOES);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESEGLImage_nglEGLImageTargetTexture2DOES(JNIEnv *__env, jclass clazz, jint target, jlong imageAddress, jlong __functionAddress) {
	GLeglImageOES image = (GLeglImageOES)(intptr_t)imageAddress;
	glEGLImageTargetTexture2DOESPROC glEGLImageTargetTexture2DOES = (glEGLImageTargetTexture2DOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEGLImageTargetTexture2DOES(target, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESEGLImage_nglEGLImageTargetRenderbufferStorageOES(JNIEnv *__env, jclass clazz, jint target, jlong imageAddress, jlong __functionAddress) {
	GLeglImageOES image = (GLeglImageOES)(intptr_t)imageAddress;
	glEGLImageTargetRenderbufferStorageOESPROC glEGLImageTargetRenderbufferStorageOES = (glEGLImageTargetRenderbufferStorageOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEGLImageTargetRenderbufferStorageOES(target, image);
}

EXTERN_C_EXIT
