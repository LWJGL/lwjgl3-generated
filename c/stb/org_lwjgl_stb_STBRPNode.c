/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4701 4702 4711 4738))
#endif
#include "stb_rect_pack.h"
ENABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    #define alignof __alignof
#else
    #include <stdalign.h>
#endif

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBRPNode_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(intptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = alignof(stbrp_node);

    return sizeof(stbrp_node);
}

EXTERN_C_EXIT
