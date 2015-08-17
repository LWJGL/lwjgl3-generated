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

	/** Function address. */
	@JavadocExclude
	public final long
		GetError,
		Enable,
		Disable,
		IsEnabled,
		GetBoolean,
		GetInteger,
		GetFloat,
		GetDouble,
		GetBooleanv,
		GetIntegerv,
		GetFloatv,
		GetDoublev,
		GetString,
		DistanceModel,
		DopplerFactor,
		DopplerVelocity,
		Listenerf,
		Listeneri,
		Listener3f,
		Listenerfv,
		GetListenerf,
		GetListeneri,
		GetListener3f,
		GetListenerfv,
		GenSources,
		DeleteSources,
		IsSource,
		Sourcef,
		Source3f,
		Sourcefv,
		Sourcei,
		GetSourcef,
		GetSource3f,
		GetSourcefv,
		GetSourcei,
		SourceQueueBuffers,
		SourceUnqueueBuffers,
		SourcePlay,
		SourcePause,
		SourceStop,
		SourceRewind,
		SourcePlayv,
		SourcePausev,
		SourceStopv,
		SourceRewindv,
		GenBuffers,
		DeleteBuffers,
		IsBuffer,
		GetBufferf,
		GetBufferi,
		BufferData,
		GetEnumValue,
		GetProcAddress,
		IsExtensionPresent;

	@JavadocExclude
	public AL10(FunctionProvider provider) {
		GetError = provider.getFunctionAddress("alGetError");
		Enable = provider.getFunctionAddress("alEnable");
		Disable = provider.getFunctionAddress("alDisable");
		IsEnabled = provider.getFunctionAddress("alIsEnabled");
		GetBoolean = provider.getFunctionAddress("alGetBoolean");
		GetInteger = provider.getFunctionAddress("alGetInteger");
		GetFloat = provider.getFunctionAddress("alGetFloat");
		GetDouble = provider.getFunctionAddress("alGetDouble");
		GetBooleanv = provider.getFunctionAddress("alGetBooleanv");
		GetIntegerv = provider.getFunctionAddress("alGetIntegerv");
		GetFloatv = provider.getFunctionAddress("alGetFloatv");
		GetDoublev = provider.getFunctionAddress("alGetDoublev");
		GetString = provider.getFunctionAddress("alGetString");
		DistanceModel = provider.getFunctionAddress("alDistanceModel");
		DopplerFactor = provider.getFunctionAddress("alDopplerFactor");
		DopplerVelocity = provider.getFunctionAddress("alDopplerVelocity");
		Listenerf = provider.getFunctionAddress("alListenerf");
		Listeneri = provider.getFunctionAddress("alListeneri");
		Listener3f = provider.getFunctionAddress("alListener3f");
		Listenerfv = provider.getFunctionAddress("alListenerfv");
		GetListenerf = provider.getFunctionAddress("alGetListenerf");
		GetListeneri = provider.getFunctionAddress("alGetListeneri");
		GetListener3f = provider.getFunctionAddress("alGetListener3f");
		GetListenerfv = provider.getFunctionAddress("alGetListenerfv");
		GenSources = provider.getFunctionAddress("alGenSources");
		DeleteSources = provider.getFunctionAddress("alDeleteSources");
		IsSource = provider.getFunctionAddress("alIsSource");
		Sourcef = provider.getFunctionAddress("alSourcef");
		Source3f = provider.getFunctionAddress("alSource3f");
		Sourcefv = provider.getFunctionAddress("alSourcefv");
		Sourcei = provider.getFunctionAddress("alSourcei");
		GetSourcef = provider.getFunctionAddress("alGetSourcef");
		GetSource3f = provider.getFunctionAddress("alGetSource3f");
		GetSourcefv = provider.getFunctionAddress("alGetSourcefv");
		GetSourcei = provider.getFunctionAddress("alGetSourcei");
		SourceQueueBuffers = provider.getFunctionAddress("alSourceQueueBuffers");
		SourceUnqueueBuffers = provider.getFunctionAddress("alSourceUnqueueBuffers");
		SourcePlay = provider.getFunctionAddress("alSourcePlay");
		SourcePause = provider.getFunctionAddress("alSourcePause");
		SourceStop = provider.getFunctionAddress("alSourceStop");
		SourceRewind = provider.getFunctionAddress("alSourceRewind");
		SourcePlayv = provider.getFunctionAddress("alSourcePlayv");
		SourcePausev = provider.getFunctionAddress("alSourcePausev");
		SourceStopv = provider.getFunctionAddress("alSourceStopv");
		SourceRewindv = provider.getFunctionAddress("alSourceRewindv");
		GenBuffers = provider.getFunctionAddress("alGenBuffers");
		DeleteBuffers = provider.getFunctionAddress("alDeleteBuffers");
		IsBuffer = provider.getFunctionAddress("alIsBuffer");
		GetBufferf = provider.getFunctionAddress("alGetBufferf");
		GetBufferi = provider.getFunctionAddress("alGetBufferi");
		BufferData = provider.getFunctionAddress("alBufferData");
		GetEnumValue = provider.getFunctionAddress("alGetEnumValue");
		GetProcAddress = provider.getFunctionAddress("alGetProcAddress");
		IsExtensionPresent = provider.getFunctionAddress("alIsExtensionPresent");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AL10} instance for the current context. */
	public static AL10 getInstance() {
		return checkFunctionality(AL.getCapabilities().__AL10);
	}

	static AL10 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenAL10") ) return null;

		AL10 funcs = new AL10(provider);

		boolean supported = checkFunctions(
			funcs.GetError, funcs.Enable, funcs.Disable, funcs.IsEnabled, funcs.GetBoolean, funcs.GetInteger, funcs.GetFloat, funcs.GetDouble, 
			funcs.GetBooleanv, funcs.GetIntegerv, funcs.GetFloatv, funcs.GetDoublev, funcs.GetString, funcs.DistanceModel, funcs.DopplerFactor, 
			funcs.DopplerVelocity, funcs.Listenerf, funcs.Listeneri, funcs.Listener3f, funcs.Listenerfv, funcs.GetListenerf, funcs.GetListeneri, 
			funcs.GetListener3f, funcs.GetListenerfv, funcs.GenSources, funcs.DeleteSources, funcs.IsSource, funcs.Sourcef, funcs.Source3f, funcs.Sourcefv, 
			funcs.Sourcei, funcs.GetSourcef, funcs.GetSource3f, funcs.GetSourcefv, funcs.GetSourcei, funcs.SourceQueueBuffers, funcs.SourceUnqueueBuffers, 
			funcs.SourcePlay, funcs.SourcePause, funcs.SourceStop, funcs.SourceRewind, funcs.SourcePlayv, funcs.SourcePausev, funcs.SourceStopv, 
			funcs.SourceRewindv, funcs.GenBuffers, funcs.DeleteBuffers, funcs.IsBuffer, funcs.GetBufferf, funcs.GetBufferi, funcs.BufferData, 
			funcs.GetEnumValue, funcs.GetProcAddress, funcs.IsExtensionPresent
		);

		return AL.checkExtension("OpenAL10", funcs, supported);
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
		long __functionAddress = getInstance().GetError;
		return invokeI(__functionAddress);
	}

	// --- [ alEnable ] ---

	/**
	 * Enables AL capabilities.
	 *
	 * @param target the capability to enable
	 */
	public static void alEnable(int target) {
		long __functionAddress = getInstance().Enable;
		invokeIV(__functionAddress, target);
	}

	// --- [ alDisable ] ---

	/**
	 * Disables AL capabilities.
	 *
	 * @param target the capability to disable
	 */
	public static void alDisable(int target) {
		long __functionAddress = getInstance().Disable;
		invokeIV(__functionAddress, target);
	}

	// --- [ alIsEnabled ] ---

	/**
	 * Queries whether a given capability is currently enabled or not.
	 *
	 * @param target the capability to query
	 */
	public static boolean alIsEnabled(int target) {
		long __functionAddress = getInstance().IsEnabled;
		return invokeIZ(__functionAddress, target);
	}

	// --- [ alGetBoolean ] ---

	/**
	 * Returns the boolean value of the specified parameter.
	 *
	 * @param paramName the parameter to query
	 */
	public static boolean alGetBoolean(int paramName) {
		long __functionAddress = getInstance().GetBoolean;
		return invokeIZ(__functionAddress, paramName);
	}

	// --- [ alGetInteger ] ---

	/**
	 * Returns the integer value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<br>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}, {@link #AL_DISTANCE_MODEL DISTANCE_MODEL}, {@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}
	 */
	public static int alGetInteger(int paramName) {
		long __functionAddress = getInstance().GetInteger;
		return invokeII(__functionAddress, paramName);
	}

	// --- [ alGetFloat ] ---

	/**
	 * Returns the float value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<br>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}, {@link #AL_DISTANCE_MODEL DISTANCE_MODEL}, {@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}
	 */
	public static float alGetFloat(int paramName) {
		long __functionAddress = getInstance().GetFloat;
		return invokeIF(__functionAddress, paramName);
	}

	// --- [ alGetDouble ] ---

	/**
	 * Returns the double value of the specified parameter.
	 *
	 * @param paramName the parameter to query. One of:<br>{@link #AL_DOPPLER_FACTOR DOPPLER_FACTOR}, {@link #AL_DISTANCE_MODEL DISTANCE_MODEL}, {@link AL11#AL_SPEED_OF_SOUND SPEED_OF_SOUND}
	 */
	public static double alGetDouble(int paramName) {
		long __functionAddress = getInstance().GetDouble;
		return invokeID(__functionAddress, paramName);
	}

	// --- [ alGetBooleanv ] ---

	/** Unsafe version of {@link #alGetBooleanv GetBooleanv} */
	@JavadocExclude
	public static void nalGetBooleanv(int paramName, long dest) {
		long __functionAddress = getInstance().GetBooleanv;
		invokeIPV(__functionAddress, paramName, dest);
	}

	/**
	 * Pointer version of {@link #alGetBoolean GetBoolean}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetBooleanv(int paramName, ByteBuffer dest) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dest, 1);
		nalGetBooleanv(paramName, memAddress(dest));
	}

	// --- [ alGetIntegerv ] ---

	/** Unsafe version of {@link #alGetIntegerv GetIntegerv} */
	@JavadocExclude
	public static void nalGetIntegerv(int paramName, long dest) {
		long __functionAddress = getInstance().GetIntegerv;
		invokeIPV(__functionAddress, paramName, dest);
	}

	/**
	 * Pointer version of {@link #alGetInteger GetInteger}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetIntegerv(int paramName, ByteBuffer dest) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dest, 1 << 2);
		nalGetIntegerv(paramName, memAddress(dest));
	}

	/** Alternative version of: {@link #alGetIntegerv GetIntegerv} */
	public static void alGetIntegerv(int paramName, IntBuffer dest) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dest, 1);
		nalGetIntegerv(paramName, memAddress(dest));
	}

	// --- [ alGetFloatv ] ---

	/** Unsafe version of {@link #alGetFloatv GetFloatv} */
	@JavadocExclude
	public static void nalGetFloatv(int paramName, long dest) {
		long __functionAddress = getInstance().GetFloatv;
		invokeIPV(__functionAddress, paramName, dest);
	}

	/**
	 * Pointer version of {@link #alGetFloat GetFloat}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetFloatv(int paramName, ByteBuffer dest) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dest, 1 << 2);
		nalGetFloatv(paramName, memAddress(dest));
	}

	/** Alternative version of: {@link #alGetFloatv GetFloatv} */
	public static void alGetFloatv(int paramName, FloatBuffer dest) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dest, 1);
		nalGetFloatv(paramName, memAddress(dest));
	}

	// --- [ alGetDoublev ] ---

	/** Unsafe version of {@link #alGetDoublev GetDoublev} */
	@JavadocExclude
	public static void nalGetDoublev(int paramName, long dest) {
		long __functionAddress = getInstance().GetDoublev;
		invokeIPV(__functionAddress, paramName, dest);
	}

	/**
	 * Pointer version of {@link #alGetDouble GetDouble}.
	 *
	 * @param paramName the parameter to query
	 * @param dest      a buffer that will receive the parameter values
	 */
	public static void alGetDoublev(int paramName, ByteBuffer dest) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dest, 1 << 3);
		nalGetDoublev(paramName, memAddress(dest));
	}

	/** Alternative version of: {@link #alGetDoublev GetDoublev} */
	public static void alGetDoublev(int paramName, DoubleBuffer dest) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dest, 1);
		nalGetDoublev(paramName, memAddress(dest));
	}

	// --- [ alGetString ] ---

	/** Unsafe version of {@link #alGetString GetString} */
	@JavadocExclude
	public static long nalGetString(int paramName) {
		long __functionAddress = getInstance().GetString;
		return invokeIP(__functionAddress, paramName);
	}

	/**
	 * Returns the string value of the specified parameter
	 *
	 * @param paramName the parameter to query. One of:<br>{@link #AL_VENDOR VENDOR}, {@link #AL_VERSION VERSION}, {@link #AL_RENDERER RENDERER}, {@link #AL_EXTENSIONS EXTENSIONS}
	 */
	public static String alGetString(int paramName) {
		long __result = nalGetString(paramName);
		return memDecodeUTF8(__result);
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
	 * @param modelName the distance attenuation model to set. One of:<br>{@link #AL_INVERSE_DISTANCE INVERSE_DISTANCE}, {@link #AL_INVERSE_DISTANCE_CLAMPED INVERSE_DISTANCE_CLAMPED}, {@link AL11#AL_LINEAR_DISTANCE LINEAR_DISTANCE}, {@link AL11#AL_LINEAR_DISTANCE_CLAMPED LINEAR_DISTANCE_CLAMPED}, {@link AL11#AL_EXPONENT_DISTANCE EXPONENT_DISTANCE}, {@link AL11#AL_EXPONENT_DISTANCE_CLAMPED EXPONENT_DISTANCE_CLAMPED}, {@link #AL_NONE NONE}
	 */
	public static void alDistanceModel(int modelName) {
		long __functionAddress = getInstance().DistanceModel;
		invokeIV(__functionAddress, modelName);
	}

	// --- [ alDopplerFactor ] ---

	/**
	 * Sets the doppler effect factor.
	 * 
	 * <p>The Doppler Effect depends on the velocities of source and listener relative to the medium, and the propagation speed of sound in that medium. The
	 * application might want to emphasize or de-emphasize the Doppler Effect as physically accurate calculation might not give the desired results. The amount
	 * of frequency shift (pitch change) is proportional to the speed of listener and source along their line of sight. The Doppler Effect as implemented by
	 * OpenAL is described by the formula below. Effects of the medium (air, water) moving with respect to listener and source are ignored.
	 * <pre><code style="font-family: monospace">
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
	 * f' = f * (SS - DF * vls) / (SS - DF * vss)</code></pre>
	 * The {@code dopplerFactor} is a simple scaling of source and listener velocities to exaggerate or deemphasize the Doppler (pitch) shift resulting from
	 * the calculation.</p>
	 *
	 * @param dopplerFactor the doppler factor
	 */
	public static void alDopplerFactor(float dopplerFactor) {
		long __functionAddress = getInstance().DopplerFactor;
		invokeFV(__functionAddress, dopplerFactor);
	}

	// --- [ alDopplerVelocity ] ---

	/**
	 * Sets the doppler effect propagation velocity.
	 * 
	 * <p>The OpenAL 1.1 Doppler implementation is different than that of OpenAL 1.0, because the older implementation was confusing and not implemented
	 * consistently. The new "speed of sound" property makes the 1.1 implementation more intuitive than the old implementation. If your implementation wants to
	 * support the AL_DOPPLER_VELOCITY parameter (the alDopplerVelocity call will remain as an entry point so that 1.0 applications can link with a 1.1
	 * library), the above formula can be changed to the following:
	 * <pre><code style="font-family: monospace">
	 * vss = min(vss, (SS * DV)/DF)
	 * vls = min(vls, (SS * DV)/DF)
	 * 
	 * f' = f * (SS * DV - DF*vls) / (SS * DV - DF * vss)</code></pre>
	 * OpenAL 1.1 programmers would never use AL_DOPPLER_VELOCITY (which defaults to 1.0).</p>
	 *
	 * @param dopplerVelocity the doppler velocity
	 */
	public static void alDopplerVelocity(float dopplerVelocity) {
		long __functionAddress = getInstance().DopplerVelocity;
		invokeFV(__functionAddress, dopplerVelocity);
	}

	// --- [ alListenerf ] ---

	/**
	 * Sets the float value of a listener parameter.
	 *
	 * @param paramName the parameter to modify. One of:<br>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value     the parameter value
	 */
	public static void alListenerf(int paramName, float value) {
		long __functionAddress = getInstance().Listenerf;
		invokeIFV(__functionAddress, paramName, value);
	}

	// --- [ alListeneri ] ---

	/**
	 * Integer version of {@link #alListenerf Listenerf}.
	 *
	 * @param paramName the parameter to modify. One of:<br>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param values    the parameter value
	 */
	public static void alListeneri(int paramName, int values) {
		long __functionAddress = getInstance().Listeneri;
		invokeIIV(__functionAddress, paramName, values);
	}

	// --- [ alListener3f ] ---

	/**
	 * Sets the 3 dimensional float values of a listener parameter.
	 *
	 * @param paramName the parameter to modify. One of:<br>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value1    the first value
	 * @param value2    the second value
	 * @param value3    the third value
	 */
	public static void alListener3f(int paramName, float value1, float value2, float value3) {
		long __functionAddress = getInstance().Listener3f;
		invokeIFFFV(__functionAddress, paramName, value1, value2, value3);
	}

	// --- [ alListenerfv ] ---

	/** Unsafe version of {@link #alListenerfv Listenerfv} */
	@JavadocExclude
	public static void nalListenerfv(int paramName, long values) {
		long __functionAddress = getInstance().Listenerfv;
		invokeIPV(__functionAddress, paramName, values);
	}

	/**
	 * Pointer version of {@link #alListenerf Listenerf}.
	 *
	 * @param paramName the parameter to modify
	 * @param values    the parameter values
	 */
	public static void alListenerfv(int paramName, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nalListenerfv(paramName, memAddress(values));
	}

	/** Alternative version of: {@link #alListenerfv Listenerfv} */
	public static void alListenerfv(int paramName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nalListenerfv(paramName, memAddress(values));
	}

	// --- [ alGetListenerf ] ---

	/** Unsafe version of {@link #alGetListenerf GetListenerf} */
	@JavadocExclude
	public static void nalGetListenerf(int paramName, long value) {
		long __functionAddress = getInstance().GetListenerf;
		invokeIPV(__functionAddress, paramName, value);
	}

	/**
	 * Returns the float value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value     the parameter value
	 */
	public static void alGetListenerf(int paramName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetListenerf(paramName, memAddress(value));
	}

	/** Alternative version of: {@link #alGetListenerf GetListenerf} */
	public static void alGetListenerf(int paramName, FloatBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalGetListenerf(paramName, memAddress(value));
	}

	/** Single return value version of: {@link #alGetListenerf GetListenerf} */
	public static float alGetListenerf(int paramName) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetListenerf(paramName, __buffer.address(value));
		return __buffer.floatValue(value);
	}

	// --- [ alGetListeneri ] ---

	/** Unsafe version of {@link #alGetListeneri GetListeneri} */
	@JavadocExclude
	public static void nalGetListeneri(int paramName, long value) {
		long __functionAddress = getInstance().GetListeneri;
		invokeIPV(__functionAddress, paramName, value);
	}

	/**
	 * Returns the integer value of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value     the parameter value
	 */
	public static void alGetListeneri(int paramName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetListeneri(paramName, memAddress(value));
	}

	/** Alternative version of: {@link #alGetListeneri GetListeneri} */
	public static void alGetListeneri(int paramName, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalGetListeneri(paramName, memAddress(value));
	}

	/** Single return value version of: {@link #alGetListeneri GetListeneri} */
	public static int alGetListeneri(int paramName) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetListeneri(paramName, __buffer.address(value));
		return __buffer.intValue(value);
	}

	// --- [ alGetListener3f ] ---

	/** Unsafe version of {@link #alGetListener3f GetListener3f} */
	@JavadocExclude
	public static void nalGetListener3f(int paramName, long value1, long value2, long value3) {
		long __functionAddress = getInstance().GetListener3f;
		invokeIPPPV(__functionAddress, paramName, value1, value2, value3);
	}

	/**
	 * Returns the 3 dimensional values of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param value1    the first parameter value
	 * @param value2    the second parameter value
	 * @param value3    the third parameter value
	 */
	public static void alGetListener3f(int paramName, ByteBuffer value1, ByteBuffer value2, ByteBuffer value3) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(value1, 1 << 2);
			checkBuffer(value2, 1 << 2);
			checkBuffer(value3, 1 << 2);
		}
		nalGetListener3f(paramName, memAddress(value1), memAddress(value2), memAddress(value3));
	}

	/** Alternative version of: {@link #alGetListener3f GetListener3f} */
	public static void alGetListener3f(int paramName, FloatBuffer value1, FloatBuffer value2, FloatBuffer value3) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(value1, 1);
			checkBuffer(value2, 1);
			checkBuffer(value3, 1);
		}
		nalGetListener3f(paramName, memAddress(value1), memAddress(value2), memAddress(value3));
	}

	// --- [ alGetListenerfv ] ---

	/** Unsafe version of {@link #alGetListenerfv GetListenerfv} */
	@JavadocExclude
	public static void nalGetListenerfv(int paramName, long values) {
		long __functionAddress = getInstance().GetListenerfv;
		invokeIPV(__functionAddress, paramName, values);
	}

	/**
	 * Returns float values of a listener parameter.
	 *
	 * @param paramName the parameter to query. One of:<br>{@link #AL_ORIENTATION ORIENTATION}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}
	 * @param values    the parameter values
	 */
	public static void alGetListenerfv(int paramName, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetListenerfv(paramName, memAddress(values));
	}

	/** Alternative version of: {@link #alGetListenerfv GetListenerfv} */
	public static void alGetListenerfv(int paramName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nalGetListenerfv(paramName, memAddress(values));
	}

	// --- [ alGenSources ] ---

	/** Unsafe version of {@link #alGenSources GenSources} */
	@JavadocExclude
	public static void nalGenSources(int n, long srcNames) {
		long __functionAddress = getInstance().GenSources;
		invokeIPV(__functionAddress, n, srcNames);
	}

	/**
	 * Requests a number of source names.
	 *
	 * @param n        the number of source names to generated
	 * @param srcNames the buffer that will receive the source names
	 */
	public static void alGenSources(int n, ByteBuffer srcNames) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(srcNames, n << 2);
		nalGenSources(n, memAddress(srcNames));
	}

	/** Alternative version of: {@link #alGenSources GenSources} */
	public static void alGenSources(IntBuffer srcNames) {
		nalGenSources(srcNames.remaining(), memAddress(srcNames));
	}

	/** Single return value version of: {@link #alGenSources GenSources} */
	public static int alGenSources() {
		APIBuffer __buffer = apiBuffer();
		int srcNames = __buffer.intParam();
		nalGenSources(1, __buffer.address(srcNames));
		return __buffer.intValue(srcNames);
	}

	// --- [ alDeleteSources ] ---

	/** Unsafe version of {@link #alDeleteSources DeleteSources} */
	@JavadocExclude
	public static void nalDeleteSources(int n, long sources) {
		long __functionAddress = getInstance().DeleteSources;
		invokeIPV(__functionAddress, n, sources);
	}

	/**
	 * Requests the deletion of a number of sources.
	 *
	 * @param n       the number of sources to delete
	 * @param sources the sources to delete
	 */
	public static void alDeleteSources(int n, ByteBuffer sources) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(sources, n << 2);
		nalDeleteSources(n, memAddress(sources));
	}

	/** Alternative version of: {@link #alDeleteSources DeleteSources} */
	public static void alDeleteSources(IntBuffer sources) {
		nalDeleteSources(sources.remaining(), memAddress(sources));
	}

	/** Single value version of: {@link #alDeleteSources DeleteSources} */
	public static void alDeleteSources(int source) {
		APIBuffer __buffer = apiBuffer();
		int sources = __buffer.intParam(source);
		nalDeleteSources(1, __buffer.address(sources));
	}

	// --- [ alIsSource ] ---

	/**
	 * Verifies whether the specified object name is a source name.
	 *
	 * @param sourceName a value that may be a source name
	 */
	public static boolean alIsSource(int sourceName) {
		long __functionAddress = getInstance().IsSource;
		return invokeIZ(__functionAddress, sourceName);
	}

	// --- [ alSourcef ] ---

	/**
	 * Sets the float value of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify. One of:<br>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param value  the parameter value
	 */
	public static void alSourcef(int source, int param, float value) {
		long __functionAddress = getInstance().Sourcef;
		invokeIIFV(__functionAddress, source, param, value);
	}

	// --- [ alSource3f ] ---

	/**
	 * Sets the 3 dimensional values of a source parameter.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify. One of:<br>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param v1     the first parameter value
	 * @param v2     the second parameter value
	 * @param v3     the third parameter value
	 */
	public static void alSource3f(int source, int param, float v1, float v2, float v3) {
		long __functionAddress = getInstance().Source3f;
		invokeIIFFFV(__functionAddress, source, param, v1, v2, v3);
	}

	// --- [ alSourcefv ] ---

	/** Unsafe version of {@link #alSourcefv Sourcefv} */
	@JavadocExclude
	public static void nalSourcefv(int source, int param, long values) {
		long __functionAddress = getInstance().Sourcefv;
		invokeIIPV(__functionAddress, source, param, values);
	}

	/**
	 * Pointer version of {@link #alSourcef Sourcef}.
	 *
	 * @param source the source to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alSourcefv(int source, int param, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nalSourcefv(source, param, memAddress(values));
	}

	/** Alternative version of: {@link #alSourcefv Sourcefv} */
	public static void alSourcefv(int source, int param, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
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
		long __functionAddress = getInstance().Sourcei;
		invokeIIIV(__functionAddress, source, param, value);
	}

	// --- [ alGetSourcef ] ---

	/** Unsafe version of {@link #alGetSourcef GetSourcef} */
	@JavadocExclude
	public static void nalGetSourcef(int source, int param, long value) {
		long __functionAddress = getInstance().GetSourcef;
		invokeIIPV(__functionAddress, source, param, value);
	}

	/**
	 * Returns the float value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param value  the parameter value
	 */
	public static void alGetSourcef(int source, int param, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetSourcef(source, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetSourcef GetSourcef} */
	public static void alGetSourcef(int source, int param, FloatBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalGetSourcef(source, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetSourcef GetSourcef} */
	public static float alGetSourcef(int source, int param) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetSourcef(source, param, __buffer.address(value));
		return __buffer.floatValue(value);
	}

	// --- [ alGetSource3f ] ---

	/** Unsafe version of {@link #alGetSource3f GetSource3f} */
	@JavadocExclude
	public static void nalGetSource3f(int source, int param, long v1, long v2, long v3) {
		long __functionAddress = getInstance().GetSource3f;
		invokeIIPPPV(__functionAddress, source, param, v1, v2, v3);
	}

	/**
	 * Returns the 3 dimensional values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param v1     the first parameter value
	 * @param v2     the second parameter value
	 * @param v3     the third parameter value
	 */
	public static void alGetSource3f(int source, int param, ByteBuffer v1, ByteBuffer v2, ByteBuffer v3) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 1 << 2);
			checkBuffer(v2, 1 << 2);
			checkBuffer(v3, 1 << 2);
		}
		nalGetSource3f(source, param, memAddress(v1), memAddress(v2), memAddress(v3));
	}

	/** Alternative version of: {@link #alGetSource3f GetSource3f} */
	public static void alGetSource3f(int source, int param, FloatBuffer v1, FloatBuffer v2, FloatBuffer v3) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(v1, 1);
			checkBuffer(v2, 1);
			checkBuffer(v3, 1);
		}
		nalGetSource3f(source, param, memAddress(v1), memAddress(v2), memAddress(v3));
	}

	// --- [ alGetSourcefv ] ---

	/** Unsafe version of {@link #alGetSourcefv GetSourcefv} */
	@JavadocExclude
	public static void nalGetSourcefv(int source, int param, long values) {
		long __functionAddress = getInstance().GetSourcefv;
		invokeIIPV(__functionAddress, source, param, values);
	}

	/**
	 * Returns the float values of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param values the parameter values
	 */
	public static void alGetSourcefv(int source, int param, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetSourcefv(source, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetSourcefv GetSourcefv} */
	public static void alGetSourcefv(int source, int param, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nalGetSourcefv(source, param, memAddress(values));
	}

	// --- [ alGetSourcei ] ---

	/** Unsafe version of {@link #alGetSourcei GetSourcei} */
	@JavadocExclude
	public static void nalGetSourcei(int source, int param, long value) {
		long __functionAddress = getInstance().GetSourcei;
		invokeIIPV(__functionAddress, source, param, value);
	}

	/**
	 * Returns the integer value of the specified source parameter.
	 *
	 * @param source the source to query
	 * @param param  the parameter to query. One of:<br>{@link #AL_CONE_INNER_ANGLE CONE_INNER_ANGLE}, {@link #AL_CONE_OUTER_ANGLE CONE_OUTER_ANGLE}, {@link #AL_PITCH PITCH}, {@link #AL_DIRECTION DIRECTION}, {@link #AL_LOOPING LOOPING}, {@link #AL_BUFFER BUFFER}, {@link #AL_SOURCE_STATE SOURCE_STATE}, {@link #AL_CONE_OUTER_GAIN CONE_OUTER_GAIN}, {@link #AL_SOURCE_TYPE SOURCE_TYPE}, {@link #AL_POSITION POSITION}, {@link #AL_VELOCITY VELOCITY}, {@link #AL_GAIN GAIN}, {@link #AL_REFERENCE_DISTANCE REFERENCE_DISTANCE}, {@link #AL_ROLLOFF_FACTOR ROLLOFF_FACTOR}, {@link #AL_MAX_DISTANCE MAX_DISTANCE}
	 * @param value  the parameter value
	 */
	public static void alGetSourcei(int source, int param, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetSourcei(source, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetSourcei GetSourcei} */
	public static void alGetSourcei(int source, int param, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalGetSourcei(source, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetSourcei GetSourcei} */
	public static int alGetSourcei(int source, int param) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetSourcei(source, param, __buffer.address(value));
		return __buffer.intValue(value);
	}

	// --- [ alSourceQueueBuffers ] ---

	/** Unsafe version of {@link #alSourceQueueBuffers SourceQueueBuffers} */
	@JavadocExclude
	public static void nalSourceQueueBuffers(int sourceName, int numBuffers, long bufferNames) {
		long __functionAddress = getInstance().SourceQueueBuffers;
		invokeIIPV(__functionAddress, sourceName, numBuffers, bufferNames);
	}

	/**
	 * Queues up one or multiple buffer names to the specified source.
	 * 
	 * <p>The buffers will be queued in the sequence in which they appear in the array. This command is legal on a source in any playback state (to allow for
	 * streaming, queuing has to be possible on a AL_PLAYING source). All buffers in a queue must have the same format and attributes, with the exception of
	 * the NULL buffer (i.e., 0) which can always be queued.</p>
	 *
	 * @param sourceName  the target source
	 * @param numBuffers  the number of buffers to queue
	 * @param bufferNames the buffer names
	 */
	public static void alSourceQueueBuffers(int sourceName, int numBuffers, ByteBuffer bufferNames) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bufferNames, numBuffers << 2);
		nalSourceQueueBuffers(sourceName, numBuffers, memAddress(bufferNames));
	}

	/** Alternative version of: {@link #alSourceQueueBuffers SourceQueueBuffers} */
	public static void alSourceQueueBuffers(int sourceName, IntBuffer bufferNames) {
		nalSourceQueueBuffers(sourceName, bufferNames.remaining(), memAddress(bufferNames));
	}

	/** Single value version of: {@link #alSourceQueueBuffers SourceQueueBuffers} */
	public static void alSourceQueueBuffers(int sourceName, int bufferName) {
		APIBuffer __buffer = apiBuffer();
		int bufferNames = __buffer.intParam(bufferName);
		nalSourceQueueBuffers(sourceName, 1, __buffer.address(bufferNames));
	}

	// --- [ alSourceUnqueueBuffers ] ---

	/** Unsafe version of {@link #alSourceUnqueueBuffers SourceUnqueueBuffers} */
	@JavadocExclude
	public static void nalSourceUnqueueBuffers(int sourceName, int numEntries, long bufferNames) {
		long __functionAddress = getInstance().SourceUnqueueBuffers;
		invokeIIPV(__functionAddress, sourceName, numEntries, bufferNames);
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
	 * @param numEntries  the number of buffers to unqueue
	 * @param bufferNames the buffer names
	 */
	public static void alSourceUnqueueBuffers(int sourceName, int numEntries, ByteBuffer bufferNames) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bufferNames, numEntries << 2);
		nalSourceUnqueueBuffers(sourceName, numEntries, memAddress(bufferNames));
	}

	/** Alternative version of: {@link #alSourceUnqueueBuffers SourceUnqueueBuffers} */
	public static void alSourceUnqueueBuffers(int sourceName, IntBuffer bufferNames) {
		nalSourceUnqueueBuffers(sourceName, bufferNames.remaining(), memAddress(bufferNames));
	}

	/** Single return value version of: {@link #alSourceUnqueueBuffers SourceUnqueueBuffers} */
	public static int alSourceUnqueueBuffers(int sourceName) {
		APIBuffer __buffer = apiBuffer();
		int bufferNames = __buffer.intParam();
		nalSourceUnqueueBuffers(sourceName, 1, __buffer.address(bufferNames));
		return __buffer.intValue(bufferNames);
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
		long __functionAddress = getInstance().SourcePlay;
		invokeIV(__functionAddress, source);
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
		long __functionAddress = getInstance().SourcePause;
		invokeIV(__functionAddress, source);
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
		long __functionAddress = getInstance().SourceStop;
		invokeIV(__functionAddress, source);
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
		long __functionAddress = getInstance().SourceRewind;
		invokeIV(__functionAddress, source);
	}

	// --- [ alSourcePlayv ] ---

	/** Unsafe version of {@link #alSourcePlayv SourcePlayv} */
	@JavadocExclude
	public static void nalSourcePlayv(int n, long sources) {
		long __functionAddress = getInstance().SourcePlayv;
		invokeIPV(__functionAddress, n, sources);
	}

	/**
	 * Pointer version of {@link #alSourcePlay SourcePlay}.
	 *
	 * @param n       the number of sources to play
	 * @param sources the sources to play
	 */
	public static void alSourcePlayv(int n, ByteBuffer sources) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(sources, n << 2);
		nalSourcePlayv(n, memAddress(sources));
	}

	/** Alternative version of: {@link #alSourcePlayv SourcePlayv} */
	public static void alSourcePlayv(IntBuffer sources) {
		nalSourcePlayv(sources.remaining(), memAddress(sources));
	}

	// --- [ alSourcePausev ] ---

	/** Unsafe version of {@link #alSourcePausev SourcePausev} */
	@JavadocExclude
	public static void nalSourcePausev(int n, long sources) {
		long __functionAddress = getInstance().SourcePausev;
		invokeIPV(__functionAddress, n, sources);
	}

	/**
	 * Pointer version of {@link #alSourcePause SourcePause}.
	 *
	 * @param n       the number of sources to pause
	 * @param sources the sources to pause
	 */
	public static void alSourcePausev(int n, ByteBuffer sources) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(sources, n << 2);
		nalSourcePausev(n, memAddress(sources));
	}

	/** Alternative version of: {@link #alSourcePausev SourcePausev} */
	public static void alSourcePausev(IntBuffer sources) {
		nalSourcePausev(sources.remaining(), memAddress(sources));
	}

	// --- [ alSourceStopv ] ---

	/** Unsafe version of {@link #alSourceStopv SourceStopv} */
	@JavadocExclude
	public static void nalSourceStopv(int n, long sources) {
		long __functionAddress = getInstance().SourceStopv;
		invokeIPV(__functionAddress, n, sources);
	}

	/**
	 * Pointer version of {@link #alSourceStop SourceStop}.
	 *
	 * @param n       the number of sources to stop
	 * @param sources the sources to stop
	 */
	public static void alSourceStopv(int n, ByteBuffer sources) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(sources, n << 2);
		nalSourceStopv(n, memAddress(sources));
	}

	/** Alternative version of: {@link #alSourceStopv SourceStopv} */
	public static void alSourceStopv(IntBuffer sources) {
		nalSourceStopv(sources.remaining(), memAddress(sources));
	}

	// --- [ alSourceRewindv ] ---

	/** Unsafe version of {@link #alSourceRewindv SourceRewindv} */
	@JavadocExclude
	public static void nalSourceRewindv(int n, long sources) {
		long __functionAddress = getInstance().SourceRewindv;
		invokeIPV(__functionAddress, n, sources);
	}

	/**
	 * Pointer version of {@link #alSourceRewind SourceRewind}.
	 *
	 * @param n       the number of sources to rewind
	 * @param sources the sources to rewind
	 */
	public static void alSourceRewindv(int n, ByteBuffer sources) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(sources, n << 2);
		nalSourceRewindv(n, memAddress(sources));
	}

	/** Alternative version of: {@link #alSourceRewindv SourceRewindv} */
	public static void alSourceRewindv(IntBuffer sources) {
		nalSourceRewindv(sources.remaining(), memAddress(sources));
	}

	// --- [ alGenBuffers ] ---

	/** Unsafe version of {@link #alGenBuffers GenBuffers} */
	@JavadocExclude
	public static void nalGenBuffers(int n, long bufferNames) {
		long __functionAddress = getInstance().GenBuffers;
		invokeIPV(__functionAddress, n, bufferNames);
	}

	/**
	 * Requests a number of buffer names.
	 *
	 * @param n           the number of buffer names to generate
	 * @param bufferNames the buffer that will receive the buffer names
	 */
	public static void alGenBuffers(int n, ByteBuffer bufferNames) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bufferNames, n << 2);
		nalGenBuffers(n, memAddress(bufferNames));
	}

	/** Alternative version of: {@link #alGenBuffers GenBuffers} */
	public static void alGenBuffers(IntBuffer bufferNames) {
		nalGenBuffers(bufferNames.remaining(), memAddress(bufferNames));
	}

	/** Single return value version of: {@link #alGenBuffers GenBuffers} */
	public static int alGenBuffers() {
		APIBuffer __buffer = apiBuffer();
		int bufferNames = __buffer.intParam();
		nalGenBuffers(1, __buffer.address(bufferNames));
		return __buffer.intValue(bufferNames);
	}

	// --- [ alDeleteBuffers ] ---

	/** Unsafe version of {@link #alDeleteBuffers DeleteBuffers} */
	@JavadocExclude
	public static void nalDeleteBuffers(int n, long bufferNames) {
		long __functionAddress = getInstance().DeleteBuffers;
		invokeIPV(__functionAddress, n, bufferNames);
	}

	/**
	 * Requests the deletion of a number of buffers.
	 *
	 * @param n           the number of buffers to delete
	 * @param bufferNames the buffers to delete
	 */
	public static void alDeleteBuffers(int n, ByteBuffer bufferNames) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bufferNames, n << 2);
		nalDeleteBuffers(n, memAddress(bufferNames));
	}

	/** Alternative version of: {@link #alDeleteBuffers DeleteBuffers} */
	public static void alDeleteBuffers(IntBuffer bufferNames) {
		nalDeleteBuffers(bufferNames.remaining(), memAddress(bufferNames));
	}

	/** Single value version of: {@link #alDeleteBuffers DeleteBuffers} */
	public static void alDeleteBuffers(int bufferName) {
		APIBuffer __buffer = apiBuffer();
		int bufferNames = __buffer.intParam(bufferName);
		nalDeleteBuffers(1, __buffer.address(bufferNames));
	}

	// --- [ alIsBuffer ] ---

	/**
	 * Verifies whether the specified object name is a buffer name.
	 *
	 * @param bufferName a value that may be a buffer name
	 */
	public static boolean alIsBuffer(int bufferName) {
		long __functionAddress = getInstance().IsBuffer;
		return invokeIZ(__functionAddress, bufferName);
	}

	// --- [ alGetBufferf ] ---

	/** Unsafe version of {@link #alGetBufferf GetBufferf} */
	@JavadocExclude
	public static void nalGetBufferf(int bufferName, int paramName, long value) {
		long __functionAddress = getInstance().GetBufferf;
		invokeIIPV(__functionAddress, bufferName, paramName, value);
	}

	/**
	 * Returns the float value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<br>{@link #AL_FREQUENCY FREQUENCY}, {@link #AL_BITS BITS}, {@link #AL_CHANNELS CHANNELS}, {@link #AL_SIZE SIZE}
	 * @param value      the parameter value
	 */
	public static void alGetBufferf(int bufferName, int paramName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetBufferf(bufferName, paramName, memAddress(value));
	}

	/** Alternative version of: {@link #alGetBufferf GetBufferf} */
	public static void alGetBufferf(int bufferName, int paramName, FloatBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalGetBufferf(bufferName, paramName, memAddress(value));
	}

	/** Single return value version of: {@link #alGetBufferf GetBufferf} */
	public static float alGetBufferf(int bufferName, int paramName) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetBufferf(bufferName, paramName, __buffer.address(value));
		return __buffer.floatValue(value);
	}

	// --- [ alGetBufferi ] ---

	/** Unsafe version of {@link #alGetBufferi GetBufferi} */
	@JavadocExclude
	public static void nalGetBufferi(int bufferName, int paramName, long value) {
		long __functionAddress = getInstance().GetBufferi;
		invokeIIPV(__functionAddress, bufferName, paramName, value);
	}

	/**
	 * Returns the integer value of the specified buffer parameter.
	 *
	 * @param bufferName the buffer to query
	 * @param paramName  the parameter to query. One of:<br>{@link #AL_FREQUENCY FREQUENCY}, {@link #AL_BITS BITS}, {@link #AL_CHANNELS CHANNELS}, {@link #AL_SIZE SIZE}
	 * @param value      the parameter value
	 */
	public static void alGetBufferi(int bufferName, int paramName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetBufferi(bufferName, paramName, memAddress(value));
	}

	/** Alternative version of: {@link #alGetBufferi GetBufferi} */
	public static void alGetBufferi(int bufferName, int paramName, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nalGetBufferi(bufferName, paramName, memAddress(value));
	}

	/** Single return value version of: {@link #alGetBufferi GetBufferi} */
	public static int alGetBufferi(int bufferName, int paramName) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetBufferi(bufferName, paramName, __buffer.address(value));
		return __buffer.intValue(value);
	}

	// --- [ alBufferData ] ---

	/** Unsafe version of {@link #alBufferData BufferData} */
	@JavadocExclude
	public static void nalBufferData(int bufferName, int format, long data, int size, int frequency) {
		long __functionAddress = getInstance().BufferData;
		invokeIIPIIV(__functionAddress, bufferName, format, data, size, frequency);
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
	 * @param format     the data format. One of:<br>{@link #AL_FORMAT_MONO8 FORMAT_MONO8}, {@link #AL_FORMAT_MONO16 FORMAT_MONO16}, {@link #AL_FORMAT_STEREO8 FORMAT_STEREO8}, {@link #AL_FORMAT_STEREO16 FORMAT_STEREO16}
	 * @param data       the sample data
	 * @param size       the data buffer size, in bytes
	 * @param frequency  the data frequency
	 */
	public static void alBufferData(int bufferName, int format, ByteBuffer data, int size, int frequency) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nalBufferData(bufferName, format, memAddress(data), size, frequency);
	}

	/** Alternative version of: {@link #alBufferData BufferData} */
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

	// --- [ alGetEnumValue ] ---

	/** Unsafe version of {@link #alGetEnumValue GetEnumValue} */
	@JavadocExclude
	public static int nalGetEnumValue(long enumName) {
		long __functionAddress = getInstance().GetEnumValue;
		return invokePI(__functionAddress, enumName);
	}

	/**
	 * Returns the enumeration value of the specified enum.
	 *
	 * @param enumName the enum name
	 */
	public static int alGetEnumValue(ByteBuffer enumName) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(enumName);
		return nalGetEnumValue(memAddress(enumName));
	}

	/** CharSequence version of: {@link #alGetEnumValue GetEnumValue} */
	public static int alGetEnumValue(CharSequence enumName) {
		APIBuffer __buffer = apiBuffer();
		int enumNameEncoded = __buffer.stringParamASCII(enumName, true);
		return nalGetEnumValue(__buffer.address(enumNameEncoded));
	}

	// --- [ alGetProcAddress ] ---

	/** Unsafe version of {@link #alGetProcAddress GetProcAddress} */
	@JavadocExclude
	public static long nalGetProcAddress(long funcName) {
		long __functionAddress = getInstance().GetProcAddress;
		return invokePP(__functionAddress, funcName);
	}

	/**
	 * Retrieves extension entry points.
	 * 
	 * <p>Returns NULL if no entry point with the name funcName can be found. Implementations are free to return NULL if an entry point is present, but not
	 * applicable for the current context. However the specification does not guarantee this behavior.</p>
	 * 
	 * <p>Applications can use alGetProcAddress to obtain core API entry points, not just extensions. This is the recommended way to dynamically load and unload
	 * OpenAL DLL's as sound drivers.</p>
	 *
	 * @param funcName the function name
	 */
	public static long alGetProcAddress(ByteBuffer funcName) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(funcName);
		return nalGetProcAddress(memAddress(funcName));
	}

	/** CharSequence version of: {@link #alGetProcAddress GetProcAddress} */
	public static long alGetProcAddress(CharSequence funcName) {
		APIBuffer __buffer = apiBuffer();
		int funcNameEncoded = __buffer.stringParamASCII(funcName, true);
		return nalGetProcAddress(__buffer.address(funcNameEncoded));
	}

	// --- [ alIsExtensionPresent ] ---

	/** Unsafe version of {@link #alIsExtensionPresent IsExtensionPresent} */
	@JavadocExclude
	public static boolean nalIsExtensionPresent(long extName) {
		long __functionAddress = getInstance().IsExtensionPresent;
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
		if ( LWJGLUtil.CHECKS )
			checkNT1(extName);
		return nalIsExtensionPresent(memAddress(extName));
	}

	/** CharSequence version of: {@link #alIsExtensionPresent IsExtensionPresent} */
	public static boolean alIsExtensionPresent(CharSequence extName) {
		APIBuffer __buffer = apiBuffer();
		int extNameEncoded = __buffer.stringParamASCII(extName, true);
		return nalIsExtensionPresent(__buffer.address(extNameEncoded));
	}

}