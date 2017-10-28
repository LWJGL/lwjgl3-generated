/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
    __pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
#include "lwjgl_malloc.h"
#define PAR_MALLOC(T, N) ((T*) org_lwjgl_malloc(N * sizeof(T)))
#define PAR_CALLOC(T, N) ((T*) org_lwjgl_calloc(N, sizeof(T)))
#define PAR_REALLOC(T, BUF, N) ((T*) org_lwjgl_realloc(BUF, sizeof(T) * N))
#define PAR_FREE(BUF) org_lwjgl_free(BUF)
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4738))
#elif LWJGL_LINUX
    #pragma GCC diagnostic ignored "-Wunused-parameter"
#endif
#define PAR_SHAPES_IMPLEMENTATION
#include "par_shapes.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1free_1mesh(JNIEnv *__env, jclass clazz, jlong meshAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_free_mesh(mesh);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cylinder(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_cylinder(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1torus(JNIEnv *__env, jclass clazz, jint slices, jint stacks, jfloat radius) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_torus(slices, stacks, radius);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1parametric_1sphere(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_parametric_sphere(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1subdivided_1sphere(JNIEnv *__env, jclass clazz, jint nsubdivisions) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_subdivided_sphere(nsubdivisions);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1klein_1bottle(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_klein_bottle(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1trefoil_1knot(JNIEnv *__env, jclass clazz, jint slices, jint stacks, jfloat radius) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_trefoil_knot(slices, stacks, radius);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1hemisphere(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_hemisphere(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1plane(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_plane(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1icosahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_icosahedron();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1dodecahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_dodecahedron();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1octahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_octahedron();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1tetrahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_tetrahedron();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cube(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_cube();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FIJJ(JNIEnv *__env, jclass clazz, jfloat radius, jint slices, jlong centerAddress, jlong normalAddress) {
    const float *center = (const float *)(intptr_t)centerAddress;
    const float *normal = (const float *)(intptr_t)normalAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_disk(radius, slices, center, normal);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1empty(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_empty();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1rock(JNIEnv *__env, jclass clazz, jint seed, jint nsubdivisions) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_rock(seed, nsubdivisions);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1lsystem(JNIEnv *__env, jclass clazz, jlong programAddress, jint slices, jint maxdepth) {
    const char *program = (const char *)(intptr_t)programAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_create_lsystem(program, slices, maxdepth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1export(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong objfileAddress) {
    const par_shapes_mesh *mesh = (const par_shapes_mesh *)(intptr_t)meshAddress;
    const char *objfile = (const char *)(intptr_t)objfileAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_export(mesh, objfile);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__JJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong aabbAddress) {
    const par_shapes_mesh *mesh = (const par_shapes_mesh *)(intptr_t)meshAddress;
    float *aabb = (float *)(intptr_t)aabbAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_compute_aabb(mesh, aabb);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1clone(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong targetAddress) {
    const par_shapes_mesh *mesh = (const par_shapes_mesh *)(intptr_t)meshAddress;
    par_shapes_mesh *target = (par_shapes_mesh *)(intptr_t)targetAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_clone(mesh, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    par_shapes_mesh *dst = (par_shapes_mesh *)(intptr_t)dstAddress;
    const par_shapes_mesh *src = (const par_shapes_mesh *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_merge(dst, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1translate(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat x, jfloat y, jfloat z) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_translate(mesh, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JFJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat radians, jlong axisAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    const float *axis = (const float *)(intptr_t)axisAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_rotate(mesh, radians, axis);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1scale(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat x, jfloat y, jfloat z) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_scale(mesh, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge_1and_1free(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    par_shapes_mesh *dst = (par_shapes_mesh *)(intptr_t)dstAddress;
    par_shapes_mesh *src = (par_shapes_mesh *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_merge_and_free(dst, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1invert(JNIEnv *__env, jclass clazz, jlong meshAddress, jint startface, jint nfaces) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_invert(mesh, startface, nfaces);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1remove_1degenerate(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat minarea) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_remove_degenerate(mesh, minarea);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1unweld(JNIEnv *__env, jclass clazz, jlong meshAddress, jboolean create_indices) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_unweld(mesh, create_indices);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JFJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat epsilon, jlong mappingAddress) {
    const par_shapes_mesh *mesh = (const par_shapes_mesh *)(intptr_t)meshAddress;
    PAR_SHAPES_T *mapping = (PAR_SHAPES_T *)(intptr_t)mappingAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)par_shapes_weld(mesh, epsilon, mapping);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1normals(JNIEnv *__env, jclass clazz, jlong meshAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_compute_normals(mesh);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FI_3F_3F(JNIEnv *__env, jclass clazz, jfloat radius, jint slices, jfloatArray centerAddress, jfloatArray normalAddress) {
    jlong __result;
    jfloat *center = (*__env)->GetPrimitiveArrayCritical(__env, centerAddress, 0);
    jfloat *normal = (*__env)->GetPrimitiveArrayCritical(__env, normalAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)par_shapes_create_disk(radius, slices, (const float *)center, (const float *)normal);
    (*__env)->ReleasePrimitiveArrayCritical(__env, normalAddress, normal, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, centerAddress, center, 0);
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FI_3F_3F(jfloat radius, jint slices, jint center__length, jfloat* center, jint normal__length, jfloat* normal) {
    UNUSED_PARAM(center__length)
    UNUSED_PARAM(normal__length)
    return (jlong)(intptr_t)par_shapes_create_disk(radius, slices, (const float *)center, (const float *)normal);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__J_3F(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloatArray aabbAddress) {
    const par_shapes_mesh *mesh = (const par_shapes_mesh *)(intptr_t)meshAddress;
    jfloat *aabb = (*__env)->GetPrimitiveArrayCritical(__env, aabbAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    par_shapes_compute_aabb(mesh, (float *)aabb);
    (*__env)->ReleasePrimitiveArrayCritical(__env, aabbAddress, aabb, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__J_3F(jlong meshAddress, jint aabb__length, jfloat* aabb) {
    const par_shapes_mesh *mesh = (const par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAM(aabb__length)
    par_shapes_compute_aabb(mesh, (float *)aabb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JF_3F(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat radians, jfloatArray axisAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    jfloat *axis = (*__env)->GetPrimitiveArrayCritical(__env, axisAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    par_shapes_rotate(mesh, radians, (const float *)axis);
    (*__env)->ReleasePrimitiveArrayCritical(__env, axisAddress, axis, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JF_3F(jlong meshAddress, jfloat radians, jint axis__length, jfloat* axis) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAM(axis__length)
    par_shapes_rotate(mesh, radians, (const float *)axis);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JF_3S(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat epsilon, jshortArray mappingAddress) {
    const par_shapes_mesh *mesh = (const par_shapes_mesh *)(intptr_t)meshAddress;
    jlong __result;
    jshort *mapping = mappingAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, mappingAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)par_shapes_weld(mesh, epsilon, (PAR_SHAPES_T *)mapping);
    if (mapping != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, mappingAddress, mapping, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JF_3S(jlong meshAddress, jfloat epsilon, jint mapping__length, jshort* mapping) {
    const par_shapes_mesh *mesh = (const par_shapes_mesh *)(intptr_t)meshAddress;
    UNUSED_PARAM(mapping__length)
    return (jlong)(intptr_t)par_shapes_weld(mesh, epsilon, (PAR_SHAPES_T *)mapping);
}

EXTERN_C_EXIT
