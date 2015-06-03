/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://kcat.strangesoft.net/openal-extensions/SOFT_buffer_samples.txt">SOFT_buffer_samples</a> extension.
 * 
 * <p>This extension provides a more flexible mechanism for loading buffer data, as well as a method to retrieve buffer data. Unextended OpenAL only provides
 * a method to specify a single buffer format when loading data, which defines the data given by the application. The AL is given leeway in converting the
 * data, so that it is possible or more efficient to use internally. However, there are some drawbacks to this approach:
 * <ul>
 * <li>The conversion done by the implementation is hidden from the app. This makes it difficult for the app to know what kind of precision it will have,
 * and impossible to request a storage precision.</li>
 * <li>Conversion is not guaranteed, so the application can be restricted in the formats that can be loaded depending on the implementation.</li>
 * </ul>
 * If the application could specify the internal storage format, as well as use a separate format to specify the incoming data's format, it would allow to
 * add more input formats (signed 8-bit, 32-bit int, and float, for example), with no undue burden placed on the implementation beyond needing some
 * conversion routines. The application can then be assured that many different formats can be loaded, even if storage is restricted to a comparatively
 * small subset.</p>
 * 
 * <p>In addition, unextended OpenAL does not have any methods for updating only a portion of a buffer, nor a method to retrieve the data from a buffer.</p>
 */
public final class SOFTBufferSamples {

	/** Accepted by the {@code internalformat} parameter of alBufferSamplesSOFT (values are shared with standard OpenAL, AL_EXT_FLOAT32, and AL_EXT_MCFORMATS). */
	public static final int
		AL_MONO8_SOFT       = 0x1100,
		AL_MONO16_SOFT      = 0x1101,
		AL_MONO32F_SOFT     = 0x10010,
		AL_STEREO8_SOFT     = 0x1102,
		AL_STEREO16_SOFT    = 0x1103,
		AL_STEREO32F_SOFT   = 0x10011,
		AL_QUAD8_SOFT       = 0x1204,
		AL_QUAD16_SOFT      = 0x1205,
		AL_QUAD32F_SOFT     = 0x1206,
		AL_REAR8_SOFT       = 0x1207,
		AL_REAR16_SOFT      = 0x1208,
		AL_REAR32F_SOFT     = 0x1209,
		AL_5POINT1_8_SOFT   = 0x120A,
		AL_5POINT1_16_SOFT  = 0x120B,
		AL_5POINT1_32F_SOFT = 0x120C,
		AL_6POINT1_8_SOFT   = 0x120D,
		AL_6POINT1_16_SOFT  = 0x120E,
		AL_6POINT1_32F_SOFT = 0x120F,
		AL_7POINT1_8_SOFT   = 0x1210,
		AL_7POINT1_16_SOFT  = 0x1211,
		AL_7POINT1_32F_SOFT = 0x1212;

	/** Accepted by the {@code channels} parameter of alBufferSamplesSOFT, alBufferSubSamplesSOFT, and alGetBufferSamplesSOFT. */
	public static final int
		AL_MONO_SOFT    = 0x1500,
		AL_STEREO_SOFT  = 0x1501,
		AL_QUAD_SOFT    = 0x1502,
		AL_REAR_SOFT    = 0x1503,
		AL_5POINT1_SOFT = 0x1504,
		AL_6POINT1_SOFT = 0x1505,
		AL_7POINT1_SOFT = 0x1506;

	/** Accepted by the {@code type} parameter of alBufferSamplesSOFT, alBufferSubSamplesSOFT, and alGetBufferSamplesSOFT. */
	public static final int
		AL_BYTE_SOFT           = 0x1400,
		AL_UNSIGNED_BYTE_SOFT  = 0x1401,
		AL_SHORT_SOFT          = 0x1402,
		AL_UNSIGNED_SHORT_SOFT = 0x1403,
		AL_INT_SOFT            = 0x1404,
		AL_UNSIGNED_INT_SOFT   = 0x1405,
		AL_FLOAT_SOFT          = 0x1406,
		AL_DOUBLE_SOFT         = 0x1407,
		AL_BYTE3_SOFT          = 0x1408,
		AL_UNSIGNED_BYTE3_SOFT = 0x1409;

	/** Accepted by the {@code paramName} parameter of alGetBufferi and alGetBufferiv. */
	public static final int
		AL_INTERNAL_FORMAT_SOFT = 0x2008,
		AL_BYTE_LENGTH_SOFT     = 0x2009,
		AL_SAMPLE_LENGTH_SOFT   = 0x200A;

	/** Accepted by the {@code paramName} parameter of alGetBufferf and alGetBufferfv. */
	public static final int AL_SEC_LENGTH_SOFT = 0x200B;

