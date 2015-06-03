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
 * Native bindings to the <a href="http://kcat.strangesoft.net/openal-extensions/SOFT_source_latency.txt">SOFT_source_latency</a> extension.
 * 
 * <p>This extension provides a method for applications to more accurately measure the playback latency of sources. Unextended OpenAL allows apps to retrieve
 * a source's playback offset in bytes, samples, or seconds, but this is (typically) where the AL is processing the audio data.</p>
 * 
 * <p>Often, more processing is done outside of the AL. Audio servers are common and they can introduce a bit of latency, increasing the time between when the
 * AL is done with a piece of audio data until it gets heard by the user. If the OpenAL implementation uses its own mixer, that can also add to the
 * latency. This can ultimately cause a not-insignificant delay between where the AL is processing and what is actually being heard.</p>
 * 
 * <p>Although this delay may not be very noticeable for general gaming, if the app is trying to keep a video or animation syncronized with the playback of an
 * OpenAL source this extra delay can cause the audio and video to appear of out sync.</p>
 * 
 * <p>Luckily, most audio systems have a way of measuring the latency it takes for sound to actually get to the physical output device (the DAC or speakers).
 * By providing this information through the AL, an application can more accurately tell what a user is hearing and thus synchronize better with the audio
 * output.</p>
 */
public final class SOFTSourceLatency {

