/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define ZSTD_STATIC_LINKING_ONLY
#include "zstd.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1findFrameCompressedSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    const void *src = (const void *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_findFrameCompressedSize(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1findDecompressedSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    const void *src = (const void *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_findDecompressedSize(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1frameHeaderSize(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    const void *src = (const void *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_frameHeaderSize(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1sizeof_1CCtx(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    const ZSTD_CCtx *cctx = (const ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_CCtx(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1sizeof_1DCtx(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    const ZSTD_DCtx *dctx = (const ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_DCtx(dctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1sizeof_1CStream(JNIEnv *__env, jclass clazz, jlong zcsAddress) {
    const ZSTD_CStream *zcs = (const ZSTD_CStream *)(intptr_t)zcsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_CStream(zcs);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1sizeof_1DStream(JNIEnv *__env, jclass clazz, jlong zdsAddress) {
    const ZSTD_DStream *zds = (const ZSTD_DStream *)(intptr_t)zdsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_DStream(zds);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1sizeof_1CDict(JNIEnv *__env, jclass clazz, jlong cdictAddress) {
    const ZSTD_CDict *cdict = (const ZSTD_CDict *)(intptr_t)cdictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_CDict(cdict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1sizeof_1DDict(JNIEnv *__env, jclass clazz, jlong ddictAddress) {
    const ZSTD_DDict *ddict = (const ZSTD_DDict *)(intptr_t)ddictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_sizeof_DDict(ddict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateCCtxSize(JNIEnv *__env, jclass clazz, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCCtxSize(compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateCCtxSize_1usingCCtxParams(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    const ZSTD_CCtx_params *params = (const ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCCtxSize_usingCCtxParams(params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateDCtxSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateDCtxSize();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateCStreamSize(JNIEnv *__env, jclass clazz, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCStreamSize(compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateCStreamSize_1usingCCtxParams(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    const ZSTD_CCtx_params *params = (const ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCStreamSize_usingCCtxParams(params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateDStreamSize(JNIEnv *__env, jclass clazz, jlong windowSize) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateDStreamSize((size_t)windowSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1estimateDStreamSize_1fromFrame(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    const void *src = (const void *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateDStreamSize_fromFrame(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateCDictSize(JNIEnv *__env, jclass clazz, jlong dictSize, jint compressionLevel) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateCDictSize((size_t)dictSize, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1estimateDDictSize(JNIEnv *__env, jclass clazz, jlong dictSize, jint dictLoadMethod) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_estimateDDictSize((size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1defaultCMem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&ZSTD_defaultCMem;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createCCtx_1advanced(JNIEnv *__env, jclass clazz, jlong customMemAddress) {
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCCtx_advanced(*customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticCCtx(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticCCtx(workspace, (size_t)workspaceSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1isFrame(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong size) {
    const void *buffer = (const void *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_isFrame(buffer, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createDCtx_1advanced(JNIEnv *__env, jclass clazz, jlong customMemAddress) {
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDCtx_advanced(*customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticDCtx(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticDCtx(workspace, (size_t)workspaceSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createDDict_1advanced(JNIEnv *__env, jclass clazz, jlong dictAddress, jlong dictSize, jint dictLoadMethod, jlong customMemAddress) {
    const void *dict = (const void *)(intptr_t)dictAddress;
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDDict_advanced(dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod, *customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticDDict(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize, jlong dictAddress, jlong dictSize, jint dictLoadMethod) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    const void *dict = (const void *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticDDict(workspace, (size_t)workspaceSize, dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getDictID_1fromDict(JNIEnv *__env, jclass clazz, jlong dictAddress, jlong dictSize) {
    const void *dict = (const void *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_getDictID_fromDict(dict, (size_t)dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getDictID_1fromDDict(JNIEnv *__env, jclass clazz, jlong ddictAddress) {
    const ZSTD_DDict *ddict = (const ZSTD_DDict *)(intptr_t)ddictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_getDictID_fromDDict(ddict);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getDictID_1fromFrame(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong srcSize) {
    const void *src = (const void *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZSTD_getDictID_fromFrame(src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createCStream_1advanced(JNIEnv *__env, jclass clazz, jlong customMemAddress) {
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCStream_advanced(*customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticCStream(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticCStream(workspace, (size_t)workspaceSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1createDStream_1advanced(JNIEnv *__env, jclass clazz, jlong customMemAddress) {
    ZSTD_customMem *customMem = (ZSTD_customMem *)(intptr_t)customMemAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createDStream_advanced(*customMem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initStaticDStream(JNIEnv *__env, jclass clazz, jlong workspaceAddress, jlong workspaceSize) {
    void *workspace = (void *)(intptr_t)workspaceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_initStaticDStream(workspace, (size_t)workspaceSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1copyCCtx(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong preparedCCtxAddress, jlong pledgedSrcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    const ZSTD_CCtx *preparedCCtx = (const ZSTD_CCtx *)(intptr_t)preparedCCtxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_copyCCtx(cctx, preparedCCtx, (unsigned long long)pledgedSrcSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getFrameProgression(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong __result) {
    const ZSTD_CCtx *cctx = (const ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ZSTD_frameProgression*)(intptr_t)__result) = ZSTD_getFrameProgression(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getFrameHeader(JNIEnv *__env, jclass clazz, jlong zfhPtrAddress, jlong srcAddress, jlong srcSize) {
    ZSTD_frameHeader *zfhPtr = (ZSTD_frameHeader *)(intptr_t)zfhPtrAddress;
    const void *src = (const void *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_getFrameHeader(zfhPtr, src, (size_t)srcSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1copyDCtx(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong preparedDCtxAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    const ZSTD_DCtx *preparedDCtx = (const ZSTD_DCtx *)(intptr_t)preparedDCtxAddress;
    UNUSED_PARAMS(__env, clazz)
    ZSTD_copyDCtx(dctx, preparedDCtx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1setParameter(JNIEnv *__env, jclass clazz, jlong cctxAddress, jint param, jint value) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_setParameter(cctx, (ZSTD_cParameter)param, (unsigned int)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1setPledgedSrcSize(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong pledgedSrcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_setPledgedSrcSize(cctx, (unsigned long long)pledgedSrcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1loadDictionary(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dictAddress, jlong dictSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    const void *dict = (const void *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_loadDictionary(cctx, dict, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1loadDictionary_1byReference(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dictAddress, jlong dictSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    const void *dict = (const void *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_loadDictionary_byReference(cctx, dict, (size_t)dictSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1loadDictionary_1advanced(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dictAddress, jlong dictSize, jint dictLoadMethod, jint dictMode) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    const void *dict = (const void *)(intptr_t)dictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_loadDictionary_advanced(cctx, dict, (size_t)dictSize, (ZSTD_dictLoadMethod_e)dictLoadMethod, (ZSTD_dictMode_e)dictMode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1refCDict(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong cdictAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    const ZSTD_CDict *cdict = (const ZSTD_CDict *)(intptr_t)cdictAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_refCDict(cctx, cdict);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1refPrefix(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong prefixAddress, jlong prefixSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    const void *prefix = (const void *)(intptr_t)prefixAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_refPrefix(cctx, prefix, (size_t)prefixSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1refPrefix_1advanced(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong prefixAddress, jlong prefixSize, jint dictMode) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    const void *prefix = (const void *)(intptr_t)prefixAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_refPrefix_advanced(cctx, prefix, (size_t)prefixSize, (ZSTD_dictMode_e)dictMode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compress_1generic(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong outputAddress, jlong inputAddress, jint endOp) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    ZSTD_inBuffer *input = (ZSTD_inBuffer *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compress_generic(cctx, output, input, (ZSTD_EndDirective)endOp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1reset(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    ZSTD_CCtx_reset(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compress_1generic_1simpleArgs(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong dstPosAddress, jlong srcAddress, jlong srcSize, jlong srcPosAddress, jint endOp) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    size_t *dstPos = (size_t *)(intptr_t)dstPosAddress;
    const void *src = (const void *)(intptr_t)srcAddress;
    size_t *srcPos = (size_t *)(intptr_t)srcPosAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compress_generic_simpleArgs(cctx, dst, (size_t)dstCapacity, dstPos, src, (size_t)srcSize, srcPos, (ZSTD_EndDirective)endOp);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_ZSTD_1createCCtxParams(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZSTD_createCCtxParams();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1resetCCtxParams(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    ZSTD_CCtx_params *params = (ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_resetCCtxParams(params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1initCCtxParams(JNIEnv *__env, jclass clazz, jlong cctxParamsAddress, jint compressionLevel) {
    ZSTD_CCtx_params *cctxParams = (ZSTD_CCtx_params *)(intptr_t)cctxParamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_initCCtxParams(cctxParams, compressionLevel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1freeCCtxParams(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    ZSTD_CCtx_params *params = (ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_freeCCtxParams(params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtxParam_1setParameter(JNIEnv *__env, jclass clazz, jlong paramsAddress, jint param, jint value) {
    ZSTD_CCtx_params *params = (ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtxParam_setParameter(params, (ZSTD_cParameter)param, (unsigned int)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1CCtx_1setParametersUsingCCtxParams(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong paramsAddress) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    const ZSTD_CCtx_params *params = (const ZSTD_CCtx_params *)(intptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_CCtx_setParametersUsingCCtxParams(cctx, params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1DCtx_1setMaxWindowSize(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong maxWindowSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_setMaxWindowSize(dctx, (size_t)maxWindowSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1DCtx_1setFormat(JNIEnv *__env, jclass clazz, jlong dctxAddress, jint format) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_DCtx_setFormat(dctx, (ZSTD_format_e)format);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompress_1generic(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong outputAddress, jlong inputAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    ZSTD_outBuffer *output = (ZSTD_outBuffer *)(intptr_t)outputAddress;
    ZSTD_inBuffer *input = (ZSTD_inBuffer *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompress_generic(dctx, output, input);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompress_1generic_1simpleArgs(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong dstPosAddress, jlong srcAddress, jlong srcSize, jlong srcPosAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    size_t *dstPos = (size_t *)(intptr_t)dstPosAddress;
    const void *src = (const void *)(intptr_t)srcAddress;
    size_t *srcPos = (size_t *)(intptr_t)srcPosAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompress_generic_simpleArgs(dctx, dst, (size_t)dstCapacity, dstPos, src, (size_t)srcSize, srcPos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1DCtx_1reset(JNIEnv *__env, jclass clazz, jlong dctxAddress) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    UNUSED_PARAMS(__env, clazz)
    ZSTD_DCtx_reset(dctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1getBlockSize(JNIEnv *__env, jclass clazz, jlong cctxAddress) {
    const ZSTD_CCtx *cctx = (const ZSTD_CCtx *)(intptr_t)cctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_getBlockSize(cctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1compressBlock(JNIEnv *__env, jclass clazz, jlong cctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_CCtx *cctx = (ZSTD_CCtx *)(intptr_t)cctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    const void *src = (const void *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_compressBlock(cctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1decompressBlock(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong dstAddress, jlong dstCapacity, jlong srcAddress, jlong srcSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    void *dst = (void *)(intptr_t)dstAddress;
    const void *src = (const void *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_decompressBlock(dctx, dst, (size_t)dstCapacity, src, (size_t)srcSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdX_nZSTD_1insertBlock(JNIEnv *__env, jclass clazz, jlong dctxAddress, jlong blockStartAddress, jlong blockSize) {
    ZSTD_DCtx *dctx = (ZSTD_DCtx *)(intptr_t)dctxAddress;
    const void *blockStart = (const void *)(intptr_t)blockStartAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZSTD_insertBlock(dctx, blockStart, (size_t)blockSize);
}

EXTERN_C_EXIT
