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
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to AL 1.1 functionality. */
public final class AL11 {

	/** General tokens. */
	public static final int
		AL_SEC_OFFSET                = 0x1024,
		AL_SAMPLE_OFFSET             = 0x1025,
		AL_BYTE_OFFSET               = 0x1026,
		AL_STATIC                    = 0x1028,
		AL_STREAMING                 = 0x1029,
		AL_UNDETERMINED              = 0x1030,
		AL_ILLEGAL_COMMAND           = 0xA004,
		AL_SPEED_OF_SOUND            = 0xC003,
		AL_LINEAR_DISTANCE           = 0xD003,
		AL_LINEAR_DISTANCE_CLAMPED   = 0xD004,
		AL_EXPONENT_DISTANCE         = 0xD005,
		AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;

	/** Function address. */
	@JavadocExclude
	public final long
		Listener3i,
		GetListeneriv,
		Source3i,
		Listeneriv,
		Sourceiv,
		Bufferf,
		Buffer3f,
		Bufferfv,
		Bufferi,
		Buffer3i,
		Bufferiv,
		GetBufferi,
		GetBufferiv,
		GetBufferf,
		GetBufferfv,
		SpeedOfSound;

	@JavadocExclude
	public AL11(FunctionProvider provider) {
		Listener3i = provider.getFunctionAddress("alListener3i");
		GetListeneriv = provider.getFunctionAddress("alGetListeneriv");
		Source3i = provider.getFunctionAddress("alSource3i");
		Listeneriv = provider.getFunctionAddress("alListeneriv");
		Sourceiv = provider.getFunctionAddress("alSourceiv");
		Bufferf = provider.getFunctionAddress("alBufferf");
		Buffer3f = provider.getFunctionAddress("alBuffer3f");
		Bufferfv = provider.getFunctionAddress("alBufferfv");
		Bufferi = provider.getFunctionAddress("alBufferi");
		Buffer3i = provider.getFunctionAddress("alBuffer3i");
		Bufferiv = provider.getFunctionAddress("alBufferiv");
		GetBufferi = provider.getFunctionAddress("alGetBufferi");
		GetBufferiv = provider.getFunctionAddress("alGetBufferiv");
		GetBufferf = provider.getFunctionAddress("alGetBufferf");
		GetBufferfv = provider.getFunctionAddress("alGetBufferfv");
		SpeedOfSound = provider.getFunctionAddress("alSpeedOfSound");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AL11} instance for the current context. */
	public static AL11 getInstance() {
		return checkFunctionality(AL.getCapabilities().__AL11);
	}

	static AL11 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenAL11") ) return null;

		AL11 funcs = new AL11(provider);

		boolean supported = checkFunctions(
			funcs.Listener3i, funcs.GetListeneriv, funcs.Source3i, funcs.Listeneriv, funcs.Sourceiv, funcs.Bufferf, funcs.Buffer3f, funcs.Bufferfv, 
			funcs.Bufferi, funcs.Buffer3i, funcs.Bufferiv, funcs.GetBufferi, funcs.GetBufferiv, funcs.GetBufferf, funcs.GetBufferfv, funcs.SpeedOfSound
		);

