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

/** Native bindings to ALC 1.0 functionality. */
public final class ALC10 {

	/** General tokens. */
	public static final int
		ALC_INVALID = 0xFFFFFFFF,
		ALC_FALSE   = 0x0,
		ALC_TRUE    = 0x1;

	/** Context creation attributes. */
	public static final int
		ALC_FREQUENCY = 0x1007,
		ALC_REFRESH   = 0x1008,
		ALC_SYNC      = 0x1009;

	/** Error conditions. */
	public static final int
		ALC_NO_ERROR        = 0x0,
		ALC_INVALID_DEVICE  = 0xA001,
		ALC_INVALID_CONTEXT = 0xA002,
		ALC_INVALID_ENUM    = 0xA003,
		ALC_INVALID_VALUE   = 0xA004,
		ALC_OUT_OF_MEMORY   = 0xA005;

	/** String queries. */
	public static final int
		ALC_DEFAULT_DEVICE_SPECIFIER = 0x1004,
		ALC_DEVICE_SPECIFIER         = 0x1005,
		ALC_EXTENSIONS               = 0x1006;

	/** Integer queries. */
	public static final int
		ALC_MAJOR_VERSION   = 0x1000,
		ALC_MINOR_VERSION   = 0x1001,
		ALC_ATTRIBUTES_SIZE = 0x1002,
		ALC_ALL_ATTRIBUTES  = 0x1003;

	private ALC10() {}

	// --- [ alcOpenDevice ] ---

	/** JNI method for {@link #alcOpenDevice} */
	public static native long nalcOpenDevice(long deviceSpecifier, long __functionAddress);

