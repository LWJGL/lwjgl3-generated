/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "glfw3.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwInit(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)glfwInit();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwTerminate(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	glfwTerminate();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetVersion(JNIEnv *__env, jclass clazz, jlong majorAddress, jlong minorAddress, jlong revAddress) {
	int *major = (int *)(intptr_t)majorAddress;
	int *minor = (int *)(intptr_t)minorAddress;
	int *rev = (int *)(intptr_t)revAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwGetVersion(major, minor, rev);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetVersionString(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetVersionString();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetErrorCallback(JNIEnv *__env, jclass clazz, jlong cbfunAddress) {
	GLFWerrorfun cbfun = (GLFWerrorfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetErrorCallback(cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMonitors(JNIEnv *__env, jclass clazz, jlong countAddress) {
	int *count = (int *)(intptr_t)countAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetMonitors(count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwGetPrimaryMonitor(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetPrimaryMonitor();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMonitorPos(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong xposAddress, jlong yposAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	int *xpos = (int *)(intptr_t)xposAddress;
	int *ypos = (int *)(intptr_t)yposAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwGetMonitorPos(monitor, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMonitorPhysicalSize(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong widthAddress, jlong heightAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwGetMonitorPhysicalSize(monitor, width, height);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMonitorName(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetMonitorName(monitor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetMonitorCallback(JNIEnv *__env, jclass clazz, jlong cbfunAddress) {
	GLFWmonitorfun cbfun = (GLFWmonitorfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetMonitorCallback(cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetVideoModes(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong countAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	int *count = (int *)(intptr_t)countAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetVideoModes(monitor, count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetVideoMode(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetVideoMode(monitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetGamma(JNIEnv *__env, jclass clazz, jlong monitorAddress, jfloat gamma) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetGamma(monitor, gamma);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetGammaRamp(JNIEnv *__env, jclass clazz, jlong monitorAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetGammaRamp(monitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetGammaRamp(JNIEnv *__env, jclass clazz, jlong monitorAddress, jlong rampAddress) {
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	const GLFWgammaramp *ramp = (const GLFWgammaramp *)(intptr_t)rampAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetGammaRamp(monitor, ramp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwDefaultWindowHints(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	glfwDefaultWindowHints();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwWindowHint(JNIEnv *__env, jclass clazz, jint target, jint hint) {
	UNUSED_PARAMS(__env, clazz)
	glfwWindowHint(target, hint);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwCreateWindow(JNIEnv *__env, jclass clazz, jint width, jint height, jlong titleAddress, jlong monitorAddress, jlong shareAddress) {
	const char *title = (const char *)(intptr_t)titleAddress;
	GLFWmonitor *monitor = (GLFWmonitor *)(intptr_t)monitorAddress;
	GLFWwindow *share = (GLFWwindow *)(intptr_t)shareAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwCreateWindow(width, height, title, monitor, share);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwDestroyWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwDestroyWindow(window);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwWindowShouldClose(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glfwWindowShouldClose(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowShouldClose(JNIEnv *__env, jclass clazz, jlong windowAddress, jint value) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetWindowShouldClose(window, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowTitle(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong titleAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	const char *title = (const char *)(intptr_t)titleAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetWindowTitle(window, title);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong xposAddress, jlong yposAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	int *xpos = (int *)(intptr_t)xposAddress;
	int *ypos = (int *)(intptr_t)yposAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwGetWindowPos(window, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jint xpos, jint ypos) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetWindowPos(window, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowSize(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong widthAddress, jlong heightAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwGetWindowSize(window, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowSize(JNIEnv *__env, jclass clazz, jlong windowAddress, jint width, jint height) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetWindowSize(window, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetFramebufferSize(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong widthAddress, jlong heightAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwGetFramebufferSize(window, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwIconifyWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwIconifyWindow(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwRestoreWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwRestoreWindow(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwShowWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwShowWindow(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwHideWindow(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwHideWindow(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowMonitor(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetWindowMonitor(window);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowAttrib(JNIEnv *__env, jclass clazz, jlong windowAddress, jint attrib) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glfwGetWindowAttrib(window, attrib);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowUserPointer(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong pointerAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	void *pointer = (void *)(intptr_t)pointerAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetWindowUserPointer(window, pointer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowUserPointer(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetWindowUserPointer(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowPosCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowposfun cbfun = (GLFWwindowposfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetWindowPosCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowSizeCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowsizefun cbfun = (GLFWwindowsizefun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetWindowSizeCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowCloseCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowclosefun cbfun = (GLFWwindowclosefun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetWindowCloseCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowRefreshCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowrefreshfun cbfun = (GLFWwindowrefreshfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetWindowRefreshCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowFocusCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowfocusfun cbfun = (GLFWwindowfocusfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetWindowFocusCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetWindowIconifyCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWwindowiconifyfun cbfun = (GLFWwindowiconifyfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetWindowIconifyCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetFramebufferSizeCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWframebuffersizefun cbfun = (GLFWframebuffersizefun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetFramebufferSizeCallback(window, cbfun);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwPollEvents(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	glfwPollEvents();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwWaitEvents(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	glfwWaitEvents();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetInputMode(JNIEnv *__env, jclass clazz, jlong windowAddress, jint mode) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glfwGetInputMode(window, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetInputMode(JNIEnv *__env, jclass clazz, jlong windowAddress, jint mode, jint value) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetInputMode(window, mode, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetKey(JNIEnv *__env, jclass clazz, jlong windowAddress, jint key) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glfwGetKey(window, key);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetMouseButton(JNIEnv *__env, jclass clazz, jlong windowAddress, jint button) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glfwGetMouseButton(window, button);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetCursorPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong xposAddress, jlong yposAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	double *xpos = (double *)(intptr_t)xposAddress;
	double *ypos = (double *)(intptr_t)yposAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwGetCursorPos(window, xpos, ypos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetCursorPos(JNIEnv *__env, jclass clazz, jlong windowAddress, jdouble xpos, jdouble ypos) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetCursorPos(window, xpos, ypos);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetKeyCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWkeyfun cbfun = (GLFWkeyfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetKeyCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetCharCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWcharfun cbfun = (GLFWcharfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetCharCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetMouseButtonCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWmousebuttonfun cbfun = (GLFWmousebuttonfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetMouseButtonCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetCursorPosCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWcursorposfun cbfun = (GLFWcursorposfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetCursorPosCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetCursorEnterCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWcursorenterfun cbfun = (GLFWcursorenterfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetCursorEnterCallback(window, cbfun);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetScrollCallback(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong cbfunAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	GLFWscrollfun cbfun = (GLFWscrollfun)(intptr_t)cbfunAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwSetScrollCallback(window, cbfun);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwJoystickPresent(JNIEnv *__env, jclass clazz, jint joy) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)glfwJoystickPresent(joy);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetJoystickAxes(JNIEnv *__env, jclass clazz, jint joy, jlong countAddress) {
	int *count = (int *)(intptr_t)countAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetJoystickAxes(joy, count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetJoystickButtons(JNIEnv *__env, jclass clazz, jint joy, jlong countAddress) {
	int *count = (int *)(intptr_t)countAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetJoystickButtons(joy, count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetJoystickName(JNIEnv *__env, jclass clazz, jint joy) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetJoystickName(joy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSetClipboardString(JNIEnv *__env, jclass clazz, jlong windowAddress, jlong stringAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	const char *string = (const char *)(intptr_t)stringAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSetClipboardString(window, string);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwGetClipboardString(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetClipboardString(window);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwGetTime(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jdouble)glfwGetTime();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwSetTime(JNIEnv *__env, jclass clazz, jdouble time) {
	UNUSED_PARAMS(__env, clazz)
	glfwSetTime(time);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwMakeContextCurrent(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwMakeContextCurrent(window);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwGetCurrentContext(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glfwGetCurrentContext();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwSwapBuffers(JNIEnv *__env, jclass clazz, jlong windowAddress) {
	GLFWwindow *window = (GLFWwindow *)(intptr_t)windowAddress;
	UNUSED_PARAMS(__env, clazz)
	glfwSwapBuffers(window);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_GLFW_glfwSwapInterval(JNIEnv *__env, jclass clazz, jint interval) {
	UNUSED_PARAMS(__env, clazz)
	glfwSwapInterval(interval);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_glfw_GLFW_nglfwExtensionSupported(JNIEnv *__env, jclass clazz, jlong extensionAddress) {
	const char *extension = (const char *)(intptr_t)extensionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glfwExtensionSupported(extension);
}

EXTERN_C_EXIT
