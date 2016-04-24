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

/** Native bindings to AL 1.0 functionality. */
public class AL10 {

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
	public static final int AL_ORIENTATION = 0x100F;

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

	protected AL10() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(ALCapabilities caps) {
		return checkFunctions(
			caps.alGetError, caps.alEnable, caps.alDisable, caps.alIsEnabled, caps.alGetBoolean, caps.alGetInteger, caps.alGetFloat, caps.alGetDouble, 
			caps.alGetBooleanv, caps.alGetIntegerv, caps.alGetFloatv, caps.alGetDoublev, caps.alGetString, caps.alDistanceModel, caps.alDopplerFactor, 
			caps.alDopplerVelocity, caps.alListenerf, caps.alListeneri, caps.alListener3f, caps.alListenerfv, caps.alGetListenerf, caps.alGetListeneri, 
			caps.alGetListener3f, caps.alGetListenerfv, caps.alGenSources, caps.alDeleteSources, caps.alIsSource, caps.alSourcef, caps.alSource3f, 
			caps.alSourcefv, caps.alSourcei, caps.alGetSourcef, caps.alGetSource3f, caps.alGetSourcefv, caps.alGetSourcei, caps.alGetSourceiv, 
			caps.alSourceQueueBuffers, caps.alSourceUnqueueBuffers, caps.alSourcePlay, caps.alSourcePause, caps.alSourceStop, caps.alSourceRewind, 
			caps.alSourcePlayv, caps.alSourcePausev, caps.alSourceStopv, caps.alSourceRewindv, caps.alGenBuffers, caps.alDeleteBuffers, caps.alIsBuffer, 
			caps.alGetBufferf, caps.alGetBufferi, caps.alBufferData, caps.alGetEnumValue, caps.alGetProcAddress, caps.alIsExtensionPresent
		);
	}

	// --- [ alGetError ] ---

	/**
	 * Obtains error information.
	 * 
	 * <p>Each detectable error is assigned a numeric code. When an error is detected by AL, a flag is set and the error code is recorded. Further errors, if they
	 * occur, do not affect this recorded code. When alGetError is called, the code is returned and the flag is cleared, so that a further error will again
	 * record its code. If a call to alGetError returns AL_NO_ERROR then there has been no detectable error since the last call to alGetError (or since the AL
	 * was initialized).</p>
	 * 
	 * <p>Error codes can be mapped to strings. The alGetString function returns a pointer to a constant (literal) string that is identical to the identifier used
	 * for the enumeration value, as defined in the specification.</p>
	 */
	public static int alGetError() {
		long __functionAddress = AL.getCapabilities().alGetError;
		return invokeI(__functionAddress);
	}

	// --- [ alEnable ] ---

	/**
	 * Enables AL capabilities.
	 *
	 * @param target the capability to enable
	 */
	public static void alEnable(int target) {
		long __functionAddress = AL.getCapabilities().alEnable;
		invokeV(__functionAddress, target);
	}

	// --- [ alDisable ] ---

	/**
	 * Disables AL capabilities.
	 *
	 * @param target the capability to disable
	 */
	public static void alDisable(int target) {
		long __functionAddress = AL.getCapabilities().alDisable;
		invokeV(__functionAddress, target);
	}

	// --- [ alIsEnabled ] ---

	/**
	 * Queries whether a given capability is currently enabled or not.
	 *
	 * @param target the capability to query
	 */
	public static boolean alIsEnabled(int target) {
		long __functionAddress = AL.getCapabilities().alIsEnabled;
		return invokeZ(__functionAddress, target);
	}

	// --- [ alGetBoolean ] ---

	/**
	 * Returns the boolean value of the specified parameter.
	 *
	 * @param paramName the parameter to query
	 */
	public static boolean alGetBoolean(int paramName) {
		long __functionAddress = AL.getCapabilities().alGetBoolean;
		return invokeZ(__functionAddress, paramName);
	}

	// --- [ alGetInteger ] ---

	/**
	 * Returns the integer value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}</td><td>{@link #AL_DISTANCE_MODEL DISTANCE_MODEL}</td><td>{@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}</td></tr></table>
	 */
	public static int alGetInteger(int paramName) {
		long __functionAddress = AL.getCapabilities().alGetInteger;
		return invokeI(__functionAddress, paramName);
	}

	// --- [ alGetFloat ] ---

	/**
	 * Returns the float value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}</td><td>{@link #AL_DISTANCE_MODEL DISTANCE_MODEL}</td><td>{@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}</td></tr></table>
	 */
	public static float alGetFloat(int paramName) {
		long __functionAddress = AL.getCapabilities().alGetFloat;
		return invokeF(__functionAddress, paramName);
	}

	// --- [ alGetDouble ] ---

	/**
	 * Returns the double value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}</td><td>{@link #AL_DISTANCE_MODEL DISTANCE_MODEL}</td><td>{@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}</td></tr></table>
	 */
	public static double alGetDouble(int paramName) {
		long __functionAddress = AL.getCapabilities().alGetDouble;
		return invokeD(__functionAddress, paramName);
	}

	// --- [ alGetBooleanv ] ---

	/**
	 * Pointer version of {@link #alGetBoolean GetBoolean}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void nalGetBooleanv(int paramName, long dest) {
		long __functionAddress = AL.getCapabilities().alGetBooleanv;
		invokePV(__functionAddress, paramName, dest);
	}

	/**
	 * Pointer version of {@link #alGetBoolean GetBoolean}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetBooleanv(int paramName, ByteBuffer dest) {
		if ( CHECKS )
			checkBuffer(dest, 1);
		nalGetBooleanv(paramName, memAddress(dest));
	}

	// --- [ alGetIntegerv ] ---

	/**
	 * Pointer version of {@link #alGetInteger GetInteger}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void nalGetIntegerv(int paramName, long dest) {
		long __functionAddress = AL.getCapabilities().alGetIntegerv;
		invokePV(__functionAddress, paramName, dest);
	}

	/**
	 * Pointer version of {@link #alGetInteger GetInteger}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetIntegerv(int paramName, IntBuffer dest) {
		if ( CHECKS )
			checkBuffer(dest, 1);
		nalGetIntegerv(paramName, memAddress(dest));
	}

	// --- [ alGetFloatv ] ---

	/**
	 * Pointer version of {@link #alGetFloat GetFloat}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void nalGetFloatv(int paramName, long dest) {
		long __functionAddress = AL.getCapabilities().alGetFloatv;
		invokePV(__functionAddress, paramName, dest);
	}

	/**
	 * Pointer version of {@link #alGetFloat GetFloat}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetFloatv(int paramName, FloatBuffer dest) {
		if ( CHECKS )
			checkBuffer(dest, 1);
		nalGetFloatv(paramName, memAddress(dest));
	}

	// --- [ alGetDoublev ] ---

	/**
	 * Pointer version of {@link #alGetDouble GetDouble}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void nalGetDoublev(int paramName, long dest) {
		long __functionAddress = AL.getCapabilities().alGetDoublev;
		invokePV(__functionAddress, paramName, dest);
	}

	/**
	 * Pointer version of {@link #alGetDouble GetDouble}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetDoublev(int paramName, DoubleBuffer dest) {
		if ( CHECKS )
			checkBuffer(dest, 1);
		nalGetDoublev(paramName, memAddress(dest));
	}

	// --- [ alGetString ] ---

	/**
	 * Returns the string value of the specified parameter
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_VENDOR VENDOR}</td><td>{@link #AL_VERSION VERSION}</td><td>{@link #AL_RENDERER RENDERER}</td><td>{@link #AL_EXTENSIONS EXTENSIONS}</td></tr></table>
	 */
	public static long nalGetString(int paramName) {
		long __functionAddress = AL.getCapabilities().alGetString;
		return invokeP(__functionAddress, paramName);
	}

