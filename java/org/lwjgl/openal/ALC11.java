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
	public static final int
		ALC_CAPTURE_SAMPLES = 0x312;

	private ALC11() {}

	// --- [ alcCaptureOpenDevice ] ---

	/** JNI method for {@link #alcCaptureOpenDevice alcCaptureOpenDevice} */
	public static native long nalcCaptureOpenDevice(long devicename, int frequency, int format, int buffersize, long __functionAddress);

	/**
	 * Allows the application to connect to a capture device.
	 * <p/>
	 * The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If NULL is specified, the implementation
	 * will provide an implementation specific default.
	 *
	 * @param devicename the device or device configuration
	 * @param frequency  the audio frequency
	 * @param format     the audio format
	 * @param buffersize the number of sample frame to buffer in the AL
	 */
	public static long alcCaptureOpenDevice(ByteBuffer devicename, int frequency, int format, int buffersize) {
		long __functionAddress = getInstance().alcCaptureOpenDevice;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( devicename != null ) checkNT1(devicename);
		}
		return nalcCaptureOpenDevice(memAddressSafe(devicename), frequency, format, buffersize, __functionAddress);
	}

	/** CharSequence version of: {@link #alcCaptureOpenDevice alcCaptureOpenDevice} */
	public static long alcCaptureOpenDevice(CharSequence devicename, int frequency, int format, int buffersize) {
		long __functionAddress = getInstance().alcCaptureOpenDevice;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcCaptureOpenDevice(memAddressSafe(memEncodeUTF8(devicename)), frequency, format, buffersize, __functionAddress);
	}

	// --- [ alcCaptureCloseDevice ] ---

	/** JNI method for {@link #alcCaptureCloseDevice alcCaptureCloseDevice} */
	public static native boolean nalcCaptureCloseDevice(long device, long __functionAddress);

	/**
	 * Allows the application to disconnect from a capture device.
	 *
	 * @param device the capture device to close
	 */
	public static boolean alcCaptureCloseDevice(long device) {
		long __functionAddress = getInstance().alcCaptureCloseDevice;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return nalcCaptureCloseDevice(device, __functionAddress);
	}

	// --- [ alcCaptureStart ] ---

	/** JNI method for {@link #alcCaptureStart alcCaptureStart} */
	public static native void nalcCaptureStart(long device, long __functionAddress);

	/**
	 * Starts recording audio on the specific capture device.
	 * <p/>
	 * Once started, the device will record audio to an internal ring buffer, the size of which was specified when opening the device. The application may
	 * query the capture device to discover how much data is currently available via the alcGetInteger with the ALC_CAPTURE_SAMPLES token. This will report the
	 * number of sample frames currently available.
	 *
	 * @param device the capture device
	 */
	public static void alcCaptureStart(long device) {
		long __functionAddress = getInstance().alcCaptureStart;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		nalcCaptureStart(device, __functionAddress);
	}

	// --- [ alcCaptureStop ] ---

	/** JNI method for {@link #alcCaptureStop alcCaptureStop} */
	public static native void nalcCaptureStop(long device, long __functionAddress);

	/**
	 * Halts audio capturing without closing the capture device.
	 * <p/>
	 * The implementation is encouraged to optimize for this case. The amount of audio samples available after restarting a stopped capture device is reset to
	 * zero. The application does not need to stop the capture device to read from it.
	 *
	 * @param device the capture device
	 */
	public static void alcCaptureStop(long device) {
		long __functionAddress = getInstance().alcCaptureStop;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		nalcCaptureStop(device, __functionAddress);
	}

	// --- [ alcCaptureSamples ] ---

	/** JNI method for {@link #alcCaptureSamples alcCaptureSamples} */
	public static native void nalcCaptureSamples(long device, long buffer, int samples, long __functionAddress);

	/**
	 * Obtains captured audio samples from the AL.
	 * <p/>
	 * The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.
	 *
	 * @param device  the capture device
	 * @param buffer  the buffer that will receive the samples
	 * @param samples the buffer size
	 */
	public static void alcCaptureSamples(long device, ByteBuffer buffer, int samples) {
		long __functionAddress = getInstance().alcCaptureSamples;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
			checkBuffer(buffer, samples);
		}
		nalcCaptureSamples(device, memAddress(buffer), samples, __functionAddress);
	}

	/** Alternative version of: {@link #alcCaptureSamples alcCaptureSamples} */
	public static void alcCaptureSamples(long device, ByteBuffer buffer) {
		long __functionAddress = getInstance().alcCaptureSamples;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		nalcCaptureSamples(device, memAddress(buffer), buffer.remaining(), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return ALC.getCapabilities().__ALC11;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider) {		if ( !ext.contains("OpenALC11") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.alcCaptureOpenDevice != 0L &&
			funcs.alcCaptureCloseDevice != 0L &&
			funcs.alcCaptureStart != 0L &&
			funcs.alcCaptureStop != 0L &&
			funcs.alcCaptureSamples != 0L;

		return ALC.checkExtension("OpenALC11", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code ALC11}. */
	public static final class Functions implements FunctionMap {

		public final long
			alcCaptureOpenDevice,
			alcCaptureCloseDevice,
			alcCaptureStart,
			alcCaptureStop,
			alcCaptureSamples;

		public Functions(FunctionProviderLocal provider) {
			alcCaptureOpenDevice = provider.getFunctionAddress("alcCaptureOpenDevice");
			alcCaptureCloseDevice = provider.getFunctionAddress("alcCaptureCloseDevice");
			alcCaptureStart = provider.getFunctionAddress("alcCaptureStart");
			alcCaptureStop = provider.getFunctionAddress("alcCaptureStop");
			alcCaptureSamples = provider.getFunctionAddress("alcCaptureSamples");
		}

	}

}