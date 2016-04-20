/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of the OpenAL Context API. */
public final class ALCCapabilities {

	public final long
		alcCaptureCloseDevice,
		alcCaptureOpenDevice,
		alcCaptureSamples,
		alcCaptureStart,
		alcCaptureStop,
		alcCloseDevice,
		alcCreateContext,
		alcDestroyContext,
		alcDevicePauseSOFT,
		alcDeviceResumeSOFT,
		alcGetContextsDevice,
		alcGetCurrentContext,
		alcGetEnumValue,
		alcGetError,
		alcGetIntegerv,
		alcGetProcAddress,
		alcGetString,
		alcGetStringiSOFT,
		alcGetThreadContext,
		alcIsExtensionPresent,
		alcIsRenderFormatSupportedSOFT,
		alcLoopbackOpenDeviceSOFT,
		alcMakeContextCurrent,
		alcOpenDevice,
		alcProcessContext,
		alcRenderSamplesSOFT,
		alcResetDeviceSOFT,
		alcSetThreadContext,
		alcSuspendContext;

	/** When true, {@link ALC10} is supported. */
	public final boolean OpenALC10;
	/** When true, {@link ALC11} is supported. */
	public final boolean OpenALC11;
	/** When true, {@link EnumerateAllExt} is supported. */
	public final boolean ALC_ENUMERATE_ALL_EXT;
	/**
	 * An OpenAL 1.1 implementation will always support the {@code ALC_ENUMERATION_EXT} extension. This extension provides for enumeration of the available OpenAL devices
	 * through {@link ALC10#alcGetString GetString}. An {@link ALC10#alcGetString GetString} query of {@link ALC10#ALC_DEVICE_SPECIFIER DEVICE_SPECIFIER} with a {@code NULL} device passed in will return a list of devices. Each
	 * device name will be separated by a single {@code NULL} character and the list will be terminated with two {@code NULL} characters.
	 */
	public final boolean ALC_ENUMERATION_EXT;
	/** When true, {@link EXTCapture} is supported. */
	public final boolean ALC_EXT_CAPTURE;
	/** When true, {@link EXTDedicated} is supported. */
	public final boolean ALC_EXT_DEDICATED;
	/** When true, {@link EXTDefaultFilterOrder} is supported. */
	public final boolean ALC_EXT_DEFAULT_FILTER_ORDER;
	/** When true, {@link EXTDisconnect} is supported. */
	public final boolean ALC_EXT_disconnect;
	/** When true, {@link EXTEfx} is supported. */
	public final boolean ALC_EXT_EFX;
	/** When true, {@link EXTThreadLocalContext} is supported. */
	public final boolean ALC_EXT_thread_local_context;
	/** When true, {@link LOKIAudioChannel} is supported. */
	public final boolean ALC_LOKI_audio_channel;
	/** When true, {@link SOFTHRTF} is supported. */
	public final boolean ALC_SOFT_HRTF;
	/** When true, {@link SOFTLoopback} is supported. */
	public final boolean ALC_SOFT_loopback;
	/** When true, {@link SOFTPauseDevice} is supported. */
	public final boolean ALC_SOFT_pause_device;

