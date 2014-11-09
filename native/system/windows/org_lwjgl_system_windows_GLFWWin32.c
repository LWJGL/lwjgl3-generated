/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#define GLFW_EXPOSE_NATIVE_WIN32
#define GLFW_EXPOSE_NATIVE_WGL
#include "glfw3.h"
#include "glfw3native.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_GLFWWin32_nglfwGetWin32Adapter(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetWin32Adapter(monitor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_GLFWWin32_nglfwGetWin32Monitor(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetWin32Monitor(monitor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_GLFWWin32_nglfwGetWin32Window(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetWin32Window(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_GLFWWin32_nglfwGetWGLContext(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetWGLContext(window);
}

EXTERN_C_EXIT
