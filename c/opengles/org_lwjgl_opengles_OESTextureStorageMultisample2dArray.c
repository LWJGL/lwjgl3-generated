/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGLES.h"

typedef void (APIENTRY *glTexStorage3DMultisampleOESPROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureStorageMultisample2dArray_nglTexStorage3DMultisampleOES(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTexStorage3DMultisampleOESPROC glTexStorage3DMultisampleOES = (glTexStorage3DMultisampleOESPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexStorage3DMultisampleOES(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

EXTERN_C_EXIT
