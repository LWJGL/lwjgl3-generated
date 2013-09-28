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

/** Native bindings to AL 1.0 functionality. */
public final class AL10 {

	/** General tokens. */
	public static final int
		AL_INVALID = 0xFFFFFFFF,
		AL_NONE    = 0x0,
		AL_FALSE   = 0x0,
		AL_TRUE    = 0x1;

	/** Error conditions. */
	public static final int
		AL_NO_ERROR          = 0x0,
		AL_INVALID_NAME      = 0xA001,
		AL_INVALID_ENUM      = 0xA002,
		AL_INVALID_VALUE     = 0xA003,
		AL_INVALID_OPERATION = 0xA004,
		AL_OUT_OF_MEMORY     = 0xA005;

	/** Numerical queries. */
	public static final int
		AL_DOPPLER_FACTOR = 0xC000,
		AL_DISTANCE_MODEL = 0xD000;

	/** String queries. */
	public static final int
		AL_VENDOR     = 0xB001,
		AL_VERSION    = 0xB002,
		AL_RENDERER   = 0xB003,
		AL_EXTENSIONS = 0xB004;

	/** Distance attenuation models. */
	public static final int
		AL_INVERSE_DISTANCE         = 0xD001,
		AL_INVERSE_DISTANCE_CLAMPED = 0xD002;

	/** Source types. */
	public static final int
		AL_SOURCE_ABSOLUTE = 0x201,
		AL_SOURCE_RELATIVE = 0x202;

	/** Listener and Source attributes. */
	public static final int
		AL_POSITION = 0x1004,
		AL_VELOCITY = 0x1006,
		AL_GAIN     = 0x100A;

	/** Source attributes. */
	public static final int
		AL_CONE_INNER_ANGLE = 0x1001,
		AL_CONE_OUTER_ANGLE = 0x1002,
		AL_PITCH            = 0x1003,
		AL_DIRECTION        = 0x1005,
		AL_LOOPING          = 0x1007,
		AL_BUFFER           = 0x1009,
		AL_SOURCE_STATE     = 0x1010,
		AL_CONE_OUTER_GAIN  = 0x1022,
		AL_SOURCE_TYPE      = 0x1027;

	/** Source state. */
	public static final int
		AL_INITIAL = 0x1011,
		AL_PLAYING = 0x1012,
		AL_PAUSED  = 0x1013,
		AL_STOPPED = 0x1014;

	/** Listener attributes. */
	public static final int
		AL_ORIENTATION = 0x100F;

	/** Queue state. */
	public static final int
		AL_BUFFERS_QUEUED    = 0x1015,
		AL_BUFFERS_PROCESSED = 0x1016;

	/** Gain bounds. */
	public static final int
		AL_MIN_GAIN = 0x100D,
		AL_MAX_GAIN = 0x100E;

	/** Distance model attributes, */
	public static final int
		AL_REFERENCE_DISTANCE = 0x1020,
		AL_ROLLOFF_FACTOR     = 0x1021,
		AL_MAX_DISTANCE       = 0x1023;

	/** Buffer attributes, */
	public static final int
		AL_FREQUENCY = 0x2001,
		AL_BITS      = 0x2002,
		AL_CHANNELS  = 0x2003,
		AL_SIZE      = 0x2004;

	/** Buffer formats. */
	public static final int
		AL_FORMAT_MONO8    = 0x1100,
		AL_FORMAT_MONO16   = 0x1101,
		AL_FORMAT_STEREO8  = 0x1102,
		AL_FORMAT_STEREO16 = 0x1103;

	/** Buffer state. */
	public static final int
		AL_UNUSED    = 0x2010,
		AL_PENDING   = 0x2011,
		AL_PROCESSED = 0x2012;

	private AL10() {}

	// --- [ alGetError ] ---

	/** JNI method for {@link #alGetError alGetError} */
	public static native int nalGetError(long __functionAddress);

	/**
	 * Obtains error information.
	 * <p/>
	 * Each detectable error is assigned a numeric code. When an error is detected by AL, a flag is set and the error code is recorded. Further errors, if they
	 * occur, do not affect this recorded code. When alGetError is called, the code is returned and the flag is cleared, so that a further error will again
	 * record its code. If a call to alGetError returns AL_NO_ERROR then there has been no detectable error since the last call to alGetError (or since the AL
	 * was initialized).
	 * <p/>
	 * Error codes can be mapped to strings. The alGetString function returns a pointer to a constant (literal) string that is identical to the identifier used
	 * for the enumeration value, as defined in the specification.
	 */
	public static int alGetError() {
		long __functionAddress = getInstance().alGetError;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalGetError(__functionAddress);
	}

	// --- [ alEnable ] ---

	/** JNI method for {@link #alEnable alEnable} */
	public static native void nalEnable(int target, long __functionAddress);

	/**
	 * Enables AL capabilities.
	 *
	 * @param target the capability to enable
	 */
	public static void alEnable(int target) {
		long __functionAddress = getInstance().alEnable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalEnable(target, __functionAddress);
	}

	// --- [ alDisable ] ---

	/** JNI method for {@link #alDisable alDisable} */
	public static native void nalDisable(int target, long __functionAddress);

	/**
	 * Disables AL capabilities.
	 *
	 * @param target the capability to disable
	 */
	public static void alDisable(int target) {
		long __functionAddress = getInstance().alDisable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDisable(target, __functionAddress);
	}

	// --- [ alIsEnabled ] ---

	/** JNI method for {@link #alIsEnabled alIsEnabled} */
	public static native boolean nalIsEnabled(int target, long __functionAddress);

	/**
	 * Queries whether a given capability is currently enabled or not.
	 *
	 * @param target the capability to query
	 */
	public static boolean alIsEnabled(int target) {
		long __functionAddress = getInstance().alIsEnabled;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalIsEnabled(target, __functionAddress);
	}

	// --- [ alGetBoolean ] ---

	/** JNI method for {@link #alGetBoolean alGetBoolean} */
	public static native boolean nalGetBoolean(int paramName, long __functionAddress);

	/**
	 * Returns the boolean value of the specified parameter.
	 *
	 * @param paramName the parameter to query
	 */
	public static boolean alGetBoolean(int paramName) {
		long __functionAddress = getInstance().alGetBoolean;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalGetBoolean(paramName, __functionAddress);
	}

	// --- [ alGetInteger ] ---

	/** JNI method for {@link #alGetInteger alGetInteger} */
	public static native int nalGetInteger(int paramName, long __functionAddress);

	/**
	 * Returns the integer value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<p/>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}, {@link #AL_DISTANCE_MODEL DISTANCE_MODEL}, {@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}
	 */
	public static int alGetInteger(int paramName) {
		long __functionAddress = getInstance().alGetInteger;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalGetInteger(paramName, __functionAddress);
	}

	// --- [ alGetFloat ] ---

	/** JNI method for {@link #alGetFloat alGetFloat} */
	public static native float nalGetFloat(int paramName, long __functionAddress);

	/**
	 * Returns the float value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<p/>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}, {@link #AL_DISTANCE_MODEL DISTANCE_MODEL}, {@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}
	 */
	public static float alGetFloat(int paramName) {
		long __functionAddress = getInstance().alGetFloat;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalGetFloat(paramName, __functionAddress);
	}

	// --- [ alGetDouble ] ---

	/** JNI method for {@link #alGetDouble alGetDouble} */
	public static native double nalGetDouble(int paramName, long __functionAddress);

	/**
	 * Returns the double value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<p/>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}, {@link #AL_DISTANCE_MODEL DISTANCE_MODEL}, {@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}
	 */
	public static double alGetDouble(int paramName) {
		long __functionAddress = getInstance().alGetDouble;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalGetDouble(paramName, __functionAddress);
	}