	/**
	 * Returns the string value of the specified parameter
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_VENDOR VENDOR}</td><td>{@link #AL_VERSION VERSION}</td><td>{@link #AL_RENDERER RENDERER}</td><td>{@link #AL_EXTENSIONS EXTENSIONS}</td></tr></table>
	 */
	public static String alGetString(int paramName) {
		long __result = nalGetString(paramName);
		return memUTF8(__result);
	}

	// --- [ alDistanceModel ] ---

	/**
	 * Sets the distance attenuation model.
	 * 
	 * <p>Samples usually use the entire dynamic range of the chosen format/encoding, independent of their real world intensity. For example, a jet engine and a
	 * clockwork both will have samples with full amplitude. The application will then have to adjust source gain accordingly to account for relative differences.</p>
	 * 
	 * <p>Source gain is then attenuated by distance. The effective attenuation of a source depends on many factors, among which distance attenuation and source
	 * and listener gain are only some of the contributing factors. Even if the source and listener gain exceed 1.0 (amplification beyond the guaranteed
	 * dynamic range), distance and other attenuation might ultimately limit the overall gain to a value below 1.0.</p>
	 * 
	 * <p>OpenAL currently supports three modes of operation with respect to distance attenuation, including one that is similar to the IASIG I3DL2 model. The
	 * application can choose one of these models (or chooses to disable distance-dependent attenuation) on a per-context basis.</p>
	 *
	 * @param modelName the distance attenuation model to set. One of:<br><table><tr><td>{@link #AL_INVERSE_DISTANCE INVERSE_DISTANCE}</td><td>{@link #AL_INVERSE_DISTANCE_CLAMPED INVERSE_DISTANCE_CLAMPED}</td><td>{@link AL11#AL_LINEAR_DISTANCE LINEAR_DISTANCE}</td><td>{@link AL11#AL_LINEAR_DISTANCE_CLAMPED LINEAR_DISTANCE_CLAMPED}</td></tr><tr><td>{@link AL11#AL_EXPONENT_DISTANCE EXPONENT_DISTANCE}</td><td>{@link AL11#AL_EXPONENT_DISTANCE_CLAMPED EXPONENT_DISTANCE_CLAMPED}</td><td>{@link #AL_NONE NONE}</td></tr></table>
	 */
	public static void alDistanceModel(int modelName) {
		long __functionAddress = AL.getCapabilities().alDistanceModel;
		invokeV(__functionAddress, modelName);
	}

	// --- [ alDopplerFactor ] ---

	/**
	 * Sets the doppler effect factor.
	 * 
	 * <p>The Doppler Effect depends on the velocities of source and listener relative to the medium, and the propagation speed of sound in that medium. The
	 * application might want to emphasize or de-emphasize the Doppler Effect as physically accurate calculation might not give the desired results. The amount
	 * of frequency shift (pitch change) is proportional to the speed of listener and source along their line of sight. The Doppler Effect as implemented by
	 * OpenAL is described by the formula below. Effects of the medium (air, water) moving with respect to listener and source are ignored.</p>
	 * 
	 * <pre><code>SS: AL_SPEED_OF_SOUND = speed of sound (default value 343.3)
DF: AL_DOPPLER_FACTOR = Doppler factor (default 1.0)
vls: Listener velocity scalar (scalar, projected on source-to-listener vector)
vss: Source velocity scalar (scalar, projected on source-to-listener vector)
f: Frequency of sample
f': effective Doppler shifted frequency

3D Mathematical representation of vls and vss:

Mag(vector) = sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z)
DotProduct(v1, v2) = (v1.x * v2.x + v1.y * v2.y + v1.z * v2.z)

SL = source to listener vector
SV = Source velocity vector
LV = Listener velocity vector

vls = DotProduct(SL, LV) / Mag(SL)
vss = DotProduct(SL, SV) / Mag(SL)

Dopper Calculation:

vss = min(vss, SS / DF)
vls = min(vls, SS / DF)

f' = f * (SS - DF * vls) / (SS - DF * vss)</code></pre>
	 * 
	 * <p>The {@code dopplerFactor} is a simple scaling of source and listener velocities to exaggerate or deemphasize the Doppler (pitch) shift resulting from
	 * the calculation.</p>
	 *
	 * @param dopplerFactor the doppler factor
	 */
	public static void alDopplerFactor(float dopplerFactor) {
		long __functionAddress = AL.getCapabilities().alDopplerFactor;
		invokeV(__functionAddress, dopplerFactor);
	}

	// --- [ alDopplerVelocity ] ---

	/**
	 * Sets the doppler effect propagation velocity.
	 * 
	 * <p>The OpenAL 1.1 Doppler implementation is different than that of OpenAL 1.0, because the older implementation was confusing and not implemented
	 * consistently. The new "speed of sound" property makes the 1.1 implementation more intuitive than the old implementation. If your implementation wants to
	 * support the AL_DOPPLER_VELOCITY parameter (the alDopplerVelocity call will remain as an entry point so that 1.0 applications can link with a 1.1
	 * library), the above formula can be changed to the following:</p>
	 * 
	 * <pre><code>vss = min(vss, (SS * DV)/DF)
vls = min(vls, (SS * DV)/DF)

f' = f * (SS * DV - DF*vls) / (SS * DV - DF * vss)</code></pre>
	 * 
	 * <p>OpenAL 1.1 programmers would never use AL_DOPPLER_VELOCITY (which defaults to 1.0).</p>
	 *
	 * @param dopplerVelocity the doppler velocity
	 */
	public static void alDopplerVelocity(float dopplerVelocity) {
		long __functionAddress = AL.getCapabilities().alDopplerVelocity;
		invokeV(__functionAddress, dopplerVelocity);
	}

	// --- [ alListenerf ] ---

	/**
	 * Sets the float value of a listener parameter.
	 *
	 * @param paramName the parameter to modify. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param value     the parameter value
	 */
	public static void alListenerf(int paramName, float value) {
		long __functionAddress = AL.getCapabilities().alListenerf;
		invokeV(__functionAddress, paramName, value);
	}

	// --- [ alListeneri ] ---

	/**
	 * Integer version of {@link #alListenerf Listenerf}.
	 *
	 * @param paramName the parameter to modify. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param values    the parameter value
	 */
	public static void alListeneri(int paramName, int values) {
		long __functionAddress = AL.getCapabilities().alListeneri;
		invokeV(__functionAddress, paramName, values);
	}

	// --- [ alListener3f ] ---

