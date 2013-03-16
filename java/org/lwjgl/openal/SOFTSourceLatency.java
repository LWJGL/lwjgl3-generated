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
 * bindings to AL_SOFT_source_latency extension.
 * <p/>
 * This extension provides a method for applications to more accurately
 * measure the playback latency of sources. Unextended OpenAL allows apps to
 * retrieve a source's playback offset in bytes, samples, or seconds, but
 * this is (typically) where the AL is processing the audio data.
 * <p/>
 * New 64-bit Integer and Double-Precision Floating Point Functions:
 * <p/>
 * In addition to the standard 32-bit integer (i) and single-precision
 * floating point (f) types, source attributes may be changed or queried
 * using 64-bit integer (i64) and double-precision floating point (d) types.
 * <p/>
 * Any valid attribute for 32-bit integers will be valid for 64-bit integers,
 * and any attribute for single-precision floating point will be valid for
 * double-precision floating point. Note that the reverse is not necessarily
 * true. Specific 64-bit integer attributes may not work through the 32-bit
 * integer functions, and specific double-precision floating point attributes
 * may not work with the single-precision floating point functions, unless
 * otherwise specified.
 * <p/>
 * Also note that range restrictions still apply, so for example, attributes
 * that only allow up to INT_MAX will still only allow up to INT_MAX even
 * when set through 64-bit integer functions
 */
public final class SOFTSourceLatency {

	/** Source tokens for which can be used to retrieve a high-precision source offset and playback latency */
	public static final int
		AL_SAMPLE_OFFSET_LATENCY_SOFT = 0x1200,
		AL_SEC_OFFSET_LATENCY_SOFT    = 0x1201;

	private SOFTSourceLatency() {}

	// --- [ alSourcedSOFT ] ---

	/** JNI method for {@link #alSourcedSOFT(int, int, double)} */
	public static native void nalSourcedSOFT(int source, int param, double value, long __functionAddress);

	/**
	 * Sets the double value of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alSourcedSOFT(int source, int param, double value) {
		long __functionAddress = getInstance().alSourcedSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcedSOFT(source, param, value, __functionAddress);
	}

	// --- [ alSource3dSOFT ] ---

	/** JNI method for {@link #alSource3dSOFT(int, int, double, double, double)} */
	public static native void nalSource3dSOFT(int source, int param, double value1, double value2, double value3, long __functionAddress);

	/**
	 * Sets the 3 dimensional double values of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value1 the first value
	 * @param value2 the second value
	 * @param value3 the third value
	 */
	public static void alSource3dSOFT(int source, int param, double value1, double value2, double value3) {
		long __functionAddress = getInstance().alSource3dSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSource3dSOFT(source, param, value1, value2, value3, __functionAddress);
	}

	// --- [ alSourcedvSOFT ] ---

	/** JNI method for {@link #alSourcedvSOFT(int, int, ByteBuffer)} */
	public static native void nalSourcedvSOFT(int source, int param, long value, long __functionAddress);

