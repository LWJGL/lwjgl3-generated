/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jint (APIENTRY *glCreateProgramPROC) (void);
typedef void (APIENTRY *glDeleteProgramPROC) (jint);
typedef jboolean (APIENTRY *glIsProgramPROC) (jint);
typedef jint (APIENTRY *glCreateShaderPROC) (jint);
typedef void (APIENTRY *glDeleteShaderPROC) (jint);
typedef jboolean (APIENTRY *glIsShaderPROC) (jint);
typedef void (APIENTRY *glAttachShaderPROC) (jint, jint);
typedef void (APIENTRY *glDetachShaderPROC) (jint, jint);
typedef void (APIENTRY *glShaderSourcePROC) (jint, jint, const intptr_t, const intptr_t);
typedef void (APIENTRY *glCompileShaderPROC) (jint);
typedef void (APIENTRY *glLinkProgramPROC) (jint);
typedef void (APIENTRY *glUseProgramPROC) (jint);
typedef void (APIENTRY *glValidateProgramPROC) (jint);
typedef void (APIENTRY *glUniform1fPROC) (jint, jfloat);
typedef void (APIENTRY *glUniform2fPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glUniform3fPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform4fPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform1iPROC) (jint, jint);
typedef void (APIENTRY *glUniform2iPROC) (jint, jint, jint);
typedef void (APIENTRY *glUniform3iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glUniform4iPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glUniform1fvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2fvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3fvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4fvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform1ivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform2ivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform3ivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniform4ivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glUniformMatrix2fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix3fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glUniformMatrix4fvPROC) (jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glGetShaderivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetShaderInfoLogPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetProgramInfoLogPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetAttachedShadersPROC) (jint, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetUniformLocationPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetActiveUniformPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glGetUniformfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetShaderSourcePROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glVertexAttrib1fPROC) (jint, jfloat);
typedef void (APIENTRY *glVertexAttrib1sPROC) (jint, jshort);
typedef void (APIENTRY *glVertexAttrib1dPROC) (jint, jdouble);
typedef void (APIENTRY *glVertexAttrib2fPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib2sPROC) (jint, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib2dPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib3fPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib3sPROC) (jint, jshort, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib3dPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib4fPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib4sPROC) (jint, jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib4dPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib4NubPROC) (jint, jbyte, jbyte, jbyte, jbyte);
typedef void (APIENTRY *glVertexAttrib1fvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib1svPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib1dvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2fvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2svPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2dvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3fvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3svPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3dvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4fvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4svPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4dvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4ivPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4bvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4ubvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4usvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4uivPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NbvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NsvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NivPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NubvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NusvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NuivPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribPointerPROC) (jint, jint, jint, jboolean, jint, const intptr_t);
typedef void (APIENTRY *glEnableVertexAttribArrayPROC) (jint);
typedef void (APIENTRY *glDisableVertexAttribArrayPROC) (jint);
typedef void (APIENTRY *glBindAttribLocationPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetActiveAttribPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetAttribLocationPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetVertexAttribivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribdvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribPointervPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glDrawBuffersPROC) (jint, const intptr_t);
typedef void (APIENTRY *glBlendEquationSeparatePROC) (jint, jint);
typedef void (APIENTRY *glStencilOpSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glStencilFuncSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glStencilMaskSeparatePROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL20_glCreateProgram(JNIEnv *__env, jclass clazz) {
    glCreateProgramPROC glCreateProgram = (glCreateProgramPROC)tlsGetFunction(271);
    UNUSED_PARAM(clazz)
    return (jint)glCreateProgram();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glDeleteProgram(JNIEnv *__env, jclass clazz, jint program) {
    glDeleteProgramPROC glDeleteProgram = (glDeleteProgramPROC)tlsGetFunction(310);
    UNUSED_PARAM(clazz)
    glDeleteProgram(program);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL20_glIsProgram(JNIEnv *__env, jclass clazz, jint program) {
    glIsProgramPROC glIsProgram = (glIsProgramPROC)tlsGetFunction(891);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsProgram(program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL20_glCreateShader(JNIEnv *__env, jclass clazz, jint type) {
    glCreateShaderPROC glCreateShader = (glCreateShaderPROC)tlsGetFunction(277);
    UNUSED_PARAM(clazz)
    return (jint)glCreateShader(type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glDeleteShader(JNIEnv *__env, jclass clazz, jint shader) {
    glDeleteShaderPROC glDeleteShader = (glDeleteShaderPROC)tlsGetFunction(319);
    UNUSED_PARAM(clazz)
    glDeleteShader(shader);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL20_glIsShader(JNIEnv *__env, jclass clazz, jint shader) {
    glIsShaderPROC glIsShader = (glIsShaderPROC)tlsGetFunction(900);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glAttachShader(JNIEnv *__env, jclass clazz, jint program, jint shader) {
    glAttachShaderPROC glAttachShader = (glAttachShaderPROC)tlsGetFunction(14);
    UNUSED_PARAM(clazz)
    glAttachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glDetachShader(JNIEnv *__env, jclass clazz, jint program, jint shader) {
    glDetachShaderPROC glDetachShader = (glDetachShaderPROC)tlsGetFunction(336);
    UNUSED_PARAM(clazz)
    glDetachShader(program, shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglShaderSource__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint count, jlong stringsAddress, jlong lengthAddress) {
    glShaderSourcePROC glShaderSource = (glShaderSourcePROC)tlsGetFunction(1550);
    const intptr_t strings = (const intptr_t)stringsAddress;
    const intptr_t length = (const intptr_t)lengthAddress;
    UNUSED_PARAM(clazz)
    glShaderSource(shader, count, strings, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glCompileShader(JNIEnv *__env, jclass clazz, jint shader) {
    glCompileShaderPROC glCompileShader = (glCompileShaderPROC)tlsGetFunction(194);
    UNUSED_PARAM(clazz)
    glCompileShader(shader);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glLinkProgram(JNIEnv *__env, jclass clazz, jint program) {
    glLinkProgramPROC glLinkProgram = (glLinkProgramPROC)tlsGetFunction(920);
    UNUSED_PARAM(clazz)
    glLinkProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUseProgram(JNIEnv *__env, jclass clazz, jint program) {
    glUseProgramPROC glUseProgram = (glUseProgramPROC)tlsGetFunction(1859);
    UNUSED_PARAM(clazz)
    glUseProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glValidateProgram(JNIEnv *__env, jclass clazz, jint program) {
    glValidateProgramPROC glValidateProgram = (glValidateProgramPROC)tlsGetFunction(1863);
    UNUSED_PARAM(clazz)
    glValidateProgram(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUniform1f(JNIEnv *__env, jclass clazz, jint location, jfloat v0) {
    glUniform1fPROC glUniform1f = (glUniform1fPROC)tlsGetFunction(1737);
    UNUSED_PARAM(clazz)
    glUniform1f(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUniform2f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1) {
    glUniform2fPROC glUniform2f = (glUniform2fPROC)tlsGetFunction(1759);
    UNUSED_PARAM(clazz)
    glUniform2f(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUniform3f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2) {
    glUniform3fPROC glUniform3f = (glUniform3fPROC)tlsGetFunction(1781);
    UNUSED_PARAM(clazz)
    glUniform3f(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUniform4f(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
    glUniform4fPROC glUniform4f = (glUniform4fPROC)tlsGetFunction(1803);
    UNUSED_PARAM(clazz)
    glUniform4f(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUniform1i(JNIEnv *__env, jclass clazz, jint location, jint v0) {
    glUniform1iPROC glUniform1i = (glUniform1iPROC)tlsGetFunction(1741);
    UNUSED_PARAM(clazz)
    glUniform1i(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUniform2i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1) {
    glUniform2iPROC glUniform2i = (glUniform2iPROC)tlsGetFunction(1763);
    UNUSED_PARAM(clazz)
    glUniform2i(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUniform3i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2) {
    glUniform3iPROC glUniform3i = (glUniform3iPROC)tlsGetFunction(1785);
    UNUSED_PARAM(clazz)
    glUniform3i(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glUniform4i(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {
    glUniform4iPROC glUniform4i = (glUniform4iPROC)tlsGetFunction(1807);
    UNUSED_PARAM(clazz)
    glUniform4i(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform1fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1fvPROC glUniform1fv = (glUniform1fvPROC)tlsGetFunction(1739);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform2fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2fvPROC glUniform2fv = (glUniform2fvPROC)tlsGetFunction(1761);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform3fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3fvPROC glUniform3fv = (glUniform3fvPROC)tlsGetFunction(1783);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform4fv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4fvPROC glUniform4fv = (glUniform4fvPROC)tlsGetFunction(1805);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4fv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform1iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1ivPROC glUniform1iv = (glUniform1ivPROC)tlsGetFunction(1747);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform2iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2ivPROC glUniform2iv = (glUniform2ivPROC)tlsGetFunction(1769);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform3iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3ivPROC glUniform3iv = (glUniform3ivPROC)tlsGetFunction(1791);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniform4iv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4ivPROC glUniform4iv = (glUniform4ivPROC)tlsGetFunction(1813);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4iv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniformMatrix2fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2fvPROC glUniformMatrix2fv = (glUniformMatrix2fvPROC)tlsGetFunction(1830);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniformMatrix3fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3fvPROC glUniformMatrix3fv = (glUniformMatrix3fvPROC)tlsGetFunction(1837);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglUniformMatrix4fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4fvPROC glUniformMatrix4fv = (glUniformMatrix4fvPROC)tlsGetFunction(1844);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetShaderiv__IIJ(JNIEnv *__env, jclass clazz, jint shader, jint pname, jlong paramsAddress) {
    glGetShaderivPROC glGetShaderiv = (glGetShaderivPROC)tlsGetFunction(708);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetShaderiv(shader, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetProgramiv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint pname, jlong paramsAddress) {
    glGetProgramivPROC glGetProgramiv = (glGetProgramivPROC)tlsGetFunction(679);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramiv(program, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetShaderInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint maxLength, jlong lengthAddress, jlong infoLogAddress) {
    glGetShaderInfoLogPROC glGetShaderInfoLog = (glGetShaderInfoLogPROC)tlsGetFunction(704);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t infoLog = (intptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetShaderInfoLog(shader, maxLength, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetProgramInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint maxLength, jlong lengthAddress, jlong infoLogAddress) {
    glGetProgramInfoLogPROC glGetProgramInfoLog = (glGetProgramInfoLogPROC)tlsGetFunction(665);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t infoLog = (intptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetProgramInfoLog(program, maxLength, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetAttachedShaders__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint maxCount, jlong countAddress, jlong shadersAddress) {
    glGetAttachedShadersPROC glGetAttachedShaders = (glGetAttachedShadersPROC)tlsGetFunction(511);
    intptr_t count = (intptr_t)countAddress;
    intptr_t shaders = (intptr_t)shadersAddress;
    UNUSED_PARAM(clazz)
    glGetAttachedShaders(program, maxCount, count, shaders);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL20_nglGetUniformLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetUniformLocationPROC glGetUniformLocation = (glGetUniformLocationPROC)tlsGetFunction(757);
    const intptr_t name = (const intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetUniformLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetActiveUniform__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetActiveUniformPROC glGetActiveUniform = (glGetActiveUniformPROC)tlsGetFunction(503);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t size = (intptr_t)sizeAddress;
    intptr_t type = (intptr_t)typeAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveUniform(program, index, maxLength, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetUniformfv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformfvPROC glGetUniformfv = (glGetUniformfvPROC)tlsGetFunction(762);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformfv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetUniformiv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformivPROC glGetUniformiv = (glGetUniformivPROC)tlsGetFunction(766);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformiv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetShaderSource__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint maxLength, jlong lengthAddress, jlong sourceAddress) {
    glGetShaderSourcePROC glGetShaderSource = (glGetShaderSourcePROC)tlsGetFunction(706);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t source = (intptr_t)sourceAddress;
    UNUSED_PARAM(clazz)
    glGetShaderSource(shader, maxLength, length, source);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib1f(JNIEnv *__env, jclass clazz, jint index, jfloat v0) {
    glVertexAttrib1fPROC glVertexAttrib1f = (glVertexAttrib1fPROC)tlsGetFunction(1928);
    UNUSED_PARAM(clazz)
    glVertexAttrib1f(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib1s(JNIEnv *__env, jclass clazz, jint index, jshort v0) {
    glVertexAttrib1sPROC glVertexAttrib1s = (glVertexAttrib1sPROC)tlsGetFunction(1934);
    UNUSED_PARAM(clazz)
    glVertexAttrib1s(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib1d(JNIEnv *__env, jclass clazz, jint index, jdouble v0) {
    glVertexAttrib1dPROC glVertexAttrib1d = (glVertexAttrib1dPROC)tlsGetFunction(1924);
    UNUSED_PARAM(clazz)
    glVertexAttrib1d(index, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib2f(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1) {
    glVertexAttrib2fPROC glVertexAttrib2f = (glVertexAttrib2fPROC)tlsGetFunction(1942);
    UNUSED_PARAM(clazz)
    glVertexAttrib2f(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib2s(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1) {
    glVertexAttrib2sPROC glVertexAttrib2s = (glVertexAttrib2sPROC)tlsGetFunction(1948);
    UNUSED_PARAM(clazz)
    glVertexAttrib2s(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib2d(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1) {
    glVertexAttrib2dPROC glVertexAttrib2d = (glVertexAttrib2dPROC)tlsGetFunction(1938);
    UNUSED_PARAM(clazz)
    glVertexAttrib2d(index, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib3f(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jfloat v2) {
    glVertexAttrib3fPROC glVertexAttrib3f = (glVertexAttrib3fPROC)tlsGetFunction(1956);
    UNUSED_PARAM(clazz)
    glVertexAttrib3f(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib3s(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jshort v2) {
    glVertexAttrib3sPROC glVertexAttrib3s = (glVertexAttrib3sPROC)tlsGetFunction(1962);
    UNUSED_PARAM(clazz)
    glVertexAttrib3s(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib3d(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jdouble v2) {
    glVertexAttrib3dPROC glVertexAttrib3d = (glVertexAttrib3dPROC)tlsGetFunction(1952);
    UNUSED_PARAM(clazz)
    glVertexAttrib3d(index, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib4f(JNIEnv *__env, jclass clazz, jint index, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
    glVertexAttrib4fPROC glVertexAttrib4f = (glVertexAttrib4fPROC)tlsGetFunction(1986);
    UNUSED_PARAM(clazz)
    glVertexAttrib4f(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib4s(JNIEnv *__env, jclass clazz, jint index, jshort v0, jshort v1, jshort v2, jshort v3) {
    glVertexAttrib4sPROC glVertexAttrib4s = (glVertexAttrib4sPROC)tlsGetFunction(1994);
    UNUSED_PARAM(clazz)
    glVertexAttrib4s(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib4d(JNIEnv *__env, jclass clazz, jint index, jdouble v0, jdouble v1, jdouble v2, jdouble v3) {
    glVertexAttrib4dPROC glVertexAttrib4d = (glVertexAttrib4dPROC)tlsGetFunction(1982);
    UNUSED_PARAM(clazz)
    glVertexAttrib4d(index, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glVertexAttrib4Nub(JNIEnv *__env, jclass clazz, jint index, jbyte x, jbyte y, jbyte z, jbyte w) {
    glVertexAttrib4NubPROC glVertexAttrib4Nub = (glVertexAttrib4NubPROC)tlsGetFunction(1972);
    UNUSED_PARAM(clazz)
    glVertexAttrib4Nub(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib1fvPROC glVertexAttrib1fv = (glVertexAttrib1fvPROC)tlsGetFunction(1930);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib1fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1sv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib1svPROC glVertexAttrib1sv = (glVertexAttrib1svPROC)tlsGetFunction(1936);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib1sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib1dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib1dvPROC glVertexAttrib1dv = (glVertexAttrib1dvPROC)tlsGetFunction(1926);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib1dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib2fvPROC glVertexAttrib2fv = (glVertexAttrib2fvPROC)tlsGetFunction(1944);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib2fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2sv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib2svPROC glVertexAttrib2sv = (glVertexAttrib2svPROC)tlsGetFunction(1950);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib2sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib2dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib2dvPROC glVertexAttrib2dv = (glVertexAttrib2dvPROC)tlsGetFunction(1940);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib2dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib3fvPROC glVertexAttrib3fv = (glVertexAttrib3fvPROC)tlsGetFunction(1958);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib3fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3sv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib3svPROC glVertexAttrib3sv = (glVertexAttrib3svPROC)tlsGetFunction(1964);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib3sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib3dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib3dvPROC glVertexAttrib3dv = (glVertexAttrib3dvPROC)tlsGetFunction(1954);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib3dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4fv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4fvPROC glVertexAttrib4fv = (glVertexAttrib4fvPROC)tlsGetFunction(1988);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4fv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4sv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4svPROC glVertexAttrib4sv = (glVertexAttrib4svPROC)tlsGetFunction(1996);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4dvPROC glVertexAttrib4dv = (glVertexAttrib4dvPROC)tlsGetFunction(1984);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4iv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4ivPROC glVertexAttrib4iv = (glVertexAttrib4ivPROC)tlsGetFunction(1992);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4bv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4bvPROC glVertexAttrib4bv = (glVertexAttrib4bvPROC)tlsGetFunction(1980);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4bv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4ubv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4ubvPROC glVertexAttrib4ubv = (glVertexAttrib4ubvPROC)tlsGetFunction(1998);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4ubv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4usv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4usvPROC glVertexAttrib4usv = (glVertexAttrib4usvPROC)tlsGetFunction(2002);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4usv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4uiv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4uivPROC glVertexAttrib4uiv = (glVertexAttrib4uivPROC)tlsGetFunction(2000);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nbv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NbvPROC glVertexAttrib4Nbv = (glVertexAttrib4NbvPROC)tlsGetFunction(1966);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4Nbv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nsv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NsvPROC glVertexAttrib4Nsv = (glVertexAttrib4NsvPROC)tlsGetFunction(1970);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4Nsv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Niv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NivPROC glVertexAttrib4Niv = (glVertexAttrib4NivPROC)tlsGetFunction(1968);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4Niv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nubv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NubvPROC glVertexAttrib4Nubv = (glVertexAttrib4NubvPROC)tlsGetFunction(1974);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4Nubv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nusv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NusvPROC glVertexAttrib4Nusv = (glVertexAttrib4NusvPROC)tlsGetFunction(1978);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4Nusv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttrib4Nuiv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NuivPROC glVertexAttrib4Nuiv = (glVertexAttrib4NuivPROC)tlsGetFunction(1976);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4Nuiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglVertexAttribPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress) {
    glVertexAttribPointerPROC glVertexAttribPointer = (glVertexAttribPointerPROC)tlsGetFunction(2100);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribPointer(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glEnableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index) {
    glEnableVertexAttribArrayPROC glEnableVertexAttribArray = (glEnableVertexAttribArrayPROC)tlsGetFunction(395);
    UNUSED_PARAM(clazz)
    glEnableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glDisableVertexAttribArray(JNIEnv *__env, jclass clazz, jint index) {
    glDisableVertexAttribArrayPROC glDisableVertexAttribArray = (glDisableVertexAttribArrayPROC)tlsGetFunction(345);
    UNUSED_PARAM(clazz)
    glDisableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglBindAttribLocation(JNIEnv *__env, jclass clazz, jint program, jint index, jlong nameAddress) {
    glBindAttribLocationPROC glBindAttribLocation = (glBindAttribLocationPROC)tlsGetFunction(27);
    const intptr_t name = (const intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glBindAttribLocation(program, index, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetActiveAttrib__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetActiveAttribPROC glGetActiveAttrib = (glGetActiveAttribPROC)tlsGetFunction(498);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t size = (intptr_t)sizeAddress;
    intptr_t type = (intptr_t)typeAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveAttrib(program, index, maxLength, length, size, type, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL20_nglGetAttribLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetAttribLocationPROC glGetAttribLocation = (glGetAttribLocationPROC)tlsGetFunction(512);
    const intptr_t name = (const intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetAttribLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetVertexAttribiv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribivPROC glGetVertexAttribiv = (glGetVertexAttribivPROC)tlsGetFunction(797);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetVertexAttribfv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribfvPROC glGetVertexAttribfv = (glGetVertexAttribfvPROC)tlsGetFunction(795);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribfv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetVertexAttribdv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribdvPROC glGetVertexAttribdv = (glGetVertexAttribdvPROC)tlsGetFunction(793);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribdv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglGetVertexAttribPointerv(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress) {
    glGetVertexAttribPointervPROC glGetVertexAttribPointerv = (glGetVertexAttribPointervPROC)tlsGetFunction(791);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribPointerv(index, pname, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_nglDrawBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress) {
    glDrawBuffersPROC glDrawBuffers = (glDrawBuffersPROC)tlsGetFunction(358);
    const intptr_t bufs = (const intptr_t)bufsAddress;
    UNUSED_PARAM(clazz)
    glDrawBuffers(n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glBlendEquationSeparate(JNIEnv *__env, jclass clazz, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparatePROC glBlendEquationSeparate = (glBlendEquationSeparatePROC)tlsGetFunction(72);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparate(modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glStencilOpSeparate(JNIEnv *__env, jclass clazz, jint face, jint sfail, jint dpfail, jint dppass) {
    glStencilOpSeparatePROC glStencilOpSeparate = (glStencilOpSeparatePROC)tlsGetFunction(1567);
    UNUSED_PARAM(clazz)
    glStencilOpSeparate(face, sfail, dpfail, dppass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glStencilFuncSeparate(JNIEnv *__env, jclass clazz, jint face, jint func, jint ref, jint mask) {
    glStencilFuncSeparatePROC glStencilFuncSeparate = (glStencilFuncSeparatePROC)tlsGetFunction(1563);
    UNUSED_PARAM(clazz)
    glStencilFuncSeparate(face, func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL20_glStencilMaskSeparate(JNIEnv *__env, jclass clazz, jint face, jint mask) {
    glStencilMaskSeparatePROC glStencilMaskSeparate = (glStencilMaskSeparatePROC)tlsGetFunction(1565);
    UNUSED_PARAM(clazz)
    glStencilMaskSeparate(face, mask);
}

EXTERN_C_EXIT
