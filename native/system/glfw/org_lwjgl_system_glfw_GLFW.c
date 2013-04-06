/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "glfw3.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwInit(JNIEnv *__env, jclass clazz) {
	return (jint)glfwInit();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwTerminate(JNIEnv *__env, jclass clazz) {
	glfwTerminate();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetVersion(JNIEnv *__env, jclass clazz, jlong majorAddress, jlong minorAddress, jlong revAddress) {
	int *major = (int *)(intptr_t)majorAddress;
	int *minor = (int *)(intptr_t)minorAddress;
	int *rev = (int *)(intptr_t)revAddress;
	glfwGetVersion(major, minor, rev);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetVersionString(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)glfwGetVersionString();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetErrorCallback(JNIEnv *__env, jclass clazz, jlong cbfunAddress) {
	GLFWerrorfun cbfun = (GLFWerrorfun)(intptr_t)cbfunAddress;
	glfwSetErrorCallback(cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMonitors(JNIEnv *__env, jclass clazz, jlong countAddress) {
	int *count = (int *)(intptr_t)countAddress;
	return (jlong)(intptr_t)glfwGetMonitors(count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwGetPrimaryMonitor(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)glfwGetPrimaryMonitor();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMonitorPos(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong xposAddress, jlong yposAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	int *xpos = (int *)(intptr_t)xposAddress;
	int *ypos = (int *)(intptr_t)yposAddress;
	glfwGetMonitorPos(monitor, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMonitorPhysicalSize(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong widthAddress, jlong heightAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	glfwGetMonitorPhysicalSize(monitor, width, height);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMonitorName(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	return (jlong)(intptr_t)glfwGetMonitorName(monitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetMonitorCallback(JNIEnv *__env, jclass clazz, jlong cbfunAddress) {
	GLFWmonitorfun cbfun = (GLFWmonitorfun)(intptr_t)cbfunAddress;
	glfwSetMonitorCallback(cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetVideoModes(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong countAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	int *count = (int *)(intptr_t)countAddress;
	return (jlong)(intptr_t)glfwGetVideoModes(monitor, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetVideoMode(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong __result) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	*((GLFWvidmode*)(intptr_t)__result) = glfwGetVideoMode(monitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetGamma(JNIEnv *__env, jclass clazz, jlong monitorAddress, jfloat gamma) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	glfwSetGamma(monitor, gamma);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetGammaRamp(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong rampAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	GLFWgammaramp *ramp = (GLFWgammaramp *)(intptr_t)rampAddress;
	glfwGetGammaRamp(monitor, ramp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetGammaRamp(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong rampAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	const GLFWgammaramp *ramp = (const GLFWgammaramp *)(intptr_t)rampAddress;
	glfwSetGammaRamp(monitor, ramp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwDefaultWindowHints(JNIEnv *__env, jclass clazz) {
	glfwDefaultWindowHints();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwWindowHint(JNIEnv *__env, jclass clazz, jint target, jint hint) {
	glfwWindowHint(target, hint);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwCreateWindow(JNIEnv *__env, jclass clazz, jint width, jint height, jlong titleAddress, jlong monitorAddress, jlong shareAddress) {
	const char *title = (const char *)(intptr_t)titleAddress;
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	GLFWwindow *share = (GLFWwindow *)(intptr_t)shareAddress;
	return (jlong)(intptr_t)glfwCreateWindow(width, height, title, monitor, share);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwDestroyWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwDestroyWindow(window);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwWindowShouldClose(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jint)glfwWindowShouldClose(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowShouldClose(JNIEnv *__env, jclass clazz, jlong windowAddress, jint value) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwSetWindowShouldClose(window, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowTitle(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong titleAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	const char *title = (const char *)(intptr_t)titleAddress;
	glfwSetWindowTitle(window, title);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong xposAddress, jlong yposAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	int *xpos = (int *)(intptr_t)xposAddress;
	int *ypos = (int *)(intptr_t)yposAddress;
	glfwGetWindowPos(window, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jint xpos, jint ypos) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwSetWindowPos(window, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowSize(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong widthAddress, jlong heightAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	glfwGetWindowSize(window, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowSize(JNIEnv *__env, jclass clazz, jlong windowAddress, jint width, jint height) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwSetWindowSize(window, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwIconifyWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwIconifyWindow(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwRestoreWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwRestoreWindow(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwShowWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwShowWindow(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwHideWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwHideWindow(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowMonitor(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jlong)(intptr_t)glfwGetWindowMonitor(window);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowParam(JNIEnv *__env, jclass clazz, jlong windowAddress, jint param) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jint)glfwGetWindowParam(window, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowUserPointer(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong pointerAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	void *pointer = (void *)(intptr_t)pointerAddress;
	glfwSetWindowUserPointer(window, pointer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowUserPointer(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jlong)(intptr_t)glfwGetWindowUserPointer(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowPosCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowposfun cbfun = (GLFWwindowposfun)(intptr_t)cbfunAddress;
	glfwSetWindowPosCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowSizeCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowsizefun cbfun = (GLFWwindowsizefun)(intptr_t)cbfunAddress;
	glfwSetWindowSizeCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowCloseCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowclosefun cbfun = (GLFWwindowclosefun)(intptr_t)cbfunAddress;
	glfwSetWindowCloseCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowRefreshCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowrefreshfun cbfun = (GLFWwindowrefreshfun)(intptr_t)cbfunAddress;
	glfwSetWindowRefreshCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowFocusCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowfocusfun cbfun = (GLFWwindowfocusfun)(intptr_t)cbfunAddress;
	glfwSetWindowFocusCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowIconifyCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowiconifyfun cbfun = (GLFWwindowiconifyfun)(intptr_t)cbfunAddress;
	glfwSetWindowIconifyCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwPollEvents(JNIEnv *__env, jclass clazz) {
	glfwPollEvents();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwWaitEvents(JNIEnv *__env, jclass clazz) {
	glfwWaitEvents();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetInputMode(JNIEnv *__env, jclass clazz, jlong windowAddress, jint mode) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jint)glfwGetInputMode(window, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetInputMode(JNIEnv *__env, jclass clazz, jlong windowAddress, jint mode, jint value) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwSetInputMode(window, mode, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetKey(JNIEnv *__env, jclass clazz, jlong windowAddress, jint key) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jint)glfwGetKey(window, key);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMouseButton(JNIEnv *__env, jclass clazz, jlong windowAddress, jint button) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jint)glfwGetMouseButton(window, button);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetCursorPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong xposAddress, jlong yposAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	double *xpos = (double *)(intptr_t)xposAddress;
	double *ypos = (double *)(intptr_t)yposAddress;
	glfwGetCursorPos(window, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetCursorPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jdouble xpos, jdouble ypos) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	glfwSetCursorPos(window, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetKeyCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWkeyfun cbfun = (GLFWkeyfun)(intptr_t)cbfunAddress;
	glfwSetKeyCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetCharCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWcharfun cbfun = (GLFWcharfun)(intptr_t)cbfunAddress;
	glfwSetCharCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetMouseButtonCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWmousebuttonfun cbfun = (GLFWmousebuttonfun)(intptr_t)cbfunAddress;
	glfwSetMouseButtonCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetCursorPosCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWcursorposfun cbfun = (GLFWcursorposfun)(intptr_t)cbfunAddress;
	glfwSetCursorPosCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetCursorEnterCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWcursorenterfun cbfun = (GLFWcursorenterfun)(intptr_t)cbfunAddress;
	glfwSetCursorEnterCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetScrollCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWscrollfun cbfun = (GLFWscrollfun)(intptr_t)cbfunAddress;
	glfwSetScrollCallback(window, cbfun);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwGetJoystickParam(JNIEnv *__env, jclass clazz, jint joy, jint param) {
	return (jint)glfwGetJoystickParam(joy, param);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetJoystickAxes(JNIEnv *__env, jclass clazz, jint joy, jlong axesAddress, jint numaxes) {
	float *axes = (float *)(intptr_t)axesAddress;
	return (jint)glfwGetJoystickAxes(joy, axes, numaxes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetJoystickButtons(JNIEnv *__env, jclass clazz, jint joy, jlong buttonsAddress, jint numbuttons) {
	unsigned char *buttons = (unsigned char *)(intptr_t)buttonsAddress;
	return (jint)glfwGetJoystickButtons(joy, buttons, numbuttons);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetJoystickName(JNIEnv *__env, jclass clazz, jint joy) {
	return (jlong)(intptr_t)glfwGetJoystickName(joy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetClipboardString(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong stringAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	const char *string = (const char *)(intptr_t)stringAddress;
	glfwSetClipboardString(window, string);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetClipboardString(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	return (jlong)(intptr_t)glfwGetClipboardString(window);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwGetTime(JNIEnv *__env, jclass clazz) {
	return (jdouble)glfwGetTime();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwSetTime(JNIEnv *__env, jclass clazz, jdouble time) {
	glfwSetTime(time);
}