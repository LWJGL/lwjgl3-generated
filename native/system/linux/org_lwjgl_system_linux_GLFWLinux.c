/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#define GLFW_EXPOSE_NATIVE_X11
#define GLFW_EXPOSE_NATIVE_GLX
#include "glfw3.h"
#include "glfw3native.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLFWLinux_glfwGetX11Display(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetX11Display();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLFWLinux_nglfwGetX11Window(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glfwGetX11Window(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_GLFWLinux_nglfwGetGLXContext(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetGLXContext(window);
}

EXTERN_C_EXIT
