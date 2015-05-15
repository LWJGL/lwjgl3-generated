/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.
 * 
 * <p>Overview of the API:</p>
 * 
 * <h3>Setup</h3>
 * <ul>
 * <li>{@link #ovr_Initialize _Initialize}</li>
 * <li>{@link #ovrHmd_Create Hmd_Create}(0, &hmd)</li>
 * <li>Call {@link #ovrHmd_ConfigureTracking Hmd_ConfigureTracking} to configure and initialize tracking.</li>
 * <li>Use hmd members and {@link #ovrHmd_GetFovTextureSize Hmd_GetFovTextureSize} to determine graphics configuration and {@link #ovrHmd_GetRenderDesc Hmd_GetRenderDesc} to get per-eye rendering parameters.</li>
 * <li>Allocate render target texture sets with ovrHmd_CreateSwapTextureSetD3D11() or {@link OVRGL#ovrHmd_CreateSwapTextureSetGL Hmd_CreateSwapTextureSetGL}.</li>
 * </ul>
 * 
 * <h3>Application Loop</h3>
 * <ul>
 * <li>Call {@link #ovrHmd_GetFrameTiming Hmd_GetFrameTiming} to get the current frame timing information.</li>
 * <li>Call {@link #ovrHmd_GetTrackingState Hmd_GetTrackingState} and {@link OVRUtil#ovr_CalcEyePoses _CalcEyePoses} to obtain the predicted rendering pose for each eye based on timing.</li>
 * <li>Render the scene content into {@code CurrentIndex} of ovrTextureSet for each eye and layer you plan to update this frame. Increment texture set
 * {@code CurrentIndex}.</li>
 * <li>Call {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame} to render the distorted layers to the back buffer and present them on the HMD. If {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame} returns
 * {@link #ovrSuccess_NotVisible Success_NotVisible}, there is no need to render the scene for the next loop iteration. Instead, just call {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame} again until it returns
 * {@link #ovrSuccess Success}.</li>
 * </ul>
 * 
 * <h3>Shutdown</h3>
 * <ul>
 * <li>{@link #ovrHmd_Destroy Hmd_Destroy}</li>
 * <li>{@link #ovr_Shutdown _Shutdown}</li>
 * </ul>
 */
public final class OVR {

	/** Boolean values */
	public static final int
		ovrFalse = 0x0,
		ovrTrue  = 0x1;

	/** This is a general success result. */
	public static final int ovrSuccess = 0x0;

	/**
	 * Returned from a call to {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame}. The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app should continue
	 * calling {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame}, but not do any rendering. When the result becomes {@link #ovrSuccess Success}, rendering should continue as usual.
	 */
	public static final int ovrSuccess_NotVisible = 0x3E8;

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

	/** Headset has no bundle adjustment data. */
	public static final int ovrError_InvalidBundleAdjustment = -4000;

	/** The USB hub cannot handle the camera frame bandwidth. */
	public static final int ovrError_USBBandwidth = -4001;

	/**
	 * When a debug library is requested, a slower debugging version of the library will run which can be used to help solve problems in the library and debug
	 * application code.
	 */
	public static final int ovrInit_Debug = 0x1;

	/**
	 * When {@code ServerOptional} is set, the {@link #ovr_Initialize _Initialize} call not will block waiting for the server to respond. If the server is not reachable, it might
	 * still succeed.
	 */
	public static final int ovrInit_ServerOptional = 0x2;

	/**
	 * When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the {@code RequestedMinorVersion} is
	 * supported.
	 */
	public static final int ovrInit_RequestVersion = 0x4;

	/** Forces debug features of LibOVR off explicitly, even if it is built in debug mode. */
	public static final int ovrInit_ForceNoDebug = 0x8;

	/** Logging levels */
	public static final int
		ovrLogLevel_Debug = 0x0,
		ovrLogLevel_Info  = 0x1,
		ovrLogLevel_Error = 0x2;

	/** HMD types */
	public static final int
		ovrHmd_None      = 0x0,
		ovrHmd_DK1       = 0x3,
		ovrHmd_DKHD      = 0x4,
		ovrHmd_DK2       = 0x6,
		ovrHmd_BlackStar = 0x7,
		ovrHmd_CB        = 0x8,
		ovrHmd_Other     = 0x9;

	/** (read only) Specifies that the HMD is a virtual debug device. */
	public static final int ovrHmdCap_DebugDevice = 0x10;

	/**
	 * Toggles low persistence mode on or off.
	 * 
	 * <p>This setting reduces eye-tracking based motion blur. Eye-tracking based motion blur is caused by the viewer's focal point moving more pixels than have
	 * refreshed in the same period of time. The disadvantage of this setting is that this reduces the average brightness of the display and causes some users
	 * to perceive flicker. <i>There is no performance cost for this option. Oculus recommends exposing it to the user as an optional setting.</i></p>
	 */
	public static final int ovrHmdCap_LowPersistence = 0x80;

	/** (read/write) Adjusts prediction dynamically based on internally measured latency. */
	public static final int ovrHmdCap_DynamicPrediction = 0x200;

	/** (read/write) Supports rendering without VSync for debugging. */
	public static final int ovrHmdCap_NoVSync = 0x1000;

	/** Indicates to the developer what caps they can and cannot modify. These are processed by the client. */
	public static final int ovrHmdCap_Writable_Mask = ovrHmdCap_LowPersistence | ovrHmdCap_DynamicPrediction | ovrHmdCap_NoVSync;

	/** Indicates to the developer what caps they can and cannot modify. These are processed by the service. */
	public static final int ovrHmdCap_Service_Mask = ovrHmdCap_LowPersistence | ovrHmdCap_DynamicPrediction;

	/** Supports orientation tracking (IMU). */
	public static final int ovrTrackingCap_Orientation = 0x10;

	/** Supports yaw drift correction via a magnetometer or other means. */
	public static final int ovrTrackingCap_MagYawCorrection = 0x20;

	/** Supports positional tracking. */
	public static final int ovrTrackingCap_Position = 0x40;

	/**
	 * Overriding the other flags, this causes the application to ignore tracking settings. This is the internal default before {@link #ovrHmd_ConfigureTracking Hmd_ConfigureTracking} is
	 * called.
	 */
	public static final int ovrTrackingCap_Idle = 0x100;

	/** ovrEyeType */
	public static final int
		ovrEye_Left  = 0x0,
		ovrEye_Right = 0x1,
		ovrEye_Count = 0x2;

	/** Orientation is currently tracked (connected and in use). */
	public static final int ovrStatus_OrientationTracked = 0x1;

	/** Position is currently tracked (false if out of range). */
	public static final int ovrStatus_PositionTracked = 0x2;

	/** Camera pose is currently tracked. */
	public static final int ovrStatus_CameraPoseTracked = 0x4;

	/** Position tracking hardware is connected. */
	public static final int ovrStatus_PositionConnected = 0x20;

	/** HMD Display is available and connected. */
	public static final int ovrStatus_HmdConnected = 0x80;

	/** Render API */
	public static final int
		ovrRenderAPI_None         = 0x0,
		ovrRenderAPI_OpenGL       = 0x1,
		ovrRenderAPI_Android_GLES = 0x2,
		ovrRenderAPI_D3D11        = 0x5,
		ovrRenderAPI_Count        = 0x6;

	/** Describes layer types that can be passed to {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame}. Each layer type has an associated struct, such as {@link OVRLayerEyeFov}. */
	public static final int
		ovrLayerType_Disabled       = 0x0,
		ovrLayerType_EyeFov         = 0x1,
		ovrLayerType_EyeFovDepth    = 0x2,
		ovrLayerType_QuadInWorld    = 0x3,
		ovrLayerType_QuadHeadLocked = 0x4,
		ovrLayerType_Direct         = 0x6;

	/** Identifies flags used by {@link OVRLayerHeader} and which are passed to {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame}. */
	public static final int
		ovrLayerFlag_HighQuality               = 0x1,
		ovrLayerFlag_TextureOriginAtBottomLeft = 0x2;

	static { LWJGLUtil.initialize(); }

	private OVR() {}

	// --- [ ovr_Initialize ] ---

	/** JNI method for {@link #ovr_Initialize _Initialize} */
	@JavadocExclude
	public static native int novr_Initialize(long params);

	/**
	 * Initialize LibOVR for application usage. This includes finding and loading the LibOVRRT shared library. No LibOVR API functions, other than
	 * {@link #ovr_GetLastErrorInfo _GetLastErrorInfo}, can be called unless ovr_Initialize succeeds. A successful call to ovr_Initialize must be eventually followed by a call to
	 * {@link #ovr_Shutdown _Shutdown}. ovr_Initialize calls are idempotent. Calling ovr_Initialize twice does not require two matching calls to {@link #ovr_Shutdown _Shutdown}. If already
	 * initialized, the return value is {@link #ovrSuccess Success}.
	 * 
	 * <p>LibOVRRT shared library search order:
	 * <ol>
	 * <li>Current working directory (often the same as the application directory).</li>
	 * <li>Module directory (usually the same as the application directory, but not if the module is a separate shared library).</li>
	 * <li>Application directory</li>
	 * <li>Development directory (only if OVR_ENABLE_DEVELOPER_SEARCH is enabled, which is off by default).</li>
	 * <li>Standard OS shared library search location(s) (OS-specific).</li>
	 * </ol></p>
	 *
	 * @param params an {@link OVRInitParams} struct that cpecifies custom initialization options. May be {@code NULL} to indicate default options.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link #ovr_GetLastErrorInfo _GetLastErrorInfo} to get more information. Example failed results
	 *         include:
	 *         <ul>
	 *         <li>{@link #ovrError_Initialize Error_Initialize}: Generic initialization error.</li>
	 *         <li>{@link #ovrError_LibLoad Error_LibLoad}: Couldn't load LibOVRRT.</li>
	 *         <li>{@link #ovrError_LibVersion Error_LibVersion}: LibOVRRT version incompatibility.</li>
	 *         <li>{@link #ovrError_ServiceConnection Error_ServiceConnection}: Couldn't connect to the OVR Service.</li>
	 *         <li>{@link #ovrError_ServiceVersion Error_ServiceVersion}: OVR Service version incompatibility.</li>
	 *         <li>{@link #ovrError_IncompatibleOS Error_IncompatibleOS}: The operating system version is incompatible.</li>
	 *         <li>{@link #ovrError_DisplayInit Error_DisplayInit}: Unable to initialize the HMD display.</li>
	 *         <li>{@link #ovrError_ServerStart Error_ServerStart}:  Unable to start the server. Is it already running?</li>
	 *         <li>{@link #ovrError_Reinitialization Error_Reinitialization}: Attempted to re-initialize with a different version.</li>
	 *         </ul>
	 */
	public static int ovr_Initialize(ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			if ( params != null ) checkBuffer(params, OVRInitParams.SIZEOF);
		return novr_Initialize(memAddressSafe(params));
	}

	// --- [ ovr_Shutdown ] ---

	/**
	 * Shuts down LibOVR.
	 * 
	 * <p>A successful call to {@link #ovr_Initialize _Initialize} must be eventually matched by a call to ovr_Shutdown. After calling ovr_Shutdown, no LibOVR functions can be called
	 * except {@link #ovr_GetLastErrorInfo _GetLastErrorInfo} or another {@link #ovr_Initialize _Initialize}. ovr_Shutdown invalidates all pointers, references, and created objects previously returned by
	 * LibOVR functions. The LibOVRRT shared library can be unloaded by ovr_Shutdown.</p>
	 */
	public static native void ovr_Shutdown();

	// --- [ ovr_GetLastErrorInfo ] ---

	/** JNI method for {@link #ovr_GetLastErrorInfo _GetLastErrorInfo} */
	@JavadocExclude
	public static native void novr_GetLastErrorInfo(long errorInfo);

	/**
	 * Returns information about the most recent failed return value by the current thread for this library.
	 * 
	 * <p>This function itself can never generate an error. The last error is never cleared by LibOVR, but will be overwritten by new errors. Do not use this
	 * call to determine if there was an error in the last API call as successful API calls don't clear the last {@link OVRErrorInfo}. To avoid any inconsistency,
	 * {@link #ovr_GetLastErrorInfo _GetLastErrorInfo} should be called immediately after an API function that returned a failed {@code ovrResult}, with no other API functions called in
	 * the interim.</p>
	 *
	 * @param errorInfo The last {@link OVRErrorInfo} for the current thread
	 */
	public static void ovr_GetLastErrorInfo(ByteBuffer errorInfo) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(errorInfo, OVRErrorInfo.SIZEOF);
		novr_GetLastErrorInfo(memAddress(errorInfo));
	}

	// --- [ ovr_GetVersionString ] ---

	/** JNI method for {@link #ovr_GetVersionString _GetVersionString} */
	@JavadocExclude
	public static native long novr_GetVersionString();

	/**
	 * Returns the version string representing the LibOVRRT version.
	 * 
	 * <p>The returned string pointer is valid until the next call to {@link #ovr_Shutdown _Shutdown}.</p>
	 * 
	 * <p>Note that the returned version string doesn't necessarily match the current OVR_MAJOR_VERSION, etc., as the returned string refers to the LibOVRRT
	 * shared library version and not the locally compiled interface version.</p>
	 * 
	 * <p>The format of this string is subject to change in future versions and its contents should not be interpreted.</p>
	 *
	 * @return a UTF8-encoded null-terminated version string
	 */
	public static String ovr_GetVersionString() {
		long __result = novr_GetVersionString();
		return memDecodeUTF8(__result);
	}

	// --- [ ovr_TraceMessage ] ---

	/** JNI method for {@link #ovr_TraceMessage _TraceMessage} */
	@JavadocExclude
	public static native long novr_TraceMessage(int level, long message);

	/**
	 * Writes a message string to the LibOVR tracing mechanism (if enabled).
	 * 
	 * <p>This message will be passed back to the application via the {@link OVRLogCallback} if it was registered.</p>
	 *
	 * @param level   an {@code ovrLogLevel} constant. One of:<br>{@link #ovrLogLevel_Debug LogLevel_Debug}, {@link #ovrLogLevel_Info LogLevel_Info}, {@link #ovrLogLevel_Error LogLevel_Error}
	 * @param message a UTF8-encoded null-terminated string
	 *
	 * @return the {@code strlen} of the message or a negative value if the message is too large
	 */
	public static String ovr_TraceMessage(int level, ByteBuffer message) {
		long __result = novr_TraceMessage(level, memAddress(message));
		return memDecodeUTF8(__result);
	}

	/**
	 * Writes a message string to the LibOVR tracing mechanism (if enabled).
	 * 
	 * <p>This message will be passed back to the application via the {@link OVRLogCallback} if it was registered.</p>
	 *
	 * @param level   an {@code ovrLogLevel} constant. One of:<br>{@link #ovrLogLevel_Debug LogLevel_Debug}, {@link #ovrLogLevel_Info LogLevel_Info}, {@link #ovrLogLevel_Error LogLevel_Error}
	 * @param message a UTF8-encoded null-terminated string
	 *
	 * @return the {@code strlen} of the message or a negative value if the message is too large
	 */
	public static String ovr_TraceMessage(int level, CharSequence message) {
		APIBuffer __buffer = apiBuffer();
		int messageEncoded = __buffer.stringParamUTF8(message, true);
		long __result = novr_TraceMessage(level, __buffer.address(messageEncoded));
		return memDecodeUTF8(__result);
	}

	// --- [ ovrHmd_Detect ] ---

	/**
	 * Detects or re-detects HMDs and reports the total number detected.
	 * 
	 * <p>This function is useful to determine if an HMD can be created without committing to creating it. For example, an application can use this information
	 * to present an HMD selection GUI.</p>
	 * 
	 * <p>If one or more HMDs are present, an integer value is returned which indicates the number present. The number present indicates the range of valid
	 * indexes that can be passed to {@link #ovrHmd_Create Hmd_Create}. If no HMDs are present, the return value is zero. If there is an error, a negative error {@code ovrResult}
	 * value is returned.</p>
	 *
	 * @return an integer that specifies the number of HMDs currently present. Upon failure, {@code OVR_SUCCESS(result)} is false.
	 */
	public static native int ovrHmd_Detect();

	// --- [ ovrHmd_Create ] ---

	/** JNI method for {@link #ovrHmd_Create Hmd_Create} */
	@JavadocExclude
	public static native int novrHmd_Create(int index, long pHmd);

	/**
	 * Creates a handle to an HMD which doubles as a description structure.
	 * 
	 * <p>Upon success the returned ovrHmd* must be freed with {@link #ovrHmd_Destroy Hmd_Destroy}. A second call to {@link #ovrHmd_Create Hmd_Create} with the same index as a previously successful call
	 * will result in an error return value.</p>
	 *
	 * @param index a value in the range of {@code [0 .. ovrHmd_Detect()-1]]}.
	 * @param pHmd  a pointer to an {@code ovrHmd} which will be written to upon success.
	 *
	 * @return an {@code ovrResult} indicating success or failure
	 */
	public static int ovrHmd_Create(int index, ByteBuffer pHmd) {
		return novrHmd_Create(index, memAddress(pHmd));
	}

	/** Alternative version of: {@link #ovrHmd_Create Hmd_Create} */
	public static int ovrHmd_Create(int index, PointerBuffer pHmd) {
		return novrHmd_Create(index, memAddress(pHmd));
	}

	// --- [ ovrHmd_CreateDebug ] ---

	/** JNI method for {@link #ovrHmd_CreateDebug Hmd_CreateDebug} */
	@JavadocExclude
	public static native int novrHmd_CreateDebug(int type, long pHmd);

	/**
	 * Creates a fake HMD used for debugging only.
	 * 
	 * <p>This is not tied to specific hardware, but may be used to debug some of the related rendering.</p>
	 *
	 * @param type indicates the HMD type to emulate. One of:<br>{@link #ovrHmd_None Hmd_None}, {@link #ovrHmd_DK1 Hmd_DK1}, {@link #ovrHmd_DKHD Hmd_DKHD}, {@link #ovrHmd_DK2 Hmd_DK2}, {@link #ovrHmd_BlackStar Hmd_BlackStar}, {@link #ovrHmd_CB Hmd_CB}, {@link #ovrHmd_Other Hmd_Other}
	 * @param pHmd a pointer to an {@code ovrHmd} which will be written to upon success.
	 *
	 * @return an {@code ovrResult} indicating success or failure
	 */
	public static int ovrHmd_CreateDebug(int type, ByteBuffer pHmd) {
		return novrHmd_CreateDebug(type, memAddress(pHmd));
	}

	/** Alternative version of: {@link #ovrHmd_CreateDebug Hmd_CreateDebug} */
	public static int ovrHmd_CreateDebug(int type, PointerBuffer pHmd) {
		return novrHmd_CreateDebug(type, memAddress(pHmd));
	}

	// --- [ ovrHmd_Destroy ] ---

	/** JNI method for {@link #ovrHmd_Destroy Hmd_Destroy} */
	@JavadocExclude
	public static native void novrHmd_Destroy(long hmd);

	/**
	 * Destroys the HMD.
	 *
	 * @param hmd an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 */
	public static void ovrHmd_Destroy(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_Destroy(hmd);
	}

	// --- [ ovrHmd_GetEnabledCaps ] ---

	/** JNI method for {@link #ovrHmd_GetEnabledCaps Hmd_GetEnabledCaps} */
	@JavadocExclude
	public static native int novrHmd_GetEnabledCaps(long hmd);

	/**
	 * Returns ovrHmdCaps bits that are currently enabled.
	 * 
	 * <p>Note that this value is different from {@link OVRHmdDesc}{@code ::HmdCaps}, which describes what capabilities are available for that HMD.</p>
	 *
	 * @param hmd an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 *
	 * @return a combination of zero or more {@code ovrHmdCaps}
	 */
	public static int ovrHmd_GetEnabledCaps(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_GetEnabledCaps(hmd);
	}

	// --- [ ovrHmd_SetEnabledCaps ] ---

	/** JNI method for {@link #ovrHmd_SetEnabledCaps Hmd_SetEnabledCaps} */
	@JavadocExclude
	public static native void novrHmd_SetEnabledCaps(long hmd, int hmdCaps);

	/**
	 * Modifies capability bits described by {@code ovrHmdCaps} that can be modified, such as {@link #ovrHmdCap_LowPersistence HmdCap_LowPersistence}.
	 *
	 * @param hmd     an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param hmdCaps a combination of 0 or more {@code ovrHmdCaps}. One or more of:<br>{@link #ovrHmdCap_DebugDevice HmdCap_DebugDevice}, {@link #ovrHmdCap_LowPersistence HmdCap_LowPersistence}, {@link #ovrHmdCap_DynamicPrediction HmdCap_DynamicPrediction}, {@link #ovrHmdCap_NoVSync HmdCap_NoVSync}
	 */
	public static void ovrHmd_SetEnabledCaps(long hmd, int hmdCaps) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_SetEnabledCaps(hmd, hmdCaps);
	}

	// --- [ ovrHmd_ConfigureTracking ] ---

	/** JNI method for {@link #ovrHmd_ConfigureTracking Hmd_ConfigureTracking} */
	@JavadocExclude
	public static native int novrHmd_ConfigureTracking(long hmd, int supportedTrackingCaps, int requiredTrackingCaps);

	/**
	 * Starts sensor sampling, enabling specified capabilities, described by {@code ovrTrackingCaps}.
	 * 
	 * <p>Use 0 for both {@code supportedTrackingCaps} and {@code requiredTrackingCaps} to disable tracking.</p>
	 *
	 * @param hmd                   an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param supportedTrackingCaps specifies support that is requested. The function will succeed even if these caps are not available (i.e. sensor or camera is unplugged). Support
	 *                              will automatically be enabled if such device is plugged in later. Software should check {@link OVRTrackingState}{@code .StatusFlags} for real-time status. One or more of:<br>{@link #ovrTrackingCap_Orientation TrackingCap_Orientation}, {@link #ovrTrackingCap_MagYawCorrection TrackingCap_MagYawCorrection}, {@link #ovrTrackingCap_Position TrackingCap_Position}, {@link #ovrTrackingCap_Idle TrackingCap_Idle}
	 * @param requiredTrackingCaps  specify sensor capabilities required at the time of the call. If they are not available, the function will fail. Pass 0 if only specifying
	 *                              {@code supportedTrackingCaps}. One or more of:<br>{@link #ovrTrackingCap_Orientation TrackingCap_Orientation}, {@link #ovrTrackingCap_MagYawCorrection TrackingCap_MagYawCorrection}, {@link #ovrTrackingCap_Position TrackingCap_Position}, {@link #ovrTrackingCap_Idle TrackingCap_Idle}
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link #ovr_GetLastErrorInfo _GetLastErrorInfo} to get more information.
	 */
	public static int ovrHmd_ConfigureTracking(long hmd, int supportedTrackingCaps, int requiredTrackingCaps) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_ConfigureTracking(hmd, supportedTrackingCaps, requiredTrackingCaps);
	}

	// --- [ ovrHmd_RecenterPose ] ---

	/** JNI method for {@link #ovrHmd_RecenterPose Hmd_RecenterPose} */
	@JavadocExclude
	public static native void novrHmd_RecenterPose(long hmd);

	/**
	 * Re-centers the sensor position and orientation.
	 * 
	 * <p>This resets the (x,y,z) positional components and the yaw orientation component. The Roll and pitch orientation components are always determined by
	 * gravity and cannot be redefined. All future tracking will report values relative to this new reference position.</p>
	 *
	 * @param hmd an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 */
	public static void ovrHmd_RecenterPose(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_RecenterPose(hmd);
	}

	// --- [ ovrHmd_GetTrackingState ] ---

	/** JNI method for {@link #ovrHmd_GetTrackingState Hmd_GetTrackingState} */
	@JavadocExclude
	public static native void novrHmd_GetTrackingState(long hmd, double absTime, long __result);

	/**
	 * Returns tracking state reading based on the specified absolute system time.
	 * 
	 * <p>Pass an {@code absTime} value of 0.0 to request the most recent sensor reading. In this case both {@code PredictedPose} and {@code SamplePose} will
	 * have the same value.</p>
	 * 
	 * <p>This may also be used for more refined timing of front buffer rendering logic, and so on.</p>
	 *
	 * @param hmd      an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param absTime  the absolute future time to predict the return {@link OVRTrackingState} value. Use 0 to request the most recent tracking state.
	 * @param __result the {@link OVRTrackingState} that is predicted for the given {@code absTime}
	 */
	public static void ovrHmd_GetTrackingState(long hmd, double absTime, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_GetTrackingState(hmd, absTime, memAddress(__result));
	}

	// --- [ ovrHmd_DestroySwapTextureSet ] ---

	/** JNI method for {@link #ovrHmd_DestroySwapTextureSet Hmd_DestroySwapTextureSet} */
	@JavadocExclude
	public static native void novrHmd_DestroySwapTextureSet(long hmd, long textureSet);

	/**
	 * Destroys an {@link OVRSwapTextureSet} and frees all the resources associated with it.
	 *
	 * @param hmd        an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param textureSet the {@link OVRSwapTextureSet} to destroy
	 */
	public static void ovrHmd_DestroySwapTextureSet(long hmd, ByteBuffer textureSet) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(textureSet, OVRSwapTextureSet.SIZEOF);
		}
		novrHmd_DestroySwapTextureSet(hmd, memAddress(textureSet));
	}

	// --- [ ovrHmd_DestroyMirrorTexture ] ---

	/** JNI method for {@link #ovrHmd_DestroyMirrorTexture Hmd_DestroyMirrorTexture} */
	@JavadocExclude
	public static native void novrHmd_DestroyMirrorTexture(long hmd, long mirrorTexture);

	/**
	 * Destroys a mirror texture previously created by one of the mirror texture creation functions.
	 *
	 * @param hmd           an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param mirrorTexture the {@link OVRTexture} to destroy
	 */
	public static void ovrHmd_DestroyMirrorTexture(long hmd, ByteBuffer mirrorTexture) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(mirrorTexture, OVRTexture.SIZEOF);
		}
		novrHmd_DestroyMirrorTexture(hmd, memAddress(mirrorTexture));
	}

	// --- [ ovrHmd_GetFovTextureSize ] ---

	/** JNI method for {@link #ovrHmd_GetFovTextureSize Hmd_GetFovTextureSize} */
	@JavadocExclude
	public static native void novrHmd_GetFovTextureSize(long hmd, int eye, long fov, float pixelsPerDisplayPixel, long __result);

	/**
	 * Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone.
	 * 
	 * <p>Higher FOV will generally require larger textures to maintain quality. Apps packing multiple eye views together on the same texture should ensure there
	 * are at least 8 pixels of padding between them to prevent texture filtering and chromatic aberration causing images to leak between the two eye views.</p>
	 *
	 * @param hmd                   an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param eye                   which eye (left or right) to calculate for. One of:<br>{@link #ovrEye_Left Eye_Left}, {@link #ovrEye_Right Eye_Right}, {@link #ovrEye_Count Eye_Count}
	 * @param fov                   the {@link OVRFovPort} to use
	 * @param pixelsPerDisplayPixel the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can improve
	 *                              performance, higher values give improved quality.
	 * @param __result              the texture width and height size
	 */
	public static void ovrHmd_GetFovTextureSize(long hmd, int eye, ByteBuffer fov, float pixelsPerDisplayPixel, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(fov, OVRFovPort.SIZEOF);
		}
		novrHmd_GetFovTextureSize(hmd, eye, memAddress(fov), pixelsPerDisplayPixel, memAddress(__result));
	}

	// --- [ ovrHmd_GetRenderDesc ] ---

	/** JNI method for {@link #ovrHmd_GetRenderDesc Hmd_GetRenderDesc} */
	@JavadocExclude
	public static native void novrHmd_GetRenderDesc(long hmd, int eyeType, long fov, long __result);

	/**
	 * Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye.
	 *
	 * @param hmd      an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param eyeType  which eye (left or right) for which to perform calculations. One of:<br>{@link #ovrEye_Left Eye_Left}, {@link #ovrEye_Right Eye_Right}, {@link #ovrEye_Count Eye_Count}
	 * @param fov      the {@link OVRFovPort} to use.
	 * @param __result the computed {@link OVREyeRenderDesc} for the given {@code eyeType} and field of view
	 */
	public static void ovrHmd_GetRenderDesc(long hmd, int eyeType, ByteBuffer fov, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(fov, OVRFovPort.SIZEOF);
		}
		novrHmd_GetRenderDesc(hmd, eyeType, memAddress(fov), memAddress(__result));
	}

	// --- [ ovrHmd_SubmitFrame ] ---

	/** JNI method for {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame} */
	@JavadocExclude
	public static native int novrHmd_SubmitFrame(long hmd, int frameIndex, long viewScaleDesc, long layerPtrList, int layerCount);

	/**
	 * Submits layers for distortion and display.
	 * 
	 * <p>ovrHmd_SubmitFrame triggers distortion and processing which might happen asynchronously. The function will return when there is room in the submission
	 * queue and surfaces are available. Distortion might or might not have completed.
	 * <ul>
	 * <li>Layers are drawn in the order they are specified in the array, regardless of the layer type.</li>
	 * <li>Layers are not remembered between successive calls to ovrHmd_SubmitFrame. A layer must be specified in every call to ovrHmd_SubmitFrame or it won't
	 * be displayed.</li>
	 * <li>If a {@code layerPtrList} entry that was specified in a previous call to ovrHmd_SubmitFrame is passed as {@code NULL} or is of type {@link #ovrLayerType_Disabled LayerType_Disabled},
	 * that layer is no longer displayed.</li>
	 * <li>A {@code layerPtrList} entry can be of any layer type and multiple entries of the same layer type are allowed. No {@code layerPtrList} entry may be
	 * duplicated (i.e. the same pointer as an earlier entry).</li>
	 * </ul></p>
	 * 
	 * <h3>Example code</h3>
	 * <pre><code style="font-family: monospace">
	 * ovrLayerEyeFov  layer0;
	 * ovrLayerQuad    layer1;
	 * ...
	 * ovrLayerHeader* layers[2] = { &layer0.Header, &layer1.Header };
	 * ovrResult result = ovrHmd_SubmitFrame(hmd, frameIndex, nullptr, layers, 2);</code></pre>
	 *
	 * @param hmd           an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param frameIndex    the targeted frame index, or 0, to refer to one frame after the last time {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame} was called
	 * @param viewScaleDesc provides additional information needed only if {@code layerPtrList} contains a {@link #ovrLayerType_QuadInWorld LayerType_QuadInWorld} or {@link #ovrLayerType_QuadHeadLocked LayerType_QuadHeadLocked}. If {@code NULL}, a
	 *                      default version is used based on the current configuration and a 1.0 world scale.
	 * @param layerPtrList  a list of {@code ovrLayer} pointers, which can include {@code NULL} entries to indicate that any previously shown layer at that index is to not be
	 *                      displayed. Each layer header must be a part of a layer structure such as {@link OVRLayerEyeFov} or {@link OVRLayerQuad}, with {@code Header.Type} identifying
	 *                      its type. A {@code NULL} {@code layerPtrList} entry in the array indicates the absence of the given layer.
	 * @param layerCount    the number of valid elements in {@code layerPtrList}. The maximum supported {@code layerCount} is not currently specified, but may be specified in
	 *                      a future version.
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon one of the possible success values:
	 *         <ul>
	 *         <li>{@link #ovrSuccess Success}: rendering completed successfully.</li>
	 *         <li>{@link #ovrSuccess_NotVisible Success_NotVisible}: rendering completed successfully but was not displayed on the HMD, usually because another application currently has ownership
	 *         of the HMD. Applications receiving this result should stop rendering new content, but continue to call ovrHmd_SubmitFrame periodically until it
	 *         returns a value other than {@link #ovrSuccess_NotVisible Success_NotVisible}.</li>
	 *         </ul>
	 */
	public static int ovrHmd_SubmitFrame(long hmd, int frameIndex, ByteBuffer viewScaleDesc, ByteBuffer layerPtrList, int layerCount) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			if ( viewScaleDesc != null ) checkBuffer(viewScaleDesc, OVRViewScaleDesc.SIZEOF);
			checkBuffer(layerPtrList, layerCount << POINTER_SHIFT);
		}
		return novrHmd_SubmitFrame(hmd, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerCount);
	}

	/** Alternative version of: {@link #ovrHmd_SubmitFrame Hmd_SubmitFrame} */
	public static int ovrHmd_SubmitFrame(long hmd, int frameIndex, ByteBuffer viewScaleDesc, PointerBuffer layerPtrList) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			if ( viewScaleDesc != null ) checkBuffer(viewScaleDesc, OVRViewScaleDesc.SIZEOF);
		}
		return novrHmd_SubmitFrame(hmd, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerPtrList.remaining());
	}

	// --- [ ovrHmd_GetFrameTiming ] ---

	/** JNI method for {@link #ovrHmd_GetFrameTiming Hmd_GetFrameTiming} */
	@JavadocExclude
	public static native void novrHmd_GetFrameTiming(long hmd, int frameIndex, long __result);

	/**
	 * Gets the {@link OVRFrameTiming} for the given frame index.
	 * 
	 * <p>The application should increment {@code frameIndex} for each successively targeted frame, and pass that index to any relevent OVR functions that need
	 * to apply to the frame identified by that index.</p>
	 * 
	 * <p>This function is thread-safe and allows for multiple application threads to target their processing to the same displayed frame.</p>
	 *
	 * @param hmd        an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param frameIndex the frame the caller wishes to target
	 */
	public static void ovrHmd_GetFrameTiming(long hmd, int frameIndex, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_GetFrameTiming(hmd, frameIndex, memAddress(__result));
	}

	// --- [ ovrHmd_ResetFrameTiming ] ---

	/** JNI method for {@link #ovrHmd_ResetFrameTiming Hmd_ResetFrameTiming} */
	@JavadocExclude
	public static native void novrHmd_ResetFrameTiming(long hmd, int frameIndex);

	/**
	 * Initializes and resets frame time tracking.
	 * 
	 * <p>This is typically not necessary, but is helpful if the application changes vsync state or video mode. vsync is assumed to be on if this isn't called.
	 * Resets internal frame index to the specified number.</p>
	 *
	 * @param hmd        an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param frameIndex the frame the caller wishes to target.
	 */
	public static void ovrHmd_ResetFrameTiming(long hmd, int frameIndex) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_ResetFrameTiming(hmd, frameIndex);
	}

	// --- [ ovr_GetTimeInSeconds ] ---

	/**
	 * Returns global, absolute high-resolution time in seconds.
	 * 
	 * <p>The time frame of reference for this function is not specified and should not be depended upon.</p>
	 *
	 * @return seconds as a floating point value
	 */
	public static native double ovr_GetTimeInSeconds();

	// --- [ ovrHmd_GetBool ] ---

	/** JNI method for {@link #ovrHmd_GetBool Hmd_GetBool} */
	@JavadocExclude
	public static native boolean novrHmd_GetBool(long hmd, long propertyName, boolean defaultVal);

	/**
	 * Reads a boolean property.
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid for only the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static boolean ovrHmd_GetBool(long hmd, ByteBuffer propertyName, boolean defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_GetBool(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovrHmd_GetBool Hmd_GetBool} */
	public static boolean ovrHmd_GetBool(long hmd, CharSequence propertyName, boolean defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_GetBool(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovrHmd_SetBool ] ---

	/** JNI method for {@link #ovrHmd_SetBool Hmd_SetBool} */
	@JavadocExclude
	public static native boolean novrHmd_SetBool(long hmd, long propertyName, boolean value);

	/**
	 * Writes or creates a boolean property.
	 * 
	 * <p>If the property wasn't previously a boolean property, it is changed to a boolean property.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovrHmd_SetBool(long hmd, ByteBuffer propertyName, boolean value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_SetBool(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovrHmd_SetBool Hmd_SetBool} */
	public static boolean ovrHmd_SetBool(long hmd, CharSequence propertyName, boolean value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_SetBool(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovrHmd_GetInt ] ---

	/** JNI method for {@link #ovrHmd_GetInt Hmd_GetInt} */
	@JavadocExclude
	public static native int novrHmd_GetInt(long hmd, long propertyName, int defaultVal);

	/**
	 * Reads an integer property.
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static int ovrHmd_GetInt(long hmd, ByteBuffer propertyName, int defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_GetInt(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovrHmd_GetInt Hmd_GetInt} */
	public static int ovrHmd_GetInt(long hmd, CharSequence propertyName, int defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_GetInt(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovrHmd_SetInt ] ---

	/** JNI method for {@link #ovrHmd_SetInt Hmd_SetInt} */
	@JavadocExclude
	public static native boolean novrHmd_SetInt(long hmd, long propertyName, int value);

	/**
	 * Writes or creates an integer property.
	 * 
	 * <p>If the property wasn't previously an integer property, it is changed to an integer property.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovrHmd_SetInt(long hmd, ByteBuffer propertyName, int value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_SetInt(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovrHmd_SetInt Hmd_SetInt} */
	public static boolean ovrHmd_SetInt(long hmd, CharSequence propertyName, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_SetInt(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovrHmd_GetFloat ] ---

	/** JNI method for {@link #ovrHmd_GetFloat Hmd_GetFloat} */
	@JavadocExclude
	public static native float novrHmd_GetFloat(long hmd, long propertyName, float defaultVal);

	/**
	 * Reads a float property.
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static float ovrHmd_GetFloat(long hmd, ByteBuffer propertyName, float defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_GetFloat(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovrHmd_GetFloat Hmd_GetFloat} */
	public static float ovrHmd_GetFloat(long hmd, CharSequence propertyName, float defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_GetFloat(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovrHmd_SetFloat ] ---

	/** JNI method for {@link #ovrHmd_SetFloat Hmd_SetFloat} */
	@JavadocExclude
	public static native boolean novrHmd_SetFloat(long hmd, long propertyName, float value);

	/**
	 * Writes or creates a float property.
	 * 
	 * <p>If the property wasn't previously a float property, it's changed to a float property.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovrHmd_SetFloat(long hmd, ByteBuffer propertyName, float value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_SetFloat(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovrHmd_SetFloat Hmd_SetFloat} */
	public static boolean ovrHmd_SetFloat(long hmd, CharSequence propertyName, float value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_SetFloat(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovrHmd_GetFloatArray ] ---

	/** JNI method for {@link #ovrHmd_GetFloatArray Hmd_GetFloatArray} */
	@JavadocExclude
	public static native int novrHmd_GetFloatArray(long hmd, long propertyName, long values, int valuesCapacity);

	/**
	 * Reads a float array property.
	 *
	 * @param hmd            an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName   the name of the property, which needs to be valid only for the call
	 * @param values         an array of float to write to
	 * @param valuesCapacity the maximum number of elements to write to the values array
	 *
	 * @return the number of elements read, or 0 if property doesn't exist or is empty
	 */
	public static int ovrHmd_GetFloatArray(long hmd, ByteBuffer propertyName, ByteBuffer values, int valuesCapacity) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
			checkBuffer(values, valuesCapacity << 2);
		}
		return novrHmd_GetFloatArray(hmd, memAddress(propertyName), memAddress(values), valuesCapacity);
	}

	/** Alternative version of: {@link #ovrHmd_GetFloatArray Hmd_GetFloatArray} */
	public static int ovrHmd_GetFloatArray(long hmd, ByteBuffer propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_GetFloatArray(hmd, memAddress(propertyName), memAddress(values), values.remaining());
	}

	/** CharSequence version of: {@link #ovrHmd_GetFloatArray Hmd_GetFloatArray} */
	public static int ovrHmd_GetFloatArray(long hmd, CharSequence propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_GetFloatArray(hmd, __buffer.address(propertyNameEncoded), memAddress(values), values.remaining());
	}

	// --- [ ovrHmd_SetFloatArray ] ---

	/** JNI method for {@link #ovrHmd_SetFloatArray Hmd_SetFloatArray} */
	@JavadocExclude
	public static native boolean novrHmd_SetFloatArray(long hmd, long propertyName, long values, int valuesSize);

	/**
	 * Writes or creates a float array property.
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param values       an array of float to write from
	 * @param valuesSize   the number of elements to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovrHmd_SetFloatArray(long hmd, ByteBuffer propertyName, ByteBuffer values, int valuesSize) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
			checkBuffer(values, valuesSize << 2);
		}
		return novrHmd_SetFloatArray(hmd, memAddress(propertyName), memAddress(values), valuesSize);
	}

	/** Alternative version of: {@link #ovrHmd_SetFloatArray Hmd_SetFloatArray} */
	public static boolean ovrHmd_SetFloatArray(long hmd, ByteBuffer propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_SetFloatArray(hmd, memAddress(propertyName), memAddress(values), values.remaining());
	}

	/** CharSequence version of: {@link #ovrHmd_SetFloatArray Hmd_SetFloatArray} */
	public static boolean ovrHmd_SetFloatArray(long hmd, CharSequence propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_SetFloatArray(hmd, __buffer.address(propertyNameEncoded), memAddress(values), values.remaining());
	}

	// --- [ ovrHmd_GetString ] ---

	/** JNI method for {@link #ovrHmd_GetString Hmd_GetString} */
	@JavadocExclude
	public static native long novrHmd_GetString(long hmd, long propertyName, long defaultVal);

	/**
	 * Reads a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
	 *         until next call to ovrHmd_GetString or until the HMD is destroyed, whichever occurs first.
	 */
	public static String ovrHmd_GetString(long hmd, ByteBuffer propertyName, ByteBuffer defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		long __result = novrHmd_GetString(hmd, memAddress(propertyName), memAddressSafe(defaultVal));
		return memDecodeUTF8(__result);
	}

	/**
	 * Reads a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
	 *         until next call to ovrHmd_GetString or until the HMD is destroyed, whichever occurs first.
	 */
	public static String ovrHmd_GetString(long hmd, CharSequence propertyName, CharSequence defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		int defaultValEncoded = __buffer.stringParamUTF8(defaultVal, true);
		long __result = novrHmd_GetString(hmd, __buffer.address(propertyNameEncoded), __buffer.addressSafe(defaultVal, defaultValEncoded));
		return memDecodeUTF8(__result);
	}

	// --- [ ovrHmd_SetString ] ---

	/** JNI method for {@link #ovrHmd_SetString Hmd_SetString} */
	@JavadocExclude
	public static native boolean novrHmd_SetString(long hmddesc, long propertyName, long value);

	/**
	 * Writes or creates a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmddesc      an {@code ovrHmd} previously returned by {@link #ovrHmd_Create Hmd_Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the string property, which only needs to be valid for the duration of the call
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovrHmd_SetString(long hmddesc, ByteBuffer propertyName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmddesc);
			checkNT1(propertyName);
			checkNT1(value);
		}
		return novrHmd_SetString(hmddesc, memAddress(propertyName), memAddress(value));
	}

	/** CharSequence version of: {@link #ovrHmd_SetString Hmd_SetString} */
	public static boolean ovrHmd_SetString(long hmddesc, CharSequence propertyName, CharSequence value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmddesc);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		int valueEncoded = __buffer.stringParamASCII(value, true);
		return novrHmd_SetString(hmddesc, __buffer.address(propertyNameEncoded), __buffer.address(valueEncoded));
	}

     /**
	 * Creates a {@link OVRLogCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link OVRLogCallback} instance
	 */
	public static OVRLogCallback OVRLogCallback(final OVRLogCallback.SAM sam) {
		return new OVRLogCallback() {
			@Override
			public void invoke(int level, long message) {
				sam.invoke(level, message);
			}
		};
	}

}