/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** LibOVR error code declarations. */
public class OVRErrorCode {

	/** This is a general success result. */
	public static final int ovrSuccess = 0;

	/**
	 * Returned from a call to {@link OVR#ovr_SubmitFrame SubmitFrame}. The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app should
	 * continue calling {@link OVR#ovr_SubmitFrame SubmitFrame}, but not do any rendering. When the result becomes {@link #ovrSuccess Success}, rendering should continue as usual.
	 */
	public static final int ovrSuccess_NotVisible = 1000;

	/** The HMD Firmware is out of date but is acceptable. */
	public static final int ovrSuccess_HMDFirmwareMismatch = 4100;

	/** The Tracker Firmware is out of date but is acceptable. */
	public static final int ovrSuccess_TrackerFirmwareMismatch = 4101;

	/** The controller firmware is out of date but is acceptable. */
	public static final int ovrSuccess_ControllerFirmwareMismatch = 4104;

	/** The tracker driver interface was not found. Can be a temporary error. */
	public static final int ovrSuccess_TrackerDriverNotFound = 4105;

	/** Failure to allocate memory. */
	public static final int ovrError_MemoryAllocationFailure = -1000;

	/** Failure to create a socket. */
	public static final int ovrError_SocketCreationFailure = -1001;

	/** Invalid ovrSession parameter provided. */
	public static final int ovrError_InvalidSession = -1002;

	/** The operation timed out. */
	public static final int ovrError_Timeout = -1003;

	/** The system or component has not been initialized. */
	public static final int ovrError_NotInitialized = -1004;

	/** Invalid parameter provided. See error info or log for details. */
	public static final int ovrError_InvalidParameter = -1005;

	/** Generic service error. See error info or log for details. */
	public static final int ovrError_ServiceError = -1006;

	/** The given HMD doesn't exist. */
	public static final int ovrError_NoHmd = -1007;

	/** Function call is not supported on this hardware/software */
	public static final int ovrError_Unsupported = -1009;

	/** Specified device type isn't available. */
	public static final int ovrError_DeviceUnavailable = -1010;

	/** The headset was in an invalid orientation for the requested operation (e.g. vertically oriented during {@link OVR#ovr_RecenterTrackingOrigin}). */
	public static final int ovrError_InvalidHeadsetOrientation = -1011;

	/** The client failed to call {@link OVR#ovr_Destroy} on an active session before calling {@link OVR#ovr_Shutdown}. Or the client crashed. */
	public static final int ovrError_ClientSkippedDestroy = -1012;

	/** The client failed to call {@link OVR#ovr_Shutdown} or the client crashed. */
	public static final int ovrError_ClientSkippedShutdown = -1013;

	/** The service watchdog discovered a deadlock. */
	public static final int ovrError_ServiceDeadlockDetected = -1014;

	/** First Audio error. */
	public static final int ovrError_AudioReservedBegin = -2000;

	/** Failure to find the specified audio device. */
	public static final int ovrError_AudioDeviceNotFound = -2001;

	/** Generic COM error. */
	public static final int ovrError_AudioComError = -2002;

	/** Last Audio error. */
	public static final int ovrError_AudioReservedEnd = -2999;

	/** Generic initialization error. */
	public static final int ovrError_Initialize = -3000;

	/** Couldn't load LibOVRRT. */
	public static final int ovrError_LibLoad = -3001;

	/** LibOVRRT version incompatibility. */
	public static final int ovrError_LibVersion = -3002;

	/** Couldn't connect to the OVR Service. */
	public static final int ovrError_ServiceConnection = -3003;

	/** OVR Service version incompatibility. */
	public static final int ovrError_ServiceVersion = -3004;

	/** The operating system version is incompatible. */
	public static final int ovrError_IncompatibleOS = -3005;

	/** Unable to initialize the HMD display. */
	public static final int ovrError_DisplayInit = -3006;

	/** Unable to start the server. Is it already running? */
	public static final int ovrError_ServerStart = -3007;

	/** Attempting to re-initialize with a different version. */
	public static final int ovrError_Reinitialization = -3008;

	/** Chosen rendering adapters between client and service do not match */
	public static final int ovrError_MismatchedAdapters = -3009;

	/** Calling application has leaked resources */
	public static final int ovrError_LeakingResources = -3010;

	/** Client version too old to connect to service */
	public static final int ovrError_ClientVersion = -3011;

	/** The operating system is out of date. */
	public static final int ovrError_OutOfDateOS = -3012;