	// --- [ alGetBooleanv ] ---

	/** JNI method for {@link #alGetBoolean(int, ByteBuffer) alGetBoolean} */
	public static native void nalGetBooleanv(int paramName, long dest, long __functionAddress);

	/**
	 * Pointer version of {@link #alGetBoolean alGetBoolean}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetBoolean(int paramName, ByteBuffer dest) {
		long __functionAddress = getInstance().alGetBooleanv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dest, 1);
		}
		nalGetBooleanv(paramName, memAddress(dest), __functionAddress);
	}

	// --- [ alGetIntegerv ] ---

	/** JNI method for {@link #alGetInteger(int, ByteBuffer) alGetInteger} */
	public static native void nalGetIntegerv(int paramName, long dest, long __functionAddress);

	/**
	 * Pointer version of {@link #alGetInteger alGetInteger}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetInteger(int paramName, ByteBuffer dest) {
		long __functionAddress = getInstance().alGetIntegerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dest, 1 << 2);
		}
		nalGetIntegerv(paramName, memAddress(dest), __functionAddress);
	}

	/** Alternative version of: {@link #alGetInteger(int, ByteBuffer) alGetInteger} */
	public static void alGetInteger(int paramName, IntBuffer dest) {
		long __functionAddress = getInstance().alGetIntegerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dest, 1);
		}
		nalGetIntegerv(paramName, memAddress(dest), __functionAddress);
	}

	// --- [ alGetFloatv ] ---

	/** JNI method for {@link #alGetFloat(int, ByteBuffer) alGetFloat} */
	public static native void nalGetFloatv(int paramName, long dest, long __functionAddress);

	/**
	 * Pointer version of {@link #alGetFloat alGetFloat}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetFloat(int paramName, ByteBuffer dest) {
		long __functionAddress = getInstance().alGetFloatv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dest, 1 << 2);
		}
		nalGetFloatv(paramName, memAddress(dest), __functionAddress);
	}

	/** Alternative version of: {@link #alGetFloat(int, ByteBuffer) alGetFloat} */
	public static void alGetFloat(int paramName, FloatBuffer dest) {
		long __functionAddress = getInstance().alGetFloatv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dest, 1);
		}
		nalGetFloatv(paramName, memAddress(dest), __functionAddress);
	}

	// --- [ alGetDoublev ] ---

	/** JNI method for {@link #alGetDouble(int, ByteBuffer) alGetDouble} */
	public static native void nalGetDoublev(int paramName, long dest, long __functionAddress);

	/**
	 * Pointer version of {@link #alGetDouble alGetDouble}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetDouble(int paramName, ByteBuffer dest) {
		long __functionAddress = getInstance().alGetDoublev;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dest, 1 << 3);
		}
		nalGetDoublev(paramName, memAddress(dest), __functionAddress);
	}

	/** Alternative version of: {@link #alGetDouble(int, ByteBuffer) alGetDouble} */
	public static void alGetDouble(int paramName, DoubleBuffer dest) {
		long __functionAddress = getInstance().alGetDoublev;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dest, 1);
		}
		nalGetDoublev(paramName, memAddress(dest), __functionAddress);
	}

	// --- [ alGetString ] ---

	/** JNI method for {@link #alGetString alGetString} */
	public static native long nalGetString(int paramName, long __functionAddress);

	/**
	 * Returns the string value of the specified parameter
	 *
	 * @param paramName the parameter to query. One of:<p/>{@link #AL_VENDOR VENDOR}, {@link #AL_VERSION VERSION}, {@link #AL_RENDERER RENDERER}, {@link #AL_EXTENSIONS EXTENSIONS}
	 */
	public static String alGetString(int paramName) {
		long __functionAddress = getInstance().alGetString;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nalGetString(paramName, __functionAddress);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ alDistanceModel ] ---

	/** JNI method for {@link #alDistanceModel alDistanceModel} */
	public static native void nalDistanceModel(int modelName, long __functionAddress);

	/**
	 * Sets the distance attenuation model.
	 * <p/>
	 * Samples usually use the entire dynamic range of the chosen format/encoding, independent of their real world intensity. For example, a jet engine and a
	 * clockwork both will have samples with full amplitude. The application will then have to adjust source gain accordingly to account for relative differences.
	 * <p/>
	 * Source gain is then attenuated by distance. The effective attenuation of a source depends on many factors, among which distance attenuation and source
	 * and listener gain are only some of the contributing factors. Even if the source and listener gain exceed 1.0 (amplification beyond the guaranteed
	 * dynamic range), distance and other attenuation might ultimately limit the overall gain to a value below 1.0.
	 * <p/>
	 * OpenAL currently supports three modes of operation with respect to distance attenuation, including one that is similar to the IASIG I3DL2 model. The
	 * application can choose one of these models (or chooses to disable distance-dependent attenuation) on a per-context basis.
	 *
	 * @param modelName the distance attenuation model to set. One of:<p/>{@link #AL_INVERSE_DISTANCE INVERSE_DISTANCE}, {@link #AL_INVERSE_DISTANCE_CLAMPED INVERSE_DISTANCE_CLAMPED}, {@link AL11#AL_LINEAR_DISTANCE LINEAR_DISTANCE}, {@link AL11#AL_LINEAR_DISTANCE_CLAMPED LINEAR_DISTANCE_CLAMPED}, {@link AL11#AL_EXPONENT_DISTANCE EXPONENT_DISTANCE}, {@link AL11#AL_EXPONENT_DISTANCE_CLAMPED EXPONENT_DISTANCE_CLAMPED}, {@link #AL_NONE NONE}
	 */
	public static void alDistanceModel(int modelName) {
		long __functionAddress = getInstance().alDistanceModel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDistanceModel(modelName, __functionAddress);
	}

	// --- [ alDopplerFactor ] ---

	/** JNI method for {@link #alDopplerFactor alDopplerFactor} */
	public static native void nalDopplerFactor(float dopplerFactor, long __functionAddress);

	/**
	 * Sets the doppler effect factor.
	 * <p/>
	 * The Doppler Effect depends on the velocities of source and listener relative to the medium, and the propagation speed of sound in that medium. The
	 * application might want to emphasize or de-emphasize the Doppler Effect as physically accurate calculation might not give the desired results. The amount
	 * of frequency shift (pitch change) is proportional to the speed of listener and source along their line of sight. The Doppler Effect as implemented by
	 * OpenAL is described by the formula below. Effects of the medium (air, water) moving with respect to listener and source are ignored.
	 * <pre>{@code
	 * SS: AL_SPEED_OF_SOUND = speed of sound (default value 343.3)
	 * DF: AL_DOPPLER_FACTOR = Doppler factor (default 1.0)
	 * vls: Listener velocity scalar (scalar, projected on source-to-listener vector)
	 * vss: Source velocity scalar (scalar, projected on source-to-listener vector)
	 * f: Frequency of sample
	 * f': effective Doppler shifted frequency
	 * 	
	 * 3D Mathematical representation of vls and vss:
	 * 	
	 * Mag(vector) = sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z)
	 * DotProduct(v1, v2) = (v1.x * v2.x + v1.y * v2.y + v1.z * v2.z)
	 * 	
	 * SL = source to listener vector
	 * SV = Source velocity vector
	 * LV = Listener velocity vector
	 * 	
	 * vls = DotProduct(SL, LV) / Mag(SL)
	 * vss = DotProduct(SL, SV) / Mag(SL)
	 * 	
	 * Dopper Calculation:
	 * 	
	 * vss = min(vss, SS / DF)
	 * vls = min(vls, SS / DF)
	 * 	
	 * f' = f * (SS - DF * vls) / (SS - DF * vss)}</pre>
	 * The {@code dopplerFactor} is a simple scaling of source and listener velocities to exaggerate or deemphasize the Doppler (pitch) shift resulting from
	 * the calculation.
	 *
	 * @param dopplerFactor the doppler factor
	 */
	public static void alDopplerFactor(float dopplerFactor) {
		long __functionAddress = getInstance().alDopplerFactor;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDopplerFactor(dopplerFactor, __functionAddress);
	}

	// --- [ alDopplerVelocity ] ---

	/** JNI method for {@link #alDopplerVelocity alDopplerVelocity} */
	public static native void nalDopplerVelocity(float dopplerVelocity, long __functionAddress);

	/**
	 * Sets the doppler effect propagation velocity.
	 * <p/>
	 * The OpenAL 1.1 Doppler implementation is different than that of OpenAL 1.0, because the older implementation was confusing and not implemented
	 * consistently. The new "speed of sound" property makes the 1.1 implementation more intuitive than the old implementation. If your implementation wants to
	 * support the AL_DOPPLER_VELOCITY parameter (the alDopplerVelocity call will remain as an entry point so that 1.0 applications can link with a 1.1
	 * library), the above formula can be changed to the following:
	 * <pre>{@code
	 * vss = min(vss, (SS * DV)/DF)
	 * vls = min(vls, (SS * DV)/DF)
	 * 	
	 * f' = f * (SS * DV - DF*vls) / (SS * DV - DF*vss)}</pre>
	 * OpenAL 1.1 programmers would never use AL_DOPPLER_VELOCITY (which defaults to 1.0).
	 *
	 * @param dopplerVelocity the doppler velocity
	 */
	public static void alDopplerVelocity(float dopplerVelocity) {
		long __functionAddress = getInstance().alDopplerVelocity;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDopplerVelocity(dopplerVelocity, __functionAddress);
	}

	// --- [ alListenerf ] ---

	/** JNI method for {@link #alListenerf alListenerf} */
	public static native void nalListenerf(int paramName, float value, long __functionAddress);

	/**
	 * Sets the float value of a listener parameter.
	 *
	 * @param paramName the parameter to modify. One of:<p/>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value     the parameter value
	 */
	public static void alListenerf(int paramName, float value) {
		long __functionAddress = getInstance().alListenerf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalListenerf(paramName, value, __functionAddress);
	}

	// --- [ alListeneri ] ---

	/** JNI method for {@link #alListeneri alListeneri} */
	public static native void nalListeneri(int paramName, int values, long __functionAddress);

	/**
	 * Integer version of {@link #alListenerf alListenerf}.
	 *
	 * @param paramName the parameter to modify. One of:<p/>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param values    the parameter value
	 */
	public static void alListeneri(int paramName, int values) {
		long __functionAddress = getInstance().alListeneri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalListeneri(paramName, values, __functionAddress);
	}

	// --- [ alListener3f ] ---

	/** JNI method for {@link #alListener3f alListener3f} */
	public static native void nalListener3f(int paramName, float value1, float value2, float value3, long __functionAddress);

	/**
	 * Sets the 3 dimensional float values of a listener parameter.
	 *
	 * @param paramName the parameter to modify. One of:<p/>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value1    the first value
	 * @param value2    the second value
	 * @param value3    the third value
	 */
	public static void alListener3f(int paramName, float value1, float value2, float value3) {
		long __functionAddress = getInstance().alListener3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalListener3f(paramName, value1, value2, value3, __functionAddress);
	}

	// --- [ alListenerfv ] ---

	/** JNI method for {@link #alListenerf(int, ByteBuffer) alListenerf} */
	public static native void nalListenerfv(int paramName, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alListenerf alListenerf}.
	 *
	 * @param paramName the parameter to modify
	 * @param values    the parameter values
	 */
	public static void alListenerf(int paramName, ByteBuffer values) {
		long __functionAddress = getInstance().alListenerfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalListenerfv(paramName, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alListenerf(int, ByteBuffer) alListenerf} */
	public static void alListener(int paramName, FloatBuffer values) {
		long __functionAddress = getInstance().alListenerfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalListenerfv(paramName, memAddress(values), __functionAddress);
	}

	// --- [ alGetListenerf ] ---

	/** JNI method for {@link #alGetListenerf alGetListenerf} */
	public static native void nalGetListenerf(int paramName, long value, long __functionAddress);

	/**
	 * Returns the float value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<p/>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value     the parameter value
	 */
	public static void alGetListenerf(int paramName, ByteBuffer value) {
		long __functionAddress = getInstance().alGetListenerf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetListenerf(paramName, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetListenerf alGetListenerf} */
	public static void alGetListener(int paramName, FloatBuffer value) {
		long __functionAddress = getInstance().alGetListenerf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetListenerf(paramName, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetListenerf alGetListenerf} */
	public static float alGetListenerf(int paramName) {
		long __functionAddress = getInstance().alGetListenerf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetListenerf(paramName, __buffer.address() + value, __functionAddress);
		return __buffer.floatValue(value);
	}

	// --- [ alGetListeneri ] ---

	/** JNI method for {@link #alGetListeneri alGetListeneri} */
	public static native void nalGetListeneri(int paramName, long value, long __functionAddress);

	/**
	 * Returns the integer value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<p/>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value     the parameter value
	 */
	public static void alGetListeneri(int paramName, ByteBuffer value) {
		long __functionAddress = getInstance().alGetListeneri;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetListeneri(paramName, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetListeneri alGetListeneri} */
	public static void alGetListener(int paramName, IntBuffer value) {
		long __functionAddress = getInstance().alGetListeneri;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetListeneri(paramName, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetListeneri alGetListeneri} */
	public static int alGetListeneri(int paramName) {
		long __functionAddress = getInstance().alGetListeneri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetListeneri(paramName, __buffer.address() + value, __functionAddress);
		return __buffer.intValue(value);
	}

	// --- [ alGetListener3f ] ---

	/** JNI method for {@link #alGetListener3f alGetListener3f} */
	public static native void nalGetListener3f(int paramName, long value1, long value2, long value3, long __functionAddress);

	/**
	 * Returns the 3 dimensional values of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<p/>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value1    the first parameter value
	 * @param value2    the second parameter value
	 * @param value3    the third parameter value
	 */
	public static void alGetListener3f(int paramName, ByteBuffer value1, ByteBuffer value2, ByteBuffer value3) {
		long __functionAddress = getInstance().alGetListener3f;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value1, 1 << 2);
			checkBuffer(value2, 1 << 2);
			checkBuffer(value3, 1 << 2);
		}
		nalGetListener3f(paramName, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	/** Alternative version of: {@link #alGetListener3f alGetListener3f} */
	public static void alGetListener3(int paramName, FloatBuffer value1, FloatBuffer value2, FloatBuffer value3) {
		long __functionAddress = getInstance().alGetListener3f;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value1, 1);
			checkBuffer(value2, 1);
			checkBuffer(value3, 1);
		}
		nalGetListener3f(paramName, memAddress(value1), memAddress(value2), memAddress(value3), __functionAddress);
	}

	// --- [ alGetListenerfv ] ---

	/** JNI method for {@link #alGetListenerfv alGetListenerfv} */
	public static native void nalGetListenerfv(int paramName, long values, long __functionAddress);

	/**
	 * Returns float values of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<p/>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param values    the parameter values
	 */
	public static void alGetListenerfv(int paramName, ByteBuffer values) {
		long __functionAddress = getInstance().alGetListenerfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetListenerfv(paramName, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetListenerfv alGetListenerfv} */
	public static void alGetListenerfv(int paramName, FloatBuffer values) {
		long __functionAddress = getInstance().alGetListenerfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetListenerfv(paramName, memAddress(values), __functionAddress);
	}

	// --- [ alGenSources ] ---

	/** JNI method for {@link #alGenSources alGenSources} */
	public static native void nalGenSources(int n, long srcNames, long __functionAddress);

	/**
	 * Requests a number of source names.
	 *
	 * @param n        the number of source names to generated
	 * @param srcNames the buffer that will receive the source names
	 */
	public static void alGenSources(int n, ByteBuffer srcNames) {
		long __functionAddress = getInstance().alGenSources;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(srcNames, n << 2);
		}
		nalGenSources(n, memAddress(srcNames), __functionAddress);
	}

	/** Alternative version of: {@link #alGenSources alGenSources} */
	public static void alGenSources(IntBuffer srcNames) {
		long __functionAddress = getInstance().alGenSources;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGenSources(srcNames.remaining(), memAddress(srcNames), __functionAddress);
	}

	/** Single return value version of: {@link #alGenSources alGenSources} */
	public static int alGenSources() {
		long __functionAddress = getInstance().alGenSources;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int srcNames = __buffer.intParam();
		nalGenSources(1, __buffer.address() + srcNames, __functionAddress);
		return __buffer.intValue(srcNames);
	}

	// --- [ alDeleteSources ] ---

	/** JNI method for {@link #alDeleteSources alDeleteSources} */
	public static native void nalDeleteSources(int n, long sources, long __functionAddress);

	/**
	 * Requests the deletion of a number of sources.
	 *
	 * @param n       the number of sources to delete
	 * @param sources the sources to delete
	 */
	public static void alDeleteSources(int n, ByteBuffer sources) {
		long __functionAddress = getInstance().alDeleteSources;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(sources, n << 2);
		}
		nalDeleteSources(n, memAddress(sources), __functionAddress);
	}

	/** Alternative version of: {@link #alDeleteSources alDeleteSources} */
	public static void alDeleteSources(IntBuffer sources) {
		long __functionAddress = getInstance().alDeleteSources;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDeleteSources(sources.remaining(), memAddress(sources), __functionAddress);
	}

	/** Single value version of: {@link #alDeleteSources alDeleteSources} */
	public static void alDeleteSources(int source) {
		long __functionAddress = getInstance().alDeleteSources;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int sources = __buffer.intParam(source);
		nalDeleteSources(1, __buffer.address() + sources, __functionAddress);
	}

	// --- [ alIsSource ] ---

	/** JNI method for {@link #alIsSource alIsSource} */
	public static native boolean nalIsSource(int sourceName, long __functionAddress);

	/**
	 * Verifies whether the given object name is a source name.
	 *
	 * @param sourceName a value that may be a source name
	 */
	public static boolean alIsSource(int sourceName) {
		long __functionAddress = getInstance().alIsSource;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalIsSource(sourceName, __functionAddress);
	}

	// --- [ alSourcef ] ---

	/** JNI method for {@link #alSourcef alSourcef} */
	public static native void nalSourcef(int source, int param, float value, long __functionAddress);

	/**
	 * Sets the float value of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify. One of:<p/>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param value  the parameter value
	 */
	public static void alSourcef(int source, int param, float value) {
		long __functionAddress = getInstance().alSourcef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcef(source, param, value, __functionAddress);
	}

	// --- [ alSource3f ] ---

	/** JNI method for {@link #alSource3f alSource3f} */
	public static native void nalSource3f(int source, int param, float v1, float v2, float v3, long __functionAddress);

	/**
	 * Sets the 3 dimensional values of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify. One of:<p/>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param v1     the first parameter value
	 * @param v2     the second parameter value
	 * @param v3     the third parameter value
	 */
	public static void alSource3f(int source, int param, float v1, float v2, float v3) {
		long __functionAddress = getInstance().alSource3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSource3f(source, param, v1, v2, v3, __functionAddress);
	}

	// --- [ alSourcefv ] ---

	/** JNI method for {@link #alSourcef(int, int, ByteBuffer) alSourcef} */
	public static native void nalSourcefv(int source, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alSourcef alSourcef}.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alSourcef(int source, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alSourcefv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcefv(source, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alSourcef(int, int, ByteBuffer) alSourcef} */
	public static void alSource(int source, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alSourcefv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcefv(source, param, memAddress(values), __functionAddress);
	}

	// --- [ alSourcei ] ---

	/** JNI method for {@link #alSourcei alSourcei} */
	public static native void nalSourcei(int source, int param, int value, long __functionAddress);

	/**
	 * Integer version of {@link #alSourcef alSourcef}.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alSourcei(int source, int param, int value) {
		long __functionAddress = getInstance().alSourcei;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcei(source, param, value, __functionAddress);
	}

	// --- [ alGetSourcef ] ---

	/** JNI method for {@link #alGetSourcef alGetSourcef} */
	public static native void nalGetSourcef(int source, int param, long value, long __functionAddress);

	/**
	 * Returns the float value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<p/>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param value  the parameter value
	 */
	public static void alGetSourcef(int source, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetSourcef;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetSourcef(source, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcef alGetSourcef} */
	public static void alGetSource(int source, int param, FloatBuffer value) {
		long __functionAddress = getInstance().alGetSourcef;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetSourcef(source, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetSourcef alGetSourcef} */
	public static float alGetSourcef(int source, int param) {
		long __functionAddress = getInstance().alGetSourcef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetSourcef(source, param, __buffer.address() + value, __functionAddress);
		return __buffer.floatValue(value);
	}

	// --- [ alGetSource3f ] ---

	/** JNI method for {@link #alGetSource3f alGetSource3f} */
	public static native void nalGetSource3f(int source, int param, long v1, long v2, long v3, long __functionAddress);

	/**
	 * Returns the 3 dimensional values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<p/>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param v1     the first parameter value
	 * @param v2     the second parameter value
	 * @param v3     the third parameter value
	 */
	public static void alGetSource3f(int source, int param, ByteBuffer v1, ByteBuffer v2, ByteBuffer v3) {
		long __functionAddress = getInstance().alGetSource3f;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 1 << 2);
			checkBuffer(v2, 1 << 2);
			checkBuffer(v3, 1 << 2);
		}
		nalGetSource3f(source, param, memAddress(v1), memAddress(v2), memAddress(v3), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSource3f alGetSource3f} */
	public static void alGetSource3(int source, int param, FloatBuffer v1, FloatBuffer v2, FloatBuffer v3) {
		long __functionAddress = getInstance().alGetSource3f;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 1);
			checkBuffer(v2, 1);
			checkBuffer(v3, 1);
		}
		nalGetSource3f(source, param, memAddress(v1), memAddress(v2), memAddress(v3), __functionAddress);
	}

	// --- [ alGetSourcefv ] ---

	/** JNI method for {@link #alGetSourcefv alGetSourcefv} */
	public static native void nalGetSourcefv(int source, int param, long values, long __functionAddress);

	/**
	 * Returns the float values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<p/>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param values the parameter values
	 */
	public static void alGetSourcefv(int source, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetSourcefv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetSourcefv(source, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcefv alGetSourcefv} */
	public static void alGetSourcefv(int source, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alGetSourcefv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetSourcefv(source, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetSourcei ] ---

	/** JNI method for {@link #alGetSourcei alGetSourcei} */
	public static native void nalGetSourcei(int source, int param, long value, long __functionAddress);

	/**
	 * Returns the integer value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<p/>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param value  the parameter value
	 */
	public static void alGetSourcei(int source, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetSourcei;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetSourcei(source, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetSourcei alGetSourcei} */
	public static void alGetSource(int source, int param, IntBuffer value) {
		long __functionAddress = getInstance().alGetSourcei;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetSourcei(source, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetSourcei alGetSourcei} */
	public static int alGetSourcei(int source, int param) {
		long __functionAddress = getInstance().alGetSourcei;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetSourcei(source, param, __buffer.address() + value, __functionAddress);
		return __buffer.intValue(value);
	}

	// --- [ alSourceQueueBuffers ] ---

	/** JNI method for {@link #alSourceQueueBuffers alSourceQueueBuffers} */
	public static native void nalSourceQueueBuffers(int sourceName, int numBuffers, long bufferNames, long __functionAddress);

	/**
	 * Queues up one or multiple buffer names to the specified source.
	 * <p/>
	 * The buffers will be queued in the sequence in which they appear in the array. This command is legal on a source in any playback state (to allow for
	 * streaming, queuing has to be possible on a AL_PLAYING source). All buffers in a queue must have the same format and attributes, with the exception of
	 * the NULL buffer (i.e., 0) which can always be queued.
	 *
	 * @param sourceName  the target source
	 * @param numBuffers  the number of buffers to queue
	 * @param bufferNames the buffer names
	 */
	public static void alSourceQueueBuffers(int sourceName, int numBuffers, ByteBuffer bufferNames) {
		long __functionAddress = getInstance().alSourceQueueBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(bufferNames, numBuffers << 2);
		}
		nalSourceQueueBuffers(sourceName, numBuffers, memAddress(bufferNames), __functionAddress);
	}

	/** Alternative version of: {@link #alSourceQueueBuffers alSourceQueueBuffers} */
	public static void alSourceQueueBuffers(int sourceName, IntBuffer bufferNames) {
		long __functionAddress = getInstance().alSourceQueueBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourceQueueBuffers(sourceName, bufferNames.remaining(), memAddress(bufferNames), __functionAddress);
	}

	/** Single value version of: {@link #alSourceQueueBuffers alSourceQueueBuffers} */
	public static void alSourceQueueBuffers(int sourceName, int bufferName) {
		long __functionAddress = getInstance().alSourceQueueBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int bufferNames = __buffer.intParam(bufferName);
		nalSourceQueueBuffers(sourceName, 1, __buffer.address() + bufferNames, __functionAddress);
	}

	// --- [ alSourceUnqueueBuffers ] ---

	/** JNI method for {@link #alSourceUnqueueBuffers alSourceUnqueueBuffers} */
	public static native void nalSourceUnqueueBuffers(int sourceName, int numEntries, long bufferNames, long __functionAddress);

	/**
	 * Removes a number of buffer entries that have finished processing, in the order of apperance, from the queue of the specified source.
	 * <p/>
	 * Once a queue entry for a buffer has been appended to a queue and is pending processing, it should not be changed. Removal of a given queue entry is not
	 * possible unless either the source is stopped (in which case then entire queue is considered processed), or if the queue entry has already been processed
	 * (AL_PLAYING or AL_PAUSED source). A playing source will enter the AL_STOPPED state if it completes playback of the last buffer in its queue (the same
	 * behavior as when a single buffer has been attached to a source and has finished playback).
	 *
	 * @param sourceName  the target source
	 * @param numEntries  the number of buffers to unqueue
	 * @param bufferNames the buffer names
	 */
	public static void alSourceUnqueueBuffers(int sourceName, int numEntries, ByteBuffer bufferNames) {
		long __functionAddress = getInstance().alSourceUnqueueBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(bufferNames, numEntries << 2);
		}
		nalSourceUnqueueBuffers(sourceName, numEntries, memAddress(bufferNames), __functionAddress);
	}

	/** Alternative version of: {@link #alSourceUnqueueBuffers alSourceUnqueueBuffers} */
	public static void alSourceUnqueueBuffers(int sourceName, IntBuffer bufferNames) {
		long __functionAddress = getInstance().alSourceUnqueueBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourceUnqueueBuffers(sourceName, bufferNames.remaining(), memAddress(bufferNames), __functionAddress);
	}

	/** Single value version of: {@link #alSourceUnqueueBuffers alSourceUnqueueBuffers} */
	public static void alSourceUnqueueBuffers(int sourceName, int bufferName) {
		long __functionAddress = getInstance().alSourceUnqueueBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int bufferNames = __buffer.intParam(bufferName);
		nalSourceUnqueueBuffers(sourceName, 1, __buffer.address() + bufferNames, __functionAddress);
	}

	// --- [ alSourcePlay ] ---

	/** JNI method for {@link #alSourcePlay alSourcePlay} */
	public static native void nalSourcePlay(int source, long __functionAddress);

	/**
	 * Sets the source state to AL_PLAYING.
	 * <p/>
	 * alSourcePlay applied to an AL_INITIAL source will promote the source to AL_PLAYING, thus the data found in the buffer will be fed into the processing,
	 * starting at the beginning. alSourcePlay applied to a AL_PLAYING source will restart the source from the beginning. It will not affect the configuration,
	 * and will leave the source in AL_PLAYING state, but reset the sampling offset to the beginning. alSourcePlay applied to a AL_PAUSED source will resume
	 * processing using the source state as preserved at the alSourcePause operation. alSourcePlay applied to a AL_STOPPED source will propagate it to
	 * AL_INITIAL then to AL_PLAYING immediately.
	 *
	 * @param source the source to play
	 */
	public static void alSourcePlay(int source) {
		long __functionAddress = getInstance().alSourcePlay;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcePlay(source, __functionAddress);
	}

	// --- [ alSourcePause ] ---

	/** JNI method for {@link #alSourcePause alSourcePause} */
	public static native void nalSourcePause(int source, long __functionAddress);

	/**
	 * Sets the source state to AL_PAUSED.
	 * <p/>
	 * alSourcePause applied to an AL_INITIAL source is a legal NOP. alSourcePause applied to a AL_PLAYING source will change its state to AL_PAUSED. The
	 * source is exempt from processing, its current state is preserved. alSourcePause applied to a AL_PAUSED source is a legal NOP. alSourcePause applied to a
	 * AL_STOPPED source is a legal NOP.
	 *
	 * @param source the source to pause
	 */
	public static void alSourcePause(int source) {
		long __functionAddress = getInstance().alSourcePause;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcePause(source, __functionAddress);
	}

	// --- [ alSourceStop ] ---

	/** JNI method for {@link #alSourceStop alSourceStop} */
	public static native void nalSourceStop(int source, long __functionAddress);

	/**
	 * Sets the source state to AL_STOPPED.
	 * <p/>
	 * alSourceStop applied to an AL_INITIAL source is a legal NOP. alSourceStop applied to a AL_PLAYING source will change its state to AL_STOPPED. The source
	 * is exempt from processing, its current state is preserved. alSourceStop applied to a AL_PAUSED source will change its state to AL_STOPPED, with the same
	 * consequences as on a AL_PLAYING source. alSourceStop applied to a AL_STOPPED source is a legal NOP.
	 *
	 * @param source the source to stop
	 */
	public static void alSourceStop(int source) {
		long __functionAddress = getInstance().alSourceStop;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourceStop(source, __functionAddress);
	}

	// --- [ alSourceRewind ] ---

	/** JNI method for {@link #alSourceRewind alSourceRewind} */
	public static native void nalSourceRewind(int source, long __functionAddress);

	/**
	 * Sets the source state to AL_INITIAL.
	 * <p/>
	 * alSourceRewind applied to an AL_INITIAL source is a legal NOP. alSourceRewind applied to a AL_PLAYING source will change its state to AL_STOPPED then
	 * AL_INITIAL. The source is exempt from processing: its current state is preserved, with the exception of the sampling offset, which is reset to the
	 * beginning. alSourceRewind applied to a AL_PAUSED source will change its state to AL_INITIAL, with the same consequences as on a AL_PLAYING source.
	 * alSourceRewind applied to an AL_STOPPED source promotes the source to AL_INITIAL, resetting the sampling offset to the beginning.
	 *
	 * @param source the source to rewind
	 */
	public static void alSourceRewind(int source) {
		long __functionAddress = getInstance().alSourceRewind;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourceRewind(source, __functionAddress);
	}

	// --- [ alSourcePlayv ] ---

	/** JNI method for {@link #alSourcePlay(int, ByteBuffer) alSourcePlay} */
	public static native void nalSourcePlayv(int n, long sources, long __functionAddress);

	/**
	 * Pointer version of {@link #alSourcePlay alSourcePlay}.
	 *
	 * @param n       the number of sources to play
	 * @param sources the sources to play
	 */
	public static void alSourcePlay(int n, ByteBuffer sources) {
		long __functionAddress = getInstance().alSourcePlayv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(sources, n << 2);
		}
		nalSourcePlayv(n, memAddress(sources), __functionAddress);
	}

	/** Alternative version of: {@link #alSourcePlay(int, ByteBuffer) alSourcePlay} */
	public static void alSourcePlay(IntBuffer sources) {
		long __functionAddress = getInstance().alSourcePlayv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcePlayv(sources.remaining(), memAddress(sources), __functionAddress);
	}

	// --- [ alSourcePausev ] ---

	/** JNI method for {@link #alSourcePause(int, ByteBuffer) alSourcePause} */
	public static native void nalSourcePausev(int n, long sources, long __functionAddress);

	/**
	 * Pointer version of {@link #alSourcePause alSourcePause}.
	 *
	 * @param n       the number of sources to pause
	 * @param sources the sources to pause
	 */
	public static void alSourcePause(int n, ByteBuffer sources) {
		long __functionAddress = getInstance().alSourcePausev;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcePausev(n, memAddress(sources), __functionAddress);
	}

	/** Alternative version of: {@link #alSourcePause(int, ByteBuffer) alSourcePause} */
	public static void alSourcePause(int n, IntBuffer sources) {
		long __functionAddress = getInstance().alSourcePausev;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourcePausev(n, memAddress(sources), __functionAddress);
	}

	// --- [ alSourceStopv ] ---

	/** JNI method for {@link #alSourceStop(int, ByteBuffer) alSourceStop} */
	public static native void nalSourceStopv(int n, long sources, long __functionAddress);

	/**
	 * Pointer version of {@link #alSourceStop alSourceStop}.
	 *
	 * @param n       the number of sources to stop
	 * @param sources the sources to stop
	 */
	public static void alSourceStop(int n, ByteBuffer sources) {
		long __functionAddress = getInstance().alSourceStopv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourceStopv(n, memAddress(sources), __functionAddress);
	}

	/** Alternative version of: {@link #alSourceStop(int, ByteBuffer) alSourceStop} */
	public static void alSourceStop(int n, IntBuffer sources) {
		long __functionAddress = getInstance().alSourceStopv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourceStopv(n, memAddress(sources), __functionAddress);
	}

	// --- [ alSourceRewindv ] ---

	/** JNI method for {@link #alSourceRewind(int, ByteBuffer) alSourceRewind} */
	public static native void nalSourceRewindv(int n, long sources, long __functionAddress);

	/**
	 * Pointer version of {@link #alSourceRewind alSourceRewind}.
	 *
	 * @param n       the number of sources to rewind
	 * @param sources the sources to rewind
	 */
	public static void alSourceRewind(int n, ByteBuffer sources) {
		long __functionAddress = getInstance().alSourceRewindv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourceRewindv(n, memAddress(sources), __functionAddress);
	}

	/** Alternative version of: {@link #alSourceRewind(int, ByteBuffer) alSourceRewind} */
	public static void alSourceRewind(int n, IntBuffer sources) {
		long __functionAddress = getInstance().alSourceRewindv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalSourceRewindv(n, memAddress(sources), __functionAddress);
	}

	// --- [ alGenBuffers ] ---

	/** JNI method for {@link #alGenBuffers alGenBuffers} */
	public static native void nalGenBuffers(int n, long bufferNames, long __functionAddress);

	/**
	 * Requests a number of buffer names.
	 *
	 * @param n           the number of buffer names to generate
	 * @param bufferNames the buffer that will receive the buffer names
	 */
	public static void alGenBuffers(int n, ByteBuffer bufferNames) {
		long __functionAddress = getInstance().alGenBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(bufferNames, n << 2);
		}
		nalGenBuffers(n, memAddress(bufferNames), __functionAddress);
	}

	/** Alternative version of: {@link #alGenBuffers alGenBuffers} */
	public static void alGenBuffers(IntBuffer bufferNames) {
		long __functionAddress = getInstance().alGenBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGenBuffers(bufferNames.remaining(), memAddress(bufferNames), __functionAddress);
	}

	/** Single return value version of: {@link #alGenBuffers alGenBuffers} */
	public static int alGenBuffers() {
		long __functionAddress = getInstance().alGenBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int bufferNames = __buffer.intParam();
		nalGenBuffers(1, __buffer.address() + bufferNames, __functionAddress);
		return __buffer.intValue(bufferNames);
	}

	// --- [ alDeleteBuffers ] ---

	/** JNI method for {@link #alDeleteBuffers alDeleteBuffers} */
	public static native void nalDeleteBuffers(int n, long bufferNames, long __functionAddress);

	/**
	 * Requests the deletion of a number of buffers.
	 *
	 * @param n           the number of buffers to delete
	 * @param bufferNames the buffers to delete
	 */
	public static void alDeleteBuffers(int n, ByteBuffer bufferNames) {
		long __functionAddress = getInstance().alDeleteBuffers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(bufferNames, n << 2);
		}
		nalDeleteBuffers(n, memAddress(bufferNames), __functionAddress);
	}

	/** Alternative version of: {@link #alDeleteBuffers alDeleteBuffers} */
	public static void alDeleteBuffers(IntBuffer bufferNames) {
		long __functionAddress = getInstance().alDeleteBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDeleteBuffers(bufferNames.remaining(), memAddress(bufferNames), __functionAddress);
	}

	/** Single value version of: {@link #alDeleteBuffers alDeleteBuffers} */
	public static void alDeleteBuffers(int bufferName) {
		long __functionAddress = getInstance().alDeleteBuffers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int bufferNames = __buffer.intParam(bufferName);
		nalDeleteBuffers(1, __buffer.address() + bufferNames, __functionAddress);
	}

	// --- [ alIsBuffer ] ---

	/** JNI method for {@link #alIsBuffer alIsBuffer} */
	public static native boolean nalIsBuffer(int bufferName, long __functionAddress);

	/**
	 * Verifies whether the given object name is a buffer name.
	 *
	 * @param bufferName a value that may be a buffer name
	 */
	public static boolean alIsBuffer(int bufferName) {
		long __functionAddress = getInstance().alIsBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalIsBuffer(bufferName, __functionAddress);
	}

	// --- [ alGetBufferf ] ---

	/** JNI method for {@link #alGetBufferf alGetBufferf} */
	public static native void nalGetBufferf(int bufferName, int paramName, long value, long __functionAddress);

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<p/>{@link #AL_FREQUENCY FREQUENCY}, {@link #AL_BITS BITS}, {@link #AL_CHANNELS CHANNELS}, {@link #AL_SIZE SIZE}
	 * @param value      the parameter value
	 */
	public static void alGetBufferf(int bufferName, int paramName, ByteBuffer value) {
		long __functionAddress = getInstance().alGetBufferf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetBufferf(bufferName, paramName, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetBufferf alGetBufferf} */
	public static void alGetBuffer(int bufferName, int paramName, FloatBuffer value) {
		long __functionAddress = getInstance().alGetBufferf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetBufferf(bufferName, paramName, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetBufferf alGetBufferf} */
	public static float alGetBufferf(int bufferName, int paramName) {
		long __functionAddress = getInstance().alGetBufferf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetBufferf(bufferName, paramName, __buffer.address() + value, __functionAddress);
		return __buffer.floatValue(value);
	}

	// --- [ alGetBufferi ] ---

	/** JNI method for {@link #alGetBufferi alGetBufferi} */
	public static native void nalGetBufferi(int bufferName, int paramName, long value, long __functionAddress);

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<p/>{@link #AL_FREQUENCY FREQUENCY}, {@link #AL_BITS BITS}, {@link #AL_CHANNELS CHANNELS}, {@link #AL_SIZE SIZE}
	 * @param value      the parameter value
	 */
	public static void alGetBufferi(int bufferName, int paramName, ByteBuffer value) {
		long __functionAddress = getInstance().alGetBufferi;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetBufferi(bufferName, paramName, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetBufferi alGetBufferi} */
	public static void alGetBuffer(int bufferName, int paramName, IntBuffer value) {
		long __functionAddress = getInstance().alGetBufferi;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetBufferi(bufferName, paramName, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetBufferi alGetBufferi} */
	public static int alGetBufferi(int bufferName, int paramName) {
		long __functionAddress = getInstance().alGetBufferi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetBufferi(bufferName, paramName, __buffer.address() + value, __functionAddress);
		return __buffer.intValue(value);
	}

	// --- [ alBufferData ] ---

	/** JNI method for {@link #alBufferData alBufferData} */
	public static native void nalBufferData(int bufferName, int format, long data, int size, int frequency, long __functionAddress);

	/**
	 * Sets the sample data of the given buffer.
	 * <p/>
	 * The data specified is copied to an internal software, or if possible, hardware buffer. The implementation is free to apply decompression, conversion,
	 * resampling, and filtering as needed.
	 * <p/>
	 * 8-bit data is expressed as an unsigned value over the range 0 to 255, 128 being an audio output level of zero.
	 * <p/>
	 * 16-bit data is expressed as a signed value over the range -32768 to 32767, 0 being an audio output level of zero. Byte order for 16-bit values is
	 * determined by the native format of the CPU.
	 * <p/>
	 * Stereo data is expressed in an interleaved format, left channel sample followed by the right channel sample.
	 * <p/>
	 * Buffers containing audio data with more than one channel will be played without 3D spatialization features – these formats are normally used for
	 * background music.
	 *
	 * @param bufferName the buffer to modify
	 * @param format     the data format. One of:<p/>{@link #AL_FORMAT_MONO8 FORMAT_MONO8}, {@link #AL_FORMAT_MONO16 FORMAT_MONO16}, {@link #AL_FORMAT_STEREO8 FORMAT_STEREO8}, {@link #AL_FORMAT_STEREO16 FORMAT_STEREO16}
	 * @param data       the sample data
	 * @param size       the data buffer size, in bytes
	 * @param frequency  the data frequency
	 */
	public static void alBufferData(int bufferName, int format, ByteBuffer data, int size, int frequency) {
		long __functionAddress = getInstance().alBufferData;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, size);
		}
		nalBufferData(bufferName, format, memAddress(data), size, frequency, __functionAddress);
	}

	/** ByteBuffer version of: {@link #alBufferData alBufferData} */
	public static void alBufferData(int bufferName, int format, ByteBuffer data, int frequency) {
		long __functionAddress = getInstance().alBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalBufferData(bufferName, format, memAddress(data), data.remaining(), frequency, __functionAddress);
	}

	/** ShortBuffer version of: {@link #alBufferData alBufferData} */
	public static void alBufferData(int bufferName, int format, ShortBuffer data, int frequency) {
		long __functionAddress = getInstance().alBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalBufferData(bufferName, format, memAddress(data), data.remaining() << 1, frequency, __functionAddress);
	}

	/** IntBuffer version of: {@link #alBufferData alBufferData} */
	public static void alBufferData(int bufferName, int format, IntBuffer data, int frequency) {
		long __functionAddress = getInstance().alBufferData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalBufferData(bufferName, format, memAddress(data), data.remaining() << 2, frequency, __functionAddress);
	}

	// --- [ alGetEnumValue ] ---

	/** JNI method for {@link #alGetEnumValue alGetEnumValue} */
	public static native int nalGetEnumValue(long enumName, long __functionAddress);

	/**
	 * Returns the enumeration value of the specified enum.
	 *
	 * @param enumName the enum name
	 */
	public static int alGetEnumValue(ByteBuffer enumName) {
		long __functionAddress = getInstance().alGetEnumValue;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(enumName);
		}
		return nalGetEnumValue(memAddress(enumName), __functionAddress);
	}

	/** CharSequence version of: {@link #alGetEnumValue alGetEnumValue} */
	public static int alGetEnumValue(CharSequence enumName) {
		long __functionAddress = getInstance().alGetEnumValue;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalGetEnumValue(memAddress(memEncodeASCII(enumName)), __functionAddress);
	}

	// --- [ alGetProcAddress ] ---

	/** JNI method for {@link #alGetProcAddress alGetProcAddress} */
	public static native long nalGetProcAddress(long funcName, long __functionAddress);

	/**
	 * Retrieves extension entry points.
	 * <p/>
	 * Returns NULL if no entry point with the name funcName can be found. Implementations are free to return NULL if an entry point is present, but not
	 * applicable for the current context. However the specification does not guarantee this behavior.
	 * <p/>
	 * Applications can use alGetProcAddress to obtain core API entry points, not just extensions. This is the recommended way to dynamically load and unload
	 * OpenAL DLL's as sound drivers.
	 *
	 * @param funcName the function name
	 */
	public static long alGetProcAddress(ByteBuffer funcName) {
		long __functionAddress = getInstance().alGetProcAddress;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(funcName);
		}
		return nalGetProcAddress(memAddress(funcName), __functionAddress);
	}

	/** CharSequence version of: {@link #alGetProcAddress alGetProcAddress} */
	public static long alGetProcAddress(CharSequence funcName) {
		long __functionAddress = getInstance().alGetProcAddress;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalGetProcAddress(memAddress(memEncodeASCII(funcName)), __functionAddress);
	}

	// --- [ alIsExtensionPresent ] ---

	/** JNI method for {@link #alIsExtensionPresent alIsExtensionPresent} */
	public static native boolean nalIsExtensionPresent(long extName, long __functionAddress);

	/**
	 * Verifies that a given extension is available for the current context and the device it is associated with.
	 * <p/>
	 * Invalid and unsupported string tokens return ALC_FALSE. {@code extName} is not case sensitive – the implementation will convert the name to all
	 * upper-case internally (and will express extension names in upper-case).
	 *
	 * @param extName the extension name
	 */
	public static boolean alIsExtensionPresent(ByteBuffer extName) {
		long __functionAddress = getInstance().alIsExtensionPresent;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(extName);
		}
		return nalIsExtensionPresent(memAddress(extName), __functionAddress);
	}

	/** CharSequence version of: {@link #alIsExtensionPresent alIsExtensionPresent} */
	public static boolean alIsExtensionPresent(CharSequence extName) {
		long __functionAddress = getInstance().alIsExtensionPresent;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalIsExtensionPresent(memAddress(memEncodeASCII(extName)), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return AL.getCapabilities().__AL10;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenAL10") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.alGetError != 0L &&
			funcs.alEnable != 0L &&
			funcs.alDisable != 0L &&
			funcs.alIsEnabled != 0L &&
			funcs.alGetBoolean != 0L &&
			funcs.alGetInteger != 0L &&
			funcs.alGetFloat != 0L &&
			funcs.alGetDouble != 0L &&
			funcs.alGetBooleanv != 0L &&
			funcs.alGetIntegerv != 0L &&
			funcs.alGetFloatv != 0L &&
			funcs.alGetDoublev != 0L &&
			funcs.alGetString != 0L &&
			funcs.alDistanceModel != 0L &&
			funcs.alDopplerFactor != 0L &&
			funcs.alDopplerVelocity != 0L &&
			funcs.alListenerf != 0L &&
			funcs.alListeneri != 0L &&
			funcs.alListener3f != 0L &&
			funcs.alListenerfv != 0L &&
			funcs.alGetListenerf != 0L &&
			funcs.alGetListeneri != 0L &&
			funcs.alGetListener3f != 0L &&
			funcs.alGetListenerfv != 0L &&
			funcs.alGenSources != 0L &&
			funcs.alDeleteSources != 0L &&
			funcs.alIsSource != 0L &&
			funcs.alSourcef != 0L &&
			funcs.alSource3f != 0L &&
			funcs.alSourcefv != 0L &&
			funcs.alSourcei != 0L &&
			funcs.alGetSourcef != 0L &&
			funcs.alGetSource3f != 0L &&
			funcs.alGetSourcefv != 0L &&
			funcs.alGetSourcei != 0L &&
			funcs.alSourceQueueBuffers != 0L &&
			funcs.alSourceUnqueueBuffers != 0L &&
			funcs.alSourcePlay != 0L &&
			funcs.alSourcePause != 0L &&
			funcs.alSourceStop != 0L &&
			funcs.alSourceRewind != 0L &&
			funcs.alSourcePlayv != 0L &&
			funcs.alSourcePausev != 0L &&
			funcs.alSourceStopv != 0L &&
			funcs.alSourceRewindv != 0L &&
			funcs.alGenBuffers != 0L &&
			funcs.alDeleteBuffers != 0L &&
			funcs.alIsBuffer != 0L &&
			funcs.alGetBufferf != 0L &&
			funcs.alGetBufferi != 0L &&
			funcs.alBufferData != 0L &&
			funcs.alGetEnumValue != 0L &&
			funcs.alGetProcAddress != 0L &&
			funcs.alIsExtensionPresent != 0L;

		return AL.checkExtension("OpenAL10", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code AL10}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long
			alGetError,
			alEnable,
			alDisable,
			alIsEnabled,
			alGetBoolean,
			alGetInteger,
			alGetFloat,
			alGetDouble,
			alGetBooleanv,
			alGetIntegerv,
			alGetFloatv,
			alGetDoublev,
			alGetString,
			alDistanceModel,
			alDopplerFactor,
			alDopplerVelocity,
			alListenerf,
			alListeneri,
			alListener3f,
			alListenerfv,
			alGetListenerf,
			alGetListeneri,
			alGetListener3f,
			alGetListenerfv,
			alGenSources,
			alDeleteSources,
			alIsSource,
			alSourcef,
			alSource3f,
			alSourcefv,
			alSourcei,
			alGetSourcef,
			alGetSource3f,
			alGetSourcefv,
			alGetSourcei,
			alSourceQueueBuffers,
			alSourceUnqueueBuffers,
			alSourcePlay,
			alSourcePause,
			alSourceStop,
			alSourceRewind,
			alSourcePlayv,
			alSourcePausev,
			alSourceStopv,
			alSourceRewindv,
			alGenBuffers,
			alDeleteBuffers,
			alIsBuffer,
			alGetBufferf,
			alGetBufferi,
			alBufferData,
			alGetEnumValue,
			alGetProcAddress,
			alIsExtensionPresent;

		public Functions(FunctionProvider provider) {
			alGetError = provider.getFunctionAddress("alGetError");
			alEnable = provider.getFunctionAddress("alEnable");
			alDisable = provider.getFunctionAddress("alDisable");
			alIsEnabled = provider.getFunctionAddress("alIsEnabled");
			alGetBoolean = provider.getFunctionAddress("alGetBoolean");
			alGetInteger = provider.getFunctionAddress("alGetInteger");
			alGetFloat = provider.getFunctionAddress("alGetFloat");
			alGetDouble = provider.getFunctionAddress("alGetDouble");
			alGetBooleanv = provider.getFunctionAddress("alGetBooleanv");
			alGetIntegerv = provider.getFunctionAddress("alGetIntegerv");
			alGetFloatv = provider.getFunctionAddress("alGetFloatv");
			alGetDoublev = provider.getFunctionAddress("alGetDoublev");
			alGetString = provider.getFunctionAddress("alGetString");
			alDistanceModel = provider.getFunctionAddress("alDistanceModel");
			alDopplerFactor = provider.getFunctionAddress("alDopplerFactor");
			alDopplerVelocity = provider.getFunctionAddress("alDopplerVelocity");
			alListenerf = provider.getFunctionAddress("alListenerf");
			alListeneri = provider.getFunctionAddress("alListeneri");
			alListener3f = provider.getFunctionAddress("alListener3f");
			alListenerfv = provider.getFunctionAddress("alListenerfv");
			alGetListenerf = provider.getFunctionAddress("alGetListenerf");
			alGetListeneri = provider.getFunctionAddress("alGetListeneri");
			alGetListener3f = provider.getFunctionAddress("alGetListener3f");
			alGetListenerfv = provider.getFunctionAddress("alGetListenerfv");
			alGenSources = provider.getFunctionAddress("alGenSources");
			alDeleteSources = provider.getFunctionAddress("alDeleteSources");
			alIsSource = provider.getFunctionAddress("alIsSource");
			alSourcef = provider.getFunctionAddress("alSourcef");
			alSource3f = provider.getFunctionAddress("alSource3f");
			alSourcefv = provider.getFunctionAddress("alSourcefv");
			alSourcei = provider.getFunctionAddress("alSourcei");
			alGetSourcef = provider.getFunctionAddress("alGetSourcef");
			alGetSource3f = provider.getFunctionAddress("alGetSource3f");
			alGetSourcefv = provider.getFunctionAddress("alGetSourcefv");
			alGetSourcei = provider.getFunctionAddress("alGetSourcei");
			alSourceQueueBuffers = provider.getFunctionAddress("alSourceQueueBuffers");
			alSourceUnqueueBuffers = provider.getFunctionAddress("alSourceUnqueueBuffers");
			alSourcePlay = provider.getFunctionAddress("alSourcePlay");
			alSourcePause = provider.getFunctionAddress("alSourcePause");
			alSourceStop = provider.getFunctionAddress("alSourceStop");
			alSourceRewind = provider.getFunctionAddress("alSourceRewind");
			alSourcePlayv = provider.getFunctionAddress("alSourcePlayv");
			alSourcePausev = provider.getFunctionAddress("alSourcePausev");
			alSourceStopv = provider.getFunctionAddress("alSourceStopv");
			alSourceRewindv = provider.getFunctionAddress("alSourceRewindv");
			alGenBuffers = provider.getFunctionAddress("alGenBuffers");
			alDeleteBuffers = provider.getFunctionAddress("alDeleteBuffers");
			alIsBuffer = provider.getFunctionAddress("alIsBuffer");
			alGetBufferf = provider.getFunctionAddress("alGetBufferf");
			alGetBufferi = provider.getFunctionAddress("alGetBufferi");
			alBufferData = provider.getFunctionAddress("alBufferData");
			alGetEnumValue = provider.getFunctionAddress("alGetEnumValue");
			alGetProcAddress = provider.getFunctionAddress("alGetProcAddress");
			alIsExtensionPresent = provider.getFunctionAddress("alIsExtensionPresent");
		}

	}

}