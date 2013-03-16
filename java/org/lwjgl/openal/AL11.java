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

	private AL11() {}

	// --- [ alListener3i ] ---

	/** JNI method for {@link #alListener3i(int, float, float, float)} */
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
		long __functionAddress = getInstance().alListener3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalListener3i(paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alGetListeneriv ] ---

	/** JNI method for {@link #alGetListeneriv(int, ByteBuffer)} */
	public static native void nalGetListeneriv(int param, long values, long __functionAddress);

	/**
	 * Returns the integer values of the specified listener parameter.
	 *
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetListeneriv(int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetListeneriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetListeneriv(param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetListeneriv(int, ByteBuffer)} */
	public static void alGetListeneriv(int param, IntBuffer values) {
		long __functionAddress = getInstance().alGetListeneriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetListeneriv(param, memAddress(values), __functionAddress);
	}

	// --- [ alSource3i ] ---

	/** JNI method for {@link #alSource3i(int, int, int, int, int)} */
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
		long __functionAddress = getInstance().alSource3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSource3i(source, paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alListeneriv ] ---

	/** JNI method for {@link #alListeneri(int, ByteBuffer)} */
	public static native void nalListeneriv(int listener, long value, long __functionAddress);

	/**
	 * Pointer version.
	 *
	 * @param listener the parameter to modify
	 * @param value    the parameter values
	 */
	public static void alListeneri(int listener, ByteBuffer value) {
		long __functionAddress = getInstance().alListeneriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalListeneriv(listener, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alListeneri(int, ByteBuffer)} */
	public static void alListener(int listener, IntBuffer value) {
		long __functionAddress = getInstance().alListeneriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalListeneriv(listener, memAddress(value), __functionAddress);
	}

	// --- [ alSourceiv ] ---

	/** JNI method for {@link #alSourcei(int, int, ByteBuffer)} */
	public static native void nalSourceiv(int source, int paramName, long value, long __functionAddress);

	/**
	 * Pointer version.
	 *
	 * @param source    the source to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alSourcei(int source, int paramName, ByteBuffer value) {
		long __functionAddress = getInstance().alSourceiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalSourceiv(source, paramName, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alSourcei(int, int, ByteBuffer)} */
	public static void alSource(int source, int paramName, IntBuffer value) {
		long __functionAddress = getInstance().alSourceiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalSourceiv(source, paramName, memAddress(value), __functionAddress);
	}

	// --- [ alBufferf ] ---

	/** JNI method for {@link #alBufferf(int, int, float)} */
	public static native void nalBufferf(int buffer, int paramName, float value, long __functionAddress);

	/**
	 * Sets the float value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the value
	 */
	public static void alBufferf(int buffer, int paramName, float value) {
		long __functionAddress = getInstance().alBufferf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalBufferf(buffer, paramName, value, __functionAddress);
	}

	// --- [ alBuffer3f ] ---

	/** JNI method for {@link #alBuffer3f(int, int, float, float, float)} */
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
		long __functionAddress = getInstance().alBuffer3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalBuffer3f(buffer, paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alBufferfv ] ---

	/** JNI method for {@link #alBufferf(int, int, ByteBuffer)} */
	public static native void nalBufferfv(int buffer, int paramName, long value, long __functionAddress);

	/**
	 * the pointer version of {@link #alBufferf(int, int, float)}
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alBufferf(int buffer, int paramName, ByteBuffer value) {
		long __functionAddress = getInstance().alBufferfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalBufferfv(buffer, paramName, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alBufferf(int, int, ByteBuffer)} */
	public static void alBuffer(int buffer, int paramName, FloatBuffer value) {
		long __functionAddress = getInstance().alBufferfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalBufferfv(buffer, paramName, memAddress(value), __functionAddress);
	}

	// --- [ alBufferi ] ---

	/** JNI method for {@link #alBufferi(int, int, int)} */
	public static native void nalBufferi(int buffer, int paramName, int value, long __functionAddress);

	/**
	 * Sets the integer value of a buffer parameter.
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the value
	 */
	public static void alBufferi(int buffer, int paramName, int value) {
		long __functionAddress = getInstance().alBufferi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalBufferi(buffer, paramName, value, __functionAddress);
	}

	// --- [ alBuffer3i ] ---

	/** JNI method for {@link #alBuffer3i(int, int, int, int, int)} */
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
		long __functionAddress = getInstance().alBuffer3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalBuffer3i(buffer, paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alBufferiv ] ---

	/** JNI method for {@link #alBufferi(int, int, ByteBuffer)} */
	public static native void nalBufferiv(int buffer, int paramName, long value, long __functionAddress);

	/**
	 * the pointer version of {@link #alBufferi(int, int, int)}
	 *
	 * @param buffer    the buffer to modify
	 * @param paramName the parameter to modify
	 * @param value     the parameter values
	 */
	public static void alBufferi(int buffer, int paramName, ByteBuffer value) {
		long __functionAddress = getInstance().alBufferiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalBufferiv(buffer, paramName, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alBufferi(int, int, ByteBuffer)} */
	public static void alBuffer(int buffer, int paramName, IntBuffer value) {
		long __functionAddress = getInstance().alBufferiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalBufferiv(buffer, paramName, memAddress(value), __functionAddress);
	}

	// --- [ alGetBufferi ] ---

	/** JNI method for {@link #alGetBufferi(int, int, ByteBuffer)} */
	public static native void nalGetBufferi(int buffer, int param, long value, long __functionAddress);

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetBufferi(int buffer, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetBufferi;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetBufferi(buffer, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetBufferi(int, int, ByteBuffer)} */
	public static void alGetBuffer(int buffer, int param, IntBuffer value) {
		long __functionAddress = getInstance().alGetBufferi;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetBufferi(buffer, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetBufferi(int, int, ByteBuffer)} */
	public static int alGetBufferi(int buffer, int param) {
		long __functionAddress = getInstance().alGetBufferi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetBufferi(buffer, param, __buffer.address() + value, __functionAddress);
		return __buffer.intValue(value);
	}

	// --- [ alGetBufferiv ] ---

	/** JNI method for {@link #alGetBufferiv(int, int, ByteBuffer)} */
	public static native void nalGetBufferiv(int buffer, int param, long values, long __functionAddress);

	/**
	 * Returns the integer values of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetBufferiv(int buffer, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetBufferiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetBufferiv(buffer, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetBufferiv(int, int, ByteBuffer)} */
	public static void alGetBufferiv(int buffer, int param, IntBuffer values) {
		long __functionAddress = getInstance().alGetBufferiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetBufferiv(buffer, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetBufferf ] ---

	/** JNI method for {@link #alGetBufferf(int, int, ByteBuffer)} */
	public static native void nalGetBufferf(int buffer, int param, long value, long __functionAddress);

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetBufferf(int buffer, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetBufferf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetBufferf(buffer, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetBufferf(int, int, ByteBuffer)} */
	public static void alGetBuffer(int buffer, int param, FloatBuffer value) {
		long __functionAddress = getInstance().alGetBufferf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetBufferf(buffer, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetBufferf(int, int, ByteBuffer)} */
	public static float alGetBufferf(int buffer, int param) {
		long __functionAddress = getInstance().alGetBufferf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetBufferf(buffer, param, __buffer.address() + value, __functionAddress);
		return __buffer.floatValue(value);
	}

	// --- [ alGetBufferfv ] ---

	/** JNI method for {@link #alGetBufferfv(int, int, ByteBuffer)} */
	public static native void nalGetBufferfv(int buffer, int param, long values, long __functionAddress);

	/**
	 * Returns the float values of the specified buffer parameter.
	 *
	 * @param buffer the buffer to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetBufferfv(int buffer, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetBufferfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetBufferfv(buffer, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetBufferfv(int, int, ByteBuffer)} */
	public static void alGetBufferfv(int buffer, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alGetBufferfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetBufferfv(buffer, param, memAddress(values), __functionAddress);
	}

	// --- [ alSpeedOfSound ] ---

	/** JNI method for {@link #alSpeedOfSound(float)} */
	public static native void nalSpeedOfSound(float value, long __functionAddress);

	/**
	 * Sets the speed of sound.
	 *
	 * @param value the speed of sound
	 */
	public static void alSpeedOfSound(float value) {
		long __functionAddress = getInstance().alSpeedOfSound;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSpeedOfSound(value, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return AL.getCapabilities().__AL11;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenAL11") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.alListener3i != 0L &&
			funcs.alGetListeneriv != 0L &&
			funcs.alSource3i != 0L &&
			funcs.alListeneriv != 0L &&
			funcs.alSourceiv != 0L &&
			funcs.alBufferf != 0L &&
			funcs.alBuffer3f != 0L &&
			funcs.alBufferfv != 0L &&
			funcs.alBufferi != 0L &&
			funcs.alBuffer3i != 0L &&
			funcs.alBufferiv != 0L &&
			funcs.alGetBufferi != 0L &&
			funcs.alGetBufferiv != 0L &&
			funcs.alGetBufferf != 0L &&
			funcs.alGetBufferfv != 0L &&
			funcs.alSpeedOfSound != 0L;

		return AL.checkExtension("OpenAL11", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code AL11}. */
	public static final class Functions implements FunctionMap {

		public final long
			alListener3i,
			alGetListeneriv,
			alSource3i,
			alListeneriv,
			alSourceiv,
			alBufferf,
			alBuffer3f,
			alBufferfv,
			alBufferi,
			alBuffer3i,
			alBufferiv,
			alGetBufferi,
			alGetBufferiv,
			alGetBufferf,
			alGetBufferfv,
			alSpeedOfSound;

		public Functions(FunctionProvider provider) {
			alListener3i = provider.getFunctionAddress("alListener3i");
			alGetListeneriv = provider.getFunctionAddress("alGetListeneriv");
			alSource3i = provider.getFunctionAddress("alSource3i");
			alListeneriv = provider.getFunctionAddress("alListeneriv");
			alSourceiv = provider.getFunctionAddress("alSourceiv");
			alBufferf = provider.getFunctionAddress("alBufferf");
			alBuffer3f = provider.getFunctionAddress("alBuffer3f");
			alBufferfv = provider.getFunctionAddress("alBufferfv");
			alBufferi = provider.getFunctionAddress("alBufferi");
			alBuffer3i = provider.getFunctionAddress("alBuffer3i");
			alBufferiv = provider.getFunctionAddress("alBufferiv");
			alGetBufferi = provider.getFunctionAddress("alGetBufferi");
			alGetBufferiv = provider.getFunctionAddress("alGetBufferiv");
			alGetBufferf = provider.getFunctionAddress("alGetBufferf");
			alGetBufferfv = provider.getFunctionAddress("alGetBufferfv");
			alSpeedOfSound = provider.getFunctionAddress("alSpeedOfSound");
		}

	}

}