/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glGetPerfMonitorGroupsAMDPROC) (GLint *, GLsizei, GLuint *);
typedef void (APIENTRY *glGetPerfMonitorCountersAMDPROC) (GLuint, GLint *, GLint *, GLsizei, GLuint *);
typedef void (APIENTRY *glGetPerfMonitorGroupStringAMDPROC) (GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetPerfMonitorCounterStringAMDPROC) (GLuint, GLuint, GLsizei, GLsizei *, GLchar *);
typedef void (APIENTRY *glGetPerfMonitorCounterInfoAMDPROC) (GLuint, GLuint, GLenum, void *);
typedef void (APIENTRY *glGenPerfMonitorsAMDPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glDeletePerfMonitorsAMDPROC) (GLsizei, GLuint *);
typedef void (APIENTRY *glSelectPerfMonitorCountersAMDPROC) (GLuint, GLboolean, GLuint, GLint, GLuint *);
typedef void (APIENTRY *glBeginPerfMonitorAMDPROC) (GLuint);
typedef void (APIENTRY *glEndPerfMonitorAMDPROC) (GLuint);
typedef void (APIENTRY *glGetPerfMonitorCounterDataAMDPROC) (GLuint, GLenum, GLsizei, GLuint *, GLint *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglGetPerfMonitorGroupsAMD(JNIEnv *__env, jclass clazz, jlong numGroupsAddress, jint groupsSize, jlong groupsAddress, jlong __functionAddress) {
	GLint *numGroups = (GLint *)(intptr_t)numGroupsAddress;
	GLuint *groups = (GLuint *)(intptr_t)groupsAddress;
	glGetPerfMonitorGroupsAMDPROC glGetPerfMonitorGroupsAMD = (glGetPerfMonitorGroupsAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfMonitorGroupsAMD(numGroups, groupsSize, groups);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglGetPerfMonitorCountersAMD(JNIEnv *__env, jclass clazz, jint group, jlong numCountersAddress, jlong maxActiveCountersAddress, jint counterSize, jlong countersAddress, jlong __functionAddress) {
	GLint *numCounters = (GLint *)(intptr_t)numCountersAddress;
	GLint *maxActiveCounters = (GLint *)(intptr_t)maxActiveCountersAddress;
	GLuint *counters = (GLuint *)(intptr_t)countersAddress;
	glGetPerfMonitorCountersAMDPROC glGetPerfMonitorCountersAMD = (glGetPerfMonitorCountersAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfMonitorCountersAMD(group, numCounters, maxActiveCounters, counterSize, counters);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglGetPerfMonitorGroupStringAMD(JNIEnv *__env, jclass clazz, jint group, jint bufSize, jlong lengthAddress, jlong groupStringAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *groupString = (GLchar *)(intptr_t)groupStringAddress;
	glGetPerfMonitorGroupStringAMDPROC glGetPerfMonitorGroupStringAMD = (glGetPerfMonitorGroupStringAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfMonitorGroupStringAMD(group, bufSize, length, groupString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglGetPerfMonitorCounterStringAMD(JNIEnv *__env, jclass clazz, jint group, jint counter, jint bufSize, jlong lengthAddress, jlong counterStringAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *counterString = (GLchar *)(intptr_t)counterStringAddress;
	glGetPerfMonitorCounterStringAMDPROC glGetPerfMonitorCounterStringAMD = (glGetPerfMonitorCounterStringAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfMonitorCounterStringAMD(group, counter, bufSize, length, counterString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglGetPerfMonitorCounterInfoAMD(JNIEnv *__env, jclass clazz, jint group, jint counter, jint pname, jlong dataAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	glGetPerfMonitorCounterInfoAMDPROC glGetPerfMonitorCounterInfoAMD = (glGetPerfMonitorCounterInfoAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfMonitorCounterInfoAMD(group, counter, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglGenPerfMonitorsAMD(JNIEnv *__env, jclass clazz, jint n, jlong monitorsAddress, jlong __functionAddress) {
	GLuint *monitors = (GLuint *)(intptr_t)monitorsAddress;
	glGenPerfMonitorsAMDPROC glGenPerfMonitorsAMD = (glGenPerfMonitorsAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenPerfMonitorsAMD(n, monitors);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglDeletePerfMonitorsAMD(JNIEnv *__env, jclass clazz, jint n, jlong monitorsAddress, jlong __functionAddress) {
	GLuint *monitors = (GLuint *)(intptr_t)monitorsAddress;
	glDeletePerfMonitorsAMDPROC glDeletePerfMonitorsAMD = (glDeletePerfMonitorsAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeletePerfMonitorsAMD(n, monitors);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglSelectPerfMonitorCountersAMD(JNIEnv *__env, jclass clazz, jint monitor, jboolean enable, jint group, jint numCounters, jlong counterListAddress, jlong __functionAddress) {
	GLuint *counterList = (GLuint *)(intptr_t)counterListAddress;
	glSelectPerfMonitorCountersAMDPROC glSelectPerfMonitorCountersAMD = (glSelectPerfMonitorCountersAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSelectPerfMonitorCountersAMD(monitor, enable, group, numCounters, counterList);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglBeginPerfMonitorAMD(JNIEnv *__env, jclass clazz, jint monitor, jlong __functionAddress) {
	glBeginPerfMonitorAMDPROC glBeginPerfMonitorAMD = (glBeginPerfMonitorAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBeginPerfMonitorAMD(monitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglEndPerfMonitorAMD(JNIEnv *__env, jclass clazz, jint monitor, jlong __functionAddress) {
	glEndPerfMonitorAMDPROC glEndPerfMonitorAMD = (glEndPerfMonitorAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndPerfMonitorAMD(monitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDPerformanceMonitor_nglGetPerfMonitorCounterDataAMD(JNIEnv *__env, jclass clazz, jint monitor, jint pname, jint dataSize, jlong dataAddress, jlong bytesWrittenAddress, jlong __functionAddress) {
	GLuint *data = (GLuint *)(intptr_t)dataAddress;
	GLint *bytesWritten = (GLint *)(intptr_t)bytesWrittenAddress;
	glGetPerfMonitorCounterDataAMDPROC glGetPerfMonitorCounterDataAMD = (glGetPerfMonitorCounterDataAMDPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPerfMonitorCounterDataAMD(monitor, pname, dataSize, data, bytesWritten);
}

EXTERN_C_EXIT
