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

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_GLFWWin32_nglfwGetWin32Window(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jlong)(intptr_t)glfwGetWin32Window(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_GLFWWin32_nglfwGetWGLContext(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jlong)(intptr_t)glfwGetWGLContext(window);
}