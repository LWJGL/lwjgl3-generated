/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "lz4.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1versionNumber(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_versionNumber();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1versionString(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_versionString();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1default(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity) {
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_default(src, dst, srcSize, dstCapacity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint compressedSize, jint dstCapacity) {
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe(src, dst, compressedSize, dstCapacity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1compressBound(JNIEnv *__env, jclass clazz, jint inputSize) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compressBound(inputSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast(src, dst, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1sizeofState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_sizeofState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    void *state = (void *)(intptr_t)stateAddress;
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast_extState(state, src, dst, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1destSize__JJJI(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jlong srcSizePtrAddress, jint targetDstSize) {
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    int *srcSizePtr = (int *)(intptr_t)srcSizePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_destSize(src, dst, srcSizePtr, targetDstSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint originalSize) {
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_fast(src, dst, originalSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1partial(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint compressedSize, jint targetOutputSize, jint dstCapacity) {
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_partial(src, dst, compressedSize, targetOutputSize, dstCapacity);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1createStream(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_createStream();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStream(JNIEnv *__env, jclass clazz, jlong streamPtrAddress) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_freeStream(streamPtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1resetStream(JNIEnv *__env, jclass clazz, jlong streamPtrAddress) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    UNUSED_PARAMS(__env, clazz)
    LZ4_resetStream(streamPtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1loadDict(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong dictionaryAddress, jint dictSize) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    const char *dictionary = (const char *)(intptr_t)dictionaryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_loadDict(streamPtr, dictionary, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1continue(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jint acceleration) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast_continue(streamPtr, src, dst, srcSize, dstCapacity, acceleration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1saveDict(JNIEnv *__env, jclass clazz, jlong streamPtrAddress, jlong safeBufferAddress, jint dictSize) {
    LZ4_stream_t *streamPtr = (LZ4_stream_t *)(intptr_t)streamPtrAddress;
    char *safeBuffer = (char *)(intptr_t)safeBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_saveDict(streamPtr, safeBuffer, dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1createStreamDecode(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)LZ4_createStreamDecode();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1freeStreamDecode(JNIEnv *__env, jclass clazz, jlong LZ4_streamAddress) {
    LZ4_streamDecode_t *LZ4_stream = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_freeStreamDecode(LZ4_stream);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1setStreamDecode(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong dictionaryAddress, jint dictSize) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    const char *dictionary = (const char *)(intptr_t)dictionaryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_setStreamDecode(LZ4_streamDecode, dictionary, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1continue(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_continue(LZ4_streamDecode, src, dst, srcSize, dstCapacity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1continue(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong srcAddress, jlong dstAddress, jint originalSize) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_fast_continue(LZ4_streamDecode, src, dst, originalSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1usingDict(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint srcSize, jint dstCapacity, jlong dictStartAddress, jint dictSize) {
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    const char *dictStart = (const char *)(intptr_t)dictStartAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_usingDict(src, dst, srcSize, dstCapacity, dictStart, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1usingDict(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jint originalSize, jlong dictStartAddress, jint dictSize) {
    const char *src = (const char *)(intptr_t)srcAddress;
    char *dst = (char *)(intptr_t)dstAddress;
    const char *dictStart = (const char *)(intptr_t)dictStartAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_fast_usingDict(src, dst, originalSize, dictStart, dictSize);
}

EXTERN_C_EXIT
