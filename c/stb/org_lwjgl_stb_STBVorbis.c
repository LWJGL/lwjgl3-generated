/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4701 4702 4711 4738))
#endif
#ifdef LWJGL_LINUX
	#include <alloca.h>
#endif
#include "stb_vorbis.c"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1info(JNIEnv *__env, jclass clazz, jlong fAddress, jlong __result) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	*((stb_vorbis_info*)(intptr_t)__result) = stb_vorbis_get_info(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1error(JNIEnv *__env, jclass clazz, jlong fAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_error(f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1close(JNIEnv *__env, jclass clazz, jlong fAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	stb_vorbis_close(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1sample_1offset(JNIEnv *__env, jclass clazz, jlong fAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_sample_offset(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1file_1offset(JNIEnv *__env, jclass clazz, jlong fAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_file_offset(f);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1pushdata__JIJJJ(JNIEnv *__env, jclass clazz, jlong datablockAddress, jint datablock_length_in_bytes, jlong datablock_memory_consumed_in_bytesAddress, jlong errorAddress, jlong alloc_bufferAddress) {
	const unsigned char *datablock = (const unsigned char *)(intptr_t)datablockAddress;
	int *datablock_memory_consumed_in_bytes = (int *)(intptr_t)datablock_memory_consumed_in_bytesAddress;
	int *error = (int *)(intptr_t)errorAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stb_vorbis_open_pushdata(datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1frame_1pushdata__JJIJJJ(JNIEnv *__env, jclass clazz, jlong fAddress, jlong datablockAddress, jint datablock_length_in_bytes, jlong channelsAddress, jlong outputAddress, jlong samplesAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	const unsigned char *datablock = (const unsigned char *)(intptr_t)datablockAddress;
	int *channels = (int *)(intptr_t)channelsAddress;
	float ***output = (float ***)(intptr_t)outputAddress;
	int *samples = (int *)(intptr_t)samplesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_decode_frame_pushdata(f, datablock, datablock_length_in_bytes, channels, output, samples);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1flush_1pushdata(JNIEnv *__env, jclass clazz, jlong fAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	stb_vorbis_flush_pushdata(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1filename__JJJJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong channelsAddress, jlong sample_rateAddress, jlong outputAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	int *channels = (int *)(intptr_t)channelsAddress;
	int *sample_rate = (int *)(intptr_t)sample_rateAddress;
	short **output = (short **)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_decode_filename(filename, channels, sample_rate, output);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1memory__JIJJJ(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jlong channelsAddress, jlong sample_rateAddress, jlong outputAddress) {
	const unsigned char *mem = (const unsigned char *)(intptr_t)memAddress;
	int *channels = (int *)(intptr_t)channelsAddress;
	int *sample_rate = (int *)(intptr_t)sample_rateAddress;
	short **output = (short **)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_decode_memory(mem, len, channels, sample_rate, output);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1memory__JIJJ(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jlong errorAddress, jlong alloc_bufferAddress) {
	const unsigned char *mem = (const unsigned char *)(intptr_t)memAddress;
	int *error = (int *)(intptr_t)errorAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stb_vorbis_open_memory(mem, len, error, alloc_buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1filename__JJJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong errorAddress, jlong alloc_bufferAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	int *error = (int *)(intptr_t)errorAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stb_vorbis_open_filename(filename, error, alloc_buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1seek_1frame(JNIEnv *__env, jclass clazz, jlong fAddress, jint sample_number) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_seek_frame(f, sample_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1seek(JNIEnv *__env, jclass clazz, jlong fAddress, jint sample_number) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_seek(f, sample_number);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1seek_1start(JNIEnv *__env, jclass clazz, jlong fAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	stb_vorbis_seek_start(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1stream_1length_1in_1samples(JNIEnv *__env, jclass clazz, jlong fAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_stream_length_in_samples(f);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1stream_1length_1in_1seconds(JNIEnv *__env, jclass clazz, jlong fAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)stb_vorbis_stream_length_in_seconds(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1float__JJJ(JNIEnv *__env, jclass clazz, jlong fAddress, jlong channelsAddress, jlong outputAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	int *channels = (int *)(intptr_t)channelsAddress;
	float ***output = (float ***)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_frame_float(f, channels, output);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1short(JNIEnv *__env, jclass clazz, jlong fAddress, jint num_c, jlong bufferAddress, jint num_samples) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	short **buffer = (short **)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_frame_short(f, num_c, buffer, num_samples);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1short_1interleaved__JIJI(JNIEnv *__env, jclass clazz, jlong fAddress, jint num_c, jlong bufferAddress, jint num_shorts) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	short *buffer = (short *)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_frame_short_interleaved(f, num_c, buffer, num_shorts);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1float(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_samples) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	float **buffer = (float **)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_samples_float(f, channels, buffer, num_samples);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1float_1interleaved__JIJI(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_floats) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	float *buffer = (float *)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_samples_float_interleaved(f, channels, buffer, num_floats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1short(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_samples) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	short **buffer = (short **)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_samples_short(f, channels, buffer, num_samples);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1short_1interleaved__JIJI(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_shorts) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	short *buffer = (short *)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_samples_short_interleaved(f, channels, buffer, num_shorts);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1pushdata__JI_3I_3IJ(JNIEnv *__env, jclass clazz, jlong datablockAddress, jint datablock_length_in_bytes, jintArray datablock_memory_consumed_in_bytesAddress, jintArray errorAddress, jlong alloc_bufferAddress) {
	const unsigned char *datablock = (const unsigned char *)(intptr_t)datablockAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	jlong __result;
	jint *datablock_memory_consumed_in_bytes = (*__env)->GetPrimitiveArrayCritical(__env, datablock_memory_consumed_in_bytesAddress, 0);
	jint *error = (*__env)->GetPrimitiveArrayCritical(__env, errorAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jlong)(intptr_t)stb_vorbis_open_pushdata(datablock, datablock_length_in_bytes, (int *)datablock_memory_consumed_in_bytes, (int *)error, alloc_buffer);
	(*__env)->ReleasePrimitiveArrayCritical(__env, errorAddress, error, 0);
	(*__env)->ReleasePrimitiveArrayCritical(__env, datablock_memory_consumed_in_bytesAddress, datablock_memory_consumed_in_bytes, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1pushdata__JI_3I_3IJ(jlong datablockAddress, jint datablock_length_in_bytes, jint datablock_memory_consumed_in_bytes__length, jint* datablock_memory_consumed_in_bytes, jint error__length, jint* error, jlong alloc_bufferAddress) {
	const unsigned char *datablock = (const unsigned char *)(intptr_t)datablockAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	UNUSED_PARAM(datablock_memory_consumed_in_bytes__length)
	UNUSED_PARAM(error__length)
	return (jlong)(intptr_t)stb_vorbis_open_pushdata(datablock, datablock_length_in_bytes, (int *)datablock_memory_consumed_in_bytes, (int *)error, alloc_buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1frame_1pushdata__JJI_3IJ_3I(JNIEnv *__env, jclass clazz, jlong fAddress, jlong datablockAddress, jint datablock_length_in_bytes, jintArray channelsAddress, jlong outputAddress, jintArray samplesAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	const unsigned char *datablock = (const unsigned char *)(intptr_t)datablockAddress;
	float ***output = (float ***)(intptr_t)outputAddress;
	jint __result;
	jint *channels = channelsAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, channelsAddress, 0);
	jint *samples = (*__env)->GetPrimitiveArrayCritical(__env, samplesAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stb_vorbis_decode_frame_pushdata(f, datablock, datablock_length_in_bytes, (int *)channels, output, (int *)samples);
	(*__env)->ReleasePrimitiveArrayCritical(__env, samplesAddress, samples, 0);
	if ( channels != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, channelsAddress, channels, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1frame_1pushdata__JJI_3IJ_3I(jlong fAddress, jlong datablockAddress, jint datablock_length_in_bytes, jint channels__length, jint* channels, jlong outputAddress, jint samples__length, jint* samples) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	const unsigned char *datablock = (const unsigned char *)(intptr_t)datablockAddress;
	float ***output = (float ***)(intptr_t)outputAddress;
	UNUSED_PARAM(channels__length)
	UNUSED_PARAM(samples__length)
	return (jint)stb_vorbis_decode_frame_pushdata(f, datablock, datablock_length_in_bytes, (int *)channels, output, (int *)samples);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1filename__J_3I_3IJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jintArray channelsAddress, jintArray sample_rateAddress, jlong outputAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	short **output = (short **)(intptr_t)outputAddress;
	jint __result;
	jint *channels = (*__env)->GetPrimitiveArrayCritical(__env, channelsAddress, 0);
	jint *sample_rate = (*__env)->GetPrimitiveArrayCritical(__env, sample_rateAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stb_vorbis_decode_filename(filename, (int *)channels, (int *)sample_rate, output);
	(*__env)->ReleasePrimitiveArrayCritical(__env, sample_rateAddress, sample_rate, 0);
	(*__env)->ReleasePrimitiveArrayCritical(__env, channelsAddress, channels, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1filename__J_3I_3IJ(jlong filenameAddress, jint channels__length, jint* channels, jint sample_rate__length, jint* sample_rate, jlong outputAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	short **output = (short **)(intptr_t)outputAddress;
	UNUSED_PARAM(channels__length)
	UNUSED_PARAM(sample_rate__length)
	return (jint)stb_vorbis_decode_filename(filename, (int *)channels, (int *)sample_rate, output);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1memory__JI_3I_3IJ(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jintArray channelsAddress, jintArray sample_rateAddress, jlong outputAddress) {
	const unsigned char *mem = (const unsigned char *)(intptr_t)memAddress;
	short **output = (short **)(intptr_t)outputAddress;
	jint __result;
	jint *channels = (*__env)->GetPrimitiveArrayCritical(__env, channelsAddress, 0);
	jint *sample_rate = (*__env)->GetPrimitiveArrayCritical(__env, sample_rateAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stb_vorbis_decode_memory(mem, len, (int *)channels, (int *)sample_rate, output);
	(*__env)->ReleasePrimitiveArrayCritical(__env, sample_rateAddress, sample_rate, 0);
	(*__env)->ReleasePrimitiveArrayCritical(__env, channelsAddress, channels, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1memory__JI_3I_3IJ(jlong memAddress, jint len, jint channels__length, jint* channels, jint sample_rate__length, jint* sample_rate, jlong outputAddress) {
	const unsigned char *mem = (const unsigned char *)(intptr_t)memAddress;
	short **output = (short **)(intptr_t)outputAddress;
	UNUSED_PARAM(channels__length)
	UNUSED_PARAM(sample_rate__length)
	return (jint)stb_vorbis_decode_memory(mem, len, (int *)channels, (int *)sample_rate, output);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1memory__JI_3IJ(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jintArray errorAddress, jlong alloc_bufferAddress) {
	const unsigned char *mem = (const unsigned char *)(intptr_t)memAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	jlong __result;
	jint *error = (*__env)->GetPrimitiveArrayCritical(__env, errorAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jlong)(intptr_t)stb_vorbis_open_memory(mem, len, (int *)error, alloc_buffer);
	(*__env)->ReleasePrimitiveArrayCritical(__env, errorAddress, error, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1memory__JI_3IJ(jlong memAddress, jint len, jint error__length, jint* error, jlong alloc_bufferAddress) {
	const unsigned char *mem = (const unsigned char *)(intptr_t)memAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	UNUSED_PARAM(error__length)
	return (jlong)(intptr_t)stb_vorbis_open_memory(mem, len, (int *)error, alloc_buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1filename__J_3IJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jintArray errorAddress, jlong alloc_bufferAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	jlong __result;
	jint *error = (*__env)->GetPrimitiveArrayCritical(__env, errorAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jlong)(intptr_t)stb_vorbis_open_filename(filename, (int *)error, alloc_buffer);
	(*__env)->ReleasePrimitiveArrayCritical(__env, errorAddress, error, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1filename__J_3IJ(jlong filenameAddress, jint error__length, jint* error, jlong alloc_bufferAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	const stb_vorbis_alloc *alloc_buffer = (const stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	UNUSED_PARAM(error__length)
	return (jlong)(intptr_t)stb_vorbis_open_filename(filename, (int *)error, alloc_buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1float__J_3IJ(JNIEnv *__env, jclass clazz, jlong fAddress, jintArray channelsAddress, jlong outputAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	float ***output = (float ***)(intptr_t)outputAddress;
	jint __result;
	jint *channels = channelsAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, channelsAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stb_vorbis_get_frame_float(f, (int *)channels, output);
	if ( channels != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, channelsAddress, channels, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1float__J_3IJ(jlong fAddress, jint channels__length, jint* channels, jlong outputAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	float ***output = (float ***)(intptr_t)outputAddress;
	UNUSED_PARAM(channels__length)
	return (jint)stb_vorbis_get_frame_float(f, (int *)channels, output);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1short_1interleaved__JI_3SI(JNIEnv *__env, jclass clazz, jlong fAddress, jint num_c, jshortArray bufferAddress, jint num_shorts) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	jint __result;
	jshort *buffer = (*__env)->GetPrimitiveArrayCritical(__env, bufferAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stb_vorbis_get_frame_short_interleaved(f, num_c, (short *)buffer, num_shorts);
	(*__env)->ReleasePrimitiveArrayCritical(__env, bufferAddress, buffer, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1short_1interleaved__JI_3SI(jlong fAddress, jint num_c, jint buffer__length, jshort* buffer, jint num_shorts) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAM(buffer__length)
	return (jint)stb_vorbis_get_frame_short_interleaved(f, num_c, (short *)buffer, num_shorts);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1float_1interleaved__JI_3FI(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jfloatArray bufferAddress, jint num_floats) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	jint __result;
	jfloat *buffer = (*__env)->GetPrimitiveArrayCritical(__env, bufferAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stb_vorbis_get_samples_float_interleaved(f, channels, (float *)buffer, num_floats);
	(*__env)->ReleasePrimitiveArrayCritical(__env, bufferAddress, buffer, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1float_1interleaved__JI_3FI(jlong fAddress, jint channels, jint buffer__length, jfloat* buffer, jint num_floats) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAM(buffer__length)
	return (jint)stb_vorbis_get_samples_float_interleaved(f, channels, (float *)buffer, num_floats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1short_1interleaved__JI_3SI(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jshortArray bufferAddress, jint num_shorts) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	jint __result;
	jshort *buffer = (*__env)->GetPrimitiveArrayCritical(__env, bufferAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)stb_vorbis_get_samples_short_interleaved(f, channels, (short *)buffer, num_shorts);
	(*__env)->ReleasePrimitiveArrayCritical(__env, bufferAddress, buffer, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1short_1interleaved__JI_3SI(jlong fAddress, jint channels, jint buffer__length, jshort* buffer, jint num_shorts) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	UNUSED_PARAM(buffer__length)
	return (jint)stb_vorbis_get_samples_short_interleaved(f, channels, (short *)buffer, num_shorts);
}

EXTERN_C_EXIT