	/**
	 * Sets the 3 dimensional float values of a listener parameter.
	 *
	 * @param paramName the parameter to modify. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param value1    the first value
	 * @param value2    the second value
	 * @param value3    the third value
	 */
	public static void alListener3f(int paramName, float value1, float value2, float value3) {
		long __functionAddress = AL.getCapabilities().alListener3f;
		invokeV(__functionAddress, paramName, value1, value2, value3);
	}

	// --- [ alListenerfv ] ---

	/**
	 * Pointer version of {@link #alListenerf Listenerf}.
	 *
	 * @param paramName the parameter to modify
	 * @param values    the parameter values
	 */
	public static void nalListenerfv(int paramName, long values) {
		long __functionAddress = AL.getCapabilities().alListenerfv;
		invokePV(__functionAddress, paramName, values);
	}

	/**
	 * Pointer version of {@link #alListenerf Listenerf}.
	 *
	 * @param paramName the parameter to modify
	 * @param values    the parameter values
	 */
	public static void alListenerfv(int paramName, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalListenerfv(paramName, memAddress(values));
	}

	// --- [ alGetListenerf ] ---

	/**
	 * Returns the float value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param value     the parameter value
	 */
	public static void nalGetListenerf(int paramName, long value) {
		long __functionAddress = AL.getCapabilities().alGetListenerf;
		invokePV(__functionAddress, paramName, value);
	}

	/**
	 * Returns the float value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param value     the parameter value
	 */
	public static void alGetListenerf(int paramName, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetListenerf(paramName, memAddress(value));
	}

	/**
	 * Returns the float value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 */
	public static float alGetListenerf(int paramName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer value = stack.callocFloat(1);
			nalGetListenerf(paramName, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetListeneri ] ---

	/**
	 * Returns the integer value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param value     the parameter value
	 */
	public static void nalGetListeneri(int paramName, long value) {
		long __functionAddress = AL.getCapabilities().alGetListeneri;
		invokePV(__functionAddress, paramName, value);
	}

	/**
	 * Returns the integer value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param value     the parameter value
	 */
	public static void alGetListeneri(int paramName, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetListeneri(paramName, memAddress(value));
	}

	/**
	 * Returns the integer value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 */
	public static int alGetListeneri(int paramName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer value = stack.callocInt(1);
			nalGetListeneri(paramName, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetListener3f ] ---

	/**
	 * Returns the 3 dimensional values of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param value1    the first parameter value
	 * @param value2    the second parameter value
	 * @param value3    the third parameter value
	 */
	public static void nalGetListener3f(int paramName, long value1, long value2, long value3) {
		long __functionAddress = AL.getCapabilities().alGetListener3f;
		invokePPPV(__functionAddress, paramName, value1, value2, value3);
	}

	/**
	 * Returns the 3 dimensional values of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param value1    the first parameter value
	 * @param value2    the second parameter value
	 * @param value3    the third parameter value
	 */
	public static void alGetListener3f(int paramName, FloatBuffer value1, FloatBuffer value2, FloatBuffer value3) {
		if ( CHECKS ) {
			checkBuffer(value1, 1);
			checkBuffer(value2, 1);
			checkBuffer(value3, 1);
		}
		nalGetListener3f(paramName, memAddress(value1), memAddress(value2), memAddress(value3));
	}

	// --- [ alGetListenerfv ] ---

	/**
	 * Returns float values of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param values    the parameter values
	 */
	public static void nalGetListenerfv(int paramName, long values) {
		long __functionAddress = AL.getCapabilities().alGetListenerfv;
		invokePV(__functionAddress, paramName, values);
	}

	/**
	 * Returns float values of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br><table><tr><td>{@link #AL_ORIENTATION ORIENTATION}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td></tr></table>
	 * @param values    the parameter values
	 */
	public static void alGetListenerfv(int paramName, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetListenerfv(paramName, memAddress(values));
	}

	// --- [ alGenSources ] ---

	/**
	 * Requests a number of source names.
	 *
	 * @param n        the number of source names to generated
	 * @param srcNames the buffer that will receive the source names
	 */
	public static void nalGenSources(int n, long srcNames) {
		long __functionAddress = AL.getCapabilities().alGenSources;
		invokePV(__functionAddress, n, srcNames);
	}

	/**
	 * Requests a number of source names.
	 *
	 * @param srcNames the buffer that will receive the source names
	 */
	public static void alGenSources(IntBuffer srcNames) {
		nalGenSources(srcNames.remaining(), memAddress(srcNames));
	}

	/** Requests a number of source names. */
	public static int alGenSources() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer srcNames = stack.callocInt(1);
			nalGenSources(1, memAddress(srcNames));
			return srcNames.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alDeleteSources ] ---

	/**
	 * Requests the deletion of a number of sources.
	 *
	 * @param n       the number of sources to delete
	 * @param sources the sources to delete
	 */
	public static void nalDeleteSources(int n, long sources) {
		long __functionAddress = AL.getCapabilities().alDeleteSources;
		invokePV(__functionAddress, n, sources);
	}

	/**
	 * Requests the deletion of a number of sources.
	 *
	 * @param sources the sources to delete
	 */
	public static void alDeleteSources(IntBuffer sources) {
		nalDeleteSources(sources.remaining(), memAddress(sources));
	}

	/** Requests the deletion of a number of sources. */
	public static void alDeleteSources(int source) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer sources = stack.ints(source);
			nalDeleteSources(1, memAddress(sources));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alIsSource ] ---

	/**
	 * Verifies whether the specified object name is a source name.
	 *
	 * @param sourceName a value that may be a source name
	 */
	public static boolean alIsSource(int sourceName) {
		long __functionAddress = AL.getCapabilities().alIsSource;
		return invokeZ(__functionAddress, sourceName);
	}

	// --- [ alSourcef ] ---

	/**
	 * Sets the float value of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param value  the parameter value
	 */
	public static void alSourcef(int source, int param, float value) {
		long __functionAddress = AL.getCapabilities().alSourcef;
		invokeV(__functionAddress, source, param, value);
	}

	// --- [ alSource3f ] ---

	/**
	 * Sets the 3 dimensional values of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param v1     the first parameter value
	 * @param v2     the second parameter value
	 * @param v3     the third parameter value
	 */
	public static void alSource3f(int source, int param, float v1, float v2, float v3) {
		long __functionAddress = AL.getCapabilities().alSource3f;
		invokeV(__functionAddress, source, param, v1, v2, v3);
	}

	// --- [ alSourcefv ] ---

	/**
	 * Pointer version of {@link #alSourcef Sourcef}.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void nalSourcefv(int source, int param, long values) {
		long __functionAddress = AL.getCapabilities().alSourcefv;
		invokePV(__functionAddress, source, param, values);
	}

	/**
	 * Pointer version of {@link #alSourcef Sourcef}.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alSourcefv(int source, int param, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalSourcefv(source, param, memAddress(values));
	}

	// --- [ alSourcei ] ---

	/**
	 * Integer version of {@link #alSourcef Sourcef}.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alSourcei(int source, int param, int value) {
		long __functionAddress = AL.getCapabilities().alSourcei;
		invokeV(__functionAddress, source, param, value);
	}

	// --- [ alGetSourcef ] ---

	/**
	 * Returns the float value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param value  the parameter value
	 */
	public static void nalGetSourcef(int source, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetSourcef;
		invokePV(__functionAddress, source, param, value);
	}

