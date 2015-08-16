/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#define GLFW_EXPOSE_NATIVE_COCOA
#define GLFW_EXPOSE_NATIVE_NSGL
#include "common_tools.h"
#include "glfw3.h"
#include "glfw3native.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWMacOSX_nglfwGetCocoaMonitor(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetCocoaMonitor(monitor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWMacOSX_nglfwGetCocoaWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetCocoaWindow(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_glfw_GLFWMacOSX_nglfwGetNSGLContext(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetNSGLContext(window);
}

EXTERN_C_EXIT
