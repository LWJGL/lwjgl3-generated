/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#ifdef LWJGL_WINDOWS
	#define GLFW_EXPOSE_NATIVE_WIN32
#endif
#ifdef LWJGL_LINUX
	#define GLFW_EXPOSE_NATIVE_X11
#endif
#define GLFW_EXPOSE_NATIVE_EGL
#include "glfw3.h"
#include "glfw3native.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWEGL_glfwGetEGLDisplay(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetEGLDisplay();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWEGL_nglfwGetEGLContext(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetEGLContext(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWEGL_nglfwGetEGLSurface(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetEGLSurface(window);
}

EXTERN_C_EXIT
