/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#define GLFW_EXPOSE_NATIVE_COCOA
#define GLFW_EXPOSE_NATIVE_NSGL
#include "glfw3.h"
#include "glfw3native.h"

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_GLFWMacOSX_nglfwGetCocoaWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jlong)(intptr_t)glfwGetCocoaWindow(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_GLFWMacOSX_nglfwGetNSGLContext(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jlong)(intptr_t)glfwGetNSGLContext(window);
}