	/**
	 * pointer version of {@link #alSourcedSOFT(int, int, double)}
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter values
	 */
	public static void alSourcedvSOFT(int source, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alSourcedvSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcedvSOFT(source, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alSourcedvSOFT(int, int, ByteBuffer)} */
	public static void alSourcedvSOFT(int source, int param, DoubleBuffer value) {
		long __functionAddress = getInstance().alSourcedvSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcedvSOFT(source, param, memAddress(value), __functionAddress);
	}

	// --- [ alGetSourcedSOFT ] ---

	/** JNI method for {@link #alGetSourcedSOFT(int, int, ByteBuffer)} */
	public static native void nalGetSourcedSOFT(int source, int param, long value, long __functionAddress);

	/**
	 * Gets the double value of a source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param value  the parameter values
	 */
	public static void alGetSourcedSOFT(int source, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetSourcedSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcedSOFT(source, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcedSOFT(int, int, ByteBuffer)} */
	public static void alGetSourcedSOFT(int source, int param, DoubleBuffer value) {
		long __functionAddress = getInstance().alGetSourcedSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcedSOFT(source, param, memAddress(value), __functionAddress);
	}

	// --- [ alGetSource3dSOFT ] ---

	/** JNI method for {@link #alGetSource3dSOFT(int, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static native void nalGetSource3dSOFT(int source, int param, long value1, long value2, long value3, long __functionAddress);

	/**
	 * Gets the 3 dimensional double values of a source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param value1 the first value
	 * @param value2 the second value
	 * @param value3 the third value
	 */
	public static void alGetSource3dSOFT(int source, int param, ByteBuffer value1, ByteBuffer value2, ByteBuffer value3) {
		long __functionAddress = getInstance().alGetSource3dSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSource3dSOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSource3dSOFT(int, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static void alGetSource3dSOFT(int source, int param, DoubleBuffer value1, DoubleBuffer value2, DoubleBuffer value3) {
		long __functionAddress = getInstance().alGetSource3dSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSource3dSOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	// --- [ alGetSourcedvSOFT ] ---

	/** JNI method for {@link #alGetSourcedvSOFT(int, int, ByteBuffer)} */
	public static native void nalGetSourcedvSOFT(int source, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alGetSourcedSOFT(int, int, ByteBuffer)}
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetSourcedvSOFT(int source, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetSourcedvSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcedvSOFT(source, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcedvSOFT(int, int, ByteBuffer)} */
	public static void alGetSourcedvSOFT(int source, int param, DoubleBuffer values) {
		long __functionAddress = getInstance().alGetSourcedvSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcedvSOFT(source, param, memAddress(values), __functionAddress);
	}

	// --- [ alSourcei64SOFT ] ---

	/** JNI method for {@link #alSourcei64SOFT(int, int, long)} */
	public static native void nalSourcei64SOFT(int source, int param, long value, long __functionAddress);

	/**
	 * Sets the 64 bit integer value of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter values
	 */
	public static void alSourcei64SOFT(int source, int param, long value) {
		long __functionAddress = getInstance().alSourcei64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcei64SOFT(source, param, value, __functionAddress);
	}

	// --- [ alSource3i64SOFT ] ---

	/** JNI method for {@link #alSource3i64SOFT(int, int, long, long, long)} */
	public static native void nalSource3i64SOFT(int source, int param, long value1, long value2, long value3, long __functionAddress);

	/**
	 * Sets the 3 dimensional 64 bit integer values of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value1 the first value
	 * @param value2 the second value
	 * @param value3 the third value
	 */
	public static void alSource3i64SOFT(int source, int param, long value1, long value2, long value3) {
		long __functionAddress = getInstance().alSource3i64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSource3i64SOFT(source, param, value1, value2, value3, __functionAddress);
	}

	// --- [ alSourcei64vSOFT ] ---

	/** JNI method for {@link #alSourcei64vSOFT(int, int, ByteBuffer)} */
	public static native void nalSourcei64vSOFT(int source, int param, long values, long __functionAddress);

	/**
	 * Pointer version of alSourcei64SOFT
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alSourcei64vSOFT(int source, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alSourcei64vSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcei64vSOFT(source, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alSourcei64vSOFT(int, int, ByteBuffer)} */
	public static void alSourcei64vSOFT(int source, int param, LongBuffer values) {
		long __functionAddress = getInstance().alSourcei64vSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcei64vSOFT(source, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetSourcei64SOFT ] ---

	/** JNI method for {@link #alGetSourcei64SOFT(int, int, ByteBuffer)} */
	public static native void nalGetSourcei64SOFT(int source, int param, long value, long __functionAddress);

	/**
	 * Gets the 64 bit integer value of a source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param value  the parameter values
	 */
	public static void alGetSourcei64SOFT(int source, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetSourcei64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcei64SOFT(source, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcei64SOFT(int, int, ByteBuffer)} */
	public static void alGetSourcei64SOFT(int source, int param, LongBuffer value) {
		long __functionAddress = getInstance().alGetSourcei64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcei64SOFT(source, param, memAddress(value), __functionAddress);
	}

	// --- [ alGetSource3i64SOFT ] ---

	/** JNI method for {@link #alGetSource3i64SOFT(int, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static native void nalGetSource3i64SOFT(int source, int param, long value1, long value2, long value3, long __functionAddress);

	/**
	 * Gets the 3 dimensional 64 bit integer values of a source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param value1 the first value
	 * @param value2 the second value
	 * @param value3 the third value
	 */
	public static void alGetSource3i64SOFT(int source, int param, ByteBuffer value1, ByteBuffer value2, ByteBuffer value3) {
		long __functionAddress = getInstance().alGetSource3i64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSource3i64SOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSource3i64SOFT(int, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static void alGetSource3i64SOFT(int source, int param, LongBuffer value1, LongBuffer value2, LongBuffer value3) {
		long __functionAddress = getInstance().alGetSource3i64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSource3i64SOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	// --- [ alGetSourcei64vSOFT ] ---

	/** JNI method for {@link #alGetSourcei64vSOFT(int, int, ByteBuffer)} */
	public static native void nalGetSourcei64vSOFT(int source, int param, long values, long __functionAddress);

	/**
	 * Pointer version of alGetSourcei64SOFT
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetSourcei64vSOFT(int source, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetSourcei64vSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcei64vSOFT(source, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcei64vSOFT(int, int, ByteBuffer)} */
	public static void alGetSourcei64vSOFT(int source, int param, LongBuffer values) {
		long __functionAddress = getInstance().alGetSourcei64vSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcei64vSOFT(source, param, memAddress(values), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return AL.getCapabilities().__SOFTSourceLatency;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("AL_SOFT_source_latency") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.alSourcedSOFT != 0L &&
			funcs.alSource3dSOFT != 0L &&
			funcs.alSourcedvSOFT != 0L &&
			funcs.alGetSourcedSOFT != 0L &&
			funcs.alGetSource3dSOFT != 0L &&
			funcs.alGetSourcedvSOFT != 0L &&
			funcs.alSourcei64SOFT != 0L &&
			funcs.alSource3i64SOFT != 0L &&
			funcs.alSourcei64vSOFT != 0L &&
			funcs.alGetSourcei64SOFT != 0L &&
			funcs.alGetSource3i64SOFT != 0L &&
			funcs.alGetSourcei64vSOFT != 0L;

		return AL.checkExtension("AL_SOFT_source_latency", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code SOFTSourceLatency}. */
	public static final class Functions implements FunctionMap {

		public final long
			alSourcedSOFT,
			alSource3dSOFT,
			alSourcedvSOFT,
			alGetSourcedSOFT,
			alGetSource3dSOFT,
			alGetSourcedvSOFT,
			alSourcei64SOFT,
			alSource3i64SOFT,
			alSourcei64vSOFT,
			alGetSourcei64SOFT,
			alGetSource3i64SOFT,
			alGetSourcei64vSOFT;

		public Functions(FunctionProvider provider) {
			alSourcedSOFT = provider.getFunctionAddress("alSourcedSOFT");
			alSource3dSOFT = provider.getFunctionAddress("alSource3dSOFT");
			alSourcedvSOFT = provider.getFunctionAddress("alSourcedvSOFT");
			alGetSourcedSOFT = provider.getFunctionAddress("alGetSourcedSOFT");
			alGetSource3dSOFT = provider.getFunctionAddress("alGetSource3dSOFT");
			alGetSourcedvSOFT = provider.getFunctionAddress("alGetSourcedvSOFT");
			alSourcei64SOFT = provider.getFunctionAddress("alSourcei64SOFT");
			alSource3i64SOFT = provider.getFunctionAddress("alSource3i64SOFT");
			alSourcei64vSOFT = provider.getFunctionAddress("alSourcei64vSOFT");
			alGetSourcei64SOFT = provider.getFunctionAddress("alGetSourcei64SOFT");
			alGetSource3i64SOFT = provider.getFunctionAddress("alGetSource3i64SOFT");
			alGetSourcei64vSOFT = provider.getFunctionAddress("alGetSourcei64vSOFT");
		}

	}

}