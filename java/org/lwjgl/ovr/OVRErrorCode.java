/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

/** LibOVR error code declarations. */
public final class OVRErrorCode {

	/** This is a general success result. */
	public static final int ovrSuccess = 0x0;

	/**
	 * Returned from a call to {@link OVR#ovrHmd_SubmitFrame Hmd_SubmitFrame}. The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app should
	 * continue calling {@link OVR#ovrHmd_SubmitFrame Hmd_SubmitFrame}, but not do any rendering. When the result becomes {@link #ovrSuccess Success}, rendering should continue as usual.
	 */
	public static final int ovrSuccess_NotVisible = 0x3E8;

	/** The HMD Firmware is out of date but is acceptable. */
	public static final int ovrSuccess_HMDFirmwareMismatch = 4100;

	/** The Tracker Firmware is out of date but is acceptable. */
	public static final int ovrSuccess_TrackerFirmwareMismatch = 4101;

	/** The controller firmware is out of date but is acceptable. */
	public static final int ovrSuccess_ControllerFirmwareMismatch = 4104;

	/** Failure to allocate memory. */
	public static final int ovrError_MemoryAllocationFailure = -1000;

	/** Failure to create a socket. */
	public static final int ovrError_SocketCreationFailure = -1001;

	/** Invalid HMD parameter provided. */
	public static final int ovrError_InvalidHmd = -1002;

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

	/** First Audio error. */
	public static final int ovrError_AudioReservedBegin = -2000;

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

	/** Chosen rendering adapters between client and service do not match. */
	public static final int ovrError_MismatchedAdapters = -3009;

	/** Calling application has leaked resources. */
	public static final int ovrError_LeakingResources = -3010;

	/** Client version too old to connect to service. */
	public static final int ovrError_ClientVersion = -3011;

	/** Headset has no bundle adjustment data. */
	public static final int ovrError_InvalidBundleAdjustment = -4000;

	/** The USB hub cannot handle the camera frame bandwidth. */
	public static final int ovrError_USBBandwidth = -4001;

	/** The USB camera is not enumerating at the correct device speed. */
	public static final int ovrError_USBEnumeratedSpeed = -4002;

	/** Unable to communicate with the image sensor. */
	public static final int ovrError_ImageSensorCommError = -4003;

	/** We use this to report various tracker issues that don't fit in an easily classifiable bucket. */
	public static final int ovrError_GeneralTrackerFailure = -4004;

	/** A more than acceptable number of frames are coming back truncated. */
	public static final int ovrError_ExcessiveFrameTruncation = -4005;

	/** A more than acceptable number of frames have been skipped. */
	public static final int ovrError_ExcessiveFrameSkipping = -4006;

	/** The tracker is not receiving the sync signal (cable disconnected?) */
	public static final int ovrError_SyncDisconnected = -4007;

	/** Failed to read memory from the tracker. */
	public static final int ovrError_TrackerMemoryReadFailure = -4008;

	/** Failed to write memory from the tracker. */
	public static final int ovrError_TrackerMemoryWriteFailure = -4009;

	/** Timed out waiting for a camera frame. */
	public static final int ovrError_TrackerFrameTimeout = -4010;

	/** Truncated frame returned from tracker. */
	public static final int ovrError_TrackerTruncatedFrame = -4011;

	/** The HMD Firmware is out of date and is unacceptable. */
	public static final int ovrError_HMDFirmwareMismatch = -4100;

	/** The Tracker Firmware is out of date and is unacceptable. */
	public static final int ovrError_TrackerFirmwareMismatch = -4101;

	/** A bootloader HMD is detected by the service. */
	public static final int ovrError_BootloaderDeviceDetected = -4102;

	/** The tracker calibration is missing or incorrect. */
	public static final int ovrError_TrackerCalibrationError = -4103;

	/** The controller firmware is out of date and is unacceptable. */
	public static final int ovrError_ControllerFirmwareMismatch = -4104;

	/** Requested async work not yet complete. */
	public static final int ovrError_Incomplete = -5000;

	/** Requested async work was abandoned and result is incomplete. */
	public static final int ovrError_Abandoned = -5001;

	/** In the event of a system-wide graphics reset or cable unplug this is returned to the app. */
	public static final int ovrError_DisplayLost = -6000;

	private OVRErrorCode() {}

}