	/** Can be used to retrieve a high-precision source offset and playback latency. */
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
		return checkFunctionality(AL.getCapabilities().__SOFTSourceLatency);
	}

	static SOFTSourceLatency create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("AL_SOFT_source_latency") ) return null;

		SOFTSourceLatency funcs = new SOFTSourceLatency(provider);

		boolean supported = checkFunctions(
			funcs.SourcedSOFT, funcs.Source3dSOFT, funcs.SourcedvSOFT, funcs.GetSourcedSOFT, funcs.GetSource3dSOFT, funcs.GetSourcedvSOFT, funcs.Sourcei64SOFT, 
			funcs.Source3i64SOFT, funcs.Sourcei64vSOFT, funcs.GetSourcei64SOFT, funcs.GetSource3i64SOFT, funcs.GetSourcei64vSOFT
		);

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
		nalSource3dSOFT(source, param, value1, value2, value3, __functionAddress);
	}

	// --- [ alSourcedvSOFT ] ---

	/** JNI method for {@link #alSourcedvSOFT SourcedvSOFT} */
	@JavadocExclude
	public static native void nalSourcedvSOFT(int source, int param, long value, long __functionAddress);

	/** Unsafe version of {@link #alSourcedvSOFT SourcedvSOFT} */
	@JavadocExclude
	public static void nalSourcedvSOFT(int source, int param, long value) {
		long __functionAddress = getInstance().SourcedvSOFT;
		nalSourcedvSOFT(source, param, value, __functionAddress);
	}

	/**
	 * pointer version of {@link #alSourcedSOFT SourcedSOFT}
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter values
	 */
	public static void alSourcedvSOFT(int source, int param, ByteBuffer value) {
		nalSourcedvSOFT(source, param, memAddress(value));
	}

	/** Alternative version of: {@link #alSourcedvSOFT SourcedvSOFT} */
	public static void alSourcedvSOFT(int source, int param, DoubleBuffer value) {
		nalSourcedvSOFT(source, param, memAddress(value));
	}

	// --- [ alGetSourcedSOFT ] ---

	/** JNI method for {@link #alGetSourcedSOFT GetSourcedSOFT} */
	@JavadocExclude
	public static native void nalGetSourcedSOFT(int source, int param, long value, long __functionAddress);

	/** Unsafe version of {@link #alGetSourcedSOFT GetSourcedSOFT} */
	@JavadocExclude
	public static void nalGetSourcedSOFT(int source, int param, long value) {
		long __functionAddress = getInstance().GetSourcedSOFT;
		nalGetSourcedSOFT(source, param, value, __functionAddress);
	}

	/**
	 * Gets the double value of a source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param value  the parameter values
	 */
	public static void alGetSourcedSOFT(int source, int param, ByteBuffer value) {
		nalGetSourcedSOFT(source, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetSourcedSOFT GetSourcedSOFT} */
	public static void alGetSourcedSOFT(int source, int param, DoubleBuffer value) {
		nalGetSourcedSOFT(source, param, memAddress(value));
	}

	// --- [ alGetSource3dSOFT ] ---

	/** JNI method for {@link #alGetSource3dSOFT GetSource3dSOFT} */
	@JavadocExclude
	public static native void nalGetSource3dSOFT(int source, int param, long value1, long value2, long value3, long __functionAddress);

	/** Unsafe version of {@link #alGetSource3dSOFT GetSource3dSOFT} */
	@JavadocExclude
	public static void nalGetSource3dSOFT(int source, int param, long value1, long value2, long value3) {
		long __functionAddress = getInstance().GetSource3dSOFT;
		nalGetSource3dSOFT(source, param, value1, value2, value3, __functionAddress);
	}

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
		nalGetSource3dSOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
	}

	/** Alternative version of: {@link #alGetSource3dSOFT GetSource3dSOFT} */
	public static void alGetSource3dSOFT(int source, int param, DoubleBuffer value1, DoubleBuffer value2, DoubleBuffer value3) {
		nalGetSource3dSOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
	}

	// --- [ alGetSourcedvSOFT ] ---

	/** JNI method for {@link #alGetSourcedvSOFT GetSourcedvSOFT} */
	@JavadocExclude
	public static native void nalGetSourcedvSOFT(int source, int param, long values, long __functionAddress);

	/** Unsafe version of {@link #alGetSourcedvSOFT GetSourcedvSOFT} */
	@JavadocExclude
	public static void nalGetSourcedvSOFT(int source, int param, long values) {
		long __functionAddress = getInstance().GetSourcedvSOFT;
		nalGetSourcedvSOFT(source, param, values, __functionAddress);
	}

	/**
	 * Pointer version of {@link #alGetSourcedSOFT GetSourcedSOFT}
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetSourcedvSOFT(int source, int param, ByteBuffer values) {
		nalGetSourcedvSOFT(source, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetSourcedvSOFT GetSourcedvSOFT} */
	public static void alGetSourcedvSOFT(int source, int param, DoubleBuffer values) {
		nalGetSourcedvSOFT(source, param, memAddress(values));
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
		nalSource3i64SOFT(source, param, value1, value2, value3, __functionAddress);
	}

	// --- [ alSourcei64vSOFT ] ---

	/** JNI method for {@link #alSourcei64vSOFT Sourcei64vSOFT} */
	@JavadocExclude
	public static native void nalSourcei64vSOFT(int source, int param, long values, long __functionAddress);

	/** Unsafe version of {@link #alSourcei64vSOFT Sourcei64vSOFT} */
	@JavadocExclude
	public static void nalSourcei64vSOFT(int source, int param, long values) {
		long __functionAddress = getInstance().Sourcei64vSOFT;
		nalSourcei64vSOFT(source, param, values, __functionAddress);
	}

	/**
	 * Pointer version of {@link #alSourcei64SOFT Sourcei64SOFT}
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alSourcei64vSOFT(int source, int param, ByteBuffer values) {
		nalSourcei64vSOFT(source, param, memAddress(values));
	}

	/** Alternative version of: {@link #alSourcei64vSOFT Sourcei64vSOFT} */
	public static void alSourcei64vSOFT(int source, int param, LongBuffer values) {
		nalSourcei64vSOFT(source, param, memAddress(values));
	}

	// --- [ alGetSourcei64SOFT ] ---

	/** JNI method for {@link #alGetSourcei64SOFT GetSourcei64SOFT} */
	@JavadocExclude
	public static native void nalGetSourcei64SOFT(int source, int param, long value, long __functionAddress);

	/** Unsafe version of {@link #alGetSourcei64SOFT GetSourcei64SOFT} */
	@JavadocExclude
	public static void nalGetSourcei64SOFT(int source, int param, long value) {
		long __functionAddress = getInstance().GetSourcei64SOFT;
		nalGetSourcei64SOFT(source, param, value, __functionAddress);
	}

	/**
	 * Gets the 64 bit integer value of a source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param value  the parameter values
	 */
	public static void alGetSourcei64SOFT(int source, int param, ByteBuffer value) {
		nalGetSourcei64SOFT(source, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetSourcei64SOFT GetSourcei64SOFT} */
	public static void alGetSourcei64SOFT(int source, int param, LongBuffer value) {
		nalGetSourcei64SOFT(source, param, memAddress(value));
	}

	// --- [ alGetSource3i64SOFT ] ---

	/** JNI method for {@link #alGetSource3i64SOFT GetSource3i64SOFT} */
	@JavadocExclude
	public static native void nalGetSource3i64SOFT(int source, int param, long value1, long value2, long value3, long __functionAddress);

	/** Unsafe version of {@link #alGetSource3i64SOFT GetSource3i64SOFT} */
	@JavadocExclude
	public static void nalGetSource3i64SOFT(int source, int param, long value1, long value2, long value3) {
		long __functionAddress = getInstance().GetSource3i64SOFT;
		nalGetSource3i64SOFT(source, param, value1, value2, value3, __functionAddress);
	}

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
		nalGetSource3i64SOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
	}

	/** Alternative version of: {@link #alGetSource3i64SOFT GetSource3i64SOFT} */
	public static void alGetSource3i64SOFT(int source, int param, LongBuffer value1, LongBuffer value2, LongBuffer value3) {
		nalGetSource3i64SOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
	}

	// --- [ alGetSourcei64vSOFT ] ---

	/** JNI method for {@link #alGetSourcei64vSOFT GetSourcei64vSOFT} */
	@JavadocExclude
	public static native void nalGetSourcei64vSOFT(int source, int param, long values, long __functionAddress);

	/** Unsafe version of {@link #alGetSourcei64vSOFT GetSourcei64vSOFT} */
	@JavadocExclude
	public static void nalGetSourcei64vSOFT(int source, int param, long values) {
		long __functionAddress = getInstance().GetSourcei64vSOFT;
		nalGetSourcei64vSOFT(source, param, values, __functionAddress);
	}

	/**
	 * Pointer version of {@link #alGetSourcei64SOFT GetSourcei64SOFT}
	 *
	 * @param source the source to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetSourcei64vSOFT(int source, int param, ByteBuffer values) {
		nalGetSourcei64vSOFT(source, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetSourcei64vSOFT GetSourcei64vSOFT} */
	public static void alGetSourcei64vSOFT(int source, int param, LongBuffer values) {
		nalGetSourcei64vSOFT(source, param, memAddress(values));
	}

}