	/** Accepted by the {@code paramName} parameter of alGetSourceiv and alGetSourcefv (these are the same as in AL_SOFT_buffer_sub_data). */
	public static final int
		AL_BYTE_RW_OFFSETS_SOFT   = 0x1031,
		AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;

	/** Function address. */
	@JavadocExclude
	public final long
		BufferSamplesSOFT,
		IsBufferFormatSupportedSOFT,
		BufferSubSamplesSOFT,
		GetBufferSamplesSOFT;

	@JavadocExclude
	public SOFTBufferSamples(FunctionProvider provider) {
		BufferSamplesSOFT = provider.getFunctionAddress("alBufferSamplesSOFT");
		IsBufferFormatSupportedSOFT = provider.getFunctionAddress("alIsBufferFormatSupportedSOFT");
		BufferSubSamplesSOFT = provider.getFunctionAddress("alBufferSubSamplesSOFT");
		GetBufferSamplesSOFT = provider.getFunctionAddress("alGetBufferSamplesSOFT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link SOFTBufferSamples} instance for the current context. */
	public static SOFTBufferSamples getInstance() {
		return checkFunctionality(AL.getCapabilities().__SOFTBufferSamples);
	}

	static SOFTBufferSamples create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("AL_SOFT_buffer_samples") ) return null;

		SOFTBufferSamples funcs = new SOFTBufferSamples(provider);

		boolean supported = checkFunctions(
			funcs.BufferSamplesSOFT, funcs.IsBufferFormatSupportedSOFT, funcs.BufferSubSamplesSOFT, funcs.GetBufferSamplesSOFT
		);

		return AL.checkExtension("AL_SOFT_buffer_samples", funcs, supported);
	}

	// --- [ alBufferSamplesSOFT ] ---

