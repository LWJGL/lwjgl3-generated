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

/** Native bindings to ALC 1.1 functionality. */
public final class ALC11 {

	/** Context creation attributes. */
	public static final int
		ALC_MONO_SOURCES   = 0x1010,
		ALC_STEREO_SOURCES = 0x1011;

	/** String queries. */
	public static final int
		ALC_DEFAULT_ALL_DEVICES_SPECIFIER    = 0x1012,
		ALC_ALL_DEVICES_SPECIFIER            = 0x1013,
		ALC_CAPTURE_DEVICE_SPECIFIER         = 0x310,
		ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;

	/** Integer queries. */
	public static final int ALC_CAPTURE_SAMPLES = 0x312;

	/** Function address. */
	@JavadocExclude
	public final long
		CaptureOpenDevice,
		CaptureCloseDevice,
		CaptureStart,
		CaptureStop,
		CaptureSamples;

	@JavadocExclude
	public ALC11(FunctionProviderLocal provider) {
		CaptureOpenDevice = provider.getFunctionAddress("alcCaptureOpenDevice");
		CaptureCloseDevice = provider.getFunctionAddress("alcCaptureCloseDevice");
		CaptureStart = provider.getFunctionAddress("alcCaptureStart");
		CaptureStop = provider.getFunctionAddress("alcCaptureStop");
		CaptureSamples = provider.getFunctionAddress("alcCaptureSamples");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ALC11} instance for the current context. */
	public static ALC11 getInstance() {
		return checkFunctionality(ALC.getCapabilities().__ALC11);
	}

	static ALC11 create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("OpenALC11") ) return null;

		ALC11 funcs = new ALC11(provider);

		boolean supported = checkFunctions(
			funcs.CaptureOpenDevice, funcs.CaptureCloseDevice, funcs.CaptureStart, funcs.CaptureStop, funcs.CaptureSamples
		);

		return ALC.checkExtension("OpenALC11", funcs, supported);
	}

	// --- [ alcCaptureOpenDevice ] ---

	/** JNI method for {@link #alcCaptureOpenDevice CaptureOpenDevice} */
	@JavadocExclude
	public static native long nalcCaptureOpenDevice(long devicename, int frequency, int format, int buffersize, long __functionAddress);

	/** Unsafe version of {@link #alcCaptureOpenDevice CaptureOpenDevice} */
	@JavadocExclude
	public static long nalcCaptureOpenDevice(long devicename, int frequency, int format, int buffersize) {
		long __functionAddress = getInstance().CaptureOpenDevice;
		return nalcCaptureOpenDevice(devicename, frequency, format, buffersize, __functionAddress);
	}

	/**
	 * Allows the application to connect to a capture device.
	 * 
	 * <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If NULL is specified, the implementation
	 * will provide an implementation specific default.</p>
	 *
	 * @param devicename the device or device configuration
	 * @param frequency  the audio frequency
	 * @param format     the audio format
	 * @param buffersize the number of sample frame to buffer in the AL
	 */
	public static long alcCaptureOpenDevice(ByteBuffer devicename, int frequency, int format, int buffersize) {
		if ( LWJGLUtil.CHECKS )
			if ( devicename != null ) checkNT1(devicename);
		return nalcCaptureOpenDevice(memAddressSafe(devicename), frequency, format, buffersize);
	}

	/** CharSequence version of: {@link #alcCaptureOpenDevice CaptureOpenDevice} */
	public static long alcCaptureOpenDevice(CharSequence devicename, int frequency, int format, int buffersize) {
		APIBuffer __buffer = apiBuffer();
		int devicenameEncoded = __buffer.stringParamUTF8(devicename, true);
		return nalcCaptureOpenDevice(__buffer.addressSafe(devicename, devicenameEncoded), frequency, format, buffersize);
	}

	// --- [ alcCaptureCloseDevice ] ---

	/** JNI method for {@link #alcCaptureCloseDevice CaptureCloseDevice} */
	@JavadocExclude
	public static native boolean nalcCaptureCloseDevice(long device, long __functionAddress);

	/**
	 * Allows the application to disconnect from a capture device.
	 *
	 * @param device the capture device to close
	 */
	public static boolean alcCaptureCloseDevice(long device) {
		long __functionAddress = getInstance().CaptureCloseDevice;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		return nalcCaptureCloseDevice(device, __functionAddress);
	}

	// --- [ alcCaptureStart ] ---

	/** JNI method for {@link #alcCaptureStart CaptureStart} */
	@JavadocExclude
	public static native void nalcCaptureStart(long device, long __functionAddress);

	/**
	 * Starts recording audio on the specific capture device.
	 * 
	 * <p>Once started, the device will record audio to an internal ring buffer, the size of which was specified when opening the device. The application may
	 * query the capture device to discover how much data is currently available via the alcGetInteger with the ALC_CAPTURE_SAMPLES token. This will report the
	 * number of sample frames currently available.</p>
	 *
	 * @param device the capture device
	 */
	public static void alcCaptureStart(long device) {
		long __functionAddress = getInstance().CaptureStart;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		nalcCaptureStart(device, __functionAddress);
	}

	// --- [ alcCaptureStop ] ---

	/** JNI method for {@link #alcCaptureStop CaptureStop} */
	@JavadocExclude
	public static native void nalcCaptureStop(long device, long __functionAddress);

	/**
	 * Halts audio capturing without closing the capture device.
	 * 
	 * <p>The implementation is encouraged to optimize for this case. The amount of audio samples available after restarting a stopped capture device is reset to
	 * zero. The application does not need to stop the capture device to read from it.</p>
	 *
	 * @param device the capture device
	 */
	public static void alcCaptureStop(long device) {
		long __functionAddress = getInstance().CaptureStop;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		nalcCaptureStop(device, __functionAddress);
	}

	// --- [ alcCaptureSamples ] ---

	/** JNI method for {@link #alcCaptureSamples CaptureSamples} */
	@JavadocExclude
	public static native void nalcCaptureSamples(long device, long buffer, int samples, long __functionAddress);

	/** Unsafe version of {@link #alcCaptureSamples CaptureSamples} */
	@JavadocExclude
	public static void nalcCaptureSamples(long device, long buffer, int samples) {
		long __functionAddress = getInstance().CaptureSamples;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		nalcCaptureSamples(device, buffer, samples, __functionAddress);
	}

	/**
	 * Obtains captured audio samples from the AL.
	 * 
	 * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
	 *
	 * @param device  the capture device
	 * @param buffer  the buffer that will receive the samples
	 * @param samples the buffer size
	 */
	public static void alcCaptureSamples(long device, ByteBuffer buffer, int samples) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffer, samples);
		nalcCaptureSamples(device, memAddress(buffer), samples);
	}

	/** Alternative version of: {@link #alcCaptureSamples CaptureSamples} */
	public static void alcCaptureSamples(long device, ByteBuffer buffer) {
		nalcCaptureSamples(device, memAddress(buffer), buffer.remaining());
	}

}