	/** The graphics driver is out of date. */
	public static final int ovrError_OutOfDateGfxDriver = -3013;

	/** The graphics hardware is not supported */
	public static final int ovrError_IncompatibleGPU = -3014;

	/** No valid VR display system found. */
	public static final int ovrError_NoValidVRDisplaySystem = -3015;

	/** Feature or API is obsolete and no longer supported. */
	public static final int ovrError_Obsolete = -3016;

	/** No supported VR display system found, but disabled or driverless adapter found. */
	public static final int ovrError_DisabledOrDefaultAdapter = -3017;

	/** The system is using hybrid graphics (Optimus, etc...), which is not support. */
	public static final int ovrError_HybridGraphicsNotSupported = -3018;

	/** Initialization of the DisplayManager failed. */
	public static final int ovrError_DisplayManagerInit = -3019;

	/** Failed to get the interface for an attached tracker */
	public static final int ovrError_TrackerDriverInit = -3020;

	/** Headset has no bundle adjustment data. */
	public static final int ovrError_InvalidBundleAdjustment = -4000;

	/** The USB hub cannot handle the camera frame bandwidth. */
	public static final int ovrError_USBBandwidth = -4001;

	/** The USB camera is not enumerating at the correct device speed. */
	public static final int ovrError_USBEnumeratedSpeed = -4002;

	/** Unable to communicate with the image sensor. */
	public static final int ovrError_ImageSensorCommError = -4003;

	/** We use this to report various sensor issues that don't fit in an easily classifiable bucket. */
	public static final int ovrError_GeneralTrackerFailure = -4004;

	/** A more than acceptable number of frames are coming back truncated. */
	public static final int ovrError_ExcessiveFrameTruncation = -4005;

	/** A more than acceptable number of frames have been skipped. */
	public static final int ovrError_ExcessiveFrameSkipping = -4006;

	/** The sensor is not receiving the sync signal (cable disconnected?). */
	public static final int ovrError_SyncDisconnected = -4007;

	/** Failed to read memory from the sensor. */
	public static final int ovrError_TrackerMemoryReadFailure = -4008;

	/** Failed to write memory from the sensor. */
	public static final int ovrError_TrackerMemoryWriteFailure = -4009;

	/** Timed out waiting for a camera frame. */
	public static final int ovrError_TrackerFrameTimeout = -4010;

	/** Truncated frame returned from sensor. */
	public static final int ovrError_TrackerTruncatedFrame = -4011;

	/** The sensor driver has encountered a problem. */
	public static final int ovrError_TrackerDriverFailure = -4012;

	/** The sensor wireless subsystem has encountered a problem. */
	public static final int ovrError_TrackerNRFFailure = -4013;

	/** The hardware has been unplugged */
	public static final int ovrError_HardwareGone = -4014;

	/** The nordic indicates that sync is enabled but it is not sending sync pulses */
	public static final int ovrError_NordicEnabledNoSync = -4015;

	/** It looks like we're getting a sync signal, but no camera frames have been received */
	public static final int ovrError_NordicSyncNoFrames = -4016;

	/** A catastrophic failure has occurred.  We will attempt to recover by resetting the device */
	public static final int ovrError_CatastrophicFailure = -4017;

	/** The catastrophic recovery has timed out. */
	public static final int ovrError_CatastrophicTimeout = -4018;

	/** Catastrophic failure has repeated too many times. */
	public static final int ovrError_RepeatCatastrophicFail = -4019;

	/** Could not open handle for Rift device (likely already in use by another process). */
	public static final int ovrError_USBOpenDeviceFailure = -4020;

	/** Unexpected HMD issues that don't fit a specific bucket. */
	public static final int ovrError_HMDGeneralFailure = -4021;

	/** The HMD Firmware is out of date and is unacceptable. */
	public static final int ovrError_HMDFirmwareMismatch = -4100;

	/** The sensor Firmware is out of date and is unacceptable. */
	public static final int ovrError_TrackerFirmwareMismatch = -4101;

	/** A bootloader HMD is detected by the service. */
	public static final int ovrError_BootloaderDeviceDetected = -4102;

	/** The sensor calibration is missing or incorrect. */
	public static final int ovrError_TrackerCalibrationError = -4103;

	/** The controller firmware is out of date and is unacceptable. */
	public static final int ovrError_ControllerFirmwareMismatch = -4104;

	/** A DeviceManagement mode HMD is detected by the service. */
	public static final int ovrError_DevManDeviceDetected = -4105;

	/** Had to reboot bootloader device, which succeeded. */
	public static final int ovrError_RebootedBootloaderDevice = -4106;

