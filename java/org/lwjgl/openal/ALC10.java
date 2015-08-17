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

	/** Function address. */
	@JavadocExclude
	public final long
		OpenDevice,
		CloseDevice,
		CreateContext,
		MakeContextCurrent,
		ProcessContext,
		SuspendContext,
		DestroyContext,
		GetCurrentContext,
		GetContextsDevice,
		IsExtensionPresent,
		GetProcAddress,
		GetEnumValue,
		GetError,
		GetString,
		GetIntegerv;

	@JavadocExclude
	public ALC10(FunctionProviderLocal provider) {
		OpenDevice = provider.getFunctionAddress("alcOpenDevice");
		CloseDevice = provider.getFunctionAddress("alcCloseDevice");
		CreateContext = provider.getFunctionAddress("alcCreateContext");
		MakeContextCurrent = provider.getFunctionAddress("alcMakeContextCurrent");
		ProcessContext = provider.getFunctionAddress("alcProcessContext");
		SuspendContext = provider.getFunctionAddress("alcSuspendContext");
		DestroyContext = provider.getFunctionAddress("alcDestroyContext");
		GetCurrentContext = provider.getFunctionAddress("alcGetCurrentContext");
		GetContextsDevice = provider.getFunctionAddress("alcGetContextsDevice");
		IsExtensionPresent = provider.getFunctionAddress("alcIsExtensionPresent");
		GetProcAddress = provider.getFunctionAddress("alcGetProcAddress");
		GetEnumValue = provider.getFunctionAddress("alcGetEnumValue");
		GetError = provider.getFunctionAddress("alcGetError");
		GetString = provider.getFunctionAddress("alcGetString");
		GetIntegerv = provider.getFunctionAddress("alcGetIntegerv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ALC10} instance for the current context. */
	public static ALC10 getInstance() {
		return checkFunctionality(ALC.getCapabilities().__ALC10);
	}

	static ALC10 create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("OpenALC10") ) return null;

		ALC10 funcs = new ALC10(provider);

		boolean supported = checkFunctions(
			funcs.OpenDevice, funcs.CloseDevice, funcs.CreateContext, funcs.MakeContextCurrent, funcs.ProcessContext, funcs.SuspendContext, 
			funcs.DestroyContext, funcs.GetCurrentContext, funcs.GetContextsDevice, funcs.IsExtensionPresent, funcs.GetProcAddress, funcs.GetEnumValue, 
			funcs.GetError, funcs.GetString, funcs.GetIntegerv
		);

		return ALC.checkExtension("OpenALC10", funcs, supported);
	}

	// --- [ alcOpenDevice ] ---

	/** Unsafe version of {@link #alcOpenDevice OpenDevice} */
	@JavadocExclude
	public static long nalcOpenDevice(long deviceSpecifier) {
		long __functionAddress = getInstance().OpenDevice;
		return invokePP(__functionAddress, deviceSpecifier);
	}

	/**
	 * Allows the application to connect to a device.
	 * 
	 * <p>If the function returns NULL, then no sound driver/device has been found. The argument is a null terminated string that requests a certain device or
	 * device configuration. If NULL is specified, the implementation will provide an implementation specific default.</p>
	 *
	 * @param deviceSpecifier the requested device or device configuration
	 */
	public static long alcOpenDevice(ByteBuffer deviceSpecifier) {
		if ( LWJGLUtil.CHECKS )
			if ( deviceSpecifier != null ) checkNT1(deviceSpecifier);
		return nalcOpenDevice(memAddressSafe(deviceSpecifier));
	}

	/** CharSequence version of: {@link #alcOpenDevice OpenDevice} */
	public static long alcOpenDevice(CharSequence deviceSpecifier) {
		APIBuffer __buffer = apiBuffer();
		int deviceSpecifierEncoded = __buffer.stringParamUTF8(deviceSpecifier, true);
		return nalcOpenDevice(__buffer.addressSafe(deviceSpecifier, deviceSpecifierEncoded));
	}

	// --- [ alcCloseDevice ] ---

	/**
	 * Allows the application to disconnect from a device.
	 * 
	 * <p>The return code will be ALC_TRUE or ALC_FALSE, indicating success or failure. Failure will occur if all the device's contexts and buffers have not been
	 * destroyed. Once closed, the {@code deviceHandle} is invalid.</p>
	 *
	 * @param deviceHandle the device to close
	 */
	public static boolean alcCloseDevice(long deviceHandle) {
		long __functionAddress = getInstance().CloseDevice;
		if ( LWJGLUtil.CHECKS )
			checkPointer(deviceHandle);
		return invokePZ(__functionAddress, deviceHandle);
	}

	// --- [ alcCreateContext ] ---

	/** Unsafe version of {@link #alcCreateContext CreateContext} */
	@JavadocExclude
	public static long nalcCreateContext(long deviceHandle, long attrList) {
		long __functionAddress = getInstance().CreateContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(deviceHandle);
		return invokePPP(__functionAddress, deviceHandle, attrList);
	}

	/**
	 * Creates an AL context.
	 *
	 * @param deviceHandle a valid device
	 * @param attrList     null or a zero terminated list of integer pairs composed of valid ALC attribute tokens and requested values. One of:<br>{@link #ALC_FREQUENCY FREQUENCY}, {@link #ALC_REFRESH REFRESH}, {@link #ALC_SYNC SYNC}, {@link ALC11#ALC_MONO_SOURCES MONO_SOURCES}, {@link ALC11#ALC_STEREO_SOURCES STEREO_SOURCES}
	 */
	public static long alcCreateContext(long deviceHandle, ByteBuffer attrList) {
		if ( LWJGLUtil.CHECKS )
			if ( attrList != null ) checkNT4(attrList);
		return nalcCreateContext(deviceHandle, memAddressSafe(attrList));
	}

	/** Alternative version of: {@link #alcCreateContext CreateContext} */
	public static long alcCreateContext(long deviceHandle, IntBuffer attrList) {
		if ( LWJGLUtil.CHECKS )
			if ( attrList != null ) checkNT(attrList);
		return nalcCreateContext(deviceHandle, memAddressSafe(attrList));
	}

	// --- [ alcMakeContextCurrent ] ---

	/**
	 * Makes a context current with respect to OpenAL operation.
	 * 
	 * <p>The context parameter can be NULL or a valid context pointer. Using NULL results in no context being current, which is useful when shutting OpenAL down.
	 * The operation will apply to the device that the context was created for.</p>
	 * 
	 * <p>For each OS process (usually this means for each application), only one context can be current at any given time. All AL commands apply to the current
	 * context. Commands that affect objects shared among contexts (e.g. buffers) have side effects on other contexts.</p>
	 *
	 * @param context the context to make current
	 */
	public static boolean alcMakeContextCurrent(long context) {
		long __functionAddress = getInstance().MakeContextCurrent;
		return invokePZ(__functionAddress, context);
	}

	// --- [ alcProcessContext ] ---

	/**
	 * The current context is the only context accessible to state changes by AL commands (aside from state changes affecting shared objects). However,
	 * multiple contexts can be processed at the same time. To indicate that a context should be processed (i.e. that internal execution state such as the
	 * offset increments are to be performed), the application uses {@code alcProcessContext}.
	 * 
	 * <p>Repeated calls to alcProcessContext are legal, and do not affect a context that is already marked as processing. The default state of a context created
	 * by alcCreateContext is that it is processing.</p>
	 *
	 * @param context the context to mark for processing
	 */
	public static void alcProcessContext(long context) {
		long __functionAddress = getInstance().ProcessContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		invokePV(__functionAddress, context);
	}

	// --- [ alcSuspendContext ] ---

	/**
	 * The application can suspend any context from processing (including the current one). To indicate that a context should be suspended from processing
	 * (i.e. that internal execution state such as offset increments are not to be changed), the application uses {@code alcSuspendContext}.
	 * 
	 * <p>Repeated calls to alcSuspendContext are legal, and do not affect a context that is already marked as suspended.</p>
	 *
	 * @param context the context to mark as suspended
	 */
	public static void alcSuspendContext(long context) {
		long __functionAddress = getInstance().SuspendContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		invokePV(__functionAddress, context);
	}

	// --- [ alcDestroyContext ] ---

	/**
	 * Destroys a context.
	 * 
	 * <p>The correct way to destroy a context is to first release it using alcMakeCurrent with a NULL context. Applications should not attempt to destroy a
	 * current context – doing so will not work and will result in an ALC_INVALID_OPERATION error. All sources within a context will automatically be deleted
	 * during context destruction.</p>
	 *
	 * @param context the context to destroy
	 */
	public static void alcDestroyContext(long context) {
		long __functionAddress = getInstance().DestroyContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		invokePV(__functionAddress, context);
	}

	// --- [ alcGetCurrentContext ] ---

	/** Queries for, and obtains a handle to, the current context for the application. If there is no current context, NULL is returned. */
	public static long alcGetCurrentContext() {
		long __functionAddress = getInstance().GetCurrentContext;
		return invokeP(__functionAddress);
	}

	// --- [ alcGetContextsDevice ] ---

	/**
	 * Queries for, and obtains a handle to, the device of a given context.
	 *
	 * @param context the context to query
	 */
	public static long alcGetContextsDevice(long context) {
		long __functionAddress = getInstance().GetContextsDevice;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return invokePP(__functionAddress, context);
	}

	// --- [ alcIsExtensionPresent ] ---

	/** Unsafe version of {@link #alcIsExtensionPresent IsExtensionPresent} */
	@JavadocExclude
	public static boolean nalcIsExtensionPresent(long deviceHandle, long extName) {
		long __functionAddress = getInstance().IsExtensionPresent;
		return invokePPZ(__functionAddress, deviceHandle, extName);
	}

	/**
	 * Verifies that a given extension is available for the current context and the device it is associated with.
	 * 
	 * <p>Invalid and unsupported string tokens return ALC_FALSE. A NULL deviceHandle is acceptable. {@code extName} is not case sensitive – the implementation
	 * will convert the name to all upper-case internally (and will express extension names in upper-case).</p>
	 *
	 * @param deviceHandle the device to query
	 * @param extName      the extension name
	 */
	public static boolean alcIsExtensionPresent(long deviceHandle, ByteBuffer extName) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(extName);
		return nalcIsExtensionPresent(deviceHandle, memAddress(extName));
	}

	/** CharSequence version of: {@link #alcIsExtensionPresent IsExtensionPresent} */
	public static boolean alcIsExtensionPresent(long deviceHandle, CharSequence extName) {
		APIBuffer __buffer = apiBuffer();
		int extNameEncoded = __buffer.stringParamASCII(extName, true);
		return nalcIsExtensionPresent(deviceHandle, __buffer.address(extNameEncoded));
	}

	// --- [ alcGetProcAddress ] ---

	/** Unsafe version of {@link #alcGetProcAddress GetProcAddress} */
	@JavadocExclude
	public static long nalcGetProcAddress(long deviceHandle, long funcName) {
		long __functionAddress = getInstance().GetProcAddress;
		return invokePPP(__functionAddress, deviceHandle, funcName);
	}

	/**
	 * Retrieves extension entry points.
	 * 
	 * <p>The application is expected to verify the applicability of an extension or core function entry point before requesting it by name, by use of
	 * {@link #alcIsExtensionPresent IsExtensionPresent}.</p>
	 * 
	 * <p>Entry points can be device specific, but are not context specific. Using a NULL device handle does not guarantee that the entry point is returned, even
	 * if available for one of the available devices.</p>
	 *
	 * @param deviceHandle the device to query
	 * @param funcName     the function name
	 */
	public static long alcGetProcAddress(long deviceHandle, ByteBuffer funcName) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(funcName);
		return nalcGetProcAddress(deviceHandle, memAddress(funcName));
	}

	/** CharSequence version of: {@link #alcGetProcAddress GetProcAddress} */
	public static long alcGetProcAddress(long deviceHandle, CharSequence funcName) {
		APIBuffer __buffer = apiBuffer();
		int funcNameEncoded = __buffer.stringParamASCII(funcName, true);
		return nalcGetProcAddress(deviceHandle, __buffer.address(funcNameEncoded));
	}

	// --- [ alcGetEnumValue ] ---

	/** Unsafe version of {@link #alcGetEnumValue GetEnumValue} */
	@JavadocExclude
	public static int nalcGetEnumValue(long deviceHandle, long enumName) {
		long __functionAddress = getInstance().GetEnumValue;
		return invokePPI(__functionAddress, deviceHandle, enumName);
	}

	/**
	 * Returns extension enum values.
	 * 
	 * <p>Enumeration/token values are device independent, but tokens defined for extensions might not be present for a given device. Using a NULL handle is
	 * legal, but only the tokens defined by the AL core are guaranteed. Availability of extension tokens depends on the ALC extension.</p>
	 *
	 * @param deviceHandle the device to query
	 * @param enumName     the enum name
	 */
	public static int alcGetEnumValue(long deviceHandle, ByteBuffer enumName) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(enumName);
		return nalcGetEnumValue(deviceHandle, memAddress(enumName));
	}

	/** CharSequence version of: {@link #alcGetEnumValue GetEnumValue} */
	public static int alcGetEnumValue(long deviceHandle, CharSequence enumName) {
		APIBuffer __buffer = apiBuffer();
		int enumNameEncoded = __buffer.stringParamASCII(enumName, true);
		return nalcGetEnumValue(deviceHandle, __buffer.address(enumNameEncoded));
	}

	// --- [ alcGetError ] ---

	/**
	 * Queries ALC errors.
	 * 
	 * <p>ALC uses the same conventions and mechanisms as AL for error handling. In particular, ALC does not use conventions derived from X11 (GLX) or Windows
	 * (WGL).</p>
	 * 
	 * <p>Error conditions are specific to the device, and (like AL) a call to alcGetError resets the error state.</p>
	 *
	 * @param deviceHandle the device to query
	 */
	public static int alcGetError(long deviceHandle) {
		long __functionAddress = getInstance().GetError;
		if ( LWJGLUtil.CHECKS )
			checkPointer(deviceHandle);
		return invokePI(__functionAddress, deviceHandle);
	}

	// --- [ alcGetString ] ---

	/** Unsafe version of {@link #alcGetString GetString} */
	@JavadocExclude
	public static long nalcGetString(long deviceHandle, int token) {
		long __functionAddress = getInstance().GetString;
		return invokePIP(__functionAddress, deviceHandle, token);
	}

	/**
	 * Obtains string value(s) from ALC.
	 * 
	 * <p><b>LWJGL note</b>: Use {@link ALC#getStringList} for those tokens that return multiple values.</p>
	 *
	 * @param deviceHandle the device to query
	 * @param token        the information to query. One of:<br>{@link #ALC_DEFAULT_DEVICE_SPECIFIER DEFAULT_DEVICE_SPECIFIER}, {@link #ALC_DEVICE_SPECIFIER DEVICE_SPECIFIER}, {@link #ALC_EXTENSIONS EXTENSIONS}, {@link ALC11#ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER CAPTURE_DEFAULT_DEVICE_SPECIFIER}, {@link ALC11#ALC_CAPTURE_DEVICE_SPECIFIER CAPTURE_DEVICE_SPECIFIER}
	 */
	public static String alcGetString(long deviceHandle, int token) {
		long __result = nalcGetString(deviceHandle, token);
		return memDecodeUTF8(__result);
	}

	// --- [ alcGetIntegerv ] ---

	/** Unsafe version of {@link #alcGetIntegerv GetIntegerv} */
	@JavadocExclude
	public static void nalcGetIntegerv(long deviceHandle, int token, int size, long dest) {
		long __functionAddress = getInstance().GetIntegerv;
		invokePIIPV(__functionAddress, deviceHandle, token, size, dest);
	}

	/**
	 * Obtains integer value(s) from ALC.
	 *
	 * @param deviceHandle the device to query
	 * @param token        the information to query. One of:<br>{@link #ALC_MAJOR_VERSION MAJOR_VERSION}, {@link #ALC_MINOR_VERSION MINOR_VERSION}, {@link #ALC_ATTRIBUTES_SIZE ATTRIBUTES_SIZE}, {@link #ALC_ALL_ATTRIBUTES ALL_ATTRIBUTES}, {@link ALC11#ALC_CAPTURE_SAMPLES CAPTURE_SAMPLES}
	 * @param size         the size of the {@code dest} buffer
	 * @param dest         the destination buffer
	 */
	public static void alcGetIntegerv(long deviceHandle, int token, int size, ByteBuffer dest) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dest, size << 2);
		nalcGetIntegerv(deviceHandle, token, size, memAddress(dest));
	}

	/** Alternative version of: {@link #alcGetIntegerv GetIntegerv} */
	public static void alcGetIntegerv(long deviceHandle, int token, IntBuffer dest) {
		nalcGetIntegerv(deviceHandle, token, dest.remaining(), memAddress(dest));
	}

	/** Single return value version of: {@link #alcGetIntegerv GetIntegerv} */
	public static int alcGetInteger(long deviceHandle, int token) {
		APIBuffer __buffer = apiBuffer();
		int dest = __buffer.intParam();
		nalcGetIntegerv(deviceHandle, token, 1, __buffer.address(dest));
		return __buffer.intValue(dest);
	}

}