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

/** Native bindings to ALC 1.1 functionality. */
public class ALC11 {

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

    protected ALC11() {
        throw new UnsupportedOperationException();
    }

	static boolean isAvailable(ALCCapabilities caps) {
		return checkFunctions(
            caps.alcCaptureOpenDevice, caps.alcCaptureCloseDevice, caps.alcCaptureStart, caps.alcCaptureStop, caps.alcCaptureSamples
        );
	}

    // --- [ alcCaptureOpenDevice ] ---

    /** Unsafe version of: {@link #alcCaptureOpenDevice CaptureOpenDevice} */
    public static long nalcCaptureOpenDevice(long deviceName, int frequency, int format, int samples) {
		long __functionAddress = ALC.getICD().alcCaptureOpenDevice;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(__functionAddress, deviceName, frequency, format, samples);
    }

    /**
     * Allows the application to connect to a capture device.
     * 
     * <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation
     * will provide an implementation specific default.</p>
     *
     * @param deviceName the device or device configuration
     * @param frequency  the audio frequency
     * @param format     the audio format
     * @param samples    the number of sample frames to buffer in the AL
     */
    public static long alcCaptureOpenDevice(ByteBuffer deviceName, int frequency, int format, int samples) {
        if (CHECKS) {
            checkNT1Safe(deviceName);
        }
        return nalcCaptureOpenDevice(memAddressSafe(deviceName), frequency, format, samples);
    }

    /**
     * Allows the application to connect to a capture device.
     * 
     * <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation
     * will provide an implementation specific default.</p>
     *
     * @param deviceName the device or device configuration
     * @param frequency  the audio frequency
     * @param format     the audio format
     * @param samples    the number of sample frames to buffer in the AL
     */
    public static long alcCaptureOpenDevice(CharSequence deviceName, int frequency, int format, int samples) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer deviceNameEncoded = stack.UTF8(deviceName);
            return nalcCaptureOpenDevice(memAddressSafe(deviceNameEncoded), frequency, format, samples);
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
        if (CHECKS) {
            check(__functionAddress);
            check(device);
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
        if (CHECKS) {
            check(__functionAddress);
            check(device);
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
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePV(__functionAddress, device);
    }

    // --- [ alcCaptureSamples ] ---

    /** Unsafe version of: {@link #alcCaptureSamples CaptureSamples} */
    public static void nalcCaptureSamples(long device, long buffer, int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(__functionAddress, device, buffer, samples);
    }

    /**
     * Obtains captured audio samples from the AL.
     * 
     * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
     *
     * @param device  the capture device
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to obtain
     */
    public static void alcCaptureSamples(long device, ByteBuffer buffer, int samples) {
        nalcCaptureSamples(device, memAddress(buffer), samples);
    }

    /**
     * Obtains captured audio samples from the AL.
     * 
     * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
     *
     * @param device  the capture device
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to obtain
     */
    public static void alcCaptureSamples(long device, ShortBuffer buffer, int samples) {
        nalcCaptureSamples(device, memAddress(buffer), samples);
    }

    /**
     * Obtains captured audio samples from the AL.
     * 
     * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
     *
     * @param device  the capture device
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to obtain
     */
    public static void alcCaptureSamples(long device, IntBuffer buffer, int samples) {
        nalcCaptureSamples(device, memAddress(buffer), samples);
    }

    /**
     * Obtains captured audio samples from the AL.
     * 
     * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
     *
     * @param device  the capture device
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to obtain
     */
    public static void alcCaptureSamples(long device, FloatBuffer buffer, int samples) {
        nalcCaptureSamples(device, memAddress(buffer), samples);
    }

    /** Array version of: {@link #alcCaptureSamples CaptureSamples} */
    public static void alcCaptureSamples(long device, short[] buffer, int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(__functionAddress, device, buffer, samples);
    }

    /** Array version of: {@link #alcCaptureSamples CaptureSamples} */
    public static void alcCaptureSamples(long device, int[] buffer, int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(__functionAddress, device, buffer, samples);
    }

    /** Array version of: {@link #alcCaptureSamples CaptureSamples} */
    public static void alcCaptureSamples(long device, float[] buffer, int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(__functionAddress, device, buffer, samples);
    }

}