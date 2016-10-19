/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the {@code ALC_EXT_CAPTURE} extension.
 * 
 * <p>An OpenAL 1.1 implementation will always support the {@code ALC_EXT_CAPTURE} extension. This allows an application written to the OpenAL 1.0 specification to
 * access the capture abilities.</p>
 */
public class EXTCapture {

	/** String queries. */
	public static final int
		ALC_CAPTURE_DEVICE_SPECIFIER         = 0x310,
		ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;

	/** Integer queries. */
	public static final int ALC_CAPTURE_SAMPLES = 0x312;

	protected EXTCapture() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(ALCCapabilities caps) {
		return checkFunctions(
			caps.alcCaptureOpenDevice, caps.alcCaptureCloseDevice, caps.alcCaptureStart, caps.alcCaptureStop, caps.alcCaptureSamples
		);
	}

	// --- [ alcCaptureOpenDevice ] ---

	/** Unsafe version of: {@link #alcCaptureOpenDevice CaptureOpenDevice} */
	public static long nalcCaptureOpenDevice(long devicename, int frequency, int format, int buffersize) {
		long __functionAddress = ALC.getICD().alcCaptureOpenDevice;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return invokePP(__functionAddress, devicename, frequency, format, buffersize);
	}

	/**
	 * Allows the application to connect to a capture device.
	 * 
	 * <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation
	 * will provide an implementation specific default.</p>
	 *
	 * @param devicename the device or device configuration
	 * @param frequency  the audio frequency
	 * @param format     the audio format
	 * @param buffersize the number of sample frame to buffer in the AL
	 */
	public static long alcCaptureOpenDevice(ByteBuffer devicename, int frequency, int format, int buffersize) {
		if ( CHECKS )
			checkNT1Safe(devicename);
		return nalcCaptureOpenDevice(memAddressSafe(devicename), frequency, format, buffersize);
	}

	/**
	 * Allows the application to connect to a capture device.
	 * 
	 * <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation
	 * will provide an implementation specific default.</p>
	 *
	 * @param devicename the device or device configuration
	 * @param frequency  the audio frequency
	 * @param format     the audio format
	 * @param buffersize the number of sample frame to buffer in the AL
	 */
	public static long alcCaptureOpenDevice(CharSequence devicename, int frequency, int format, int buffersize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer devicenameEncoded = stack.UTF8(devicename);
			return nalcCaptureOpenDevice(memAddressSafe(devicenameEncoded), frequency, format, buffersize);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alcCaptureCloseDevice ] ---

	/**
	 * Allows the application to disconnect from a capture device.
	 *
	 * @param device the capture device to close
	 */
	public static boolean alcCaptureCloseDevice(long device) {
		long __functionAddress = ALC.getICD().alcCaptureCloseDevice;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		return invokePZ(__functionAddress, device);
	}

	// --- [ alcCaptureStart ] ---

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
		long __functionAddress = ALC.getICD().alcCaptureStart;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		invokePV(__functionAddress, device);
	}

	// --- [ alcCaptureStop ] ---

	/**
	 * Halts audio capturing without closing the capture device.
	 * 
	 * <p>The implementation is encouraged to optimize for this case. The amount of audio samples available after restarting a stopped capture device is reset to
	 * zero. The application does not need to stop the capture device to read from it.</p>
	 *
	 * @param device the capture device
	 */
	public static void alcCaptureStop(long device) {
		long __functionAddress = ALC.getICD().alcCaptureStop;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		invokePV(__functionAddress, device);
	}

	// --- [ alcCaptureSamples ] ---

	/**
	 * Unsafe version of: {@link #alcCaptureSamples CaptureSamples}
	 *
	 * @param samples the buffer size
	 */
	public static void nalcCaptureSamples(long device, long buffer, int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(device);
		}
		invokePPV(__functionAddress, device, buffer, samples);
	}

	/**
	 * Obtains captured audio samples from the AL.
	 * 
	 * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
	 *
	 * @param device the capture device
	 * @param buffer the buffer that will receive the samples
	 */
	public static void alcCaptureSamples(long device, ByteBuffer buffer) {
		nalcCaptureSamples(device, memAddress(buffer), buffer.remaining());
	}

}