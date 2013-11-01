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

	/** Function address. */
	@JavadocExclude
	public final long
		SourcedSOFT,
		Source3dSOFT,
		SourcedvSOFT,
		GetSourcedSOFT,
		GetSource3dSOFT,
		GetSourcedvSOFT,
		Sourcei64SOFT,
		Source3i64SOFT,
		Sourcei64vSOFT,
		GetSourcei64SOFT,
		GetSource3i64SOFT,
		GetSourcei64vSOFT;

	@JavadocExclude
	public SOFTSourceLatency(FunctionProvider provider) {
		SourcedSOFT = provider.getFunctionAddress("alSourcedSOFT");
		Source3dSOFT = provider.getFunctionAddress("alSource3dSOFT");
		SourcedvSOFT = provider.getFunctionAddress("alSourcedvSOFT");
		GetSourcedSOFT = provider.getFunctionAddress("alGetSourcedSOFT");
		GetSource3dSOFT = provider.getFunctionAddress("alGetSource3dSOFT");
		GetSourcedvSOFT = provider.getFunctionAddress("alGetSourcedvSOFT");
		Sourcei64SOFT = provider.getFunctionAddress("alSourcei64SOFT");
		Source3i64SOFT = provider.getFunctionAddress("alSource3i64SOFT");
		Sourcei64vSOFT = provider.getFunctionAddress("alSourcei64vSOFT");
		GetSourcei64SOFT = provider.getFunctionAddress("alGetSourcei64SOFT");
		GetSource3i64SOFT = provider.getFunctionAddress("alGetSource3i64SOFT");
		GetSourcei64vSOFT = provider.getFunctionAddress("alGetSourcei64vSOFT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link SOFTSourceLatency} instance for the current context. */
	public static SOFTSourceLatency getInstance() {
		return AL.getCapabilities().__SOFTSourceLatency;
	}

	static SOFTSourceLatency create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("AL_SOFT_source_latency") ) return null;

		SOFTSourceLatency funcs = new SOFTSourceLatency(provider);

		boolean supported = 
			funcs.SourcedSOFT != 0L &&
			funcs.Source3dSOFT != 0L &&
			funcs.SourcedvSOFT != 0L &&
			funcs.GetSourcedSOFT != 0L &&
			funcs.GetSource3dSOFT != 0L &&
			funcs.GetSourcedvSOFT != 0L &&
			funcs.Sourcei64SOFT != 0L &&
			funcs.Source3i64SOFT != 0L &&
			funcs.Sourcei64vSOFT != 0L &&
			funcs.GetSourcei64SOFT != 0L &&
			funcs.GetSource3i64SOFT != 0L &&
			funcs.GetSourcei64vSOFT != 0L;

		return AL.checkExtension("AL_SOFT_source_latency", funcs, supported);
	}

	// --- [ alSourcedSOFT ] ---

	/** JNI method for {@link #alSourcedSOFT SourcedSOFT} */
	@JavadocExclude
	public static native void nalSourcedSOFT(int source, int param, double value, long __functionAddress);

	/**
	 * Sets the double value of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alSourcedSOFT(int source, int param, double value) {
		long __functionAddress = getInstance().SourcedSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcedSOFT(source, param, value, __functionAddress);
	}

	// --- [ alSource3dSOFT ] ---

	/** JNI method for {@link #alSource3dSOFT Source3dSOFT} */
	@JavadocExclude
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
		long __functionAddress = getInstance().Source3dSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSource3dSOFT(source, param, value1, value2, value3, __functionAddress);
	}

	// --- [ alSourcedvSOFT ] ---

	/** JNI method for {@link #alSourcedvSOFT SourcedvSOFT} */
	@JavadocExclude
	public static native void nalSourcedvSOFT(int source, int param, long value, long __functionAddress);

	/**
	 * pointer version of {@link #alSourcedSOFT SourcedSOFT}
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter values
	 */
	public static void alSourcedvSOFT(int source, int param, ByteBuffer value) {
		long __functionAddress = getInstance().SourcedvSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcedvSOFT(source, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alSourcedvSOFT SourcedvSOFT} */
	public static void alSourcedvSOFT(int source, int param, DoubleBuffer value) {
		long __functionAddress = getInstance().SourcedvSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcedvSOFT(source, param, memAddress(value), __functionAddress);
	}

	// --- [ alGetSourcedSOFT ] ---

	/** JNI method for {@link #alGetSourcedSOFT GetSourcedSOFT} */
	@JavadocExclude
	public static native void nalGetSourcedSOFT(int source, int param, long value, long __functionAddress);

	/**
	 * Gets the double value of a source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param value  the parameter values
	 */
	public static void alGetSourcedSOFT(int source, int param, ByteBuffer value) {
		long __functionAddress = getInstance().GetSourcedSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcedSOFT(source, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcedSOFT GetSourcedSOFT} */
	public static void alGetSourcedSOFT(int source, int param, DoubleBuffer value) {
		long __functionAddress = getInstance().GetSourcedSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcedSOFT(source, param, memAddress(value), __functionAddress);
	}

	// --- [ alGetSource3dSOFT ] ---

	/** JNI method for {@link #alGetSource3dSOFT GetSource3dSOFT} */
	@JavadocExclude
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
		long __functionAddress = getInstance().GetSource3dSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSource3dSOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSource3dSOFT GetSource3dSOFT} */
	public static void alGetSource3dSOFT(int source, int param, DoubleBuffer value1, DoubleBuffer value2, DoubleBuffer value3) {
		long __functionAddress = getInstance().GetSource3dSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSource3dSOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	// --- [ alGetSourcedvSOFT ] ---

	/** JNI method for {@link #alGetSourcedvSOFT GetSourcedvSOFT} */
	@JavadocExclude
	public static native void nalGetSourcedvSOFT(int source, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alGetSourcedSOFT GetSourcedSOFT}
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetSourcedvSOFT(int source, int param, ByteBuffer values) {
		long __functionAddress = getInstance().GetSourcedvSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcedvSOFT(source, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcedvSOFT GetSourcedvSOFT} */
	public static void alGetSourcedvSOFT(int source, int param, DoubleBuffer values) {
		long __functionAddress = getInstance().GetSourcedvSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcedvSOFT(source, param, memAddress(values), __functionAddress);
	}

	// --- [ alSourcei64SOFT ] ---

	/** JNI method for {@link #alSourcei64SOFT Sourcei64SOFT} */
	@JavadocExclude
	public static native void nalSourcei64SOFT(int source, int param, long value, long __functionAddress);

	/**
	 * Sets the 64 bit integer value of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter values
	 */
	public static void alSourcei64SOFT(int source, int param, long value) {
		long __functionAddress = getInstance().Sourcei64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcei64SOFT(source, param, value, __functionAddress);
	}

	// --- [ alSource3i64SOFT ] ---

	/** JNI method for {@link #alSource3i64SOFT Source3i64SOFT} */
	@JavadocExclude
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
		long __functionAddress = getInstance().Source3i64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSource3i64SOFT(source, param, value1, value2, value3, __functionAddress);
	}

	// --- [ alSourcei64vSOFT ] ---

	/** JNI method for {@link #alSourcei64vSOFT Sourcei64vSOFT} */
	@JavadocExclude
	public static native void nalSourcei64vSOFT(int source, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alSourcei64SOFT Sourcei64SOFT}
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alSourcei64vSOFT(int source, int param, ByteBuffer values) {
		long __functionAddress = getInstance().Sourcei64vSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcei64vSOFT(source, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alSourcei64vSOFT Sourcei64vSOFT} */
	public static void alSourcei64vSOFT(int source, int param, LongBuffer values) {
		long __functionAddress = getInstance().Sourcei64vSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcei64vSOFT(source, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetSourcei64SOFT ] ---

	/** JNI method for {@link #alGetSourcei64SOFT GetSourcei64SOFT} */
	@JavadocExclude
	public static native void nalGetSourcei64SOFT(int source, int param, long value, long __functionAddress);

	/**
	 * Gets the 64 bit integer value of a source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param value  the parameter values
	 */
	public static void alGetSourcei64SOFT(int source, int param, ByteBuffer value) {
		long __functionAddress = getInstance().GetSourcei64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcei64SOFT(source, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcei64SOFT GetSourcei64SOFT} */
	public static void alGetSourcei64SOFT(int source, int param, LongBuffer value) {
		long __functionAddress = getInstance().GetSourcei64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcei64SOFT(source, param, memAddress(value), __functionAddress);
	}

	// --- [ alGetSource3i64SOFT ] ---

	/** JNI method for {@link #alGetSource3i64SOFT GetSource3i64SOFT} */
	@JavadocExclude
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
		long __functionAddress = getInstance().GetSource3i64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSource3i64SOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSource3i64SOFT GetSource3i64SOFT} */
	public static void alGetSource3i64SOFT(int source, int param, LongBuffer value1, LongBuffer value2, LongBuffer value3) {
		long __functionAddress = getInstance().GetSource3i64SOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSource3i64SOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	// --- [ alGetSourcei64vSOFT ] ---

	/** JNI method for {@link #alGetSourcei64vSOFT GetSourcei64vSOFT} */
	@JavadocExclude
	public static native void nalGetSourcei64vSOFT(int source, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alGetSourcei64SOFT GetSourcei64SOFT}
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetSourcei64vSOFT(int source, int param, ByteBuffer values) {
		long __functionAddress = getInstance().GetSourcei64vSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcei64vSOFT(source, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcei64vSOFT GetSourcei64vSOFT} */
	public static void alGetSourcei64vSOFT(int source, int param, LongBuffer values) {
		long __functionAddress = getInstance().GetSourcei64vSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGetSourcei64vSOFT(source, param, memAddress(values), __functionAddress);
	}

}