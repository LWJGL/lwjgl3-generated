/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertex2hNVPROC) (jshort, jshort);
typedef void (APIENTRY *glVertex2hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glVertex3hNVPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glVertex3hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glVertex4hNVPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glVertex4hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glNormal3hNVPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glNormal3hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glColor3hNVPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glColor3hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glColor4hNVPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glColor4hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord1hNVPROC) (jshort);
typedef void (APIENTRY *glTexCoord1hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord2hNVPROC) (jshort, jshort);
typedef void (APIENTRY *glTexCoord2hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord3hNVPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glTexCoord3hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord4hNVPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glTexCoord4hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glMultiTexCoord1hNVPROC) (jint, jshort);
typedef void (APIENTRY *glMultiTexCoord1hvNVPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMultiTexCoord2hNVPROC) (jint, jshort, jshort);
typedef void (APIENTRY *glMultiTexCoord2hvNVPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMultiTexCoord3hNVPROC) (jint, jshort, jshort, jshort);
typedef void (APIENTRY *glMultiTexCoord3hvNVPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMultiTexCoord4hNVPROC) (jint, jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glMultiTexCoord4hvNVPROC) (jint, const intptr_t);
typedef void (APIENTRY *glFogCoordhNVPROC) (jshort);
typedef void (APIENTRY *glFogCoordhvNVPROC) (const intptr_t);
typedef void (APIENTRY *glSecondaryColor3hNVPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glSecondaryColor3hvNVPROC) (const intptr_t);
typedef void (APIENTRY *glVertexWeighthNVPROC) (jshort);
typedef void (APIENTRY *glVertexWeighthvNVPROC) (const intptr_t);
typedef void (APIENTRY *glVertexAttrib1hNVPROC) (jint, jshort);
typedef void (APIENTRY *glVertexAttrib1hvNVPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib2hNVPROC) (jint, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib2hvNVPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib3hNVPROC) (jint, jshort, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib3hvNVPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttrib4hNVPROC) (jint, jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glVertexAttrib4hvNVPROC) (jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribs1hvNVPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribs2hvNVPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribs3hvNVPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glVertexAttribs4hvNVPROC) (jint, jint, const intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glVertex2hNV(JNIEnv *__env, jclass clazz, jshort x, jshort y) {
    glVertex2hNVPROC glVertex2hNV = (glVertex2hNVPROC)tlsGetFunction(1871);
    UNUSED_PARAM(clazz)
    glVertex2hNV(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex2hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glVertex2hvNVPROC glVertex2hvNV = (glVertex2hvNVPROC)tlsGetFunction(1872);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertex2hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glVertex3hNV(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z) {
    glVertex3hNVPROC glVertex3hNV = (glVertex3hNVPROC)tlsGetFunction(1881);
    UNUSED_PARAM(clazz)
    glVertex3hNV(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex3hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glVertex3hvNVPROC glVertex3hvNV = (glVertex3hvNVPROC)tlsGetFunction(1882);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertex3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glVertex4hNV(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {
    glVertex4hNVPROC glVertex4hNV = (glVertex4hNVPROC)tlsGetFunction(1891);
    UNUSED_PARAM(clazz)
    glVertex4hNV(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertex4hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glVertex4hvNVPROC glVertex4hvNV = (glVertex4hvNVPROC)tlsGetFunction(1892);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertex4hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glNormal3hNV(JNIEnv *__env, jclass clazz, jshort nx, jshort ny, jshort nz) {
    glNormal3hNVPROC glNormal3hNV = (glNormal3hNVPROC)tlsGetFunction(1193);
    UNUSED_PARAM(clazz)
    glNormal3hNV(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglNormal3hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3hvNVPROC glNormal3hvNV = (glNormal3hvNVPROC)tlsGetFunction(1194);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glColor3hNV(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glColor3hNVPROC glColor3hNV = (glColor3hNVPROC)tlsGetFunction(148);
    UNUSED_PARAM(clazz)
    glColor3hNV(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglColor3hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3hvNVPROC glColor3hvNV = (glColor3hvNVPROC)tlsGetFunction(149);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glColor4hNV(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {
    glColor4hNVPROC glColor4hNV = (glColor4hNVPROC)tlsGetFunction(166);
    UNUSED_PARAM(clazz)
    glColor4hNV(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglColor4hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4hvNVPROC glColor4hvNV = (glColor4hvNVPROC)tlsGetFunction(167);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glTexCoord1hNV(JNIEnv *__env, jclass clazz, jshort s) {
    glTexCoord1hNVPROC glTexCoord1hNV = (glTexCoord1hNVPROC)tlsGetFunction(1589);
    UNUSED_PARAM(clazz)
    glTexCoord1hNV(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord1hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1hvNVPROC glTexCoord1hvNV = (glTexCoord1hvNVPROC)tlsGetFunction(1590);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glTexCoord2hNV(JNIEnv *__env, jclass clazz, jshort s, jshort t) {
    glTexCoord2hNVPROC glTexCoord2hNV = (glTexCoord2hNVPROC)tlsGetFunction(1599);
    UNUSED_PARAM(clazz)
    glTexCoord2hNV(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord2hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2hvNVPROC glTexCoord2hvNV = (glTexCoord2hvNVPROC)tlsGetFunction(1600);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glTexCoord3hNV(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r) {
    glTexCoord3hNVPROC glTexCoord3hNV = (glTexCoord3hNVPROC)tlsGetFunction(1609);
    UNUSED_PARAM(clazz)
    glTexCoord3hNV(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord3hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3hvNVPROC glTexCoord3hvNV = (glTexCoord3hvNVPROC)tlsGetFunction(1610);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glTexCoord4hNV(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r, jshort q) {
    glTexCoord4hNVPROC glTexCoord4hNV = (glTexCoord4hNVPROC)tlsGetFunction(1619);
    UNUSED_PARAM(clazz)
    glTexCoord4hNV(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglTexCoord4hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4hvNVPROC glTexCoord4hvNV = (glTexCoord4hvNVPROC)tlsGetFunction(1620);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glMultiTexCoord1hNV(JNIEnv *__env, jclass clazz, jint target, jshort s) {
    glMultiTexCoord1hNVPROC glMultiTexCoord1hNV = (glMultiTexCoord1hNVPROC)tlsGetFunction(1033);
    UNUSED_PARAM(clazz)
    glMultiTexCoord1hNV(target, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord1hvNV__IJ(JNIEnv *__env, jclass clazz, jint target, jlong vAddress) {
    glMultiTexCoord1hvNVPROC glMultiTexCoord1hvNV = (glMultiTexCoord1hvNVPROC)tlsGetFunction(1034);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord1hvNV(target, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glMultiTexCoord2hNV(JNIEnv *__env, jclass clazz, jint target, jshort s, jshort t) {
    glMultiTexCoord2hNVPROC glMultiTexCoord2hNV = (glMultiTexCoord2hNVPROC)tlsGetFunction(1051);
    UNUSED_PARAM(clazz)
    glMultiTexCoord2hNV(target, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord2hvNV__IJ(JNIEnv *__env, jclass clazz, jint target, jlong vAddress) {
    glMultiTexCoord2hvNVPROC glMultiTexCoord2hvNV = (glMultiTexCoord2hvNVPROC)tlsGetFunction(1052);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord2hvNV(target, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glMultiTexCoord3hNV(JNIEnv *__env, jclass clazz, jint target, jshort s, jshort t, jshort r) {
    glMultiTexCoord3hNVPROC glMultiTexCoord3hNV = (glMultiTexCoord3hNVPROC)tlsGetFunction(1069);
    UNUSED_PARAM(clazz)
    glMultiTexCoord3hNV(target, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord3hvNV__IJ(JNIEnv *__env, jclass clazz, jint target, jlong vAddress) {
    glMultiTexCoord3hvNVPROC glMultiTexCoord3hvNV = (glMultiTexCoord3hvNVPROC)tlsGetFunction(1070);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord3hvNV(target, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glMultiTexCoord4hNV(JNIEnv *__env, jclass clazz, jint target, jshort s, jshort t, jshort r, jshort q) {
    glMultiTexCoord4hNVPROC glMultiTexCoord4hNV = (glMultiTexCoord4hNVPROC)tlsGetFunction(1087);
    UNUSED_PARAM(clazz)
    glMultiTexCoord4hNV(target, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglMultiTexCoord4hvNV__IJ(JNIEnv *__env, jclass clazz, jint target, jlong vAddress) {
    glMultiTexCoord4hvNVPROC glMultiTexCoord4hvNV = (glMultiTexCoord4hvNVPROC)tlsGetFunction(1088);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord4hvNV(target, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glFogCoordhNV(JNIEnv *__env, jclass clazz, jshort fog) {
    glFogCoordhNVPROC glFogCoordhNV = (glFogCoordhNVPROC)tlsGetFunction(440);
    UNUSED_PARAM(clazz)
    glFogCoordhNV(fog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglFogCoordhvNV__J(JNIEnv *__env, jclass clazz, jlong fogAddress) {
    glFogCoordhvNVPROC glFogCoordhvNV = (glFogCoordhvNVPROC)tlsGetFunction(441);
    const intptr_t fog = (const intptr_t)fogAddress;
    UNUSED_PARAM(clazz)
    glFogCoordhvNV(fog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glSecondaryColor3hNV(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glSecondaryColor3hNVPROC glSecondaryColor3hNV = (glSecondaryColor3hNVPROC)tlsGetFunction(1515);
    UNUSED_PARAM(clazz)
    glSecondaryColor3hNV(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglSecondaryColor3hvNV__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3hvNVPROC glSecondaryColor3hvNV = (glSecondaryColor3hvNVPROC)tlsGetFunction(1516);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3hvNV(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glVertexWeighthNV(JNIEnv *__env, jclass clazz, jshort weight) {
    glVertexWeighthNVPROC glVertexWeighthNV = (glVertexWeighthNVPROC)tlsGetFunction(2117);
    UNUSED_PARAM(clazz)
    glVertexWeighthNV(weight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexWeighthvNV__J(JNIEnv *__env, jclass clazz, jlong weightAddress) {
    glVertexWeighthvNVPROC glVertexWeighthvNV = (glVertexWeighthvNVPROC)tlsGetFunction(2118);
    const intptr_t weight = (const intptr_t)weightAddress;
    UNUSED_PARAM(clazz)
    glVertexWeighthvNV(weight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glVertexAttrib1hNV(JNIEnv *__env, jclass clazz, jint index, jshort x) {
    glVertexAttrib1hNVPROC glVertexAttrib1hNV = (glVertexAttrib1hNVPROC)tlsGetFunction(1933);
    UNUSED_PARAM(clazz)
    glVertexAttrib1hNV(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib1hvNV__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib1hvNVPROC glVertexAttrib1hvNV = (glVertexAttrib1hvNVPROC)tlsGetFunction(1934);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib1hvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glVertexAttrib2hNV(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y) {
    glVertexAttrib2hNVPROC glVertexAttrib2hNV = (glVertexAttrib2hNVPROC)tlsGetFunction(1947);
    UNUSED_PARAM(clazz)
    glVertexAttrib2hNV(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib2hvNV__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib2hvNVPROC glVertexAttrib2hvNV = (glVertexAttrib2hvNVPROC)tlsGetFunction(1948);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib2hvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glVertexAttrib3hNV(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jshort z) {
    glVertexAttrib3hNVPROC glVertexAttrib3hNV = (glVertexAttrib3hNVPROC)tlsGetFunction(1961);
    UNUSED_PARAM(clazz)
    glVertexAttrib3hNV(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib3hvNV__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib3hvNVPROC glVertexAttrib3hvNV = (glVertexAttrib3hvNVPROC)tlsGetFunction(1962);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib3hvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_glVertexAttrib4hNV(JNIEnv *__env, jclass clazz, jint index, jshort x, jshort y, jshort z, jshort w) {
    glVertexAttrib4hNVPROC glVertexAttrib4hNV = (glVertexAttrib4hNVPROC)tlsGetFunction(1991);
    UNUSED_PARAM(clazz)
    glVertexAttrib4hNV(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttrib4hvNV__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttrib4hvNVPROC glVertexAttrib4hvNV = (glVertexAttrib4hvNVPROC)tlsGetFunction(1992);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttrib4hvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttribs1hvNV__IIJ(JNIEnv *__env, jclass clazz, jint index, jint n, jlong vAddress) {
    glVertexAttribs1hvNVPROC glVertexAttribs1hvNV = (glVertexAttribs1hvNVPROC)tlsGetFunction(2103);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribs1hvNV(index, n, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttribs2hvNV__IIJ(JNIEnv *__env, jclass clazz, jint index, jint n, jlong vAddress) {
    glVertexAttribs2hvNVPROC glVertexAttribs2hvNV = (glVertexAttribs2hvNVPROC)tlsGetFunction(2104);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribs2hvNV(index, n, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttribs3hvNV__IIJ(JNIEnv *__env, jclass clazz, jint index, jint n, jlong vAddress) {
    glVertexAttribs3hvNVPROC glVertexAttribs3hvNV = (glVertexAttribs3hvNVPROC)tlsGetFunction(2105);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribs3hvNV(index, n, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVHalfFloat_nglVertexAttribs4hvNV__IIJ(JNIEnv *__env, jclass clazz, jint index, jint n, jlong vAddress) {
    glVertexAttribs4hvNVPROC glVertexAttribs4hvNV = (glVertexAttribs4hvNVPROC)tlsGetFunction(2106);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribs4hvNV(index, n, v);
}

EXTERN_C_EXIT