	/** JNI method for {@link #alBufferSamplesSOFT BufferSamplesSOFT} */
	@JavadocExclude
	public static native void nalBufferSamplesSOFT(int buffer, int samplerate, int internalformat, int samples, int channels, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #alBufferSamplesSOFT BufferSamplesSOFT} */
	@JavadocExclude
	public static void nalBufferSamplesSOFT(int buffer, int samplerate, int internalformat, int samples, int channels, int type, long data) {
		long __functionAddress = getInstance().BufferSamplesSOFT;
		nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
	}

	/**
	 * Removes a buffer's sample data and replaces it with new data. The named {@code buffer} must be a buffer ID returned by {@link AL10#alGenBuffers GenBuffers}, and not
	 * currently be attached to or queued on a source. The given {@code samplerate} is the number of sample frames per second the data will play at, and the
	 * {@code internalformat} is the storage format used. The number of uncompressed sample frames to load is specified by {@code samples}.
	 * 
	 * <p>The {@code channels} and {@code type} parameters specify the channel configuration and sample type of the provided data. The samples will be converted
	 * to the internal storage format as needed, however the channel configuration must match the channel configuration of the storage format or an
	 * {@link AL10#AL_INVALID_ENUM INVALID_ENUM} error will be generated.</p>
	 * 
	 * <p>The {@code data} pointer should hold enough data as specified by the {@code channels}, {@code type}, and {@code samples} parameters, and will be copied
	 * and converted into the buffer's storage. It may also be {@code NULL}, in which case the stored data will be undefined.</p>
	 * 
	 * <p>If {@link SOFTLoopPoints AL_SOFT_loop_points} is supported, a successful call will reset the start and end loop points to 0 and {@code samples}
	 * respectively.</p>
	 *
	 * @param buffer         the buffer ID
	 * @param samplerate     the number of sample frames per second the data will play at
	 * @param internalformat the internal format. One of:<br>{@link #AL_MONO8_SOFT MONO8_SOFT}, {@link #AL_MONO16_SOFT MONO16_SOFT}, {@link #AL_MONO32F_SOFT MONO32F_SOFT}, {@link #AL_STEREO8_SOFT STEREO8_SOFT}, {@link #AL_STEREO16_SOFT STEREO16_SOFT}, {@link #AL_STEREO32F_SOFT STEREO32F_SOFT}, {@link #AL_QUAD8_SOFT QUAD8_SOFT}, {@link #AL_QUAD16_SOFT QUAD16_SOFT}, {@link #AL_QUAD32F_SOFT QUAD32F_SOFT}, {@link #AL_REAR8_SOFT REAR8_SOFT}, {@link #AL_REAR16_SOFT REAR16_SOFT}, {@link #AL_REAR32F_SOFT REAR32F_SOFT}, {@link #AL_5POINT1_8_SOFT 5POINT1_8_SOFT}, {@link #AL_5POINT1_16_SOFT 5POINT1_16_SOFT}, {@link #AL_5POINT1_32F_SOFT 5POINT1_32F_SOFT}, {@link #AL_6POINT1_8_SOFT 6POINT1_8_SOFT}, {@link #AL_6POINT1_16_SOFT 6POINT1_16_SOFT}, {@link #AL_6POINT1_32F_SOFT 6POINT1_32F_SOFT}, {@link #AL_7POINT1_8_SOFT 7POINT1_8_SOFT}, {@link #AL_7POINT1_16_SOFT 7POINT1_16_SOFT}, {@link #AL_7POINT1_32F_SOFT 7POINT1_32F_SOFT}
	 * @param samples        the number of uncompressed sample frames to load
	 * @param channels       the channel configuration of the provided data. One of:<br>{@link #AL_MONO_SOFT MONO_SOFT}, {@link #AL_STEREO_SOFT STEREO_SOFT}, {@link #AL_QUAD_SOFT QUAD_SOFT}, {@link #AL_REAR_SOFT REAR_SOFT}, {@link #AL_5POINT1_SOFT 5POINT1_SOFT}, {@link #AL_6POINT1_SOFT 6POINT1_SOFT}, {@link #AL_7POINT1_SOFT 7POINT1_SOFT}
	 * @param type           the type of the provided data. One of:<br>{@link #AL_BYTE_SOFT BYTE_SOFT}, {@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}, {@link #AL_SHORT_SOFT SHORT_SOFT}, {@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}, {@link #AL_INT_SOFT INT_SOFT}, {@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}, {@link #AL_FLOAT_SOFT FLOAT_SOFT}, {@link #AL_DOUBLE_SOFT DOUBLE_SOFT}, {@link #AL_BYTE3_SOFT BYTE3_SOFT}, {@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}
	 * @param data           the buffer data
	 */
	public static void alBufferSamplesSOFT(int buffer, int samplerate, int internalformat, int samples, int channels, int type, ByteBuffer data) {
		nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
	}

	// --- [ alIsBufferFormatSupportedSOFT ] ---

	/** JNI method for {@link #alIsBufferFormatSupportedSOFT IsBufferFormatSupportedSOFT} */
	@JavadocExclude
	public static native boolean nalIsBufferFormatSupportedSOFT(int format, long __functionAddress);

	/**
	 * Queries if a storage format is supported by the implementation
	 *
	 * @param format the format to query. One of:<br>{@link #AL_MONO8_SOFT MONO8_SOFT}, {@link #AL_MONO16_SOFT MONO16_SOFT}, {@link #AL_MONO32F_SOFT MONO32F_SOFT}, {@link #AL_STEREO8_SOFT STEREO8_SOFT}, {@link #AL_STEREO16_SOFT STEREO16_SOFT}, {@link #AL_STEREO32F_SOFT STEREO32F_SOFT}, {@link #AL_QUAD8_SOFT QUAD8_SOFT}, {@link #AL_QUAD16_SOFT QUAD16_SOFT}, {@link #AL_QUAD32F_SOFT QUAD32F_SOFT}, {@link #AL_REAR8_SOFT REAR8_SOFT}, {@link #AL_REAR16_SOFT REAR16_SOFT}, {@link #AL_REAR32F_SOFT REAR32F_SOFT}, {@link #AL_5POINT1_8_SOFT 5POINT1_8_SOFT}, {@link #AL_5POINT1_16_SOFT 5POINT1_16_SOFT}, {@link #AL_5POINT1_32F_SOFT 5POINT1_32F_SOFT}, {@link #AL_6POINT1_8_SOFT 6POINT1_8_SOFT}, {@link #AL_6POINT1_16_SOFT 6POINT1_16_SOFT}, {@link #AL_6POINT1_32F_SOFT 6POINT1_32F_SOFT}, {@link #AL_7POINT1_8_SOFT 7POINT1_8_SOFT}, {@link #AL_7POINT1_16_SOFT 7POINT1_16_SOFT}, {@link #AL_7POINT1_32F_SOFT 7POINT1_32F_SOFT}
	 *
	 * @return false if the specified {@code format} is not a recognized storage format. Otherwise, if it returns true it may be specified as the
	 *         {@code internalformat} for {@link #alBufferSamplesSOFT BufferSamplesSOFT}.
	 */
	public static boolean alIsBufferFormatSupportedSOFT(int format) {
		long __functionAddress = getInstance().IsBufferFormatSupportedSOFT;
		return nalIsBufferFormatSupportedSOFT(format, __functionAddress);
	}

	// --- [ alBufferSubSamplesSOFT ] ---

	/** JNI method for {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT} */
	@JavadocExclude
	public static native void nalBufferSubSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT} */
	@JavadocExclude
	public static void nalBufferSubSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data) {
		long __functionAddress = getInstance().BufferSubSamplesSOFT;
		nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, data, __functionAddress);
	}

	/**
	 * Update a buffer with new data. {@code buffer} is the ID of the buffer to modify. {@code offset} is the first sample frame in the internal storage to be
	 * modified, and {@code samples} is the number of sample frames to modify. They must not extend beyond the existing internal storage length. The
	 * {@code channels} and {@code type} parameters specify the channel configuration and sample type of the provided data buffer, specified by {@code data},
	 * which will be copied and converted to the buffer's storage format. As with {@link #alBufferSamplesSOFT BufferSamplesSOFT}, the channel configuration must match the storage
	 * format's channel configuration or an {@link AL10#AL_INVALID_ENUM INVALID_ENUM} error will be generated.
	 * 
	 * <p>When modifying a buffer that's playing on a source, an application must take care to not modify the section that is currently being played. The
	 * read-only source attributes {@link #AL_BYTE_RW_OFFSETS_SOFT BYTE_RW_OFFSETS_SOFT} and {@link #AL_SAMPLE_RW_OFFSETS_SOFT SAMPLE_RW_OFFSETS_SOFT} may be used to retrieve the read and write cursor offsets. Behavior is
	 * undefined if an attempt is made to modify buffer data between the read and write offsets.</p>
	 *
	 * @param buffer   the buffer ID
	 * @param offset   the first sample frame in the internal storage to be modified
	 * @param samples  the number of sample frames to modify
	 * @param channels the channel configuration of the provided data. One of:<br>{@link #AL_MONO_SOFT MONO_SOFT}, {@link #AL_STEREO_SOFT STEREO_SOFT}, {@link #AL_QUAD_SOFT QUAD_SOFT}, {@link #AL_REAR_SOFT REAR_SOFT}, {@link #AL_5POINT1_SOFT 5POINT1_SOFT}, {@link #AL_6POINT1_SOFT 6POINT1_SOFT}, {@link #AL_7POINT1_SOFT 7POINT1_SOFT}
	 * @param type     the type of the provided data. One of:<br>{@link #AL_BYTE_SOFT BYTE_SOFT}, {@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}, {@link #AL_SHORT_SOFT SHORT_SOFT}, {@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}, {@link #AL_INT_SOFT INT_SOFT}, {@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}, {@link #AL_FLOAT_SOFT FLOAT_SOFT}, {@link #AL_DOUBLE_SOFT DOUBLE_SOFT}, {@link #AL_BYTE3_SOFT BYTE3_SOFT}, {@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}
	 * @param data     the buffer data
	 */
	public static void alBufferSubSamplesSOFT(int buffer, int offset, int samples, int channels, int type, ByteBuffer data) {
		nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
	}

	// --- [ alGetBufferSamplesSOFT ] ---

	/** JNI method for {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT} */
	@JavadocExclude
	public static native void nalGetBufferSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT} */
	@JavadocExclude
	public static void nalGetBufferSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data) {
		long __functionAddress = getInstance().GetBufferSamplesSOFT;
		nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, data, __functionAddress);
	}

	/**
	 * Reads the number of sample frames, given by {@code samples}, starting at {@code offset}, and converts them to the channel configuration and sample type
	 * specified by {@code channels} and {@code type}, before writing to the provided {@code data} buffer pointer. An {@link AL10#AL_INVALID_VALUE INVALID_VALUE} error is generated if
	 * {@code offset} and {@code samples} reach beyond the range of the buffer. The channel configuration must match the internal storage format's channel
	 * configuration, or else an {@link AL10#AL_INVALID_ENUM INVALID_ENUM} error will be generated.
	 *
	 * @param buffer   the buffer to read
	 * @param offset   the sample frame offset
	 * @param samples  the number of sample frames to read
	 * @param channels the target channel configuration. One of:<br>{@link #AL_MONO_SOFT MONO_SOFT}, {@link #AL_STEREO_SOFT STEREO_SOFT}, {@link #AL_QUAD_SOFT QUAD_SOFT}, {@link #AL_REAR_SOFT REAR_SOFT}, {@link #AL_5POINT1_SOFT 5POINT1_SOFT}, {@link #AL_6POINT1_SOFT 6POINT1_SOFT}, {@link #AL_7POINT1_SOFT 7POINT1_SOFT}
	 * @param type     the target sample type. One of:<br>{@link #AL_BYTE_SOFT BYTE_SOFT}, {@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}, {@link #AL_SHORT_SOFT SHORT_SOFT}, {@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}, {@link #AL_INT_SOFT INT_SOFT}, {@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}, {@link #AL_FLOAT_SOFT FLOAT_SOFT}, {@link #AL_DOUBLE_SOFT DOUBLE_SOFT}, {@link #AL_BYTE3_SOFT BYTE3_SOFT}, {@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}
	 * @param data     buffer to write to
	 */
	public static void alGetBufferSamplesSOFT(int buffer, int offset, int samples, int channels, int type, ByteBuffer data) {
		nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
	}

}