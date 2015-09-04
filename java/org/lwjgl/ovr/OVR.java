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
 * <li>{@link #ovr_Initialize Initialize}</li>
 * <li>{@link #ovr_Create Create}(&hmd, &graphicsId)</li>
 * <li>Call {@link #ovr_ConfigureTracking ConfigureTracking} to configure and initialize tracking.</li>
 * <li>Use hmd members and {@link #ovr_GetFovTextureSize GetFovTextureSize} to determine graphics configuration and {@link #ovr_GetRenderDesc GetRenderDesc} to get per-eye rendering parameters.</li>
 * <li>Allocate render target texture sets with ovr_CreateSwapTextureSetD3D11() or {@link OVRGL#ovr_CreateSwapTextureSetGL CreateSwapTextureSetGL}.</li>
 * </ul>
 * 
 * <h3>Application Loop</h3>
 * <ul>
 * <li>Call {@link #ovr_GetFrameTiming GetFrameTiming} to get the current frame timing information.</li>
 * <li>Call {@link #ovr_GetTrackingState GetTrackingState} and {@link OVRUtil#ovr_CalcEyePoses CalcEyePoses} to obtain the predicted rendering pose for each eye based on timing.</li>
 * <li>Render the scene content into {@code CurrentIndex} of ovrTextureSet for each eye and layer you plan to update this frame. Increment texture set
 * {@code CurrentIndex}.</li>
 * <li>Call {@link #ovr_SubmitFrame SubmitFrame} to render the distorted layers to the back buffer and present them on the HMD. If {@link #ovr_SubmitFrame SubmitFrame} returns
 * {@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}, there is no need to render the scene for the next loop iteration. Instead, just call {@link #ovr_SubmitFrame SubmitFrame} again
 * until it returns {@link OVRErrorCode#ovrSuccess Success}.</li>
 * </ul>
 * 
 * <h3>Shutdown</h3>
 * <ul>
 * <li>{@link #ovr_Destroy Destroy}</li>
 * <li>{@link #ovr_Shutdown Shutdown}</li>
 * </ul>
 */
public final class OVR {

	/** Boolean values */
	public static final int
		ovrFalse = 0x0,
		ovrTrue  = 0x1;

	/**
	 * When a debug library is requested, a slower debugging version of the library will run which can be used to help solve problems in the library and debug
	 * application code.
	 */
	public static final int ovrInit_Debug = 0x1;

	/**
	 * When {@code ServerOptional} is set, the {@link #ovr_Initialize Initialize} call not will block waiting for the server to respond. If the server is not reachable, it might
	 * still succeed.
	 */
	public static final int ovrInit_ServerOptional = 0x2;

	/**
	 * When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the {@code RequestedMinorVersion} is
	 * supported.
	 */
	public static final int ovrInit_RequestVersion = 0x4;

	/** These bits are writable by user code. */
	public static final int ovrInit_WritableBits = 0xFFFFFF;

	/** Logging levels */
	public static final int
		ovrLogLevel_Debug = 0x0,
		ovrLogLevel_Info  = 0x1,
		ovrLogLevel_Error = 0x2;

	/** HMD types */
	public static final int
		ovrHmd_None    = 0x0,
		ovrHmd_DK1     = 0x3,
		ovrHmd_DKHD    = 0x4,
		ovrHmd_DK2     = 0x6,
		ovrHmd_CB      = 0x8,
		ovrHmd_Other   = 0x9,
		ovrHmd_E3_2015 = 0xA,
		ovrHmd_ES06    = 0xB;

	/** (read only) Specifies that the HMD is a virtual debug device. */
	public static final int ovrHmdCap_DebugDevice = 0x10;

	/** Indicates to the developer what caps they can and cannot modify. These are processed by the client. */
	public static final int ovrHmdCap_Writable_Mask = 0x0;

	/** Indicates to the developer what caps they can and cannot modify. These are processed by the service. */
	public static final int ovrHmdCap_Service_Mask = 0x0;

	/** Supports orientation tracking (IMU). */
	public static final int ovrTrackingCap_Orientation = 0x10;

	/** Supports yaw drift correction via a magnetometer or other means. */
	public static final int ovrTrackingCap_MagYawCorrection = 0x20;

	/** Supports positional tracking. */
	public static final int ovrTrackingCap_Position = 0x40;

	/**
	 * Overriding the other flags, this causes the application to ignore tracking settings. This is the internal default before {@link #ovr_ConfigureTracking ConfigureTracking} is
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
		ovrRenderAPI_D3D11        = 0x5;

	/** Button input types. */
	public static final int
		ovrButton_A         = 0x1,
		ovrButton_B         = 0x2,
		ovrButton_RThumb    = 0x4,
		ovrButton_RShoulder = 0x8,
		ovrButton_X         = 0x100,
		ovrButton_Y         = 0x200,
		ovrButton_LThumb    = 0x400,
		ovrButton_LShoulder = 0x800,
		ovrButton_Up        = 0x10000,
		ovrButton_Down      = 0x20000,
		ovrButton_Left      = 0x40000,
		ovrButton_Right     = 0x80000,
		ovrButton_Enter     = 0x100000,
		ovrButton_Back      = 0x200000;

	/** Touch input types. */
	public static final int
		ovrTouch_A              = ovrButton_A,
		ovrTouch_B              = ovrButton_B,
		ovrTouch_RThumb         = ovrButton_RThumb,
		ovrTouch_RIndexTrigger  = 0x10,
		ovrTouch_X              = ovrButton_X,
		ovrTouch_Y              = ovrButton_Y,
		ovrTouch_LThumb         = ovrButton_LThumb,
		ovrTouch_LIndexTrigger  = 0x1000,
		ovrTouch_RIndexPointing = 0x20,
		ovrTouch_RThumbUp       = 0x40,
		ovrTouch_LIndexPointing = 0x2000,
		ovrTouch_LThumbUp       = 0x4000;

	/** Which controller is connected; multiple can be connected at once. */
	public static final int
		ovrControllerType_LTouch = 0x1,
		ovrControllerType_RTouch = 0x2,
		ovrControllerType_Touch  = 0x3,
		ovrControllerType_All    = 0xFF;

	/** Names for the left and right hand array indexes. */
	public static final int
		ovrHand_Left  = 0x0,
		ovrHand_Right = 0x1;

	/** Describes layer types that can be passed to {@link #ovr_SubmitFrame SubmitFrame}. Each layer type has an associated struct, such as {@link OVRLayerEyeFov}. */
	public static final int
		ovrLayerType_Disabled       = 0x0,
		ovrLayerType_EyeFov         = 0x1,
		ovrLayerType_EyeFovDepth    = 0x2,
		ovrLayerType_QuadInWorld    = 0x3,
		ovrLayerType_QuadHeadLocked = 0x4,
		ovrLayerType_Direct         = 0x6;

	/** Identifies flags used by {@link OVRLayerHeader} and which are passed to {@link #ovr_SubmitFrame SubmitFrame}. */
	public static final int
		ovrLayerFlag_HighQuality               = 0x1,
		ovrLayerFlag_TextureOriginAtBottomLeft = 0x2;

	/**
	 * Performance HUD enables the HMD user to see information critical to the real-time operation of the VR application such as latency timing, and CPU & GPU
	 * performance metrics.
	 * 
	 * <p>App can toggle performance HUD modes as such:
	 * <pre><code style="font-family: monospace">
	 * ovrPerfHudMode PerfHudMode = ovrPerfHud_LatencyTiming;
	 * ovr_SetInt(Hmd, OVR_PERF_HUD_MODE, (int)PerfHudMode);</code></pre></p>
	 */
	public static final int
		ovrPerfHud_Off           = 0x0,
		ovrPerfHud_LatencyTiming = 0x1,
		ovrPerfHud_RenderTiming  = 0x2,
		ovrPerfHud_PerfHeadroom  = 0x3,
		ovrPerfHud_VersionInfo   = 0x4;

	/** Visual properties of the stereo guide. */
	public static final int
		ovrDebugHudStereo_Off                 = 0x0,
		ovrDebugHudStereo_Quad                = 0x1,
		ovrDebugHudStereo_QuadWithCrosshair   = 0x2,
		ovrDebugHudStereo_CrosshairAtInfinity = 0x3;

	static { LWJGLUtil.initialize(); }

	private OVR() {}

	// --- [ ovr_Initialize ] ---

	/** JNI method for {@link #ovr_Initialize Initialize} */
	@JavadocExclude
	public static native int novr_Initialize(long params);

	/**
	 * Initialize LibOVR for application usage. This includes finding and loading the LibOVRRT shared library. No LibOVR API functions, other than
	 * {@link #ovr_GetLastErrorInfo GetLastErrorInfo}, can be called unless ovr_Initialize succeeds. A successful call to ovr_Initialize must be eventually followed by a call to
	 * {@link #ovr_Shutdown Shutdown}. ovr_Initialize calls are idempotent. Calling ovr_Initialize twice does not require two matching calls to {@link #ovr_Shutdown Shutdown}. If already
	 * initialized, the return value is {@link OVRErrorCode#ovrSuccess Success}.
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
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link #ovr_GetLastErrorInfo GetLastErrorInfo} to get more information. Example failed results
	 *         include:
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrError_Initialize Error_Initialize}: Generic initialization error.</li>
	 *         <li>{@link OVRErrorCode#ovrError_LibLoad Error_LibLoad}: Couldn't load LibOVRRT.</li>
	 *         <li>{@link OVRErrorCode#ovrError_LibVersion Error_LibVersion}: LibOVRRT version incompatibility.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServiceConnection Error_ServiceConnection}: Couldn't connect to the OVR Service.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServiceVersion Error_ServiceVersion}: OVR Service version incompatibility.</li>
	 *         <li>{@link OVRErrorCode#ovrError_IncompatibleOS Error_IncompatibleOS}: The operating system version is incompatible.</li>
	 *         <li>{@link OVRErrorCode#ovrError_DisplayInit Error_DisplayInit}: Unable to initialize the HMD display.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServerStart Error_ServerStart}:  Unable to start the server. Is it already running?</li>
	 *         <li>{@link OVRErrorCode#ovrError_Reinitialization Error_Reinitialization}: Attempted to re-initialize with a different version.</li>
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
	 * <p>A successful call to {@link #ovr_Initialize Initialize} must be eventually matched by a call to ovr_Shutdown. After calling ovr_Shutdown, no LibOVR functions can be called
	 * except {@link #ovr_GetLastErrorInfo GetLastErrorInfo} or another {@link #ovr_Initialize Initialize}. ovr_Shutdown invalidates all pointers, references, and created objects previously returned by
	 * LibOVR functions. The LibOVRRT shared library can be unloaded by ovr_Shutdown.</p>
	 */
	public static native void ovr_Shutdown();

	// --- [ ovr_GetLastErrorInfo ] ---

	/** JNI method for {@link #ovr_GetLastErrorInfo GetLastErrorInfo} */
	@JavadocExclude
	public static native void novr_GetLastErrorInfo(long errorInfo);

	/**
	 * Returns information about the most recent failed return value by the current thread for this library.
	 * 
	 * <p>This function itself can never generate an error. The last error is never cleared by LibOVR, but will be overwritten by new errors. Do not use this
	 * call to determine if there was an error in the last API call as successful API calls don't clear the last {@link OVRErrorInfo}. To avoid any inconsistency,
	 * {@link #ovr_GetLastErrorInfo GetLastErrorInfo} should be called immediately after an API function that returned a failed {@code ovrResult}, with no other API functions called in
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

	/** JNI method for {@link #ovr_GetVersionString GetVersionString} */
	@JavadocExclude
	public static native long novr_GetVersionString();

	/**
	 * Returns the version string representing the LibOVRRT version.
	 * 
	 * <p>The returned string pointer is valid until the next call to {@link #ovr_Shutdown Shutdown}.</p>
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

	/** JNI method for {@link #ovr_TraceMessage TraceMessage} */
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

	// --- [ ovr_GetHmdDesc ] ---

	/** JNI method for {@link #ovr_GetHmdDesc GetHmdDesc} */
	@JavadocExclude
	public static native void novr_GetHmdDesc(long hmd, long __result);

	/**
	 * Returns information about the given HMD.
	 * 
	 * <p>{@link #ovr_Initialize Initialize} must have first been called in order for this to succeed, otherwise ovrHmdDesc::Type will be reported as {@link #ovrHmd_None Hmd_None}.</p>
	 *
	 * @param hmd      an {@code ovrHmd} previously returned by {@link #ovr_Create Create}, else {@code NULL} in which case this function detects whether an HMD is present and returns its info if
	 *                 so.
	 * @param __result an {@link OVRHmdDesc}. If the {@code hmd} is {@code NULL} and ovrHmdDesc::Type is {@link #ovrHmd_None Hmd_None} then no HMD is present.
	 */
	public static void ovr_GetHmdDesc(long hmd, ByteBuffer __result) {
		novr_GetHmdDesc(hmd, memAddress(__result));
	}

	// --- [ ovr_Create ] ---

	/** JNI method for {@link #ovr_Create Create} */
	@JavadocExclude
	public static native int novr_Create(long pHmd, long luid);

	/**
	 * Creates a handle to an HMD.
	 * 
	 * <p>Upon success the returned {@code ovrHmd} must be eventually freed with {@link #ovr_Destroy Destroy} when it is no longer needed. A second call to {@link #ovr_Create Create} will result
	 * in an error return value if the previous {@code Hmd} has not been destroyed.</p>
	 *
	 * @param pHmd a pointer to an {@code ovrHmd} which will be written to upon success.
	 * @param luid a system specific graphics adapter identifier that locates which graphics adapter has the HMD attached. This must match the adapter used by the
	 *             application or no rendering output will be possible. This is important for stability on multi-adapter systems. An application that simply chooses
	 *             the default adapter will not run reliably on multi-adapter systems.
	 *
	 * @return an {@code ovrResult} indicating success or failure. Upon failure the returned {@code pHmd} will be {@code NULL}.
	 */
	public static int ovr_Create(ByteBuffer pHmd, ByteBuffer luid) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pHmd, 1 << POINTER_SHIFT);
			checkBuffer(luid, 1 * OVRGraphicsLuid.SIZEOF);
		}
		return novr_Create(memAddress(pHmd), memAddress(luid));
	}

	/** Alternative version of: {@link #ovr_Create Create} */
	public static int ovr_Create(PointerBuffer pHmd, ByteBuffer luid) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pHmd, 1);
			checkBuffer(luid, 1 * OVRGraphicsLuid.SIZEOF);
		}
		return novr_Create(memAddress(pHmd), memAddress(luid));
	}

	// --- [ ovr_Destroy ] ---

	/** JNI method for {@link #ovr_Destroy Destroy} */
	@JavadocExclude
	public static native void novr_Destroy(long hmd);

	/**
	 * Destroys the HMD.
	 *
	 * @param hmd an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 */
	public static void ovr_Destroy(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novr_Destroy(hmd);
	}

	// --- [ ovr_GetEnabledCaps ] ---

	/** JNI method for {@link #ovr_GetEnabledCaps GetEnabledCaps} */
	@JavadocExclude
	public static native int novr_GetEnabledCaps(long hmd);

	/**
	 * Returns ovrHmdCaps bits that are currently enabled.
	 * 
	 * <p>Note that this value is different from {@link OVRHmdDesc}{@code ::AvailableHmdCaps}, which describes what capabilities are available for that HMD.</p>
	 *
	 * @param hmd an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 *
	 * @return a combination of zero or more {@code ovrHmdCaps}
	 */
	public static int ovr_GetEnabledCaps(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novr_GetEnabledCaps(hmd);
	}

	// --- [ ovr_SetEnabledCaps ] ---

	/** JNI method for {@link #ovr_SetEnabledCaps SetEnabledCaps} */
	@JavadocExclude
	public static native void novr_SetEnabledCaps(long hmd, int hmdCaps);

	/**
	 * Modifies capability bits described by {@code ovrHmdCaps} that can be modified.
	 *
	 * @param hmd     an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param hmdCaps a combination of 0 or more {@code ovrHmdCaps}. One or more of:<br>{@link #ovrHmdCap_DebugDevice HmdCap_DebugDevice}
	 */
	public static void ovr_SetEnabledCaps(long hmd, int hmdCaps) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novr_SetEnabledCaps(hmd, hmdCaps);
	}

	// --- [ ovr_ConfigureTracking ] ---

	/** JNI method for {@link #ovr_ConfigureTracking ConfigureTracking} */
	@JavadocExclude
	public static native int novr_ConfigureTracking(long hmd, int requestedTrackingCaps, int requiredTrackingCaps);

	/**
	 * Starts sensor sampling, enabling specified capabilities, described by {@code ovrTrackingCaps}.
	 * 
	 * <p>Use 0 for both {@code requestedTrackingCaps} and {@code requiredTrackingCaps} to disable tracking. ovr_ConfigureTracking can be called multiple
	 * times with the same or different values for a given {@code ovrHmd}.</p>
	 *
	 * @param hmd                   an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param requestedTrackingCaps specifies support that is requested. The function will succeed even if these caps are not available (i.e. sensor or camera is unplugged). Support
	 *                              will automatically be enabled if such device is plugged in later. Software should check {@link OVRTrackingState}{@code .StatusFlags} for real-time status. One or more of:<br>{@link #ovrTrackingCap_Orientation TrackingCap_Orientation}, {@link #ovrTrackingCap_MagYawCorrection TrackingCap_MagYawCorrection}, {@link #ovrTrackingCap_Position TrackingCap_Position}, {@link #ovrTrackingCap_Idle TrackingCap_Idle}
	 * @param requiredTrackingCaps  specify sensor capabilities required at the time of the call. If they are not available, the function will fail. Pass 0 if only specifying
	 *                              {@code requestedTrackingCaps}. One or more of:<br>{@link #ovrTrackingCap_Orientation TrackingCap_Orientation}, {@link #ovrTrackingCap_MagYawCorrection TrackingCap_MagYawCorrection}, {@link #ovrTrackingCap_Position TrackingCap_Position}, {@link #ovrTrackingCap_Idle TrackingCap_Idle}
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link #ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static int ovr_ConfigureTracking(long hmd, int requestedTrackingCaps, int requiredTrackingCaps) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novr_ConfigureTracking(hmd, requestedTrackingCaps, requiredTrackingCaps);
	}

	// --- [ ovr_RecenterPose ] ---

	/** JNI method for {@link #ovr_RecenterPose RecenterPose} */
	@JavadocExclude
	public static native void novr_RecenterPose(long hmd);

	/**
	 * Re-centers the sensor position and orientation.
	 * 
	 * <p>This resets the (x,y,z) positional components and the yaw orientation component. The Roll and pitch orientation components are always determined by
	 * gravity and cannot be redefined. All future tracking will report values relative to this new reference position.</p>
	 *
	 * @param hmd an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 */
	public static void ovr_RecenterPose(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novr_RecenterPose(hmd);
	}

	// --- [ ovr_GetTrackingState ] ---

	/** JNI method for {@link #ovr_GetTrackingState GetTrackingState} */
	@JavadocExclude
	public static native void novr_GetTrackingState(long hmd, double absTime, long __result);

	/**
	 * Returns tracking state reading based on the specified absolute system time.
	 * 
	 * <p>Pass an {@code absTime} value of 0.0 to request the most recent sensor reading. In this case both {@code PredictedPose} and {@code SamplePose} will
	 * have the same value.</p>
	 * 
	 * <p>This may also be used for more refined timing of front buffer rendering logic, and so on.</p>
	 *
	 * @param hmd      an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param absTime  the absolute future time to predict the return {@link OVRTrackingState} value. Use 0 to request the most recent tracking state.
	 * @param __result the {@link OVRTrackingState} that is predicted for the given {@code absTime}
	 */
	public static void ovr_GetTrackingState(long hmd, double absTime, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novr_GetTrackingState(hmd, absTime, memAddress(__result));
	}

	// --- [ ovr_GetInputState ] ---

	/** JNI method for {@link #ovr_GetInputState GetInputState} */
	@JavadocExclude
	public static native int novr_GetInputState(long hmd, int controllerTypeMask, long inputState);

	/**
	 * Returns the most recent input state for controllers, without positional tracking info. Developers can tell whether the same state was returned by
	 * checking the {@code PacketNumber}.
	 *
	 * @param hmd                an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param controllerTypeMask which controllers the input will be returned for
	 * @param inputState         the input state that will be filled in
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} if the new state was successfully obtained
	 */
	public static int ovr_GetInputState(long hmd, int controllerTypeMask, ByteBuffer inputState) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(inputState, OVRInputState.SIZEOF);
		}
		return novr_GetInputState(hmd, controllerTypeMask, memAddress(inputState));
	}

	// --- [ ovr_SetControllerVibration ] ---

	/** JNI method for {@link #ovr_SetControllerVibration SetControllerVibration} */
	@JavadocExclude
	public static native int novr_SetControllerVibration(long hmd, int controllerTypeMask, float frequency, float amplitude);

	/**
	 * Turns on vibration of the given controller.
	 * 
	 * <p>To disable vibration, call ovr_SetControllerVibration with an amplitude of 0. Vibration automatically stops after a nominal amount of time, so if you
	 * want vibration to be continuous over multiple seconds then you need to call this function periodically.</p>
	 *
	 * @param hmd                an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param controllerTypeMask the controllers to apply the vibration to
	 * @param frequency          a vibration frequency in the range of 0.0 to 1.0. Currently the only valid values are 0.0, 0.5, and 1.0 and other values will be clamped to one of
	 *                           these.
	 * @param amplitude          a vibration amplitude in the range of 0.0 to 1.0.
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} upon success
	 */
	public static int ovr_SetControllerVibration(long hmd, int controllerTypeMask, float frequency, float amplitude) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novr_SetControllerVibration(hmd, controllerTypeMask, frequency, amplitude);
	}

	// --- [ ovr_DestroySwapTextureSet ] ---

	/** JNI method for {@link #ovr_DestroySwapTextureSet DestroySwapTextureSet} */
	@JavadocExclude
	public static native void novr_DestroySwapTextureSet(long hmd, long textureSet);

	/**
	 * Destroys an {@link OVRSwapTextureSet} and frees all the resources associated with it.
	 *
	 * @param hmd        an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param textureSet the {@link OVRSwapTextureSet} to destroy. If it is {@code NULL} then this function has no effect.
	 */
	public static void ovr_DestroySwapTextureSet(long hmd, ByteBuffer textureSet) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			if ( textureSet != null ) checkBuffer(textureSet, OVRSwapTextureSet.SIZEOF);
		}
		novr_DestroySwapTextureSet(hmd, memAddressSafe(textureSet));
	}

	// --- [ ovr_DestroyMirrorTexture ] ---

	/** JNI method for {@link #ovr_DestroyMirrorTexture DestroyMirrorTexture} */
	@JavadocExclude
	public static native void novr_DestroyMirrorTexture(long hmd, long mirrorTexture);

	/**
	 * Destroys a mirror texture previously created by one of the mirror texture creation functions.
	 *
	 * @param hmd           an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param mirrorTexture the {@link OVRTexture} to destroy. If it is {@code NULL} then this function has no effect.
	 */
	public static void ovr_DestroyMirrorTexture(long hmd, ByteBuffer mirrorTexture) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			if ( mirrorTexture != null ) checkBuffer(mirrorTexture, OVRTexture.SIZEOF);
		}
		novr_DestroyMirrorTexture(hmd, memAddressSafe(mirrorTexture));
	}

	// --- [ ovr_GetFovTextureSize ] ---

	/** JNI method for {@link #ovr_GetFovTextureSize GetFovTextureSize} */
	@JavadocExclude
	public static native void novr_GetFovTextureSize(long hmd, int eye, long fov, float pixelsPerDisplayPixel, long __result);

	/**
	 * Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone.
	 * 
	 * <p>Higher FOV will generally require larger textures to maintain quality. Apps packing multiple eye views together on the same texture should ensure there
	 * are at least 8 pixels of padding between them to prevent texture filtering and chromatic aberration causing images to leak between the two eye views.</p>
	 *
	 * @param hmd                   an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param eye                   which eye (left or right) to calculate for. One of:<br>{@link #ovrEye_Left Eye_Left}, {@link #ovrEye_Right Eye_Right}, {@link #ovrEye_Count Eye_Count}
	 * @param fov                   the {@link OVRFovPort} to use
	 * @param pixelsPerDisplayPixel the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can improve
	 *                              performance, higher values give improved quality.
	 * @param __result              the texture width and height size
	 */
	public static void ovr_GetFovTextureSize(long hmd, int eye, ByteBuffer fov, float pixelsPerDisplayPixel, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(fov, OVRFovPort.SIZEOF);
		}
		novr_GetFovTextureSize(hmd, eye, memAddress(fov), pixelsPerDisplayPixel, memAddress(__result));
	}

	// --- [ ovr_GetRenderDesc ] ---

	/** JNI method for {@link #ovr_GetRenderDesc GetRenderDesc} */
	@JavadocExclude
	public static native void novr_GetRenderDesc(long hmd, int eyeType, long fov, long __result);

	/**
	 * Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye.
	 *
	 * @param hmd      an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param eyeType  which eye (left or right) for which to perform calculations. One of:<br>{@link #ovrEye_Left Eye_Left}, {@link #ovrEye_Right Eye_Right}, {@link #ovrEye_Count Eye_Count}
	 * @param fov      the {@link OVRFovPort} to use.
	 * @param __result the computed {@link OVREyeRenderDesc} for the given {@code eyeType} and field of view
	 */
	public static void ovr_GetRenderDesc(long hmd, int eyeType, ByteBuffer fov, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(fov, OVRFovPort.SIZEOF);
		}
		novr_GetRenderDesc(hmd, eyeType, memAddress(fov), memAddress(__result));
	}

	// --- [ ovr_SubmitFrame ] ---

	/** JNI method for {@link #ovr_SubmitFrame SubmitFrame} */
	@JavadocExclude
	public static native int novr_SubmitFrame(long hmd, int frameIndex, long viewScaleDesc, long layerPtrList, int layerCount);

	/**
	 * Submits layers for distortion and display.
	 * 
	 * <p>ovr_SubmitFrame triggers distortion and processing which might happen asynchronously. The function will return when there is room in the submission
	 * queue and surfaces are available. Distortion might or might not have completed.
	 * <ul>
	 * <li>Layers are drawn in the order they are specified in the array, regardless of the layer type.</li>
	 * <li>Layers are not remembered between successive calls to ovr_SubmitFrame. A layer must be specified in every call to ovr_SubmitFrame or it won't
	 * be displayed.</li>
	 * <li>If a {@code layerPtrList} entry that was specified in a previous call to ovr_SubmitFrame is passed as {@code NULL} or is of type {@link #ovrLayerType_Disabled LayerType_Disabled},
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
	 * ovrResult result = ovr_SubmitFrame(hmd, frameIndex, nullptr, layers, 2);</code></pre>
	 *
	 * @param hmd           an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param frameIndex    the targeted application frame index, or 0 to refer to one frame after the last time {@link #ovr_SubmitFrame SubmitFrame} was called
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
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: rendering completed successfully.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}: rendering completed successfully but was not displayed on the HMD, usually because another application currently
	 *         has ownership of the HMD. Applications receiving this result should stop rendering new content, but continue to call ovr_SubmitFrame
	 *         periodically until it returns a value other than {@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}.</li>
	 *         <li>{@link OVRErrorCode#ovrError_DisplayLost Error_DisplayLost}: The session has become invalid (such as due to a device removal) and the shared resources need to be released
	 *         ({@link #ovr_DestroySwapTextureSet DestroySwapTextureSet}), the session needs to destroyed ({@link #ovr_Destroy Destroy}) and recreated ({@link #ovr_Create Create}), and new resources need to be created
	 *         ({@code ovr_CreateSwapTextureSetXXX}). The application's existing private graphics resources do not need to be recreated unless the new {@link #ovr_Create Create}
	 *         call returns a different {@code GraphicsLuid}.</li>
	 *         </ul>
	 */
	public static int ovr_SubmitFrame(long hmd, int frameIndex, ByteBuffer viewScaleDesc, ByteBuffer layerPtrList, int layerCount) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			if ( viewScaleDesc != null ) checkBuffer(viewScaleDesc, OVRViewScaleDesc.SIZEOF);
			checkBuffer(layerPtrList, layerCount << POINTER_SHIFT);
		}
		return novr_SubmitFrame(hmd, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerCount);
	}

	/** Alternative version of: {@link #ovr_SubmitFrame SubmitFrame} */
	public static int ovr_SubmitFrame(long hmd, int frameIndex, ByteBuffer viewScaleDesc, PointerBuffer layerPtrList) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			if ( viewScaleDesc != null ) checkBuffer(viewScaleDesc, OVRViewScaleDesc.SIZEOF);
		}
		return novr_SubmitFrame(hmd, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerPtrList.remaining());
	}

	// --- [ ovr_GetFrameTiming ] ---

	/** JNI method for {@link #ovr_GetFrameTiming GetFrameTiming} */
	@JavadocExclude
	public static native void novr_GetFrameTiming(long hmd, int frameIndex, long __result);

	/**
	 * Gets the {@link OVRFrameTiming} for the given frame index.
	 * 
	 * <p>The application should increment {@code frameIndex} for each successively targeted frame, and pass that index to any relevent OVR functions that need
	 * to apply to the frame identified by that index.</p>
	 * 
	 * <p>This function is thread-safe and allows for multiple application threads to target their processing to the same displayed frame.</p>
	 *
	 * @param hmd        an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param frameIndex the frame the caller wishes to target
	 */
	public static void ovr_GetFrameTiming(long hmd, int frameIndex, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novr_GetFrameTiming(hmd, frameIndex, memAddress(__result));
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

	// --- [ ovr_ResetBackOfHeadTracking ] ---

	/** JNI method for {@link #ovr_ResetBackOfHeadTracking ResetBackOfHeadTracking} */
	@JavadocExclude
	public static native void novr_ResetBackOfHeadTracking(long hmd);

	/**
	 * Should be called when the headset is placed on a new user.
	 *
	 * @param hmd an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 */
	public static void ovr_ResetBackOfHeadTracking(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novr_ResetBackOfHeadTracking(hmd);
	}

	// --- [ ovr_ResetMulticameraTracking ] ---

	/** JNI method for {@link #ovr_ResetMulticameraTracking ResetMulticameraTracking} */
	@JavadocExclude
	public static native void novr_ResetMulticameraTracking(long hmd);

	/**
	 * Should be called when a tracking camera is moved.
	 *
	 * @param hmd an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 */
	public static void ovr_ResetMulticameraTracking(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novr_ResetMulticameraTracking(hmd);
	}

	// --- [ ovr_GetBool ] ---

	/** JNI method for {@link #ovr_GetBool GetBool} */
	@JavadocExclude
	public static native boolean novr_GetBool(long hmd, long propertyName, boolean defaultVal);

	/**
	 * Reads a boolean property.
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid for only the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static boolean ovr_GetBool(long hmd, ByteBuffer propertyName, boolean defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novr_GetBool(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovr_GetBool GetBool} */
	public static boolean ovr_GetBool(long hmd, CharSequence propertyName, boolean defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novr_GetBool(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovr_SetBool ] ---

	/** JNI method for {@link #ovr_SetBool SetBool} */
	@JavadocExclude
	public static native boolean novr_SetBool(long hmd, long propertyName, boolean value);

	/**
	 * Writes or creates a boolean property.
	 * 
	 * <p>If the property wasn't previously a boolean property, it is changed to a boolean property.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetBool(long hmd, ByteBuffer propertyName, boolean value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novr_SetBool(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovr_SetBool SetBool} */
	public static boolean ovr_SetBool(long hmd, CharSequence propertyName, boolean value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novr_SetBool(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovr_GetInt ] ---

	/** JNI method for {@link #ovr_GetInt GetInt} */
	@JavadocExclude
	public static native int novr_GetInt(long hmd, long propertyName, int defaultVal);

	/**
	 * Reads an integer property.
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static int ovr_GetInt(long hmd, ByteBuffer propertyName, int defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novr_GetInt(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovr_GetInt GetInt} */
	public static int ovr_GetInt(long hmd, CharSequence propertyName, int defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novr_GetInt(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovr_SetInt ] ---

	/** JNI method for {@link #ovr_SetInt SetInt} */
	@JavadocExclude
	public static native boolean novr_SetInt(long hmd, long propertyName, int value);

	/**
	 * Writes or creates an integer property.
	 * 
	 * <p>If the property wasn't previously an integer property, it is changed to an integer property.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetInt(long hmd, ByteBuffer propertyName, int value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novr_SetInt(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovr_SetInt SetInt} */
	public static boolean ovr_SetInt(long hmd, CharSequence propertyName, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novr_SetInt(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovr_GetFloat ] ---

	/** JNI method for {@link #ovr_GetFloat GetFloat} */
	@JavadocExclude
	public static native float novr_GetFloat(long hmd, long propertyName, float defaultVal);

	/**
	 * Reads a float property.
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static float ovr_GetFloat(long hmd, ByteBuffer propertyName, float defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novr_GetFloat(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovr_GetFloat GetFloat} */
	public static float ovr_GetFloat(long hmd, CharSequence propertyName, float defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novr_GetFloat(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovr_SetFloat ] ---

	/** JNI method for {@link #ovr_SetFloat SetFloat} */
	@JavadocExclude
	public static native boolean novr_SetFloat(long hmd, long propertyName, float value);

	/**
	 * Writes or creates a float property.
	 * 
	 * <p>If the property wasn't previously a float property, it's changed to a float property.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetFloat(long hmd, ByteBuffer propertyName, float value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novr_SetFloat(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovr_SetFloat SetFloat} */
	public static boolean ovr_SetFloat(long hmd, CharSequence propertyName, float value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novr_SetFloat(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovr_GetFloatArray ] ---

	/** JNI method for {@link #ovr_GetFloatArray GetFloatArray} */
	@JavadocExclude
	public static native int novr_GetFloatArray(long hmd, long propertyName, long values, int valuesCapacity);

	/**
	 * Reads a float array property.
	 *
	 * @param hmd            an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName   the name of the property, which needs to be valid only for the call
	 * @param values         an array of float to write to
	 * @param valuesCapacity the maximum number of elements to write to the values array
	 *
	 * @return the number of elements read, or 0 if property doesn't exist or is empty
	 */
	public static int ovr_GetFloatArray(long hmd, ByteBuffer propertyName, ByteBuffer values, int valuesCapacity) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
			checkBuffer(values, valuesCapacity << 2);
		}
		return novr_GetFloatArray(hmd, memAddress(propertyName), memAddress(values), valuesCapacity);
	}

	/** Alternative version of: {@link #ovr_GetFloatArray GetFloatArray} */
	public static int ovr_GetFloatArray(long hmd, ByteBuffer propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novr_GetFloatArray(hmd, memAddress(propertyName), memAddress(values), values.remaining());
	}

	/** CharSequence version of: {@link #ovr_GetFloatArray GetFloatArray} */
	public static int ovr_GetFloatArray(long hmd, CharSequence propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novr_GetFloatArray(hmd, __buffer.address(propertyNameEncoded), memAddress(values), values.remaining());
	}

	// --- [ ovr_SetFloatArray ] ---

	/** JNI method for {@link #ovr_SetFloatArray SetFloatArray} */
	@JavadocExclude
	public static native boolean novr_SetFloatArray(long hmd, long propertyName, long values, int valuesSize);

	/**
	 * Writes or creates a float array property.
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param values       an array of float to write from
	 * @param valuesSize   the number of elements to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetFloatArray(long hmd, ByteBuffer propertyName, ByteBuffer values, int valuesSize) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
			checkBuffer(values, valuesSize << 2);
		}
		return novr_SetFloatArray(hmd, memAddress(propertyName), memAddress(values), valuesSize);
	}

	/** Alternative version of: {@link #ovr_SetFloatArray SetFloatArray} */
	public static boolean ovr_SetFloatArray(long hmd, ByteBuffer propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novr_SetFloatArray(hmd, memAddress(propertyName), memAddress(values), values.remaining());
	}

	/** CharSequence version of: {@link #ovr_SetFloatArray SetFloatArray} */
	public static boolean ovr_SetFloatArray(long hmd, CharSequence propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novr_SetFloatArray(hmd, __buffer.address(propertyNameEncoded), memAddress(values), values.remaining());
	}

	// --- [ ovr_GetString ] ---

	/** JNI method for {@link #ovr_GetString GetString} */
	@JavadocExclude
	public static native long novr_GetString(long hmd, long propertyName, long defaultVal);

	/**
	 * Reads a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
	 *         until next call to ovr_GetString or until the HMD is destroyed, whichever occurs first.
	 */
	public static String ovr_GetString(long hmd, ByteBuffer propertyName, ByteBuffer defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		long __result = novr_GetString(hmd, memAddress(propertyName), memAddressSafe(defaultVal));
		return memDecodeUTF8(__result);
	}

	/**
	 * Reads a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmd          an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
	 *         until next call to ovr_GetString or until the HMD is destroyed, whichever occurs first.
	 */
	public static String ovr_GetString(long hmd, CharSequence propertyName, CharSequence defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		int defaultValEncoded = __buffer.stringParamUTF8(defaultVal, true);
		long __result = novr_GetString(hmd, __buffer.address(propertyNameEncoded), __buffer.addressSafe(defaultVal, defaultValEncoded));
		return memDecodeUTF8(__result);
	}

	// --- [ ovr_SetString ] ---

	/** JNI method for {@link #ovr_SetString SetString} */
	@JavadocExclude
	public static native boolean novr_SetString(long hmddesc, long propertyName, long value);

	/**
	 * Writes or creates a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmddesc      an {@code ovrHmd} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the string property, which only needs to be valid for the duration of the call
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetString(long hmddesc, ByteBuffer propertyName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmddesc);
			checkNT1(propertyName);
			checkNT1(value);
		}
		return novr_SetString(hmddesc, memAddress(propertyName), memAddress(value));
	}

	/** CharSequence version of: {@link #ovr_SetString SetString} */
	public static boolean ovr_SetString(long hmddesc, CharSequence propertyName, CharSequence value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmddesc);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		int valueEncoded = __buffer.stringParamASCII(value, true);
		return novr_SetString(hmddesc, __buffer.address(propertyNameEncoded), __buffer.address(valueEncoded));
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
			public void invoke(long userData, int level, long message) {
				sam.invoke(userData, level, message);
			}
		};
	}

}