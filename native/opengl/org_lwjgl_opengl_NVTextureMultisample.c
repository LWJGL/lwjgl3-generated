/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glTexImage2DMultisampleCoverageNVPROC) (GLenum, GLsizei, GLsizei, GLint, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTexImage3DMultisampleCoverageNVPROC) (GLenum, GLsizei, GLsizei, GLint, GLsizei, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTextureImage2DMultisampleNVPROC) (GLuint, GLenum, GLsizei, GLint, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTextureImage3DMultisampleNVPROC) (GLuint, GLenum, GLsizei, GLint, GLsizei, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTextureImage2DMultisampleCoverageNVPROC) (GLuint, GLenum, GLsizei, GLsizei, GLint, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTextureImage3DMultisampleCoverageNVPROC) (GLuint, GLenum, GLsizei, GLsizei, GLint, GLsizei, GLsizei, GLsizei, GLboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_nglTexImage2DMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint target, jint coverageSamples, jint colorSamples, jint internalFormat, jint width, jint height, jboolean fixedSampleLocations, jlong __functionAddress) {
	glTexImage2DMultisampleCoverageNVPROC glTexImage2DMultisampleCoverageNV = (glTexImage2DMultisampleCoverageNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage2DMultisampleCoverageNV(target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_nglTexImage3DMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint target, jint coverageSamples, jint colorSamples, jint internalFormat, jint width, jint height, jint depth, jboolean fixedSampleLocations, jlong __functionAddress) {
	glTexImage3DMultisampleCoverageNVPROC glTexImage3DMultisampleCoverageNV = (glTexImage3DMultisampleCoverageNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage3DMultisampleCoverageNV(target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_nglTextureImage2DMultisampleNV(JNIEnv *__env, jclass clazz, jint texture, jint target, jint samples, jint internalFormat, jint width, jint height, jboolean fixedSampleLocations, jlong __functionAddress) {
	glTextureImage2DMultisampleNVPROC glTextureImage2DMultisampleNV = (glTextureImage2DMultisampleNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureImage2DMultisampleNV(texture, target, samples, internalFormat, width, height, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_nglTextureImage3DMultisampleNV(JNIEnv *__env, jclass clazz, jint texture, jint target, jint samples, jint internalFormat, jint width, jint height, jint depth, jboolean fixedSampleLocations, jlong __functionAddress) {
	glTextureImage3DMultisampleNVPROC glTextureImage3DMultisampleNV = (glTextureImage3DMultisampleNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureImage3DMultisampleNV(texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_nglTextureImage2DMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint texture, jint target, jint coverageSamples, jint colorSamples, jint internalFormat, jint width, jint height, jboolean fixedSampleLocations, jlong __functionAddress) {
	glTextureImage2DMultisampleCoverageNVPROC glTextureImage2DMultisampleCoverageNV = (glTextureImage2DMultisampleCoverageNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureImage2DMultisampleCoverageNV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_nglTextureImage3DMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint texture, jint target, jint coverageSamples, jint colorSamples, jint internalFormat, jint width, jint height, jint depth, jboolean fixedSampleLocations, jlong __functionAddress) {
	glTextureImage3DMultisampleCoverageNVPROC glTextureImage3DMultisampleCoverageNV = (glTextureImage3DMultisampleCoverageNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureImage3DMultisampleCoverageNV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
}

EXTERN_C_EXIT