		return AL.checkExtension("OpenAL11", funcs, supported);
	}

	// --- [ alListener3i ] ---

	/** JNI method for {@link #alListener3i Listener3i} */
	@JavadocExclude
	public static native void nalListener3i(int paramName, float value1, float value2, float value3, long __functionAddress);

	/**
	 * Sets the 3 dimensional integer values of a listener parameter.
	 *
	 * @param paramName the parameter to modify
	 * @param value1    the first value
	 * @param value2    the second value
	 * @param value3    the third value
	 */
	public static void alListener3i(int paramName, float value1, float value2, float value3) {
		long __functionAddress = getInstance().Listener3i;
		nalListener3i(paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alGetListeneriv ] ---

	/** JNI method for {@link #alGetListeneriv GetListeneriv} */
	@JavadocExclude
	public static native void nalGetListeneriv(int param, long values, long __functionAddress);

	/** Unsafe version of {@link #alGetListeneriv GetListeneriv} */
	@JavadocExclude
	public static void nalGetListeneriv(int param, long values) {
		long __functionAddress = getInstance().GetListeneriv;
		nalGetListeneriv(param, values, __functionAddress);
	}

	/**
	 * Returns the integer values of the specified listener parameter.
	 *
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetListeneriv(int param, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetListeneriv(param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetListeneriv GetListeneriv} */
	public static void alGetListeneriv(int param, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nalGetListeneriv(param, memAddress(values));
	}

	// --- [ alSource3i ] ---

	/** JNI method for {@link #alSource3i Source3i} */
	@JavadocExclude
	public static native void nalSource3i(int source, int paramName, int value1, int value2, int value3, long __functionAddress);

	/**
	 * Sets the 3 dimensional integer values of a source parameter.
	 *
	 * @param source    the source to modify
	 * @param paramName the parameter to modify
	 * @param value1    the first value
	 * @param value2    the second value
	 * @param value3    the third value
	 */
	public static void alSource3i(int source, int paramName, int value1, int value2, int value3) {
		long __functionAddress = getInstance().Source3i;
		nalSource3i(source, paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alListeneriv ] ---

	/** JNI method for {@link #alListeneriv Listeneriv} */
	@JavadocExclude
	public static native void nalListeneriv(int listener, long value, long __functionAddress);

	/** Unsafe version of {@link #alListeneriv Listeneriv} */
	@JavadocExclude
	public static void nalListeneriv(int listener, long value) {
		long __functionAddress = getInstance().Listeneriv;
		nalListeneriv(listener, value, __functionAddress);
	}

	/**
	 * Pointer version.
	 *
	 * @param listener the parameter to modify
	 * @param value    the parameter values
	 */
	public static void alListeneriv(int listener, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalListeneriv(listener, memAddress(value));
	}

	/** Alternative version of: {@link #alListeneriv Listeneriv} */
	public static void alListeneriv(int listener, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalListeneriv(listener, memAddress(value));
	}

	// --- [ alSourceiv ] ---

	/** JNI method for {@link #alSourceiv Sourceiv} */
	@JavadocExclude
	public static native void nalSourceiv(int source, int paramName, long value, long __functionAddress);

	/** Unsafe version of {@link #alSourceiv Sourceiv} */
	@JavadocExclude
	public static void nalSourceiv(int source, int paramName, long value) {
		long __functionAddress = getInstance().Sourceiv;
		nalSourceiv(source, paramName, value, __functionAddress);
	}

	/**
	 * Pointer version.
	 *
	 * @param source    the source to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alSourceiv(int source, int paramName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalSourceiv(source, paramName, memAddress(value));
	}

	/** Alternative version of: {@link #alSourceiv Sourceiv} */
	public static void alSourceiv(int source, int paramName, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalSourceiv(source, paramName, memAddress(value));
	}

	// --- [ alBufferf ] ---

	/** JNI method for {@link #alBufferf Bufferf} */
	@JavadocExclude
	public static native void nalBufferf(int buffer, int paramName, float value, long __functionAddress);

	/**
	 * Sets the float value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the value
	 */
	public static void alBufferf(int buffer, int paramName, float value) {
		long __functionAddress = getInstance().Bufferf;
		nalBufferf(buffer, paramName, value, __functionAddress);
	}

	// --- [ alBuffer3f ] ---

	/** JNI method for {@link #alBuffer3f Buffer3f} */
	@JavadocExclude
	public static native void nalBuffer3f(int buffer, int paramName, float value1, float value2, float value3, long __functionAddress);

	/**
	 * Sets the the dimensional value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value1    the first value
	 * @param value2    the second value
	 * @param value3    the third value
	 */
	public static void alBuffer3f(int buffer, int paramName, float value1, float value2, float value3) {
		long __functionAddress = getInstance().Buffer3f;
		nalBuffer3f(buffer, paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alBufferfv ] ---

	/** JNI method for {@link #alBufferfv Bufferfv} */
	@JavadocExclude
	public static native void nalBufferfv(int buffer, int paramName, long value, long __functionAddress);

	/** Unsafe version of {@link #alBufferfv Bufferfv} */
	@JavadocExclude
	public static void nalBufferfv(int buffer, int paramName, long value) {
		long __functionAddress = getInstance().Bufferfv;
		nalBufferfv(buffer, paramName, value, __functionAddress);
	}

	/**
	 * the pointer version of {@link #alBufferf Bufferf}
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alBufferfv(int buffer, int paramName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalBufferfv(buffer, paramName, memAddress(value));
	}

	/** Alternative version of: {@link #alBufferfv Bufferfv} */
	public static void alBufferfv(int buffer, int paramName, FloatBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalBufferfv(buffer, paramName, memAddress(value));
	}

	// --- [ alBufferi ] ---

	/** JNI method for {@link #alBufferi Bufferi} */
	@JavadocExclude
	public static native void nalBufferi(int buffer, int paramName, int value, long __functionAddress);

	/**
	 * Sets the integer value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the value
	 */
	public static void alBufferi(int buffer, int paramName, int value) {
		long __functionAddress = getInstance().Bufferi;
		nalBufferi(buffer, paramName, value, __functionAddress);
	}

	// --- [ alBuffer3i ] ---

	/** JNI method for {@link #alBuffer3i Buffer3i} */
	@JavadocExclude
	public static native void nalBuffer3i(int buffer, int paramName, int value1, int value2, int value3, long __functionAddress);

	/**
	 * Sets the integer 3 dimensional value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value1    the first value
	 * @param value2    the second value
	 * @param value3    the third value
	 */
	public static void alBuffer3i(int buffer, int paramName, int value1, int value2, int value3) {
		long __functionAddress = getInstance().Buffer3i;
		nalBuffer3i(buffer, paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alBufferiv ] ---

	/** JNI method for {@link #alBufferiv Bufferiv} */
	@JavadocExclude
	public static native void nalBufferiv(int buffer, int paramName, long value, long __functionAddress);

	/** Unsafe version of {@link #alBufferiv Bufferiv} */
	@JavadocExclude
	public static void nalBufferiv(int buffer, int paramName, long value) {
		long __functionAddress = getInstance().Bufferiv;
		nalBufferiv(buffer, paramName, value, __functionAddress);
	}

	/**
	 * the pointer version of {@link #alBufferi Bufferi}
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alBufferiv(int buffer, int paramName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalBufferiv(buffer, paramName, memAddress(value));
	}

	/** Alternative version of: {@link #alBufferiv Bufferiv} */
	public static void alBufferiv(int buffer, int paramName, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalBufferiv(buffer, paramName, memAddress(value));
	}

	// --- [ alGetBufferi ] ---

	/** JNI method for {@link #alGetBufferi GetBufferi} */
	@JavadocExclude
	public static native void nalGetBufferi(int buffer, int param, long value, long __functionAddress);

	/** Unsafe version of {@link #alGetBufferi GetBufferi} */
	@JavadocExclude
	public static void nalGetBufferi(int buffer, int param, long value) {
		long __functionAddress = getInstance().GetBufferi;
		nalGetBufferi(buffer, param, value, __functionAddress);
	}

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetBufferi(int buffer, int param, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetBufferi(buffer, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetBufferi GetBufferi} */
	public static void alGetBufferi(int buffer, int param, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalGetBufferi(buffer, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetBufferi GetBufferi} */
	public static int alGetBufferi(int buffer, int param) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetBufferi(buffer, param, __buffer.address(value));
		return __buffer.intValue(value);
	}

	// --- [ alGetBufferiv ] ---

	/** JNI method for {@link #alGetBufferiv GetBufferiv} */
	@JavadocExclude
	public static native void nalGetBufferiv(int buffer, int param, long values, long __functionAddress);

	/** Unsafe version of {@link #alGetBufferiv GetBufferiv} */
	@JavadocExclude
	public static void nalGetBufferiv(int buffer, int param, long values) {
		long __functionAddress = getInstance().GetBufferiv;
		nalGetBufferiv(buffer, param, values, __functionAddress);
	}

	/**
	 * Returns the integer values of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetBufferiv(int buffer, int param, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetBufferiv(buffer, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetBufferiv GetBufferiv} */
	public static void alGetBufferiv(int buffer, int param, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nalGetBufferiv(buffer, param, memAddress(values));
	}

	// --- [ alGetBufferf ] ---

	/** JNI method for {@link #alGetBufferf GetBufferf} */
	@JavadocExclude
	public static native void nalGetBufferf(int buffer, int param, long value, long __functionAddress);

	/** Unsafe version of {@link #alGetBufferf GetBufferf} */
	@JavadocExclude
	public static void nalGetBufferf(int buffer, int param, long value) {
		long __functionAddress = getInstance().GetBufferf;
		nalGetBufferf(buffer, param, value, __functionAddress);
	}

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetBufferf(int buffer, int param, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetBufferf(buffer, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetBufferf GetBufferf} */
	public static void alGetBufferf(int buffer, int param, FloatBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalGetBufferf(buffer, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetBufferf GetBufferf} */
	public static float alGetBufferf(int buffer, int param) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetBufferf(buffer, param, __buffer.address(value));
		return __buffer.floatValue(value);
	}

	// --- [ alGetBufferfv ] ---

	/** JNI method for {@link #alGetBufferfv GetBufferfv} */
	@JavadocExclude
	public static native void nalGetBufferfv(int buffer, int param, long values, long __functionAddress);

	/** Unsafe version of {@link #alGetBufferfv GetBufferfv} */
	@JavadocExclude
	public static void nalGetBufferfv(int buffer, int param, long values) {
		long __functionAddress = getInstance().GetBufferfv;
		nalGetBufferfv(buffer, param, values, __functionAddress);
	}

	/**
	 * Returns the float values of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetBufferfv(int buffer, int param, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetBufferfv(buffer, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetBufferfv GetBufferfv} */
	public static void alGetBufferfv(int buffer, int param, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nalGetBufferfv(buffer, param, memAddress(values));
	}

	// --- [ alSpeedOfSound ] ---

	/** JNI method for {@link #alSpeedOfSound SpeedOfSound} */
	@JavadocExclude
	public static native void nalSpeedOfSound(float value, long __functionAddress);

	/**
	 * Sets the speed of sound.
	 *
	 * @param value the speed of sound
	 */
	public static void alSpeedOfSound(float value) {
		long __functionAddress = getInstance().SpeedOfSound;
		nalSpeedOfSound(value, __functionAddress);
	}

}