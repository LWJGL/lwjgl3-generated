/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to AL 1.1 functionality. */
public class AL11 {

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

	protected AL11() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(ALCapabilities caps) {
		return checkFunctions(
			caps.alListener3i, caps.alGetListeneriv, caps.alSource3i, caps.alListeneriv, caps.alSourceiv, caps.alBufferf, caps.alBuffer3f, caps.alBufferfv, 
			caps.alBufferi, caps.alBuffer3i, caps.alBufferiv, caps.alGetBufferi, caps.alGetBufferiv, caps.alGetBufferf, caps.alGetBufferfv, caps.alSpeedOfSound
		);
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
		long __functionAddress = AL.getCapabilities().alListener3i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeV(__functionAddress, paramName, value1, value2, value3);
	}

	// --- [ alGetListeneriv ] ---

	/**
	 * Returns the integer values of the specified listener parameter.
	 *
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void nalGetListeneriv(int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetListeneriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, param, values);
	}

	/**
	 * Returns the integer values of the specified listener parameter.
	 *
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetListeneriv(int param, IntBuffer values) {
		if ( CHECKS )
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
		long __functionAddress = AL.getCapabilities().alSource3i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeV(__functionAddress, source, paramName, value1, value2, value3);
	}

	// --- [ alListeneriv ] ---

	/**
	 * Pointer version.
	 *
	 * @param listener the parameter to modify
	 * @param value    the parameter values
	 */
	public static void nalListeneriv(int listener, long value) {
		long __functionAddress = AL.getCapabilities().alListeneriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, listener, value);
	}

	/**
	 * Pointer version.
	 *
	 * @param listener the parameter to modify
	 * @param value    the parameter values
	 */
	public static void alListeneriv(int listener, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalListeneriv(listener, memAddress(value));
	}

	// --- [ alSourceiv ] ---

	/**
	 * Pointer version.
	 *
	 * @param source    the source to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void nalSourceiv(int source, int paramName, long value) {
		long __functionAddress = AL.getCapabilities().alSourceiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, source, paramName, value);
	}

	/**
	 * Pointer version.
	 *
	 * @param source    the source to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alSourceiv(int source, int paramName, IntBuffer value) {
		if ( CHECKS )
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
		long __functionAddress = AL.getCapabilities().alBufferf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeV(__functionAddress, buffer, paramName, value);
	}

	// --- [ alBuffer3f ] ---

	/**
	 * Sets the dimensional value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value1    the first value
	 * @param value2    the second value
	 * @param value3    the third value
	 */
	public static void alBuffer3f(int buffer, int paramName, float value1, float value2, float value3) {
		long __functionAddress = AL.getCapabilities().alBuffer3f;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeV(__functionAddress, buffer, paramName, value1, value2, value3);
	}

	// --- [ alBufferfv ] ---

	/**
	 * the pointer version of {@link #alBufferf Bufferf}
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void nalBufferfv(int buffer, int paramName, long value) {
		long __functionAddress = AL.getCapabilities().alBufferfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, paramName, value);
	}

	/**
	 * the pointer version of {@link #alBufferf Bufferf}
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alBufferfv(int buffer, int paramName, FloatBuffer value) {
		if ( CHECKS )
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
		long __functionAddress = AL.getCapabilities().alBufferi;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeV(__functionAddress, buffer, paramName, value);
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
		long __functionAddress = AL.getCapabilities().alBuffer3i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeV(__functionAddress, buffer, paramName, value1, value2, value3);
	}

	// --- [ alBufferiv ] ---

	/**
	 * the pointer version of {@link #alBufferi Bufferi}
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void nalBufferiv(int buffer, int paramName, long value) {
		long __functionAddress = AL.getCapabilities().alBufferiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, paramName, value);
	}

	/**
	 * the pointer version of {@link #alBufferi Bufferi}
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alBufferiv(int buffer, int paramName, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalBufferiv(buffer, paramName, memAddress(value));
	}

	// --- [ alGetBufferi ] ---

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void nalGetBufferi(int buffer, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetBufferi;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, param, value);
	}

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetBufferi(int buffer, int param, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetBufferi(buffer, param, memAddress(value));
	}

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 */
	public static int alGetBufferi(int buffer, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer value = stack.callocInt(1);
			nalGetBufferi(buffer, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetBufferiv ] ---

	/**
	 * Returns the integer values of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void nalGetBufferiv(int buffer, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetBufferiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, param, values);
	}

	/**
	 * Returns the integer values of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetBufferiv(int buffer, int param, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetBufferiv(buffer, param, memAddress(values));
	}

	// --- [ alGetBufferf ] ---

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void nalGetBufferf(int buffer, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetBufferf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, param, value);
	}

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetBufferf(int buffer, int param, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetBufferf(buffer, param, memAddress(value));
	}

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 */
	public static float alGetBufferf(int buffer, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer value = stack.callocFloat(1);
			nalGetBufferf(buffer, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetBufferfv ] ---

	/**
	 * Returns the float values of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void nalGetBufferfv(int buffer, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetBufferfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, param, values);
	}

	/**
	 * Returns the float values of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetBufferfv(int buffer, int param, FloatBuffer values) {
		if ( CHECKS )
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
		long __functionAddress = AL.getCapabilities().alSpeedOfSound;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeV(__functionAddress, value);
	}

	/** Array version of: {@link #alGetListeneriv GetListeneriv} */
	public static void alGetListeneriv(int param, int[] values) {
		long __functionAddress = AL.getCapabilities().alGetListeneriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		invokePV(__functionAddress, param, values);
	}

	/** Array version of: {@link #alListeneriv Listeneriv} */
	public static void alListeneriv(int listener, int[] value) {
		long __functionAddress = AL.getCapabilities().alListeneriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		invokePV(__functionAddress, listener, value);
	}

	/** Array version of: {@link #alSourceiv Sourceiv} */
	public static void alSourceiv(int source, int paramName, int[] value) {
		long __functionAddress = AL.getCapabilities().alSourceiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		invokePV(__functionAddress, source, paramName, value);
	}

	/** Array version of: {@link #alBufferfv Bufferfv} */
	public static void alBufferfv(int buffer, int paramName, float[] value) {
		long __functionAddress = AL.getCapabilities().alBufferfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		invokePV(__functionAddress, buffer, paramName, value);
	}

	/** Array version of: {@link #alBufferiv Bufferiv} */
	public static void alBufferiv(int buffer, int paramName, int[] value) {
		long __functionAddress = AL.getCapabilities().alBufferiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		invokePV(__functionAddress, buffer, paramName, value);
	}

	/** Array version of: {@link #alGetBufferi GetBufferi} */
	public static void alGetBufferi(int buffer, int param, int[] value) {
		long __functionAddress = AL.getCapabilities().alGetBufferi;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		invokePV(__functionAddress, buffer, param, value);
	}

	/** Array version of: {@link #alGetBufferiv GetBufferiv} */
	public static void alGetBufferiv(int buffer, int param, int[] values) {
		long __functionAddress = AL.getCapabilities().alGetBufferiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		invokePV(__functionAddress, buffer, param, values);
	}

	/** Array version of: {@link #alGetBufferf GetBufferf} */
	public static void alGetBufferf(int buffer, int param, float[] value) {
		long __functionAddress = AL.getCapabilities().alGetBufferf;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		invokePV(__functionAddress, buffer, param, value);
	}

	/** Array version of: {@link #alGetBufferfv GetBufferfv} */
	public static void alGetBufferfv(int buffer, int param, float[] values) {
		long __functionAddress = AL.getCapabilities().alGetBufferfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		invokePV(__functionAddress, buffer, param, values);
	}

}