	/**
	 * Returns the float value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param value  the parameter value
	 */
	public static void alGetSourcef(int source, int param, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetSourcef(source, param, memAddress(value));
	}

	/**
	 * Returns the float value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 */
	public static float alGetSourcef(int source, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer value = stack.callocFloat(1);
			nalGetSourcef(source, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetSource3f ] ---

	/**
	 * Returns the 3 dimensional values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param v1     the first parameter value
	 * @param v2     the second parameter value
	 * @param v3     the third parameter value
	 */
	public static void nalGetSource3f(int source, int param, long v1, long v2, long v3) {
		long __functionAddress = AL.getCapabilities().alGetSource3f;
		invokePPPV(__functionAddress, source, param, v1, v2, v3);
	}

	/**
	 * Returns the 3 dimensional values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param v1     the first parameter value
	 * @param v2     the second parameter value
	 * @param v3     the third parameter value
	 */
	public static void alGetSource3f(int source, int param, FloatBuffer v1, FloatBuffer v2, FloatBuffer v3) {
		if ( CHECKS ) {
			checkBuffer(v1, 1);
			checkBuffer(v2, 1);
			checkBuffer(v3, 1);
		}
		nalGetSource3f(source, param, memAddress(v1), memAddress(v2), memAddress(v3));
	}

	// --- [ alGetSourcefv ] ---

	/**
	 * Returns the float values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param values the parameter values
	 */
	public static void nalGetSourcefv(int source, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetSourcefv;
		invokePV(__functionAddress, source, param, values);
	}

	/**
	 * Returns the float values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param values the parameter values
	 */
	public static void alGetSourcefv(int source, int param, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetSourcefv(source, param, memAddress(values));
	}

	// --- [ alGetSourcei ] ---

	/**
	 * Returns the integer value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param value  the parameter value
	 */
	public static void nalGetSourcei(int source, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetSourcei;
		invokePV(__functionAddress, source, param, value);
	}

	/**
	 * Returns the integer value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param value  the parameter value
	 */
	public static void alGetSourcei(int source, int param, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetSourcei(source, param, memAddress(value));
	}

	/**
	 * Returns the integer value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 */
	public static int alGetSourcei(int source, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer value = stack.callocInt(1);
			nalGetSourcei(source, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetSourceiv ] ---

	/**
	 * Returns the integer values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param values the parameter values
	 */
	public static void nalGetSourceiv(int source, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetSourceiv;
		invokePV(__functionAddress, source, param, values);
	}

	/**
	 * Returns the integer values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br><table><tr><td>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}</td><td>{@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}</td><td>{@link #AL_PITCH PITCH}</td><td>{@link #AL_DIRECTION DIRECTION}</td><td>{@link #AL_LOOPING LOOPING}</td><td>{@link #AL_BUFFER BUFFER}</td><td>{@link #AL_SOURCE_STATE SOURCE_STATE}</td></tr><tr><td>{@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}</td><td>{@link #AL_SOURCE_TYPE SOURCE_TYPE}</td><td>{@link #AL_POSITION POSITION}</td><td>{@link #AL_VELOCITY VELOCITY}</td><td>{@link #AL_GAIN GAIN}</td><td>{@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}</td><td>{@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}</td></tr><tr><td>{@link #AL_MAX_DISTANCE MAX_DISTANCE}</td></tr></table>
	 * @param values the parameter values
	 */
	public static void alGetSourceiv(int source, int param, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetSourceiv(source, param, memAddress(values));
	}

	// --- [ alSourceQueueBuffers ] ---

	/**
	 * Queues up one or multiple buffer names to the specified source.
	 * 
	 * <p>The buffers will be queued in the sequence in which they appear in the array. This command is legal on a source in any playback state (to allow for
	 * streaming, queuing has to be possible on a AL_PLAYING source). All buffers in a queue must have the same format and attributes, with the exception of
	 * the {@code NULL} buffer (i.e., 0) which can always be queued.</p>
	 *
	 * @param sourceName  the target source
	 * @param numBuffers  the number of buffers to queue
	 * @param bufferNames the buffer names
	 */
	public static void nalSourceQueueBuffers(int sourceName, int numBuffers, long bufferNames) {
		long __functionAddress = AL.getCapabilities().alSourceQueueBuffers;
		invokePV(__functionAddress, sourceName, numBuffers, bufferNames);
	}

	/**
	 * Queues up one or multiple buffer names to the specified source.
	 * 
	 * <p>The buffers will be queued in the sequence in which they appear in the array. This command is legal on a source in any playback state (to allow for
	 * streaming, queuing has to be possible on a AL_PLAYING source). All buffers in a queue must have the same format and attributes, with the exception of
	 * the {@code NULL} buffer (i.e., 0) which can always be queued.</p>
	 *
	 * @param sourceName  the target source
	 * @param bufferNames the buffer names
	 */
	public static void alSourceQueueBuffers(int sourceName, IntBuffer bufferNames) {
		nalSourceQueueBuffers(sourceName, bufferNames.remaining(), memAddress(bufferNames));
	}

	/**
	 * Queues up one or multiple buffer names to the specified source.
	 * 
	 * <p>The buffers will be queued in the sequence in which they appear in the array. This command is legal on a source in any playback state (to allow for
	 * streaming, queuing has to be possible on a AL_PLAYING source). All buffers in a queue must have the same format and attributes, with the exception of
	 * the {@code NULL} buffer (i.e., 0) which can always be queued.</p>
	 *
	 * @param sourceName the target source
	 */
	public static void alSourceQueueBuffers(int sourceName, int bufferName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer bufferNames = stack.ints(bufferName);
			nalSourceQueueBuffers(sourceName, 1, memAddress(bufferNames));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alSourceUnqueueBuffers ] ---

	/**
	 * Removes a number of buffer entries that have finished processing, in the order of apperance, from the queue of the specified source.
	 * 
	 * <p>Once a queue entry for a buffer has been appended to a queue and is pending processing, it should not be changed. Removal of a given queue entry is not
	 * possible unless either the source is stopped (in which case then entire queue is considered processed), or if the queue entry has already been processed
	 * (AL_PLAYING or AL_PAUSED source). A playing source will enter the AL_STOPPED state if it completes playback of the last buffer in its queue (the same
	 * behavior as when a single buffer has been attached to a source and has finished playback).</p>
	 *
	 * @param sourceName  the target source
	 * @param numEntries  the number of buffers to unqueue
	 * @param bufferNames the buffer names
	 */
	public static void nalSourceUnqueueBuffers(int sourceName, int numEntries, long bufferNames) {
		long __functionAddress = AL.getCapabilities().alSourceUnqueueBuffers;
		invokePV(__functionAddress, sourceName, numEntries, bufferNames);
	}

	/**
	 * Removes a number of buffer entries that have finished processing, in the order of apperance, from the queue of the specified source.
	 * 
	 * <p>Once a queue entry for a buffer has been appended to a queue and is pending processing, it should not be changed. Removal of a given queue entry is not
	 * possible unless either the source is stopped (in which case then entire queue is considered processed), or if the queue entry has already been processed
	 * (AL_PLAYING or AL_PAUSED source). A playing source will enter the AL_STOPPED state if it completes playback of the last buffer in its queue (the same
	 * behavior as when a single buffer has been attached to a source and has finished playback).</p>
	 *
	 * @param sourceName  the target source
	 * @param bufferNames the buffer names
	 */
	public static void alSourceUnqueueBuffers(int sourceName, IntBuffer bufferNames) {
		nalSourceUnqueueBuffers(sourceName, bufferNames.remaining(), memAddress(bufferNames));
	}

	/**
	 * Removes a number of buffer entries that have finished processing, in the order of apperance, from the queue of the specified source.
	 * 
	 * <p>Once a queue entry for a buffer has been appended to a queue and is pending processing, it should not be changed. Removal of a given queue entry is not
	 * possible unless either the source is stopped (in which case then entire queue is considered processed), or if the queue entry has already been processed
	 * (AL_PLAYING or AL_PAUSED source). A playing source will enter the AL_STOPPED state if it completes playback of the last buffer in its queue (the same
	 * behavior as when a single buffer has been attached to a source and has finished playback).</p>
	 *
	 * @param sourceName the target source
	 */
	public static int alSourceUnqueueBuffers(int sourceName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer bufferNames = stack.callocInt(1);
			nalSourceUnqueueBuffers(sourceName, 1, memAddress(bufferNames));
			return bufferNames.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alSourcePlay ] ---

	/**
	 * Sets the source state to AL_PLAYING.
	 * 
	 * <p>alSourcePlay applied to an AL_INITIAL source will promote the source to AL_PLAYING, thus the data found in the buffer will be fed into the processing,
	 * starting at the beginning. alSourcePlay applied to a AL_PLAYING source will restart the source from the beginning. It will not affect the configuration,
	 * and will leave the source in AL_PLAYING state, but reset the sampling offset to the beginning. alSourcePlay applied to a AL_PAUSED source will resume
	 * processing using the source state as preserved at the alSourcePause operation. alSourcePlay applied to a AL_STOPPED source will propagate it to
	 * AL_INITIAL then to AL_PLAYING immediately.</p>
	 *
	 * @param source the source to play
	 */
	public static void alSourcePlay(int source) {
		long __functionAddress = AL.getCapabilities().alSourcePlay;
		invokeV(__functionAddress, source);
	}

	// --- [ alSourcePause ] ---

	/**
	 * Sets the source state to AL_PAUSED.
	 * 
	 * <p>alSourcePause applied to an AL_INITIAL source is a legal NOP. alSourcePause applied to a AL_PLAYING source will change its state to AL_PAUSED. The
	 * source is exempt from processing, its current state is preserved. alSourcePause applied to a AL_PAUSED source is a legal NOP. alSourcePause applied to a
	 * AL_STOPPED source is a legal NOP.</p>
	 *
	 * @param source the source to pause
	 */
	public static void alSourcePause(int source) {
		long __functionAddress = AL.getCapabilities().alSourcePause;
		invokeV(__functionAddress, source);
	}

	// --- [ alSourceStop ] ---

	/**
	 * Sets the source state to AL_STOPPED.
	 * 
	 * <p>alSourceStop applied to an AL_INITIAL source is a legal NOP. alSourceStop applied to a AL_PLAYING source will change its state to AL_STOPPED. The source
	 * is exempt from processing, its current state is preserved. alSourceStop applied to a AL_PAUSED source will change its state to AL_STOPPED, with the same
	 * consequences as on a AL_PLAYING source. alSourceStop applied to a AL_STOPPED source is a legal NOP.</p>
	 *
	 * @param source the source to stop
	 */
	public static void alSourceStop(int source) {
		long __functionAddress = AL.getCapabilities().alSourceStop;
		invokeV(__functionAddress, source);
	}

	// --- [ alSourceRewind ] ---

	/**
	 * Sets the source state to AL_INITIAL.
	 * 
	 * <p>alSourceRewind applied to an AL_INITIAL source is a legal NOP. alSourceRewind applied to a AL_PLAYING source will change its state to AL_STOPPED then
	 * AL_INITIAL. The source is exempt from processing: its current state is preserved, with the exception of the sampling offset, which is reset to the
	 * beginning. alSourceRewind applied to a AL_PAUSED source will change its state to AL_INITIAL, with the same consequences as on a AL_PLAYING source.
	 * alSourceRewind applied to an AL_STOPPED source promotes the source to AL_INITIAL, resetting the sampling offset to the beginning.</p>
	 *
	 * @param source the source to rewind
	 */
	public static void alSourceRewind(int source) {
		long __functionAddress = AL.getCapabilities().alSourceRewind;
		invokeV(__functionAddress, source);
	}

	// --- [ alSourcePlayv ] ---

	/**
	 * Pointer version of {@link #alSourcePlay SourcePlay}.
	 *
	 * @param n       the number of sources to play
	 * @param sources the sources to play
	 */
	public static void nalSourcePlayv(int n, long sources) {
		long __functionAddress = AL.getCapabilities().alSourcePlayv;
		invokePV(__functionAddress, n, sources);
	}

	/**
	 * Pointer version of {@link #alSourcePlay SourcePlay}.
	 *
	 * @param sources the sources to play
	 */
	public static void alSourcePlayv(IntBuffer sources) {
		nalSourcePlayv(sources.remaining(), memAddress(sources));
	}

	// --- [ alSourcePausev ] ---

	/**
	 * Pointer version of {@link #alSourcePause SourcePause}.
	 *
	 * @param n       the number of sources to pause
	 * @param sources the sources to pause
	 */
	public static void nalSourcePausev(int n, long sources) {
		long __functionAddress = AL.getCapabilities().alSourcePausev;
		invokePV(__functionAddress, n, sources);
	}

	/**
	 * Pointer version of {@link #alSourcePause SourcePause}.
	 *
	 * @param sources the sources to pause
	 */
	public static void alSourcePausev(IntBuffer sources) {
		nalSourcePausev(sources.remaining(), memAddress(sources));
	}

	// --- [ alSourceStopv ] ---

	/**
	 * Pointer version of {@link #alSourceStop SourceStop}.
	 *
	 * @param n       the number of sources to stop
	 * @param sources the sources to stop
	 */
	public static void nalSourceStopv(int n, long sources) {
		long __functionAddress = AL.getCapabilities().alSourceStopv;
		invokePV(__functionAddress, n, sources);
	}

	/**
	 * Pointer version of {@link #alSourceStop SourceStop}.
	 *
	 * @param sources the sources to stop
	 */
	public static void alSourceStopv(IntBuffer sources) {
		nalSourceStopv(sources.remaining(), memAddress(sources));
	}

	// --- [ alSourceRewindv ] ---

	/**
	 * Pointer version of {@link #alSourceRewind SourceRewind}.
	 *
	 * @param n       the number of sources to rewind
	 * @param sources the sources to rewind
	 */
	public static void nalSourceRewindv(int n, long sources) {
		long __functionAddress = AL.getCapabilities().alSourceRewindv;
		invokePV(__functionAddress, n, sources);
	}

	/**
	 * Pointer version of {@link #alSourceRewind SourceRewind}.
	 *
	 * @param sources the sources to rewind
	 */
	public static void alSourceRewindv(IntBuffer sources) {
		nalSourceRewindv(sources.remaining(), memAddress(sources));
	}

	// --- [ alGenBuffers ] ---

	/**
	 * Requests a number of buffer names.
	 *
	 * @param n           the number of buffer names to generate
	 * @param bufferNames the buffer that will receive the buffer names
	 */
	public static void nalGenBuffers(int n, long bufferNames) {
		long __functionAddress = AL.getCapabilities().alGenBuffers;
		invokePV(__functionAddress, n, bufferNames);
	}

	/**
	 * Requests a number of buffer names.
	 *
	 * @param bufferNames the buffer that will receive the buffer names
	 */
	public static void alGenBuffers(IntBuffer bufferNames) {
		nalGenBuffers(bufferNames.remaining(), memAddress(bufferNames));
	}

	/** Requests a number of buffer names. */
	public static int alGenBuffers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer bufferNames = stack.callocInt(1);
			nalGenBuffers(1, memAddress(bufferNames));
			return bufferNames.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alDeleteBuffers ] ---

	/**
	 * Requests the deletion of a number of buffers.
	 *
	 * @param n           the number of buffers to delete
	 * @param bufferNames the buffers to delete
	 */
	public static void nalDeleteBuffers(int n, long bufferNames) {
		long __functionAddress = AL.getCapabilities().alDeleteBuffers;
		invokePV(__functionAddress, n, bufferNames);
	}

	/**
	 * Requests the deletion of a number of buffers.
	 *
	 * @param bufferNames the buffers to delete
	 */
	public static void alDeleteBuffers(IntBuffer bufferNames) {
		nalDeleteBuffers(bufferNames.remaining(), memAddress(bufferNames));
	}

	/** Requests the deletion of a number of buffers. */
	public static void alDeleteBuffers(int bufferName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer bufferNames = stack.ints(bufferName);
			nalDeleteBuffers(1, memAddress(bufferNames));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alIsBuffer ] ---

	/**
	 * Verifies whether the specified object name is a buffer name.
	 *
	 * @param bufferName a value that may be a buffer name
	 */
	public static boolean alIsBuffer(int bufferName) {
		long __functionAddress = AL.getCapabilities().alIsBuffer;
		return invokeZ(__functionAddress, bufferName);
	}

	// --- [ alGetBufferf ] ---

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>
	 * @param value      the parameter value
	 */
	public static void nalGetBufferf(int bufferName, int paramName, long value) {
		long __functionAddress = AL.getCapabilities().alGetBufferf;
		invokePV(__functionAddress, bufferName, paramName, value);
	}

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>
	 * @param value      the parameter value
	 */
	public static void alGetBufferf(int bufferName, int paramName, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetBufferf(bufferName, paramName, memAddress(value));
	}

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>
	 */
	public static float alGetBufferf(int bufferName, int paramName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer value = stack.callocFloat(1);
			nalGetBufferf(bufferName, paramName, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetBufferi ] ---

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>
	 * @param value      the parameter value
	 */
	public static void nalGetBufferi(int bufferName, int paramName, long value) {
		long __functionAddress = AL.getCapabilities().alGetBufferi;
		invokePV(__functionAddress, bufferName, paramName, value);
	}

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>
	 * @param value      the parameter value
	 */
	public static void alGetBufferi(int bufferName, int paramName, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetBufferi(bufferName, paramName, memAddress(value));
	}

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<br><table><tr><td>{@link #AL_FREQUENCY FREQUENCY}</td><td>{@link #AL_BITS BITS}</td><td>{@link #AL_CHANNELS CHANNELS}</td><td>{@link #AL_SIZE SIZE}</td></tr></table>
	 */
	public static int alGetBufferi(int bufferName, int paramName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer value = stack.callocInt(1);
			nalGetBufferi(bufferName, paramName, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alBufferData ] ---

	/**
	 * Sets the sample data of the specified buffer.
	 * 
	 * <p>The data specified is copied to an internal software, or if possible, hardware buffer. The implementation is free to apply decompression, conversion,
	 * resampling, and filtering as needed.</p>
	 * 
	 * <p>8-bit data is expressed as an unsigned value over the range 0 to 255, 128 being an audio output level of zero.</p>
	 * 
	 * <p>16-bit data is expressed as a signed value over the range -32768 to 32767, 0 being an audio output level of zero. Byte order for 16-bit values is
	 * determined by the native format of the CPU.</p>
	 * 
	 * <p>Stereo data is expressed in an interleaved format, left channel sample followed by the right channel sample.</p>
	 * 
	 * <p>Buffers containing audio data with more than one channel will be played without 3D spatialization features – these formats are normally used for
	 * background music.</p>
	 *
	 * @param bufferName the buffer to modify
	 * @param format     the data format. One of:<br><table><tr><td>{@link #AL_FORMAT_MONO8 FORMAT_MONO8}</td><td>{@link #AL_FORMAT_MONO16 FORMAT_MONO16}</td><td>{@link #AL_FORMAT_STEREO8 FORMAT_STEREO8}</td><td>{@link #AL_FORMAT_STEREO16 FORMAT_STEREO16}</td></tr></table>
	 * @param data       the sample data
	 * @param size       the data buffer size, in bytes
	 * @param frequency  the data frequency
	 */
	public static void nalBufferData(int bufferName, int format, long data, int size, int frequency) {
		long __functionAddress = AL.getCapabilities().alBufferData;
		invokePV(__functionAddress, bufferName, format, data, size, frequency);
	}

	/**
	 * Sets the sample data of the specified buffer.
	 * 
	 * <p>The data specified is copied to an internal software, or if possible, hardware buffer. The implementation is free to apply decompression, conversion,
	 * resampling, and filtering as needed.</p>
	 * 
	 * <p>8-bit data is expressed as an unsigned value over the range 0 to 255, 128 being an audio output level of zero.</p>
	 * 
	 * <p>16-bit data is expressed as a signed value over the range -32768 to 32767, 0 being an audio output level of zero. Byte order for 16-bit values is
	 * determined by the native format of the CPU.</p>
	 * 
	 * <p>Stereo data is expressed in an interleaved format, left channel sample followed by the right channel sample.</p>
	 * 
	 * <p>Buffers containing audio data with more than one channel will be played without 3D spatialization features – these formats are normally used for
	 * background music.</p>
	 *
	 * @param bufferName the buffer to modify
	 * @param format     the data format. One of:<br><table><tr><td>{@link #AL_FORMAT_MONO8 FORMAT_MONO8}</td><td>{@link #AL_FORMAT_MONO16 FORMAT_MONO16}</td><td>{@link #AL_FORMAT_STEREO8 FORMAT_STEREO8}</td><td>{@link #AL_FORMAT_STEREO16 FORMAT_STEREO16}</td></tr></table>
	 * @param data       the sample data
	 * @param frequency  the data frequency
	 */
	public static void alBufferData(int bufferName, int format, ByteBuffer data, int frequency) {
		nalBufferData(bufferName, format, memAddress(data), data.remaining(), frequency);
	}

	/** ShortBuffer version of: {@link #alBufferData BufferData} */
	public static void alBufferData(int bufferName, int format, ShortBuffer data, int frequency) {
		nalBufferData(bufferName, format, memAddress(data), data.remaining() << 1, frequency);
	}

	/** IntBuffer version of: {@link #alBufferData BufferData} */
	public static void alBufferData(int bufferName, int format, IntBuffer data, int frequency) {
		nalBufferData(bufferName, format, memAddress(data), data.remaining() << 2, frequency);
	}

	/** FloatBuffer version of: {@link #alBufferData BufferData} */
	public static void alBufferData(int bufferName, int format, FloatBuffer data, int frequency) {
		nalBufferData(bufferName, format, memAddress(data), data.remaining() << 2, frequency);
	}

	// --- [ alGetEnumValue ] ---

	/**
	 * Returns the enumeration value of the specified enum.
	 *
	 * @param enumName the enum name
	 */
	public static int nalGetEnumValue(long enumName) {
		long __functionAddress = AL.getCapabilities().alGetEnumValue;
		return invokePI(__functionAddress, enumName);
	}

	/**
	 * Returns the enumeration value of the specified enum.
	 *
	 * @param enumName the enum name
	 */
	public static int alGetEnumValue(ByteBuffer enumName) {
		if ( CHECKS )
			checkNT1(enumName);
		return nalGetEnumValue(memAddress(enumName));
	}

	/**
	 * Returns the enumeration value of the specified enum.
	 *
	 * @param enumName the enum name
	 */
	public static int alGetEnumValue(CharSequence enumName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer enumNameEncoded = stack.ASCII(enumName);
			return nalGetEnumValue(memAddress(enumNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetProcAddress ] ---

	/**
	 * Retrieves extension entry points.
	 * 
	 * <p>Returns {@code NULL} if no entry point with the name funcName can be found. Implementations are free to return {@code NULL} if an entry point is present, but not
	 * applicable for the current context. However the specification does not guarantee this behavior.</p>
	 * 
	 * <p>Applications can use alGetProcAddress to obtain core API entry points, not just extensions. This is the recommended way to dynamically load and unload
	 * OpenAL DLL's as sound drivers.</p>
	 *
	 * @param funcName the function name
	 */
	public static long nalGetProcAddress(long funcName) {
		long __functionAddress = AL.getCapabilities().alGetProcAddress;
		return invokePP(__functionAddress, funcName);
	}

	/**
	 * Retrieves extension entry points.
	 * 
	 * <p>Returns {@code NULL} if no entry point with the name funcName can be found. Implementations are free to return {@code NULL} if an entry point is present, but not
	 * applicable for the current context. However the specification does not guarantee this behavior.</p>
	 * 
	 * <p>Applications can use alGetProcAddress to obtain core API entry points, not just extensions. This is the recommended way to dynamically load and unload
	 * OpenAL DLL's as sound drivers.</p>
	 *
	 * @param funcName the function name
	 */
	public static long alGetProcAddress(ByteBuffer funcName) {
		if ( CHECKS )
			checkNT1(funcName);
		return nalGetProcAddress(memAddress(funcName));
	}

	/**
	 * Retrieves extension entry points.
	 * 
	 * <p>Returns {@code NULL} if no entry point with the name funcName can be found. Implementations are free to return {@code NULL} if an entry point is present, but not
	 * applicable for the current context. However the specification does not guarantee this behavior.</p>
	 * 
	 * <p>Applications can use alGetProcAddress to obtain core API entry points, not just extensions. This is the recommended way to dynamically load and unload
	 * OpenAL DLL's as sound drivers.</p>
	 *
	 * @param funcName the function name
	 */
	public static long alGetProcAddress(CharSequence funcName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer funcNameEncoded = stack.ASCII(funcName);
			return nalGetProcAddress(memAddress(funcNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alIsExtensionPresent ] ---

	/**
	 * Verifies that a given extension is available for the current context and the device it is associated with.
	 * 
	 * <p>Invalid and unsupported string tokens return ALC_FALSE. {@code extName} is not case sensitive – the implementation will convert the name to all
	 * upper-case internally (and will express extension names in upper-case).</p>
	 *
	 * @param extName the extension name
	 */
	public static boolean nalIsExtensionPresent(long extName) {
		long __functionAddress = AL.getCapabilities().alIsExtensionPresent;
		return invokePZ(__functionAddress, extName);
	}

	/**
	 * Verifies that a given extension is available for the current context and the device it is associated with.
	 * 
	 * <p>Invalid and unsupported string tokens return ALC_FALSE. {@code extName} is not case sensitive – the implementation will convert the name to all
	 * upper-case internally (and will express extension names in upper-case).</p>
	 *
	 * @param extName the extension name
	 */
	public static boolean alIsExtensionPresent(ByteBuffer extName) {
		if ( CHECKS )
			checkNT1(extName);
		return nalIsExtensionPresent(memAddress(extName));
	}

	/**
	 * Verifies that a given extension is available for the current context and the device it is associated with.
	 * 
	 * <p>Invalid and unsupported string tokens return ALC_FALSE. {@code extName} is not case sensitive – the implementation will convert the name to all
	 * upper-case internally (and will express extension names in upper-case).</p>
	 *
	 * @param extName the extension name
	 */
	public static boolean alIsExtensionPresent(CharSequence extName) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer extNameEncoded = stack.ASCII(extName);
			return nalIsExtensionPresent(memAddress(extNameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #alGetIntegerv GetIntegerv} */
	public static void alGetIntegerv(int paramName, int[] dest) {
		long __functionAddress = AL.getCapabilities().alGetIntegerv;
		if ( CHECKS )
			checkBuffer(dest, 1);
		invokePV(__functionAddress, paramName, dest);
	}

	/** Array version of: {@link #alGetFloatv GetFloatv} */
	public static void alGetFloatv(int paramName, float[] dest) {
		long __functionAddress = AL.getCapabilities().alGetFloatv;
		if ( CHECKS )
			checkBuffer(dest, 1);
		invokePV(__functionAddress, paramName, dest);
	}

	/** Array version of: {@link #alGetDoublev GetDoublev} */
	public static void alGetDoublev(int paramName, double[] dest) {
		long __functionAddress = AL.getCapabilities().alGetDoublev;
		if ( CHECKS )
			checkBuffer(dest, 1);
		invokePV(__functionAddress, paramName, dest);
	}

	/** Array version of: {@link #alListenerfv Listenerfv} */
	public static void alListenerfv(int paramName, float[] values) {
		long __functionAddress = AL.getCapabilities().alListenerfv;
		if ( CHECKS )
			checkBuffer(values, 1);
		invokePV(__functionAddress, paramName, values);
	}

	/** Array version of: {@link #alGetListenerf GetListenerf} */
	public static void alGetListenerf(int paramName, float[] value) {
		long __functionAddress = AL.getCapabilities().alGetListenerf;
		if ( CHECKS )
			checkBuffer(value, 1);
		invokePV(__functionAddress, paramName, value);
	}

	/** Array version of: {@link #alGetListeneri GetListeneri} */
	public static void alGetListeneri(int paramName, int[] value) {
		long __functionAddress = AL.getCapabilities().alGetListeneri;
		if ( CHECKS )
			checkBuffer(value, 1);
		invokePV(__functionAddress, paramName, value);
	}

	/** Array version of: {@link #alGetListener3f GetListener3f} */
	public static void alGetListener3f(int paramName, float[] value1, float[] value2, float[] value3) {
		long __functionAddress = AL.getCapabilities().alGetListener3f;
		if ( CHECKS ) {
			checkBuffer(value1, 1);
			checkBuffer(value2, 1);
			checkBuffer(value3, 1);
		}
		invokePPPV(__functionAddress, paramName, value1, value2, value3);
	}

	/** Array version of: {@link #alGetListenerfv GetListenerfv} */
	public static void alGetListenerfv(int paramName, float[] values) {
		long __functionAddress = AL.getCapabilities().alGetListenerfv;
		if ( CHECKS )
			checkBuffer(values, 1);
		invokePV(__functionAddress, paramName, values);
	}

	/** Array version of: {@link #alGenSources GenSources} */
	public static void alGenSources(int[] srcNames) {
		long __functionAddress = AL.getCapabilities().alGenSources;
		invokePV(__functionAddress, srcNames.length, srcNames);
	}

	/** Array version of: {@link #alDeleteSources DeleteSources} */
	public static void alDeleteSources(int[] sources) {
		long __functionAddress = AL.getCapabilities().alDeleteSources;
		invokePV(__functionAddress, sources.length, sources);
	}

	/** Array version of: {@link #alSourcefv Sourcefv} */
	public static void alSourcefv(int source, int param, float[] values) {
		long __functionAddress = AL.getCapabilities().alSourcefv;
		if ( CHECKS )
			checkBuffer(values, 1);
		invokePV(__functionAddress, source, param, values);
	}

	/** Array version of: {@link #alGetSourcef GetSourcef} */
	public static void alGetSourcef(int source, int param, float[] value) {
		long __functionAddress = AL.getCapabilities().alGetSourcef;
		if ( CHECKS )
			checkBuffer(value, 1);
		invokePV(__functionAddress, source, param, value);
	}

	/** Array version of: {@link #alGetSource3f GetSource3f} */
	public static void alGetSource3f(int source, int param, float[] v1, float[] v2, float[] v3) {
		long __functionAddress = AL.getCapabilities().alGetSource3f;
		if ( CHECKS ) {
			checkBuffer(v1, 1);
			checkBuffer(v2, 1);
			checkBuffer(v3, 1);
		}
		invokePPPV(__functionAddress, source, param, v1, v2, v3);
	}

	/** Array version of: {@link #alGetSourcefv GetSourcefv} */
	public static void alGetSourcefv(int source, int param, float[] values) {
		long __functionAddress = AL.getCapabilities().alGetSourcefv;
		if ( CHECKS )
			checkBuffer(values, 1);
		invokePV(__functionAddress, source, param, values);
	}

	/** Array version of: {@link #alGetSourcei GetSourcei} */
	public static void alGetSourcei(int source, int param, int[] value) {
		long __functionAddress = AL.getCapabilities().alGetSourcei;
		if ( CHECKS )
			checkBuffer(value, 1);
		invokePV(__functionAddress, source, param, value);
	}

	/** Array version of: {@link #alGetSourceiv GetSourceiv} */
	public static void alGetSourceiv(int source, int param, int[] values) {
		long __functionAddress = AL.getCapabilities().alGetSourceiv;
		if ( CHECKS )
			checkBuffer(values, 1);
		invokePV(__functionAddress, source, param, values);
	}

	/** Array version of: {@link #alSourceQueueBuffers SourceQueueBuffers} */
	public static void alSourceQueueBuffers(int sourceName, int[] bufferNames) {
		long __functionAddress = AL.getCapabilities().alSourceQueueBuffers;
		invokePV(__functionAddress, sourceName, bufferNames.length, bufferNames);
	}

	/** Array version of: {@link #alSourceUnqueueBuffers SourceUnqueueBuffers} */
	public static void alSourceUnqueueBuffers(int sourceName, int[] bufferNames) {
		long __functionAddress = AL.getCapabilities().alSourceUnqueueBuffers;
		invokePV(__functionAddress, sourceName, bufferNames.length, bufferNames);
	}

	/** Array version of: {@link #alSourcePlayv SourcePlayv} */
	public static void alSourcePlayv(int[] sources) {
		long __functionAddress = AL.getCapabilities().alSourcePlayv;
		invokePV(__functionAddress, sources.length, sources);
	}

	/** Array version of: {@link #alSourcePausev SourcePausev} */
	public static void alSourcePausev(int[] sources) {
		long __functionAddress = AL.getCapabilities().alSourcePausev;
		invokePV(__functionAddress, sources.length, sources);
	}

	/** Array version of: {@link #alSourceStopv SourceStopv} */
	public static void alSourceStopv(int[] sources) {
		long __functionAddress = AL.getCapabilities().alSourceStopv;
		invokePV(__functionAddress, sources.length, sources);
	}

	/** Array version of: {@link #alSourceRewindv SourceRewindv} */
	public static void alSourceRewindv(int[] sources) {
		long __functionAddress = AL.getCapabilities().alSourceRewindv;
		invokePV(__functionAddress, sources.length, sources);
	}

	/** Array version of: {@link #alGenBuffers GenBuffers} */
	public static void alGenBuffers(int[] bufferNames) {
		long __functionAddress = AL.getCapabilities().alGenBuffers;
		invokePV(__functionAddress, bufferNames.length, bufferNames);
	}

	/** Array version of: {@link #alDeleteBuffers DeleteBuffers} */
	public static void alDeleteBuffers(int[] bufferNames) {
		long __functionAddress = AL.getCapabilities().alDeleteBuffers;
		invokePV(__functionAddress, bufferNames.length, bufferNames);
	}

	/** Array version of: {@link #alGetBufferf GetBufferf} */
	public static void alGetBufferf(int bufferName, int paramName, float[] value) {
		long __functionAddress = AL.getCapabilities().alGetBufferf;
		if ( CHECKS )
			checkBuffer(value, 1);
		invokePV(__functionAddress, bufferName, paramName, value);
	}

	/** Array version of: {@link #alGetBufferi GetBufferi} */
	public static void alGetBufferi(int bufferName, int paramName, int[] value) {
		long __functionAddress = AL.getCapabilities().alGetBufferi;
		if ( CHECKS )
			checkBuffer(value, 1);
		invokePV(__functionAddress, bufferName, paramName, value);
	}

	/** short[] version of: {@link #alBufferData BufferData} */
	public static void alBufferData(int bufferName, int format, short[] data, int frequency) {
		long __functionAddress = AL.getCapabilities().alBufferData;
		invokePV(__functionAddress, bufferName, format, data, data.length << 1, frequency);
	}

	/** int[] version of: {@link #alBufferData BufferData} */
	public static void alBufferData(int bufferName, int format, int[] data, int frequency) {
		long __functionAddress = AL.getCapabilities().alBufferData;
		invokePV(__functionAddress, bufferName, format, data, data.length << 2, frequency);
	}

	/** float[] version of: {@link #alBufferData BufferData} */
	public static void alBufferData(int bufferName, int format, float[] data, int frequency) {
		long __functionAddress = AL.getCapabilities().alBufferData;
		invokePV(__functionAddress, bufferName, format, data, data.length << 2, frequency);
	}

}