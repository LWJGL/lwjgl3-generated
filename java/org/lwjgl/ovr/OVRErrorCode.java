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

	/** Failure to allocate memory. */
	public static final int ovrError_MemoryAllocationFailure = -1000;

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

	/** Failure to find the specified audio device. */
	public static final int ovrError_AudioDeviceNotFound = -2001;

	/** Generic COM error. */
	public static final int ovrError_AudioComError = -2002;

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

	static { LibOVR.initialize(); }

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