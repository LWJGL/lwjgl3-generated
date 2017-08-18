/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexAttrib1sARBPROC) (jint, jshort);
typedef void (APIENTRY *glVertexAttrib1fARBPROC) (jint, jfloat);
typedef void (APIENTRY *glVertexAttrib1dARBPROC) (jint, jdouble);
typedef void (APIENTRY *glVertexAttrib2sARBPROC) (jint, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib2fARBPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib2dARBPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib3sARBPROC) (jint, jshort, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib3fARBPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib3dARBPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib4sARBPROC) (jint, jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib4fARBPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertexAttrib4dARBPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttrib4NubARBPROC) (jint, jbyte, jbyte, jbyte, jbyte);
typedef void (APIENTRY *glVertexAttrib1svARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib1fvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib1dvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2svARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2fvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2dvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3svARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3fvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3dvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4fvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4bvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4svARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4ivARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4ubvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4usvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4uivARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4dvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NbvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NsvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NivARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NubvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NusvARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4NuivARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribPointerARBPROC) (jint, jint, jint, jboolean, jint, const intptr_t);
typedef void (APIENTRY *glEnableVertexAttribArrayARBPROC) (jint);
typedef void (APIENTRY *glDisableVertexAttribArrayARBPROC) (jint);
typedef void (APIENTRY *glProgramStringARBPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glBindProgramARBPROC) (jint, jint);
typedef void (APIENTRY *glDeleteProgramsARBPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGenProgramsARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glProgramEnvParameter4dARBPROC) (jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramEnvParameter4dvARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramEnvParameter4fARBPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramEnvParameter4fvARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramLocalParameter4dARBPROC) (jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramLocalParameter4dvARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramLocalParameter4fARBPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramLocalParameter4fvARBPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glGetProgramEnvParameterfvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramEnvParameterdvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramLocalParameterfvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramLocalParameterdvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramivARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramStringARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribfvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribdvARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribivARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribPointervARBPROC) (jint, jint, intptr_t);
typedef jboolean (APIENTRY *glIsProgramARBPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib1sARB(JNIEnv *__env, jclass clazz, jint index, jshort x) {
    glVertexAttrib1sARBPROC glVertexAttrib1sARB = (glVertexAttrib1sARBPROC)tlsGetFunction(1936);
    UNUSED_PARAM(clazz)
    glVertexAttrib1sARB(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib1fARB(JNIEnv *__env, jclass clazz, jint index, jfloat x) {
    glVertexAttrib1fARBPROC glVertexAttrib1fARB = (glVertexAttrib1fARBPROC)tlsGetFunction(1930);
    UNUSED_PARAM(clazz)
    glVertexAttrib1fARB(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib1dARB(JNIEnv *__env, jclass clazz, jint index, jdouble x) {
    glVertexAttrib1dARBPROC glVertexAttrib1dARB = (glVertexAttrib1dARBPROC)tlsGetFunction(1926);
    UNUSED_PARAM(clazz)
    glVertexAttrib1dARB(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib2sARB(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y) {
    glVertexAttrib2sARBPROC glVertexAttrib2sARB = (glVertexAttrib2sARBPROC)tlsGetFunction(1950);
    UNUSED_PARAM(clazz)
    glVertexAttrib2sARB(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib2fARB(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y) {
    glVertexAttrib2fARBPROC glVertexAttrib2fARB = (glVertexAttrib2fARBPROC)tlsGetFunction(1944);
    UNUSED_PARAM(clazz)
    glVertexAttrib2fARB(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib2dARB(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y) {
    glVertexAttrib2dARBPROC glVertexAttrib2dARB = (glVertexAttrib2dARBPROC)tlsGetFunction(1940);
    UNUSED_PARAM(clazz)
    glVertexAttrib2dARB(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib3sARB(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jshort z) {
    glVertexAttrib3sARBPROC glVertexAttrib3sARB = (glVertexAttrib3sARBPROC)tlsGetFunction(1964);
    UNUSED_PARAM(clazz)
    glVertexAttrib3sARB(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib3fARB(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z) {
    glVertexAttrib3fARBPROC glVertexAttrib3fARB = (glVertexAttrib3fARBPROC)tlsGetFunction(1958);
    UNUSED_PARAM(clazz)
    glVertexAttrib3fARB(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib3dARB(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z) {
    glVertexAttrib3dARBPROC glVertexAttrib3dARB = (glVertexAttrib3dARBPROC)tlsGetFunction(1954);
    UNUSED_PARAM(clazz)
    glVertexAttrib3dARB(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib4sARB(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jshort z, jshort w) {
    glVertexAttrib4sARBPROC glVertexAttrib4sARB = (glVertexAttrib4sARBPROC)tlsGetFunction(1996);
    UNUSED_PARAM(clazz)
    glVertexAttrib4sARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib4fARB(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
    glVertexAttrib4fARBPROC glVertexAttrib4fARB = (glVertexAttrib4fARBPROC)tlsGetFunction(1988);
    UNUSED_PARAM(clazz)
    glVertexAttrib4fARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib4dARB(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glVertexAttrib4dARBPROC glVertexAttrib4dARB = (glVertexAttrib4dARBPROC)tlsGetFunction(1984);
    UNUSED_PARAM(clazz)
    glVertexAttrib4dARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glVertexAttrib4NubARB(JNIEnv *__env, jclass clazz, jint index, jbyte x, jbyte y, jbyte z, jbyte w) {
    glVertexAttrib4NubARBPROC glVertexAttrib4NubARB = (glVertexAttrib4NubARBPROC)tlsGetFunction(1974);
    UNUSED_PARAM(clazz)
    glVertexAttrib4NubARB(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1svARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib1svARBPROC glVertexAttrib1svARB = (glVertexAttrib1svARBPROC)tlsGetFunction(1938);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib1svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1fvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib1fvARBPROC glVertexAttrib1fvARB = (glVertexAttrib1fvARBPROC)tlsGetFunction(1932);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib1fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib1dvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib1dvARBPROC glVertexAttrib1dvARB = (glVertexAttrib1dvARBPROC)tlsGetFunction(1928);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib1dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2svARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib2svARBPROC glVertexAttrib2svARB = (glVertexAttrib2svARBPROC)tlsGetFunction(1952);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib2svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2fvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib2fvARBPROC glVertexAttrib2fvARB = (glVertexAttrib2fvARBPROC)tlsGetFunction(1946);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib2fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib2dvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib2dvARBPROC glVertexAttrib2dvARB = (glVertexAttrib2dvARBPROC)tlsGetFunction(1942);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib2dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3svARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib3svARBPROC glVertexAttrib3svARB = (glVertexAttrib3svARBPROC)tlsGetFunction(1966);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib3svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3fvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib3fvARBPROC glVertexAttrib3fvARB = (glVertexAttrib3fvARBPROC)tlsGetFunction(1960);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib3fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib3dvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib3dvARBPROC glVertexAttrib3dvARB = (glVertexAttrib3dvARBPROC)tlsGetFunction(1956);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib3dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4fvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4fvARBPROC glVertexAttrib4fvARB = (glVertexAttrib4fvARBPROC)tlsGetFunction(1990);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4fvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4bvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4bvARBPROC glVertexAttrib4bvARB = (glVertexAttrib4bvARBPROC)tlsGetFunction(1982);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4bvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4svARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4svARBPROC glVertexAttrib4svARB = (glVertexAttrib4svARBPROC)tlsGetFunction(1998);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4svARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4ivARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4ivARBPROC glVertexAttrib4ivARB = (glVertexAttrib4ivARBPROC)tlsGetFunction(1994);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4ivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4ubvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4ubvARBPROC glVertexAttrib4ubvARB = (glVertexAttrib4ubvARBPROC)tlsGetFunction(2000);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4ubvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4usvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4usvARBPROC glVertexAttrib4usvARB = (glVertexAttrib4usvARBPROC)tlsGetFunction(2004);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4usvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4uivARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4uivARBPROC glVertexAttrib4uivARB = (glVertexAttrib4uivARBPROC)tlsGetFunction(2002);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4uivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4dvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4dvARBPROC glVertexAttrib4dvARB = (glVertexAttrib4dvARBPROC)tlsGetFunction(1986);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4dvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NbvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NbvARBPROC glVertexAttrib4NbvARB = (glVertexAttrib4NbvARBPROC)tlsGetFunction(1968);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4NbvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NsvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NsvARBPROC glVertexAttrib4NsvARB = (glVertexAttrib4NsvARBPROC)tlsGetFunction(1972);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4NsvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NivARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NivARBPROC glVertexAttrib4NivARB = (glVertexAttrib4NivARBPROC)tlsGetFunction(1970);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4NivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NubvARB(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NubvARBPROC glVertexAttrib4NubvARB = (glVertexAttrib4NubvARBPROC)tlsGetFunction(1976);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4NubvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NusvARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NusvARBPROC glVertexAttrib4NusvARB = (glVertexAttrib4NusvARBPROC)tlsGetFunction(1980);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4NusvARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttrib4NuivARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4NuivARBPROC glVertexAttrib4NuivARB = (glVertexAttrib4NuivARBPROC)tlsGetFunction(1978);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4NuivARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglVertexAttribPointerARB__IIIZIJ(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride, jlong pointerAddress) {
    glVertexAttribPointerARBPROC glVertexAttribPointerARB = (glVertexAttribPointerARBPROC)tlsGetFunction(2102);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glEnableVertexAttribArrayARB(JNIEnv *__env, jclass clazz, jint index) {
    glEnableVertexAttribArrayARBPROC glEnableVertexAttribArrayARB = (glEnableVertexAttribArrayARBPROC)tlsGetFunction(396);
    UNUSED_PARAM(clazz)
    glEnableVertexAttribArrayARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glDisableVertexAttribArrayARB(JNIEnv *__env, jclass clazz, jint index) {
    glDisableVertexAttribArrayARBPROC glDisableVertexAttribArrayARB = (glDisableVertexAttribArrayARBPROC)tlsGetFunction(346);
    UNUSED_PARAM(clazz)
    glDisableVertexAttribArrayARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramStringARB(JNIEnv *__env, jclass clazz, jint target, jint format, jint len, jlong stringAddress) {
    glProgramStringARBPROC glProgramStringARB = (glProgramStringARBPROC)tlsGetFunction(1284);
    const intptr_t string = (const intptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glProgramStringARB(target, format, len, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glBindProgramARB(JNIEnv *__env, jclass clazz, jint target, jint program) {
    glBindProgramARBPROC glBindProgramARB = (glBindProgramARBPROC)tlsGetFunction(50);
    UNUSED_PARAM(clazz)
    glBindProgramARB(target, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglDeleteProgramsARB__IJ(JNIEnv *__env, jclass clazz, jint n, jlong programsAddress) {
    glDeleteProgramsARBPROC glDeleteProgramsARB = (glDeleteProgramsARBPROC)tlsGetFunction(312);
    const intptr_t programs = (const intptr_t)programsAddress;
    UNUSED_PARAM(clazz)
    glDeleteProgramsARB(n, programs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGenProgramsARB__IJ(JNIEnv *__env, jclass clazz, jint n, jlong programsAddress) {
    glGenProgramsARBPROC glGenProgramsARB = (glGenProgramsARBPROC)tlsGetFunction(481);
    intptr_t programs = (intptr_t)programsAddress;
    UNUSED_PARAM(clazz)
    glGenProgramsARB(n, programs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glProgramEnvParameter4dARB(JNIEnv *__env, jclass clazz, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glProgramEnvParameter4dARBPROC glProgramEnvParameter4dARB = (glProgramEnvParameter4dARBPROC)tlsGetFunction(1270);
    UNUSED_PARAM(clazz)
    glProgramEnvParameter4dARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramEnvParameter4dvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glProgramEnvParameter4dvARBPROC glProgramEnvParameter4dvARB = (glProgramEnvParameter4dvARBPROC)tlsGetFunction(1271);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramEnvParameter4dvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glProgramEnvParameter4fARB(JNIEnv *__env, jclass clazz, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
    glProgramEnvParameter4fARBPROC glProgramEnvParameter4fARB = (glProgramEnvParameter4fARBPROC)tlsGetFunction(1272);
    UNUSED_PARAM(clazz)
    glProgramEnvParameter4fARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramEnvParameter4fvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glProgramEnvParameter4fvARBPROC glProgramEnvParameter4fvARB = (glProgramEnvParameter4fvARBPROC)tlsGetFunction(1273);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramEnvParameter4fvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glProgramLocalParameter4dARB(JNIEnv *__env, jclass clazz, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glProgramLocalParameter4dARBPROC glProgramLocalParameter4dARB = (glProgramLocalParameter4dARBPROC)tlsGetFunction(1275);
    UNUSED_PARAM(clazz)
    glProgramLocalParameter4dARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramLocalParameter4dvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glProgramLocalParameter4dvARBPROC glProgramLocalParameter4dvARB = (glProgramLocalParameter4dvARBPROC)tlsGetFunction(1276);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramLocalParameter4dvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glProgramLocalParameter4fARB(JNIEnv *__env, jclass clazz, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
    glProgramLocalParameter4fARBPROC glProgramLocalParameter4fARB = (glProgramLocalParameter4fARBPROC)tlsGetFunction(1277);
    UNUSED_PARAM(clazz)
    glProgramLocalParameter4fARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramLocalParameter4fvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glProgramLocalParameter4fvARBPROC glProgramLocalParameter4fvARB = (glProgramLocalParameter4fvARBPROC)tlsGetFunction(1278);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramLocalParameter4fvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramEnvParameterfvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetProgramEnvParameterfvARBPROC glGetProgramEnvParameterfvARB = (glGetProgramEnvParameterfvARBPROC)tlsGetFunction(664);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramEnvParameterfvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramEnvParameterdvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetProgramEnvParameterdvARBPROC glGetProgramEnvParameterdvARB = (glGetProgramEnvParameterdvARBPROC)tlsGetFunction(663);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramEnvParameterdvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramLocalParameterfvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetProgramLocalParameterfvARBPROC glGetProgramLocalParameterfvARB = (glGetProgramLocalParameterfvARBPROC)tlsGetFunction(668);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramLocalParameterfvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramLocalParameterdvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetProgramLocalParameterdvARBPROC glGetProgramLocalParameterdvARB = (glGetProgramLocalParameterdvARBPROC)tlsGetFunction(667);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramLocalParameterdvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramivARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetProgramivARBPROC glGetProgramivARB = (glGetProgramivARBPROC)tlsGetFunction(680);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramivARB(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramStringARB(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong stringAddress) {
    glGetProgramStringARBPROC glGetProgramStringARB = (glGetProgramStringARBPROC)tlsGetFunction(678);
    intptr_t string = (intptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glGetProgramStringARB(target, pname, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetVertexAttribfvARB__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribfvARBPROC glGetVertexAttribfvARB = (glGetVertexAttribfvARBPROC)tlsGetFunction(796);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribfvARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetVertexAttribdvARB__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribdvARBPROC glGetVertexAttribdvARB = (glGetVertexAttribdvARBPROC)tlsGetFunction(794);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribdvARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetVertexAttribivARB__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribivARBPROC glGetVertexAttribivARB = (glGetVertexAttribivARBPROC)tlsGetFunction(798);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribivARB(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetVertexAttribPointervARB(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong pointerAddress) {
    glGetVertexAttribPointervARBPROC glGetVertexAttribPointervARB = (glGetVertexAttribPointervARBPROC)tlsGetFunction(792);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribPointervARB(index, pname, pointer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glIsProgramARB(JNIEnv *__env, jclass clazz, jint program) {
    glIsProgramARBPROC glIsProgramARB = (glIsProgramARBPROC)tlsGetFunction(892);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsProgramARB(program);
}

EXTERN_C_EXIT
