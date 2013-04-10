/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glClearBufferDataPROC) (GLenum, GLenum, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glClearBufferSubDataPROC) (GLenum, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glDispatchComputePROC) (GLuint, GLuint, GLuint);
typedef GLvoid (APIENTRY *glDispatchComputeIndirectPROC) (GLintptr);
typedef GLvoid (APIENTRY *glCopyImageSubDataPROC) (GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glDebugMessageControlPROC) (GLenum, GLenum, GLenum, GLsizei, const GLuint *, GLboolean);
typedef GLvoid (APIENTRY *glDebugMessageInsertPROC) (GLenum, GLenum, GLuint, GLenum, GLsizei, const GLchar *);
typedef GLvoid (APIENTRY *glDebugMessageCallbackPROC) (GLDEBUGPROC, void *);
typedef GLuint (APIENTRY *glGetDebugMessageLogPROC) (GLuint, GLsizei, GLenum *, GLenum *, GLuint *, GLenum *, GLsizei *, GLchar *);
typedef GLvoid (APIENTRY *glPushDebugGroupPROC) (GLenum, GLuint, GLsizei, const GLchar *);
typedef GLvoid (APIENTRY *glObjectLabelPROC) (GLenum, GLuint, GLsizei, const GLchar *);
typedef GLvoid (APIENTRY *glGetObjectLabelPROC) (GLenum, GLuint, GLsizei, GLsizei *, GLchar *);
typedef GLvoid (APIENTRY *glObjectPtrLabelPROC) (void *, GLsizei, const GLchar *);
typedef GLvoid (APIENTRY *glGetObjectPtrLabelPROC) (void *, GLsizei, GLsizei *, GLchar *);
typedef GLvoid (APIENTRY *glFramebufferParameteriPROC) (GLenum, GLenum, GLint);
typedef GLvoid (APIENTRY *glGetFramebufferParameterivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetInternalformati64vPROC) (GLenum, GLenum, GLenum, GLsizei, GLint64 *);
typedef GLvoid (APIENTRY *glInvalidateTexSubImagePROC) (GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glInvalidateTexImagePROC) (GLuint, GLint);
typedef GLvoid (APIENTRY *glInvalidateBufferSubDataPROC) (GLuint, GLintptr, GLsizeiptr);
typedef GLvoid (APIENTRY *glInvalidateBufferDataPROC) (GLuint);
typedef GLvoid (APIENTRY *glInvalidateFramebufferPROC) (GLenum, GLsizei, const GLenum *);
typedef GLvoid (APIENTRY *glInvalidateSubFramebufferPROC) (GLenum, GLsizei, const GLenum *, GLint, GLint, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glMultiDrawArraysIndirectPROC) (GLenum, const GLvoid *, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glMultiDrawElementsIndirectPROC) (GLenum, GLenum, const GLvoid *, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glGetProgramInterfaceivPROC) (GLuint, GLenum, GLenum, GLint *);
typedef GLuint (APIENTRY *glGetProgramResourceIndexPROC) (GLuint, GLenum, const GLchar *);
typedef GLvoid (APIENTRY *glGetProgramResourceNamePROC) (GLuint, GLenum, GLuint, GLsizei, GLsizei *, GLchar *);
typedef GLvoid (APIENTRY *glGetProgramResourceivPROC) (GLuint, GLenum, GLuint, GLsizei, const GLenum *, GLsizei, GLsizei *, GLint *);
typedef GLint (APIENTRY *glGetProgramResourceLocationPROC) (GLuint, GLenum, const GLchar *);
typedef GLint (APIENTRY *glGetProgramResourceLocationIndexPROC) (GLuint, GLenum, const GLchar *);
typedef GLvoid (APIENTRY *glShaderStorageBlockBindingPROC) (GLuint, GLuint, GLuint);
typedef GLvoid (APIENTRY *glTexBufferRangePROC) (GLenum, GLenum, GLuint, GLintptr, GLsizeiptr);
typedef GLvoid (APIENTRY *glTexStorage2DMultisamplePROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTexStorage3DMultisamplePROC) (GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean);
typedef GLvoid (APIENTRY *glTextureViewPROC) (GLuint, GLenum, GLuint, GLenum, GLuint, GLuint, GLuint, GLuint);
typedef GLvoid (APIENTRY *glBindVertexBufferPROC) (GLuint, GLuint, GLintptr, GLsizei);
typedef GLvoid (APIENTRY *glVertexAttribFormatPROC) (GLuint, GLint, GLenum, GLboolean, GLuint);
typedef GLvoid (APIENTRY *glVertexAttribIFormatPROC) (GLuint, GLint, GLenum, GLuint);
typedef GLvoid (APIENTRY *glVertexAttribLFormatPROC) (GLuint, GLint, GLenum, GLuint);
typedef GLvoid (APIENTRY *glVertexAttribBindingPROC) (GLuint, GLuint);
typedef GLvoid (APIENTRY *glVertexBindingDivisorPROC) (GLuint, GLuint);

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglClearBufferData(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const GLvoid *data = (const GLvoid *)(intptr_t)dataAddress;
	glClearBufferDataPROC glClearBufferData = (glClearBufferDataPROC)(intptr_t)__functionAddress;
	glClearBufferData(target, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglClearBufferSubData(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress, jlong __functionAddress) {
	const GLvoid *data = (const GLvoid *)(intptr_t)dataAddress;
	glClearBufferSubDataPROC glClearBufferSubData = (glClearBufferSubDataPROC)(intptr_t)__functionAddress;
	glClearBufferSubData(target, internalformat, (GLintptr)offset, (GLsizeiptr)size, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDispatchCompute(JNIEnv *__env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z, jlong __functionAddress) {
	glDispatchComputePROC glDispatchCompute = (glDispatchComputePROC)(intptr_t)__functionAddress;
	glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDispatchComputeIndirect(JNIEnv *__env, jclass clazz, jlong indirect, jlong __functionAddress) {
	glDispatchComputeIndirectPROC glDispatchComputeIndirect = (glDispatchComputeIndirectPROC)(intptr_t)__functionAddress;
	glDispatchComputeIndirect((GLintptr)indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglCopyImageSubData(JNIEnv *__env, jclass clazz, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth, jlong __functionAddress) {
	glCopyImageSubDataPROC glCopyImageSubData = (glCopyImageSubDataPROC)(intptr_t)__functionAddress;
	glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDebugMessageControl(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled, jlong __functionAddress) {
	const GLuint *ids = (const GLuint *)(intptr_t)idsAddress;
	glDebugMessageControlPROC glDebugMessageControl = (glDebugMessageControlPROC)(intptr_t)__functionAddress;
	glDebugMessageControl(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDebugMessageInsert(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress, jlong __functionAddress) {
	const GLchar *message = (const GLchar *)(intptr_t)messageAddress;
	glDebugMessageInsertPROC glDebugMessageInsert = (glDebugMessageInsertPROC)(intptr_t)__functionAddress;
	glDebugMessageInsert(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglDebugMessageCallback(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress, jlong __functionAddress) {
	GLDEBUGPROC callback = (GLDEBUGPROC)(intptr_t)callbackAddress;
	void *userParam = (void *)(intptr_t)userParamAddress;
	glDebugMessageCallbackPROC glDebugMessageCallback = (glDebugMessageCallbackPROC)(intptr_t)__functionAddress;
	glDebugMessageCallback(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL43_nglGetDebugMessageLog(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress, jlong __functionAddress) {
	GLenum *sources = (GLenum *)(intptr_t)sourcesAddress;
	GLenum *types = (GLenum *)(intptr_t)typesAddress;
	GLuint *ids = (GLuint *)(intptr_t)idsAddress;
	GLenum *severities = (GLenum *)(intptr_t)severitiesAddress;
	GLsizei *lengths = (GLsizei *)(intptr_t)lengthsAddress;
	GLchar *messageLog = (GLchar *)(intptr_t)messageLogAddress;
	glGetDebugMessageLogPROC glGetDebugMessageLog = (glGetDebugMessageLogPROC)(intptr_t)__functionAddress;
	return (jint)glGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglPushDebugGroup(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress, jlong __functionAddress) {
	const GLchar *message = (const GLchar *)(intptr_t)messageAddress;
	glPushDebugGroupPROC glPushDebugGroup = (glPushDebugGroupPROC)(intptr_t)__functionAddress;
	glPushDebugGroup(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress, jlong __functionAddress) {
	const GLchar *label = (const GLchar *)(intptr_t)labelAddress;
	glObjectLabelPROC glObjectLabel = (glObjectLabelPROC)(intptr_t)__functionAddress;
	glObjectLabel(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *label = (GLchar *)(intptr_t)labelAddress;
	glGetObjectLabelPROC glGetObjectLabel = (glGetObjectLabelPROC)(intptr_t)__functionAddress;
	glGetObjectLabel(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	const GLchar *label = (const GLchar *)(intptr_t)labelAddress;
	glObjectPtrLabelPROC glObjectPtrLabel = (glObjectPtrLabelPROC)(intptr_t)__functionAddress;
	glObjectPtrLabel(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress, jlong __functionAddress) {
	void *ptr = (void *)(intptr_t)ptrAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *label = (GLchar *)(intptr_t)labelAddress;
	glGetObjectPtrLabelPROC glGetObjectPtrLabel = (glGetObjectPtrLabelPROC)(intptr_t)__functionAddress;
	glGetObjectPtrLabel(ptr, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglFramebufferParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param, jlong __functionAddress) {
	glFramebufferParameteriPROC glFramebufferParameteri = (glFramebufferParameteriPROC)(intptr_t)__functionAddress;
	glFramebufferParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetFramebufferParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetFramebufferParameterivPROC glGetFramebufferParameteriv = (glGetFramebufferParameterivPROC)(intptr_t)__functionAddress;
	glGetFramebufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetInternalformati64v(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress, jlong __functionAddress) {
	GLint64 *params = (GLint64 *)(intptr_t)paramsAddress;
	glGetInternalformati64vPROC glGetInternalformati64v = (glGetInternalformati64vPROC)(intptr_t)__functionAddress;
	glGetInternalformati64v(target, internalformat, pname, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglInvalidateTexSubImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jlong __functionAddress) {
	glInvalidateTexSubImagePROC glInvalidateTexSubImage = (glInvalidateTexSubImagePROC)(intptr_t)__functionAddress;
	glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglInvalidateTexImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jlong __functionAddress) {
	glInvalidateTexImagePROC glInvalidateTexImage = (glInvalidateTexImagePROC)(intptr_t)__functionAddress;
	glInvalidateTexImage(texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglInvalidateBufferSubData(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jlong __functionAddress) {
	glInvalidateBufferSubDataPROC glInvalidateBufferSubData = (glInvalidateBufferSubDataPROC)(intptr_t)__functionAddress;
	glInvalidateBufferSubData(buffer, (GLintptr)offset, (GLsizeiptr)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglInvalidateBufferData(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glInvalidateBufferDataPROC glInvalidateBufferData = (glInvalidateBufferDataPROC)(intptr_t)__functionAddress;
	glInvalidateBufferData(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglInvalidateFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress, jlong __functionAddress) {
	const GLenum *attachments = (const GLenum *)(intptr_t)attachmentsAddress;
	glInvalidateFramebufferPROC glInvalidateFramebuffer = (glInvalidateFramebufferPROC)(intptr_t)__functionAddress;
	glInvalidateFramebuffer(target, numAttachments, attachments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglInvalidateSubFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	const GLenum *attachments = (const GLenum *)(intptr_t)attachmentsAddress;
	glInvalidateSubFramebufferPROC glInvalidateSubFramebuffer = (glInvalidateSubFramebufferPROC)(intptr_t)__functionAddress;
	glInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglMultiDrawArraysIndirect(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jint primcount, jint stride, jlong __functionAddress) {
	const GLvoid *indirect = (const GLvoid *)(intptr_t)indirectAddress;
	glMultiDrawArraysIndirectPROC glMultiDrawArraysIndirect = (glMultiDrawArraysIndirectPROC)(intptr_t)__functionAddress;
	glMultiDrawArraysIndirect(mode, indirect, primcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglMultiDrawElementsIndirect(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jint primcount, jint stride, jlong __functionAddress) {
	const GLvoid *indirect = (const GLvoid *)(intptr_t)indirectAddress;
	glMultiDrawElementsIndirectPROC glMultiDrawElementsIndirect = (glMultiDrawElementsIndirectPROC)(intptr_t)__functionAddress;
	glMultiDrawElementsIndirect(mode, type, indirect, primcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramInterfaceiv(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramInterfaceivPROC glGetProgramInterfaceiv = (glGetProgramInterfaceivPROC)(intptr_t)__functionAddress;
	glGetProgramInterfaceiv(program, programInterface, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceIndex(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetProgramResourceIndexPROC glGetProgramResourceIndex = (glGetProgramResourceIndexPROC)(intptr_t)__functionAddress;
	return (jint)glGetProgramResourceIndex(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceName(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint bufSize, jlong lengthAddress, jlong nameAddress, jlong __functionAddress) {
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLchar *name = (GLchar *)(intptr_t)nameAddress;
	glGetProgramResourceNamePROC glGetProgramResourceName = (glGetProgramResourceNamePROC)(intptr_t)__functionAddress;
	glGetProgramResourceName(program, programInterface, index, bufSize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceiv(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jlong propsAddress, jint bufSize, jlong lengthAddress, jlong paramsAddress, jlong __functionAddress) {
	const GLenum *props = (const GLenum *)(intptr_t)propsAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetProgramResourceivPROC glGetProgramResourceiv = (glGetProgramResourceivPROC)(intptr_t)__functionAddress;
	glGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceLocation(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetProgramResourceLocationPROC glGetProgramResourceLocation = (glGetProgramResourceLocationPROC)(intptr_t)__functionAddress;
	return (jint)glGetProgramResourceLocation(program, programInterface, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL43_nglGetProgramResourceLocationIndex(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress, jlong __functionAddress) {
	const GLchar *name = (const GLchar *)(intptr_t)nameAddress;
	glGetProgramResourceLocationIndexPROC glGetProgramResourceLocationIndex = (glGetProgramResourceLocationIndexPROC)(intptr_t)__functionAddress;
	return (jint)glGetProgramResourceLocationIndex(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglShaderStorageBlockBinding(JNIEnv *__env, jclass clazz, jint program, jint storageBlockIndex, jint storageBlockBinding, jlong __functionAddress) {
	glShaderStorageBlockBindingPROC glShaderStorageBlockBinding = (glShaderStorageBlockBindingPROC)(intptr_t)__functionAddress;
	glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglTexBufferRange(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size, jlong __functionAddress) {
	glTexBufferRangePROC glTexBufferRange = (glTexBufferRangePROC)(intptr_t)__functionAddress;
	glTexBufferRange(target, internalformat, buffer, (GLintptr)offset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglTexStorage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTexStorage2DMultisamplePROC glTexStorage2DMultisample = (glTexStorage2DMultisamplePROC)(intptr_t)__functionAddress;
	glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglTexStorage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations, jlong __functionAddress) {
	glTexStorage3DMultisamplePROC glTexStorage3DMultisample = (glTexStorage3DMultisamplePROC)(intptr_t)__functionAddress;
	glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglTextureView(JNIEnv *__env, jclass clazz, jint texture, jint target, jint origtexture, jint internalformat, jint minlevel, jint numlevels, jint minlayer, jint numlayers, jlong __functionAddress) {
	glTextureViewPROC glTextureView = (glTextureViewPROC)(intptr_t)__functionAddress;
	glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglBindVertexBuffer(JNIEnv *__env, jclass clazz, jint bindingindex, jint buffer, jlong offset, jint stride, jlong __functionAddress) {
	glBindVertexBufferPROC glBindVertexBuffer = (glBindVertexBufferPROC)(intptr_t)__functionAddress;
	glBindVertexBuffer(bindingindex, buffer, (GLintptr)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglVertexAttribFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset, jlong __functionAddress) {
	glVertexAttribFormatPROC glVertexAttribFormat = (glVertexAttribFormatPROC)(intptr_t)__functionAddress;
	glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglVertexAttribIFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset, jlong __functionAddress) {
	glVertexAttribIFormatPROC glVertexAttribIFormat = (glVertexAttribIFormatPROC)(intptr_t)__functionAddress;
	glVertexAttribIFormat(attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglVertexAttribLFormat(JNIEnv *__env, jclass clazz, jint attribindex, jint size, jint type, jint relativeoffset, jlong __functionAddress) {
	glVertexAttribLFormatPROC glVertexAttribLFormat = (glVertexAttribLFormatPROC)(intptr_t)__functionAddress;
	glVertexAttribLFormat(attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglVertexAttribBinding(JNIEnv *__env, jclass clazz, jint attribindex, jint bindingindex, jlong __functionAddress) {
	glVertexAttribBindingPROC glVertexAttribBinding = (glVertexAttribBindingPROC)(intptr_t)__functionAddress;
	glVertexAttribBinding(attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL43_nglVertexBindingDivisor(JNIEnv *__env, jclass clazz, jint index, jint divisor, jlong __functionAddress) {
	glVertexBindingDivisorPROC glVertexBindingDivisor = (glVertexBindingDivisorPROC)(intptr_t)__functionAddress;
	glVertexBindingDivisor(index, divisor);
}