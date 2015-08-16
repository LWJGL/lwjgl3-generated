/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#define GLFW_EXPOSE_NATIVE_X11
#define GLFW_EXPOSE_NATIVE_GLX
#include "common_tools.h"
#include "glfw3.h"
#include "glfw3native.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWLinux_glfwGetX11Display(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetX11Display();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWLinux_nglfwGetX11Adapter(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glfwGetX11Adapter(monitor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWLinux_nglfwGetX11Monitor(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glfwGetX11Monitor(monitor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWLinux_nglfwGetX11Window(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)glfwGetX11Window(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWLinux_nglfwGetGLXContext(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetGLXContext(window);
}

EXTERN_C_EXIT
