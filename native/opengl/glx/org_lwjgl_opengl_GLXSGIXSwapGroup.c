/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <GL/glx.h>

typedef void (APIENTRY *glXJoinSwapGroupSGIXPROC) (Display *, GLXDrawable, GLXDrawable);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GLXSGIXSwapGroup_nglXJoinSwapGroupSGIX(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong drawableAddress, jlong memberAddress, jlong __functionAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GLXDrawable drawable = (GLXDrawable)(intptr_t)drawableAddress;
	GLXDrawable member = (GLXDrawable)(intptr_t)memberAddress;
	glXJoinSwapGroupSGIXPROC glXJoinSwapGroupSGIX = (glXJoinSwapGroupSGIXPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glXJoinSwapGroupSGIX(display, drawable, member);
}
