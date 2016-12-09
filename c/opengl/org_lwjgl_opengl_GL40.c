/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendEquationiPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateiPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFunciPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDrawArraysIndirectPROC) (jint, const intptr_t);
typedef void (APIENTRY *glDrawElementsIndirectPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform1dPROC) (jint, jdouble);
typedef void (APIENTRY *glUniform2dPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glUniform3dPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glUniform4dPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glUniform1dvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2dvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3dvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4dvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniformMatrix2dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix3dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix4dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix2x3dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix2x4dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix3x2dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix3x4dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix4x2dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix4x3dvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glGetUniformdvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glMinSampleShadingPROC) (jfloat);
typedef jint (APIENTRY *glGetSubroutineUniformLocationPROC) (jint, jint, const intptr_t);
typedef jint (APIENTRY *glGetSubroutineIndexPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetActiveSubroutineUniformivPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetActiveSubroutineUniformNamePROC) (jint, jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetActiveSubroutineNamePROC) (jint, jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glUniformSubroutinesuivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetUniformSubroutineuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramStageivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glPatchParameteriPROC) (jint, jint);
typedef void (APIENTRY *glPatchParameterfvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glBindTransformFeedbackPROC) (jint, jint);
typedef void (APIENTRY *glDeleteTransformFeedbacksPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenTransformFeedbacksPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsTransformFeedbackPROC) (jint);
typedef void (APIENTRY *glPauseTransformFeedbackPROC) (void);
typedef void (APIENTRY *glResumeTransformFeedbackPROC) (void);
typedef void (APIENTRY *glDrawTransformFeedbackPROC) (jint, jint);
typedef void (APIENTRY *glDrawTransformFeedbackStreamPROC) (jint, jint, jint);
typedef void (APIENTRY *glBeginQueryIndexedPROC) (jint, jint, jint);
typedef void (APIENTRY *glEndQueryIndexedPROC) (jint, jint);
typedef void (APIENTRY *glGetQueryIndexedivPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBlendEquationi(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
	glBlendEquationiPROC glBlendEquationi = (glBlendEquationiPROC)tlsGetFunction(75);
	UNUSED_PARAM(clazz)
	glBlendEquationi(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBlendEquationSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
	glBlendEquationSeparateiPROC glBlendEquationSeparatei = (glBlendEquationSeparateiPROC)tlsGetFunction(73);
	UNUSED_PARAM(clazz)
	glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBlendFunci(JNIEnv *__env, jclass clazz, jint buf, jint sfactor, jint dfactor) {
	glBlendFunciPROC glBlendFunci = (glBlendFunciPROC)tlsGetFunction(84);
	UNUSED_PARAM(clazz)
	glBlendFunci(buf, sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBlendFuncSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
	glBlendFuncSeparateiPROC glBlendFuncSeparatei = (glBlendFuncSeparateiPROC)tlsGetFunction(82);
	UNUSED_PARAM(clazz)
	glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDrawArraysIndirect__IJ(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress) {
	glDrawArraysIndirectPROC glDrawArraysIndirect = (glDrawArraysIndirectPROC)tlsGetFunction(345);
	const intptr_t indirect = (const intptr_t)indirectAddress;
	UNUSED_PARAM(clazz)
	glDrawArraysIndirect(mode, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDrawElementsIndirect__IIJ(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress) {
	glDrawElementsIndirectPROC glDrawElementsIndirect = (glDrawElementsIndirectPROC)tlsGetFunction(359);
	const intptr_t indirect = (const intptr_t)indirectAddress;
	UNUSED_PARAM(clazz)
	glDrawElementsIndirect(mode, type, indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform1d(JNIEnv *__env, jclass clazz, jint location, jdouble x) {
	glUniform1dPROC glUniform1d = (glUniform1dPROC)tlsGetFunction(1694);
	UNUSED_PARAM(clazz)
	glUniform1d(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform2d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y) {
	glUniform2dPROC glUniform2d = (glUniform2dPROC)tlsGetFunction(1716);
	UNUSED_PARAM(clazz)
	glUniform2d(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform3d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jdouble z) {
	glUniform3dPROC glUniform3d = (glUniform3dPROC)tlsGetFunction(1738);
	UNUSED_PARAM(clazz)
	glUniform3d(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform4d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jdouble z, jdouble w) {
	glUniform4dPROC glUniform4d = (glUniform4dPROC)tlsGetFunction(1760);
	UNUSED_PARAM(clazz)
	glUniform4d(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform1dv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform1dvPROC glUniform1dv = (glUniform1dvPROC)tlsGetFunction(1695);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform1dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform2dv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform2dvPROC glUniform2dv = (glUniform2dvPROC)tlsGetFunction(1717);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform2dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform3dv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform3dvPROC glUniform3dv = (glUniform3dvPROC)tlsGetFunction(1739);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform3dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniform4dv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
	glUniform4dvPROC glUniform4dv = (glUniform4dvPROC)tlsGetFunction(1761);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniform4dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix2dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix2dvPROC glUniformMatrix2dv = (glUniformMatrix2dvPROC)tlsGetFunction(1788);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix3dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix3dvPROC glUniformMatrix3dv = (glUniformMatrix3dvPROC)tlsGetFunction(1795);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix4dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix4dvPROC glUniformMatrix4dv = (glUniformMatrix4dvPROC)tlsGetFunction(1802);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix2x3dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix2x3dvPROC glUniformMatrix2x3dv = (glUniformMatrix2x3dvPROC)tlsGetFunction(1791);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix2x3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix2x4dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix2x4dvPROC glUniformMatrix2x4dv = (glUniformMatrix2x4dvPROC)tlsGetFunction(1793);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix2x4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix3x2dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix3x2dvPROC glUniformMatrix3x2dv = (glUniformMatrix3x2dvPROC)tlsGetFunction(1798);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix3x2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix3x4dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix3x4dvPROC glUniformMatrix3x4dv = (glUniformMatrix3x4dvPROC)tlsGetFunction(1800);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix3x4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix4x2dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix4x2dvPROC glUniformMatrix4x2dv = (glUniformMatrix4x2dvPROC)tlsGetFunction(1805);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix4x2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformMatrix4x3dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
	glUniformMatrix4x3dvPROC glUniformMatrix4x3dv = (glUniformMatrix4x3dvPROC)tlsGetFunction(1807);
	const intptr_t value = (const intptr_t)valueAddress;
	UNUSED_PARAM(clazz)
	glUniformMatrix4x3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetUniformdv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
	glGetUniformdvPROC glGetUniformdv = (glGetUniformdvPROC)tlsGetFunction(751);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformdv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglMinSampleShading(JNIEnv *__env, jclass clazz, jfloat value) {
	glMinSampleShadingPROC glMinSampleShading = (glMinSampleShadingPROC)tlsGetFunction(980);
	UNUSED_PARAM(clazz)
	glMinSampleShading(value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL40_nglGetSubroutineUniformLocation(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong nameAddress) {
	glGetSubroutineUniformLocationPROC glGetSubroutineUniformLocation = (glGetSubroutineUniformLocationPROC)tlsGetFunction(703);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetSubroutineUniformLocation(program, shadertype, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL40_nglGetSubroutineIndex(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong nameAddress) {
	glGetSubroutineIndexPROC glGetSubroutineIndex = (glGetSubroutineIndexPROC)tlsGetFunction(702);
	const intptr_t name = (const intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	return (jint)glGetSubroutineIndex(program, shadertype, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetActiveSubroutineUniformiv__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint pname, jlong valuesAddress) {
	glGetActiveSubroutineUniformivPROC glGetActiveSubroutineUniformiv = (glGetActiveSubroutineUniformivPROC)tlsGetFunction(494);
	intptr_t values = (intptr_t)valuesAddress;
	UNUSED_PARAM(clazz)
	glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetActiveSubroutineUniformName__IIIIJJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint bufsize, jlong lengthAddress, jlong nameAddress) {
	glGetActiveSubroutineUniformNamePROC glGetActiveSubroutineUniformName = (glGetActiveSubroutineUniformNamePROC)tlsGetFunction(493);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t name = (intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetActiveSubroutineName__IIIIJJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint bufsize, jlong lengthAddress, jlong nameAddress) {
	glGetActiveSubroutineNamePROC glGetActiveSubroutineName = (glGetActiveSubroutineNamePROC)tlsGetFunction(492);
	intptr_t length = (intptr_t)lengthAddress;
	intptr_t name = (intptr_t)nameAddress;
	UNUSED_PARAM(clazz)
	glGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglUniformSubroutinesuiv__IIJ(JNIEnv *__env, jclass clazz, jint shadertype, jint count, jlong indicesAddress) {
	glUniformSubroutinesuivPROC glUniformSubroutinesuiv = (glUniformSubroutinesuivPROC)tlsGetFunction(1809);
	const intptr_t indices = (const intptr_t)indicesAddress;
	UNUSED_PARAM(clazz)
	glUniformSubroutinesuiv(shadertype, count, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetUniformSubroutineuiv__IIJ(JNIEnv *__env, jclass clazz, jint shadertype, jint location, jlong paramsAddress) {
	glGetUniformSubroutineuivPROC glGetUniformSubroutineuiv = (glGetUniformSubroutineuivPROC)tlsGetFunction(750);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetUniformSubroutineuiv(shadertype, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetProgramStageiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint pname, jlong valuesAddress) {
	glGetProgramStageivPROC glGetProgramStageiv = (glGetProgramStageivPROC)tlsGetFunction(668);
	intptr_t values = (intptr_t)valuesAddress;
	UNUSED_PARAM(clazz)
	glGetProgramStageiv(program, shadertype, pname, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglPatchParameteri(JNIEnv *__env, jclass clazz, jint pname, jint value) {
	glPatchParameteriPROC glPatchParameteri = (glPatchParameteriPROC)tlsGetFunction(1182);
	UNUSED_PARAM(clazz)
	glPatchParameteri(pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglPatchParameterfv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong valuesAddress) {
	glPatchParameterfvPROC glPatchParameterfv = (glPatchParameterfvPROC)tlsGetFunction(1181);
	const intptr_t values = (const intptr_t)valuesAddress;
	UNUSED_PARAM(clazz)
	glPatchParameterfv(pname, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBindTransformFeedback(JNIEnv *__env, jclass clazz, jint target, jint id) {
	glBindTransformFeedbackPROC glBindTransformFeedback = (glBindTransformFeedbackPROC)tlsGetFunction(57);
	UNUSED_PARAM(clazz)
	glBindTransformFeedback(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDeleteTransformFeedbacks__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glDeleteTransformFeedbacksPROC glDeleteTransformFeedbacks = (glDeleteTransformFeedbacksPROC)tlsGetFunction(316);
	const intptr_t ids = (const intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glDeleteTransformFeedbacks(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGenTransformFeedbacks__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
	glGenTransformFeedbacksPROC glGenTransformFeedbacks = (glGenTransformFeedbacksPROC)tlsGetFunction(481);
	intptr_t ids = (intptr_t)idsAddress;
	UNUSED_PARAM(clazz)
	glGenTransformFeedbacks(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL40_nglIsTransformFeedback(JNIEnv *__env, jclass clazz, jint id) {
	glIsTransformFeedbackPROC glIsTransformFeedback = (glIsTransformFeedbackPROC)tlsGetFunction(886);
	UNUSED_PARAM(clazz)
	return (jboolean)glIsTransformFeedback(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglPauseTransformFeedback(JNIEnv *__env, jclass clazz) {
	glPauseTransformFeedbackPROC glPauseTransformFeedback = (glPauseTransformFeedbackPROC)tlsGetFunction(1204);
	UNUSED_PARAM(clazz)
	glPauseTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglResumeTransformFeedback(JNIEnv *__env, jclass clazz) {
	glResumeTransformFeedbackPROC glResumeTransformFeedback = (glResumeTransformFeedbackPROC)tlsGetFunction(1455);
	UNUSED_PARAM(clazz)
	glResumeTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDrawTransformFeedback(JNIEnv *__env, jclass clazz, jint mode, jint id) {
	glDrawTransformFeedbackPROC glDrawTransformFeedback = (glDrawTransformFeedbackPROC)tlsGetFunction(370);
	UNUSED_PARAM(clazz)
	glDrawTransformFeedback(mode, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglDrawTransformFeedbackStream(JNIEnv *__env, jclass clazz, jint mode, jint id, jint stream) {
	glDrawTransformFeedbackStreamPROC glDrawTransformFeedbackStream = (glDrawTransformFeedbackStreamPROC)tlsGetFunction(373);
	UNUSED_PARAM(clazz)
	glDrawTransformFeedbackStream(mode, id, stream);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglBeginQueryIndexed(JNIEnv *__env, jclass clazz, jint target, jint index, jint id) {
	glBeginQueryIndexedPROC glBeginQueryIndexed = (glBeginQueryIndexedPROC)tlsGetFunction(21);
	UNUSED_PARAM(clazz)
	glBeginQueryIndexed(target, index, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglEndQueryIndexed(JNIEnv *__env, jclass clazz, jint target, jint index) {
	glEndQueryIndexedPROC glEndQueryIndexed = (glEndQueryIndexedPROC)tlsGetFunction(400);
	UNUSED_PARAM(clazz)
	glEndQueryIndexed(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL40_nglGetQueryIndexediv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jint pname, jlong paramsAddress) {
	glGetQueryIndexedivPROC glGetQueryIndexediv = (glGetQueryIndexedivPROC)tlsGetFunction(676);
	intptr_t params = (intptr_t)paramsAddress;
	UNUSED_PARAM(clazz)
	glGetQueryIndexediv(target, index, pname, params);
}

EXTERN_C_EXIT