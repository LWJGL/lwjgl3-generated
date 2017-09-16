/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glImportMemoryFdEXTPROC) (jint, jlong, jint, jint);
typedef void (APIENTRY *glImportSemaphoreFdEXTPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTMemoryObjectFD_glImportMemoryFdEXT(JNIEnv *__env, jclass clazz, jint memory, jlong size, jint handleType, jint fd) {
    glImportMemoryFdEXTPROC glImportMemoryFdEXT = (glImportMemoryFdEXTPROC)tlsGetFunction(843);
    UNUSED_PARAM(clazz)
    glImportMemoryFdEXT(memory, size, handleType, fd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTMemoryObjectFD_glImportSemaphoreFdEXT(JNIEnv *__env, jclass clazz, jint semaphore, jint handleType, jint fd) {
    glImportSemaphoreFdEXTPROC glImportSemaphoreFdEXT = (glImportSemaphoreFdEXTPROC)tlsGetFunction(846);
    UNUSED_PARAM(clazz)
    glImportSemaphoreFdEXT(semaphore, handleType, fd);
}

EXTERN_C_EXIT