	/** Had to reboot bootloader device, which failed. Device is stuck in bootloader mode. */
	public static final int ovrError_FailedRebootBootloaderDev = -4107;

	/** Too many lost IMU samples. */
	public static final int ovrError_IMUTooManyLostSamples = -4200;

	/** IMU rate is outside of the expected range. */
	public static final int ovrError_IMURateError = -4201;

	/** A feature report has failed. */
	public static final int ovrError_FeatureReportFailure = -4202;

	/** HMD wireless interface never returned from busy state. */
	public static final int ovrError_HMDWirelessTimeout = -4203;

	/** HMD Bootloader Assert Log was not empty. */
	public static final int ovrError_BootloaderAssertLog = -4300;

	/** HMD App Assert Log was not empty. */
	public static final int ovrError_AppAssertLog = -4301;

	/** Requested async work not yet complete. */
	public static final int ovrError_Incomplete = -5000;

	/** Requested async work was abandoned and result is incomplete. */
	public static final int ovrError_Abandoned = -5001;

	/** In the event of a system-wide graphics reset or cable unplug this is returned to the app. */
	public static final int ovrError_DisplayLost = -6000;

	/** {@link OVR#ovr_CommitTextureSwapChain CommitTextureSwapChain} was called too many times on a texture swapchain without calling submit to use the chain. */
	public static final int ovrError_TextureSwapChainFull = -6001;

	/** The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure {@link OVR#ovr_CommitTextureSwapChain CommitTextureSwapChain} was called at least once first. */
	public static final int ovrError_TextureSwapChainInvalid = -6002;

	/** Graphics device has been reset (TDR, etc...) */
	public static final int ovrError_GraphicsDeviceReset = -6003;

	/** HMD removed from the display adapter */
	public static final int ovrError_DisplayRemoved = -6004;

	/** Content protection is not available for the display */
	public static final int ovrError_ContentProtectionNotAvailable = -6005;

	/** Application declared itself as an invisible type and is not allowed to submit frames. */
	public static final int ovrError_ApplicationInvisible = -6006;

	/** The given request is disallowed under the current conditions. */
	public static final int ovrError_Disallowed = -6007;

	/** Display portion of HMD is plugged into an incompatible port (ex: IGP) */
	public static final int ovrError_DisplayPluggedIncorrectly = -6008;

	/** A runtime exception occurred. The application is required to shutdown LibOVR and re-initialize it before this error state will be cleared. */
	public static final int ovrError_RuntimeException = -7000;

	/** Error codes ({@code ovrErrorType}) */
	public static final int
		ovrError_MetricsUnknownApp           = -90000,
		ovrError_MetricsDuplicateApp         = -90001,
		ovrError_MetricsNoEvents             = -90002,
		ovrError_MetricsRuntime              = -90003,
		ovrError_MetricsFile                 = -90004,
		ovrError_MetricsNoClientInfo         = -90005,
		ovrError_MetricsNoAppMetaData        = -90006,
		ovrError_MetricsNoApp                = -90007,
		ovrError_MetricsOafFailure           = -90008,
		ovrError_MetricsSessionAlreadyActive = -90009,
		ovrError_MetricsSessionNotActive     = -90010;

	static { Library.initialize(); }

	protected OVRErrorCode() {
		throw new UnsupportedOperationException();
	}

	// --- [ OVR_SUCCESS ] ---

	/**
	 * Indicates if an {@code ovrResult} indicates success.
	 * 
	 * <p>Some functions return additional successful values other than {@link #ovrSuccess Success} and require usage of this macro to indicate success.</p>
	 *
	 * @param result the {@code ovrResult} to check
	 */
	public static native boolean OVR_SUCCESS(int result);

	// --- [ OVR_UNQUALIFIED_SUCCESS ] ---

	/**
	 * Indicates if an {@code ovrResult} indicates an unqualified success.
	 * 
	 * <p>This is useful for indicating that the code intentionally wants to check for {@code result == ovrSuccess} as opposed to {@link #OVR_SUCCESS SUCCESS}, which checks for
	 * {@code result >= ovrSuccess}.</p>
	 *
	 * @param result the {@code ovrResult} to check
	 */
	public static native boolean OVR_UNQUALIFIED_SUCCESS(int result);

	// --- [ OVR_FAILURE ] ---

	/**
	 * Indicates if an {@code ovrResult} indicates failure.
	 *
	 * @param result the {@code ovrResult} to check
	 */
	public static native boolean OVR_FAILURE(int result);

}