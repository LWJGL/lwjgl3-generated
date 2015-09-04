/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4701 4702 4711 4996))
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

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1pushdata(JNIEnv *__env, jclass clazz, jlong datablockAddress, jint datablock_length_in_bytes, jlong datablock_memory_consumed_in_bytesAddress, jlong errorAddress, jlong alloc_bufferAddress) {
	unsigned char *datablock = (unsigned char *)(intptr_t)datablockAddress;
	int *datablock_memory_consumed_in_bytes = (int *)(intptr_t)datablock_memory_consumed_in_bytesAddress;
	int *error = (int *)(intptr_t)errorAddress;
	stb_vorbis_alloc *alloc_buffer = (stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stb_vorbis_open_pushdata(datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1frame_1pushdata(JNIEnv *__env, jclass clazz, jlong fAddress, jlong datablockAddress, jint datablock_length_in_bytes, jlong channelsAddress, jlong outputAddress, jlong samplesAddress) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	unsigned char *datablock = (unsigned char *)(intptr_t)datablockAddress;
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1filename(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong channelsAddress, jlong sample_rateAddress, jlong outputAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	int *channels = (int *)(intptr_t)channelsAddress;
	int *sample_rate = (int *)(intptr_t)sample_rateAddress;
	short **output = (short **)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_decode_filename(filename, channels, sample_rate, output);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1memory(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jlong channelsAddress, jlong sample_rateAddress, jlong outputAddress) {
	const unsigned char *mem = (const unsigned char *)(intptr_t)memAddress;
	int *channels = (int *)(intptr_t)channelsAddress;
	int *sample_rate = (int *)(intptr_t)sample_rateAddress;
	short **output = (short **)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_decode_memory(mem, len, channels, sample_rate, output);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1memory(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jlong errorAddress, jlong alloc_bufferAddress) {
	const unsigned char *mem = (const unsigned char *)(intptr_t)memAddress;
	int *error = (int *)(intptr_t)errorAddress;
	stb_vorbis_alloc *alloc_buffer = (stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stb_vorbis_open_memory(mem, len, error, alloc_buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1filename(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong errorAddress, jlong alloc_bufferAddress) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	int *error = (int *)(intptr_t)errorAddress;
	stb_vorbis_alloc *alloc_buffer = (stb_vorbis_alloc *)(intptr_t)alloc_bufferAddress;
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1float(JNIEnv *__env, jclass clazz, jlong fAddress, jlong channelsAddress, jlong outputAddress) {
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1short_1interleaved(JNIEnv *__env, jclass clazz, jlong fAddress, jint num_c, jlong bufferAddress, jint num_shorts) {
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1float_1interleaved(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_floats) {
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

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1short_1interleaved(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_shorts) {
	stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
	short *buffer = (short *)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stb_vorbis_get_samples_short_interleaved(f, channels, buffer, num_shorts);
}

EXTERN_C_EXIT