	ALCCapabilities(FunctionProviderLocal provider, long device, Set<String> ext) {
		alcCaptureCloseDevice = provider.getFunctionAddress("alcCaptureCloseDevice");
		alcCaptureOpenDevice = provider.getFunctionAddress("alcCaptureOpenDevice");
		alcCaptureSamples = provider.getFunctionAddress("alcCaptureSamples");
		alcCaptureStart = provider.getFunctionAddress("alcCaptureStart");
		alcCaptureStop = provider.getFunctionAddress("alcCaptureStop");
		alcCloseDevice = provider.getFunctionAddress("alcCloseDevice");
		alcCreateContext = provider.getFunctionAddress("alcCreateContext");
		alcDestroyContext = provider.getFunctionAddress("alcDestroyContext");
		alcDevicePauseSOFT = provider.getFunctionAddress(device, "alcDevicePauseSOFT");
		alcDeviceResumeSOFT = provider.getFunctionAddress(device, "alcDeviceResumeSOFT");
		alcGetContextsDevice = provider.getFunctionAddress("alcGetContextsDevice");
		alcGetCurrentContext = provider.getFunctionAddress("alcGetCurrentContext");
		alcGetEnumValue = provider.getFunctionAddress("alcGetEnumValue");
		alcGetError = provider.getFunctionAddress("alcGetError");
		alcGetIntegerv = provider.getFunctionAddress("alcGetIntegerv");
		alcGetProcAddress = provider.getFunctionAddress("alcGetProcAddress");
		alcGetString = provider.getFunctionAddress("alcGetString");
		alcGetStringiSOFT = provider.getFunctionAddress(device, "alcGetStringiSOFT");
		alcGetThreadContext = provider.getFunctionAddress(device, "alcGetThreadContext");
		alcIsExtensionPresent = provider.getFunctionAddress("alcIsExtensionPresent");
		alcIsRenderFormatSupportedSOFT = provider.getFunctionAddress(device, "alcIsRenderFormatSupportedSOFT");
		alcLoopbackOpenDeviceSOFT = provider.getFunctionAddress(device, "alcLoopbackOpenDeviceSOFT");
		alcMakeContextCurrent = provider.getFunctionAddress("alcMakeContextCurrent");
		alcOpenDevice = provider.getFunctionAddress("alcOpenDevice");
		alcProcessContext = provider.getFunctionAddress("alcProcessContext");
		alcRenderSamplesSOFT = provider.getFunctionAddress(device, "alcRenderSamplesSOFT");
		alcResetDeviceSOFT = provider.getFunctionAddress(device, "alcResetDeviceSOFT");
		alcSetThreadContext = provider.getFunctionAddress(device, "alcSetThreadContext");
		alcSuspendContext = provider.getFunctionAddress("alcSuspendContext");

		OpenALC10 = ext.contains("OpenALC10") && ALC.checkExtension("OpenALC10", ALC10.isAvailable(this));
		OpenALC11 = ext.contains("OpenALC11") && ALC.checkExtension("OpenALC11", ALC11.isAvailable(this));
		ALC_ENUMERATE_ALL_EXT = ext.contains("ALC_ENUMERATE_ALL_EXT");
		ALC_ENUMERATION_EXT = ext.contains("ALC_ENUMERATION_EXT");
		ALC_EXT_CAPTURE = ext.contains("ALC_EXT_CAPTURE") && ALC.checkExtension("ALC_EXT_CAPTURE", EXTCapture.isAvailable(this));
		ALC_EXT_DEDICATED = ext.contains("ALC_EXT_DEDICATED");
		ALC_EXT_DEFAULT_FILTER_ORDER = ext.contains("ALC_EXT_DEFAULT_FILTER_ORDER");
		ALC_EXT_disconnect = ext.contains("ALC_EXT_disconnect");
		ALC_EXT_EFX = ext.contains("ALC_EXT_EFX");
		ALC_EXT_thread_local_context = ext.contains("ALC_EXT_thread_local_context") && ALC.checkExtension("ALC_EXT_thread_local_context", EXTThreadLocalContext.isAvailable(this));
		ALC_LOKI_audio_channel = ext.contains("ALC_LOKI_audio_channel");
		ALC_SOFT_HRTF = ext.contains("ALC_SOFT_HRTF") && ALC.checkExtension("ALC_SOFT_HRTF", SOFTHRTF.isAvailable(this));
		ALC_SOFT_loopback = ext.contains("ALC_SOFT_loopback") && ALC.checkExtension("ALC_SOFT_loopback", SOFTLoopback.isAvailable(this));
		ALC_SOFT_pause_device = ext.contains("ALC_SOFT_pause_device") && ALC.checkExtension("ALC_SOFT_pause_device", SOFTPauseDevice.isAvailable(this));
	}
}