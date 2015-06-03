/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://kcat.strangesoft.net/openal-extensions/SOFT_pause_device.txt">SOFT_pause_device</a> extension.
 * 
 * <p>This extension allows applications to pause a playback device. The main purpose of this is to silence output, stop processing, and allow the audio
 * hardware to go into a low-power mode. On a mobile device, for instance, apps may want to silence output and not waste battery life with unneeded
 * processing when in the background.</p>
 */
public final class SOFTPauseDevice {

	/** Function address. */
	@JavadocExclude
	public final long
		DevicePauseSOFT,
		DeviceResumeSOFT;

	@JavadocExclude
	public SOFTPauseDevice(FunctionProviderLocal provider, long device) {
		DevicePauseSOFT = provider.getFunctionAddress(device, "alcDevicePauseSOFT");
		DeviceResumeSOFT = provider.getFunctionAddress(device, "alcDeviceResumeSOFT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link SOFTPauseDevice} instance for the current context. */
	public static SOFTPauseDevice getInstance() {
		return checkFunctionality(ALC.getCapabilities().__SOFTPauseDevice);
	}

	static SOFTPauseDevice create(java.util.Set<String> ext, FunctionProviderLocal provider, long device) {
		if ( !ext.contains("ALC_SOFT_pause_device") ) return null;

		SOFTPauseDevice funcs = new SOFTPauseDevice(provider, device);

		boolean supported = checkFunctions(
			funcs.DevicePauseSOFT, funcs.DeviceResumeSOFT
		);

		return ALC.checkExtension("ALC_SOFT_pause_device", funcs, supported);
	}

	// --- [ alcDevicePauseSOFT ] ---

	/** JNI method for {@link #alcDevicePauseSOFT DevicePauseSOFT} */
	@JavadocExclude
	public static native void nalcDevicePauseSOFT(long device, long __functionAddress);

	/**
	 * Pauses a playback device.
	 * 
	 * <p>When paused, no contexts associated with the device will be processed or updated. Playing sources will not produce sound, have their offsets
	 * incremented, or process any more buffers, until the device is resumed. Pausing a device that is already paused is a legal no-op.</p>
	 *
	 * @param device the device to pause
	 */
	public static void alcDevicePauseSOFT(long device) {
		long __functionAddress = getInstance().DevicePauseSOFT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		nalcDevicePauseSOFT(device, __functionAddress);
	}

	// --- [ alcDeviceResumeSOFT ] ---

	/** JNI method for {@link #alcDeviceResumeSOFT DeviceResumeSOFT} */
	@JavadocExclude
	public static native void nalcDeviceResumeSOFT(long device, long __functionAddress);

	/**
	 * Resumes playback of a paused device.
	 * 
	 * <p>This will restart processing on the device -- sources will resume playing sound as normal. Resuming playback on a device that is not paused is a legal
	 * no-op.</p>
	 * 
	 * <p>These functions are not reference counted. alcDeviceResumeSOFT only needs to be called once to resume playback, regardless of how many times
	 * {@link #alcDevicePauseSOFT DevicePauseSOFT} was called.</p>
	 *
	 * @param device the device to resume
	 */
	public static void alcDeviceResumeSOFT(long device) {
		long __functionAddress = getInstance().DeviceResumeSOFT;
		if ( LWJGLUtil.CHECKS )
			checkPointer(device);
		nalcDeviceResumeSOFT(device, __functionAddress);
	}

}