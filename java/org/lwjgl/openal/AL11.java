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
import static org.lwjgl.system.JNI.*;
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
		invokeIFFFV(__functionAddress, paramName, value1, value2, value3);
	}

	// --- [ alGetListeneriv ] ---

	/** Unsafe version of {@link #alGetListeneriv GetListeneriv} */
	@JavadocExclude
	public static void nalGetListeneriv(int param, long values) {
		long __functionAddress = getInstance().GetListeneriv;
		invokeIPV(__functionAddress, param, values);
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
		invokeIIIIIV(__functionAddress, source, paramName, value1, value2, value3);
	}

	// --- [ alListeneriv ] ---

	/** Unsafe version of {@link #alListeneriv Listeneriv} */
	@JavadocExclude
	public static void nalListeneriv(int listener, long value) {
		long __functionAddress = getInstance().Listeneriv;
		invokeIPV(__functionAddress, listener, value);
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

	/** Unsafe version of {@link #alSourceiv Sourceiv} */
	@JavadocExclude
	public static void nalSourceiv(int source, int paramName, long value) {
		long __functionAddress = getInstance().Sourceiv;
		invokeIIPV(__functionAddress, source, paramName, value);
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

	/**
	 * Sets the float value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the value
	 */
	public static void alBufferf(int buffer, int paramName, float value) {
		long __functionAddress = getInstance().Bufferf;
		invokeIIFV(__functionAddress, buffer, paramName, value);
	}

	// --- [ alBuffer3f ] ---

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
		invokeIIFFFV(__functionAddress, buffer, paramName, value1, value2, value3);
	}

	// --- [ alBufferfv ] ---

	/** Unsafe version of {@link #alBufferfv Bufferfv} */
	@JavadocExclude
	public static void nalBufferfv(int buffer, int paramName, long value) {
		long __functionAddress = getInstance().Bufferfv;
		invokeIIPV(__functionAddress, buffer, paramName, value);
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

	/**
	 * Sets the integer value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the value
	 */
	public static void alBufferi(int buffer, int paramName, int value) {
		long __functionAddress = getInstance().Bufferi;
		invokeIIIV(__functionAddress, buffer, paramName, value);
	}

	// --- [ alBuffer3i ] ---

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
		invokeIIIIIV(__functionAddress, buffer, paramName, value1, value2, value3);
	}

	// --- [ alBufferiv ] ---

	/** Unsafe version of {@link #alBufferiv Bufferiv} */
	@JavadocExclude
	public static void nalBufferiv(int buffer, int paramName, long value) {
		long __functionAddress = getInstance().Bufferiv;
		invokeIIPV(__functionAddress, buffer, paramName, value);
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

	/** Unsafe version of {@link #alGetBufferi GetBufferi} */
	@JavadocExclude
	public static void nalGetBufferi(int buffer, int param, long value) {
		long __functionAddress = getInstance().GetBufferi;
		invokeIIPV(__functionAddress, buffer, param, value);
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

	/** Unsafe version of {@link #alGetBufferiv GetBufferiv} */
	@JavadocExclude
	public static void nalGetBufferiv(int buffer, int param, long values) {
		long __functionAddress = getInstance().GetBufferiv;
		invokeIIPV(__functionAddress, buffer, param, values);
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

	/** Unsafe version of {@link #alGetBufferf GetBufferf} */
	@JavadocExclude
	public static void nalGetBufferf(int buffer, int param, long value) {
		long __functionAddress = getInstance().GetBufferf;
		invokeIIPV(__functionAddress, buffer, param, value);
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

	/** Unsafe version of {@link #alGetBufferfv GetBufferfv} */
	@JavadocExclude
	public static void nalGetBufferfv(int buffer, int param, long values) {
		long __functionAddress = getInstance().GetBufferfv;
		invokeIIPV(__functionAddress, buffer, param, values);
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

	/**
	 * Sets the speed of sound.
	 *
	 * @param value the speed of sound
	 */
	public static void alSpeedOfSound(float value) {
		long __functionAddress = getInstance().SpeedOfSound;
		invokeFV(__functionAddress, value);
	}

}