	/**
	 * Allows the application to connect to a device.
	 * <p/>
	 * If the function returns NULL, then no sound driver/device has been found. The argument is a null terminated string that requests a certain device or
	 * device configuration. If NULL is specified, the implementation will provide an implementation specific default.
	 *
	 * @param deviceSpecifier the requested device or device configuration
	 */
	public static long alcOpenDevice(ByteBuffer deviceSpecifier) {
		long __functionAddress = getInstance().alcOpenDevice;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( deviceSpecifier != null ) checkNT1(deviceSpecifier);
		}
		return nalcOpenDevice(memAddressSafe(deviceSpecifier), __functionAddress);
	}

	/** CharSequence version of: {@link #alcOpenDevice} */
	public static long alcOpenDevice(CharSequence deviceSpecifier) {
		long __functionAddress = getInstance().alcOpenDevice;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcOpenDevice(memAddressSafe(memEncodeUTF8(deviceSpecifier)), __functionAddress);
	}

	// --- [ alcCloseDevice ] ---

	/** JNI method for {@link #alcCloseDevice} */
	public static native boolean nalcCloseDevice(long deviceHandle, long __functionAddress);

	/**
	 * Allows the application to disconnect from a device.
	 * <p/>
	 * The return code will be ALC_TRUE or ALC_FALSE, indicating success or failure. Failure will occur if all the device's contexts and buffers have not been
	 * destroyed. Once closed, the {@code deviceHandle} is invalid.
	 *
	 * @param deviceHandle the device to close
	 */
	public static boolean alcCloseDevice(long deviceHandle) {
		long __functionAddress = getInstance().alcCloseDevice;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(deviceHandle);
		}
		return nalcCloseDevice(deviceHandle, __functionAddress);
	}

	// --- [ alcCreateContext ] ---

	/** JNI method for {@link #alcCreateContext} */
	public static native long nalcCreateContext(long deviceHandle, long attrList, long __functionAddress);

	/**
	 * Creates an AL context.
	 *
	 * @param deviceHandle a valid device
	 * @param attrList     null or a zero terminated list of integer pairs composed of valid ALC attribute tokens and requested values. One of:<p/>{@link #ALC_FREQUENCY}, {@link #ALC_REFRESH}, {@link #ALC_SYNC}, {@link ALC11#ALC_MONO_SOURCES}, {@link ALC11#ALC_STEREO_SOURCES}
	 */
	public static long alcCreateContext(long deviceHandle, ByteBuffer attrList) {
		long __functionAddress = getInstance().alcCreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(deviceHandle);
			if ( attrList != null ) checkNT4(attrList);
		}
		return nalcCreateContext(deviceHandle, memAddressSafe(attrList), __functionAddress);
	}

	/** Alternative version of: {@link #alcCreateContext} */
	public static long alcCreateContext(long deviceHandle, IntBuffer attrList) {
		long __functionAddress = getInstance().alcCreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(deviceHandle);
			if ( attrList != null ) checkNT(attrList);
		}
		return nalcCreateContext(deviceHandle, memAddressSafe(attrList), __functionAddress);
	}

	// --- [ alcMakeContextCurrent ] ---

	/** JNI method for {@link #alcMakeContextCurrent} */
	public static native boolean nalcMakeContextCurrent(long context, long __functionAddress);

	/**
	 * Makes a context current with respect to OpenAL operation.
	 * <p/>
	 * The context parameter can be NULL or a valid context pointer. Using NULL results in no context being current, which is useful when shutting OpenAL down.
	 * The operation will apply to the device that the context was created for.
	 * <p/>
	 * For each OS process (usually this means for each application), only one context can be current at any given time. All AL commands apply to the current
	 * context. Commands that affect objects shared among contexts (e.g. buffers) have side effects on other contexts.
	 *
	 * @param context the context to make current
	 */
	public static boolean alcMakeContextCurrent(long context) {
		long __functionAddress = getInstance().alcMakeContextCurrent;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcMakeContextCurrent(context, __functionAddress);
	}

	// --- [ alcProcessContext ] ---

	/** JNI method for {@link #alcProcessContext} */
	public static native void nalcProcessContext(long context, long __functionAddress);

	/**
	 * The current context is the only context accessible to state changes by AL commands (aside from state changes affecting shared objects). However,
	 * multiple contexts can be processed at the same time. To indicate that a context should be processed (i.e. that internal execution state such as the
	 * offset increments are to be performed), the application uses {@code alcProcessContext}.
	 * <p/>
	 * Repeated calls to alcProcessContext are legal, and do not affect a context that is already marked as processing. The default state of a context created
	 * by alcCreateContext is that it is processing.
	 *
	 * @param context the context to mark for processing
	 */
	public static void alcProcessContext(long context) {
		long __functionAddress = getInstance().alcProcessContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
		}
		nalcProcessContext(context, __functionAddress);
	}

	// --- [ alcSuspendContext ] ---

	/** JNI method for {@link #alcSuspendContext} */
	public static native void nalcSuspendContext(long context, long __functionAddress);

	/**
	 * The application can suspend any context from processing (including the current one). To indicate that a context should be suspended from processing
	 * (i.e. that internal execution state such as offset increments are not to be changed), the application uses {@code alcSuspendContext}.
	 * <p/>
	 * Repeated calls to alcSuspendContext are legal, and do not affect a context that is already marked as suspended.
	 *
	 * @param context the context to mark as suspended
	 */
	public static void alcSuspendContext(long context) {
		long __functionAddress = getInstance().alcSuspendContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
		}
		nalcSuspendContext(context, __functionAddress);
	}

	// --- [ alcDestroyContext ] ---

	/** JNI method for {@link #alcDestroyContext} */
	public static native void nalcDestroyContext(long context, long __functionAddress);

	/**
	 * Destroys a context.
	 * <p/>
	 * The correct way to destroy a context is to first release it using alcMakeCurrent with a NULL context. Applications should not attempt to destroy a
	 * current context – doing so will not work and will result in an ALC_INVALID_OPERATION error. All sources within a context will automatically be deleted
	 * during context destruction.
	 *
	 * @param context the context to destroy
	 */
	public static void alcDestroyContext(long context) {
		long __functionAddress = getInstance().alcDestroyContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
		}
		nalcDestroyContext(context, __functionAddress);
	}

	// --- [ alcGetCurrentContext ] ---

	/** JNI method for {@link #alcGetCurrentContext} */
	public static native long nalcGetCurrentContext(long __functionAddress);

	/** Queries for, and obtains a handle to, the current context for the application. If there is no current context, NULL is returned. */
	public static long alcGetCurrentContext() {
		long __functionAddress = getInstance().alcGetCurrentContext;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcGetCurrentContext(__functionAddress);
	}

	// --- [ alcGetContextsDevice ] ---

	/** JNI method for {@link #alcGetContextsDevice} */
	public static native long nalcGetContextsDevice(long context, long __functionAddress);

	/**
	 * Queries for, and obtains a handle to, the device of a given context.
	 *
	 * @param context the context to query
	 */
	public static long alcGetContextsDevice(long context) {
		long __functionAddress = getInstance().alcGetContextsDevice;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
		}
		return nalcGetContextsDevice(context, __functionAddress);
	}

	// --- [ alcIsExtensionPresent ] ---

	/** JNI method for {@link #alcIsExtensionPresent} */
	public static native boolean nalcIsExtensionPresent(long deviceHandle, long extName, long __functionAddress);

	/**
	 * Verifies that a given extension is available for the current context and the device it is associated with.
	 * <p/>
	 * Invalid and unsupported string tokens return ALC_FALSE. A NULL deviceHandle is acceptable. {@code extName} is not case sensitive – the implementation
	 * will convert the name to all upper-case internally (and will express extension names in upper-case).
	 *
	 * @param deviceHandle the device to query
	 * @param extName      the extension name
	 */
	public static boolean alcIsExtensionPresent(long deviceHandle, ByteBuffer extName) {
		long __functionAddress = getInstance().alcIsExtensionPresent;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(extName);
		}
		return nalcIsExtensionPresent(deviceHandle, memAddress(extName), __functionAddress);
	}

	/** CharSequence version of: {@link #alcIsExtensionPresent} */
	public static boolean alcIsExtensionPresent(long deviceHandle, CharSequence extName) {
		long __functionAddress = getInstance().alcIsExtensionPresent;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcIsExtensionPresent(deviceHandle, memAddress(memEncodeASCII(extName)), __functionAddress);
	}

	// --- [ alcGetProcAddress ] ---

	/** JNI method for {@link #alcGetProcAddress} */
	public static native long nalcGetProcAddress(long deviceHandle, long funcName, long __functionAddress);

	/**
	 * Retrieves extension entry points.
	 * <p/>
	 * The application is expected to verify the applicability of an extension or core function entry point before requesting it by name, by use of
	 * {@link #alcIsExtensionPresent}.
	 * <p/>
	 * Entry points can be device specific, but are not context specific. Using a NULL device handle does not guarantee that the entry point is returned, even
	 * if available for one of the available devices.
	 *
	 * @param deviceHandle the device to query
	 * @param funcName     the function name
	 */
	public static long alcGetProcAddress(long deviceHandle, ByteBuffer funcName) {
		long __functionAddress = getInstance().alcGetProcAddress;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(funcName);
		}
		return nalcGetProcAddress(deviceHandle, memAddress(funcName), __functionAddress);
	}

	/** CharSequence version of: {@link #alcGetProcAddress} */
	public static long alcGetProcAddress(long deviceHandle, CharSequence funcName) {
		long __functionAddress = getInstance().alcGetProcAddress;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcGetProcAddress(deviceHandle, memAddress(memEncodeASCII(funcName)), __functionAddress);
	}

	// --- [ alcGetEnumValue ] ---

	/** JNI method for {@link #alcGetEnumValue} */
	public static native int nalcGetEnumValue(long deviceHandle, long enumName, long __functionAddress);

	/**
	 * Returns extension enum values.
	 * <p/>
	 * Enumeration/token values are device independent, but tokens defined for extensions might not be present for a given device. Using a NULL handle is
	 * legal, but only the tokens defined by the AL core are guaranteed. Availability of extension tokens depends on the ALC extension.
	 *
	 * @param deviceHandle the device to query
	 * @param enumName     the enum name
	 */
	public static int alcGetEnumValue(long deviceHandle, ByteBuffer enumName) {
		long __functionAddress = getInstance().alcGetEnumValue;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(enumName);
		}
		return nalcGetEnumValue(deviceHandle, memAddress(enumName), __functionAddress);
	}

	/** CharSequence version of: {@link #alcGetEnumValue} */
	public static int alcGetEnumValue(long deviceHandle, CharSequence enumName) {
		long __functionAddress = getInstance().alcGetEnumValue;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcGetEnumValue(deviceHandle, memAddress(memEncodeASCII(enumName)), __functionAddress);
	}

	// --- [ alcGetError ] ---

	/** JNI method for {@link #alcGetError} */
	public static native int nalcGetError(long deviceHandle, long __functionAddress);

	/**
	 * Queries ALC errors.
	 * <p/>
	 * ALC uses the same conventions and mechanisms as AL for error handling. In particular, ALC does not use conventions derived from X11 (GLX) or Windows
	 * (WGL).
	 * <p/>
	 * Error conditions are specific to the device, and (like AL) a call to alcGetError resets the error state.
	 *
	 * @param deviceHandle the device to query
	 */
	public static int alcGetError(long deviceHandle) {
		long __functionAddress = getInstance().alcGetError;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(deviceHandle);
		}
		return nalcGetError(deviceHandle, __functionAddress);
	}

	// --- [ alcGetString ] ---

	/** JNI method for {@link #alcGetString} */
	public static native long nalcGetString(long deviceHandle, int token, long __functionAddress);

	/**
	 * Obtains string value(s) from ALC.
	 * <p/>
	 * <b>LWJGL note</b>: Use {@link ALC#getStringList} for those tokens that return multiple values.
	 *
	 * @param deviceHandle the device to query
	 * @param token        the information to query. One of:<p/>{@link #ALC_DEFAULT_DEVICE_SPECIFIER}, {@link #ALC_DEVICE_SPECIFIER}, {@link #ALC_EXTENSIONS}, {@link ALC11#ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER}, {@link ALC11#ALC_CAPTURE_DEVICE_SPECIFIER}
	 */
	public static String alcGetString(long deviceHandle, int token) {
		long __functionAddress = getInstance().alcGetString;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nalcGetString(deviceHandle, token, __functionAddress);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ alcGetIntegerv ] ---

	/** JNI method for {@link #alcGetInteger(long, int, int, ByteBuffer)} */
	public static native void nalcGetIntegerv(long deviceHandle, int token, int size, long dest, long __functionAddress);

	/**
	 * Obtains integer value(s) from ALC.
	 *
	 * @param deviceHandle the device to query
	 * @param token        the information to query. One of:<p/>{@link #ALC_MAJOR_VERSION}, {@link #ALC_MINOR_VERSION}, {@link #ALC_ATTRIBUTES_SIZE}, {@link #ALC_ALL_ATTRIBUTES}, {@link ALC11#ALC_CAPTURE_SAMPLES}
	 * @param size         the size of the {@code dest} buffer
	 * @param dest         the destination buffer
	 */
	public static void alcGetInteger(long deviceHandle, int token, int size, ByteBuffer dest) {
		long __functionAddress = getInstance().alcGetIntegerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dest, size << 2);
		}
		nalcGetIntegerv(deviceHandle, token, size, memAddress(dest), __functionAddress);
	}

	/** Alternative version of: {@link #alcGetInteger(long, int, int, ByteBuffer)} */
	public static void alcGetInteger(long deviceHandle, int token, IntBuffer dest) {
		long __functionAddress = getInstance().alcGetIntegerv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalcGetIntegerv(deviceHandle, token, dest.remaining(), memAddress(dest), __functionAddress);
	}

	/** Single return value version of: {@link #alcGetInteger(long, int, int, ByteBuffer)} */
	public static int alcGetInteger(long deviceHandle, int token) {
		long __functionAddress = getInstance().alcGetIntegerv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int dest = __buffer.intParam();
		nalcGetIntegerv(deviceHandle, token, 1, __buffer.address() + dest, __functionAddress);
		return __buffer.intValue(dest);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return ALC.getCapabilities().__ALC10;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider) {		if ( !ext.contains("OpenALC10") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.alcOpenDevice != 0L &&
			funcs.alcCloseDevice != 0L &&
			funcs.alcCreateContext != 0L &&
			funcs.alcMakeContextCurrent != 0L &&
			funcs.alcProcessContext != 0L &&
			funcs.alcSuspendContext != 0L &&
			funcs.alcDestroyContext != 0L &&
			funcs.alcGetCurrentContext != 0L &&
			funcs.alcGetContextsDevice != 0L &&
			funcs.alcIsExtensionPresent != 0L &&
			funcs.alcGetProcAddress != 0L &&
			funcs.alcGetEnumValue != 0L &&
			funcs.alcGetError != 0L &&
			funcs.alcGetString != 0L &&
			funcs.alcGetIntegerv != 0L;

		return ALC.checkExtension("OpenALC10", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code ALC10}. */
	public static final class Functions implements FunctionMap {

		public final long
			alcOpenDevice,
			alcCloseDevice,
			alcCreateContext,
			alcMakeContextCurrent,
			alcProcessContext,
			alcSuspendContext,
			alcDestroyContext,
			alcGetCurrentContext,
			alcGetContextsDevice,
			alcIsExtensionPresent,
			alcGetProcAddress,
			alcGetEnumValue,
			alcGetError,
			alcGetString,
			alcGetIntegerv;

		public Functions(FunctionProviderLocal provider) {
			alcOpenDevice = provider.getFunctionAddress("alcOpenDevice");
			alcCloseDevice = provider.getFunctionAddress("alcCloseDevice");
			alcCreateContext = provider.getFunctionAddress("alcCreateContext");
			alcMakeContextCurrent = provider.getFunctionAddress("alcMakeContextCurrent");
			alcProcessContext = provider.getFunctionAddress("alcProcessContext");
			alcSuspendContext = provider.getFunctionAddress("alcSuspendContext");
			alcDestroyContext = provider.getFunctionAddress("alcDestroyContext");
			alcGetCurrentContext = provider.getFunctionAddress("alcGetCurrentContext");
			alcGetContextsDevice = provider.getFunctionAddress("alcGetContextsDevice");
			alcIsExtensionPresent = provider.getFunctionAddress("alcIsExtensionPresent");
			alcGetProcAddress = provider.getFunctionAddress("alcGetProcAddress");
			alcGetEnumValue = provider.getFunctionAddress("alcGetEnumValue");
			alcGetError = provider.getFunctionAddress("alcGetError");
			alcGetString = provider.getFunctionAddress("alcGetString");
			alcGetIntegerv = provider.getFunctionAddress("alcGetIntegerv");
		}

	}

}