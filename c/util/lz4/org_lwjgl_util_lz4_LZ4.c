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

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1default(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jint sourceSize, jint maxDestSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_default(source, dest, sourceSize, maxDestSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jint compressedSize, jint maxDecompressedSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe(source, dest, compressedSize, maxDecompressedSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1compressBound(JNIEnv *__env, jclass clazz, jint inputSize) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compressBound(inputSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jint sourceSize, jint maxDestSize, jint acceleration) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast(source, dest, sourceSize, maxDestSize, acceleration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_LZ4_1sizeofState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_sizeofState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1fast_1extState(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong sourceAddress, jlong destAddress, jint inputSize, jint maxDestSize, jint acceleration) {
    void *state = (void *)(intptr_t)stateAddress;
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_fast_extState(state, source, dest, inputSize, maxDestSize, acceleration);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1destSize__JJJI(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jlong sourceSizePtrAddress, jint targetDestSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    int *sourceSizePtr = (int *)(intptr_t)sourceSizePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_compress_destSize(source, dest, sourceSizePtr, targetDestSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jint originalSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_fast(source, dest, originalSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1partial(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jint compressedSize, jint targetOutputSize, jint maxDecompressedSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_partial(source, dest, compressedSize, targetOutputSize, maxDecompressedSize);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1continue(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong sourceAddress, jlong destAddress, jint compressedSize, jint maxDecompressedSize) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_continue(LZ4_streamDecode, source, dest, compressedSize, maxDecompressedSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1continue(JNIEnv *__env, jclass clazz, jlong LZ4_streamDecodeAddress, jlong sourceAddress, jlong destAddress, jint originalSize) {
    LZ4_streamDecode_t *LZ4_streamDecode = (LZ4_streamDecode_t *)(intptr_t)LZ4_streamDecodeAddress;
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_fast_continue(LZ4_streamDecode, source, dest, originalSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1safe_1usingDict(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jint compressedSize, jint maxDecompressedSize, jlong dictStartAddress, jint dictSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    const char *dictStart = (const char *)(intptr_t)dictStartAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_safe_usingDict(source, dest, compressedSize, maxDecompressedSize, dictStart, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1decompress_1fast_1usingDict(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jint originalSize, jlong dictStartAddress, jint dictSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    const char *dictStart = (const char *)(intptr_t)dictStartAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LZ4_decompress_fast_usingDict(source, dest, originalSize, dictStart, dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1destSize__JJ_3II(JNIEnv *__env, jclass clazz, jlong sourceAddress, jlong destAddress, jintArray sourceSizePtrAddress, jint targetDestSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    jint __result;
    jint *sourceSizePtr = (*__env)->GetPrimitiveArrayCritical(__env, sourceSizePtrAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)LZ4_compress_destSize(source, dest, (int *)sourceSizePtr, targetDestSize);
    (*__env)->ReleasePrimitiveArrayCritical(__env, sourceSizePtrAddress, sourceSizePtr, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lz4_LZ4_nLZ4_1compress_1destSize__JJ_3II(jlong sourceAddress, jlong destAddress, jint sourceSizePtr__length, jint* sourceSizePtr, jint targetDestSize) {
    const char *source = (const char *)(intptr_t)sourceAddress;
    char *dest = (char *)(intptr_t)destAddress;
    UNUSED_PARAM(sourceSizePtr__length)
    return (jint)LZ4_compress_destSize(source, dest, (int *)sourceSizePtr, targetDestSize);
}

EXTERN_C_EXIT
